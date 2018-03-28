/*******************************************************************************
 * Copyright (c) 2012 Mindaugas Laganeckas.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Mindaugas Laganeckas - initial API and implementation
 ******************************************************************************/
package org.pnml.tools.epnk.applications.hlpng.transitionBinding.firing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import org.eclipse.emf.ecore.EObject;
import org.pnml.tools.epnk.applications.hlpng.transitionBinding.operators.reversible.ReversibleOperationManager;
import org.pnml.tools.epnk.applications.hlpng.utils.Pair;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.BuiltInOperator;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.MultiSetOperator;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Operator;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Term;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Variable;

public class VariableDependencyManager
{
	private final Map<TermWrapper, Pair<Boolean, Set<TermWrapper>>> termVarMap;
	
	private Map<TermAssignment, Set<TermWrapper>> termAssigments;
	
	private final Map<TermWrapper, TermAssignment> termMap;
	
	public VariableDependencyManager(final Map<TermWrapper, TermAssignment> tm,
			final ReversibleOperationManager reversibleOperationManager)
	{
		this.termMap = tm;

		final List<TermAssignment> complexTerms = new ArrayList<TermAssignment>();
		final List<TermWrapper> resolvedVars = new ArrayList<TermWrapper>();
		for(final Entry<TermWrapper, TermAssignment> entry : termMap.entrySet())
		{
			final TermAssignment ta = entry.getValue();
			if(ta.getTermWrapper() instanceof VariableWrapper)
			{
				resolvedVars.add(ta.getTermWrapper());
			}
			else
			{
				complexTerms.add(ta);
			}
		}
		
		// cleaning term map from complex terms
		for(final TermAssignment ta : complexTerms)
		{
			termMap.remove(ta.getTermWrapper());
		}
		
		this.termVarMap = new HashMap<TermWrapper, Pair<Boolean, Set<TermWrapper>>>();
		for(final TermAssignment ta : complexTerms)
		{
			final Set<TermWrapper> varSet = new HashSet<TermWrapper>();
			findAllVars(ta.getTermWrapper().getRootTerm(), varSet);
			
			final boolean onlyReversibleOps = 
					isReversible(ta.getTermWrapper().getRootTerm(),
							reversibleOperationManager);
			final Pair<Boolean, Set<TermWrapper>> pair = 
					new Pair<Boolean, Set<TermWrapper>>(onlyReversibleOps, 
							new HashSet<TermWrapper>(varSet));
			
			this.termVarMap.put(ta.getTermWrapper(), pair);
		}
		
		this.termAssigments = new HashMap<TermAssignment, Set<TermWrapper>>();
		for(final TermAssignment ta : complexTerms)
		{
			Set<TermWrapper> vars = getVars(ta.getTermWrapper());
			vars.removeAll(resolvedVars);
			if(vars.size() > 0)
			{
				termAssigments.put(ta, vars);
			}
		}
	}
	
	public boolean hasNext()
	{
		return termAssigments.size() > 0;
	}
	
	public Pair<Set<TermWrapper>, TermAssignment> next()
	{
		final TermAssignment ta = leastDependent(termAssigments, termVarMap);

		final Set<TermWrapper> varSet = termAssigments.get(ta);

		final Pair<Set<TermWrapper>, TermAssignment> pair = 
				new Pair<Set<TermWrapper>, TermAssignment>(varSet, ta);
		
		termAssigments.remove(ta);
		
		termAssigments = update(termAssigments, varSet);
		
		return pair;
	}
	
	public Set<TermWrapper> getVars(TermWrapper wrapper)
	{
		Set<TermWrapper> vars = 
				new HashSet<TermWrapper>(this.termVarMap.get(wrapper).getValue());
		
		return vars;
	}
	
	public boolean isReversible(TermWrapper wrapper)
	{
		return this.termVarMap.get(wrapper).getKey();
	}
	
	private static boolean isReversible(Term term, 
			ReversibleOperationManager reversibleOperationManager)
	{
		final Iterator<EObject> iterator = term.eAllContents();
        while(iterator.hasNext())
        {
        	EObject obj = iterator.next();
        	if(obj instanceof Term)
        	{
        		Term subTerm = (Term)obj;
                if((subTerm instanceof BuiltInOperator &&
                		!reversibleOperationManager.contains(subTerm.getClass())) ||
                		subTerm instanceof MultiSetOperator)
                {
                    return false;
                }	
        	}
        }
        return true;
	}
	
	private static TermAssignment leastDependent(
			Map<TermAssignment, Set<TermWrapper>> termAssigments,
			final Map<TermWrapper, Pair<Boolean, Set<TermWrapper>>> termVarMap)
	{
		int size = Integer.MAX_VALUE;
		Entry<TermAssignment, Set<TermWrapper>> e = null;
		
		for(final Entry<TermAssignment, Set<TermWrapper>> entry : termAssigments.entrySet())
		{
			int s = entry.getValue().size();
			if(s < size)
			{
				if(s == 1 && termVarMap.get(entry.getKey().getTermWrapper()).getKey())
				{
					return entry.getKey();
				}
				size = s;
				e = entry;
			}
		}
		return e.getKey();
	}
	
	private static Map<TermAssignment, Set<TermWrapper>> update(
			final Map<TermAssignment, Set<TermWrapper>> oldAssigments, 
			final Set<TermWrapper> varSet)
	{
		final Map<TermAssignment, Set<TermWrapper>> newAssigments =
				new HashMap<TermAssignment, Set<TermWrapper>>();
		
		for(final Entry<TermAssignment, Set<TermWrapper>> entry : oldAssigments.entrySet())
		{
			entry.getValue().removeAll(varSet);
			
			int size = entry.getValue().size(); 
			if(size > 0)
			{
				newAssigments.put(entry.getKey(), entry.getValue());
			}
		}
		return newAssigments;
	}
	
	private static void findAllVars(Term term, Set<TermWrapper> vars)
	{
		if(term instanceof Variable)
		{
			VariableWrapper wrapper = new VariableWrapper();
			wrapper.setRootTerm(term);
			wrapper.setVariable((Variable)term);
			
			vars.add(wrapper);
		}
		else if(term instanceof Operator)
		{
			Operator operator = (Operator) term;
			for(Term subterm : operator.getSubterm())
			{
				findAllVars(subterm, vars);
			}
		}
	}
}

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
package org.pnml.tools.epnk.applications.hlpng.transitionBinding.operators.reversible;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.pnml.tools.epnk.applications.hlpng.runtime.IValue;
import org.pnml.tools.epnk.applications.hlpng.transitionBinding.AbstractManager;
import org.pnml.tools.epnk.applications.hlpng.transitionBinding.firing.TermAssignment;
import org.pnml.tools.epnk.applications.hlpng.transitionBinding.firing.TermWrapper;
import org.pnml.tools.epnk.applications.hlpng.transitionBinding.firing.VariableWrapper;
import org.pnml.tools.epnk.applications.hlpng.transitionBinding.operators.EvaluationManager;
import org.pnml.tools.epnk.applications.hlpng.utils.CartesianProduct;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Operator;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Term;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Variable;

public class ReversibleOperationManager  extends AbstractManager<IReversibleOperation, Term>
{
	private EvaluationManager evaluationManager = null;

	public ReversibleOperationManager(EvaluationManager evaluationManager)
	{
		this.evaluationManager = evaluationManager;
	}

	private IReversibleOperation createHandler(Class<? extends Term> c)
	{
		try
        {
			Object obj = getHandler(c).getClass().newInstance();
	        return (IReversibleOperation)obj;
        }
        catch(Exception e)
        {
        	e.printStackTrace();
        }
		return null;
	}
	
	public boolean resolve(IValue result,
			Term term, Map<TermWrapper, TermAssignment> knownVariables)
	{
		final IReversibleOperation operation = createHandler(term.getClass());
		
		Term unknownTerm = null;
		int numberOfUnknowns = 0;
		List<Boolean> termEval = new ArrayList<Boolean>();
		List<Set<IValue>> known = new ArrayList<Set<IValue>>();
		
		for(Term arg : ((Operator)term).getSubterm())
		{
			try
            {
				Set<IValue> value = evaluationManager.evaluateAll(arg, knownVariables);
				known.add(value);
				termEval.add(true);
            }
            catch(Exception e)
            {
	            unknownTerm = arg;
	            numberOfUnknowns++;
	            termEval.add(false);
            }
		}

		if(numberOfUnknowns == 0)
		{
			return true;
		}
		if(numberOfUnknowns > 1)
		{
			return false;
		}
		
		// only 1 unknown argument
		List<List<IValue>> setsOfResults = null;
		{
			List<List<IValue>> list = new ArrayList<List<IValue>>();
			for(Set<IValue> set : known)
			{
				list.add(new ArrayList<IValue>(set));
			}
			CartesianProduct<IValue> product = new CartesianProduct<IValue>();
			setsOfResults = product.product(list);
		}
		
		if(unknownTerm instanceof Variable)
		{
			for(List<IValue> args : setsOfResults)
			{
				Variable var = (Variable)unknownTerm;
				
				VariableWrapper rv = new VariableWrapper();
				rv.setRootTerm(var);
				rv.setVariable(var);
				
				IValue value = null;
				try
                {
	                value = operation.reverseAll(result, args, termEval.get(0));
                }
                catch(Exception e){}
			
				if(knownVariables.containsKey(rv))
				{
					knownVariables.get(rv).getValues().add(value);
				}
				else
				{
					TermAssignment ve = new TermAssignment();
					ve.getValues().add(value);
					ve.setTermWrapper(rv);
					
					knownVariables.put(rv, ve);
				}
			}
			return true;
		}
		
		List<IValue> resultList = new ArrayList<IValue>();
		for(List<IValue> args : setsOfResults)
		{
			resultList.add(operation.reverseAll(result, args, termEval.get(0)));
		}
		return resolveAll(resultList, unknownTerm, knownVariables);
	}
	
	public boolean resolveAll(Collection<IValue> result,
			Term term, Map<TermWrapper, TermAssignment> knownVariables)
	{
		List<Map<TermWrapper, TermAssignment>> copies = new ArrayList<Map<TermWrapper,TermAssignment>>();
		for(IValue value : result)
		{
			Map<TermWrapper, TermAssignment> copy = copyMap(knownVariables);
			copies.add(copy);
			
			if(!resolve(value, term, copy))
			{
				return false;
			}
		}
		for(Map<TermWrapper, TermAssignment> map : copies)
		{
			mergeMap(knownVariables, map);
		}
		return true;
	}
	
	private static Map<TermWrapper, TermAssignment> copyMap(Map<TermWrapper, TermAssignment> map)
	{
		Map<TermWrapper, TermAssignment> copy = new HashMap<TermWrapper, TermAssignment>();
		
		for(TermWrapper key : map.keySet())
		{
			TermAssignment ve = map.get(key);
			TermAssignment copyVe = new TermAssignment();
			copyVe.setTermWrapper(ve.getTermWrapper());
			copyVe.getValues().addAll(ve.getValues());
			
			copy.put(key, copyVe);
		}
		
		return copy;
	}
	
	private static void mergeMap(Map<TermWrapper, TermAssignment> main,
			Map<TermWrapper, TermAssignment> map2)
	{
		for(TermWrapper key : map2.keySet())
		{
			if(main.containsKey(key))
			{
				main.get(key).getValues().addAll(map2.get(key).getValues());
			}
			else
			{
				TermAssignment ve = map2.get(key);
				TermAssignment copyVe = new TermAssignment();
				copyVe.setTermWrapper(ve.getTermWrapper());
				copyVe.getValues().addAll(ve.getValues());
				
				main.put(key, copyVe);		
			}
		}
	}
}

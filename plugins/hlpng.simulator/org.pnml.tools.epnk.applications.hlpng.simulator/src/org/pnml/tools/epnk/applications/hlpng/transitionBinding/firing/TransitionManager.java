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
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.pnml.tools.epnk.applications.hlpng.runtime.IValue;
import org.pnml.tools.epnk.applications.hlpng.runtime.IMSValue;
import org.pnml.tools.epnk.applications.hlpng.transitionBinding.comparators.ComparisonManager;
import org.pnml.tools.epnk.applications.hlpng.transitionBinding.operators.EvaluationManager;
import org.pnml.tools.epnk.applications.hlpng.transitionBinding.operators.UnknownVariableException;
import org.pnml.tools.epnk.applications.hlpng.transitionBinding.operators.reversible.ReversibleOperationManager;
import org.pnml.tools.epnk.applications.hlpng.utils.CartesianProduct;
import org.pnml.tools.epnk.applications.hlpng.utils.Pair;
import org.pnml.tools.epnk.helpers.FlatAccess;
import org.pnml.tools.epnk.pnmlcoremodel.Place;
import org.pnml.tools.epnk.pnmlcoremodel.PlaceNode;
import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.Arc;
import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.Transition;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Operator;

import parserrules.Rules;

public class TransitionManager
{
	// < transition ID, < place ID, outgoing arc inscription matcher > >
	private Map<IDWrapper, Map<IDWrapper, ArcInscriptionHandler>> patternMatcherMap = null;
	
	private final EvaluationManager evaluationManager;
	private final ReversibleOperationManager reversibleOperationManager;
	private final Rules rules;
	private final Display display;
		
	public TransitionManager(FlatAccess flatAccess, ComparisonManager comparatorManager,
			EvaluationManager evaluationManager, 
			ReversibleOperationManager reversibleOperationManager, Display display)
	{
		this.display = display;
		this.evaluationManager = evaluationManager;
		this.reversibleOperationManager = reversibleOperationManager;
		
		this.patternMatcherMap = new HashMap<IDWrapper, Map<IDWrapper,ArcInscriptionHandler>>();
		
		this.rules = loadRules();
		
		for(org.pnml.tools.epnk.pnmlcoremodel.Transition transition : flatAccess.getTransitions())
		{
			Map<IDWrapper, ArcInscriptionHandler> map = new HashMap<IDWrapper, ArcInscriptionHandler>();
			for(org.pnml.tools.epnk.pnmlcoremodel.Arc arc : flatAccess.getIn(transition))
			{
				Arc hlArc = (Arc) arc;
				if(hlArc.getHlinscription() != null && 
						hlArc.getHlinscription().getStructure() != null)
				{
					Operator term = (Operator)hlArc.getHlinscription().getStructure();
					
					Place place = flatAccess.resolve((PlaceNode)arc.getSource());
					
					if(place != null)
					{
						map.put(new IDWrapper(place), new ArcInscriptionHandler(term, comparatorManager));	
					}
				}
			}
			this.patternMatcherMap.put(new IDWrapper(transition), map);
		}
	}
	
	private static Rules loadRules() {
		
		ResourceSet resourceSet = new ResourceSetImpl();
		URI uri = URI.createURI("platform:/plugin/org.pnml.tools.epnk.helpers.unparse/model/HLPNG-Rules.xmi");
		Resource resource = resourceSet.getResource(uri, true);
		EObject rulesObj = resource.getContents().get(0);
		
		if (rulesObj == null || !(rulesObj instanceof Rules)) {
			MessageDialog.openInformation(
					null,
					"ePNK: Serialise HLPNG labels",
					"Serialisation rules could not be loaded!"
			);	
			return null;
		} 
	    return (Rules) rulesObj;
	}
	
	private static TransitionCheck checkEmptyFiringMode(Map<IDWrapper, ArcInscriptionHandler> incomingArcs,
			Map<IDWrapper, IMSValue> runtimeValues, Transition transition, EvaluationManager evaluationManager) 
					throws UnknownVariableException
	{
		List<Map<TermWrapper, IValue>> varSets = new ArrayList<Map<TermWrapper,IValue>>();
		varSets.add(new HashMap<TermWrapper, IValue>());
		
		return new TransitionCheck(new HashSet<FiringMode>(ConsistencyManager.
				checkSolution(varSets, incomingArcs, runtimeValues, transition, evaluationManager)), true, false);
	}
	
	public TransitionCheck checkTransition(Transition transition, 
			Map<IDWrapper, IMSValue> runtimeValues, boolean force) 
					throws DependencyException, UnknownVariableException
	{		
		Map<IDWrapper, ArcInscriptionHandler> incomingArcs = patternMatcherMap.get(new IDWrapper(transition));
		
		// no incoming arcs
		if(incomingArcs.keySet().size() == 0)
		{
			return checkEmptyFiringMode(incomingArcs, runtimeValues, transition, evaluationManager);
		}
		
		// each inscription variable/term assignments
		Map<TermWrapper, TermAssignment> globalMap = new HashMap<TermWrapper, TermAssignment>();

		for(IDWrapper placeId : incomingArcs.keySet())
		{
			IMSValue msValue = runtimeValues.get(placeId);
			// multiset is empty -> arc inscription match will fail!
			if(msValue.size() == 0)
			{
				return null;
			}
			// each inscription term compared to all multiset terms
			ArcInscriptionHandler matcher = incomingArcs.get(placeId);
			Map<TermWrapper, TermAssignment> assignments = matcher.match(msValue);
			intersection(globalMap, assignments);
		}

		// no variables in input arc inscriptions
		if(globalMap.size() == 0)
		{
			return checkEmptyFiringMode(incomingArcs, runtimeValues, transition, evaluationManager);
		}
		
		// resolving undefined variables
		VariableResolver resolver = new VariableResolver(globalMap, 
				reversibleOperationManager, evaluationManager, rules, display);
		Solution solution = resolver.solve(force);
		if(!solution.isSuccess())
		{
			// terminate the check
			return new TransitionCheck(null, false, false);
		}
		// filtering non consistent assignments
		globalMap = ConsistencyManager.checkParams(globalMap);

		// there is only 1 variable
		if(globalMap.keySet().size() == 1)
		{
			List<Map<TermWrapper, IValue>> varSets = new ArrayList<Map<TermWrapper,IValue>>();
			for(TermWrapper key : globalMap.keySet())
			{
				TermAssignment value = globalMap.get(key);
				
				for(IValue av : value.getValues())
				{
					Map<TermWrapper, IValue> map = new HashMap<TermWrapper, IValue>();
					map.put(key, av);
					varSets.add(map);
				}
			}
			return new TransitionCheck(new HashSet<FiringMode>(ConsistencyManager.
					checkSolution(varSets, incomingArcs, runtimeValues, transition, evaluationManager)), 
							solution.isSuccess(), solution.isManualInput());
		}
		
		// computing Cartesian product of variable assignments
		List<List<Pair<TermAssignment, IValue>>> pairList = pairVariablesToAssignments(globalMap);
		CartesianProduct<Pair<TermAssignment, IValue>> cartesianProd = 
				new CartesianProduct<Pair<TermAssignment, IValue>>();
		List<List<Pair<TermAssignment, IValue>>> product =
				cartesianProd.product(pairList);
		
		List<Map<TermWrapper, IValue>> varSets = new ArrayList<Map<TermWrapper, IValue>>();
		for(List<Pair<TermAssignment, IValue>> list : product)
		{
			varSets.add(pairToMap(list));
		}
		
		// evaluate each arc inscription with the given parameter set
		return new TransitionCheck(new HashSet<FiringMode>(ConsistencyManager.
				checkSolution(varSets, incomingArcs, runtimeValues, transition, evaluationManager)), 
						solution.isSuccess(), solution.isManualInput());
	}
	
	private static void intersection(Map<TermWrapper, TermAssignment> globalMap,
			Map<TermWrapper, TermAssignment> assignment)
	{
		for(TermWrapper wrapper : assignment.keySet())
		{
			TermAssignment ve = new TermAssignment();
			ve.setTermWrapper(assignment.get(wrapper).getTermWrapper());
			
			if(globalMap.containsKey(wrapper))
			{
				// intersection
				Set<IValue> intersection = 
						new HashSet<IValue>(assignment.get(wrapper).getValues());
				intersection.retainAll(globalMap.get(wrapper).getValues());
				ve.setValues(intersection);
			}
			else
			{
				ve.getValues().addAll(assignment.get(wrapper).getValues());
			}
			globalMap.put(wrapper, ve);
		}
	}
	
	private static Map<TermWrapper, IValue> pairToMap(List<Pair<TermAssignment, IValue>> list)
	{
		Map<TermWrapper, IValue> map = new HashMap<TermWrapper, IValue>();
		
		for(Pair<TermAssignment, IValue> p : list)
		{
			map.put(p.getKey().getTermWrapper(), p.getValue());
		}
		return map;
	}
	
	private static List<List<Pair<TermAssignment, IValue>>> pairVariablesToAssignments(Map<TermWrapper, TermAssignment> globalMap)
	{
		List<List<Pair<TermAssignment, IValue>>> evaluations = 
				new ArrayList<List<Pair<TermAssignment, IValue>>>();
		
		for(TermWrapper wrapper : globalMap.keySet())
		{
			List<Pair<TermAssignment, IValue>> evaluation = new ArrayList<Pair<TermAssignment, IValue>>();
			
			TermAssignment ve = globalMap.get(wrapper);
			List<IValue> values = new ArrayList<IValue>(ve.getValues());
			for(IValue entry : values)
			{
				evaluation.add(new Pair<TermAssignment, IValue>(ve, entry));
			}
			evaluations.add(evaluation);
		}
		return evaluations;
	}
}

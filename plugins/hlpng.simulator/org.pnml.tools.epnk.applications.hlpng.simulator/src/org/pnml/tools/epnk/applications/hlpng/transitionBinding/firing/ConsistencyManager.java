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
import java.util.Map.Entry;

import org.pnml.tools.epnk.applications.hlpng.runtime.IValue;
import org.pnml.tools.epnk.applications.hlpng.runtime.BooleanValue;
import org.pnml.tools.epnk.applications.hlpng.runtime.IMSValue;
import org.pnml.tools.epnk.applications.hlpng.runtime.NumberValue;
import org.pnml.tools.epnk.applications.hlpng.runtime.operations.AbstractValueMath;
import org.pnml.tools.epnk.applications.hlpng.transitionBinding.operators.EvaluationManager;
import org.pnml.tools.epnk.applications.hlpng.transitionBinding.operators.UnknownVariableException;
import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.Transition;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.Natural;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.Positive;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Sort;

public class ConsistencyManager
{
	public static boolean check(IValue value, Sort sort)
	{
		if(value == null)
		{
			return false;
		}
		if(sort instanceof org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.Number)
		{
			NumberValue nValue = (NumberValue)value;
			int n = nValue.getN();
			if(sort instanceof Positive && n <= 0)
			{
				return false;
			}
			if(sort instanceof Natural && n < 0)
			{
				return false;
			}
			return true;
		}
		
		if(value instanceof IMSValue)
		{
			for(Entry<IValue, Integer> entry : ((IMSValue)value).entrySet())
			{
				Integer n = entry.getValue();
				if(n == null || n < 0)
				{
					return false;
				}	
			}
			return true;
		}
		
		return true;
	}
	
	public static Map<TermWrapper, TermAssignment> checkParams(Map<TermWrapper, TermAssignment> globalMap)
	{
		Map<TermWrapper, TermAssignment> filtered = new HashMap<TermWrapper, TermAssignment>();
		for(TermWrapper key : globalMap.keySet())
		{
			TermAssignment oldVe = globalMap.get(key);

			Set<IValue> newValues = new HashSet<IValue>();
			for(IValue value : oldVe.getValues())
			{
				if(check(value, key.getRootTerm().getSort()))
				{
					newValues.add(value);
				}
			}
			
			if(newValues.size() > 0)
			{
				TermAssignment newVe = new TermAssignment();
				newVe.setTermWrapper(key);
				newVe.setValues(newValues);
				
				filtered.put(key, newVe);
			}
		}
		return filtered;
	}
	
	public static List<FiringMode> checkSolution(List<Map<TermWrapper, IValue>> varSets,
			Map<IDWrapper, ArcInscriptionHandler> incomingArcs,
			Map<IDWrapper, IMSValue> runtimeValues, Transition transition,
			EvaluationManager evaluationManager) throws UnknownVariableException
	{
		List<FiringMode> assignemnts = new ArrayList<FiringMode>();
		for(Map<TermWrapper, IValue> params : varSets)
		{
			boolean conditionSatisfied = true;
			
			if(transition.getCondition() != null && 
					transition.getCondition().getStructure() != null)
			{
				try
                {
	                IValue conditionValue = 
	                		evaluationManager.evaluate(
	                				transition.getCondition().getStructure(), params);
	                conditionSatisfied = ((BooleanValue)conditionValue).getValue();
                }
                catch(Exception e)
                {
                	conditionSatisfied = false;
                }
			}
			
			if(conditionSatisfied)
			{
				FiringMode assignment = new FiringMode();
				assignment.setParams(params);
				assignment.setTransition(transition);
				
				if(checkInscriptions(assignment, incomingArcs, runtimeValues,
						evaluationManager, params))
				{
					assignemnts.add(assignment);
				}
			}	
		}
		return assignemnts;
	}
	
	private static boolean checkInscriptions(FiringMode assignment,
			Map<IDWrapper, ArcInscriptionHandler> incomingArcs,
			Map<IDWrapper, IMSValue> runtimeValues,
			EvaluationManager evaluationManager,
			Map<TermWrapper, IValue> params)
	{
		for(IDWrapper placeId : incomingArcs.keySet())
		{
			IMSValue runtimeValue = runtimeValues.get(placeId);
			// it may be not possible to initialize some of the variables
			IMSValue inscriptionValue = null;
            try
            {
                inscriptionValue = (IMSValue)evaluationManager
                		.evaluate(incomingArcs.get(placeId).getOperator(), params);
                
                if(ConsistencyManager.check(inscriptionValue, null) && 
                		AbstractValueMath.lessEqual(inscriptionValue, runtimeValue))
                {
                	assignment.getValues().put(placeId, inscriptionValue);	
                }
                else
                {
                	return false;
                }
            }
            catch(Exception e)
            {
            	return false;
            }
		}
		return true;
	}
}

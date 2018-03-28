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
package org.pnml.tools.epnk.applications.hlpng.transitionBinding.operators;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.pnml.tools.epnk.applications.hlpng.runtime.BooleanValue;
import org.pnml.tools.epnk.applications.hlpng.runtime.IValue;
import org.pnml.tools.epnk.applications.hlpng.transitionBinding.firing.TermWrapper;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.And;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.BooleanConstant;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.BooleansFactory;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.Equality;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.Inequality;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.Or;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Operator;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Term;

public class BooleansEval implements IEvaluator
{

	@Override
	public IValue evaluate(Term term, EvaluationManager evaluationManager,
			Map<TermWrapper, IValue> assignments) throws UnknownVariableException
	{
		Operator operator = (Operator) term;
		List<IValue> values = new ArrayList<IValue>();
		for(Term subterm : operator.getSubterm())
		{
			IValue value = evaluationManager.evaluate(subterm, evaluationManager, assignments);
			values.add(value);
		}
		
		if(operator instanceof Or)
		{
			if(values.size() < 2)
			{
				throw new RuntimeException("Wrong number of arguments!");
			}
				
			BooleanValue result = new BooleanValue();
			result.setSort(BooleansFactory.eINSTANCE.createBool());
			result.setValue(false);

			for(int i = 0; i < values.size() && !result.getValue(); i++)
			{
				IValue value = values.get(i);
				if(((BooleanValue)value).getValue())
				{
					result.setValue(true);
				}
			}
			
			return result;
		}
		if(operator instanceof And)
		{
			if(values.size() < 2)
			{
				throw new RuntimeException("Wrong number of arguments!");
			}
				
			BooleanValue result = new BooleanValue();
			result.setSort(BooleansFactory.eINSTANCE.createBool());
			result.setValue(true);

			for(int i = 0; i < values.size() && result.getValue(); i++)
			{
				IValue value = values.get(i);
				if(!((BooleanValue)value).getValue())
				{
					result.setValue(false);
				}
			}
			
			return result;
		}
		if(operator instanceof Inequality)
		{
			if(values.size() != 2)
			{
				throw new RuntimeException("Wrong number of arguments!");
			}
				
			BooleanValue result = new BooleanValue();
			result.setSort(BooleansFactory.eINSTANCE.createBool());
			
			if(!values.get(0).equals(values.get(1)))
			{
				result.setValue(true);
			}
			else
			{
				result.setValue(false);
			}
			
			return result;
		}
		if(operator instanceof Equality)
		{
			if(values.size() != 2)
			{
				throw new RuntimeException("Wrong number of arguments!");
			}

			BooleanValue result = new BooleanValue();
			result.setSort(BooleansFactory.eINSTANCE.createBool());
			
			if(values.get(0) != null && values.get(1) != null && 
					values.get(0).equals(values.get(1)))
			{
				result.setValue(true);
			}
			else
			{
				result.setValue(false);
			}
			
			return result;
		}
		if(operator instanceof BooleanConstant)
		{
			if(values.size() != 0)
			{
				throw new RuntimeException();
			}
			
			BooleanValue value = new BooleanValue();
			value.setSort(operator.getSort());
			value.setValue(((BooleanConstant)operator).isValue());
			
			return value;
		}
		return null;
	}

	@Override
    public String validate(Object term)
    {
		if(term instanceof Or)
		{
			return null;
		}
		if(term instanceof And)
		{
			return null;
		}
		if(term instanceof Inequality)
		{
			return null;
		}
		if(term instanceof Equality)
		{
			return null;
		}
		if(term instanceof BooleanConstant)
		{
			return null;
		}
	    return term.getClass().toString();
    }
}

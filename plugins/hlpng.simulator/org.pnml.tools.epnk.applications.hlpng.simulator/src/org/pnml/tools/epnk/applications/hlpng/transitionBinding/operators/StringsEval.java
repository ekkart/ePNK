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

import org.pnml.tools.epnk.applications.hlpng.runtime.IValue;
import org.pnml.tools.epnk.applications.hlpng.runtime.StringValue;
import org.pnml.tools.epnk.applications.hlpng.transitionBinding.firing.TermWrapper;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.Concatenation;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.StringConstant;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Operator;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Sort;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Term;

public class StringsEval implements IEvaluator
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
		if(operator instanceof StringConstant)
		{
			if(values.size() != 0)
			{
				throw new RuntimeException();
			}
			
			StringValue value = new StringValue();
			value.setSort(operator.getSort());
			value.setData(((StringConstant)operator).getValue());
			
			return value;
		}
		if(operator instanceof Concatenation)
		{
			if(values.size() < 1)
			{
				throw new RuntimeException("Not enough arguments!");
			}
			
			StringBuffer text = new StringBuffer();
			for(IValue value : values)
			{
				text.append(((StringValue)value).getData());
			}
			
			StringValue result = new StringValue();
			{
				StringValue str = (StringValue)values.get(0);
				
				Sort sort = str.getSort();

				result.setSort(sort);
				result.setData(text.toString());
			}
			
			return result;
		}
		return null;
	}

	@Override
    public String validate(Object term)
    {
		if(term instanceof StringConstant)
		{
			return null;
		}
		if(term instanceof Concatenation)
		{
			return null;
		}
	    return term.getClass().toString();
    }
}

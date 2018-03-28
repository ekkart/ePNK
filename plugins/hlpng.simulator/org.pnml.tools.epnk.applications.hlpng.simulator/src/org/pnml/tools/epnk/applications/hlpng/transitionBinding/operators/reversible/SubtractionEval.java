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
import java.util.List;
import java.util.Map;

import org.pnml.tools.epnk.applications.hlpng.runtime.IValue;
import org.pnml.tools.epnk.applications.hlpng.runtime.NumberValue;
import org.pnml.tools.epnk.applications.hlpng.transitionBinding.firing.TermWrapper;
import org.pnml.tools.epnk.applications.hlpng.transitionBinding.operators.EvaluationManager;
import org.pnml.tools.epnk.applications.hlpng.transitionBinding.operators.UnknownVariableException;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Operator;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Sort;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Term;

public class SubtractionEval extends AbstractIntegerOperation
{
	@Override
    protected int computeTotal(int a, int b)
    {
	    return a - b;
    }

	@Override
    protected int computeFirstArg(int result, int[] a)
    {
		int sum = 0;
		for(int i : a)
		{
			sum += i;
		}
	    return result + sum;
    }

	@Override
    protected int computeSecondArg(int result, int[] a)
    {
		int sum = 0;
		for(int i = 1; i < a.length; i++)
		{
			sum += a[i];
		}
		return a[0] - result - sum;
    }

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
		if(values.size() < 1)
		{
			throw new RuntimeException("Not enough arguments!");
		}
			
		int sum = 0;
		for(int i = 1; i < values.size(); i++)
		{
			sum += ((NumberValue)values.get(i)).getN();
		}
		
		IValue result = null;
		{
			NumberValue number = (NumberValue)values.get(0);
			
			Sort sort = number.getSort();
			NumberValue res =  createResultObject(sort);
			res.setSort(sort);
			res.setN(number.getN() - sum);
			
			result = res;
		}
		
		return result;
	}

	@Override
    public String validate(Object term)
    {
	    return null;
    }
}

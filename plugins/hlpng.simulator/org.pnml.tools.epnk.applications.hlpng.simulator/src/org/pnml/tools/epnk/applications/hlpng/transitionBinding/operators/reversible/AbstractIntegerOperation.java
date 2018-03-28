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

import java.util.List;

import org.pnml.tools.epnk.applications.hlpng.runtime.IValue;
import org.pnml.tools.epnk.applications.hlpng.runtime.IntValue;
import org.pnml.tools.epnk.applications.hlpng.runtime.NatValue;
import org.pnml.tools.epnk.applications.hlpng.runtime.NumberValue;
import org.pnml.tools.epnk.applications.hlpng.runtime.PosValue;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.Natural;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.Positive;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Operator;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Sort;

public abstract class AbstractIntegerOperation implements IReversibleOperation
{
	protected abstract int computeTotal(int a, int b);
	protected abstract int computeFirstArg(int result, int[] a);
	protected abstract int computeSecondArg(int result, int[] a);

	@Override
	public IValue reverseAll(IValue result, 
			List<IValue> args, Boolean firstArgumentIsKnown)
	{
		NumberValue value = createResultObject(result.getSort());
		value.setSort(result.getSort());
		value.setN(((NumberValue)result).getN());
		
		int[] a = new int[args.size()];
		for(int i = 0; i < args.size(); i++)
		{
			a[i] = ((NumberValue)args.get(i)).getN();
		}
		
		if(!firstArgumentIsKnown)
		{
			value.setN(computeFirstArg(value.getN(), a));
		}
		else
		{
			value.setN(computeSecondArg(value.getN(), a));
		}
		return value;
	}

    public IValue evaluate(IValue arg1, IValue arg2,
            Operator operator)
    {
		Sort sort = arg1.getSort();
		
		NumberValue v =  createResultObject(sort);
		v.setSort(sort);
		v.setN(computeTotal(((NumberValue)arg1).getN(), ((NumberValue)arg2).getN()));
		
	    return v;
    }
	
	protected NumberValue createResultObject(Sort sort)
	{
		NumberValue v = null;
		if(sort instanceof Positive)
		{
			v = new PosValue();
		}
		else if(sort instanceof Natural)
		{
			v = new NatValue();
		}
		else
		{
			v = new IntValue();
		}
		return v;
	}
}

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
import org.pnml.tools.epnk.applications.hlpng.runtime.ListValue;
import org.pnml.tools.epnk.applications.hlpng.runtime.PosValue;
import org.pnml.tools.epnk.applications.hlpng.runtime.operations.AbstractValueMath;
import org.pnml.tools.epnk.applications.hlpng.transitionBinding.firing.TermWrapper;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.IntegersFactory;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.Append;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.Concatenation;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.EmptyList;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.Length;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.MakeList;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.MemberAtIndex;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.Sublist;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Operator;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Term;

public class ListsEval implements IEvaluator
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

		if(term instanceof MakeList)
		{
			ListValue list = new ListValue();
			list.setSort(((MakeList)term).getRefsort());
			
			for(IValue value : values)
			{
				list.getElements().add(value);
			}
			
		    return list;
		}
		if(term instanceof MemberAtIndex)
		{
			MemberAtIndex memberAt = (MemberAtIndex)term;
			
			return AbstractValueMath.at((ListValue)values.get(0), memberAt.getIndex().getValue());
		}
		if(term instanceof Sublist)
		{
			Sublist sublist = (Sublist)term;
			
			return AbstractValueMath.sublist((ListValue)values.get(0), 
					sublist.getStart().getValue(), sublist.getLength().getValue());
		}
		if(term instanceof Length)
		{
			PosValue posValue = new PosValue();
			posValue.setSort(IntegersFactory.eINSTANCE.createPositive());
			posValue.setN(((ListValue)values.get(0)).getElements().size());

			return posValue;
		}
		if(term instanceof Append)
		{
			return AbstractValueMath.append((ListValue)values.get(0), 
					values.get(1));
		}
		if(term instanceof Concatenation)
		{
			return AbstractValueMath.concat((ListValue)values.get(0), 
					(ListValue)values.get(1));
		}
		if(term instanceof EmptyList)
		{
			ListValue listValue = new ListValue();
			listValue.setSort(((EmptyList)term).getRefsort());
			
			return listValue;
		}
		return null;
    }

	@Override
    public String validate(Object term)
    {
		if(term instanceof MakeList)
		{
		    return null;
		}
		if(term instanceof MemberAtIndex)
		{
		    return null;
		}
		if(term instanceof Sublist)
		{
		    return null;
		}
		if(term instanceof Length)
		{
		    return null;
		}
		if(term instanceof Append)
		{
		    return null;
		}
		if(term instanceof Concatenation)
		{
		    return null;
		}
		if(term instanceof EmptyList)
		{
		    return null;
		}
		return term.getClass().toString();
    }
}

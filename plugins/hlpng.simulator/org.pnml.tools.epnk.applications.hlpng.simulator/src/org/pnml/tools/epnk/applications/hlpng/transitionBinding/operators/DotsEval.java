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

import java.util.Map;

import org.pnml.tools.epnk.applications.hlpng.runtime.IValue;
import org.pnml.tools.epnk.applications.hlpng.runtime.DotValue;
import org.pnml.tools.epnk.applications.hlpng.transitionBinding.firing.TermWrapper;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.dots.DotConstant;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.dots.DotsFactory;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Term;

public class DotsEval implements IEvaluator
{
	@Override
	public IValue evaluate(Term term, EvaluationManager evaluationManager,
			Map<TermWrapper, IValue> assignments) throws UnknownVariableException
	{
		if(term instanceof DotConstant)
		{
			DotValue dot = new DotValue();
			dot.setSort(DotsFactory.eINSTANCE.createDot());
			
		    return dot;
		}
		return null;
    }

	@Override
    public String validate(Object term)
    {
		if(term instanceof DotConstant)
		{
		    return null;
		}
		return term.getClass().toString();
    }
}

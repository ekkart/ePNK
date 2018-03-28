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
import org.pnml.tools.epnk.applications.hlpng.transitionBinding.firing.TermWrapper;
import org.pnml.tools.epnk.applications.hlpng.transitionBinding.firing.VariableWrapper;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Term;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Variable;

public class VariableEval implements IEvaluator
{
	@Override
	public IValue evaluate(Term term, EvaluationManager evaluationManager,
			Map<TermWrapper, IValue> assignments) throws UnknownVariableException
	{
		VariableWrapper wrapper = new VariableWrapper();
		wrapper.setRootTerm(term);
		wrapper.setVariable((Variable)term);

		if(assignments == null)
		{
			throw new UnknownVariableException("Unknown variable: " + wrapper.getVariable().getName());
		}
		
		IValue value = assignments.get(wrapper);
		if(value == null)
		{
			throw new UnknownVariableException("Unknown variable: " + wrapper.getVariable().getName());
		}
		
		return value;
	}

	@Override
    public String validate(Object term)
    {
	    return null;
    }
}

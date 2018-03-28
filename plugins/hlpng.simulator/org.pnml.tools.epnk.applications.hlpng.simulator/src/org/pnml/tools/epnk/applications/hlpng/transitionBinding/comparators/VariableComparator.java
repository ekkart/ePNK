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
package org.pnml.tools.epnk.applications.hlpng.transitionBinding.comparators;

import java.util.Map;

import org.pnml.tools.epnk.applications.hlpng.runtime.IValue;
import org.pnml.tools.epnk.applications.hlpng.transitionBinding.firing.TermAssignment;
import org.pnml.tools.epnk.applications.hlpng.transitionBinding.firing.TermWrapper;
import org.pnml.tools.epnk.applications.hlpng.transitionBinding.firing.VariableWrapper;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Term;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Variable;

public class VariableComparator implements IComparable
{
	@Override
	public boolean compare(Term refValue, IValue testValue,
            Map<TermWrapper, TermAssignment> assignments)
	{
		if(!(refValue instanceof Variable))
		{
			throw new RuntimeException("Wrong comparator: a reference value is" +
					" not an instance of " + Variable.class);
		}
		
		Variable var = (Variable)refValue;
		VariableWrapper rv = new VariableWrapper();
		rv.setRootTerm(var);
		rv.setVariable(var);
		
		if(assignments.containsKey(rv))
		{
			assignments.get(rv).getValues().add(testValue);
		}
		else
		{
			TermAssignment ve = new TermAssignment();
			ve.getValues().add(testValue);
			ve.setTermWrapper(rv);

			assignments.put(rv, ve);
		}

		return true;
	}

}

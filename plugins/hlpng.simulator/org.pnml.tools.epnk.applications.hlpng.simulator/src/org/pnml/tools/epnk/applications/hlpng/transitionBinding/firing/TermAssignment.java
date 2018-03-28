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

import java.util.HashSet;
import java.util.Set;

import org.pnml.tools.epnk.applications.hlpng.runtime.IValue;

public class TermAssignment
{
	private TermWrapper termWrapper = null;
	private Set<IValue> values = null;
	
	public TermWrapper getTermWrapper()
    {
    	return termWrapper;
    }
	public void setTermWrapper(TermWrapper variable)
    {
    	this.termWrapper = variable;
    }
	public Set<IValue> getValues()
    {
		if(values == null)
		{
			values = new HashSet<IValue>();
		}
    	return values;
    }
	public void setValues(Set<IValue> values)
    {
    	this.values = values;
    }
	@Override
    public String toString()
    {
		StringBuffer buffer = new StringBuffer("[");
		for(IValue value : values)
		{
			buffer.append(value + ";");
		}
	    return buffer.toString().replaceAll(";$", "") + "]";
    }
}

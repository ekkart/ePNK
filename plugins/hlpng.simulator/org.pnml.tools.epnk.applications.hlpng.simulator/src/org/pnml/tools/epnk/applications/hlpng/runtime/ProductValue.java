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
package org.pnml.tools.epnk.applications.hlpng.runtime;

import java.util.ArrayList;
import java.util.List;

public class ProductValue extends AbstractValue
{
	private List<IValue> components = new ArrayList<IValue>();

	public List<IValue> getComponents()
    {
    	return components;
    }

	public void setComponents(List<IValue> components)
    {
    	this.components = components;
    }

	@Override
    public String toString()
    {
		StringBuffer buffer = new StringBuffer("(");
		for(IValue value : components)
		{
			buffer.append(value.toString() + ",");
		}
	    return buffer.toString().replaceAll("(.*),\\s*$", "$1") + ")";
    }

    @Override
    public int hashCode()
    {
	    final int prime = 31;
	    int result = 1;
	    result = prime * result
	            + ((components == null) ? 0 : components.hashCode());
	    return result;
    }

    @Override
    public boolean equals(Object obj)
    {
	    if(this == obj)
	    {
		    return true;
	    }
	    if(obj == null)
	    {
		    return false;
	    }
	    if(!(obj instanceof ProductValue))
	    {
		    return false;
	    }
	    ProductValue other = (ProductValue) obj;
	    if(components == null)
	    {
		    if(other.components != null)
		    {
			    return false;
		    }
	    }
	    else if(!components.equals(other.components))
	    {
		    return false;
	    }
	    return true;
    }
}

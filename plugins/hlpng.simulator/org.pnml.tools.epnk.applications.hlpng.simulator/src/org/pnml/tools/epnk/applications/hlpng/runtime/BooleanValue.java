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

public class BooleanValue extends AbstractValue
{
	protected Boolean value = null;

	@Override
    public String toString()
    {
		return String.valueOf(value);
    }

    @Override
    public int hashCode()
    {
	    final int prime = 31;
	    int result = 1;
	    result = prime * result
	            + ((value == null) ? 0 : value.hashCode());
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
	    if(!(obj instanceof BooleanValue))
	    {
		    return false;
	    }
	    BooleanValue other = (BooleanValue) obj;
	    if(value == null)
	    {
		    if(other.value != null)
		    {
			    return false;
		    }
	    }
	    else if(!value.equals(other.value))
	    {
		    return false;
	    }
	    return true;
    }

	public Boolean getValue()
    {
    	return value;
    }

	public void setValue(Boolean value)
    {
    	this.value = value;
    }
}

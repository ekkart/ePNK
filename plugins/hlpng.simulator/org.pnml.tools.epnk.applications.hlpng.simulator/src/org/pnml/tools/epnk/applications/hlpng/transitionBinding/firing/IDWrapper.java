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

import org.pnml.tools.epnk.pnmlcoremodel.ID;

public class IDWrapper
{
	private ID id = null;

	public IDWrapper(ID id)
	{
		this.id = id;
	}
	
	public ID getId()
    {
    	return id;
    }

	@Override
    public int hashCode()
    {
	    final int prime = 31;
	    int result = 1;
	    result = prime * result + ((id == null) ? 0 : id.hashCode());
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
	    if(!(obj instanceof IDWrapper))
	    {
		    return false;
	    }
	    IDWrapper other = (IDWrapper) obj;
	    if(id == null)
	    {
		    if(other.id != null)
		    {
			    return false;
		    }
	    }
	    else if(!id.equals(other.id))
	    {
		    return false;
	    }
	    return true;
    }
}

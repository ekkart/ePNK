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

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.pnml.tools.epnk.applications.hlpng.runtime.IValue;
import org.pnml.tools.epnk.applications.hlpng.runtime.IMSValue;
import org.pnml.tools.epnk.pnmlcoremodel.Transition;

public class FiringMode
{
	// place ID <=> actual inscription value
	private Map<IDWrapper, IMSValue> values = new HashMap<IDWrapper, IMSValue>();
	// variable name <=> variable assignment
	private Map<TermWrapper, IValue> params = null;
	
	private Transition transition = null;

	public Map<TermWrapper, IValue> getParams()
    {
    	return params;
    }
	public void setParams(Map<TermWrapper, IValue> params)
    {
    	this.params = params;
    }
	public Map<IDWrapper, IMSValue> getValues()
    {
    	return values;
    }
	public void setValues(Map<IDWrapper, IMSValue> values)
    {
    	this.values = values;
    }

	@Override
    public String toString()
    {
		if(params == null)
		{
			return null;
		}
		
		List<TermWrapper> keys = new ArrayList<TermWrapper>(params.keySet());
		Collections.sort(keys, new Comparator<TermWrapper>()
		{
			@Override
			public int compare(TermWrapper o1, TermWrapper o2) 
			{
		        return o1.getName().compareTo(o2.getName());
		    }
		});
		
		StringBuffer buffer = new StringBuffer("[");
		for(TermWrapper key : keys)
		{
			buffer.append(key.getName() + "=" + params.get(key) + ";");
		}

	    return buffer.toString().replaceAll("\\s*;$", "") + "]";
    }
	public Transition getTransition()
    {
    	return transition;
    }
	public void setTransition(Transition transition)
    {
    	this.transition = transition;
    }
	@Override
    public int hashCode()
    {
	    final int prime = 31;
	    int result = 1;
	    result = prime * result + ((params == null) ? 0 : params.hashCode());
	    result = prime * result
	            + ((transition == null) ? 0 : transition.hashCode());
	    result = prime * result + ((values == null) ? 0 : values.hashCode());
	    return result;
    }
	@Override
    public boolean equals(Object obj)
    {
	    if(this == obj)
		    return true;
	    if(obj == null)
		    return false;
	    if(getClass() != obj.getClass())
		    return false;
	    FiringMode other = (FiringMode) obj;
	    if(params == null)
	    {
		    if(other.params != null)
			    return false;
	    }
	    else if(!params.equals(other.params))
		    return false;
	    if(transition == null)
	    {
		    if(other.transition != null)
			    return false;
	    }
	    else if(!transition.equals(other.transition))
		    return false;
	    if(values == null)
	    {
		    if(other.values != null)
			    return false;
	    }
	    else if(!values.equals(other.values))
		    return false;
	    return true;
    }
}

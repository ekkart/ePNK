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

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Variable;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.VariableImpl;


public class VariableWrapper extends TermWrapper
{
	protected Variable variable = null;
	protected Integer hashCode = null;

	public Variable getVariable()
    {
    	return variable;
    }
	public void setVariable(Variable variable)
    {
    	this.variable = variable;
    	this.hashCode = null;
    }
	
	@Override
	public String getName()
    {
		return variable.getName();
    }
	
	@Override
    public int hashCode()
    {
		if(hashCode == null)
		{
			final int prime = 31;
		    int result = prime + ((variable == null) ? 0 : hashCode(variable));
		    hashCode = result;
		}
	    return hashCode;
    }
	
	private static int hashCode(Variable variable)
    {
	    final int prime = 31;
	    int result = 1;
	    result = prime * result + ((variable.getName() == null) ? 0 : 
	    	variable.getName().hashCode());
	    result = prime * result
	            + ((variable.getRefvariable() == null) ? 0 : 
	            	variable.getRefvariable().hashCode());
	    return result;
    }
	
	@Override
    public boolean equals(Object obj)
    {
	    if(this == obj)
	    {
		    return true;
	    }
	    if(!(obj instanceof VariableWrapper))
	    {
		    return false;
	    }
	    VariableWrapper other = (VariableWrapper) obj;
	    if(variable == null)
	    {
		    if(other.variable != null)
		    {
			    return false;
		    }
	    }
	    else if(!equals(variable, other.variable))
	    {
		    return false;
	    }
	    return true;
    }
	
    private static boolean equals(Variable ref, Variable test)
    {
	    if(ref == test)
	    {
		    return true;
	    }
	    if(test == null)
	    {
		    return false;
	    }
	    if(!(test instanceof VariableImpl))
	    {
		    return false;
	    }
	    VariableImpl other = (VariableImpl) test;
	    if(ref.getName() == null)
	    {
		    if(other.getName() != null)
		    {
			    return false;
		    }
	    }
	    else if(!ref.getName().equals(other.getName()))
	    {
		    return false;
	    }
	    if(ref.getRefvariable() == null)
	    {
		    if(other.getRefvariable() != null)
		    {
			    return false;
		    }
	    }
	    else if(!ref.getRefvariable().equals(other.getRefvariable()))
	    {
		    return false;
	    }
	    return true;
    }
	@Override
    public String toString()
    {
	    return "VariableWrapper [variable=" + variable.getRefvariable().getName() + ", hashCode="
	            + hashCode + "]";
    }


}

/*
 *  This file is part of the Model Checking in Education (MCiE) project, which
 *  provides sample implementations for some model checking techniques. 
 *  Copyright (C) 2004 Ekkart Kindler, kindler@upb.de
 *
 *  MCiE is free software; you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation; version 2 of the License.
 *
 *  MCiE is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with MCiE; if not, write to the Free Software
 *  Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 *
 */
package de.upb.swt.mcie.robdds;

import java.util.HashMap;
import java.util.Iterator;


/**
 * This class implements an {@link Assignment}. It is realized
 * as a {@link java.util.HashMap HashMap}, which maps some variables to an
 * {@link java.lang.Integer Integer} value.<p>
 * 
 * @author Ekkart Kindler, kindler@upb.de
 */
public class HashAssignment implements Assignment {
	
	/**
	 * The context of the assignment.
	 */
	private Context context;

	/**
	 * The mapping representing the assignment.
	 */
	@SuppressWarnings({ "rawtypes" })
	private HashMap assignment;
	
	/**
	 * Constructs an empty assignment, i.e. a mapping that assigns
	 * don't care values (null) to each variable.
	 */
	@SuppressWarnings("rawtypes")
	public HashAssignment(Context context) {
		this.context = context;
		assignment   = new HashMap();
	}
		
	/**
	 * Returns the context of the assignment.
	 *  
	 * @return the context of this assignment
	 */	
	public Context getContext() {
		return context;
	}
		
	/**
	 * Adds a value for a variable to the assignment. It is
	 * an error, if the variable is from a different context
	 * than the assignment.
	 * 
	 * @param variable the variable
	 * @param value    its value
	 * @exception IncorrectUseException if the variable is from
	 *            a different context than the assignment
	 */
	@SuppressWarnings("unchecked")
	public void setValue(Variable variable, int value) {
		if (variable.context != context) {
			throw new IncorrectUseException(
			    IncorrectUseException.CONTEXT_MISMATCH);
		}
		 
		assignment.put(variable, new Integer(value));
	}
	
	/**
	 * Returns the value of the assignment for the variable. Any other
	 * value than 0 or 1 should be interpreted as undefined.  It is
	 * an error, if the variable is from a different context
	 * than the assignment.
	 *  
	 * @param variable variable for which the assigned value should
	 *                 be returned
	 * @return         the value assigned to the variable
	 * @exception IncorrectUseException if the variable is from
	 *            a different context than the assignment
	 */
	public int getValue(Variable variable) {
		if (variable.context != context) {
			throw new IncorrectUseException(
				IncorrectUseException.CONTEXT_MISMATCH);
		}
		
	    Integer integer = (Integer) assignment.get(variable);
		if (integer == null) 
		    return -1;
		else  
	        return integer.intValue();
    }


	
	/**
	 * Returns the string representation of the assignment. Its
	 * implementation is not too sophisticated; but it helps to quickly show
	 * an assignment to a user.
	 */
	@SuppressWarnings("rawtypes")
	public String toString() {
		Iterator keyList = assignment.keySet().iterator();
		String result = "[ ";
		
		while (keyList.hasNext()) {
			Variable variable = (Variable) keyList.next();
			result = result + variable.getName() + "=" +
			         assignment.get(variable) + ",";
		}
		
		return result + "]";
	}

}

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


/**
 * This interface defines the basic methods of an assignment of values to
 * some variables of a {@link Context}.  A value for each variable
 * of the context can be 0 or 1; all other values are considered
 * to be undefined (don't care values).
 * 
 * There are methods that return the current value assigned to a
 * particular variable of the context and methods for changing
 * an assignment so some variable.
 * 
 * @author Ekkart Kindler, kindler@upb.de
 * 
 */
public interface Assignment {

    /**
     * Returns the context of the assignment.
     *  
     * @return the context of this assignment
     */
    public Context getContext();

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
    public void setValue(Variable variable, int value);

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
    public int getValue(Variable variable);

}

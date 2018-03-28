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
 * Implements a variable within an ROBDD's context. A variable is a name
 * that can be primed or unprimed.  Each variable is assigned a unique
 * number, which defines the variable order (currently, the order is the
 * order in which the variables are created in the context). When a variable
 * is created in the context, the variable as well as its primed or unprimed
 * version are instantiated, where the unprimed version is created first
 * (see {@link Context}). 
 * 
 * @author Ekkart Kindler, kindler@upb.de
 */
public class Variable {
		
	/**
	 * The context in which this variable is defined.
	 */
    Context      context;
		
	/**
	 * The number of the variable.
	 */
	int      number;
	
	/**
	 * The identifier of this variable.
	 */
	String   name;
	
	/**
	 * Field indicating whether the variable is primed or unprimed.
	 */
	boolean  isprimed;
	
	/**
	 * The partner variable.  If the variable is unprimed, this field
	 * refers to the primed version of the variable. If the variable is
	 * primed, this field refers to the unprimed version.
	 */
	Variable partner;
	
	/**
	 * The ROBDD representing the formula that consists of this variable
	 * only.
	 */	
	ROBDD repr;
	
	/**
	 * Constructs a variable.  This constructor is only available from
	 * inside the package, in order to achieve proper instantiation of pairs
	 * of primed and unprimed variables (partner variables). It should be
	 * called from the class {@link Context} only.
	 *  
	 * @param name     the identifier of the variable
	 * @param isprimed true if the primed version should be instantiated 
	 */
    Variable(Context context, String name, int number, boolean isprimed) {
	 	this.context  = context;
		this.number   = number; 
		this.name     = name;
		this.isprimed = isprimed;
		this.repr = context.createInnerNode(this,context.low,context.high);
	}

	/**
	 * Returns the name of the variable.
	 * 
	 * @return the name of the variable
	 */
	public String getName() {
		return name;
	}

    /** 
     * Checks whether the variable is a primed variable.
     * 
     * @return true, if the variable is primed; false otherwise
     */
	public boolean isPrimed() {
		return isprimed;
	}

	/**
	 * Returns the partner variable.  For a primed variable, this is
	 * the unprimed variable; for an unprimed variable, this is the
	 * primed variable.
	 *  
	 * @return the partner variable
	 */
	public Variable getPartner() {
		return partner;
	}
	
	/**
	 * Returns the ROBDD representation for this variable (considered
	 * as a formula).
	 *  
	 * @return the ROBDD
	 */
	public ROBDD toROBDD() {
		return repr;
	}
			
    /**
     * Checks whether this variable precedes the given variable v in
     * the variable order. This represents the variable order, which is
     * an irreflexive and total order.  It is an error if the variables
     * are from a different context.
     * 
     * @param v   the variable to be compared with.
     * @return    true if this variable precedes variable v
     * @exception IncorrectUseException if variables are from a different 
     *            context
     */
	public boolean precedes(Variable v) {
		if (context == v.context) 
		  return number < v.number;
		else
		  throw new IncorrectUseException(
				      IncorrectUseException.CONTEXT_MISMATCH);
	}

}

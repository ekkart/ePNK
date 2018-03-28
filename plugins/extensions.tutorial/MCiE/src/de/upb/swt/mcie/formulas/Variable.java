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
package de.upb.swt.mcie.formulas;

import de.upb.swt.mcie.mc.Model;
import de.upb.swt.mcie.robdds.ChangeSet;
import de.upb.swt.mcie.robdds.Context;
import de.upb.swt.mcie.robdds.ROBDD;

/**
 * Implements a variable in a formula.  It represents the name and the
 * information whether it is a primed or unprimed variable.
 * 
 * @author Ekkart Kindler, kindler@upb.de
 */
public class Variable extends Formula  {
		
	/**
	 * The identifier (name) of this variable.
	 */
	private String   name;
	
	/**
	 * Tells whether the variable is primed or not.
	 */
	private boolean  primed;
	
	/**
	 * Constructs a variable. 
	 * 
	 * @param name     the identifier (name) of the variable
	 * @param primed   indicates whether the variable is primed or not
	 */
 	public Variable(String name, boolean primed) {
		this.name     = name;
		this.primed   = primed;		
	}

	/**
	 * Checks whether the formula is a temporal formula. A formula is
	 * a temporal formula, if it does not contain primed variables
	 * (the formula my contain temporal operators, but it need not).
	 * 
	 * @return true if the formula is a temporal formula; false otherwise
	 */
	public boolean isTemporalFormula() {
		return !primed;
	}

	/**
	 * Checks whether the formula is a step formula. A formula is
	 * a step formula, if it does not contain temporal operators.
	 * This is always true for variables.
	 * 
	 * @return true 
	 */    
	public boolean isStepFormula() {
		return true;
	}

	/**
	 * Checks whether the formula is a state formula. A formula is
	 * a state formula, if it contains neither temporal operators
	 * nor primed variables.
	 * 
	 * @return true if the formula is a state formula; false otherwise
	 */  
	public boolean isStateFormula() {
		return !primed;
	}

	/**
	 * Returns the ROBDD that represents the set of all states in which
	 * this formula is valid.  For a variable, this is a quite simple
	 * ROBDD that consists of one internal node and is obtained from
	 * the method {@link de.upb.swt.mcie.robdds.Context#createVariable(String)
	 * createVariable} of class {@link de.upb.swt.mcie.robdds ROBDDs}.
	 *  
	 * @param context    the context, in which the ROBDD should be generated
	 * @return the ROBDD
	 */	
	public ROBDD toROBDD(Context context) {
		de.upb.swt.mcie.robdds.Variable variable = context.createVariable(name);
		if ( primed ) {
			variable = variable.getPartner();
		}
		return variable.toROBDD();
		
	}	
	/**
	 * Returns the ROBDD that represents the set of all states in which
	 * this formula is valid.  For a variable, this is a quite simple
	 * ROBDD that consists of one internal node and is obtained from
	 * the method {@link de.upb.swt.mcie.robdds.Context#createVariable(String)
	 * createVariable} of class {@link de.upb.swt.mcie.robdds ROBDDs}.
	 *  
	 * @param model the model (only its context is relevant)
	 * @return      the ROBDD
	 */	
	public ROBDD toROBDD(Model model) {
		return toROBDD(model.getContext());
	}
	
	/** 
	 * Adds all variables that occur primed within the formula to the
	 * given change set. Note that the unprimed versions are added to
	 * the change set. 
	 * 
	 * @param  changeset the changeset
	 */
	public void addChangedVariables(ChangeSet changeset) {
		if ( primed ) { changeset.add(name); }
	}

	@Override
	public String toString() {
		if (! primed) 
			return name;
		else
			return name+"'";
	}
		
}

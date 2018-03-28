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
 * Implements the common structure of all formulas.  In particular, it provides
 * methods for checking whether it is a state formula, a transition formula or
 * a temporal formula.
 * 
 *  @author Ekkart Kindler, kindler@upb.de
 */
public abstract class Formula {

    /**
     * Flag indicating that the formula contains temporal operators. Note that
     * this does not mean that the formula is a temporal formula, because it
     * could contain primed variables (in that case the formula is neither a
     * state formula nor a transition formula nor a temporal formula).
     */
    protected boolean temporal;
    
    /**
     * Flag indication that the formula contains primed variables. Note that
     * this does not mean that the formula is a step formula, because it
     * could contain temporal operators (in that case the formula is neither a
     * state formula nor a transition formula nor a temporal formula).
     */
    protected boolean step;
  
	/** 
	 * Returns the ROBDD representation of the set of all states
	 * respectively the set of transitions satisfying the formula.
	 * Note that the formula must not contain temporal operators;
	 * if it does, this will result in an exception.
	 * 
	 * @param  context the context
	 * @return the ROBDD representing the set of states  
	 */
	public abstract ROBDD toROBDD(Context context);

	/** 
	 * Returns the ROBDD representation of the set of all states
	 * satisfying the formula.  Temporal operators are interpreted
	 * in the model. For state formulas and transition
	 * formulas, only the context of the model is relevant. In
	 * the latter case, the result is the same as calling
	 * method {@link #toROBDD(Context)}.
	 * 
	 * @param model the model
	 * @return      the ROBDD representing the set of states  
	 */	  
	public abstract ROBDD toROBDD(Model model);

	/**
	 * Checks whether the formula is a temporal formula. A formula is
	 * a temporal formula, if it does not contain primed variables
	 * (the formula my contain temporal operators, but it need not).
	 * 
	 * @return true if the formula is a temporal formula; false otherwise
	 */
    public boolean isTemporalFormula() {
    	return !step;
    }

	/**
	 * Checks whether the formula is a step formula. A formula is
	 * a step formula, if it does not contain temporal operators
	 * (the formula my contain primed variables, but it need not).
	 * 
	 * @return true if the formula is a step formula; false otherwise
	 */    
    public boolean isStepFormula() {
    	return !temporal;
    }

	/**
	 * Checks whether the formula is a state formula. A formula is
	 * a state formula, if it contains neither temporal operators
	 * nor primed variables.
	 * 
	 * @return true if the formula is a state formula; false otherwise
	 */  
	public boolean isStateFormula() {
		return !temporal && !step;
	}
	
	/** 
	 * Adds all variables that occur primed within the formula to the
	 * given change set. Note that the unprimed versions are added to
	 * the change set. 
	 * 
	 * @param  changeset the changeset
	 */
	public abstract void addChangedVariables(ChangeSet changeset);

}

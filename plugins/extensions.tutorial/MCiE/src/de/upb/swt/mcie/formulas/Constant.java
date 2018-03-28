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
 * Implements a constants, which can be true or false.
 * This is one of the leaf nodes of a formula. Its value is either
 * 0 or 1. Currently, it is possible to instantiate a constant
 * with other values; but it is forbidden anyway.
 * 
 * @author Ekkart Kindler, kindler@upb.de
 * @see de.upb.swt.mcie.robdds.TerminalNode
 * 
 */
public class Constant extends Formula {

    /**
     * The value of the constant. It should be 0 or 1. Other
     * values are forbidden.
     */
    private int value;

	/**
	 * Constructs a constant with the provided value.
	 *
	 * @param value the value of the constant; it should be 0 or 1
	 */
	public Constant(int value) {
		this.value = value;
	}

	/**
	 * Returns the ROBDD that represents the set of all states in which
	 * this formula is valid. Either way it is a terminal node (low or high).
	 *  
	 * @param context  the context 
	 * @return the ROBDD
	 */
	public ROBDD toROBDD(Context context) {
		if (value == 0)
			return context.low;
		else
			return context.high;
	}
		
	/**
	 * Returns the ROBDD that represents the set of all states in which
	 * this formula is valid. Either way it is a terminal node (low or high).
	 *  
	 * @param model  the model (only its context is relevant)
	 * @return the ROBDD
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
	}

	@Override
	public String toString() {
		if (value == 0) {
			return "false";
		} else if (value == 1) {
			return "true";
		} else {
			return "invalid (" + value + ")";
		}
	}
		
}

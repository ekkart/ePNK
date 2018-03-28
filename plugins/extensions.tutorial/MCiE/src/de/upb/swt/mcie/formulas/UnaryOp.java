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
 * Implements the unary operation in a formula. It consists of an operation
 * (resp. its code) and a reference to the subformula. The codes for the
 * different operators are defined as constants in this class.  Moreover,
 * there is an array defining for each operator, whether it is a temporal
 * operator or not, and there is an array defining the binding priorities
 * for the different operators. 
 * 
 * @author Ekkart Kindler, kindler@upb.de
 *
 */
public class UnaryOp extends Formula {

	// Boolean operators
	
	/**
	 * Code for the negation operator.
	 */
	public static final int NOT  = 0;

	// Temporal operators
	
	/**
	 * Code for the CTL operator EX.
	 */
	public static final int EX   = 1;

	/**
	 * Code for the CTL operator AX.
	 */
	public static final int AX   = 2;

	/**
	 * Code for the CTL operator EG.
	 */
	public static final int EG   = 3;

	/**
	 * Code for the CTL operator AG.
	 */
	public static final int AG   = 4;

	/**
	 * Code for the CTL operator EF.
	 */
	public static final int EF   = 5;

	/**
	 * Code for the CTL operator EF.
	 */
	public static final int AF   = 6;

	/**
	 * Table that defines for each operator whether it
	 * is a temporal operator or not.
	 */
	private static final boolean[] temporalOp = {
		false, // NOT
	  	
		true,  // EX
		true,  // AX
		true,  // EG
		true,  // AG
		true,  // EF
		true   // AF
	};	
	
	/**
	 * Table that defines the binding priority of each operator.
	 * Lowest value means highest binding priority. Currently, all
	 * unary operators have binding level 0, i.e. unary operators
	 * have higher binding priority than all binary operators. In principle,
	 * unary operators can have a binding priority that is lower than
	 * that of a binary operation. But, this results in quite unusual
	 * bindings. So, this should be avoided.  Negative binding
	 * priorities are not allowed.
	 */
	private static final int[] binding = {
		0, // NOT
		
		0, // EX
		0, // AX
		0, // EG
		0, // AG
		0, // EF
		0  // AF
	};

	/**
	 * The maximum binding level of all unary operations. The parser needs to
	 * know the maximum for proper operation;  this should be the maximum of
	 * the values given above.
	 */
	public static final int MAXBINDING = 0;

    /**
     * The code of the operation.
     */		
	private int op;
	
	/**
	 * The subformula.
	 */
	private Formula f;
	
	/**
	 * Constructs a unary operation from the code of the operation and
	 * its subformula.
	 * 
	 * @param op the code of the operation
	 * @param f  the subformula
	 */
	public UnaryOp(int op, Formula f) {
		this.op = op;
		this.f  = f;
		
		this.temporal = f.temporal | temporalOp[op];
		this.step     = f.step;
	}
	
	/**
	 * Returns the binding level of this operation.
	 * 
	 * @param op  the operation
	 * @return    its binding level
	 * 
	 * @see #binding
	 */	
	public static int binding(int op) {
		return binding[op];
	}

	/** 
	 * Returns the ROBDD representation of the set of all states
	 * satisfying the formula. The formula must be a step formula,
	 * because temporal formulas cannot be interpreted in a context
	 * only.
	 * 
	 * @param context the context
	 * @return        the ROBDD representing the set of states  
	 * @exception     IncorrectUseException if formula contains temporal
	 *                operators or unknown operators are encountered in
	 *                the formula
	 */	
	public ROBDD toROBDD(Context context) {		
        if (!isStepFormula()) {
        	throw new IncorrectUseException(
			          IncorrectUseException.TEMPORAL_FORMULA_WITHOUT_MODEL);
        }
        
		switch (op) {
			case NOT : return f.toROBDD(context).negate();
			default:   
				throw new IncorrectUseException(
						  IncorrectUseException.UNKNOWN_OPERATION_IN_FORMULA);
		}
	}
	
	/** 
	 * Returns the ROBDD representation of the set of all states
	 * satisfying the formula.  Temporal operators are interpreted
	 * in the Kripke structure.
	 * 
	 * @param model the model
	 * @return      the ROBDD representing the set of states
	 * @exception IncorrectUseException if unknown operators are
	 *            encountered in the formula    
	 */	
	public ROBDD toROBDD(Model model) {		
        Context context = model.getContext();
        
		switch (op) {
			case NOT : return f.toROBDD(model).negate();
			case EX  : return model.ex(f.toROBDD(model));
			case AX  : return model.ex(f.toROBDD(model).negate()).negate();
			case EG  : return model.eg(f.toROBDD(model));
			case AG  : return model.eu(context.high,f.toROBDD(model).negate()).negate();
			case EF  : return model.eu(context.high,f.toROBDD(model));
			case AF  : return model.eg(f.toROBDD(model).negate()).negate();
			default:   
                throw new IncorrectUseException(
                          IncorrectUseException.UNKNOWN_OPERATION_IN_FORMULA);
		}
	}
	
	/** 
	 * Adds all variables that occur primed within the formula to the
	 * given change set. Note that the unprimed versions are added to
	 * the change set. 
	 * 
	 * @param  changeset the changeset
	 */
	public void addChangedVariables(ChangeSet changeset) {
		f.addChangedVariables(changeset);
	}


	/**
	 * String representation of the different operators. 
	 */
	private static final String[] representation = {
		"!",  // NOT
	  	
		"EX", // EX
		"AX", // AX
		"EG", // EG
		"AG", // AG
		"EF", // EF
		"AF"  // AF	
	};
	
	@Override
	public String toString() {
		if (op < representation.length) {
			return representation[op] + "(" + f.toString() + ")";
		} else {
			return "<?> (" + f.toString() + ")";
		}
	}
}

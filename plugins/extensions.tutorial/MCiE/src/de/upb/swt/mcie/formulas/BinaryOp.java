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
 * Implements a binary operation in a formula. It consists of an operation
 * (resp. its code) and a reference to the left and right subformula. The
 * codes for the different operators are defined as constants in this
 * class.  Moreover, there is an array defining for each operator, whether
 * it is a temporal operator or not, and there is an array defining the
 * binding priorities for the different operators. <p>
 * 
 * Note that an application should never ever use the values directly
 * for referring to an operation. Rather they should use the constants
 * defined here!
 * 
 * @author Ekkart Kindler, kindler@upb.de
 */
public class BinaryOp extends Formula {

    // Boolean operators

    /**
     * Code for the AND operation.
     */
	public static final int AND  = 0;

	/**
	 * Code for the OR operation.
	 */
	public static final int OR   = 1;

	/**
	 * Code for the IMPlication operation.
	 */
	public static final int IMP  = 2;

	/**
	 * Code for the EQUivalence operation, which is the
	 * same as EQUality.
	 */
	public static final int EQU  = 3;

	// Temporal operators
	
	
	/**
	 * Code for the CTL operator EU.
	 */
	public static final int EU   = 4;

	/**
	 * Code for the CTL operator AU.
	 */
	public static final int AU   = 5;

	/**
	 * Code for the CTL operator ER.
	 */
	public static final int ER   = 6;

	/**
	 * Code for the CTL operator AR.
	 */
	public static final int AR   = 7;


    /**
     * Table that defines for each operator whether it
     * is a temporal operator or not.
     */
	private static final boolean[] temporalOp = {
		false, // AND
		false, // OR
		false, // IMP
		false, // EQU
	  	
		true,  // EU
		true,  // AU
		true,  // ER
		true   // AR
	};
	
	/**
	 * Table that defines the binding priority of each operator.
	 * Lowest value means highest binding priority. Binding priority
	 * 0 should be left for unary operators. In principle binary
	 * operators can have binding priority 0 too. Negative binding
	 * priorities, however, are not allowed.
	 */	
	private static final int[] binding = {
		2, // AND
	  	3, // OR
	  	4, // IMP
	  	1, // EQU
	  	
	  	5, // EU
	  	5, // AU
	  	5, // ER
	  	5  // AR
	};

	/**
	 * The maximum binding level of all binary operations. The parser needs to
	 * know the maximum for proper operation;  this should be the maximum of the
	 * values given above.
	 */	
	public static final int MAXBINDING = 5;

    /**
     * The code of the binary operation as defined by the constants
     * in this class.
     */	
	private int op;
	
	/**
	 * The left subformula.
	 */
	private Formula left;
	
	/**
	 * The right subformula.
	 */
	private Formula right;
	
	/**
	 * Constructs a formula starting with a binary operation from the
	 * operation and its two subformulas.
	 * 
	 * @param op the operation
	 * @param f1 the left subformula
	 * @param f2 the right subformula
	 */
	public BinaryOp(int op, Formula f1, Formula f2) {
		this.op    = op;
		this.left  = f1;
		this.right = f2;
		
		this.temporal = f1.temporal | f2.temporal | temporalOp[op];
		this.step     = f1.step | f2.step;
	}
	
	/**
	 * Returns the binding level of this operation.
	 * 
	 * @param op  the operation
	 * @return  its binding level
	 * 
	 * @see #binding
	 */
	static public int binding(int op) {
		return binding[op];
	}

	/** 
	 * Returns the ROBDD representation of the set of all states
	 * respectively the set of transitions satisfying the formula.
	 * Temporal operators are interpreted
	 * in the Kripke structure. For state formulas and transition
	 * formulas, only the context of the model is relevant. In
	 * the latter case, the result is the same as calling
	 * {@link #toROBDD(Context)}.
	 * 
	 * @param  context the context in which the formula is evaluated
	 *         to an ROBDD
	 * @return the ROBDD representing the set of states
	 * @exception IncorrectUseException if formula contains temporal
	 *            operators or unknown operators are encountered in
	 *            the formula 
	 */
	public ROBDD toROBDD(Context context) {
		// Only StepFormulas can be evaluated without providing a model:	
		if (!isStepFormula()) {
			throw new IncorrectUseException(
			          IncorrectUseException.TEMPORAL_FORMULA_WITHOUT_MODEL);
		}

		ROBDD robdd1    = left.toROBDD(context);
		ROBDD robdd2    = right.toROBDD(context);
					
		switch (op) {
			case AND: return context.and.apply(robdd1,robdd2);
			case OR : return context.or.apply(robdd1,robdd2);
			case IMP: return context.impl.apply(robdd1,robdd2);
			case EQU: return context.equiv.apply(robdd1,robdd2);
			default:
			    throw new IncorrectUseException(
			              IncorrectUseException.UNKNOWN_OPERATION_IN_FORMULA);
		}
	}
		
	/** 
	 * Returns the ROBDD representation of the set of all states
	 * satisfying the formula.  Temporal operators are interpreted
	 * in the Kripke structure. For state formulas and transition
	 * formulas, only the context of the model is relevant. In
	 * the latter case, the result is the same as calling
	 * {@link #toROBDD(Context)}.
	 * 
	 * @param model the Kripke structure
	 * @return the ROBDD representing the set of states
	 * @exception IncorrectUseException if unknown operators are
	 *            encountered in the formula   
	 */
	public ROBDD toROBDD(Model model) {
		ROBDD robdd1    = left.toROBDD(model);
		ROBDD robdd2    = right.toROBDD(model);
		Context context = model.getContext();
					
		switch (op) {
			case AND: return context.and.apply(robdd1,robdd2);
			case OR : return context.or.apply(robdd1,robdd2);
			case IMP: return context.impl.apply(robdd1,robdd2);
			case EQU: return context.equiv.apply(robdd1,robdd2);
			case EU:  return model.eu(robdd1,robdd2);
			case AU:  return model.er(robdd1.negate(),robdd2.negate()).negate();
			case ER:  return model.er(robdd1,robdd2);
			case AR:  return model.eu(robdd1.negate(),robdd2.negate()).negate();
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
		left.addChangedVariables(changeset);
		right.addChangedVariables(changeset);
	}

	/**
	 * String representation of the different operators. 
	 */
	private static final String[] representation = {
		"&&",  // AND
		"|",  // OR
		"->", // IMP
		"=",  // EQU
	  	
		"EU", // EU
		"AU", // AU
		"ER", // ER
		"AR"  // AR		
	};
	
	@Override
	public String toString() {
		if (op < representation.length) {
			return "(" + left.toString() + " " + representation[op] +
			" " + right.toString() + ")";
		} else {
			return "(" + left.toString() + " " + "<?>" +
			" " + right.toString() + ")";
		}
	}

}

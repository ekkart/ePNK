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
package de.upb.swt.mcie.parser.token;

import de.upb.swt.mcie.formulas.UnaryOp;


/**
 *  Implements the token for an unary operation. The operations, 
 *  their encoding as well as their binding, are defined in the
 *  class {@link de.upb.swt.mcie.formulas.UnaryOp}.
 * 
 *  @author Ekkart Kindler, kindler@upb.de
 *  @see de.upb.swt.mcie.formulas.UnaryOp
 */
public class UnOp extends Token {
	
	/** 
	 * The operation (resp. its encoding {@link de.upb.swt.mcie.formulas.UnaryOp}).
	 */
	private int op;
	
	/**
	 * Constructs a token for the given operation.
	 * 
	 * @param op
	 */
 	public UnOp(int op) {
 		this.op = op;
 	}
 	
 	/**
 	 * Returns the binding level of the operation.
 	 * The binding level of this operation is defined in
	 * class {@link de.upb.swt.mcie.formulas.UnaryOp}.
 	 * 
 	 * @return the binding level of this operation
 	 */
	public int binding() {
		return UnaryOp.binding(op);
	}
	
	/**
	 * Returns the operation (i.e. its encoding).
	 * 
	 * @return the operation
	 */	
	public int getOp() {
		return op;
	}
}

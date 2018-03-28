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

import de.upb.swt.mcie.formulas.BinaryOp;

/**
 * Class implementing a token for a binary operation.  The operations, their
 * encoding and their binding are defined in class
 * {@link de.upb.swt.mcie.formulas.BinaryOp}.
 *  
 * @author Ekkart Kindler, kindler@upb.de
 * @see de.upb.swt.mcie.formulas.BinaryOp
 */
public class BinOp extends Token {
	
	/**
	 * The operation (ie its encoding according to
	 * {@link de.upb.swt.mcie.formulas.BinaryOp}).
	 */
	private int op;
	
	/**
	 * Creates a token for the binary operation op.
	 * 
	 * @param op
	 */
	public BinOp(int op) {
		this.op = op;
	}
	
	/** 
	 * Returns the binding level of this binary operation.
	 * The binding level of this operation is defined in
	 * class {@link de.upb.swt.mcie.formulas.BinaryOp}.
	 * 
	 * @return the binding level
	 */
	public int binding() {
		return BinaryOp.binding(op);
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

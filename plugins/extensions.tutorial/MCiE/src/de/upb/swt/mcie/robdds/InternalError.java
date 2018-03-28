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
 * This exception indicates that some internal error has occurred. If the
 * package {@link de.upb.swt.mcie.robdds robdds} is correctly implemented
 * and used, this exception should never be thrown.
 * 
 * @author Ekkart Kindler, kindler@upb.de
 *
 */
@SuppressWarnings("serial")
public class InternalError extends RuntimeException {

    /**
     * Error number: This error indicates that, during some operation on
     * ROBDDs, an unknown node type (an instance of some unknown subclass of
     * {@link ROBDD ROBDD}) was encountered,
     * and the operation can not deal with this node.  This can
     * happen only when the package {@link de.upb.swt.mcie.robdds robdds}
     * was extended or changed. Otherwise this exception should never
     * be thrown.    
     */
	public static final int UNKNOWN_NODE_TYPE = 0;
    
	/**
	 * Error number: This error indicates that the creation of an illegal
	 * inner node was requested.  Either the successors are null pointers,
	 * the variable order is violated, or the three nodes belong
	 * to a different context.
	 */
	public static final int ILLEGAL_INNER_NODE = 1;
    
	/**
	 * Indicates that an illegal terminal node was encountered.
	 */
	public static final int ILLEGAL_TERMINAL_NODE = 2;

	/**
	 * The number of the error. The possible values are defined
	 * as constants in this class.
	 */	    
	private int errorNo;
	
	/**
	 * Constructs an InternalError exception with the provided error number.
	 *  
	 * @param errorNo number of the internal error; should be one of
	 *                the constants defined in this class.
	 */
	InternalError(int errorNo) {
		this.errorNo = errorNo;
	}

	/**
	 * Converts the exception to its {@link String} representation
	 * 
	 * @return the String representation of this exception
	 */	
	public String toString() {
		switch (errorNo) {
			case UNKNOWN_NODE_TYPE :
			    return "Unknown node type encountered during processing.";
			case ILLEGAL_INNER_NODE :
				return "Creation of an illegal inner node was requested.";
			case ILLEGAL_TERMINAL_NODE :
				return "Illegal terminal node encountered.";
		    default:
		    	return "Unknown internal error";		
		}
	}
	
}

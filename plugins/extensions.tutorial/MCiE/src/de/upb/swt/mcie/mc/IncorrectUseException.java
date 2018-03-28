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
package de.upb.swt.mcie.mc;

/**
 * Exception that results from an incorrect use of the model checking
 * procedures, the models, or their extensions.
 * 
 * @author Ekkart Kindler, kindler@upb.de
 *
 */
@SuppressWarnings("serial")
public class IncorrectUseException extends RuntimeException {
	
	/**
	 * Error number: This error indicates that the invoked method
	 * was not implemented in this model.
	 */
	public static final int NOT_IMPLEMENTED = 0;
	
	/**
	 * The number of the error. The possible values are defined
	 * as constants in this class.
	 */
	private int errorNo;
	
	
	/**
	 * Constructs an IncorrectUseException with the provided error number.
	 *  
	 * @param errorNo number of the internal error; should be one of
	 *                the constants defined in this class.
	 */
	IncorrectUseException(int errorNo) {
		this.errorNo = errorNo;
	}

    /**
     * Converts the exception to its {@link String} representation.
     */
	public String toString() {
		switch (errorNo) {
			case NOT_IMPLEMENTED :
				return "The method called is not implemented for this model.";
			default :
				return "Unknown incorrect use.";
			
		}
	}
}

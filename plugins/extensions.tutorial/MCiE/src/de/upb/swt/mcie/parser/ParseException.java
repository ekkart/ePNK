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
package de.upb.swt.mcie.parser;

import de.upb.swt.mcie.parser.token.Token;

/**
 * Represents a parse exception.  It has a reference to the offending
 * token, which has information on the location of the parse error and
 * possibly some more information on the type of the parse error.<p>
 * 
 * @author Ekkart Kindler, kindler@upb.de
 */
@SuppressWarnings("serial")
public class ParseException extends Exception {
	
	/*
	 * Right now, the parser returns the offending, when a
	 * parse error occurs.
	 * TODO Eventually, the parser could add some information on
	 * the kind of error or the token that it expected.
	 */
	
	/**
	 * The token causing the parse error.
	 */	
	private Token token;
		
	/**
	 * Constructs a ParseException for the token.
	 * 
	 * @param token the offending token
	 */
	ParseException(Token token) {
		this.token = token;
	}
	
	/**
	 * Returns a textual representation of the parse error and
	 * the information on the offending token.
	 */
	public String toString() {
		return "Parse error at " + token.toString();
	}

}

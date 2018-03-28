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

/**
 * Implements a token for a separator.  Currently, there are two types
 * of separators, a comma ({@link #COMMA}) and a semicolon
 * ({@link #SEMICOLON}).  Future extensions will, probably, have more types.
 * 
 * @author Ekkart Kindler, kindler@upb.de
 */
public class Sep extends Token {

    /**
     * The code for a comma.
     */	
	public static final int COMMA = 0;
	
	/**
	 * The code for a semicolon.
	 */
	public static final int SEMICOLON = 1;

	/**
	 * The type of the separator.
	 */
    private int type;
    
    /**
     * Constructs a token for the given separator type.
     * @param type
     */
    public Sep(int type) {
       this.type = type;
	}
	
	/**
	 * Returns the type of the separator.
	 * 
	 * @return the type of the separator
	 */
	public int getType() {
		return type;
	}
}

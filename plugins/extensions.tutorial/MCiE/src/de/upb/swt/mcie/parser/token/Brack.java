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
 * Implements the token for brackets.  Whether it is an opening or
 * a closing bracket is defined by its {@link #type}.  Moreover,
 * there can be different versions of brackets {@link #version}.
 * 
 * @author Ekkart Kindler, kindler@upb.de
 */
public class Brack extends Token {


    /**
     * The code for an opening bracket.
     */
	public static final int OPEN  = 0;
	
	/**
	 * The code for a closing bracket.
	 */
	public static final int CLOSE = 1;
	
	/**
	 * The code for a normal bracket (parenthesis).
	 */
	public static final int NORMAL = 0;
	
	/**
	 * The code for a square bracket.
	 */	
	public static final int SQUARE = 1;
	
	/**
	 * The code for a brace.
	 */	
	public static final int BRACE = 1;
	
	/**
	 * The type of the bracket.
	 */
	private int type;
	
	/**
	 * The version of this bracket.
	 */
	private int version;
	
	/**
	 * Creates a token for a bracket with the corresponding type and version.
	 * @param type    the type of the bracket {@link #OPEN} or {@link #CLOSE}
	 * @param version the version
	 */
	public Brack(int type, int version) {
		this.type    = type;
		this.version = version;
	}
	
	/**
	 * Returns the type of the bracket.
	 * 
	 * @return type of the bracket
	 */
	public int getType() {
		return type;
	}
	
	/** 
	 * Returns the version of the bracket.
	 * 
	 * @return the version of the bracket
	 */
	public int getVersion() {
		return version;
	}
	
}

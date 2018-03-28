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
 * Implementation the common structure of all tokens.   In particular,
 * it deals with the position of the token in the scanned text as well as the
 * text parsed for identifying it.
 * 
 * @author Ekkart Kindler, kindler@upb.de
 */
abstract public class Token {

    /**
     * The line in the character sequence at which the token starts.
     */
    private int line;
    
    /**
     * The column in the character sequence at which the token starts.
     */
    private int column;
    
    /**
     * The text corresponding to this token.
     */
    private CharSequence text;

    /**
     * Defines the reference of this token to the character sequence at
     * which this token was encountered.
     * 
     * @param text    the textual representation of the token
     * @param line    the line
     * @param column  the column
     */
    public void setReference(CharSequence text, int line, int column) {
    	this.text   = text;
    	this.line   = line;
    	this.column = column;
    }
    
    /**
     * Returns the string representation of this token. This includes
     * the position as well as the text itself.
     * 
     * @return the string representation of this token
     */
    public String toString() {
    	return "line " + line + ", column " + column + " at '" +
    	       text + "'.";
    }
}

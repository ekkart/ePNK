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
 * Implements the token for an identifier.
 * 
 * @author Ekkart Kindler, kindler@upb.de
 */
public class Id extends Token {

    /** 
     * The literal of this identifier.
     */
    private String name;
    
    /**
     * Constructs a token for the identifier with the provided name.
     * @param name
     */
    public Id(String name) {
    	this.name = name; 
    }
    
    /**
     * Returns the literal of the identifier.
     * 
     * @return the literal of the identifier
     */
    public String getName() {
    	return name;
    }
}

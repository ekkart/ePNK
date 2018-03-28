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
 * Implements a token for a constant.
 * 
 * @author Ekkart Kindler, kindler@upb.de
 */
public class Const extends Token {

   /**
    * The value of the constant.  Though the token refers to
    * a boolean constant, its value is encoded as an int.
    */
   private int value;
  
   /**
	*  Constructs a token for a constant with the given value.
	*/ 
   public Const(int value) {
	   this.value = value;
   }
   
   /**
    * Returns the value of the constant.
    * @return the value of the associated constant
    */
   public int getValue() {
       return this.value;
   }
 
}

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

import de.upb.swt.mcie.robdds.Context;
import de.upb.swt.mcie.robdds.ROBDD;

/**
 * This class implements some general procedures which might be used
 * in some model checking algorithms.
 * 
 * @author Ekkart Kindler, kindler@upb.de
 */
public class Procedures {
	  
	/**
	 * This method calculates the transitive closure of a given relation.
	 * Note that this method is not tested yet.
	 * 
	 * @param r the relation represented as an ROBDD
	 * @return the transitive closure of the relation represented an an ROBDD 
	 */
	public static ROBDD transClosure(Context context, ROBDD r) {
		// Calculate the least fixed point of F(S) = S | S o S
		// which contains r. The following algorithm should be
		// correct; but, the methods relProd have not been fully
		// tested yet!
		
		ROBDD s1;
		ROBDD s2 = r;
		do {
			s1 = s2;
			s2 = context.or.apply(s1, s1.relProd(s1) );
		} while (s1 != s2);
		
		return s2;
	}
	


}
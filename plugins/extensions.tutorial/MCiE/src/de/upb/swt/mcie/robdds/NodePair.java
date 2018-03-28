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
 * This class represents a pair of nodes. It is used in the
 * hash table for such pairs of nodes when applying a
 * binary operation {@link BinOp#apply(ROBDD,ROBDD) BinOp.apply}
 * on two ROBDDs.
 * 
 * @author Ekkart Kindler, kindler@upb.de
 * 
 */
class NodePair {
	
    /**
     * The first node of the pair.
     */
	private ROBDD n1;

	/**
	 * The second node of the pair.
	 */	
	private ROBDD n2;
	
	/**
	 * Constructs a pair of two ROBDD nodes.
	 * 
	 * @param n1 first component of the pair
	 * @param n2 second component of the pair
	 */
	NodePair(ROBDD n1, ROBDD n2) {
		this.n1 = n1;
		this.n2 = n2; 
	}
	
	/**
	 * Returns the hash code of this pair.  The implementation is necessary
	 * for the proper use of pairs with {@link java.util.HashMap}.
	 * It is a very simple minded calculation, which guarantees that the
	 * symmetric pair has a different hash code.
	 * 
	 * @return hash code of this pair
	 */
	public int hashCode() {
		return n1.hashCode() ^ (n2.hashCode()>>1);
	}
	
	/**
	 * Checks whether this pair node is equal to an other pair. This method
	 * must be implemented in order to guarantee proper operation of the hash
	 * tables (see {@link java.util.HashMap}).
	 * 
	 * @param o object to be compared with
	 * @return  true if the object is an identical pair; false otherwise
	 */
	public boolean equals(Object o) {
		if (o instanceof NodePair) {
			NodePair pair = (NodePair) o;
		    return (this.n1 == pair.n1) && (this.n2 == pair.n2);
		} else
		    return false;
	}

}

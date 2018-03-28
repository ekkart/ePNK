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
 * This abstract class represents the nodes of an ROBDD.  All constructions
 * on ROBDDs preserve their reducedness, because no operation will ever
 * create a duplicate node or a redundant node.
 * 
 * @author Ekkart Kindler, kindler@upb.de
 * 
 */
public abstract class ROBDD {

    /**
     * The context of the ROBDD. 
     */
    Context context;

    /**
     * Returns the negation of the ROBDD. 
     * 
     * @return the negation of the ROBDD.
     */
    public abstract ROBDD negate();

	/**
	 * Considers this ROBBD as a transition relation and computes
	 * the predecessors of the set given as parameter. 
	 * 
	 * @param n   the ROBDD representing the set for which the predecessors
	 *            should be computed; this ROBDD must not refer to primed variables
	 * @return    the set of predecessors represented as an ROBDD
	 * @exception IncorrectUseException if the set n contains a primed
	 *            variable
	 * @exception InternalError can occur only, if somebody messed up
     *            the implementation of the ROBDD package
	 */
	public abstract ROBDD predecessors(ROBDD n);

	/**
	 * Considers this ROBBD as a transition relation and computes
	 * the predecessors of a given set.  Only the variables
	 * in the set changeable can be changed by the transition relation.
	 * 
	 * @param n         the ROBDD representing the set for which the
	 *                  predecessors should be computed; this ROBDD must
	 *                  not refer to primed variables
	 * @param changeset set of variables that may change in the transition
	 *                  relation; all other variables are not changed
	 * @return          the set of predecessors represented as an ROBDD
	 * @exception IncorrectUseException if the set n contains a primed
	 *            variable or if the transition relation contains a primed
	 *            variable that is not contained in the changeset
	 * @exception InternalError can occur only, if somebody messed up
     *            the implementation of the ROBDD package
   	 */
	public abstract ROBDD predecessors(ROBDD n, ChangeSet changeset);
	
    /**
     * Considers this ROBBD as a transition relation and computes
     * the successors of a given set. 
     * 
     * @param n   the ROBDD representing the set for which the successors
     *            should be computed; this ROBDD must not refer to primed
     *            variables
     * @return    the set of successors represented as an ROBDD
     * @exception IncorrectUseException if the set n contains a primed
     *            variable
	 * @exception InternalError can occur only, if somebody messed up
     *            the implementation of the ROBDD package
     */
    public abstract ROBDD successors(ROBDD n);
    
	/**
	 * Considers this ROBBD as a transition relation and computes
	 * the successors of a given set. Only the variables
	 * in the set changeable can be changed by the transition relation.
	 * 
	 * @param n         the ROBDD representing the set for which the successors
	 *                  should be computed; this ROBDD must not refer to primed
	 *                  variables
	 * @param changeset set of variables that may change in the transition
	 *                  relation; all other variables are not changed
	 * @return          the set of successors represented as an ROBDD
	 * @exception IncorrectUseException if the set n contains a primed
	 *            variable or if the transition relation has a primed
	 *            variable that is not contained in the changeset
	 * @exception InternalError can occur only, if somebody messed up
     *            the implementation of the ROBDD package
	 */
	public abstract ROBDD successors(ROBDD n, ChangeSet changeset);

    /**
     * Returns true, if the ROBDD is valid  (i.e. if it evaluates to true for
     * any assignment).  This is true for the TerminalNode with value 1 only.
     * 
     * @return true, if the ROBDD is valid.
     */
    public abstract boolean isValid();

    /**
     * Returns an assignment for which the ROBDD evaluates to true.
     * 
     * @return an assignment that evaluates to true for this ROBDD;
     *         null, if no such assignment exists
     */
    public abstract Assignment getAssignment();

    /**
     * Computes the product of two relations.  This object is
     * considered as the first relation, argument n is considered as
     * the second relation.<p>
     *
     * <b>This method is not fully tested yet!</b>
     * 
     * @param  n  the set second relation
     * @return    the product of the two relations
     */
    public abstract ROBDD relProd(ROBDD n);

    /**
     * Evaluates the ROBDD in the given assignment ass, where the result
     * is the ROBDD node at which the evaluation terminates. If the evaluation
     * is successful, it is the corresponding {@link TerminalNode};
     * if the evaluation is stuck due to an undefined value for
     * some inner node, this node is returned. It is an error,
     * if the assignment is from a different context.
     *  
     * @param   ass for which the ROBDD should be evaluated
     * @return  the final node
	 * @exception IncorrectUseException if the assignment is from
	 *            a context different from the context of the ROBDD
	 */
    public abstract ROBDD eval(Assignment ass);

}

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
 * This class represents a terminal Node of an ROBDD. There is no need to
 * have more than the two terminal nodes low and high in each context. The
 * {@link Context} is responsible for instantiating these two terminal
 * nodes as its members {@link Context#low} and {@link Context#high}.
 *
 * @author Ekkart Kindler, kindler@upb.de
 *
 */
class TerminalNode extends ROBDD {

    /**
     * The value of the corresponding node. The type is an
     * int value rather than a boolean. 0 stands for false and 1
     * stands for true.
     */
    int value;

    /**
     * Creates a terminal node for the given truth value (0 or 1 for false
     * and true). The constructor is not public such that no other terminal
     * nodes can only be created from outside the ROBBD package.
     */
    TerminalNode(Context context, int t) {
        this.context = context;
        value = t;
    }

    /**
     * Returns the negation of the ROBDD in this context.
     * 
     * @return the negated ROBDD
     * @see Context
     */
    public ROBDD negate() {
        // return the other TerminalNode
        if (this == context.low) {
            return context.high;
        } else if (this == context.high) {
            return context.low;
        } else
            throw new InternalError(InternalError.ILLEGAL_TERMINAL_NODE);
    }

    /**
     * Returns the ROBBD with all the predecessors of a set n. This class
     * itself plays the role of the transition relation. An invocation
     * of this method with an ROBDD from a different context results in
     * an exception. This method only dispatches the call to more specific
     * private methods.
     *
     * @param n  the set for which the predecessors should be calculated;
     *           it is illegal to have a primed variable in this ROBDD,
     *           but it will not result in an exception, here
     * @exception IncorrectUse if contexts do not coincide 
     * @exception InternalError if somebody messed up the implementation of this
     *            package
     * @return   the predecessors 
     * @see ROBDD#predecessors(ROBDD)
     * @see TerminalNode#predecessors(TerminalNode)
     * @see TerminalNode#predecessors(InnerNode)
     */
    public ROBDD predecessors(ROBDD n) {
        if (context != n.context) {
            throw new IncorrectUseException(
                IncorrectUseException.CONTEXT_MISMATCH);
        } else if (n instanceof InnerNode) {
            return predecessors((InnerNode) n);
        } else if (n instanceof TerminalNode) {
            return predecessors((TerminalNode) n);
        } else
            throw new InternalError(InternalError.UNKNOWN_NODE_TYPE);
    }

    /**
     * Returns the ROBBD with all the predecessors of a set n. This class
     * itself plays the role of the transition relation.  This method
     * implements the case where the set is represented by an inner node.
     * 
     * @param n  the set for which the predecessors should be calculated;
     *           it is illegal to have a primed variable in this ROBDD,
     *           but it will not result in an exception, here
     * @return   the predecessors 
     * @see ROBDD#predecessors(ROBDD)
     */
    private ROBDD predecessors(InnerNode n) {
        // calculate exists v' . R(v,v') & f(v'), where R(v,v') is
        // represented by this and f(v) is represented by n. Since n
        // is an inner node, it represents a non-empty set	
        if (value == 1)
            // the transition relation is total; since n is non-empty,
            // all states are predecessors of n
            return context.high;
        else
            // the transition relation is empty; so, no state is
            // a predecessor of n
            return context.low;
    }

    /**
     * Returns the ROBBD with all the predecessors of a set n. This class
     * itself plays the role of the transition relation.  This method
     * implements the case where the set is represented by an terminal node.
     * 
     * @param n  the set for which the predecessors should be calculated;
     *           it is illegal to have a primed variable in this ROBDD,
     *           but it will not result in an exception, here
     * @return   the predecessors 
     * @see ROBDD#predecessors(ROBDD)
     */
    private ROBDD predecessors(TerminalNode n) {
        // calculate exists v' . R(v,v') & f(v'), where R(v,v') is
        // represented by this and f(v) is represented by n. Since n
        // is a terminal node too, it represents either the empty set
        // or the set of all nodes.	
        if (value == 1)
            // return n as n is either set of all nodes or the empty
            // set
            return n;
        else
            // the transition relation is empty; so the result is
            // false (which is this or low)
            return this;
    }


	/**
	 * Returns the ROBBD with all the predecessors of a set n. This class
	 * itself plays the role of the transition relation. An invocation
	 * of this method with an ROBDD from a different context results in
	 * an exception. This method only dispatches the call to more specific
	 * private methods.
	 *
	 * @param n  the set for which the predecessors should be calculated;
	 *           it is illegal to have a primed variable in this ROBDD,
	 *           but it will not result in an exception, here
	 * @param changeset the set of variables that may change
	 * @exception IncorrectUse if contexts do not coincide 
	 * @exception InternalError if somebody messed up the implementation of this
	 *            package
	 * @return   the predecessors 
	 * @see ROBDD#predecessors(ROBDD, ChangeSet)
	 * @see TerminalNode#predecessors(TerminalNode, ChangeSet)
	 * @see TerminalNode#predecessors(InnerNode, ChangeSet)
	 */
	public ROBDD predecessors(ROBDD n, ChangeSet changeset) {
		if (context != n.context) {
			throw new IncorrectUseException(
				IncorrectUseException.CONTEXT_MISMATCH);
		} else if (n instanceof InnerNode) {
			return predecessors((InnerNode) n, changeset);
		} else if (n instanceof TerminalNode) {
			return predecessors((TerminalNode) n, changeset);
		} else
			throw new InternalError(InternalError.UNKNOWN_NODE_TYPE);
	}

	/**
	 * Returns the ROBBD with all the predecessors of a set n. This class
	 * itself plays the role of the transition relation.  This method
	 * implements the case where the set is represented by an inner node.
	 * 
	 * @param n  the set for which the predecessors should be calculated;
	 *           it is illegal to have a primed variable in this ROBDD,
	 *           but it will not result in an exception, here
	 * @param changeset the set of variables that may change
	 * @return   the predecessors 
	 * @see ROBDD#predecessors(ROBDD, ChangeSet)
	 */
	@SuppressWarnings("unchecked")
	private ROBDD predecessors(InnerNode n, ChangeSet changeset) {
		// calculate exists v' . R(v,v') & f(v'), where R(v,v') is
		// represented by this and f(v) is represented by n. Since n
		// is an inner node, it represents a non-empty set	
		if (value == 1) {
			// the transition relation is total; since n is non-empty,
			// all states are predecessors of n
			
			NodePair pair = new NodePair(this, n);
			ROBDD repr = (ROBDD) changeset.predecessorTable.get(pair);

			if (repr == null) {
				// if the predecessor for the pair (this,n) was not yet calculated,
				// we calculate it now.
				ROBDD nlow;
				ROBDD nhigh;

				if (n.variable.isPrimed())
					// the variable of the argument n should not be primed,
					// because it must represent a state (not a transition)
					throw new IncorrectUseException(
						IncorrectUseException.NO_PRIMED_VARIABLES_ALLOWED);

				if (changeset.contains(n.variable)) {
					nlow = predecessors(n.low,changeset);
					nhigh = predecessors(n.high,changeset);
					repr = context.or.apply(nlow, nhigh);
				
				} else {
					nlow = predecessors(n.low,changeset);
				    nhigh = predecessors(n.high,changeset);
				    repr  = context.createInnerNode(n.variable,nlow,nhigh);
				} 
				// store the result for this pair in the hash table
				changeset.predecessorTable.put(pair, repr);
			}
			return repr;
		}
		else
			// the transition relation is empty; so, no state is
			// a predecessor of n
			return context.low;
	}

	/**
	 * Returns the ROBBD with all the predecessors of a set n. This class
	 * itself plays the role of the transition relation.  This method
	 * implements the case where the set is represented by an terminal node.
	 * 
	 * @param n  the set for which the predecessors should be calculated;
	 *           it is illegal to have a primed variable in this ROBDD,
	 *           but it will not result in an exception, here
	 * @param changeset the set of variables that may change
	 * @return   the predecessors 
	 * @see ROBDD#predecessors(ROBDD, ChangeSet)
	 */
	private ROBDD predecessors(TerminalNode n, ChangeSet changeset) {
		if (value == 1)
			// return n as n is either set of all nodes or the empty
			// set
			return n;
		else
			// the transition relation is empty; so the result is
			// false (which is this or low)
			return this;
	}

    /**
     * Returns the ROBBD with all the successors of a set n. This class
     * itself plays the role of the transition relation.  An invocation
     * of this method with an ROBDD from a different context results in
     * an exception. This method only dispatches the call to more specific
     * private methods.
     *
     * @param n  the set for which the successors should be calculated;
     *           it is illegal to have a primed variable in this ROBDD,
     *           but it will not result in an exception, here
     * @return   the successors 
     * @exception IncorrectUse if contexts do not coincide 
     * @exception InternalError if somebody messed up the implementation of this
     *            package             
     * @see ROBDD#successors(ROBDD)
     * @see TerminalNode#successors(InnerNode)
     * @see TerminalNode#successors(TerminalNode)
     */
    public ROBDD successors(ROBDD n) {
        if (context != n.context) {
            throw new IncorrectUseException(
                IncorrectUseException.CONTEXT_MISMATCH);
        } else if (n instanceof InnerNode) {
            return successors((InnerNode) n);
        } else if (n instanceof TerminalNode) {
            return successors((TerminalNode) n);
        } else
            throw new InternalError(InternalError.UNKNOWN_NODE_TYPE);
    }

    /**
     * Returns the ROBBD with all the successors of a set n. This class
     * itself plays the role of the transition relation.  This method
     * implements the case where the set is represented by an inner node.
     * 
     * @param n  the set for which the successors should be calculated;
     *           it is illegal to have a primed variable in this ROBDD,
     *           but it will not result in an exception, here
     * @return   the successors 
     * @see ROBDD#successors(ROBDD)
     */
    public ROBDD successors(InnerNode n) {
        // calculate exists v . R(v,v') & f(v), where R(v,v') is
        // represented by this and f(v) is represented by n; subsequently
        // all primed variables are renamed to the unprimed version.
        // Since n is an inner node, it represents a non-empty set	
        if (value == 1)
            // the transition relation is total; since n is non-empty,
            // all states are successors of n
            return context.high;
        else
            // the transition relation is empty; so, no state is
            // a successor of n
            return context.low;
    }

    /**
     * Returns the ROBBD with all the successors of a set n. This class
     * itself plays the role of the transition relation.  This method
     * implements the case where the set is represented by an terminal node.
     * 
     * @param n  the set for which the successors should be calculated;
     *           it is illegal to have a primed variable in this ROBDD,
     *           but it will not result in an exception, here
     * @return   the successors 
     * @see ROBDD#successors(ROBDD)
     */
    private ROBDD successors(TerminalNode n) {
        // calculate exists v . R(v,v') & f(v), where R(v,v') is
        // represented by this and f(v) is represented by n; subsequently
        // all primed variables are renamed to the unprimed version.
        // Since n is a terminal node too, it represents either the empty
        // set or the set of all nodes.	
        if (value == 1)
            // return n as n is either set of all nodes or the empty
            // set
            return n;
        else
            // the transition relation is empty; so the result is
            // false (which is this or low)
            return this;
    }

	/**
	 * Considers this ROBBD as a transition relation and computes
	 * the successors of a given set. Only the variables
	 * in the set changeable can be changed by the transition relation.
	 * 
	 * @param  n  the set, this ROBDD may not refer to primed variables
	 * @param changeset variables that may change in the transition
	 *                   relation
	 * @return    the set of successors of the set
	 * @exception IncorrectUseException if the set n contains a primed
	 *            variable
	 */
	public ROBDD successors(ROBDD n, ChangeSet changeset) {
	    if (context != n.context) {
		    throw new IncorrectUseException(
			    IncorrectUseException.CONTEXT_MISMATCH);
	    } else if (n instanceof InnerNode) {
		    return successors((InnerNode) n, changeset);
	    } else if (n instanceof TerminalNode) {
		    return successors((TerminalNode) n, changeset);
	    } else
		    throw new InternalError(InternalError.UNKNOWN_NODE_TYPE);
    }
	
	/**
	 * Returns the ROBBD with all the successors of a set n. This class
	 * itself plays the role of the transition relation.  This method
	 * implements the case where the set is represented by an inner node.
	 * 
	 * @param n  the set for which the successors should be calculated;
	 *           it is illegal to have a primed variable in this ROBDD,
	 *           but it will not result in an exception, here
	 * @param changeset variables that may change in the transition
	 *                   relation
	 * @return   the successors 
	 * @see ROBDD#successors(ROBDD)
	 */
	@SuppressWarnings("unchecked")
	public ROBDD successors(InnerNode n, ChangeSet changeset) {
		if (value == 1) {
		    // the transition relation is total; since n is non-empty,
		    // all states are predecessors of n
			
		    NodePair pair = new NodePair(this, n);
		    ROBDD repr = (ROBDD) changeset.successorTable.get(pair);
			if (repr == null) {
			    // if the predecessor for the pair (this,n) was not yet calculated,
			    // we calculate it now.

				if (n.variable.isPrimed()) {
				    // the variable of the argument n should not be primed,
					// because it must represent a state (not a transition)
					throw new IncorrectUseException(
					              IncorrectUseException.NO_PRIMED_VARIABLES_ALLOWED);
				}

				ROBDD nlow  = successors(n.low,changeset);
				ROBDD nhigh = successors(n.high,changeset);
				
			    if (changeset.contains(n.variable)) {
					repr = context.or.apply(nlow, nhigh);
				
				} else {
					repr  = context.createInnerNode(n.variable,nlow,nhigh);
				} 
				// store the result for this pair in the hash table
				changeset.successorTable.put(pair, repr);
			}
		    return repr;
	    }
		else
			// the transition relation is empty; so, no state is
			// a successor of n
			return context.low;
	}

	/**
	 * Returns the ROBBD with all the successors of a set n. This class
	 * itself plays the role of the transition relation.  This method
	 * implements the case where the set is represented by an terminal node.
	 * 
	 * @param n  the set for which the successors should be calculated;
	 *           it is illegal to have a primed variable in this ROBDD,
	 *           but it will not result in an exception, here
	 * @param changeset variables that may change in the transition
	 *                   relation
	 * @return   the successors 
	 * @see ROBDD#successors(ROBDD)
	 */
	private ROBDD successors(TerminalNode n, ChangeSet changeset) {
		if (value == 1)
			// return n as n is either set of all nodes or the empty
			// set
			return n;
		else
			// the transition relation is empty; so the result is
			// false (which is this or low)
			return this;
	}
		
    /**
     * Returns true, if the ROBDD is valid  (i.e. it evaluates to true for any
     * assignment).  This is true for the TerminalNode with value 1 only.
     * 
     * @return true, if the ROBDD is valid.
     */
    public boolean isValid() {
        return value == 1;
    }

    /**
     * Returns an assignment for which the ROBDD evaluates to true. It returns
     * null, if no such assignment exists.
     * 
     * @see ROBDD#getAssignment()
     */
    public Assignment getAssignment() {
        if (value == 0)
            // there is no assignment in which this ROBDD evaluates to true
            return null;
        else
            // the assignment with don't care values for
            // all variables is a legal assignment for this ROBDD
            return new HashAssignment(context);
    }

    /**
     * Computes the product of two relations.  This object is
     * considered as the first relation, argument n is considered as
     * the second relation.  An invocation
     * of this method with an ROBDD from a different context results in
     * an exception. This method dispatches the call to the
     * more specific private methods.<p>
     * 
     * <b>This method is not fully tested yet!</b>
     * 
     * @param  n  the set second relation
     * @return    the product of the two relations
     */
    public ROBDD relProd(ROBDD n) {
        if (context != n.context) {
            throw new IncorrectUseException(
                IncorrectUseException.CONTEXT_MISMATCH);
        } else if (n instanceof InnerNode) {
            return relProd((InnerNode) n);
        } else if (n instanceof TerminalNode) {
            return relProd((TerminalNode) n);
        } else
            throw new InternalError(InternalError.UNKNOWN_NODE_TYPE);
    }

    /**
     * Computes the product of two relations.  This object is
     * considered as the first relation, argument n is considered as
     * the second relation.  This method implements the case, where the
     * second argument is an inner node (i.e. a non-empty relation).<p>
     * 
     * <b>This method is not fully tested yet!</b>
     * 
     * @param  n  the set second relation
     * @return    the product of the two relations
     */
    @SuppressWarnings("unchecked")
	private ROBDD relProd(InnerNode n) {
        // calculate exists v'' . R1(v,v'') & R2(v'',v'), where R1(v,v') is
        // represented by this and R2(v,v') is represented by n. Note that
        // we implicitly rename variables during the calculation here.
        // Since n is an inner node, it represents a non-empty set	
        if (value == 1) {
            NodePair pair = new NodePair(this, n);
            // WeakReference ref = (WeakReference) relationTable.get(pair);
            // ROBDD repr = null;
            // if (ref != null) repr = (ROBDD) ref.get();
            ROBDD repr = (ROBDD) context.relationTable.get(pair);

            if (repr == null) {
                // the transition R1 relation is total; i.e. we must return 
                // exits v''. R2(v'',v'), which is calculated recursively
                ROBDD nlow = relProd(n.low);
                ROBDD nhigh = relProd(n.high);

                if (!n.variable.isPrimed())
                    // if we have an unprimed variable, calculate the
                    // existential quantification (i.e. an or)
                    repr = context.or.apply(nlow, nhigh);
                else
                    // otherwise create an inner node for the two
                    // calculated successors
                    repr = context.createInnerNode(n.variable, nlow, nhigh);

                // store the result in the hash table	
                // relationTable.put(pair,new WeakReference(repr)); 
                context.relationTable.put(pair, repr);

            }
            return repr;
        } else
            // the transition relation R1 is empty; so, the product is
            // empty
            return context.low;
    }

    /**
     * Computes the product of two relations.  This object is
     * considered as the first relation, argument n is considered as
     * the second relation.  This method implements the case, where
     * the second argument is a terminal node (i.e. it is either the
     * full relation or the empty relation).<p>
     * 
     * <b>This method is not fully tested yet!</b>
     * 
     * @param  n  the set second relation
     * @return    the product of the two relations
     */
    private ROBDD relProd(TerminalNode n) {
        // calculate exists v'' . R1(v,v'') & R2(v'',v'), where R1(v,v') is
        // represented by this and R2(v,v') is represented by n. Note that
        // we implicitly rename variables during the calculation here.
        // Since n is a terminal node too, it represents either the empty
        // relation or the fully connected relation.	
        if (value == 1)
            // return n as n is either set of all nodes or the empty
            // set
            return n;
        else
            // the transition relation is empty; so the result is
            // false (which is this or low)
            return this;
    }

    /**
     * Evaluates the ROBDD in the given assignment, where the result
     * is the ROBDD node at which the evaluation terminates. Here, the
     * {@link TerminalNode} is immediately returned. It is an error,
     * if the assignment is from a different context.
     *  
     * @param ass for which the ROBDD should be evaluated
     * @return  this node (if the assignment is from the same context)
     */
    public ROBDD eval(Assignment ass) {
        if (ass.getContext() != context) {
            throw new IncorrectUseException(
                IncorrectUseException.CONTEXT_MISMATCH);
        }

        return this;
    }

}

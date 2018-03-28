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
 * Represents the inner nodes of an ROBDD.  An inner node is represented
 * by a reference to the corresponding variable and its two successor nodes
 * low and high.
 * 
 * @author Ekkart Kindler, kindler@upb.de
 *
 */
class InnerNode extends ROBDD {

    /**
     * The variable associated with this inner node.
     */
    Variable variable;

    /**
     * Outgoing arc for value 0.
     */
    ROBDD low;

    /**
     * Outgoing arc for value 1.
     */
    ROBDD high;

    /**
     * If defined, this attribute refers to the complement of this ROBDD.
     */
    private InnerNode negation;

    /**
     * Creates a new inner node. In order to avoid creation of duplicate
     * inner nodes (same variable and same successors for low and high),
     * inner nodes can only be created from within this package. The method
     * for this purpose is
     * {@link Context#createInnerNode(Variable,ROBDD,ROBDD)}.
     * This method also maintains a hash table for all inner nodes.
     * 
     * @param variable the variable associated with this inner node
     * @param low      outgoing arc for value 0
     * @param high     outgoing arc for value 1
     * @exception      IncorrectUseException if context of the variables
     *                 and successor nodes do not coincide
     */
    InnerNode(Variable variable, ROBDD low, ROBDD high) {
        if (variable.context != low.context
            || variable.context != high.context) {
            throw new IncorrectUseException(
                IncorrectUseException.CONTEXT_MISMATCH);
        } else {
            this.context = variable.context;
            this.variable = variable;
            this.low = low;
            this.high = high;
        }
    }

    /**
     * Returns the negation of this ROBDD. For efficiency reasons, this method
     * maintains an attribute negate. When defined, this attribute refers
     * to the negated ROBDD.
     * 
     * @return the negated ROBDD
     */
    public ROBDD negate() {
        if (negation == null) {
            // if the negation of this node was not yet calculated, recursively
            // generate it (the ROBDD is exactly the same; only the two
            // terminal nodes are exchanged; see corresponding method in
            // TerminalNode).
            negation =
                (InnerNode) context.createInnerNode(
                    variable,
                    low.negate(),
                    high.negate());

            // create a cross-reference for the negated node, too
            negation.negation = this;
        }

        // either way, negation refers to the ROBDD with the negation now;
        // this is returned
        return negation;
    }

    /**
     * Returns the ROBBD with all the predecessors of a set n. This class
     * itself plays the role of the transition relation.  An invocation
     * with an ROBDD from a different context results in an exception.
     * This method only dispatches the call to more specific private methods.
     * 
     * @param n   the ROBDD representing the set for which the predecessors
     *            should be computed; this ROBDD must not refer to primed
     *            variables
     * @return    the set of predecessors represented as an ROBDD
     * @exception IncorrectUseException if the set n contains a primed
     *            variable
     * @exception InternalError can occur only, if somebody messed up
     *            the implementation of the ROBDD package
     * @see ROBDD#predecessors(ROBDD)
     * @see InnerNode#predecessors(InnerNode)
     * @see InnerNode#predecessors(TerminalNode)
     */
    public ROBDD predecessors(ROBDD n) {
        if (context != n.context) {
            throw new IncorrectUseException(
                IncorrectUseException.CONTEXT_MISMATCH);
        } else if (n instanceof InnerNode) {
            return predecessors((InnerNode) n);
        } else if (n instanceof TerminalNode) {
            return predecessors((TerminalNode) n);
        } else {
            throw new InternalError(InternalError.UNKNOWN_NODE_TYPE);
        }
    }

    /**
     * Returns the ROBBD with all the predecessors of a set n. This class
     * itself plays the role of the transition relation.  This method
     * implements the case where the set is represented by an inner node.
     * 
     * @param n   the ROBDD representing the set for which the predecessors
     *            should be computed; this ROBDD must not refer to primed
     *            variables
     * @return    the set of predecessors represented as an ROBDD
     * @exception IncorrectUseException if the set n contains a primed
     *            variable
     * @exception InternalError can occur only, if somebody messed up
     *            the implementation of the ROBDD package
     * @see       ROBDD#predecessors(ROBDD)
     */
    @SuppressWarnings("unchecked")
	private ROBDD predecessors(InnerNode n) {
        // calculate exists v' : R(v,v') & f(v'), where R(v,v') is
        // represented by this and f(v) is represented by n. Note
        // that we must consider all variables in n as primed instead
        // of unprimed
        NodePair pair = new NodePair(this, n);
        ROBDD repr = (ROBDD) context.predecessorTable.get(pair);

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

            // now the variable of n is considered to be the primed version	            
            if (variable.precedes(n.variable.getPartner())) {
                // if the current variable in this precedes the primed
                // version of the variable of n, proceed recursively for
                // the successors low and high of this only
                nlow = low.predecessors(n);
                nhigh = high.predecessors(n);
                if (variable.isPrimed())
                    // if the variable is primed, we calculate the
                    // existential quantification for it (which is an or)
                    repr = context.or.apply(nlow, nhigh);
                else
                    // otherwise we create the corresponding Inner Node
                    repr = context.createInnerNode(this.variable, nlow, nhigh);
            } else if (variable.equals(n.variable.getPartner())) {
                // if the current variable is equal to the primed
                // version of the variable of n, proceed recursively for
                // the successors low and high of both nodes 
                nlow = low.predecessors(n.low);
                nhigh = high.predecessors(n.high);
                // the variable is primed, so we calculate the existential
                // quantification for it (i.e. an or)
                repr = context.or.apply(nlow, nhigh);
            } else {
                // otherwise the primed version of the variable n precedes
                // this nodes variable, and we proceed recursively for
                // the successors low and high of node n only
                nlow = predecessors(n.low);
                nhigh = predecessors(n.high);
                // the variable of n is considered to be primed, so we
                // calculate the existential quantification for it
                // (i.e. the or).
                repr = context.or.apply(nlow, nhigh);
            }
            // store the result for this pair in the hash table
            context.predecessorTable.put(pair, repr);
        }

        return repr;
    }

    /**
     * Returns the ROBBD with all the predecessors of a set n. This class
     * itself plays the role of the transition relation.  This method
     * implements the case where the set is represented by a terminal node.
     *
     * @param n   the ROBDD representing the set for which the predecessors
     *            should be computed
     * @return    the set of predecessors represented as ROBDD 
     * @see       ROBDD#predecessors(ROBDD)
     */
    @SuppressWarnings("unchecked")
	private ROBDD predecessors(TerminalNode n) {
        // calculate exists v' . R(v,v') & f(v'), where R(v,v') is
        // represented by this and f(v) is represented by n. Since n
        // is a terminal node, it is either true or false
        if (n.value == 0)
            // return false which is n itself
            return n;
        else {
            // otherwise we return exists v' . R(v,v'), which means that
            // we must recursively eliminate all primed variables 
            NodePair pair = new NodePair(this, n);
            ROBDD repr = (ROBDD) context.predecessorTable.get(pair);

            // we proceed only, when we did not do that before
            if (repr == null) {
                // recursively eliminate the primed variables for
                // both successors low and high
                ROBDD nlow = low.predecessors(n);
                ROBDD nhigh = high.predecessors(n);

                if (variable.isPrimed())
                    // if we have a primed variable, calculate the
                    // existential quantification (i.e. an or)
                    repr = context.or.apply(nlow, nhigh);
                else
                    // otherwise create an inner node for the two
                    // calculated successors
                    repr = context.createInnerNode(this.variable, nlow, nhigh);

                // store the result in the hash table
                context.predecessorTable.put(pair, repr);
            }

            return repr;
        }
    }

	/**
	 * Returns the ROBBD with all the predecessors of a set n. This class
	 * itself plays the role of the transition relation, where only the
	 * variables from changeset change.  An invocation with an ROBDD from
	 * a different context results in an exception. If the transition relation
	 * contains a primed variable that is not in the changeset, an exception
	 * will be thrown. This method only dispatches the call to more specific
	 * private methods.
	 * 
     * @param n         the ROBDD representing the set for which the
     *                  predecessors should be computed
     * @param changeset the set of variables that can change
	 * @return          the set of predecessors represented as an ROBDD
	 * @exception IncorrectUseException if the set n contains a primed
	 *            variable or the transition relation contains a primed
	 *            variable that is not in the changeset 
	 * @exception InternalError can occur only, if somebody messed up
	 *            the implementation of the ROBDD package
	 * @see ROBDD#predecessors(ROBDD, ChangeSet)
	 * @see InnerNode#predecessors(InnerNode, ChangeSet)
	 * @see InnerNode#predecessors(TerminalNode, ChangeSet)
	 */
	public ROBDD predecessors(ROBDD n, ChangeSet changeset) {
		if (context != n.context) {
			throw new IncorrectUseException(
				IncorrectUseException.CONTEXT_MISMATCH);
		} else if (n instanceof InnerNode) {
			return predecessors((InnerNode) n, changeset);
		} else if (n instanceof TerminalNode) {
			return predecessors((TerminalNode) n, changeset);
		} else {
			throw new InternalError(InternalError.UNKNOWN_NODE_TYPE);
		}
	}

	/**
	 * Returns the ROBBD with all the predecessors of a set n. This class
	 * itself plays the role of the transition relation, where only the
	 * variables from changeset change.  An invocation with an ROBDD from
	 * a different context results in an exception. If the transition relation
	 * contains a primed variable that is not in the changeset, an exception
	 * will be thrown. This method implements the case where the set is
	 * represented by an inner node.
	 * 
     * @param n         the ROBDD representing the set for which the
     *                  predecessors should be computed
     * @param changeset the set of variables that can change
	 * @return          the set of predecessors represented as an ROBDD
	 * @exception IncorrectUseException if the set n contains a primed
	 *            variable or the transition relation contains a primed
	 *            variable that is not in the changeset 
	 * @see ROBDD#predecessors(ROBDD, ChangeSet)
	 */
	@SuppressWarnings("unchecked")
	private ROBDD predecessors(InnerNode n, ChangeSet changeset) {

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

            // TODO since this method has been developed from a more
            // simple version without changeset, the structure of the
            // following cases is a bit more complicated than necessary.
            // This should be adjusted eventually.
            if (changeset.contains(n.variable)) {
			    // the variable of n is considered to be the primed version	            
			    if (variable.precedes(n.variable.getPartner())) {
				    // if the current variable in this precedes the primed
				    // version of the variable of n, proceed recursively for
				    // the successors low and high of this only
				    nlow = low.predecessors(n,changeset);
				    nhigh = high.predecessors(n,changeset);
				    if (variable.isPrimed()) {
					    // if the variable is primed, we calculate the
					    // existential quantification for it (which is an or)
					    if (changeset.contains(variable.getPartner())) {
					        repr = context.or.apply(nlow, nhigh);
					    } else {
					    	throw new IncorrectUseException(
					    	    IncorrectUseException.ILLEGAL_UNPRIMED_VARIABLE);
					    }	
				    }    
				    else
					    // otherwise we create the corresponding Inner Node
					    repr = context.createInnerNode(this.variable, nlow, nhigh);
			    } else if (variable.equals(n.variable.getPartner())) {
				    // if the current variable is equal to the primed
				    // version of the variable of n, proceed recursively for
				    // the successors low and high of both nodes 
				    nlow = low.predecessors(n.low,changeset);
				    nhigh = high.predecessors(n.high,changeset);
				    // the variable is primed, so we calculate the existential
				    // quantification for it (ie an or)
				    repr = context.or.apply(nlow, nhigh);
			    } else {
				    // otherwise the primed version of the variable n precedes
				    // this nodes variable, and we proceed recursively for
				    // the successors low and high of node n only
				    nlow = predecessors(n.low,changeset);
				    nhigh = predecessors(n.high,changeset);
				    // the variable of n is considered to be primed, so we
				    // calculate the existential quantification for it
				    // (ie the or).
				    repr = context.or.apply(nlow, nhigh);
			    }
            } else {
            	// the variable of n is considered to be unprimed
            	// (and unchanged)
				if (variable.precedes(n.variable)) {
					// if the current variable in this precedes the variable
					// of n, proceed recursively for
					// the successors low and high of this only
					nlow = low.predecessors(n,changeset);
					nhigh = high.predecessors(n,changeset);
					if (variable.isPrimed()) {
					    if (changeset.contains(variable.getPartner())) {
						    repr = context.or.apply(nlow, nhigh);
					    } else {
						    throw new IncorrectUseException(
						  	    IncorrectUseException.ILLEGAL_UNPRIMED_VARIABLE);
					    }
				    }	
					else
						// otherwise we create the corresponding Inner Node
						repr = context.createInnerNode(this.variable, nlow, nhigh);
				} else if (variable.equals(n.variable)) {
					// if the current variable is equal to the variable of n,
					// proceed recursively for the successors low and high of both nodes
					nlow = low.predecessors(n.low,changeset);
			        nhigh = high.predecessors(n.high,changeset);
			        repr  = context.createInnerNode(variable,nlow,nhigh);
				} else {
					// otherwise the variable n precedes
					// this nodes variable, and we proceed recursively for
					// the successors low and high of node n only
					nlow = predecessors(n.low,changeset);
					nhigh = predecessors(n.high,changeset);
					repr  = context.createInnerNode(n.variable,nlow,nhigh);
				} 
            }
			// store the result for this pair in the hash table
			changeset.predecessorTable.put(pair, repr);
		}

		return repr;
	}

	/**
	 * Returns the ROBBD with all the predecessors of a set n. This class
	 * itself plays the role of the transition relation, where only the
	 * variables from changeset change.  An invocation with an ROBDD from
	 * a different context results in an exception. If the transition relation
	 * contains a primed variable that is not in the changeset, an exception
	 * will be thrown. This method implements the case where the set is
	 * represented by a terminal node.
	 * 
     * @param n         the ROBDD representing the set for which the
     *                  predecessors should be computed
     * @param changeset the set of variables that can change
	 * @return          the set of predecessors represented as an ROBDD
	 * @exception IncorrectUseException if the transition relation
	 *            contains a primed variable that is not in the changeset 
	 * @see ROBDD#predecessors(ROBDD, ChangeSet)
	 */
	@SuppressWarnings("unchecked")
	private ROBDD predecessors(TerminalNode n, ChangeSet changeset) {
		if (n.value == 0)
			// return false which is n itself
			return n;
		else {
			NodePair pair = new NodePair(this, n);
			ROBDD repr = (ROBDD) changeset.predecessorTable.get(pair);

			// we proceed only, when we did not do that before
			if (repr == null) {
				// recursively eliminate the primed variables for
				// both successors low and high
				ROBDD nlow = low.predecessors(n,changeset);
				ROBDD nhigh = high.predecessors(n,changeset);

				if (variable.isPrimed()) {
					if (changeset.contains(variable.getPartner())) {
  					    repr = context.or.apply(nlow, nhigh);
					} else {
					    throw new IncorrectUseException(
						    IncorrectUseException.ILLEGAL_UNPRIMED_VARIABLE);
					}    
				}
				else
					// otherwise create an inner node for the two
					// calculated successors
					repr = context.createInnerNode(this.variable, nlow, nhigh);

				// store the result in the hash table
				changeset.predecessorTable.put(pair, repr);
			}

			return repr;
		}
	}
	
    /**
     * Returns the ROBBD with all the successors of a set n. This class
     * itself plays the role of the transition relation.   An invocation
     * with an ROBDD from a different context results in an exception. This
     * method only dispatches the call to more specific private methods.
     * 
	 * @param  n  the set, this ROBDD must not refer to primed variables
     * @return    the successors 
     * @exception IncorrectUseException if the set n contains a primed
     *            variable
     * @exception InternalError if somebody messed up the implementation
     *            of this package
     * @see ROBDD#successors(ROBDD)
     * @see InnerNode#successors(InnerNode)
     * @see InnerNode#successors(TerminalNode)
     */
    public ROBDD successors(ROBDD n) {
        if (context != n.context) {
            throw new IncorrectUseException(
                IncorrectUseException.CONTEXT_MISMATCH);
        } else if (n instanceof InnerNode) {
            return successors((InnerNode) n);
        } else if (n instanceof TerminalNode) {
            return successors((TerminalNode) n);
        } else {
            throw new InternalError(InternalError.UNKNOWN_NODE_TYPE);
        }
    }

    /**
     * Returns the ROBBD with all the successors of a set n. This class
     * itself plays the role of the transition relation.  This method
     * implements the case where the set is represented by an inner node.
     * 
	 * @param  n  the set, this ROBDD must not refer to primed variables
     * @return    the successors 
     * @exception IncorrectUseException if the set n contains a primed
     *            variable
     * @see ROBDD#successors(ROBDD)
     */
    @SuppressWarnings("unchecked")
	private ROBDD successors(InnerNode n) {
        // calculate exists v : R(v,v') & f(v), where R(v,v') is
        // represented by this and f(v) is represented by n; then
        // rename all primed variables to their unprimed version.
        NodePair pair = new NodePair(this, n);
        ROBDD repr = (ROBDD) context.successorTable.get(pair);

        if (repr == null) {
            // if the successor for the pair (this,n) was not yet calculated,
            // we calculate it now.
            ROBDD nlow;
            ROBDD nhigh;

            if (n.variable.isPrimed()) {
                // the variable of the argument n should not be primed,
                // because it must represent a state (not a transition)
                throw new IncorrectUseException(
                    IncorrectUseException.NO_PRIMED_VARIABLES_ALLOWED);
            }

 			if (variable.precedes(n.variable)) {
                // if the current variable in this precedes the variable of n,
                // proceed recursively for the successors low and high of this
                // only
                nlow = low.successors(n);
                nhigh = high.successors(n);
                if (!variable.isPrimed())
                    // if the variable is unprimed, we calculate the
                    // existential quantification for it (which is an or)
                    repr = context.or.apply(nlow, nhigh);
                else
                    // otherwise we create the corresponding Inner Node,
                    // but for the unprimed version of the variable
                    repr =
                        context.createInnerNode(
                            this.variable.getPartner(),
                            nlow,
                            nhigh);
            } else if (variable.equals(n.variable)) {
                // if the current variable is equal to
                // the variable of n, proceed recursively for
                // the successors low and high of both nodes 
                nlow = low.successors(n.low);
                nhigh = high.successors(n.high);
                // the variable is unprimed, so we calculate the existential
                // quantification for it (i.e. an or)
                repr = context.or.apply(nlow, nhigh);
            } else {
                // otherwise the variable n precedes
                // this nodes variable, and we proceed recursively for
                // the successors low and high of node n only
                nlow = successors(n.low);
                nhigh = successors(n.high);
                // the variable of n is unprimed, so we
                // calculate the existential quantification for it
                // (i.e. the or).
                repr = context.or.apply(nlow, nhigh);
            }
            // store the result for this pair in the hash table
            context.successorTable.put(pair, repr);
        }

        return repr;
    }

    /**
     * Returns the ROBBD with all the successors of a set n. This class
     * itself plays the role of the transition relation.  This method
     * implements the case where the set is represented by a terminal node.
     * 
	 * @param  n  the set
     * @return    the successors 
     * @see ROBDD#successors(ROBDD)
     */
    @SuppressWarnings("unchecked")
	private ROBDD successors(TerminalNode n) {
        // calculate exists v . R(v,v') & f(v), where R(v,v') is
        // represented by this and f(v) is represented by n; then
        // rename all primed variables to their unprimed version.
        // Since n is a terminal node, it is either true or false
        if (n.value == 0)
            // return false which is n itself
            return n;
        else {
            // otherwise we return exists v . R(v,v'), which means that
            // we must recursively eliminate all unprimed variables
            // and rename the primed to unprimed variables. 
            NodePair pair = new NodePair(this, n);
            ROBDD repr = (ROBDD) context.successorTable.get(pair);

            // we proceed only, when we did not do that before
            if (repr == null) {
                // recursively eliminate the unprimed variables for
                // both successors low and high
				ROBDD nlow = low.successors(n);
				ROBDD nhigh = high.successors(n);                

                if (!variable.isPrimed())
                    // if we have an unprimed variable, calculate the
                    // existential quantification (i.e. an or)
                    repr = context.or.apply(nlow, nhigh);
                else
                    // otherwise create an inner node for the two
                    // calculated successors, where the variable
                    // is the unprimed version
                    repr =
                        context.createInnerNode(
                            this.variable.getPartner(),
                            nlow,
                            nhigh);

                // store the result in the hash table
                context.successorTable.put(pair, repr);
            }

            return repr;
        }
    }

	/**
	 * Considers this ROBBD as a transition relation and computes
	 * the successors of a given set. Only the variables
	 * in the set changeable can be changed by the transition relation.
	 * 
	 * @param  n  the set, this ROBDD must not refer to primed variables
	 * @param changeset variables that may change in the transition
	 *                   relation
	 * @return    the set of successors of the set
     * @exception IncorrectUseException if the set n contains a primed
	 *            variable or the transition relation contains a primed
	 *            variable that is not in the changeset
     * @exception InternalError if somebody messed up the implementation
     *            of this package
     * @see ROBDD#successors(ROBDD, ChangeSet)
     * @see InnerNode#successors(InnerNode, ChangeSet)
     * @see InnerNode#successors(TerminalNode, ChangeSet)
	 */
	public ROBDD successors(ROBDD n, ChangeSet changeset) {
 	    if (context != n.context) {
		    throw new IncorrectUseException(
			    IncorrectUseException.CONTEXT_MISMATCH);
	    } else if (n instanceof InnerNode) {
		    return successors((InnerNode) n, changeset);
	    } else if (n instanceof TerminalNode) {
		    return successors((TerminalNode) n, changeset);
	    } else {
		    throw new InternalError(InternalError.UNKNOWN_NODE_TYPE);
	    }
    }
	
	/**
	 * Returns the ROBBD with all the successors of a set n. This class
	 * itself plays the role of the transition relation.  This method
	 * implements the case where the set is represented by an inner node.
	 * 
	 * @param n   the set, this ROBDD may not refer to primed variables
	 * @param changeset variables that may change in the transition
	 *                   relation
	 * @return    the successors 
	 * @exception IncorrectUseException if the set n contains a primed
	 *            variable or the transition relation contains a primed
	 *            variable that is not in the changeset
	 * @see ROBDD#successors(ROBDD, ChangeSet)
	 */
	@SuppressWarnings("unchecked")
	private ROBDD successors(InnerNode n, ChangeSet changeset) {
		// calculate exists v : R(v,v') & f(v), where R(v,v') is
		// represented by this and f(v) is represented by n; then
		// rename all primed variables to their unprimed version.
		NodePair pair = new NodePair(this, n);
		ROBDD repr = (ROBDD) changeset.successorTable.get(pair);

		if (repr == null) {
			// if the successor for the pair (this,n) was not yet calculated,
			// we calculate it now.
			ROBDD nlow;
			ROBDD nhigh;

			if (n.variable.isPrimed()) {
				// the variable of the argument n should not be primed,
				// because it must represent a state (not a transition)
				throw new IncorrectUseException(
					IncorrectUseException.NO_PRIMED_VARIABLES_ALLOWED);
			}

			if (variable.precedes(n.variable)) {
				// if the current variable in this precedes the variable of n,
				// proceed recursively for the successors low and high of this
				// only
				nlow = low.successors(n,changeset);
				nhigh = high.successors(n,changeset);
				if (!variable.isPrimed()) {
			        if ( changeset.contains(variable) ) {
					   // if the variable is unprimed and changeable, we
					   // calculate the existential quantification for
					   // it (which is an or)
					   repr = context.or.apply(nlow, nhigh);
			        } else {
			           repr	= context.createInnerNode(this.variable,nlow,nhigh);
			        }
				}
				else {
					if (!changeset.contains(variable.getPartner())) {
						throw new IncorrectUseException(
								      IncorrectUseException.ILLEGAL_UNPRIMED_VARIABLE);	
					} else {
					    // otherwise we create the corresponding Inner Node,
					    // but for the unprimed version of the variable
					    repr = 
						    context.createInnerNode(
							    this.variable.getPartner(),
							    nlow,
							    nhigh);
					}
				}
			} else if (variable.equals(n.variable)) {
				// if the current variable is equal to
				// the variable of n, proceed recursively for
				// the successors low and high of both nodes 
				nlow = low.successors(n.low, changeset);
				nhigh = high.successors(n.high, changeset);
				if (changeset.contains(variable)) {
				    // the variable is unprimed and in the change set, so we
				    // calculate the existential quantification for it (ie an or)
				    repr = context.or.apply(nlow, nhigh);
				} else {
                    // otherwise we create the corresponding Inner Node,
					// but for the variable (because its value does not
					// change
				    repr = context.createInnerNode(
						       this.variable,
							   nlow,
							   nhigh);
				}	
			} else {
				// otherwise the variable n precedes
				// this nodes variable, and we proceed recursively for
				// the successors low and high of node n only
				nlow = successors(n.low, changeset);
				nhigh = successors(n.high, changeset);
				if (changeset.contains(n.variable)) {
				    // the variable of n is unprimed, so we
				    // calculate the existential quantification for it
				    // (ie the or).
				    repr = context.or.apply(nlow, nhigh);
				} else {
					repr = context.createInnerNode(
							   n.variable,
							   nlow,
							   nhigh);
				}	
			}
			// store the result for this pair in the hash table
			changeset.successorTable.put(pair, repr);
		}

		return repr;
	}

	/**
	 * Returns the ROBBD with all the successors of a set n. This class
	 * itself plays the role of the transition relation.  This method
	 * implements the case where the set is represented by a terminal node.
	 * 
	 * @param n   the set
	 * @param changeset variables that may change in the transition
	 *                   relation
	 * @return    the successors 
	 * @exception IncorrectUseException if the transition relation
	 *            contains a primed variable that is not in the changeset
	 * @see ROBDD#successors(ROBDD, ChangeSet)
	 */
	@SuppressWarnings("unchecked")
	private ROBDD successors(TerminalNode n, ChangeSet changeset) {
		// calculate exists v . R(v,v') & f(v), where R(v,v') is
		// represented by this and f(v) is represented by n; then
		// rename all primed variables to their unprimed version.
		// Since n is a terminal node, it is either true or false
		if (n.value == 0)
			// return false which is n itself
			return n;
		else {
			// otherwise we return exists v . R(v,v'), which means that
			// we must recursively eliminate all unprimed variables
			// and rename the primed to unprimed variables. 
			NodePair pair = new NodePair(this, n);
			ROBDD repr = (ROBDD) changeset.successorTable.get(pair);

			// we proceed only, when we did not do that before
			if (repr == null) {
				// recursively eliminate the unprimed variables for
				// both successors low and high
				ROBDD nlow = low.successors(n,changeset);
				ROBDD nhigh = high.successors(n,changeset);                

				if (!variable.isPrimed()) {
					if (changeset.contains(variable)) {
					    // if we have an unprimed variable, calculate the
					    // existential quantification (i.e. an or)
					    repr = context.or.apply(nlow, nhigh);
					} else {
						repr = context.createInnerNode(
						           this.variable,
						           nlow,
						           nhigh);
					}
				}
				else {
				    if (!changeset.contains(variable.getPartner())) {
						throw new IncorrectUseException(
								      IncorrectUseException.ILLEGAL_UNPRIMED_VARIABLE);	
				    }
					// otherwise create an inner node for the two
					// calculated successors, where the variable
					// is the unprimed version
					repr = context.createInnerNode(
							   this.variable.getPartner(),
							   nlow,
							   nhigh);
				}

				// store the result in the hash table
				changeset.successorTable.put(pair, repr);
			}

			return repr;
		}
	}	
    /**
     * Returns true, if the ROBDD is valid (i.e. if it evaluates to true for any
     * assignment).  This is false for every inner node!
     * 
     * @return false
     */
    public boolean isValid() {
        // the ROBBD corresponding to an inner node is never valid (since
        // ROBDDs are unique, the only valid ROBDD is the TerminalNode 
        // with value 1
        return false;
    }

    /**
     * Returns an assignment for which the ROBDD evaluates to true.
     * 
     * @return assignment that evaluates to true; null, if no such
     *         assignment exists
     */
    public Assignment getAssignment() {
        Assignment assignment;
        // just follow one branch not immediately ending
        // in the TerminalNode.low and collect the values
        // of the corresponding variables
        if (low != context.low) {
            assignment = low.getAssignment();
            assignment.setValue(variable, 0);
        } else {
            // since inner nodes are not redundant, we know that
            // high cannot be TerminalNode.low now
            assignment = high.getAssignment();
            assignment.setValue(variable, 1);
        }
        return assignment;
    }

    /**
     * Returns the hash code of this inner node. This method must be
     * implemented in order to map identical inner nodes to the same hash
     * value.  This method will be used in the hash tables (see
     * {@link java.util.HashMap} and {@link java.util.WeakHashMap}).  Here,
     * we use a simple minded calculation that tries not to compromise the
     * randomness of the hash codes of its parts.  Moreover, the calculation
     * guarantees that a symmetric pair has a different hash code.
     * 
     * But, there may be better ways to calculate the hash code.
     * 
     * @return the hash code of this inner node
     */
    public int hashCode() {
        return variable.hashCode() ^ low.hashCode() ^ (high.hashCode() >> 1);
    }

    /**
     * Checks whether this inner node is equal to an other node. This method
     * must be implemented in order to guarantee proper operation of the hash
     * tables (see {@link java.util.HashMap} and
     * {@link java.util.WeakHashMap}).
     * 
     * @param  o object to be compared with
     * @return   true if the object is an identical inner node; false otherwise
     */
    public boolean equals(Object o) {
        if (o instanceof InnerNode) {
            InnerNode n = (InnerNode) o;
            return (this.variable == n.variable)
                && (this.low == n.low)
                && (this.high == n.high);
        } else
            return false;
    }

    /**
     * Computes the product of two relations.  This object is
     * considered as the first relation, argument n is considered as
     * the second relation.  An invocation with an ROBDD from a
     * different context results in an exception. This method
     * dispatches the call to the more specific private methods only.<p>
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
        } else {
            throw new InternalError(InternalError.UNKNOWN_NODE_TYPE);
        }
    }

    /**
     * Computes the product of two relations.  This object is
     * considered as the first relation, argument n is considered as
     * the second relation.  This method implements the case, where
     * the second argument is an inner node (i.e. it is neither the empty
     * nor the fully connected relation).<p>
     * 
     * <b>This method is not fully tested yet!</b>
     * 
     * @param  n  the set second relation
     * @return    the product of the two relations
     */
    @SuppressWarnings("unchecked")
	private ROBDD relProd(InnerNode n) {
        // calculate exists v'' : R1(v,v'') & R2(v'',v), where R1(v,v') is
        // represented by this and R2(v,v') is represented by n. Note that
        // we implicitly rename variables during the calculation here.
        NodePair pair = new NodePair(this, n);
        ROBDD repr = (ROBDD) context.relationTable.get(pair);

        if (repr == null) {
            // if the predecessor for the pair (this,n) was not yet calculated,
            // we calculate it now.
            ROBDD nlow;
            ROBDD nhigh;

            if (n.variable.isPrimed()) {
                if (variable.precedes(n.variable)
                    || variable.equals(n.variable)) {
                    // if the current variable in this precedes the double
                    // primed version of the variable of n, proceed
                    // recursively for the successors low and high of this only
                    nlow = low.relProd(n);
                    nhigh = high.relProd(n);
                    if (variable.isPrimed())
                        // if the variable is primed, we calculate the
                        // existential quantification for it (which is an or)
                        repr = context.or.apply(nlow, nhigh);
                    else
                        // otherwise we create the corresponding Inner Node
                        repr =
                            context.createInnerNode(this.variable,nlow,nhigh);
                } else {
                    // otherwise the double primed version of the variable n
                    // precedes this nodes variable, and we proceed recursively
                    // for the successors low and high of node n only
                    nlow = relProd(n.low);
                    nhigh = relProd(n.high);
                    // the variable of n is considered to be primed, so we
                    // calculate the existential quantification for it
                    // (i.e. the or).
                    repr = context.createInnerNode(n.variable, nlow, nhigh);
                }
            } else if (variable.precedes(n.variable.getPartner())) {
                // now the variable of n is considered to be the primed version	  
                // if the current variable in this precedes the primed
                // version of the variable of n, proceed recursively for
                // the successors low and high of this only
                nlow = low.relProd(n);
                nhigh = high.relProd(n);
                if (variable.isPrimed())
                    // if the variable is primed, we calculate the
                    // existential quantification for it (which is an or)
                    repr = context.or.apply(nlow, nhigh);
                else
                    // otherwise we create the corresponding Inner Node
                    repr = context.createInnerNode(this.variable, nlow, nhigh);
            } else if (variable.equals(n.variable.getPartner())) {
                // if the current variable is equal to the primed
                // version of the variable of n, proceed recursively for
                // the successors low and high of both nodes 
                nlow = low.relProd(n.low);
                nhigh = high.relProd(n.high);
                // the variable is primed, so we calculate the existential
                // quantification for it (i.e. an or)
                repr = context.or.apply(nlow, nhigh);
            } else {
                // otherwise the primed version of the variable n precedes
                // this nodes variable, and we proceed recursively for
                // the successors low and high of node n only
                nlow = relProd(n.low);
                nhigh = relProd(n.high);
                // the variable of n is considered to be primed, so we
                // calculate the existential quantification for it (i.e. the or).
                repr = context.or.apply(nlow, nhigh);
            }
            // store the result for this pair in the hash table
            context.relationTable.put(pair, repr);
        }

        return repr;
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
    @SuppressWarnings("unchecked")
	private ROBDD relProd(TerminalNode n) {
        // calculate exists v'' : R1(v,v'') & R2(v'',v'), where R1(v,v') is
        // represented by this and R2(v,v') is represented by n. Note that
        // we implicitly rename variables during the calculation here. Since n
        // is a terminal node, it is either true or false
        if (n.value == 0)
            // return false which is n itself
            return n;
        else {
            // otherwise we return exists v'' . R1(v,v''), which means that
            // we must recursively eliminate all primed variables from this
            // ROBDD.
            NodePair pair = new NodePair(this, n);
            ROBDD repr = (ROBDD) context.relationTable.get(pair);

            // we proceed only, when we did not do that before
            if (repr == null) {
                // recursively eliminate the primed variables for
                // both successors low and high
                ROBDD nlow = low.relProd(n);
                ROBDD nhigh = high.relProd(n);

                if (variable.isPrimed())
                    // if we have a primed variable, calculate the
                    // existential quantification (i.e. an or)
                    repr = context.or.apply(nlow, nhigh);
                else
                    // otherwise create an inner node for the two
                    // calculated successors
                    repr = context.createInnerNode(this.variable, nlow, nhigh);

                // store the result in the hash table	
                context.relationTable.put(pair, repr);
            }

            return repr;
        }
    }

    /**
     * Evaluates the ROBDD in the given assignment, where the result
     * is the ROBDD node at which the evaluation terminates. If the evaluation
     * is successful, it is the corresponding {@link TerminalNode};
     * if the evaluation is stuck due to an undefined value for
     * some inner node, this node is returned. It is an error,
     * if the assignment is from a different context.
     *  
     * @param ass for which the ROBDD should be evaluated
     * @return  the final node
     * @exception IncorrectUseException if the assignment and the
     *            ROBDD are from a different context
     */
    public ROBDD eval(Assignment ass) {
        if (ass.getContext() != context) {
            throw new IncorrectUseException(
                IncorrectUseException.CONTEXT_MISMATCH);
        }

        int value = ass.getValue(this.variable);
        switch (value) {
            case 0 :
                return low.eval(ass);
            case 1 :
                return high.eval(ass);
            default :
                return this;
        }
    }
}

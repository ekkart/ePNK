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

import java.util.HashMap;
import java.util.Map;


/**
 * This class implements binary operations on ROBDDs.  A binary operation is
 * defined by a truth table, which is a two dimensional boolean array passed
 * to the constructor.  Each binary operation belongs to a {@link Context}
 * and has its own hash table for pairs of nodes for which the operation has
 * already been calculated.  The standard binary operations will be
 * instantiated for each context upon creation of a new context and are
 * stored in this context:
 * {@link Context#and}, {@link Context#or}, {@link Context#xor},
 * {@link Context#equiv} and {@link Context#impl}. 
 * 
 * @author Ekkart Kindler, kindler@upb.de
 *
 */
public class BinOp {


	/**
	 * The context for this binary operation.
	 */
	private Context context;
	
    /**
     * The truth table defining the binary operation. In each dimension, this
     * array has length 2.
     */
    private boolean truthTable[][];
	
	/**
	 * Hash table for pairs of nodes for which this binary operation has
	 * already been applied. Once calculated, the result is stored in this
	 * table, so that it need not be calculated again.  This significantly
	 * increases the efficiency of the recursive application of the binary
	 * operations and recurrent application of the binary operation to the
	 * same arguments. The reference itself is stored as a weak reference.
	 * This allows a node to be garbage collected when there are only
	 * references from this table.
	 */
	@SuppressWarnings("rawtypes")
	private Map table; 

									 	                             
	/**
	 * Creates a new binary operation from the truth table.
	 * 
	 * @param context The context in which this binary operation
	 *                is to be applied. 
	 * @param truthTable The truth table defining the binary
	 *    operation. It is a two-dimensional array with length two each.
	 *    The first dimension refers to the first operand and the second
	 *    to the second operand. In the array, index 0 stands for false
	 *    and index 1 stands for true.  If the length of one dimension
	 *    is less than two or no truth table is provided at all, the
	 *    entries not provided are considered to be false.
	 */
	@SuppressWarnings("rawtypes")
	public BinOp(Context context, boolean[][] truthTable) {
		this.context    = context;
		this.truthTable = new boolean[2][2];
		
		// copies the relevant values from the parameter
		// to the private truth table of the newly created binary
		// operation (in order to avoid the the truth table is
		// changed from outside)
		if (truthTable != null)
		    for (int i=0; i < truthTable.length && i < 2; i++)
				for (int j=0; j < truthTable[i].length && j < 2; j++)
				    this.truthTable[i][j] = truthTable[i][j];
				    
	    // creates a hash table for the results of previously
	    // calculated applications of the binary operation
		table = new HashMap();                      	
    }

	/**
	 * Applies the binary operation to the two ROBDDs.  This method
	 * dispatches the calls to the more specific operations  for the
	 * different node types. It is an error if the ROBDDs provided as
	 * parameters are from a different context.
	 * 
	 * @param n1 first operand
	 * @param n2 second operand
	 * @return   the result of the binary operation
	 * @exception IncorrectUseException indicates that the context of the
	 *            operation is different from the context of the ROBDDs
	 * @exception InternalError indicates that a node of unknown type
	 *            was encountered
	 * @see #apply(TerminalNode, ROBDD)
	 * @see #apply(ROBDD, TerminalNode)
	 * @see #apply(InnerNode, InnerNode)
	 */    	
	public ROBDD apply(ROBDD n1, ROBDD n2) {
		if        (n1.context != context || n2.context != context) {
		    throw new IncorrectUseException(
		        IncorrectUseException.CONTEXT_MISMATCH);
	    } else if ( n1 instanceof TerminalNode) {
			return apply((TerminalNode) n1, n2);
		} else if ( n2 instanceof TerminalNode ) {
			return apply(n1, (TerminalNode) n2 );
		} else if ( n1 instanceof InnerNode && n2 instanceof InnerNode ) {
			return apply((InnerNode) n1, (InnerNode) n2 );
		} else {
			throw new InternalError(InternalError.UNKNOWN_NODE_TYPE);
		}
	}
                 
    /**
     * Applies the binary operation to the two ROBDDs.  This is the
     * version, when the first operand is a terminal node.
     * 
     * @param n1 first operand
     * @param n2 second operand
     * @return   the result of the binary operation   
	 * @see #apply(ROBDD, ROBDD)
     */
    private ROBDD apply(TerminalNode n1, ROBDD n2) {
    	if (truthTable[n1.value][0] == truthTable[n1.value][1])
		    // if the result of the binary operation does not
		    // depend on the second argument, return the corresponding
		    // result 
    		if (truthTable[n1.value][0])
    	  		return context.high;
    	    else
    	        return context.low;
    	else
    	    // if the result of the binary operation does depend
    	    // on the second argument, return the second argument
    	    // or its negation.
    	    if (truthTable[n1.value][1])
    	    	return n2;
    	    else
    	    	return n2.negate();
    }

	/**
	 * Applies the binary operation to the two ROBDDs.  This is the
	 * version, when the second operand is a terminal node.
	 * 
	 * @param n1 first operand
	 * @param n2 second operand
	 * @return   the result of the binary operation
	 * @see #apply(ROBDD, ROBDD)
 	 */    
	private ROBDD apply(ROBDD n1, TerminalNode n2) {
		if (truthTable[0][n2.value] == truthTable[1][n2.value])
		    // if the result of the binary operation does not
		    // depend on the first argument, return the corresponding
		    // result
			if (truthTable[0][n2.value])
				return context.high;
			else
				return context.low;
		else
		    // if the result of the binary operation does depend
		    // on the first argument, return the first argument
		    // or its negation.		
			if (truthTable[1][n2.value])
				return n1;
			else
				return n1.negate();
	}

	/**
	 * Applies the binary operation to the two ROBDDs.  This is the
	 * version, when both operands are inner nodes.
	 * 
	 * @param n1 first operand
	 * @param n2 second operand
	 * @return   the result of the binary operation
	 * @see #apply(ROBDD, ROBDD)
 	 */    
	@SuppressWarnings("unchecked")
	private ROBDD apply(InnerNode n1, InnerNode n2) {
		NodePair pair = new NodePair(n1,n2);
		ROBDD repr = (ROBDD) table.get(pair);

        // checks whether the binary operation on this pair of
        // arguments has not been calculated before (by accessing
        // the hash table).
		if ( repr == null ) {
			Variable label;
			ROBDD     low;
			ROBDD     high;

		    if (n1.variable == n2.variable) {
				// the variables are equal, so we proceed recursively
				// with both arguments
			    label = n1.variable;
			    low   = apply(n1.low,  n2.low);
			    high  = apply(n1.high, n2.high);
		    } else if (n1.variable.precedes(n2.variable)) {
				// the variable of n1 precedes the variable of n2, so
				// we proceed recursively with n1 only
			    label = n1.variable;
			    low   = apply(n1.low, n2);
			    high  = apply(n1.high, n2);
		    } else {
				// the variable of n2 precedes the variable of n1, so
				// we proceed recursively with n2 only		    	
			    label = n2.variable;
			    low   = apply(n1, n2.low);
		        high  = apply(n1, n2.high);
		    }
		
		    // create an inner node for the calculated successors for
		    // low and high
		    repr = context.createInnerNode(label, low, high);
		    
		    // store the result for the pair (n1,n2) in the hash table
			table.put(pair,repr);
		}
			
		return repr;	    
	}
       
    /**
     * Clears the hash table keeping track of pairs of ROBDD nodes for
     * which this binary operation has already been computed in this
     * context.  This method can be called any time without compromising
     * the correctness. But, calling it can significantly reduce the
     * efficiency.  So, it should not be called without need. On the
     * other hand, not calling it in time can result in an
     * {@link OutOfMemoryError}.
     */         
	public void clearHashtable() {
		table.clear();
	}


	
}

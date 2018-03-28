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

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/**
 * Implements the context for an ROBDD, which comprises the set of
 * variables and the order on these variables. In addition, the
 * context maintains all hash tables for ROBBDs and its operations.<p>
 * 
 * This class provides a public method {@link #createVariable
 * createVariable}, which can be used
 * for instantiating new variables in this context. Each variable is
 * assigned a unique number in ascending order. This is the variable
 * order used in ROBDDs as defined in package {@link de.upb.swt.mcie.robdds
 * robdds}. When a variable is created, the variable as well as its primed
 * version are instantiated (where the unprimed version is created first).<p> 
 * 
 * From outside this package, variables can only be generated by
 * method {@link #createVariable(String) createVariable}, which returns the
 * unprimed version. The corresponding primed version can
 * be obtained by the method {@link Variable#getPartner()}.
 * 
 * @author Ekkart Kindler, kindler@upb.de
 */
public class Context {
	
	/**
	 * The table keeping track of all variables in this context.
	 */
	@SuppressWarnings({ "rawtypes" })
	private Map variablesTable = new HashMap();
	
	/**
	 * The number of variables (primed and unprimed) instantiated
	 * so far in this context.
	 */
	private int variablesCounter = 0;
	
	/**
	 * The (in this context) unique terminal node representing false (0).
	 */
	public final TerminalNode low = new TerminalNode(this,0);
    
	/**
	 * The (in this context) unique terminal node representing true (1).
	 */
	public final TerminalNode high = new TerminalNode(this,1);

	/**
	 * This hash table holds references to all existing inner nodes. This
	 * table is necessary for avoiding duplicates of inner nodes (one of
	 * the requirements of ROBDDs).  But, inner nodes no longer in use
	 * can be removed from the table.  In order to do this fully
	 * automatically, we use {@link java.util.WeakHashMap WeakHashMaps}
	 * and {@link java.lang.ref.WeakReference WeakReferences} in this
	 * table. Note that most inner nodes will be referenced from other
	 * hash tables too; therefore, garbage collection will be effective
	 * only after these tables have been cleared.
	 * TODO: Much fine tuning could be done at this point, but this
	 *  depends on the particular application.<p>
	 * 
	 * BTW: The other two requirements on ROBDDs, variable order and
	 *      exclusion of redundant nodes are guaranteed by the implementation
	 *      of the different algorithms on ROBDDs.  The API should be such
	 *      that these properties cannot be compromised from outside the
	 *      package.
	 */
    @SuppressWarnings({ "rawtypes" })
    Map innerNodesTable = new WeakHashMap();
	
	/**
	 * This table is used during the calculation of the predecessors of a
	 * set with respect to a transition relation.  It significantly improves
	 * the efficiency of the computation, by not calculating the result
	 * for the same pair of nodes twice.  It is not necessary for
	 * correctness and can be cleared any time.  But, it should be cleared
	 * only when necessary (i.e. when the system runs out of memory). 
	 */
    @SuppressWarnings("rawtypes")
	Map predecessorTable = new HashMap();
	
	
	/**
	 * This table is used during the calculation of the successors of a
	 * set with respect to a transition relation.  It significantly improves
	 * the efficiency of the computation, by not calculating the same
	 * operation for a pair of nodes twice.  It is not necessary for
	 * correctness and can be cleared any time.  But, it should be cleared
	 * only when necessary (i.e. when the system runs out of memory).
	 */
	@SuppressWarnings("rawtypes")
	Map successorTable = new HashMap();
	
	/**
	 * This table is used during the calculation of the relation product of
	 * two relations.  It significantly improves the efficiency of the
	 * computation, by not calculating the same operation for a pair of nodes
	 * twice.  It is not necessary for correctness and can be cleared any time.
	 * But, it should be cleared only when necessary (i.e. when the system runs
	 * out of memory).
	 */
	@SuppressWarnings({ "rawtypes" })
	Map relationTable = new HashMap();
	
	/**
	 * The and operation in this context.
	 */
	public final BinOp and =
		new BinOp(this, new boolean[][] { {false, false},
										  {false,  true} } );
		                             
	/**
	 * The or operation in this context.
	 */
	public final BinOp or =
		new BinOp(this, new boolean[][] { {false,  true},
										{true,  true} } );
									 	
	/**
	 * The xor operation in this context.
	 */									 
	public final BinOp xor =
		new BinOp(this, new boolean[][] { {false,  true},
										{true,  false} } );
									 
	/**
	 * The equivalence operation (equality) in this context.
	 */											 
	public final BinOp equiv =
		new BinOp(this, new boolean[][] { {true,  false},
										{false,  true} } );

	/**
	 * The implication operation in this context.
	 */											 
	public final BinOp impl =
		new BinOp(this, new boolean[][] { {true,  true},
										{false,  true} } );
										
	/**
	 * Creates a pair of new variables for the given name and returns the
	 * unprimed version of this pair as a result.  If the variable
	 * exists already, it will not be newly created, but the existing copy
	 * is returned.  The primed version can be obtained by the method
	 * {@link Variable#getPartner()}.  In principle, the name
	 * could contain special characters and symbols other than letters or
	 * digits.  These variables, however, cannot be parsed, and should be
	 * used for special purposes only, when directly generating formulas in
	 * the code.
	 * 
	 * @param name the name of the variable
	 * @return     the corresponding unprimed variable
	 */		
	@SuppressWarnings("unchecked")
	public Variable createVariable(String name) {
		Variable v1 = (Variable) variablesTable.get(name);
		Variable v2;
		
		if (v1 == null) {
			v1 = new Variable(this,name,++variablesCounter, false);
			v2 = new Variable(this,name,++variablesCounter,true);
			v1.partner = v2;
			v2.partner = v1;
			variablesTable.put(name,v1);
		}
		
		return v1;
	}
	
	
	/**
	 * For the given name, returns the associated variable, if the variable
	 * exists.  The primed version can be obtained by the method
	 * {@link Variable#getPartner()}.  In principle, the name
	 * could contain special characters and symbols other than letters or
	 * digits.  These variables, however, cannot be parsed, and should be
	 * used for special purposes only, when directly generating formulas in
	 * the code.
	 * 
	 * @param name a String
	 * @return     the variable with the name, if it exists
	 */		
	public Variable getVariable(String name) {
		return (Variable) variablesTable.get(name);
	}
	
	
	/**
	 * Creates the inner node, provided that it is not duplicate and
	 * not redundant.  When newly created, it is put to the hash table
	 * of all inner nodes.  The arguments for the successor nodes should
	 * not be null; if they are inner nodes, the variables of these
	 * nodes must succeed the variable of this node in this context.
	 * It is an error, if the context of the variable or the successor
	 * nodes are different from the this context. 
	 * 
	 *  
	 * @param variable the variable of this node
	 * @param low      the successor for 0
	 * @param high     the successor for 1
	 * @return         the inner node
	 * @exception  IncorrectUseException if the contexts of the variable
	 *             and the successor nodes do not coincide
	 * @exception  InternalError if for some reason the requirements of
	 *             ROBDDs are compromised
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	ROBDD createInnerNode(Variable variable, ROBDD low, ROBDD high) {
		// in the current implementation, the following three checks will
		// never apply. Therefore, the following checks could be omitted for
		// efficiency reasons.
		if ( low == null || high == null )
			// not referring to another node is illegal for inner nodes
			throw new InternalError(InternalError.ILLEGAL_INNER_NODE);
		if ( variable.context != this ||
		     low.context != this ||
		     high.context != this )
			// the variable and child nodes are not all from the same context
			throw new IncorrectUseException(
			    IncorrectUseException.CONTEXT_MISMATCH);			
		if ( low instanceof InnerNode &&
		     !variable.precedes(((InnerNode) low).variable))
			// the requested inner node would violate the variable order
			throw new InternalError(InternalError.ILLEGAL_INNER_NODE);
		if ( high instanceof InnerNode &&
		     !variable.precedes(((InnerNode) high).variable))
			// the requested inner node would violate the variable order
			throw new InternalError(InternalError.ILLEGAL_INNER_NODE);
			
		if (low != high) {
			// the low and high successor are different so the node is
			// not redundant; first we create a test node in order to
			// check whether it is already in the hash table (see
			// methods hashCode and equals)
			InnerNode testnode = new InnerNode(variable, low, high);
			
			WeakReference n = (WeakReference) innerNodesTable.get(testnode);
			InnerNode  repr = null;
			if (n != null) repr= (InnerNode) n.get();
		                                          	
			if ( repr != null )
				// The node was in the hash table
				// already. Return that node.
				return repr;
			else {
				// otherwise store a weak reference to the testnode in the
				// hash table and return the testnode as a result; weak
				// references are used in order to allow inner nodes that are
				// not accessible from the application any more to be
				// reclaimed by the garbage collector in spite of being
				// referenced from this table.
				innerNodesTable.put(testnode,new WeakReference(testnode));
				return testnode;
			}
		} else
			// with low == high, the new InnerNode would be redundant.
			// Therefore,  we don't create it but return low (which is equal
			// to high) as the representative of this node.
			return low;
	}
	
	/**
	 * Returns the number of internal nodes currently in use. Due to the
	 * use of {@link java.util.WeakHashMap}, it
	 * returns an upper bound only.
	 * 
	 * @return number of inner nodes currently in use
	 */
	public int getSize() {
		return innerNodesTable.size();
	}		
											   
	/**
	 * Clears the hash tables of all operations in this context.
	 * This method can be called any time without compromising the correctness.
	 * But, calling it can significantly reduce the efficiency of subsequent
	 * applications of binary operations.  Note that applications could create
	 * their own binary operations. This method does NOT clear the hash tables
	 * of these binary operations.
	 * 
	 * @see    BinOp#clearHashtable()
	 */      	
	public void clearHashTables () {
		// this method could be invoked automatically when the runtime system
		// is about to run out of memory.  Currently, this is left up to the
		// application.
		and.clearHashtable();
		or.clearHashtable();
		xor.clearHashtable();
		equiv.clearHashtable();
		impl.clearHashtable();
		
		predecessorTable.clear();
		successorTable.clear();
	}
}

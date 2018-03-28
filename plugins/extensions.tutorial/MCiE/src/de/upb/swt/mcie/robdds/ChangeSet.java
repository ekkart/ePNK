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
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * This class represents a set of variables, which restrict the changed
 * variables in a transition relation.  This set can be used to calculate
 * the predecessors of a state more efficiently.  The hash table with
 * results of earlier results will be maintained with this set.
 *   
 * @author Ekkart Kindler, kindler@upb.de
 *
 */
public class ChangeSet {
	
	/**
	 * The set.
	 */
	@SuppressWarnings("rawtypes")
	private Set set = new HashSet();
	
	/**
	 * The context.
	 */
	Context context;
	
	/**
	 * Table of predecessors calculated for this ChangeSet.
	 */
	@SuppressWarnings("rawtypes")
	Map predecessorTable; 
	
	/**
	 * Table of successors calculated for this ChangeSet.
	 */
	@SuppressWarnings("rawtypes")
	Map successorTable; 


	/**
	 * Constructs an empty change set for a given context.
	 * 
	 * @param context   the context of the variables
	 */
	@SuppressWarnings("rawtypes")
	public ChangeSet(Context context) {
		predecessorTable = new HashMap();
		successorTable = new HashMap();
		this.context = context;
	}
		
	/**
	 * Constructs a set of variables in a given context. The
	 * variables are given as an array. All variables must be
	 * from the given context.
	 * 
	 * @param context   the context of the variables
	 * @param variables an array with all variables
	 * @throws IncorrectUseException if a variable is from a different
	 *                               context
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public ChangeSet(Context context, Variable[] variables)
	throws IncorrectUseException {
		predecessorTable = new HashMap();
		successorTable = new HashMap();
				
		this.context = context;
		
		for (int i=0; i < variables.length; i++) {
			if (variables[i] != null && variables[i].context == context) {
				set.add(variables[i]);
			} else {
				throw new IncorrectUseException(
				    IncorrectUseException.CONTEXT_MISMATCH);
			}
		}	
	}

	/**
	 * Adds a variable with the given name in the current context to the
	 * change set. If the variable does not exist in the given context,
	 * it will be created.
	 * 
	 * @param name
	 */
	@SuppressWarnings("unchecked")
	public void add(String name) {
		set.add(context.createVariable(name));
		
		// Whenever a variable is added, the hash table might become
		// invalid; so the hash table is cleared.
		clearHashTables();
	}	
	
	/**
	 * Checks whether the given variable is in this set.
	 * 
	 * @param v
	 * @return true, if the variable is in this set
	 */
	public boolean contains(Variable v) {
		return set.contains(v);
	}
	
	/**
	 * Clears the hash tables for the predecessor calculations with respect to
	 * this changeset.
	 * 
	 * This method can be called any time without compromising the correctness.
	 * But, calling it can significantly reduce the efficiency of subsequent
	 * applications of binary operations. 
	 */      	
	public void clearHashTables() {		
		predecessorTable.clear();
		successorTable.clear();
	}
}

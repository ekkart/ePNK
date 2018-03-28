/*
 *  This file is part of the Model Checking in Education (MCiE) project, which
 *  provides sample implementations for some model checking techniques. 
 *  Copyright (C) 2004 Ekkart Kindler, kindler@upb.de
 *  Copyright (C) 2010 Ekkart Kindler, eki@imm.dtu.dk
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
 * Abstract class for a model on which model checking should be performed.
 * When converting a temporal {@link de.upb.swt.mcie.formulas.Formula Formula} to
 * an ROBDD, it refers to the procedures of this class.
 * 
 * @author Ekkart Kindler, kindler@upb.de, eki@imm.dtu.dk
 * @see    de.upb.swt.mcie.formulas.Formula
 */
abstract public class Model {
	
	/**
	 * Indicates that the current model checking operation on this model
	 * should be aborted;
	 */
	private boolean abort;

	/**
	 * Must implement an operation that returns the
	 * {@link de.upb.swt.mcie.robdds.Context Context} associated with this
	 * model.
	 * 
	 * @return  the context
	 */
	abstract public Context getContext();

    /**
     * Must implement the EX operator for this particular model.
     * 
     * @param f a set of states represented as an ROBDD
     * @return  the set of predecessors of f in this model 
     */
	abstract public ROBDD ex(ROBDD f);

	/**
	 * Standard implementation of the operation E[ f1 U f2 ].  The
	 * implementation is based on the method ex that must be implemented
	 * for each subclass.
	 * 
	 * @param f1 the first argument for the operation represented as ROBDD
	 * @param f2 the second argument for the operation represented as ROBDD
	 * @return the states in which E[ f1 U f2 ] is valid represented as an ROBDD
	 */
	public ROBDD eu(ROBDD f1, ROBDD f2) {
		Context context = getContext();
		
		// Calculate the least fixed point of F(S) = f2 | ( f1 & EX S )
		// In order to save one iteration, we start iterating with f2
		// instead of false
		ROBDD s1;
		ROBDD s2 = f2;
		do {
			checkAborted();
			s1 = s2;
			s2 = context.or.apply(f2, context.and.apply(f1,ex(s1)));
		} while (s1 != s2);
		
		return s2;
	}    

	/**
	 * Standard implementation of the operation EG f.  The
	 * implementation is based on the method ex that must be implemented
	 * for each subclass.
	 * 
	 * @param f the argument for the operation represented as ROBDD
	 * @return the states in which EG f is valid represented as an ROBDD
	 */    
	public ROBDD eg(ROBDD f) {
		// This operation could be implemented using the operations
		// eg and eu.  But, it is more efficient calculating the
		// greatest fixed point of F(S) = f & EX S explicitly.
		
		Context context = getContext();
		ROBDD s1;
		ROBDD s2 = f;
		do {
			checkAborted();
			
			s1 = s2;
			s2 = context.and.apply(f, ex(s1));
		} while (s1 != s2);
		
		return s2;
	}

	/**
	 * Standard implementation of the operation E[ f1 R f2 ]. The
	 * implementation is based on the method ex that must be implemented
	 * for each subclass.
	 * 
	 * @param f1 the first argument for the operation represented as an ROBDD
	 * @param f2 the second argument for the operation represented as an ROBDD
	 * @return the states in which E[ f1 R f2 ] is valid represented as an ROBDD
	 */    
	public ROBDD er(ROBDD f1, ROBDD f2) {
		Context context = getContext();
		
		// Calculate the greatest fixed point of F(S) = f2 & ( f1 | EX S )
		// In order to save one iteration, we start with f instead
		// of true:
		ROBDD s1;
		ROBDD s2 = f2;
		do {
			checkAborted();
			
			s1 = s2;
			s2 = context.and.apply(f2, context.or.apply(f1,ex(s1)));
		} while (s1 != s2);
		
		return s2;
	}

    /**
     * If the model maintains hash tables, calling this method will clear
     * all hash tables (if possible). 
     */	
	public void clearHashTables() {
	}
 
 
	/**
	 * Sometimes model checking procedures are more efficient, when the
	 * reachable states of the model are calculated first and used in
	 * the model checking procedures. This mode can be invoked by this
	 * procedure (if implemented by the model). Note that this 
	 * method might not be implemented for some models; in this
	 * case, an {@link de.upb.swt.mcie.mc.IncorrectUseException
	 * IncorrectUseException} is thrown.
	 * 
	 * @return the set of reachable states of the model
	 */
	public ROBDD computeReachable() {
		throw new IncorrectUseException(IncorrectUseException.NOT_IMPLEMENTED);	
	};
	
	/**
	 * Checks whether  f is valid in the system. Typically, the
	 * initial states must be a subset of f. Note that this 
	 * method might not be implemented for some models; in this
	 * case, an {@link de.upb.swt.mcie.mc.IncorrectUseException
	 * IncorrectUseException} is thrown.
	 * 
	 * @param f a set represented as an ROBDD
	 * @return true, if f is valid for the system
	 */
	public boolean isValid(ROBDD f) {
		throw new IncorrectUseException(IncorrectUseException.NOT_IMPLEMENTED);	
	}
	
	/**
	 * Initiates abortion of the model checking operation on this model
	 */
	public void abort() {
		abort = true;
	}
	
	/**
	 * Checks whether the checking operations on this model was aborted. If it was,
	 * an AbortException is thrown. This method should be called in all longer running
	 * computations once in a while in subclasses of this class.
	 * 
	 * @throws AbortException
	 */
	final protected void checkAborted() throws AbortException {
		if (abort) {
			throw new AbortException();
		}
	}

}

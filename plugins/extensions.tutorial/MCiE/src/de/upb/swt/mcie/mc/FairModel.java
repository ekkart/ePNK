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
 * Implements a fair model based on some other model. It basically adds a set of
 * fairness conditions, which must be valid infinitely often on each fair path. The
 * model checking methods are implemented in such a way that only fair paths are
 * taken into account. Note that this works with any correct implementation of
 * {@link de.upb.swt.mcie.mc.Model Model}.<p>
 * 
 * The {@link de.upb.swt.mcie.parser.Parser Parser} provides a method
 * {@link de.upb.swt.mcie.parser.Parser#parseFairKripkestructure
 *   parseFairKripkestructure} for compiling a textual representation into a fair
 * Kripke structure and a method 
 * {@link de.upb.swt.mcie.parser.Parser#parseFairTransitionsystem
 *   parseFairTransitionsystem} for compiling a fair transition system.
 * 
 * @author Ekkart Kindler, kindler@upb.de
 * @see    de.upb.swt.mcie.parser.Parser Parser
 */
public class FairModel extends Model{
	
    /**
     * The underlying model (without fairness).
     */
    private Model model;
	
	/**
	 * An array of ROBDDs representing the fairness conditions.
	 */	
	private ROBDD[] fairness;
	
	/**
	 * The set of all states in which a fair path starts.
	 */	
	private ROBDD fair;
	
	/**
	 * Constructs an empty fair Model. All states are initial states,
	 * the transition relation is empty, and the set of all states is also
	 * the (only) fairness condition.
	 */
	public FairModel(Context context) {
		// Since Model is an abstract class, we use an empty Kripke
		// structure as underlying model, when no model is provided
		// in the constructor.
		this.model = new Kripkestructure(context);
		this.fairness  = new ROBDD[] { context.high };
		this.fair = eg(context.high);
	}
	
	/**
	 * Constructs a fair model from some model and from a set of
	 * fairness conditions. 
	 * 
	 * @param model    the underlying model
	 * @param fairness an array of fairness conditions
	 */
    public FairModel(Model model, ROBDD[] fairness) {
    	Context context = model.getContext();
		this.model = model;
		if (fairness != null && fairness.length != 0) {
			// In order to avoid accidental changes of the fairness
			// conditions, the elements of the array are copied separately
			// to a new array.
			this.fairness = new ROBDD[fairness.length];
			for (int i=0; i<fairness.length; i++) {
			  this.fairness[i] = fairness[i];
			}
		} else {
			// The trivial fairness condition
			this.fairness = new ROBDD[] { context.high };
		}
     	this.fair = eg(context.high);
    }

	/**
	 * Returns the context associated with this fair model structure.
	 * 
	 * @return the context
	 */
	public Context getContext() {
		return model.getContext();	
	}

	/**
	 * Implements the operation EG considering the fairness conditions.
	 * 
	 * @param f the argument for the operation represented as ROBDD
	 * @return the states in which EG f is valid represented as an ROBDD
	 */
	public ROBDD eg(ROBDD f) {
		Context context = getContext();		
		// Calculate the greatest fixed point of F(S) = f & EX ( f EU S & f1 ) &
		//                                                  EX ( f EU S & f2 ) &
		//                                                    ...
		//                                                  EX ( f EU S & fn )
		// where f1, f2, ..., fn are the fairness conditions
		ROBDD s1;
		ROBDD s2 = f;
		do {
			s1 = s2;
			s2 =  f;
			for (int i = 0; i < fairness.length; i++) {
				s2 = context.and.apply(
				         s2,
				         model.ex(model.eu(f,context.and.apply(s1,fairness[i]))));
			}
		
		} while (s1 != s2);
		
		return s2;
	}

	/**
	 * Implements the operation ER considering the fairness conditions.
	 * 
	 * @param f1 the first argument for the operation represented as ROBDD
	 * @param f2 the second argument for the operation represented as ROBDD
	 * @return the states in which f1 ER f1 is valid represented as an ROBDD
	 */
	public ROBDD er(ROBDD f1, ROBDD f2) {
		Context context = getContext();
		return context.or.apply(
		           eg(f2),
		           eu(f2,context.and.apply(f1,f2)));	
	}

	/**
	 * Implements the operation EU considering the fairness conditions.
	 * 
	 * @param f1 the first argument for the operation represented as ROBDD
	 * @param f2 the second argument for the operation represented as ROBDD
	 * @return the states in which f1 EU f1 is valid represented as an ROBDD
	 */
	public ROBDD eu(ROBDD f1, ROBDD f2) {
		return model.eu(f1,model.getContext().and.apply(f2,fair));	
	}
		
    /**
     * Implements the operation EX considering the fairness conditions.
     * 
     * @param f the argument for the operation represented as ROBDD
	 * @return the states in which EX f is valid represented as an ROBDD
     */
	public ROBDD ex(ROBDD f) {
		return model.ex(model.getContext().and.apply(f,fair));	
	}
		
	/**
	 * Computes the reachable states of the fair model.
	 * 
	 * @return the reachable states of the Kripke structure represented as an ROBDD
	 */
	public ROBDD reachable() {
		return model.getContext().and.apply(model.computeReachable(),fair);

	}
       
    /**
     * Checks whether all initial states are contained in the set f.
     * This formalizes the validity of a formula in a system.
     * 
     * @param f a set represented as an ROBDD
     * @return true, if the initial states are a subset of f
     */
    public boolean isValid(ROBDD f) {
		return model.isValid(f); 	
    }
    
    /**
     * Reduces the transition relation of the Kripke structure to the transitions
     * that are reachable from the initial state.  Sometimes this reduction
     * helps to significantly improve the performance of the model checking
     * algorithms.  On the other hand, calculating the reachable states may
     * be quite inefficient.  Whether this method should or should not be
     * applied prior to the invocation of the model checking procedures strongly
     * depends on the application. Typically, this will be decided by the user.
     */
    public ROBDD computeReachable() {
		return model.getContext().and.apply(model.computeReachable(),fair);
    }

	@Override
	public void abort() {
		if (model != null) {
			model.abort();
		}
	}
    
    
   
}

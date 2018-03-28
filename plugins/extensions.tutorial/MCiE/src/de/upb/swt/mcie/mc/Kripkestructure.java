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

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import de.upb.swt.mcie.formulas.Formula;
import de.upb.swt.mcie.parser.ParseException;
import de.upb.swt.mcie.parser.Parser;
import de.upb.swt.mcie.robdds.Context;
import de.upb.swt.mcie.robdds.ROBDD;

/**
 * Implements a Kripke structure. The Kripke structure consists of an
 * initial condition and a transition relation.<p>
 * 
 * The {@link de.upb.swt.mcie.parser.Parser Parser} provides a method
 * {@link de.upb.swt.mcie.parser.Parser#parseKripkestructure parseKripkestructure}
 * for compiling a textual representation into a Model.
 * 
 * @author Ekkart Kindler, kindler@upb.de
 * @see    de.upb.swt.mcie.parser.Parser Parser
 */
public class Kripkestructure extends Model{
	
	/**
	 * The context associated with this Kripkestructure.
	 */
	private Context   context;

    /**
     * The ROBDD representing the initial condition.
     */
    private ROBDD   init;
    
    /**
     * The ROBDD representing the transition relation.
     */
	private ROBDD   relation;
	
	/**
	 * If calculated already, this represents the reachable
	 * states of the Kripke structure.
	 */
	private ROBDD reachable;
	
	/**
	 * Constructs an empty Kripke structure. All states are initial states,
	 * the transition relation is empty.
	 */
	public Kripkestructure(Context context) {
		this.context   = context;
		this.init      = context.high;
		this.relation  = context.low;
		this.reachable = null;
	}
	
	/**
	 * Constructs a Kripke structure from the provided ROBDDs for the
	 * initial condition and the transition relation. 
	 * 
	 * @param init     the initial condition
	 * @param relation the transition relation
	 */
    public Kripkestructure(Context context, ROBDD init, ROBDD relation) {
		this.context  = context;    
        this.init     = init;
     	this.relation = relation;
    }

	/**
	 * Returns the context associated with this Kripke structure.
	 * 
	 * @return the context
	 */
	public Context getContext() {
		return context;	
	}
    /**
     * Implements the operation EX.
     * 
     * @param f the argument for the operation represented as ROBDD
	 * @return the states in which EX f is valid represented as an ROBDD
     */
	public ROBDD ex(ROBDD f) {
		return relation.predecessors(f);	
	}
		
	/**
	 * Computes the reachable states of the Kripke structure.
	 * 
	 * @return the reachable states of the Kripke structure represented as an ROBDD
	 */
	private ROBDD reachable() {
		if ( reachable != null )
		    return reachable;
		
		// Calculate the least fixed point of F(S) =  S | succ(S)
		// which contains init
		ROBDD s1;
		ROBDD s2 = init;
		do {
			s1 = s2;
			s2 = context.or.apply(s1, relation.successors(s1));
		} while (s1 != s2);
		
		reachable = s2;
		
		return s2;
	}
       
    /**
     * Checks whether all initial states are contained in the set f.
     * This formalizes the validity of a formula in a system.
     * 
     * @param f a set represented as an ROBDD
     * @return true, if the initial states are a subset of f
     */
    public boolean isValid(ROBDD f) {
		ROBDD robdd = context.impl.apply(init,f);
		return robdd.isValid(); 	
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
    	ROBDD reach = reachable(); 	
    	relation = context.and.apply(relation,reach);
    	return reach;
    }

	/** 
	 * The main method that is invoked when the model checker is started for
	 * fair Kripke structures. Upon start, the model checker expects two string
	 * arguments, which are two file names. The first name refers to the file
	 * with the fair Kripke structure, which must have the following form:<p>
	 * 
	 * ( &lt; state formula &gt; , &lt; transition formula &gt; ,
	 *   { &lt; state formula &gt; , ...  , &lt; state formula &gt; } )<p>
	 * 
	 * The first state formula represents the initial state, the transition
	 * formula represents the transition relation, the state formulas in
	 * braces represent the set of fairness conditions.<p>
	 * 
	 * The second name refers to a file with a comma separated list of
	 * formulas that are to be checked on the system.<p>
	 * 
	 * For each formula, it will be printed to the screen, whether it is
	 * valid in the system or not. Currently, there is no interaction
	 * between the user and the model checker.
	 */ 
	public static void main(String args[]) {
		Context context = new Context();
		FairModel structure = null;
		Formula[] formulas = null;
		
		if (args.length != 2 ) {
			System.out.println("Expecting two arguments. The first argument should refer");
			System.out.println("to a file with the Kripke structure, the second");
			System.out.println("argument should refer to a file with the properties!");
			return;
		}
		
		// Parse fair Kripke structure
		try {
			BufferedReader system = new BufferedReader( new FileReader((args[0])));
			structure = new Parser(system).parseFairKripkestructure(context);
			system.close();
			// In some cases, it might help to compute the reachable states
			// (and reduce the transition system) to this set. In others,
			// computing the reachable states is much to inefficient.
			structure.computeReachable();
		} catch(ParseException e) {
			System.out.println("ParseException in system: " + e.toString());
		} catch(IOException e) {
			System.out.println("Could not access file " + args[0] +".");
		}
					
		// Parse list of formulas
		try {
			BufferedReader properties = new BufferedReader( new FileReader((args[1])));
			// formulas = (new Parser(properties)).parseFormulaList();
			Parser parser = new Parser(properties);
			formulas = parser.parseFormulaList();
			// Check whether properties were fully parsed
			parser.parseEnd();
			properties.close();
		} catch(ParseException e) {
			System.out.println("ParseException in properties: " + e.toString());
		} catch(IOException e) {
			System.out.println("Could not access file " + args[1] +".");
		}

		if 	( structure != null && formulas != null ) {
			// If the Model and the list of formulas could
			// be properly parsed, check each property from the list
			// for the Kripke structure and print the result to the screen
			for (int i = 0; i < formulas.length; i++) {
				if ( structure.isValid(formulas[i].toROBDD(structure)) ) {
					System.out.println("Formula " + (i + 1) + " is valid.");
				} else {
					System.out.println("Formula " + (i + 1) + " is NOT valid.");
				}				
			}
		}
	}   
}

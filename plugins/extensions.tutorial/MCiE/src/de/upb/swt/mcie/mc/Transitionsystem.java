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
import de.upb.swt.mcie.robdds.ChangeSet;
import de.upb.swt.mcie.robdds.Context;
import de.upb.swt.mcie.robdds.ROBDD;


/**
 * Implements a transition system. A transition system consists of an
 * initial condition and a set of transitions (each of which is defined
 * by a transition relation). By exploiting
 * {@link de.upb.swt.mcie.robdds.ChangeSet ChangeSets}, this partitioning
 * of the transition relation significantly increases the efficiency of the
 * model checking procedures.<p>
 * 
 * The {@link de.upb.swt.mcie.parser.Parser Parser} provides a method
 * {@link de.upb.swt.mcie.parser.Parser#parseTransitionsystem parseTransitionsystem}
 * for compiling a textual representation into a transition system.
 * 
 * @author Ekkart Kindler, kindler@upb.de, eki@imm.dtu.dk
 * @see    de.upb.swt.mcie.parser.Parser Parser
 */
public class Transitionsystem extends Model {
	
	/**
	 * The context associated with this transition system.
	 */
	private Context   context;

    /**
     * The ROBDD representing the initial condition.
     */
    private ROBDD   init;
    
    /**
     * An array of ROBDDs representing the transitions.
     */
	private ROBDD[]   transitions;
	
	/**
	 * An array of ChangeSets representing those variables that
	 * may change in the corresponding transition.
	 */
	private ChangeSet[] changeSets;
	
	/**
	 * The reachable states of this transition system.
	 */	
	private ROBDD reachable;

	/**
	 * Constructs an empty transition structure. All states are initial states and
	 * there is a single empty transition.
	 */
	public Transitionsystem(Context context) {
		this.context   = context;
		this.init      = context.high;
		this.transitions  = new ROBDD[] { context.low };
		this.reachable = null;
	}
	
	/**
	 * Constructs a transition structure from the provided ROBDDs for the
	 * initial condition and an array of transition relation (along with the set
	 * of variables that may be change by a transition). 
	 * 
	 * @param init        the initial condition
	 * @param transitions an array of the transitions
	 * @param changeSets  an array representing
	 */
    public Transitionsystem(Context context, ROBDD init,
               ROBDD[] transitions, ChangeSet[] changeSets) {
		this.context     = context;    
        this.init        = init;
     	this.transitions = transitions;
     	this.changeSets  = changeSets;
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
		
		ROBDD result = context.low;
		
		for (int i=0; i < transitions.length; i++) {
			checkAborted();
			result = context.or.apply(result,
			    transitions[i].predecessors(f, changeSets[i]));
		}
		
		if (reachable != null) {
			result = context.and.apply(reachable,result);
		}
		
		return result;	
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
     * Returns the reachable states of the transition system.  The
     * computed reachable states can also be used for
     * the model checking operations.
     * 
     * @return the reachable states of the transition system
     */
    public ROBDD computeReachable() {
   	
    	if (reachable == null) {
    	    ROBDD reach = init;
    	    ROBDD prev  = context.low;
    	
    	    while (reach != prev) {
    		    prev = reach;
    		
    	        for (int i=0; i < transitions.length; i++) {
    	        	checkAborted();
    	    	    reach = context.or.apply(
    	    	               reach,
    	    	               transitions[i].successors(reach,changeSets[i]));
    	        }
    	    }
    	    this.reachable = reach;
    	}
    	
    	return this.reachable; 
    }

	/**
	 * Clears all hash tables associated with this model. In particular,
	 * it clears the hash tables of the context of this transition system
	 * and all changesets of the transitions. 
	 */	
	public void clearHashTables() {
		context.clearHashTables();
		
		for (int i=0; i < changeSets.length; i++) {
			if (changeSets[i] != null) {
				changeSets[i].clearHashTables();
			}
		}
	}
	
	
	/** 
	 * The main method that is invoked when the model checker is started for
	 * a fair transition systems. Upon start, the model checker expects two
	 * string arguments, which are two file names. The first name refers to
	 * the file with a fair transition system, which must have the following
	 * form: <p>
	 * 
	 * ( &lt; state formula &gt; ,
	 *   { &lt; transition formula &gt; , ... , &lt; transition formula &gt; } ,
	 *   { &lt; state formula &gt; , ...  , &lt; state formula &gt; } )<p>
	 * 
	 * The first state formula represents the initial state, the transition
	 * formulas in braces represent the transitions of the system, and
	 * the state formulas in braces represent the set of fairness conditions.<p>
	 * 
	 * The second name refers to a file with a comma separated list of
	 * temporal formulas that are to be checked on the system.<p>
	 * 
	 * For each formula, it will be printed to the screen, whether it is
	 * valid in the system or not. Currently, there is no interaction
	 * between the user and the model checker.
	 */   
	public static void main(String args[]) {
		Context context    = new Context();
		FairModel system  = null;
		Formula[] formulas = null;
		
		if (args.length != 2 ) {
			System.out.println("Expecting two arguments. The first argument should refer");
			System.out.println("to a file with the transition system, the second");
			System.out.println("argument should refer to a file with the properties!");
			return;
		}
		
		// Parse fair transition system
		try {
			BufferedReader reader = new BufferedReader( new FileReader((args[0])));
			system = new Parser(reader).parseFairTransitionsystem(context);
			reader.close();
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

		if 	( system != null && formulas != null ) {
			// If the Model and the list of formulas could
			// be properly parsed, check each property from the list
			// for the Kripke structure and print the result to the screen
			for (int i = 0; i < formulas.length; i++) {
				if ( system.isValid(formulas[i].toROBDD(system)) ) {
					System.out.println("Formula " + (i + 1) + " is valid.");
				} else {
					System.out.println("Formula " + (i + 1) + " is NOT valid.");
				}				
			}
		}
	}

}

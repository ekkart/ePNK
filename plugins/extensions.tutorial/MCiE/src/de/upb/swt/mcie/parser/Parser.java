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
package de.upb.swt.mcie.parser;

import java.io.IOException;
import java.io.Reader;
import java.util.Vector;

import de.upb.swt.mcie.formulas.BinaryOp;
import de.upb.swt.mcie.formulas.Constant;
import de.upb.swt.mcie.formulas.Formula;
import de.upb.swt.mcie.formulas.UnaryOp;
import de.upb.swt.mcie.formulas.Variable;
import de.upb.swt.mcie.mc.FairModel;
import de.upb.swt.mcie.mc.Kripkestructure;
import de.upb.swt.mcie.mc.Transitionsystem;
import de.upb.swt.mcie.parser.token.BinOp;
import de.upb.swt.mcie.parser.token.Brack;
import de.upb.swt.mcie.parser.token.Const;
import de.upb.swt.mcie.parser.token.End;
import de.upb.swt.mcie.parser.token.Id;
import de.upb.swt.mcie.parser.token.Prime;
import de.upb.swt.mcie.parser.token.Sep;
import de.upb.swt.mcie.parser.token.Token;
import de.upb.swt.mcie.parser.token.UnOp;
import de.upb.swt.mcie.robdds.ChangeSet;
import de.upb.swt.mcie.robdds.Context;
import de.upb.swt.mcie.robdds.ROBDD;

/**
 * This class implementing the parser.  Upon creation, the parser will
 * be provided with a {@link java.io.Reader Reader} with the text to be parsed.
 * Then, the class provides different parse operations to convert this
 * text to a formula, to a list of formulas, or to a Kripke structrue.<p>
 * 
 * Note that the parser does not work directly on the reader. It instantiates
 * a {@link de.upb.swt.mcie.parser.Scanner Scanner} on the reader, and  then works on
 * the tokens produced by the this scanner.
 * 
 * @author Ekkart Kindler, kindler@upb.de
 * @see de.upb.swt.mcie.parser.Scanner
 */
public class Parser {
	
	/**
	 * The corresponding scanner.
	 */
	private Scanner scanner;
	
	/**
	 * Constructs a new parser for the {@link java.io.Reader Reader}. In
	 * particular, it instantiates a scanner with this {@link java.io.Reader Reader}.
	 *  
	 * @param reader the {@link java.io.Reader Reader} with the text to be parsed
	 * @throws IOException if an IO problem occurs
	 * @see de.upb.swt.mcie.parser.Scanner
	 */
	public Parser(Reader reader) throws IOException {
		scanner = new Scanner(reader);
	}

	/** 
	 * Checks whether the end of the parser's input is reached. If the end is not
	 * reached a {@link ParseException} is thrown. This method does not return
	 * any result.
	 * 
	 * @throws ParseException if there is any input left
	 * @throws IOException if an IO problem occurs
	 */
	public void parseEnd() throws IOException, ParseException {
		Token token = scanner.getNextToken();	
		if ( token instanceof End)
			return;
		else
			throw new ParseException(token);
	}
	
	/** 
	 * Parses the remaining part of the text in the {@link java.io.Reader Reader}.
	 * If the remaining part is a formula, this formula is returned. If the reader
	 * has not reached its end after completely parsing the formula, a
	 * {@link ParseException} is thrown.
	 * 
	 * @return the internal representation of the parsed formula
	 * @throws ParseException if the remaining text is not a formula
	 * @throws IOException if an IO problem occurs
	 */
	public Formula parseToEnd() throws IOException, ParseException {
		Formula formula = parse();
		Token token = scanner.getNextToken();
		
		if ( token instanceof End)
			return formula;
		else
			throw new ParseException(token);
	}
	
	/**
	 * Parses the reader starting from the current position. If
	 * there are characters left after completely parsing a formula,
	 * this is not considered as a parse error. Subsequent parse operations
	 * will start from this position. This way, this method can
	 * be used for parsing a sequence of formulas.
	 * 
	 * @return the internal representation of the parsed formula
	 * @throws ParseException if the character sequence does not start with 
	 *         a formula
	 * @throws IOException if an IO problem occurs
	 */
	public Formula parse() throws IOException, ParseException {
		// Starts the internal recursive decent parse method with
		// the highest binding level (which corresponds to the lowest
		// binding priority.
		return parse(Math.max(UnaryOp.MAXBINDING,BinaryOp.MAXBINDING));
	}
	
	/**
	 * The internal recursive decent parse method. The bindlevel indicates
	 * which binary and unary operations are considered at this level. This
	 * way operators, with the lowest binding level have highest binding priority.
	 * 
	 * @param bindlevel       defines the bind level of operators to be considered 
	 * @return                the formula parsed on this bindlevel
	 * @throws ParseException if a parse error is encountered
	 * @throws IOException if an IO problem occurs
	 */
	private Formula parse(int bindlevel) throws IOException, ParseException {
		// a negative bind level indicates that there must be
		// an atomic proposition.
		if (bindlevel < 0)
		   return parseAtoms();
		   
		Formula result = null;
		Formula nextformula = null;    
		BinOp binop = null;
			
	    // parse a sequence of formulas that are separated by
	    // a binary operation with the current bind level and construct
	    // a left associated tree for this sequence 	   			    		   
		do {
			Token token = scanner.getNextToken();
			
        	if (token instanceof UnOp) {
         		UnOp unop = (UnOp) token;
        	    if        (unop.binding() == bindlevel) {
        	    	// if a unary operation on the current bind level
        	    	// was encountered, parse this formula 
					nextformula = new UnaryOp(unop.getOp(),parse(bindlevel));
        	    } else if (unop.binding() < bindlevel) {
        	    	// if a unary operation on a lower bind level
        	    	// was encountered, return the token and start
        	    	// parsing the formula on the next bind level
					scanner.revert();
					nextformula = parse(bindlevel - 1);
        	    } else {
        	    	// if a unary operation on a higher bind level
        	    	// is encountered, return the token and start
        	    	// parsing the formula on that bind level.
        	    	scanner.revert();
        	        nextformula = parse(unop.binding());
        	    }
        	}
        	else {
        		// if the token is no unary operation, invoke the
        		// parse procedure on the next bind level
        		scanner.revert();
        	    nextformula = parse(bindlevel - 1);	    
        	}
        	
        	if (binop == null)
        	    // if the parsed formula was the first of the sequence
        	    // on this bind level; the current result is the
        	    // formula itself
        		result = nextformula;
            else
                // other wise it is appended to the already constructed
                // tree that represents the sequence of formulas
                result = new BinaryOp(binop.getOp(),result,nextformula);
                
            token = scanner.getNextToken();
            
            if (token instanceof BinOp) {
            	binop = (BinOp) token;
            	if (binop.binding() > bindlevel) {
            		// if a binary operation on a higher bind level
            		// was encountered, return the token and stop
            		// parsing on this level
                    binop = null;
                    scanner.revert();
                } else if (binop.binding() < bindlevel) {
                    // if a binary operation on a lower bind level
                    // encountered, there is something wrong; stop
                    // parsing at this position
                	binop = null;
                	scanner.revert();
                	result = null;
                	throw new ParseException(binop);
                }
            } else {
            	// if some other token is encountered, return
            	// the token and stop parsing on this level
            	scanner.revert();
            	binop = null;
            }        
        } while (binop != null);
		
		return result;
	}
	
	/**
	 * Parses the atoms of a formula. An atom is either a variable resp. an
	 * identifier, a constant, or a formula in parenthesis.
	 * 
	 * @return the internal representation of the atom
	 * @throws ParseException if a parse error occurs
	 * @throws IOException if an IO problem occurs
	 */
	private Formula parseAtoms() throws IOException, ParseException {
		Token token = scanner.getNextToken();
		Formula formula = null;
		
		if        (token instanceof Id) {
            // if an identifier was encountered, store the name
			String name = ((Id) token).getName();
			boolean primed = false;
			
			// and check whether a prime symbol follows
			if (scanner.getNextToken() instanceof Prime) {
			    primed = true;
			} else {
                scanner.revert();
			}
			// the create the corresponding Variable
            formula = new Variable(name,primed);            				
		} else if (token instanceof Const) {
			// if a constant was encountered, create the corresponding
			// constant
			formula = new Constant(((Const) token).getValue());
		} else if (token instanceof Brack && ((Brack) token).getType() == Brack.OPEN) {
			// if an opening bracket was encountered,
			// recursively parses the part within brackets on the highest
			// bind level, then check for a corresponding closing bracket
			formula = parse();
			Token token2 = scanner.getNextToken();
			if (! (token2 instanceof Brack) ||
			    ((Brack) token2).getType() != Brack.CLOSE ||
			    ((Brack) token2).getVersion() != ((Brack) token).getVersion() ) {
			    	// if there is no matching closing bracket, throw an
			    	// exception (see below)
			    	formula = null;
			    	token = token2;
			}
		}
		
		if (formula != null)
		  return formula;
		else
		  throw new ParseException(token);

	}
	
	/**
	 * Parses and returns a list of formulas. The formulas must be
	 * separated by a separator {@link de.upb.swt.mcie.parser.token.Sep}.
	 * If the list ends with a token other than a separator, the
	 * parser returns the list of formulas parsed up to that point,
	 * leaving the rest of the sequence untouched. This way, it is
	 * possible to parse the remaining part of the input with a different
	 * method.
	 * 
	 * @return an array of formulas 
	 * @throws ParseException if the character sequence does not
	 *         start with list of formulas
	 * @throws IOException if an IO problem occurs
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Formula[] parseFormulaList() throws IOException, ParseException {
		Vector vector = new Vector ();
		Token  token;
		
		// parses a list of formulas, which are separated by a separator
		// token and add them to the vector
		do {
			vector.add(parse());
			token = scanner.getNextToken();			
		} while (token instanceof Sep);
		
		// return the token since it does not belong to the list
		scanner.revert();
		
		// convert the vector to an array
		Formula[] result = new Formula[vector.size()];
		for (int i = 0; i < result.length; i++) {
			result[i] = (Formula) vector.get(i);
		}
		return result;
	}
	
	/**
	 * Parses a Kripke structure and returns it as result. A Kripke
	 * structure must have the following form:<p>
	 * 
	 * ( &lt; state formula &gt; , &lt; transition formula &gt; )<p>
	 * 
	 * The first state formula represents the initial state and the transition
	 * formula represents the transition relation.
	 * 
	 * @param  context        the context for the Kripke structure
	 * @return                the parsed Kripke structure
	 * @throws IOException    if an IO problem occurs
	 * @throws ParseException if a parse error occurs
	 */
	public Kripkestructure parseKripkestructure(Context context) throws IOException, ParseException {		
        // check for opening parenthesis     
		Token token = scanner.getNextToken();
		if ( token instanceof Brack ) {
			Brack bracket = (Brack) token;
			if ( bracket.getType() != Brack.OPEN &&
			     bracket.getVersion() != Brack.NORMAL )
			     throw new ParseException(token);
		} else
			throw new ParseException(token);
		
		// parse initial condition and convert it to an ROBDD
		Formula initformula = parse();
		if ( ! initformula.isStateFormula() )
		    // TODO the ParseException refers to the first parenthesis;
		    //      here, we need a more meaningful Exception
		    throw new ParseException(token);
		ROBDD init = initformula.toROBDD(context);		
				
		// check for comma
		token = scanner.getNextToken();
		if ( token instanceof Sep ) {
			Sep sep = (Sep) token;
			if ( sep.getType() != Sep.COMMA  )
				 throw new ParseException(token);
		} else
		    throw new ParseException(token);
		    
		// parse transition formula and convert it to an ROBDD
		Formula transformula = parse();
		if ( ! initformula.isStepFormula() )
			// TODO the ParseException refers to the first comma;
			//      here, we need a more meaningful Exception
			throw new ParseException(token);
		ROBDD trans = transformula.toROBDD(context);
		
		// check for closing parenthesis
		token = scanner.getNextToken();
		if ( token instanceof Brack ) {
			Brack bracket = (Brack) token;
			if ( bracket.getType() != Brack.CLOSE &&
				 bracket.getVersion() != Brack.NORMAL )
				 throw new ParseException(token);
		} else
			throw new ParseException(token);
		
		// check if the end of the input is reached
		token = scanner.getNextToken();
		if ( !(token instanceof End) ) {
			throw new ParseException(token);
		}		
		
		// construct and return the Model from the
		// parsed formulas
		return new Kripkestructure(context,init,trans);						
	}

	/**
	 * Parses a fair Kripke structure and returns it as result. A fair Kripke
	 * structure must have the following form:<p>
	 * 
	 * ( &lt; state formula &gt; , &lt; transition formula &gt; ,
	 *   { &lt; state formula &gt; , ...  , &lt; state formula &gt; } )<p>
	 * 
	 * The first state formula represents the initial state, the transition
	 * formula represents the transition relation, the state formulas in
	 * braces represent the set of fairness conditions.
	 * 
	 * @param  context        the context for the Kripke structure
	 * @return                the parsed Kripke structure
	 * @throws IOException    if an IO problem occurs
	 * @throws ParseException if a parse error occurs
	 */
	public FairModel parseFairKripkestructure(Context context)
	    throws IOException, ParseException {		
		// check for opening parenthesis     
		Token token = scanner.getNextToken();
		if ( token instanceof Brack ) {
			Brack bracket = (Brack) token;
			if ( bracket.getType() != Brack.OPEN &&
				 bracket.getVersion() != Brack.NORMAL )
				 throw new ParseException(token);
		} else
			throw new ParseException(token);
		
		// parse initial condition and convert it to an ROBDD
		Formula initformula = parse();
		if ( ! initformula.isStateFormula() )
			// TODO the ParseException refers to the first parenthesis;
			//      here, we need a more meaningful Exception
			throw new ParseException(token);
		ROBDD init = initformula.toROBDD(context);		
				
		// check for comma
		token = scanner.getNextToken();
		if ( token instanceof Sep ) {
			Sep sep = (Sep) token;
			if ( sep.getType() != Sep.COMMA  )
				 throw new ParseException(token);
		} else
			throw new ParseException(token);
		    
		// parse transition formula and convert it to an ROBDD
		Formula transformula = parse();
		if ( ! initformula.isStepFormula() )
			// TODO the ParseException refers to the first comma;
			//      here, we need a more meaningful Exception
			throw new ParseException(token);
		ROBDD trans = transformula.toROBDD(context);

		// check for comma
		token = scanner.getNextToken();
		if ( token instanceof Sep ) {
			Sep sep = (Sep) token;
			if ( sep.getType() != Sep.COMMA  )
				 throw new ParseException(token);
		} else
			throw new ParseException(token);
		
		// check for opening brace
		token = scanner.getNextToken();
		if ( token instanceof Brack ) {
			Brack bracket = (Brack) token;
			if ( bracket.getType() != Brack.OPEN &&
				 bracket.getVersion() != Brack.BRACE )
				 throw new ParseException(token);
		} else
			throw new ParseException(token);
		
		// parse list of state formulas and convert this list
		// to ROBDDs
		Formula[] fairnessformulas = parseFormulaList();
		ROBDD[] fairness = new ROBDD[fairnessformulas.length];
		for (int i = 0; i < fairnessformulas.length; i++) {
			if (! fairnessformulas[i].isStateFormula())
				// TODO the ParseException refers to the first brace;
				//      here, we need a more meaningful Exception
				throw new ParseException(token);
			fairness[i] =  fairnessformulas[i].toROBDD(context);
		}
		
		// check for closing brace
		token = scanner.getNextToken();
		if ( token instanceof Brack ) {
			Brack bracket = (Brack) token;
			if ( bracket.getType() != Brack.CLOSE &&
				 bracket.getVersion() != Brack.BRACE )
				 throw new ParseException(token);
		} else
			throw new ParseException(token);
		
		// check for closing parenthesis
		token = scanner.getNextToken();
		if ( token instanceof Brack ) {
			Brack bracket = (Brack) token;
			if ( bracket.getType() != Brack.CLOSE &&
				 bracket.getVersion() != Brack.NORMAL )
				 throw new ParseException(token);
		} else
			throw new ParseException(token);
		
		// check if the end of the input is reached
		token = scanner.getNextToken();
		if ( !(token instanceof End) ) {
			throw new ParseException(token);
		}		
		
		// construct and return the Model from the
		// parsed formulas
		Kripkestructure structure = new Kripkestructure(context,init,trans);
		return new FairModel(structure,fairness);						
	}

	/**
	 * Parses a transition system and returns it as result. A transition
	 * system must have the following form:<p>
	 * 
	 * ( &lt; state formula &gt; ,
	 *   { &lt; transition formula &gt; , ... , &lt; transition formula &gt; }
	 *  )<p>
	 * 
	 * The first state formula represents the initial state and the transition
	 * formulas in braces represent the transitions.
	 * 
	 * Note that a transition does only change those variables that do
	 * occur primed in the transition. All other variables will not be changed
	 * by this particular transition.
	 * 
	 * @param  context        the context for the transition system
	 * @return                the parsed transition structure
	 * @throws IOException    if an IO problem occurs
	 * @throws ParseException if a parse error occurs
	 */
	public Transitionsystem parseTransitionsystem(Context context) throws IOException, ParseException {		
		// check for opening parenthesis     
		Token token = scanner.getNextToken();
		if ( token instanceof Brack ) {
			Brack bracket = (Brack) token;
			if ( bracket.getType() != Brack.OPEN &&
				 bracket.getVersion() != Brack.NORMAL )
				 throw new ParseException(token);
		} else
			throw new ParseException(token);
		
		// parse initial condition and convert it to an ROBDD
		Formula initformula = parse();
		if ( ! initformula.isStateFormula() )
			// TODO the ParseException refers to the first parenthesis;
			//      here, we need a more meaningful Exception
			throw new ParseException(token);
		ROBDD init = initformula.toROBDD(context);		
				
		// check for comma
		token = scanner.getNextToken();
		if ( token instanceof Sep ) {
			Sep sep = (Sep) token;
			if ( sep.getType() != Sep.COMMA  )
				 throw new ParseException(token);
		} else
			throw new ParseException(token);
			
		// check for opening brace
		token = scanner.getNextToken();
		if ( token instanceof Brack ) {
			Brack bracket = (Brack) token;
			if ( bracket.getType() != Brack.OPEN &&
				 bracket.getVersion() != Brack.BRACE )
				 throw new ParseException(token);
		} else
			throw new ParseException(token);			

		// parse list of transition formulas and convert this list
		// to ROBDDs
		Formula[] transitionformulas = parseFormulaList();
		ROBDD[] transitions = new ROBDD[transitionformulas.length];
		ChangeSet[] changesets = new ChangeSet[transitionformulas.length];
		for (int i = 0; i < transitionformulas.length; i++) {
			if (! transitionformulas[i].isStateFormula())
				// TODO the ParseException refers to the first brace;
				//      here, we need a more meaningful Exception
				throw new ParseException(token);
			transitions[i] =  transitionformulas[i].toROBDD(context);
			changesets[i] = new ChangeSet(context);
			transitionformulas[i].addChangedVariables(changesets[i]);
		}
		
		// check for closing brace
		token = scanner.getNextToken();
		if ( token instanceof Brack ) {
			Brack bracket = (Brack) token;
			if ( bracket.getType() != Brack.CLOSE &&
				 bracket.getVersion() != Brack.BRACE )
				 throw new ParseException(token);
		} else
			throw new ParseException(token);
			
		// check for closing parenthesis
		token = scanner.getNextToken();
		if ( token instanceof Brack ) {
			Brack bracket = (Brack) token;
			if ( bracket.getType() != Brack.CLOSE &&
				 bracket.getVersion() != Brack.NORMAL )
				 throw new ParseException(token);
		} else
			throw new ParseException(token);
		
		// check if the end of the input is reached
		token = scanner.getNextToken();
		if ( !(token instanceof End) ) {
			throw new ParseException(token);
		}		
		
		// construct and return the Model from the
		// parsed formulas
		return new Transitionsystem(context,init,transitions,changesets);						
	}	

	/**
	 * Parses a fair transition system and returns it as result. A transition
	 * system must have the following form:<p>
	 * 
	 * ( &lt; state formula &gt; ,
	 *   { &lt; transition formula &gt; , ... , &lt; transition formula &gt; } ,
	 *   { &lt; state formula &gt; , ...  , &lt; state formula &gt; } )<p>
	 * 
	 * The first state formula represents the initial state, the transition
	 * formulas in braces represent the transitions, the state formulas in
	 * braces represent the set of fairness conditions.
	 * 
	 * Note that a transition does only change those variables that do
	 * occur primed in the transition. All other variables will not be changed
	 * by this particular transition.
	 * 
	 * @param  context        the context for the fair transition system
	 * @return                the parsed fair transition system
	 * @throws IOException    if an IO problem occurs
	 * @throws ParseException if a parse error occurs
	 */
	public FairModel parseFairTransitionsystem(Context context)
	    throws IOException, ParseException {		
		// check for opening parenthesis     
		Token token = scanner.getNextToken();
		if ( token instanceof Brack ) {
			Brack bracket = (Brack) token;
			if ( bracket.getType() != Brack.OPEN &&
				 bracket.getVersion() != Brack.NORMAL )
				 throw new ParseException(token);
		} else
			throw new ParseException(token);
		
		// parse initial condition and convert it to an ROBDD
		Formula initformula = parse();
		if ( ! initformula.isStateFormula() )
			// TODO the ParseException refers to the first parenthesis;
			//      here, we need a more meaningful Exception
			throw new ParseException(token);
		ROBDD init = initformula.toROBDD(context);		
				
		// check for comma
		token = scanner.getNextToken();
		if ( token instanceof Sep ) {
			Sep sep = (Sep) token;
			if ( sep.getType() != Sep.COMMA  )
				 throw new ParseException(token);
		} else
			throw new ParseException(token);
			
		// check for opening brace
		token = scanner.getNextToken();
		if ( token instanceof Brack ) {
			Brack bracket = (Brack) token;
			if ( bracket.getType() != Brack.OPEN &&
				 bracket.getVersion() != Brack.BRACE )
				 throw new ParseException(token);
		} else
			throw new ParseException(token);			

		// parse list of transition formulas and convert this list
		// to ROBDDs
		Formula[] transitionformulas = parseFormulaList();
		ROBDD[] transitions = new ROBDD[transitionformulas.length];
		ChangeSet[] changesets = new ChangeSet[transitionformulas.length];
		for (int i = 0; i < transitionformulas.length; i++) {
			if (! transitionformulas[i].isStateFormula())
				// TODO the ParseException refers to the first brace;
				//      here, we need a more meaningful Exception
				throw new ParseException(token);
			transitions[i] =  transitionformulas[i].toROBDD(context);
			changesets[i] = new ChangeSet(context);
			transitionformulas[i].addChangedVariables(changesets[i]);
		}
		
		// check for closing brace
		token = scanner.getNextToken();
		if ( token instanceof Brack ) {
			Brack bracket = (Brack) token;
			if ( bracket.getType() != Brack.CLOSE &&
				 bracket.getVersion() != Brack.BRACE )
				 throw new ParseException(token);
		} else
			throw new ParseException(token);

	    Transitionsystem system =
	        new Transitionsystem(context,init,transitions,changesets);
	    
		// check for comma
		token = scanner.getNextToken();
		if ( token instanceof Sep ) {
			Sep sep = (Sep) token;
			if ( sep.getType() != Sep.COMMA  )
				 throw new ParseException(token);
		} else
			throw new ParseException(token);
		
		// check for opening brace
		token = scanner.getNextToken();
		if ( token instanceof Brack ) {
			Brack bracket = (Brack) token;
			if ( bracket.getType() != Brack.OPEN &&
				 bracket.getVersion() != Brack.BRACE )
				 throw new ParseException(token);
		} else
			throw new ParseException(token);
		
		// parse list of state formulas and convert this list
		// to ROBDDs
		Formula[] fairnessformulas = parseFormulaList();
		ROBDD[] fairness = new ROBDD[fairnessformulas.length];
		for (int i = 0; i < fairnessformulas.length; i++) {
			if (! fairnessformulas[i].isStateFormula())
				// TODO the ParseException refers to the first brace;
				//      here, we need a more meaningful Exception
				throw new ParseException(token);
			fairness[i] =  fairnessformulas[i].toROBDD(context);
		}
		
		// check for closing brace
		token = scanner.getNextToken();
		if ( token instanceof Brack ) {
			Brack bracket = (Brack) token;
			if ( bracket.getType() != Brack.CLOSE &&
				 bracket.getVersion() != Brack.BRACE )
				 throw new ParseException(token);
		} else
			throw new ParseException(token);
		
		// check for closing parenthesis
		token = scanner.getNextToken();
		if ( token instanceof Brack ) {
			Brack bracket = (Brack) token;
			if ( bracket.getType() != Brack.CLOSE &&
				 bracket.getVersion() != Brack.NORMAL )
				 throw new ParseException(token);
		} else
			throw new ParseException(token);
		
		// check if the end of the input is reached
		token = scanner.getNextToken();
		if ( !(token instanceof End) ) {
			throw new ParseException(token);
		}		
		
		// construct and return the Model from the
		// parsed formulas
		return new FairModel(system,fairness);						
	}	
}

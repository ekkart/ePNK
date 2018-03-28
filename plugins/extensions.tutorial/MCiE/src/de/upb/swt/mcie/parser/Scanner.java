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
import java.util.regex.Pattern;

import de.upb.swt.mcie.formulas.BinaryOp;
import de.upb.swt.mcie.formulas.UnaryOp;
import de.upb.swt.mcie.parser.token.BinOp;
import de.upb.swt.mcie.parser.token.Brack;
import de.upb.swt.mcie.parser.token.Const;
import de.upb.swt.mcie.parser.token.End;
import de.upb.swt.mcie.parser.token.Id;
import de.upb.swt.mcie.parser.token.Inval;
import de.upb.swt.mcie.parser.token.Prime;
import de.upb.swt.mcie.parser.token.Sep;
import de.upb.swt.mcie.parser.token.Token;
import de.upb.swt.mcie.parser.token.UnOp;

/**
 * This class implements the scanner.  The patterns for the different
 * tokens are partly defined as regular expressions in order to make
 * changes as easy as possible.  Only tokens consisting of characters
 * that are no letters or digits are explicitly checked in the code.<p>
 * 
 * The symbol # indicates a line comment, which extends to the end of
 * this line. The text starting at # up to the end of the line will be
 * ignored by the scanner.
 * 
 * @author Ekkart Kindler, kindler@upb.de
 */
public class Scanner {


    /**
     * Defines the character that is used for separating lines. This
     * character could be read from the system properties.  But '\n' works
     * fine for Windows, Unix and Linux (there might be problems with
     * older MAC OS versions).
     * 
     * TODO read the line separator from the system properties.
     */
    private static final char LINE_SEPARATOR ='\n';
    
	/**
	 * The {@link java.util.regex.Pattern Pattern} for the NOT operation.
	 * Note that this defines the pattern for the textual representation
	 * of the not operation only. In addition the scanner accepts ! as
	 * the symbol for not.
	 */
	private static final Pattern NOT = Pattern.compile("not");
	
	/**
	 * The {@link java.util.regex.Pattern Pattern} for the AND operation.
	 * Note that this defines the pattern for the textual representation
	 * of the and operation only. In addition the scanner accepts & as
	 * the symbol for and.
	 */
	private static final Pattern AND = Pattern.compile("and");
	
	/**
	 * The {@link java.util.regex.Pattern Pattern} for the OR operation.
	 * Note that this defines the pattern for the textual representation
	 * of the or operation only. In addition the scanner accepts | as
	 * the symbol for or.
	 */
	private static final Pattern OR = Pattern.compile("or");
	
    /**
     * The {@link java.util.regex.Pattern Pattern} for the EX operator.
     */
	private static final Pattern EX = Pattern.compile("EX");

	/**
	 * The {@link java.util.regex.Pattern Pattern} for the AX operator.
	 */
	private static final Pattern AX = Pattern.compile("AX");
	
	/**
	 * The {@link java.util.regex.Pattern Pattern} for the EG operator.
	 */
	private static final Pattern EG = Pattern.compile("EG");

	/**
	 * The {@link java.util.regex.Pattern Pattern} for the AG operator.
	 */
	private static final Pattern AG = Pattern.compile("AG");
	
	/**
	 * The {@link java.util.regex.Pattern Pattern} for the EF operator.
	 */
	private static final Pattern EF = Pattern.compile("EF");

	/**
	 * The {@link java.util.regex.Pattern Pattern} for the AF operator.
	 */
	private static final Pattern AF = Pattern.compile("AF");

	/**
	 * The {@link java.util.regex.Pattern Pattern} for the EU operator.
	 */
	private static final Pattern EU = Pattern.compile("EU");

	/**
	 * The {@link java.util.regex.Pattern Pattern} for the AU operator.
	 */
	private static final Pattern AU = Pattern.compile("AU");

	/**
	 * The {@link java.util.regex.Pattern Pattern} for the ER operator.
	 */
	private static final Pattern ER = Pattern.compile("ER");

	/**
	 * The {@link java.util.regex.Pattern Pattern} for the AR operator.
	 */
	private static final Pattern AR = Pattern.compile("AR");

	/**
	 * The {@link java.util.regex.Pattern Pattern} for the constant true.
	 */
	private static final Pattern TRUE = Pattern.compile("true|1");

	/**
	 * The {@link java.util.regex.Pattern Pattern} for the constant false.
	 */
	private static final Pattern FALSE = Pattern.compile("false|0");

    /**
     * The reader with the text on which the scanner works.
     */
	private Reader reader;

    /**
     * The character at the current position in the reader.
     */
	private char currentChar;

    /**
     * The line number of the current position in the reader. 
     */
	private int line;
	
	/**
	 * The column number of the current position in the reader.
	 */
	private int column;
	
	/**
	 * The previous token.  Storing this token is necessary to implement
	 * a one token look ahead.
	 */
	private Token previous;

	/**
	 * The current token.
	 */
	private Token current;


    /**
     * Constructs a scanner for the given {@link java.io.Reader Reader}.
     * 
     * @param  reader the reader with the text to be scanned
     * @throws IOException if an IO problem occurs
     */
	public Scanner(Reader reader) throws IOException {
		this.reader  = reader;
		this.line    = 1;
		this.column  = 0;
		
		this.currentChar = getNextChar();
		this.previous    = null;
		this.current     = null;
	}

    /**
     * Returns the next character of the character sequence and increments
     * the position.  If the end of the text is reached, it
     * returns {@link java.lang.Character#MIN_VALUE}.
     * 
     * @return the next character
     * @throws IOException if an IO problem occurs
     */
	private char getNextChar() throws IOException {
		int next = reader.read();
		if ( next >= 0 ) {
			// convert the int value to a character
			currentChar = (char) next;
			// do the line and column calculation
			if (currentChar == LINE_SEPARATOR) {
				line = line + 1;
				column = 0;
			} else
				column = column + 1;
		} else 
			currentChar = Character.MIN_VALUE;
				
		return currentChar;
	}

	/**
	 * Returns the first character of the text in the reader that is
	 * not a white space.  If there is a non white space character
	 * at the current position, this character is returned without
	 * advancing the position. If the end of the text is reached,
	 * it returns {@link java.lang.Character#MIN_VALUE}.
	 * 
	 * @return the first non white space character, starting from the
	 *         current position
     * @throws IOException if an IO problem occurs
	 */
	private char getNextTrueChar() throws IOException {
		while ( currentChar != Character.MIN_VALUE &&
		        Character.isWhitespace(currentChar)) {
			currentChar = getNextChar();
		}

		return currentChar;
	}

    /**
     * Moves on to the next non-white space character after a line comment.
     * If there is no such character, because the end of the buffer is
     * reached, the method returns {@link java.lang.Character#MIN_VALUE}.
     * 
     * @return next non-white space character after a line comment
     * @throws IOException if an IO problem occurs
     */
    private char skipLineComment() throws IOException {
    	char c;
    	
    	// skip all characters until the end of the line is reached
    	do  {
    		c = getNextChar();
    	} while ( c != LINE_SEPARATOR && c != Character.MIN_VALUE );
    	
    	// return the next non-white space character
    	return getNextTrueChar();
    }
    
    /**
     * Reverts to the previously read token. Note that calling
     * this method has an effect only once.  The scanner can not
     * revert by several steps (the scanner has look-ahead one only).
     */
    public void revert() {
    	if (previous != null) {
    		current = previous;
    		previous = null;
    	}
    }

    /**
     * Returns the next token.
     * 
     * @return the next token
     * @throws IOException if an IO problem occurs
     */
	public Token getNextToken() throws IOException {
		// if the revert method was called before, the current
		// token is the one to be returned.
		if (current != null) {
			previous = current;
			current  = null;
		    return previous;	
		}
		
        // check for comment symbol and advance to the next
        // true character that is not a comment
		char c = getNextTrueChar();
		while (c == '#') {
			c = skipLineComment();	
		}

        // instantiate invalid token and store the
        // current position (for references)
		Token token = new Inval();		
		String readString = "";
		int tokenline = line;
		int tokencolumn = column;
		
		// check for end of file
		if (c == Character.MIN_VALUE) {
			token = new End();
			token.setReference("<EOF>", tokenline,tokencolumn);
			previous = token;
			return token;
		}

        // read sequence of letters and digits
		while (Character.isLetterOrDigit(c)) {
			readString = readString + c;
			c = getNextChar();
		}

        // check whether this sequence matches one of
        // the following patterns
		if      (NOT.matcher(readString).matches())
			token = new UnOp(UnaryOp.NOT);
		else if (AND.matcher(readString).matches())
			token = new BinOp(BinaryOp.AND);
		else if (OR.matcher(readString).matches())
			token = new BinOp(BinaryOp.OR);
		else if (EX.matcher(readString).matches())
			token = new UnOp(UnaryOp.EX);
		else if (AX.matcher(readString).matches())
			token = new UnOp(UnaryOp.AX);
		else if (EG.matcher(readString).matches())
			token = new UnOp(UnaryOp.EG);
		else if (AG.matcher(readString).matches())
			token = new UnOp(UnaryOp.AG);
		else if (EF.matcher(readString).matches())
			token = new UnOp(UnaryOp.EF);
		else if (AF.matcher(readString).matches())
			token = new UnOp(UnaryOp.AF);
		else if (EF.matcher(readString).matches())
			token = new UnOp(UnaryOp.EF);
		else if (EU.matcher(readString).matches())
			token = new BinOp(BinaryOp.EU);
		else if (AU.matcher(readString).matches())
			token = new BinOp(BinaryOp.AU);
		else if (ER.matcher(readString).matches())
			token = new BinOp(BinaryOp.ER);
		else if (AR.matcher(readString).matches())
			token = new BinOp(BinaryOp.AR);
		else if (TRUE.matcher(readString).matches())
			token = new Const(1);
		else if (FALSE.matcher(readString).matches())
			token = new Const(0);
		else if ( readString.length() >= 1 &&
		          Character.isLetter(readString.charAt(0)))
		    // any other sequence of letters and digits starting
		    // with an letter is considered to be an identifier
			token = new Id(readString);
		else if (readString.length() == 0) {
			// when a special character was encountered, we
			// deal with them here
			readString = "" + c;
			switch (c) {
				case '(' :
					token = new Brack(Brack.OPEN, Brack.NORMAL);
					break;
				case ')' :
					token = new Brack(Brack.CLOSE, Brack.NORMAL);
					break;
				case '[' :
					token = new Brack(Brack.OPEN, Brack.SQUARE);
					break;
				case ']' :
					token = new Brack(Brack.CLOSE, Brack.SQUARE);
					break;
				case '{' :
					token = new Brack(Brack.OPEN, Brack.BRACE);
					break;
				case '}' :
					token = new Brack(Brack.CLOSE, Brack.BRACE);
					break;
				case '&' :
					token = new BinOp(BinaryOp.AND);
					break;
				case '|' :
					token = new BinOp(BinaryOp.OR);
					break;
				case '=' :
					token = new BinOp(BinaryOp.EQU);
					break;
				case '!' :
					token = new UnOp(UnaryOp.NOT);
					break;
				case '-' :
					if ((c = getNextChar()) == '>') {
						token = new BinOp(BinaryOp.IMP);
						readString = readString + c;
					}
					break;
                case '\'' :
                	token = new Prime();
                	break;
				case ',' :
					token = new Sep(Sep.COMMA);
					break;
				case ';' :
					token = new Sep(Sep.SEMICOLON);
					break;															
			}			
			getNextChar();
		}

        // set the reference for the token (the line and column of
        // its first character
		if (token != null)
			token.setReference(readString, tokenline, tokencolumn);

        previous = token;
		return token;

	}


}

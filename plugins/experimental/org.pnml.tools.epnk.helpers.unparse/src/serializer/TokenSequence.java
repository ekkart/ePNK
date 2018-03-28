package serializer;

import java.util.ArrayList;
import java.util.List;

import parserrules.Close;
import parserrules.LinebreakCategory;
import parserrules.Open;
import parserrules.Parenthesis;
import parserrules.Token;

public class TokenSequence {
	
	final private static String newline = System.getProperty("line.separator");
	final private static String blank = " ";
	
	final private int max =    80;
	final private int last =   70;
	final private int middle = 20;
	final private int start =   1;
	
	final private int restart = 10;
	
	private List<Token> result;
	private int priority;
	
	public TokenSequence(int priority) {
		this.result = new ArrayList<Token>();
		this.priority = priority;
	}
	
	public void append(Token token) {
		result.add(token);
	}
	
	public void append(TokenSequence sequence) {
		result.addAll(sequence.result);
	}
	
	public int getPriority() {
		return priority;
	}
	
	public void setPriority(int priority) {
		this.priority = priority;
	}
	
	public LinebreakCategory linebreakCategory(int pos) {
		if (pos < start) {
			return LinebreakCategory.ALWAYS;
		} else if (pos < middle) {
			return LinebreakCategory.START;
		} else if (pos < last) {
			return LinebreakCategory.MIDDLE;
		} else if (pos < max) {
			return LinebreakCategory.END;
		} else {
			return LinebreakCategory.OVER;
		}
		
	}
	
	public String ident(int pos) {
		StringBuffer result = new StringBuffer();
		for (int i=0; i< pos; i++) {
			result.append(blank);
		}
		return result.toString();
	}
	
	public String serialize() {
		int tab = 0;
		int col = 0;
		int line = 0;
		List<Integer> tabs = new ArrayList<Integer>();
		StringBuffer string = new StringBuffer();
	
		Token previous = null;
		for (Token token : result) {

			LinebreakCategory category = linebreakCategory(col);
			if (token.getBreakbefore().compareTo(category) >= 0) {
				if (col > 0 || line > 0) { 
					string.append(newline);
					line =  line + 1;
					col = 0;
					if (tab > 0) {
						string.append(ident(tab));
						col = tab;
					}
					previous = null;
				}
			}
			
			if (previous != null) {
				if (!previous.isSeparator() && !token.isSeparator()) {
					string.append(blank);
					col = col + 1;
				}
			}		
			previous = token;
			
			string.append(token.getText());
			col = col + token.getText().length();
			
			Parenthesis par = token.getParenthesis();
			if (par != null) {
				if (par instanceof Open) {
					Open open = (Open) par;
					if (open.isTabulate()) {
						tabs.add(tab);
						if (open.isAbsolute()) {
							tab = tab + open.getOffset();
						} else {
							tab = col + open.getOffset();
						}
						if (tab >= last) {
							tab = restart;
						}
					} else {
						tabs.add(tab);
					}
				} else if (par instanceof Close) {
					if (!tabs.isEmpty()) {
						tab = tabs.remove(tabs.size()-1);
					}					
				}
			}
			
			category = linebreakCategory(col);
			if (token.getBreakafter().compareTo(category) >= 0) {
				string.append(newline);
				line = line + 1;
				col = 0;
				if (tab > 0) {
					string.append(ident(tab));
					col = tab;
				}
				previous = null;
			}
		}
		
		return string.toString();
	}
}

package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax;

import java.io.StringReader;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.parser.IParseResult;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax.linking.HLPNGSymbolTable;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax.parser.antlr.HLPNGInscriptionLanguageParser;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.IntegersFactory;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.NumberConstant;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Declarations;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.NamedOperator;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.OperatorDecl;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Sort;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.SortDecl;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Term;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.UserOperator;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.UserSort;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Variable;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.VariableDecl;
import org.pnml.tools.epnk.structuredpntypemodel.SymbolDef;
import org.pnml.tools.epnk.structuredpntypemodel.SymbolUse;

import com.google.inject.Injector;

/**
 * This class makes available the parse operations in a singleton class
 * (since it is expensive generating it every time).
 * 
 * @generated NOT
 * @author eki
 */

public class HLPNGParser {
	
	private static HLPNGParser instance;
	
	private HLPNGInscriptionLanguageParser parser;
	
	
	public HLPNGParser() {
   		Injector guiceInjector = new HLPNGInscriptionLanguageStandaloneSetup().createInjector();	
		parser = guiceInjector.getInstance(HLPNGInscriptionLanguageParser.class);
	}

	synchronized public static HLPNGParser getHLPNGParser() {
		if (instance == null) {
			instance = new HLPNGParser();
		}
		return instance;
	}
	
	public Term parseTerm(String input) {
		ParserRule rule = parser.getGrammarAccess().getTermRule();
		IParseResult result = parser.parse(rule, new StringReader(input));
		Iterable<INode> errors = result.getSyntaxErrors();
		if (!errors.iterator().hasNext())  {
			Term term = (Term) result.getRootASTElement();
			linkLocally(term);
			return term;
		} else {
			return null;
		}		
	}
	
	public Sort parseSort(String input) {
		ParserRule rule = parser.getGrammarAccess().getSortRule();
		IParseResult result = parser.parse(rule, new StringReader(input));
		Iterable<INode> errors = result.getSyntaxErrors();
		if (!errors.iterator().hasNext())  {
			Sort sort = (Sort) result.getRootASTElement();
			linkLocally(sort);
			return sort;
		} else {
			return null;
		}		
	}
	
	public Declarations parseDeclarations(String input) {
		ParserRule rule = parser.getGrammarAccess().getDeclarationsRule();
		IParseResult result = parser.parse(rule, new StringReader(input));
		Iterable<INode> errors = result.getSyntaxErrors();
		if (!errors.iterator().hasNext())  {
			Declarations decls = (Declarations) result.getRootASTElement();
			linkLocally(decls);
			return decls;
		} else {
			return null;
		}		
	}
	
	private void linkLocally(EObject object) {
		HLPNGSymbolTable table = new HLPNGSymbolTable();	
		linkLocally(object,table);
	}
	
	private void linkLocally(EObject object, HLPNGSymbolTable table) {
		
		TreeIterator<EObject> iterator = object.eAllContents();
		
		EObject current = object;
		while (current != null) {
	
			if (current instanceof NamedOperator) {
				NamedOperator namedOp = (NamedOperator) current; 
				table.addglobalDef(namedOp);
				
				table.setLocal(true);
				for (VariableDecl varDecl : namedOp.getParameters()) {
					table.addLocalVariable(varDecl);
				} 
				
				linkLocally(namedOp.getDef(), table);
				table.clearLocalVariables();
				table.setLocal(false);
								
				iterator.prune();
				// don't link any further, but add NumberTypes, where
				// necessary:
				this.addNumberTypes(current);
				
			} else if (current instanceof VariableDecl) {
				// don't do anything if the variable declaration
				// is global
			} else if (current instanceof SymbolDef) {
				SymbolDef symbolDef = (SymbolDef) current;
				table.addglobalDef(symbolDef);
			}
			
			if (current instanceof SymbolUse) {
				if (current instanceof Variable) {
					Variable variable = (Variable) current;
					variable.setRefvariable(table.getVariableDecl(variable.getName()));
				} else if (current instanceof UserSort) {
				    UserSort userSort = (UserSort) current;
					SymbolDef symbolDef = table.getSymbolDef(userSort.getName());
					if (symbolDef != null && symbolDef instanceof SortDecl) {
					    SortDecl sortDecl = (SortDecl) symbolDef;
					    userSort.setDeclaration(sortDecl);
					}
				} else if (current instanceof UserOperator) {
				    UserOperator userOperator = (UserOperator) current;
					SymbolDef symbolDef = table.getSymbolDef(userOperator.getName());
					if (symbolDef != null && symbolDef instanceof OperatorDecl) {
					    OperatorDecl opDecl = (OperatorDecl) symbolDef;
					    userOperator.setDeclaration(opDecl);
					}
				}
			}
			
			// This is actually not a linker function. We sneaked it in here
			// anyway. If the type of a number constant was not set explicitly,
			// it will be set here.
			if (current instanceof NumberConstant) {
				NumberConstant constant = (NumberConstant) current;
				if (constant.getType() == null) {
					if (constant.getValue() > 0) {
						constant.setType(IntegersFactory.eINSTANCE.createPositive());
					} else if (constant.getValue() == 0) {
						constant.setType(IntegersFactory.eINSTANCE.createNatural());
					} else {
						constant.setType(IntegersFactory.eINSTANCE.createInteger());

					}
						
				}
			}
			
			if (iterator.hasNext()) {
			    current = iterator.next();
			} else {
				current = null;
			}
		}			
	}
	
	private void addNumberTypes(EObject object) {
		TreeIterator<EObject> iterator = object.eAllContents();	
		while (iterator.hasNext()) {
			EObject current = iterator.next(); 
			if (current instanceof NumberConstant) {
				NumberConstant constant = (NumberConstant) current;
				if (constant.getType() == null) {
					if (constant.getValue() > 0) {
						constant.setType(IntegersFactory.eINSTANCE.createPositive());
					} else if (constant.getValue() == 0) {
						constant.setType(IntegersFactory.eINSTANCE.createNatural());
					} else {
						constant.setType(IntegersFactory.eINSTANCE.createInteger());
					}
				}
			}
		}
	}

}

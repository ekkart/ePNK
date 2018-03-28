package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax.linking;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNet;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.Partition;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.PartitionElementOf;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Declarations;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.NamedOperator;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.OperatorDecl;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.SortDecl;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.UserOperator;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.UserSort;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Variable;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.VariableDecl;
import org.pnml.tools.epnk.structuredpntypemodel.Linker;
import org.pnml.tools.epnk.structuredpntypemodel.SymbolDef;
import org.pnml.tools.epnk.structuredpntypemodel.SymbolUse;
import org.pnml.tools.epnk.structuredpntypemodel.SymbolUseMapping;

public class HLPNGLinker extends EObjectImpl implements Linker {

	@Override
	public SymbolUseMapping getglobalLinks(PetriNet petrinet) {
		HLPNGSymbolTable table = getGlobalSymbols(petrinet);
		
		SymbolMapping mapping = new SymbolMapping(); 
		
		getGlobalLinks(petrinet, table, mapping);
		
		return mapping;
	}

	
	private void getGlobalLinks(EObject object, HLPNGSymbolTable table, SymbolMapping mapping) {
		
		TreeIterator<EObject> iterator = object.eAllContents();
		
		EObject current = object;
		
		while (current != null) {
			
			
			if (current instanceof NamedOperator) {
				NamedOperator namedOp = (NamedOperator) current; 
				
				table.setLocal(true);
				for (VariableDecl varDecl : namedOp.getParameters()) {
					table.addLocalVariable(varDecl);
				} 
				
				getGlobalLinks(namedOp.getDef(), table, mapping);
				table.clearLocalVariables();
				table.setLocal(false);
								
				iterator.prune();
				
			} else if (current instanceof SymbolDef) {
				// don't do anything if the declaration is
				// global (this was added to the symbol table
				// in the first iteration
			} 
			
			if (current instanceof SymbolUse) {
				SymbolUse symbolUse = (SymbolUse) current;
				String name = symbolUse.getName();
				 
				if (current instanceof Variable ) {
					SymbolDef symbolDef = table.getVariableDecl(name);
					mapping.addSymbol(symbolUse, symbolDef);
				} else if (current instanceof UserSort) {
					SymbolDef symbolDef = table.getSymbolDef(symbolUse.getName());
					if (symbolDef != null && symbolDef instanceof SortDecl) {
						mapping.addSymbol(symbolUse, symbolDef);
					} else {
						mapping.addSymbol(symbolUse, null);
					}
				} else if (current instanceof UserOperator) {
					SymbolDef symbolDef = table.getSymbolDef(symbolUse.getName());
					if (symbolDef != null && symbolDef instanceof OperatorDecl) {
						mapping.addSymbol(symbolUse, symbolDef);
					} else {
						mapping.addSymbol(symbolUse, null);
					}
				} else if (current instanceof PartitionElementOf) {
					SymbolDef symbolDef = table.getSymbolDef(symbolUse.getName());
					if (symbolDef != null && symbolDef instanceof Partition) {
						mapping.addSymbol(symbolUse, symbolDef);
					} else {
						mapping.addSymbol(symbolUse, null);
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
	

	
	private HLPNGSymbolTable getGlobalSymbols(EObject object) {
		
		HLPNGSymbolTable table = new HLPNGSymbolTable();
		
		TreeIterator<EObject> iterator = object.eAllContents();
		
		while (iterator.hasNext()) {
			EObject current = iterator.next();
			
			if (current instanceof NamedOperator) {
				
				NamedOperator namedOp = (NamedOperator) current; 
				table.addglobalDef(namedOp);
				
				// Make sure that the Variable Declarations within
				// a NamedOperator declaration are not added to the
				// global symbols of the symbol table
				// iterator.prune();
					
			} else if (current instanceof VariableDecl ) {
				VariableDecl varDecl = (VariableDecl) current;
				EObject container = varDecl.eContainer();
				if (container != null &&  container instanceof Declarations) {
					// add variable declaration only, if it occurs immediately
					// within a (global) declaration.
					table.addGlobalVariable(varDecl);
				}
				// iterator.prune();
			} else if (current instanceof SymbolDef) {
				SymbolDef symbolDef = (SymbolDef) current;
				table.addglobalDef(symbolDef);
				// iterator.prune();
			} /* else if (current instanceof Sort || current instanceof Term) {
				iterator.prune();
			} */
		}
		
		return table;
	
	}



}

package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax.linking;

import java.util.HashMap;
import java.util.Map;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.VariableDecl;
import org.pnml.tools.epnk.structuredpntypemodel.SymbolDef;

public class HLPNGSymbolTable {

	Map<String,VariableDecl> globalVariables = new HashMap<String,VariableDecl>();
	Map<String,VariableDecl> localVariables = new HashMap<String,VariableDecl>();
	
	boolean local = false;
	
	Map<String,SymbolDef> globalDefs =  new HashMap<String,SymbolDef>();
	
	public boolean addGlobalVariable(VariableDecl varDecl) {
		String name = varDecl.getName();
		
		if (name == null || globalVariables.containsKey(name) ) {
			return false;
		} else {
			globalVariables.put(name,varDecl);
			return true;
		}
	}
	
	public boolean addglobalDef(SymbolDef symbolDef) {
		String name = symbolDef.getName();
		
		if (name == null || symbolDef instanceof VariableDecl || globalDefs.containsKey(name)) {
			return false;
		} else {
			globalDefs.put(name, symbolDef);
			return true;
		}
	}
	
	public boolean addLocalVariable(VariableDecl varDecl) {
		String name = varDecl.getName();
		
		if (name == null || localVariables.containsKey(name) ) {
			return false;
		} else {
			localVariables.put(name,varDecl);
			return true;
		}
	}
	
	public void clearLocalVariables() {
	    localVariables.clear();	
	}
	
	public void setLocal(boolean value) {
		local = value;
	}
	
	public VariableDecl getVariableDecl(String name) {
		if (local) {
			if (localVariables.containsKey(name)) {
				return localVariables.get(name);
			} else {
				return null;
			}
		} else
			if (globalVariables.containsKey(name)) {
				return globalVariables.get(name);
			} else {
				return null;
			}	
	}
	
	public SymbolDef getSymbolDef(String name) {
			if (globalDefs.containsKey(name)) {
				return globalDefs.get(name);
			} else {
				return null;
			}
   } 
	
	
	
}

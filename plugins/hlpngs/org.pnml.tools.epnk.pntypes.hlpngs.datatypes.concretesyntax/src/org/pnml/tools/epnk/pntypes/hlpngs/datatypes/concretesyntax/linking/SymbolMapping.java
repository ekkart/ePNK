package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax.linking;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.pnml.tools.epnk.structuredpntypemodel.SymbolDef;
import org.pnml.tools.epnk.structuredpntypemodel.SymbolUse;
import org.pnml.tools.epnk.structuredpntypemodel.SymbolUseMapping;

public class SymbolMapping extends EObjectImpl implements SymbolUseMapping{
	
	Map<SymbolUse,SymbolDef> map = new HashMap<SymbolUse,SymbolDef>();

	@Override
	public SymbolDef getSymbolDef(SymbolUse symbolUse) {
		return map.get(symbolUse);
	}

	@Override
	public EList<SymbolUse> getSymbolUses() {
		return new BasicEList<SymbolUse>(map.keySet());
	}
	
	void addSymbol(SymbolUse use, SymbolDef def) {
		map.put(use, def);
	}
	

}

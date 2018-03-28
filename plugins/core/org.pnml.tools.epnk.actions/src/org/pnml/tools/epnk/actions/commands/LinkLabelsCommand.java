package org.pnml.tools.epnk.actions.commands;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNet;
import org.pnml.tools.epnk.structuredpntypemodel.Linker;
import org.pnml.tools.epnk.structuredpntypemodel.StructuredPetriNetType;
import org.pnml.tools.epnk.structuredpntypemodel.StructuredpntypemodelPackage;
import org.pnml.tools.epnk.structuredpntypemodel.SymbolDef;
import org.pnml.tools.epnk.structuredpntypemodel.SymbolUse;
import org.pnml.tools.epnk.structuredpntypemodel.SymbolUseMapping;

public class LinkLabelsCommand extends CompoundCommand {

	public LinkLabelsCommand(PetriNet net) {
		super(0);
				
		Linker linker = null;
		
		if (net != null && net.getType() instanceof StructuredPetriNetType) {
			StructuredPetriNetType type = (StructuredPetriNetType) net.getType();
			if (type != null) {
				linker = type.getLinker();
			}
		}

		if (linker == null) {
			return;
        }
        
		EditingDomain domain = AdapterFactoryEditingDomain.getEditingDomainFor(net);
		
		SymbolUseMapping mapping = linker.getglobalLinks(net);
		
		EList<SymbolUse> symbolUses = mapping.getSymbolUses();
		
		for(SymbolUse symbolUse : symbolUses) {
			SymbolDef symbolDef = mapping.getSymbolDef(symbolUse);
			if (symbolDef == null) {
				String name = symbolUse.getName();
				if (name != null) {
					this.append(new SetCommand(domain,
							symbolUse,
							StructuredpntypemodelPackage.eINSTANCE.getSymbolUse_Name(),
							name));
				}
			}
			this.append(new SetCommand(domain,
					       symbolUse,
					       symbolUse.getRefFeature(),
					       symbolDef));
		}
	}

	@Override
	public String getDescription() {
		return "Links the references between symbols of different labels.";
	}

	@Override
	public String getLabel() {

		return "Links symbols";
	}

}

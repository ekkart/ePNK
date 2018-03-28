package org.pnml.tools.epnk.structuredpntypemodel.commands;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.pnml.tools.epnk.structuredpntypemodel.StructuredLabel;


/**
 * This command sets the text feature of a StructuralLabel and updates
 * the structural feature accordingly.
 * 
 */
public class SetTextAndStructureFeatureCommand extends CompoundCommand {
   
	protected EditingDomain domain;
	
	public SetTextAndStructureFeatureCommand(EditingDomain domain,
			StructuredLabel label,
			Command command, Object structure) {
		super(0);
		this.domain = domain;
		
		append(command);
		append(new SetCommand(domain, label, label.getStructuralFeature(), structure)); 

	}
	
}

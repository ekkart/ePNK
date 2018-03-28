package org.pnml.tools.epnk.structuredpntypemodel.commands;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.gmf.runtime.diagram.ui.menus.PopupMenu;
import org.eclipse.ui.PlatformUI;

import org.pnml.tools.epnk.structuredpntypemodel.StructuredLabel;


/**
 * This command sets the text feature of a StructuralLabel and updates
 * the structural feature accordingly. This is a version, which would
 * notify the user when the structural label is syntactically incorrect (since the
 * labels should be edited in the GMF editor anyway, I did not include
 * that to the org.pnml.tools.epnk.edit (package 
 * org.pnml.tools.epnk.structuredpntypemodel.commands).
 * 
 * Note that this requires the plugins:
 *  org.eclipse.gmf.runtime.diagram.ui;bundle-version="1.2.1" and
 *  org.eclipse.emf.edit.ui;bundle-version="2.5.0"
 * 
 */
public class SetTextAndStructureFeatureCommand extends CompoundCommand {
   
	protected EditingDomain domain;
	
	public SetTextAndStructureFeatureCommand(EditingDomain domain,
			StructuredLabel label,
			Command command, Object structure) {
		super(0);
		this.domain = domain;
		
		if (structure == null) {
			parseError = true;
		} else {
			parseError = false;
		}
		append(command);
		append(new SetCommand(domain, label, label.getStructuralFeature(), structure)); 

	}

	
	private boolean parseError;
	
	@Override
	public void execute() {
		super.execute();
		if (parseError) {
			
			ArrayList<String> list = new ArrayList<String>();
			list.add("Error: Syntax error in label");
			
			List<AdapterFactory> factories = new ArrayList<AdapterFactory>();
			factories.add(new ReflectiveItemProviderAdapterFactory());
			AdapterFactory adapterFactory = new ComposedAdapterFactory(factories);
	        PopupMenu menu = new PopupMenu(list, new AdapterFactoryLabelProvider(adapterFactory));
			menu.show(PlatformUI.getWorkbench().getDisplay().getActiveShell());
		}
	}	
}

package org.pnml.tools.epnk.applications.view.actions;

import org.eclipse.jface.action.Action;
import org.pnml.tools.epnk.applications.ApplicationFactory;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNet;

public class StartApplicationAction extends Action {
	
	private ApplicationFactory factory;
	private StartApplicationMenu startmenu;
	private PetriNet net;
	
	public StartApplicationAction(
			ApplicationFactory factory, 
			PetriNet net, 
			boolean selected, 
			StartApplicationMenu startmenu) {
		super(factory.getName(), Action.AS_CHECK_BOX);
		this.setChecked(selected);
		this.factory = factory;
		this.startmenu = startmenu;
		this.net = net;
	}
	
	@Override
	public void run() {
		startmenu.startApplication(factory, net);
	}

}

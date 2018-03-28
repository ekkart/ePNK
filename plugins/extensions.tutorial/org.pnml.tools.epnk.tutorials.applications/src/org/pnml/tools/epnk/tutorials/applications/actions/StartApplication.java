package org.pnml.tools.epnk.tutorials.applications.actions;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.pnml.tools.epnk.applications.activator.Activator;
import org.pnml.tools.epnk.applications.registry.ApplicationRegistry;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNet;

public class StartApplication implements IObjectActionDelegate {
	
	private PetriNet petrinet;

	@Override
	public void run(IAction action) {
		CalculateTransitionContext application = new CalculateTransitionContext(petrinet);
		Activator activator = Activator.getInstance();
		ApplicationRegistry registry = activator.getApplicationRegistry();
		application.initialize(null);
		registry.addApplication(application);
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		petrinet = null;
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			if (structuredSelection.size() == 1) {
				java.lang.Object selected = structuredSelection.getFirstElement();
				if (selected instanceof PetriNet) {
					petrinet = (PetriNet) selected;
				}
			}
		}
		action.setEnabled(isEnabled());
	}

	private boolean isEnabled() {
		return petrinet != null;
	}

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {}

}

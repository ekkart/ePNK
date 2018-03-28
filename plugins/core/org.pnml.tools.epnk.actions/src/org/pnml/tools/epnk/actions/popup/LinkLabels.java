package org.pnml.tools.epnk.actions.popup;

import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.pnml.tools.epnk.actions.commands.LinkLabelsCommand;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNet;

public class LinkLabels implements IObjectActionDelegate {
	
	private PetriNet selectedNet;
	
	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {}
	
	@Override
	public void run(IAction action) {
		if (isEnabled()) {
			EditingDomain domain = AdapterFactoryEditingDomain.getEditingDomainFor(selectedNet);	
			domain.getCommandStack().execute(new LinkLabelsCommand(selectedNet));
		}

	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		selectedNet = null;
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			if (structuredSelection.size() == 1
					&& structuredSelection.getFirstElement() instanceof PetriNet) {
				selectedNet = (PetriNet) structuredSelection
						.getFirstElement();
			}
		}
		action.setEnabled(isEnabled());
	}
	
	public boolean isEnabled() {
		return selectedNet != null;
	}



}

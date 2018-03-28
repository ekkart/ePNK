package org.pnml.tools.epnk.actions.popup;

import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import org.pnml.tools.epnk.pnmlcoremodel.PetriNetDoc;

import org.pnml.tools.epnk.actions.commands.AddMissingIDsCommand;

public class AddMissingIDs implements IObjectActionDelegate {
	
	private PetriNetDoc selectedDoc;
	
	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {}
	
	@Override
	public void run(IAction action) {
		if (isEnabled()) {
			EditingDomain domain = AdapterFactoryEditingDomain.getEditingDomainFor(selectedDoc);	
			domain.getCommandStack().execute(new AddMissingIDsCommand(selectedDoc));
		}

	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		selectedDoc = null;
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			if (structuredSelection.size() == 1
					&& structuredSelection.getFirstElement() instanceof PetriNetDoc) {
				selectedDoc = (PetriNetDoc) structuredSelection
						.getFirstElement();
			}
		}
		action.setEnabled(isEnabled());
	}
	
	public boolean isEnabled() {
		return selectedDoc != null;
	}



}

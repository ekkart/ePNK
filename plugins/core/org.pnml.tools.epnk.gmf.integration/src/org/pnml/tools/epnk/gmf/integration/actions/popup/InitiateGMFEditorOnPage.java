package org.pnml.tools.epnk.gmf.integration.actions.popup;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.pnml.tools.epnk.gmf.integration.helpers.OpenGMFEditor;
import org.pnml.tools.epnk.pnmlcoremodel.Page;


public class InitiateGMFEditorOnPage implements IObjectActionDelegate {
	
	private Page page;
	
	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {}

	@Override
	public void run(IAction action) {
		OpenGMFEditor.open(this.page);	
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		page = null;
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			if (structuredSelection.size() == 1) {
				Object selected = structuredSelection.getFirstElement();
				if ( selected instanceof Page) {
					page = (Page) selected;
				} else if ( selected instanceof EditPart ) {
					EditPart part = (EditPart) selected;
					Object model = part.getModel();
					if (model != null && model instanceof View) {
						EObject object = ((View) model).getElement();
						if (object != null && object instanceof Page) {
							page = (Page) object;
						}
					}
				}
			}
		}
		action.setEnabled(isEnabled());
	}

	public boolean isEnabled() {
		if (page != null) {
			EditingDomain domain = AdapterFactoryEditingDomain.getEditingDomainFor(page);
			if (domain instanceof TransactionalEditingDomain && 
					"org.pnml.tools.epnk.diagram.EditingDomain".equals(((TransactionalEditingDomain) domain).getID())) {
				return true;	
			}
		}
		return false;
	}

}

package org.pnml.tools.epnk.gmf.integration.actions.popup;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.pnml.tools.epnk.managers.graphics.resources.GraphicsResourcesManager;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNetDoc;
import org.pnml.tools.epnk.pnmlcoremodel.presentation.MultipleEditorsInfo;
import org.pnml.tools.epnk.pnmlcoremodel.presentation.MultipleEditorsRegistry;

public class RefreshImages implements IObjectActionDelegate {

	private PetriNetDoc selectedDoc;

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {}

	@Override
	public void run(IAction action) {
		if (isEnabled()) {
			MultipleEditorsInfo info = MultipleEditorsRegistry.getInstance().getInfo(selectedDoc);
			GraphicsResourcesManager resourceManager =  info.getGraphicsResourcesManager();
			resourceManager.clearImageCache();
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

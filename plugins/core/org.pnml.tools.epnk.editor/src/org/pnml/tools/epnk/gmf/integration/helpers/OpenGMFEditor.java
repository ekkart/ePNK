package org.pnml.tools.epnk.gmf.integration.helpers;

import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.pnml.tools.epnk.pnmlcoremodel.Page;
import org.pnml.tools.epnk.toolspecific.diagraminfo.DiagramInfo;
import org.pnml.tools.epnk.toolspecific.diagraminfo.util.DiagramInfoHelper;

// @generated NOT
// @author eki
public class OpenGMFEditor {

	/**
	 * Opens a GMF diagram editor on the page. If an editor is open on this
	 * page already, it will become active; but no new one will be opened.
	 *  
	 * @param page
	 * @return whether the open operation was successful
	 */
	public static boolean open(Page page) {
		if (page == null) {
			return false;
		}
		
		EditingDomain domain = AdapterFactoryEditingDomain.getEditingDomainFor(page);
		if (!(domain instanceof TransactionalEditingDomain) || 
				!"org.pnml.tools.epnk.diagram.EditingDomain".equals(((TransactionalEditingDomain) domain).getID())) {
			MessageDialog.openInformation(
					null,
					"ePNK: Open Graphical Editor for Page",
					"The graphical editor for this page cannot be opened " +
					"from this editor, since it is not a primary editor for a PNML file."
			);
			return false;	
		}
		
		DiagramInfo diagramextension = DiagramInfoHelper.getDiagramInfo(page);
		if (diagramextension == null) {
			boolean result =
				MessageDialog.openConfirm(
						null,
						"ePNK: Create Diagram Information Extension",
						"There is no diagram for this net yet. It will be created now. " +
						"Note that, if you proceed, you cannot do any undo operation before " +
						"this point. Do you want to proceed?"
				);
			if (!result) {
				return false;
			}
		}

		IWorkbenchPage workbenchPage = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		try {
			PNMLPageEditorInput input = new PNMLPageEditorInput(page);
			workbenchPage.openEditor( input, "org.pnml.tools.epnk.diagram.part.PNMLCoreModelDiagramEditorID");
		} catch (PartInitException e) {
			return false;
		}

		return true;	
	}

}

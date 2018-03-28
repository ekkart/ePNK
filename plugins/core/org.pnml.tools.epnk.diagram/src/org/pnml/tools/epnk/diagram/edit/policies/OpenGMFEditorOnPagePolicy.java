package org.pnml.tools.epnk.diagram.edit.policies;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.OpenEditPolicy;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.pnml.tools.epnk.gmf.integration.helpers.PNMLPageEditorInput;
import org.pnml.tools.epnk.pnmlcoremodel.Page;
import org.pnml.tools.epnk.toolspecific.diagraminfo.DiagramInfo;
import org.pnml.tools.epnk.toolspecific.diagraminfo.util.DiagramInfoHelper;

/**
 * Opens a GMF diagram editor for a page. If the diagram information is
 * there already, it will be opened directly (i.e. without issuing a command);
 * if the diagram information needs to be added, a command for opening the
 * GMF diagram editor is returned.
 * 
 * @generted NOT
 * @author eki (new manually written class)
 *
 */
public class OpenGMFEditorOnPagePolicy extends OpenEditPolicy {

	@Override
	protected Command getOpenCommand(Request request) {
		EditPart targetEditPart = getTargetEditPart(request); 
		if (targetEditPart instanceof IGraphicalEditPart) { 
			IGraphicalEditPart editPart =  (IGraphicalEditPart) targetEditPart; 

			Object object = editPart.resolveSemanticElement();
			if (object instanceof Page) {
				Page page = (Page) object;

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
						return null;
					} else {
						return new ICommandProxy(new OpenGMFEditor(page));
					}
				}

				IWorkbenchPage wbpage = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
				try {
					PNMLPageEditorInput input = new PNMLPageEditorInput(page);
					wbpage.openEditor( input, "org.pnml.tools.epnk.diagram.part.PNMLCoreModelDiagramEditorID");
				} catch (PartInitException e) {
				}
			}
		}
		return null;
	}
}

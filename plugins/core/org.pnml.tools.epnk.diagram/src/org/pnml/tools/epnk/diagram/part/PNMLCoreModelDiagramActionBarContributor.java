package org.pnml.tools.epnk.diagram.part;

import org.eclipse.gmf.runtime.common.ui.action.actions.global.GlobalRedoAction;
import org.eclipse.gmf.runtime.common.ui.action.actions.global.GlobalUndoAction;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramActionBarContributor;
import org.eclipse.gmf.runtime.diagram.ui.printing.render.actions.EnhancedPrintActionHelper;
import org.eclipse.gmf.runtime.diagram.ui.printing.render.actions.RenderedPrintPreviewAction;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.actions.ActionFactory;

import experiment.globalhandlers.GlobalRedoActionNoPrune;
import experiment.globalhandlers.GlobalUndoActionNoPrune;

/**
 * @generated
 */
public class PNMLCoreModelDiagramActionBarContributor extends
		DiagramActionBarContributor {

	/**
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	protected Class getEditorClass() {
		return PNMLCoreModelDiagramEditor.class;
	}

	/**
	 * @generated
	 */
	protected String getEditorId() {
		return PNMLCoreModelDiagramEditor.ID;
	}

	/**
	 * @generated
	 */
	public void initGen(IActionBars bars, IWorkbenchPage page) {
		super.init(bars, page);
		// print preview
		IMenuManager fileMenu = bars.getMenuManager().findMenuUsingPath(
				IWorkbenchActionConstants.M_FILE);
		assert fileMenu != null;
		IAction printPreviewAction = new RenderedPrintPreviewAction(
				new EnhancedPrintActionHelper());
		fileMenu.insertBefore("print", printPreviewAction); //$NON-NLS-1$
	}

	// @generated NOT
	// @author eki
	public void init(IActionBars bars, IWorkbenchPage page) {
		initGen(bars, page);

		// eki: added this to replace the GlobalUndo & -RedoActions
		//      which flush the operation history when live constraints are
		//      validated by respective actions that do not flush the
		//      history on validation.
		if (bars != null) {
			// get the installed undo action
			String undo = ActionFactory.UNDO.getId();
			IAction action = bars.getGlobalActionHandler(undo);
			if (action != null) {
				// set the new undo action
				bars.setGlobalActionHandler(undo, new GlobalUndoActionNoPrune(
						page));
				if (action instanceof GlobalUndoAction) {
					// and properly dispose of the old one (the setUndoContext(null)
					// is needed to also properly dispose of the delegate of the
					// original GlobalUndoAction (which does the actual harm)
					((GlobalUndoAction) action).setUndoContext(null);
					((GlobalUndoAction) action).dispose();
				}
			}
			String redo = ActionFactory.REDO.getId();
			action = bars.getGlobalActionHandler(redo);
			if (action != null) {
				// set the new redo action
				bars.setGlobalActionHandler(redo, new GlobalRedoActionNoPrune(
						page));
				if (action instanceof GlobalRedoAction) {
					// and properly dispose of the old one (the setUndoContext(null)
					// is needed to also properly dispose of the delegate of the
					// original GlobalRedoAction (which does the actual harm)
					((GlobalRedoAction) action).setUndoContext(null);
					((GlobalRedoAction) action).dispose();
				}
			}
		}
	}
}

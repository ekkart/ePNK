package org.pnml.tools.epnk.diagram.edit.policies;

import java.util.Collections;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.pnml.tools.epnk.gmf.integration.helpers.PNMLPageEditorInput;
import org.pnml.tools.epnk.pnmlcoremodel.Page;

/** 
 * Transactional command for opening a GMF editor on a page (not undoable).
 * This command is necessary when the diagram information needs to be added
 * within a request.
 * 
 * @author eki
 *
 */
// @generated NOT
public class OpenGMFEditor extends AbstractTransactionalCommand {

	private Page page;
	
	public OpenGMFEditor(Page page) { 
		super(TransactionUtil.getEditingDomain(page),
				"Open GMF Editor command (cannot be undone)",
				Collections.singletonList(WorkspaceSynchronizer.getFile(page.eResource())));
		this.page = page;
	}
	@Override
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		IWorkbenchPage wbpage = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		try {
			PNMLPageEditorInput input = new PNMLPageEditorInput(page);
			wbpage.openEditor( input, "org.pnml.tools.epnk.diagram.part.PNMLCoreModelDiagramEditorID");
		} catch (PartInitException e) {
			return CommandResult.newErrorCommandResult("Editor could not be opened");
		}
		return CommandResult.newOKCommandResult();
	}
	@Override
	public boolean canUndo() {
		// return false;
		// eki: return false would unfortunately have the side
		//      effect that the dirty flag will not be set.
		//      Therefore, we say that the command is
		//      undoable, but; the undo will be cancelled
		//      (see doUndo());
		return true;
	}
	
	@Override
	public IStatus doUndo(IProgressMonitor monitor, IAdaptable info) {
		// eki: This is a hack! The reason is that returning false for doCanUndo
		//      will result in a non dirty stack state.
		throw new OperationCanceledException(
				"The open GMF editor command cannot be undone!");
	}
	

}

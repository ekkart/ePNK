package org.pnml.tools.epnk.gmf.integration.advices;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.common.core.command.UnexecutableCommand;
import org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;
import org.pnml.tools.epnk.helpers.NetFunctions;
import org.pnml.tools.epnk.pnmlcoremodel.Page;
import org.pnml.tools.epnk.pnmlcoremodel.presentation.MultipleEditorsInfo;
import org.pnml.tools.epnk.pnmlcoremodel.presentation.MultipleEditorsRegistry;



/**
 * This advice guarantees that the editors on all subpages of
 * a page are closed before the page is deleted.
 * 
 * @generated NOT
 * @author eki
 *
 */
public class DeletePageAdvice extends AbstractEditHelperAdvice {

	@Override
	public boolean approveRequest(IEditCommandRequest request) {
		/*
		 *  eki: this does not work (advice will be overruled); therefore
		 *       we avoid deleting a page with a graphical editor open with
		 *       a UnexecutableCommand (see getBeforeDestroyElementCommand()).
		 *       
		if (request instanceof DestroyElementRequest) {
			DestroyElementRequest destroyRequest = (DestroyElementRequest) request;
			EObject target = destroyRequest.getElementToDestroy();
			if (target != null && target instanceof Page) {
				EditingDomain domain = request.getEditingDomain();
				if (domain != null) {
					MultipleEditorsInfo multipleEditorInfo = 
						MultipleEditorsRegistry.getInstance().getInfo(domain);
					if (multipleEditorInfo != null) {
						boolean openEditors = 
							multipleEditorInfo.isSecondaryEditorOpenOn(
								NetFunctions.getAllSubPages((Page) target));
						if (openEditors) {
							return false;
						}
					}
				}
			}
		}
		*/
		return super.approveRequest(request);
	}

	@Override
	protected ICommand getBeforeDestroyElementCommand(
			DestroyElementRequest request) {

		EObject target = request.getElementToDestroy();

		if (target != null && target instanceof Page) {
			EditingDomain domain = request.getEditingDomain();
			if (domain != null) {
				MultipleEditorsInfo multipleEditorInfo = 
					MultipleEditorsRegistry.getInstance().getInfo(domain);
				if (multipleEditorInfo != null) {
					boolean openEditors = 
						multipleEditorInfo.isSecondaryEditorOpenOn(
								NetFunctions.getAllSubPages((Page) target));
					if (openEditors) {
						return UnexecutableCommand.INSTANCE;
					}
				}
			}
		}

		return super.getBeforeDestroyElementCommand(request);
	}

}

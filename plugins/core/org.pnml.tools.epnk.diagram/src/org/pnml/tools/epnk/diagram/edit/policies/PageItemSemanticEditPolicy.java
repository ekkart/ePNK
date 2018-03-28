package org.pnml.tools.epnk.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;
import org.pnml.tools.epnk.diagram.edit.commands.LabelProxyCreateCommand;
import org.pnml.tools.epnk.diagram.edit.commands.PageCreateCommand;
import org.pnml.tools.epnk.diagram.edit.commands.PageLabelProxyCreateCommand;
import org.pnml.tools.epnk.diagram.edit.commands.PlaceCreateCommand;
import org.pnml.tools.epnk.diagram.edit.commands.RefPlaceCreateCommand;
import org.pnml.tools.epnk.diagram.edit.commands.RefTransitionCreateCommand;
import org.pnml.tools.epnk.diagram.edit.commands.TransitionCreateCommand;
import org.pnml.tools.epnk.diagram.providers.PNMLCoreModelElementTypes;

/**
 * @generated
 */
public class PageItemSemanticEditPolicy extends
		PNMLCoreModelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public PageItemSemanticEditPolicy() {
		super(PNMLCoreModelElementTypes.Page_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (PNMLCoreModelElementTypes.Place_2001 == req.getElementType()) {
			return getGEFWrapper(new PlaceCreateCommand(req));
		}
		if (PNMLCoreModelElementTypes.RefPlace_2002 == req.getElementType()) {
			return getGEFWrapper(new RefPlaceCreateCommand(req));
		}
		if (PNMLCoreModelElementTypes.Transition_2003 == req.getElementType()) {
			return getGEFWrapper(new TransitionCreateCommand(req));
		}
		if (PNMLCoreModelElementTypes.Page_2004 == req.getElementType()) {
			return getGEFWrapper(new PageCreateCommand(req));
		}
		if (PNMLCoreModelElementTypes.RefTransition_2005 == req
				.getElementType()) {
			return getGEFWrapper(new RefTransitionCreateCommand(req));
		}
		if (PNMLCoreModelElementTypes.LabelProxy_2009 == req.getElementType()) {
			return getGEFWrapper(new LabelProxyCreateCommand(req));
		}
		if (PNMLCoreModelElementTypes.PageLabelProxy_2008 == req
				.getElementType()) {
			return getGEFWrapper(new PageLabelProxyCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}

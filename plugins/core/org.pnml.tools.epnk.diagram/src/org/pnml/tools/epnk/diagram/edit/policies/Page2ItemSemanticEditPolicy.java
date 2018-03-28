package org.pnml.tools.epnk.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;
import org.pnml.tools.epnk.diagram.edit.commands.ArcCreateCommand;
import org.pnml.tools.epnk.diagram.edit.commands.ArcReorientCommand;
import org.pnml.tools.epnk.diagram.edit.commands.LabelProxyObjectCreateCommand;
import org.pnml.tools.epnk.diagram.edit.parts.ArcEditPart;
import org.pnml.tools.epnk.diagram.edit.parts.LabelProxyObjectEditPart;
import org.pnml.tools.epnk.diagram.part.PNMLCoreModelVisualIDRegistry;
import org.pnml.tools.epnk.diagram.providers.PNMLCoreModelElementTypes;

/**
 * @generated
 */
public class Page2ItemSemanticEditPolicy extends
		PNMLCoreModelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public Page2ItemSemanticEditPolicy() {
		super(PNMLCoreModelElementTypes.Page_2004);
	}

	/**
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (PNMLCoreModelVisualIDRegistry.getVisualID(incomingLink) == ArcEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (PNMLCoreModelVisualIDRegistry.getVisualID(incomingLink) == LabelProxyObjectEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (PNMLCoreModelVisualIDRegistry.getVisualID(outgoingLink) == ArcEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super
				.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (PNMLCoreModelElementTypes.Arc_4001 == req.getElementType()) {
			return getGEFWrapper(new ArcCreateCommand(req, req.getSource(),
					req.getTarget()));
		}
		if (PNMLCoreModelElementTypes.LabelProxyObject_4004 == req
				.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (PNMLCoreModelElementTypes.Arc_4001 == req.getElementType()) {
			return getGEFWrapper(new ArcCreateCommand(req, req.getSource(),
					req.getTarget()));
		}
		if (PNMLCoreModelElementTypes.LabelProxyObject_4004 == req
				.getElementType()) {
			return getGEFWrapper(new LabelProxyObjectCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(
			ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case ArcEditPart.VISUAL_ID:
			return getGEFWrapper(new ArcReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}

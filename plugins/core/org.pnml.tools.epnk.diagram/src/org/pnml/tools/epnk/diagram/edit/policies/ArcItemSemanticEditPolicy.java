package org.pnml.tools.epnk.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.pnml.tools.epnk.diagram.edit.commands.LabelProxyObjectCreateCommand;
import org.pnml.tools.epnk.diagram.providers.PNMLCoreModelElementTypes;

/**
 * @generated
 */
public class ArcItemSemanticEditPolicy extends
		PNMLCoreModelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ArcItemSemanticEditPolicy() {
		super(PNMLCoreModelElementTypes.Arc_4001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
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
		if (PNMLCoreModelElementTypes.LabelProxyObject_4004 == req
				.getElementType()) {
			return getGEFWrapper(new LabelProxyObjectCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

}

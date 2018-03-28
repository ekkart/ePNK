package org.pnml.tools.epnk.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.pnml.tools.epnk.diagram.providers.PNMLCoreModelElementTypes;

/**
 * @generated
 */
public class LabelProxyObjectItemSemanticEditPolicy extends
		PNMLCoreModelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public LabelProxyObjectItemSemanticEditPolicy() {
		super(PNMLCoreModelElementTypes.LabelProxyObject_4004);
	}

	/**
	 * @generated
	 *
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}
	 */

	/**
	 * @generated NOT
	 * @author eki
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		// eki: make sure that LabelLinks are never deleted! A LabelLink can
		//      only be deleted together with the label.
		return UnexecutableCommand.INSTANCE;
	}

}

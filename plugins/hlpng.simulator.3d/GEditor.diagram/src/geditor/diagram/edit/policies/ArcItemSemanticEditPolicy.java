package geditor.diagram.edit.policies;

import geditor.diagram.providers.GEditorElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

/**
 * @generated
 */
public class ArcItemSemanticEditPolicy extends
		GEditorBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ArcItemSemanticEditPolicy() {
		super(GEditorElementTypes.Arc_4001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}

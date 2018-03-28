package org.pnml.tools.epnk.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.notation.View;
import org.pnml.tools.epnk.diagram.edit.policies.ArcItemSemanticEditPolicy;
import org.pnml.tools.epnk.gmf.extensions.graphics.IArcFigure;
import org.pnml.tools.epnk.gmf.extensions.graphics.registry.FigureExtensionsRegistry;
import org.pnml.tools.epnk.pnmlcoremodel.Arc;

/**
 * @generated
 */
public class ArcEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4001;

	/**
	 * @generated
	 */
	public ArcEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new ArcItemSemanticEditPolicy());
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated NOT (added creation of the figure via the FigureEtensionRegistry)
	 * @author eki
	 */
	protected IArcFigure createConnectionFigure() {
		Object model = getModel();
		if (model instanceof View) {
			View view = (View) model;
			EObject arc = view.getElement();
			if (arc != null && arc instanceof Arc) {
				IArcFigure figure = FigureExtensionsRegistry.getInstance()
						.createArc((Arc) arc);
				if (figure != null) {
					return figure;
				}
			}
		}
		return new org.pnml.tools.epnk.gmf.extensions.graphics.figures.ArcFigure(
				null);
	}

	/**
	 * @generated NOT (just the types are changed)
	 * @author eki
	 */
	public IArcFigure getPrimaryShape() {
		return (IArcFigure) getFigure();
	}

	/**
	 * Notifies the figure when some of its attributes have changes, so that the graphical
	 * appearance can properly be updated.
	 * 
	 * @generated NOT (added this method)
	 * @author eki
	 */
	@Override
	protected void handleNotificationEvent(Notification notification) {
		IArcFigure figure = getPrimaryShape();
		if (figure != null) {
			figure.update();
		}
		super.handleNotificationEvent(notification);
	}

	/**
	 * @generated NOT
	 * @author eki
	 */
	public abstract class ArcFigure implements IArcFigure {
		// This is actually not needed at all any more. But, it cannot be deleted completely;
		// otherwise a regeneration will generate it again (probably even incorrect). Therefore, 
		// I left this class here, empty; so as not to be regenerated with something stupid
		// when regenerating the GMF editor.

		/**
		 * @generated NOT
		 */
		public ArcFigure() {
		}

		/**
		 * @generated NOT
		 */
		@SuppressWarnings("unused")
		private RotatableDecoration createTargetDecoration() {
			return null;
		}

	}

}

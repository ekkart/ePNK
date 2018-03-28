package org.pnml.tools.epnk.diagram.edit.parts;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.handles.MoveHandle;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.runtime.notation.impl.DiagramImpl;
import org.eclipse.gmf.runtime.notation.impl.ShapeImpl;
import org.pnml.tools.epnk.diagram.edit.policies.PageCanonicalEditPolicy;
import org.pnml.tools.epnk.diagram.edit.policies.PageItemSemanticEditPolicy;
import org.pnml.tools.epnk.helpers.NetFunctions;
import org.pnml.tools.epnk.pnmlcoremodel.Node;
import org.pnml.tools.epnk.pnmlcoremodel.Page;
import org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage;
import org.pnml.tools.epnk.pnmlcoremodel.RefPlace;
import org.pnml.tools.epnk.pnmlcoremodel.RefTransition;
import org.pnml.tools.epnk.pnmlcoremodel.Transition;
import org.pnml.tools.epnk.pnmlcoremodel.TransitionNode;

/**
 * @generated
 */
public class PageEditPart extends DiagramEditPart {

	/**
	 * @generated
	 */
	public final static String MODEL_ID = "PNMLCoreModel"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 1000;

	/**
	 * @generated
	 */
	public PageEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new PageItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new PageCanonicalEditPolicy());
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.POPUPBAR_ROLE);
	}

	
	/* (non-Javadoc)
	 * @generated NOT
	 * @author ekki@dtu.dk (added this method in order to notify underlying Nodes when a RefPlace or RefTransition is deleted.
	 */
	@Override
	protected void handleNotificationEvent(Notification notification) {
		// super.handleNotificationEvent(notification);
		int eventType = notification.getEventType();
		Object object = notification.getNotifier();
		Object feature = notification.getFeature();
		Object model = this.getModel();
		EObject element = null;
		if (model instanceof DiagramImpl) {
			DiagramImpl shape = (DiagramImpl) model;
			element = shape.getElement();

		}
		if (object == element && object instanceof Page) {
			if (feature == PnmlcoremodelPackage.eINSTANCE.getPage_Object()) {
				if (eventType == Notification.REMOVE) {
					Object oldValue = notification.getOldValue();
					if (oldValue instanceof Node) {
						Node node = NetFunctions.resolve((Node) oldValue);
						if (node instanceof InternalEObject) {
							node.eNotify(new ENotificationImpl((InternalEObject) node, Notification.NO_FEATURE_ID, null, null, null));
						}
					}
				} else if(eventType == Notification.ADD) {
					Object newValue = notification.getNewValue();
					if (newValue instanceof Node) {
						Node node = NetFunctions.resolve((Node) newValue);
						if (node instanceof InternalEObject) {
							node.eNotify(new ENotificationImpl((InternalEObject) node, Notification.NO_FEATURE_ID, null, null, null));
						}
					}
				}
			}
		}
		super.handleNotificationEvent(notification);
	}

	
	/**
	 * @generated
	 */
	/*package-local*/static class NodeLabelDragPolicy extends
			NonResizableEditPolicy {

		/**
		 * @generated
		 */
		@SuppressWarnings("rawtypes")
		protected List createSelectionHandles() {
			MoveHandle h = new MoveHandle((GraphicalEditPart) getHost());
			h.setBorder(null);
			return Collections.singletonList(h);
		}

		/**
		 * @generated
		 */
		public Command getCommand(Request request) {
			return null;
		}

		/**
		 * @generated
		 */
		public boolean understandsRequest(Request request) {
			return false;
		}
	}

}

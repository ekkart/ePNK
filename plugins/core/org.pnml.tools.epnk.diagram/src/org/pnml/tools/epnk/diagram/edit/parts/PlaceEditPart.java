package org.pnml.tools.epnk.diagram.edit.parts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ResizableShapeEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.XYLayoutEditPolicy;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;
import org.pnml.tools.epnk.diagram.edit.parts.gef.extensions.figures.DefaultSizeNodeFigureWithFlexibleAnchors;
import org.pnml.tools.epnk.diagram.edit.policies.PlaceItemSemanticEditPolicy;
import org.pnml.tools.epnk.diagram.providers.PNMLCoreModelElementTypes;
import org.pnml.tools.epnk.gmf.extensions.graphics.IUpdateableFigure;
import org.pnml.tools.epnk.gmf.extensions.graphics.registry.FigureExtensionsRegistry;
import org.pnml.tools.epnk.pnmlcoremodel.Place;

/**
 * @generated
 */
public class PlaceEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2001;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public PlaceEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new PlaceItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		XYLayoutEditPolicy lep = new XYLayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = super.createChildEditPolicy(child);
				if (result == null) {
					return new ResizableShapeEditPolicy();
				}
				return result;
			}
		};
		return lep;
	}

	/**
	 * @generated NOT (added creation of the figure via the FigureExtensionRegistry)
	 * @author eki
	 */
	protected IFigure createNodeShape() {
		IFigure figure = null;
		Object model = getModel();
		if (model instanceof View) {
			View view = (View) model;
			EObject place = view.getElement();
			if (place != null && place instanceof Place) {
				figure = FigureExtensionsRegistry.getInstance().createPlace(
						(Place) place);
			}
		}
		if (figure == null) {
			figure = new org.pnml.tools.epnk.gmf.extensions.graphics.figures.PlaceFigure(
					null);
		}
		return primaryShape = figure;
	}

	/**
	 * @generated NOT
	 * @author eki (changed return type from PlaceFigure to IUpdateableFigure)
	 */
	public IUpdateableFigure getPrimaryShape() {
		return (IUpdateableFigure) primaryShape;
	}

	/**
	 * @generated NOT
	 * @author eki (for using the flexible anchors)
	 */
	protected NodeFigure createNodePlate() {
		// DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigureWithFlexibleAnchors(
				40, 40);
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(PNMLCoreModelElementTypes.Arc_4001);
		return types;
	}

	/**
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof org.pnml.tools.epnk.diagram.edit.parts.PlaceEditPart) {
			types.add(PNMLCoreModelElementTypes.Arc_4001);
		}
		if (targetEditPart instanceof RefPlaceEditPart) {
			types.add(PNMLCoreModelElementTypes.Arc_4001);
		}
		if (targetEditPart instanceof TransitionEditPart) {
			types.add(PNMLCoreModelElementTypes.Arc_4001);
		}
		if (targetEditPart instanceof Page2EditPart) {
			types.add(PNMLCoreModelElementTypes.Arc_4001);
		}
		if (targetEditPart instanceof RefTransitionEditPart) {
			types.add(PNMLCoreModelElementTypes.Arc_4001);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == PNMLCoreModelElementTypes.Arc_4001) {
			types.add(PNMLCoreModelElementTypes.Place_2001);
			types.add(PNMLCoreModelElementTypes.RefPlace_2002);
			types.add(PNMLCoreModelElementTypes.Transition_2003);
			types.add(PNMLCoreModelElementTypes.Page_2004);
			types.add(PNMLCoreModelElementTypes.RefTransition_2005);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(PNMLCoreModelElementTypes.Arc_4001);
		types.add(PNMLCoreModelElementTypes.LabelProxyObject_4004);
		return types;
	}

	/**
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == PNMLCoreModelElementTypes.Arc_4001) {
			types.add(PNMLCoreModelElementTypes.Place_2001);
			types.add(PNMLCoreModelElementTypes.RefPlace_2002);
			types.add(PNMLCoreModelElementTypes.Transition_2003);
			types.add(PNMLCoreModelElementTypes.Page_2004);
			types.add(PNMLCoreModelElementTypes.RefTransition_2005);
		} else if (relationshipType == PNMLCoreModelElementTypes.LabelProxyObject_4004) {
			types.add(PNMLCoreModelElementTypes.LabelProxy_2009);
		}
		return types;
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
		IUpdateableFigure figure = getPrimaryShape();
		if (figure != null) {
			figure.update();
		}
		super.handleNotificationEvent(notification);
	}

	/**
	 * @generated NOT
	 * @author eki
	 */
	public abstract class PlaceFigure extends Ellipse {

		// This is actually not needed at all any more. But, it cannot be deleted completely;
		// otherwise a regeneration will generate it again (probably even incorrect). Therefore, 
		// I left this class here, empty; so as not to be regenerated with something stupid
		// when regenerating the GMF editor.

		/**
		 * @generated
		 */
		public PlaceFigure() {
			this.setLayoutManager(new XYLayout());
			this.setLineWidth(1);
		}

		/**
		 * @generated
		 */
		private boolean myUseLocalCoordinates = false;

		/**
		 * @generated
		 */
		protected boolean useLocalCoordinates() {
			return myUseLocalCoordinates;
		}

		/**
		 * @generated
		 */
		protected void setUseLocalCoordinates(boolean useLocalCoordinates) {
			myUseLocalCoordinates = useLocalCoordinates;
		}

	}

}

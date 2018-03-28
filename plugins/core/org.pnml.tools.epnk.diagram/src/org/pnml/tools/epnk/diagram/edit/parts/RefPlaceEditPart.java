package org.pnml.tools.epnk.diagram.edit.parts;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
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
import org.eclipse.gmf.runtime.notation.impl.ShapeImpl;
import org.eclipse.swt.graphics.Color;
import org.pnml.tools.epnk.diagram.edit.parts.gef.extensions.figures.DefaultSizeNodeFigureWithFlexibleAnchors;
import org.pnml.tools.epnk.diagram.edit.policies.RefPlaceItemSemanticEditPolicy;
import org.pnml.tools.epnk.diagram.providers.PNMLCoreModelElementTypes;
import org.pnml.tools.epnk.helpers.NetFunctions;
import org.pnml.tools.epnk.pnmlcoremodel.Place;
import org.pnml.tools.epnk.pnmlcoremodel.PlaceNode;
import org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage;
import org.pnml.tools.epnk.pnmlcoremodel.RefPlace;
import org.pnml.tools.epnk.pnmlcoremodel.RefTransition;
import org.pnml.tools.epnk.pnmlcoremodel.Transition;
import org.pnml.tools.epnk.pnmlcoremodel.TransitionNode;

/**
 * @generated
 */
public class RefPlaceEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2002;

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
	public RefPlaceEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new RefPlaceItemSemanticEditPolicy());
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
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new RefPlaceFigure();
	}

	/**
	 * @generated
	 */
	public RefPlaceFigure getPrimaryShape() {
		return (RefPlaceFigure) primaryShape;
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
		if (targetEditPart instanceof PlaceEditPart) {
			types.add(PNMLCoreModelElementTypes.Arc_4001);
		}
		if (targetEditPart instanceof org.pnml.tools.epnk.diagram.edit.parts.RefPlaceEditPart) {
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

	/* (non-Javadoc)
	 * @see org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart#handleNotificationEvent(org.eclipse.emf.common.notify.Notification)
	 * @generated NOT
	 * @author ekki@dtu.dk (added this method in order to notify underlying Place of the change of a reference place pointing to it)
	 */
	@Override
	protected void handleNotificationEvent(Notification notification) {
		super.handleNotificationEvent(notification);
		Object object = notification.getNotifier();
		Object feature = notification.getFeature();
		if (object == refPlace &&
				!notification.isTouch() &&
				feature != PnmlcoremodelPackage.eINSTANCE.getRefPlace_Ref()) {
			Place resolved = NetFunctions.resolve(refPlace);
			if (resolved instanceof InternalEObject ) {
				resolved.eNotify(new ENotificationImpl((InternalEObject) resolved, Notification.NO_FEATURE_ID, null, null, null));
			}
		}
	}
	
	/**
	 * @generated
	 */
	public class RefPlaceFigure extends Ellipse {

		/**
		 * @generated
		 */
		public RefPlaceFigure() {
			this.setLayoutManager(new XYLayout());
			this.setLineWidth(1);
			this.setLineStyle(Graphics.LINE_DASH);
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
	
	/* The handleNotificationEvent method is not called anymore when the ref feature is unset when the
	 * RefPlace is removed. Therefore, we need to install our own listener and handler
	 * below, so that the Place it was referring can be notified of this change (so that the
	 * graphics is properly updated).
	 * 
	 */
	private RefPlace refPlace = null;
	private Adapter adapter = new Adapter() {

		@Override
		public Notifier getTarget() {
			return null;
		}

		@Override
		public boolean isAdapterForType(Object arg0) {
			return false;
		}

		@Override
		public void notifyChanged(Notification notification) {
			Object object = notification.getNotifier();
			Object feature = notification.getFeature();
			if (object != null && object == refPlace) {
				if (feature == PnmlcoremodelPackage.eINSTANCE.getRefPlace_Ref()) {
					Object oldValue = notification.getOldValue();
					PlaceNode oldRef =  null;
					if (oldValue instanceof PlaceNode) {
						oldRef = (PlaceNode) oldValue;
					}
					Object newValue = notification.getNewValue();
					PlaceNode newRef =  null;
					if (newValue instanceof PlaceNode) {
						newRef = (PlaceNode) newValue;
					}
					if (newRef != oldRef) {
						newRef = NetFunctions.resolve(newRef);
						if (newRef instanceof InternalEObject) {
							newRef.eNotify(new ENotificationImpl((InternalEObject) newRef, Notification.NO_FEATURE_ID, null, null, null));
						}
						oldRef = NetFunctions.resolve(oldRef);
						if (oldRef instanceof InternalEObject) {
							oldRef.eNotify(new ENotificationImpl((InternalEObject) oldRef, Notification.NO_FEATURE_ID, null, null, null));
						}
					}
				}
			}
		}

		@Override
		public void setTarget(Notifier arg0) {
		}
		
	};
	
	/* (non-Javadoc)
	 * @see org.eclipse.gef.editparts.AbstractEditPart#register()
	 */
	@Override
	protected void register() {
		super.register();
		Object model = this.getModel();
		if (model instanceof ShapeImpl) {
			ShapeImpl shape = (ShapeImpl) model;
			Object element = shape.getElement();
			if (element instanceof RefPlace) {
				refPlace = (RefPlace) element;
			}
		}
		if (refPlace != null && adapter != null) {
			refPlace.eAdapters().add(adapter);
		}
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gef.editparts.AbstractEditPart#unregister()
	 */
	@Override
	protected void unregister() {
		super.unregister();
		if (refPlace != null && adapter != null) {
			refPlace.eAdapters().remove(adapter);
		}
		refPlace = null;
	}

}

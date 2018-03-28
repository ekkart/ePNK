package org.pnml.tools.epnk.diagram.edit.parts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
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
import org.eclipse.swt.graphics.Image;
import org.pnml.tools.epnk.diagram.edit.policies.OpenGMFEditorOnPagePolicy;
import org.pnml.tools.epnk.diagram.edit.policies.Page2ItemSemanticEditPolicy;
import org.pnml.tools.epnk.diagram.providers.PNMLCoreModelElementTypes;
import org.pnml.tools.epnk.managers.graphics.resources.GraphicsResourcesManager;
import org.pnml.tools.epnk.pnmlcoremodel.Fill;
import org.pnml.tools.epnk.pnmlcoremodel.NodeGraphics;
import org.pnml.tools.epnk.pnmlcoremodel.Page;
import org.pnml.tools.epnk.pnmlcoremodel.presentation.MultipleEditorsInfo;
import org.pnml.tools.epnk.pnmlcoremodel.presentation.MultipleEditorsRegistry;

/**
 * @generated
 */
@SuppressWarnings("unchecked")
public class Page2EditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2004;

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
	public Page2EditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPoliciesGen() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new Page2ItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * Install openGMGEditorOnPage policy.
	 * 
	 * @generated NOT
	 * @author eki
	 * 
	 */
	protected void createDefaultEditPolicies() {
		createDefaultEditPoliciesGen();
		// eki: at the policy for opening the GMF diagram on a page
		installEditPolicy(EditPolicyRoles.OPEN_ROLE,
				new OpenGMFEditorOnPagePolicy());
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
	 * @generated NOT
	 */
	protected IFigure createNodeShape() {
		PageFigure figure = null;
		Object model = getModel();
		if (model instanceof View) {
			View view = (View) model;
			EObject object = view.getElement();
			if (object instanceof Page) {
				figure = new PageFigure((Page) object);
			}
		}
		if (figure == null) {
			figure = new PageFigure(null);
		}
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public PageFigure getPrimaryShape() {
		return (PageFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
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
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(PNMLCoreModelElementTypes.Arc_4001);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof PlaceEditPart) {
			types.add(PNMLCoreModelElementTypes.Arc_4001);
		}
		if (targetEditPart instanceof RefPlaceEditPart) {
			types.add(PNMLCoreModelElementTypes.Arc_4001);
		}
		if (targetEditPart instanceof TransitionEditPart) {
			types.add(PNMLCoreModelElementTypes.Arc_4001);
		}
		if (targetEditPart instanceof org.pnml.tools.epnk.diagram.edit.parts.Page2EditPart) {
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
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(PNMLCoreModelElementTypes.Arc_4001);
		types.add(PNMLCoreModelElementTypes.LabelProxyObject_4004);
		return types;
	}

	/**
	 * @generated
	 */
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
	 * @generated
	 */
	public class PageFigure extends RoundedRectangle {



		// @generated NOT
		private final Page page;

		/**
		 * @generated NOT
		 */
		public PageFigure(Page page) {
			this.page = page;
			this.setLayoutManager(new XYLayout());
			this.setCornerDimensions(new Dimension(getMapMode().DPtoLP(12),
					getMapMode().DPtoLP(12)));
			this.setLineWidth(2);
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

		// @generated NOT
		private boolean imageExists;

		@Override
		// @generated NOT
		protected void fillShape(Graphics graphics) {
			imageExists = false;
			org.pnml.tools.epnk.pnmlcoremodel.Graphics graphicsInfo = null;
			if (page != null) {
				graphicsInfo = page.getGraphics();
			}
			if (graphicsInfo != null && graphicsInfo instanceof NodeGraphics) {
				Fill fill = ((NodeGraphics) graphicsInfo).getFill();
				if (fill != null && fill.getImage() != null) {

					MultipleEditorsInfo info = MultipleEditorsRegistry
							.getInstance().getInfo(page);
					GraphicsResourcesManager graphicalResourceManager = info
							.getGraphicsResourcesManager();
					Image image = graphicalResourceManager.getImage(page, fill
							.getImage().toString());
					if (image != null) {
						org.eclipse.swt.graphics.Rectangle srcBounds = image
								.getBounds();
						Rectangle targetBounds = this.getBounds();
						graphics.drawImage(image, srcBounds.x, srcBounds.y,
								srcBounds.width, srcBounds.height,
								targetBounds.x, targetBounds.y,
								targetBounds.width, targetBounds.height);
						imageExists = true;
					}
				}
			}

			if (!imageExists) {
				super.fillShape(graphics);
			}
		}

		@Override
		// @generated NOT
		protected void outlineShape(Graphics graphics) {
			if (!imageExists) {
				super.outlineShape(graphics);
			}
		}

	}

}

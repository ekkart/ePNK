package geditor.diagram.edit.parts;

import java.awt.geom.Arc2D;

import geditor.Arc;
import geditor.diagram.edit.policies.ArcItemSemanticEditPolicy;
import geditor.diagram.edit.policies.BendpointEditPolicy;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.LayoutManager;
import org.eclipse.draw2d.Polygon;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.SWT;

/**
 * @generated
 */
/**
 * @author Radu Gatej(s111337)
 * 
 * All methods in this class which are not generated have been implemented by Radu Gatej
 * unless specified otherwise
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
	 * @generated NOT
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new ArcItemSemanticEditPolicy());
	}

	
	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model so
	 * you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated NOT
	 */
	protected Connection createConnectionFigure() {
		Arc figureElement = (Arc) this.getEdge().getElement();
		return new ArcFigure(figureElement);
	}

	/**
	 * @generated NOT
	 */
	public ArcFigure getPrimaryShape() {
		return (ArcFigure) getFigure();
	}

	/**
	 * @generated NOT
	 */
	public class ArcFigure extends PolylineConnectionEx {

		private Arc figureElement;

		public Arc getFigureElement() {
			return figureElement;
		}

		public ArcFigure(Arc figureElement) {
			this.figureElement = figureElement;
		}

		/**
		 * @generated NOT
		 */
		@Override
		public PointList getPolygonPoints() {

			PointList controlPoints = new PointList();
			Point startPoint = new Point(
					this.getPoints().getFirstPoint().x, this.getPoints()
							.getFirstPoint().y);
			controlPoints.addPoint(startPoint);
			controlPoints.addAll(this.getPoints());
			Point endPoint = new Point(this.getPoints().getLastPoint().x,
					this.getPoints().getLastPoint().y);
			controlPoints.addPoint(endPoint);
			CurveCreator curveCreator = new CurveCreator(controlPoints);
			return curveCreator.getPolygonPoints();

		}

		/**
		 * @generated NOT 
		 */
		@Override
		protected void outlineShape(Graphics g) {
			PointList polygonPoints = this.getPolygonPoints();
			Point one = polygonPoints.getPoint(
					polygonPoints.size() - 1);
			Point two = polygonPoints.getPoint(
					polygonPoints.size() - 2);

			g.drawPolyline(polygonPoints);
			g.drawPolyline(getArrowHeadPointList(one, two));
		}

		/**
		 * @generated NOT 
		 */
		@Override
		public Rectangle getBounds() {

			if (bounds != null) {
				Polygon pol = new Polygon();
				
				pol.setPoints(getPolygonPoints());
				Point one = this.getPolygonPoints().getPoint(
						this.getPolygonPoints().size() - 1);
				Point two = this.getPolygonPoints().getPoint(
						this.getPolygonPoints().size() - 2);
				PointList arrowList = getArrowHeadPointList(one, two);
				for(int i=0;i<arrowList.size();i++) {
					pol.addPoint(arrowList.getPoint(i));
				}
				return pol.getBounds();
			} else {
				return super.getBounds();
			}
		}

		/**
		 * @author: Magnus Tryggvason(s093265)
		 * @param one
		 * @param two
		 * @return
		 * @generated NOT
		 */
		public PointList getArrowHeadPointList(Point one, Point two) {
			PointList arrowHead = new PointList();
			Point arrowEnd1 = new Point();
			Point arrowEnd2 = new Point();
			double headSize = 10;
			double angle = Math.atan2((one.y - two.y), (one.x - two.x));
			double endAngle1 = angle + 45 * Math.PI / 180;
			double endAngle2 = angle - 45 * Math.PI / 180;
			arrowEnd1.y = (int) (one.y - headSize * Math.sin(endAngle1));
			arrowEnd2.y = (int) (one.y - headSize * Math.sin(endAngle2));
			arrowEnd1.x = (int) (one.x - headSize * Math.cos(endAngle1));
			arrowEnd2.x = (int) (one.x - headSize * Math.cos(endAngle2));
			arrowHead.addPoint(arrowEnd1);
			arrowHead.addPoint(one);
			arrowHead.addPoint(arrowEnd2);

			return arrowHead;

		}

	}

}

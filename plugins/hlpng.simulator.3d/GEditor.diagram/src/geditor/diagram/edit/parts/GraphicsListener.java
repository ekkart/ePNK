package geditor.diagram.edit.parts;

import geditor.Arc;
import geditor.GeditorFactory;
import geditor.Point;
import geditor.diagram.edit.parts.ArcEditPart.ArcFigure;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.Bendpoints;
import org.eclipse.gmf.runtime.notation.Bounds;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.LayoutConstraint;
import org.eclipse.gmf.runtime.notation.Location;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.RelativeBendpoints;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.runtime.notation.datatype.RelativeBendpoint;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.PlatformUI;

/**
 * @author Radu Gatej(s111337)
 * 
 * All non-generated methods in this class have been created by Radu Gatej
 * unless stated otherwise
 * 
 * This implementation also contains some parts taken from the class
 * GraphicsElementListener from the ePNK project.
 * 
 * @generated NOT
 */
public class GraphicsListener extends EContentAdapter {

	private static final int NODE_SIZE = 5;
	private NotificationFilter ModifiedFilter;
	private List<Point> controlPoints;

	public GraphicsListener() {
		ModifiedFilter = NotificationFilter
				.createEventTypeFilter(Notification.SET)
				.or(NotificationFilter
						.createEventTypeFilter(Notification.UNSET))
				.or(NotificationFilter.createEventTypeFilter(Notification.ADD))
				.or(NotificationFilter
						.createEventTypeFilter(Notification.REMOVE));
		controlPoints = new ArrayList();
	}

	@Override
	public void notifyChanged(Notification notification) {
		if (notification.getNotifier() instanceof EObject) {
			super.notifyChanged(notification);
		}
		if (ModifiedFilter.matches(notification)
				&& (notification instanceof ENotificationImpl)
				&& (notification.getNotifier() instanceof EObject)) {

			ENotificationImpl eNotification = (ENotificationImpl) notification;
			EObject eNotifier = (EObject) eNotification.getNotifier();

			if (NotationPackage.eINSTANCE.getLocation().isSuperTypeOf(
					eNotifier.eClass())) {

				View view = (View) eNotifier.eContainer();
				EObject modelElement = view.getElement();

				if (view instanceof org.eclipse.gmf.runtime.notation.Node) {
					org.eclipse.gmf.runtime.notation.Node viewNode = (org.eclipse.gmf.runtime.notation.Node) view;

					if ((modelElement instanceof Point)) {
						Point modelNode = (Point) modelElement;
						updateModelPoint(viewNode, modelNode);
					}

				}
			} else if (eNotifier instanceof RelativeBendpoints) {
				EObject object = eNotifier.eContainer();
				if (object instanceof Edge) {
					Edge edge = (Edge) object;
					object = edge.getElement();
					updateModelControlPoints();
				}
			}
		}
	}

	private void updateModelControlPoints() {
		// Get the selected element on the canvas
		ISelection selection = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getSelectionService()
				.getSelection();

		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			if (structuredSelection.size() == 1) {

				// Case of connection selection
				if (structuredSelection.getFirstElement() instanceof ArcEditPart) {
					ArcEditPart arcEditPart = (ArcEditPart) structuredSelection
							.getFirstElement();
					updateArcControlPoints(arcEditPart);

				}
				// Case of node selection
				else if (structuredSelection.getFirstElement() instanceof PointEditPart) {
					PointEditPart pointEditPart = (PointEditPart) structuredSelection
							.getFirstElement();
					if (pointEditPart.getModel() instanceof org.eclipse.gmf.runtime.notation.Node) {
						org.eclipse.gmf.runtime.notation.Node viewNode = (Node) pointEditPart
								.getModel();

						for (java.lang.Object child : viewNode.getSourceEdges()) {
							updateEdge(pointEditPart, child);
						}

						for (java.lang.Object child : viewNode.getTargetEdges()) {
							updateEdge(pointEditPart, child);
						}
					}
				}
			}
		}
	}

	private void updateEdge(PointEditPart pointEditPart, java.lang.Object child) {
		if (child instanceof Edge) {
			Edge edge = (Edge) child;
			EObject element = edge.getElement();
			if (element != null && element instanceof Arc) {
				if (pointEditPart.getViewer().getEditPartRegistry().get(edge) instanceof ArcEditPart) {
					ArcEditPart arcEditPart = (ArcEditPart) pointEditPart
							.getViewer().getEditPartRegistry().get(edge);
					updateArcControlPoints(arcEditPart);
				}
			}
		}
	}

	private void updateArcControlPoints(ArcEditPart arcEditPart) {
		ArcFigure arcFigure = arcEditPart.getPrimaryShape();
		Arc connectionArc = arcFigure.getFigureElement();

		GeditorFactory geometryFactory = GeditorFactory.eINSTANCE;
		connectionArc.getControlPoints().clear();

		// add Catmull Rom curve invisible first point
		Point firstInvisiblePoint = geometryFactory.createPoint();
		firstInvisiblePoint.setX(connectionArc.getStart().getX());
		firstInvisiblePoint.setZ(connectionArc.getStart().getZ());
		connectionArc.getControlPoints().add(firstInvisiblePoint);

		// add the ArcFigure control points
		for (int i = 0; i < arcFigure.getPoints().size(); i++) {
			Point controlPoint = geometryFactory.createPoint();
			controlPoint.setX(arcFigure.getPoints().getPoint(i).x);
			controlPoint.setZ(arcFigure.getPoints().getPoint(i).y);
			connectionArc.getControlPoints().add(controlPoint);
		}
		// change the arc starting and ending points so that they correspond to
		// the ones from the Point model object
		Point firstVisiblePoint = geometryFactory.createPoint();
		firstVisiblePoint.setX(connectionArc.getStart().getX());
		firstVisiblePoint.setZ(connectionArc.getStart().getZ());
		connectionArc.getControlPoints().set(1, firstVisiblePoint);

		Point lastVisiblePoint = geometryFactory.createPoint();
		lastVisiblePoint.setX(connectionArc.getEnd().getX());
		lastVisiblePoint.setZ(connectionArc.getEnd().getZ());
		connectionArc.getControlPoints().set(arcFigure.getPoints().size(),
				lastVisiblePoint);

		// add Catmull Rom curve invisible last point
		Point lastInvisiblePoint = geometryFactory.createPoint();
		lastInvisiblePoint.setX(connectionArc.getEnd().getX());
		lastInvisiblePoint.setZ(connectionArc.getEnd().getZ());
		connectionArc.getControlPoints().add(lastInvisiblePoint);

	}

	private void updateModelPoint(
			org.eclipse.gmf.runtime.notation.Node viewNode, Point modelNode) {
		LayoutConstraint layout = viewNode.getLayoutConstraint();
		if (layout != null) {
			if (layout instanceof Bounds) {
				Bounds bounds = (Bounds) layout;
				modelNode.setX(bounds.getX() + NODE_SIZE);
				modelNode.setZ(bounds.getY() + NODE_SIZE);
			} else if (layout instanceof Location) {
				Location location = (Location) layout;
				modelNode.setX(location.getX());
				modelNode.setZ(location.getY());
			}
			updateModelControlPoints();
		}

	}

}

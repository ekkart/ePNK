package org.pnml.tools.epnk.applications.ui.figures;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.PolylineShape;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;

public class PolylineOverlay extends PolylineShape {

	final private PolylineConnectionEx figure;
	final private ConnectionNodeEditPart editPart;

	public PolylineOverlay(ConnectionNodeEditPart editPart)  {
		super();
		this.editPart = editPart;
		this.figure = (PolylineConnectionEx) editPart.getFigure();
		setForegroundColor(ColorConstants.red);
		setBackgroundColor(ColorConstants.red);
		setAlpha(150);
		setLineWidth(5);
		setTolerance(40);
		// setLineStyle(2); // would be dashed
	}

	public GraphicalEditPart getEditPart() {
		return editPart;
	}

	@Override
	public boolean containsPoint(int x, int y) {
		return figure.containsPoint(x, y);
	}

	@Override
	protected void fillShape(Graphics graphics) {
		graphics.pushState();
		// the following are set automatically:
		// graphics.setForegroundColor(getForegroundColor());
		// graphics.setBackgroundColor(getBackgroundColor());
		// graphics.setAlpha(getAlpha());
		
		// the following are not set automatically
		graphics.setLineWidth(getLineWidth());
		graphics.setLineStyle(getLineStyle());

		PointList list = figure.getPolygonPoints();
		graphics.drawPolyline(list);
		graphics.popState();
	}

	@Override
	public Rectangle getBounds() {
		Rectangle bounds = figure.getBounds();
		return bounds;
	}

}

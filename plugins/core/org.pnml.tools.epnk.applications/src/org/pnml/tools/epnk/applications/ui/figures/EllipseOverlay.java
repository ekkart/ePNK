package org.pnml.tools.epnk.applications.ui.figures;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.GraphicalEditPart;

public class EllipseOverlay extends Ellipse {

	final private IFigure figure;
	final private GraphicalEditPart editPart;

	public EllipseOverlay(GraphicalEditPart editPart)  {
		super();
		this.editPart = editPart;
		this.figure = editPart.getFigure();
		setForegroundColor(ColorConstants.red);
		setBackgroundColor(ColorConstants.red);
		setAlpha(150);
		setLineWidth(4);
	}

	public GraphicalEditPart getEditPart() {
		return editPart;
	}

	@Override
	public Rectangle getBounds() {
		Rectangle bounds = figure.getBounds();
		int x = bounds.x - 3;
		int y = bounds.y - 3;
		int width = bounds.width + 6;
		int height = bounds.height + 6;
		bounds = new Rectangle(x,y,width, height);
		return bounds;
	}

}

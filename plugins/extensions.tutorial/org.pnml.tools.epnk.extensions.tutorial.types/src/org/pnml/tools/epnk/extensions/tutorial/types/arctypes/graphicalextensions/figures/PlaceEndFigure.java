package org.pnml.tools.epnk.extensions.tutorial.types.arctypes.graphicalextensions.figures;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Rectangle;
import org.pnml.tools.epnk.gmf.extensions.graphics.figures.PlaceFigure;
import org.pnml.tools.epnk.pnmlcoremodel.Place;

/** 
 * Simple extension of the Figure for places that indicates end places with a cross. Just
 * for test purposes.
 * 
 * @generated NOT
 * @author eki
 *
 */
public class PlaceEndFigure extends PlaceFigure {

	public PlaceEndFigure(Place place) {
		super(place);
	}

	@Override
	public void update() {
		this.repaint();
	}
	
	@Override
	protected void fillShape(Graphics graphics) {
		super.fillShape(graphics);
		if (place.getOut().size() == 0) {
			// Herw, we put in a "criss", if there are no out-going arcs, just for
			// the purpose of showing something
			
			// First, get the location and dimension of the place as a rectangle
			Rectangle rectangle = this.getClientArea();
			
			// Now, draw the two diagonal lines
			graphics.drawLine(rectangle.x, rectangle.y, 
					rectangle.x + rectangle.width, rectangle.y + rectangle.height);
			graphics.drawLine(rectangle.x, rectangle.y + rectangle.height,
					rectangle.x + rectangle.width, rectangle.y);
		}
	}

}

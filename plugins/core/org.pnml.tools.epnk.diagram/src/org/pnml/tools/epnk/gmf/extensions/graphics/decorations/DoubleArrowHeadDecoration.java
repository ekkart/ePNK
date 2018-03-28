package org.pnml.tools.epnk.gmf.extensions.graphics.decorations;

import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;

/**
 * This is an arrow head decoration with a double arrow head.
 * 
 * @author ekki@dtu.dk
 */
public class DoubleArrowHeadDecoration extends PolygonDecoration {

	private static final PointList DOUBLE_ARROW = new PointList();
	
	static {
		DOUBLE_ARROW.addPoint(  0,  0);
		DOUBLE_ARROW.addPoint(-12,  4);
		DOUBLE_ARROW.addPoint( -8,  1);
		DOUBLE_ARROW.addPoint(-16,  4);
		DOUBLE_ARROW.addPoint(-11,  0);
		DOUBLE_ARROW.addPoint(-16, -4);
		DOUBLE_ARROW.addPoint( -8, -1);
		DOUBLE_ARROW.addPoint(-12, -4);
	}
	
	public DoubleArrowHeadDecoration() {
		super();
		this.setScale(1, 1);
		this.setTemplate(DOUBLE_ARROW);
	}
	
	@Override
	public Rectangle getBounds() {
		// The bounding box computed by PolygonDecoration (actually by Polyline) is a 
		// bit too tight for the double arrow head shape (with very pointed angles);
		// therefore, a slightly bigger bounding box is computed here!
		if (bounds == null) {
			int expand = (int) (getLineWidthFloat()) + 1;
			bounds = getPoints().getBounds().getExpanded(expand, expand);
		}
		return bounds;
	}

}

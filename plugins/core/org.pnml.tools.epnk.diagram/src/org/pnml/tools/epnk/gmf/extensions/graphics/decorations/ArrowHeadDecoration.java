package org.pnml.tools.epnk.gmf.extensions.graphics.decorations;

import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;

/**
 * This is the class for the default arrow head decoration of the graphical editor of the ePNK.
 * It replaces the deprecated class {@link ReisigArrowHeadDecoration} by a more elegant implementation.
 * 
 * @author ekki@dtu.dk
 */
public class ArrowHeadDecoration extends PolygonDecoration {

	private static final PointList ARROW = new PointList();
	
	static {
		ARROW.addPoint(  0,  0);
		ARROW.addPoint(-12,  4);
		ARROW.addPoint( -7,  0);
		ARROW.addPoint(-12, -4);
	}
	
	public ArrowHeadDecoration() {
		super();
		this.setScale(1, 1);
		this.setTemplate(ARROW);
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

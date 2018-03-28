package org.pnml.tools.epnk.gmf.extensions.graphics.decorations;

import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;

/**
 * This is a decoration with a circle for defining lolly-pop arcs.
 * 
 * @author eki
 */
public class CircleDecoration extends Ellipse implements RotatableDecoration {
	
	private double radius = 5.0d;
	
	public CircleDecoration() {
		super();
		this.setSize(new Dimension((int) (radius*2.0d)+1, (int) (radius*2.0d)+1));
	}
	
    /**
     * In order to calculate the location, we need to calculate the position from the
     * setLocation method and the setReferencePoint command. The first position is
     * stored in this attribute. 
     */
	private Point p1;
	
	public void setLocation (Point p){
		// just store the position
		p1 = p;
	}

	public void setReferencePoint(Point p) {
		// Calculate the position from p1 and the reference point; the math is not difficult;
		// you just need to get it right!
		int x1 = p.x - p1.x;
		int y1 = p.y - p1.y;
		if (x1 != 0) {
			double x = radius / Math.sqrt(1 + (y1*y1)/(x1*x1)) * Math.signum(x1);
			double y =  x*y1/x1;
			super.setLocation(new Point(p1.x + x - radius - 1, p1.y + y - radius - 1));
		} else if (y1 != 0) {
			double y = radius / Math.sqrt(1 + (x1*x1)/ (y1*y1)) * Math.signum(y1);
			double x =  y*x1/y1;
			super.setLocation(new Point(p1.x + x - radius - 1, p1.y + y - radius - 1));
		} else {
			super.setLocation(p1);
		}
	}
}

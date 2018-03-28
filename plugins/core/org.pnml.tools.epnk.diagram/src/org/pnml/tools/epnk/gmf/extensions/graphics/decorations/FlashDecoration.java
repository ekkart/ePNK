package org.pnml.tools.epnk.gmf.extensions.graphics.decorations;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.swt.graphics.Color;

/**
 * This is a decoration with flash symbol, which can be used for signal arcs.
 * Note that this goes to the middle of arc segment; and it is designed to be
 * used as a decorator of the arc's source.
 * 
 * @author eki
 */
public class FlashDecoration extends RectangleFigure implements RotatableDecoration {
	
	/**
	 * The width of the half signal symbol.
	 */
	private final double x  = 4;
	
	/**
	 * The height of the signal symbol.
	 */
	private final double y = 9;
	
	public FlashDecoration() {
		super();
		this.setSize((int)(2.0d*y+3), (int) (2.0d*y+3));
	}

	/**
     * In order to calculate the location, we need to calculate the position from the
     * setLocation method and the setReferencePoint command. The first position is
     * stored in this attribute. 
     */
	private Point pl;
	
	public void setLocation (Point p){
		// just store the position
		pl = p;
	}
	
    private Point p1;
    private Point p2;
    private Point p3;
    private Point p4;

	public void setReferencePoint(Point p) {
		if (pl != null) {
        setCenter((p.x+pl.x)*0.5d,(p.y+pl.y)*0.5d);
        setAngle(pl.x, pl.y, p.x, p.y);
		} else {
			setCenter(p.x,p.y);
		}
        
		// Calculate the points of the flash
        p1 = getPoint(-x,0);
        p2 = getPoint(0,y);
        p3 = getPoint(0,-y);
        p4 = getPoint(x,0);
                        
		super.setLocation(getTopLeft());
	}
	
	@Override
	public void paintFigure(Graphics graphics) {
		// eki: We do not even draw the rectangle here! We do not 
		//      call the paintFigure of the super class (we just use
		//      this figure as a vehicle to use the paintFigure method
		//      to draw the flash (admittedly an abuse of the
		//      RectangleFigure)!
		//      
		//      NOTE that, if you want to add own graphics in an
		//      extension of a Shape, this would normally be done in
		//      the fillShape() and fillOutline() method. We can only
		//      use the paintFigure here, because we DO NOT propagate
		//      the call up the inheritance hierarchy. If you decide
		//      to do both, YOU ARE ON YOUR OWN! Don't say you learned
		//      that from me.
		
		// if the points exist render the flash symbol
		if (p1 != null && p2 != null && p3 != null & p4 != null) {
			// paint over the part of the connection that will
			// we equipped with the flash symbol:
			PointList list = new PointList();
			list.addPoint(p1);
			list.addPoint(p2);
			list.addPoint(p4);
			list.addPoint(p3);
			// remember foreground colour
			Color c = graphics.getForegroundColor();
			// because we temporarily use the background colour to
			// paint over the connection with the polygon
			graphics.setForegroundColor(graphics.getBackgroundColor());
			graphics.fillPolygon(list);
			// re-establish the original foreground colour
			graphics.setForegroundColor(c);

            // Now draw the actual flash symbol
			graphics.setLineWidth(this.getLineWidth());
			graphics.drawLine(p1,p2);
			graphics.drawLine(p2,p3);
			graphics.drawLine(p3,p4);
		}
	}
    
    // Transformation parameters (set by setCenter and setAngle)
	// these could probably used for other decorations too 
    private double cx = 0.0d;
    private double cy = 0.0d;

    private double sinAlpha = 0.0d;
    private double cosAlpha = 1.0d;

    private void setCenter(double cx, double cy) {
    	this.cx = cx;
    	this.cy = cy;
    }

    private void setAngle(double lx, double ly, double rx, double ry) {
    	double dx = rx - lx;
    	double dy = ry - ly;
    	
    	double length = Math.sqrt(dx*dx + dy*dy);
    	
    	sinAlpha = dx / length;
    	cosAlpha = dy / length;
    }

    private Point getPoint(double x, double y) {
    	double xn = x * sinAlpha - y * cosAlpha + cx;
    	double yn = x * cosAlpha + y * sinAlpha + cy;
    	return new Point(xn,yn);
    }
    
    private Point getTopLeft() {
    	Dimension dimension = this.getSize();
    	return new Point(cx - dimension.width/2.0d - 1, cy - dimension.height/2.0d - 1);
    }

}

package org.pnml.tools.epnk.extensions.tutorial.types.arctypes.graphicalextensions.figures;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.Polyline;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.pnml.tools.epnk.gmf.extensions.graphics.figures.TransitionFigure;
import org.pnml.tools.epnk.pnmlcoremodel.Transition;

/** 
 * Simple extension of the Figure for transitions as an example how an
 * extension for node figures could look like. Note that this version
 * is more complicated that the example PlaceEndFigure; in most case,
 * the example for the PlaceEndFigure would probably be the easiest
 * way to implement a figure. So, have a look at the PlaceEndFigure
 * first!
 * 
 * @generated NOT
 * @author eki
 *
 */
public class TransitionEndFigure extends TransitionFigure {

	private boolean end;
	
	private Polyline line1;
	private Polyline line2;
	
	private boolean init;

	public TransitionEndFigure(Transition transition) {
		super(transition);
		
		end = false;
		init = true;

		line1 = new Polyline();
		line2 = new Polyline();
	}

	@Override
	public void update() {
		boolean oldEnd = end;
		end = (transition.getOut().size() == 0);

		if (oldEnd != end) {
			if (! end) {
				this.remove(line1);
				this.remove(line2);
			} else {
				updateLines();
				this.add(line1);
				this.add(line2);
			}
		}
	}
	
	private int x1 = 0;
	private int y1 = 0;
	private int x2 = 0;
	private int y2 = 0;

    private void updateLines() {
    	if (end) {
    		Rectangle rectangle = this.getBounds();
    		Point tl = rectangle.getTopLeft();
    		Point br = rectangle.getBottomRight();
    		if (tl.x != x1 || tl.y != y1 || br.x != x2 || br.y != y2) {
    			line1.removeAllPoints();
    			line1.addPoint(tl);
    			line1.addPoint(rectangle.getBottomRight());

    			line2.removeAllPoints();
    			line2.addPoint(rectangle.getBottomLeft());
    			line2.addPoint(rectangle.getTopRight());
    			
    			x1 = tl.x;
    			y1 = tl.y;
    			x2 = br.x;
    			y2 = br.y;
    		}
    	}
    }

	@Override
	public void validate() {
		if (init) {
			update();
			init = false;
		}
		super.validate();
	}

	@Override
	public void paint(Graphics graphics) {
		// Note that you never ever should use the graphics parameter
		// here to draw something directly (this is "strictly not recommended"
		// by Draw2D in Shapes, which is extended by TransitionFigure and
		// most figures used and provided by GMF. If you want to draw something
		// directly, do it by overriding the fillShape or fillOutline methods;
		// see PlaceEndFigure for an example (which is the more elegant and
		// more easy of doing this anyway) 
		updateLines();
		super.paint(graphics);
	}

}

package dk.dtu.compute.mbse.tutorial.yawl.graphics.figures;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;
import org.pnml.tools.epnk.gmf.extensions.graphics.figures.PlaceFigure;
import org.pnml.tools.epnk.pnmlcoremodel.Place;

import dk.dtu.compute.mbse.yawl.CType;
import dk.dtu.compute.mbse.yawl.functions.YAWLFunctions;

/**
 * The class implementing the graphical representation for YAWL conditions. 
 * 
 * @generated NOT
 * @author ekki@dtu.dk
 */
public class YAWLConditionFigure extends PlaceFigure {

	public YAWLConditionFigure(Place place) {
		super(place);

	}

	@Override
	public void update() {
		this.repaint();
	}

	@Override
	protected void fillShape(Graphics graphics) {
		super.fillShape(graphics);
		
		CType type = YAWLFunctions.getType(place);
		Rectangle rectangle = this.getClientArea();
		int d1 = rectangle.width / 3;
		int d2 = rectangle.width / 3;
		
		if (type.equals(CType.START)) {
			graphics.pushState();
			// Obtain default colour for green from OS (this way, we
			// do not need to dispose it later)
			Display display = Display.getCurrent();
			Color green = display.getSystemColor(SWT.COLOR_GREEN);
			graphics.setBackgroundColor(green);
			graphics.setLineWidth(1);
			int x1 = 1+rectangle.x + d1;
			int y1 = rectangle.y + d2;
			int x2 = 2+rectangle.x + 2*d1;
			int y2 = rectangle.y + rectangle.height/2;
			int x3 = x1;
			int y3 = rectangle.y + 2*d2;
			graphics.fillPolygon(new int[]{x1,y1, x2,y2, x3, y3});
			graphics.drawPolygon(new int[]{x1,y1, x2,y2, x3, y3});
			graphics.popState();
		} else if (type.equals(CType.FINISH)) {
			graphics.pushState();
			// Obtain default colour for red from OS (this way, we
			// do not need to dispose it later)
			Display display = Display.getCurrent();
			Color red = display.getSystemColor(SWT.COLOR_RED);
			graphics.setLineWidth(1);
			graphics.setBackgroundColor(red);
			graphics.fillRectangle(rectangle.x + d1, rectangle.y + d2, d1, d2);
			graphics.drawRectangle(rectangle.x + d1, rectangle.y + d2, d1, d2);
			graphics.popState();
		}
	}

}

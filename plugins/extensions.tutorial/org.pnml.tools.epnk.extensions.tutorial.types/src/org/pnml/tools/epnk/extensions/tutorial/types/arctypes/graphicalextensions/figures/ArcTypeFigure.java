package org.pnml.tools.epnk.extensions.tutorial.types.arctypes.graphicalextensions.figures;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.draw2d.Shape;
import org.pnml.tools.epnk.extensions.tutorial.types.arctypes.arctypes.Arc;
import org.pnml.tools.epnk.extensions.tutorial.types.arctypes.arctypes.ArcType;
import org.pnml.tools.epnk.extensions.tutorial.types.arctypes.arctypes.TYPE;
import org.pnml.tools.epnk.gmf.extensions.graphics.decorations.ArrowHeadDecoration;
import org.pnml.tools.epnk.gmf.extensions.graphics.decorations.CircleDecoration;
import org.pnml.tools.epnk.gmf.extensions.graphics.decorations.FlashDecoration;
import org.pnml.tools.epnk.gmf.extensions.graphics.figures.ArcFigure;

/**
 * Simple extension of the Figure for arcs.
 * 
 * @generated NOT (created manually)
 * @author eki
 */
public class ArcTypeFigure extends ArcFigure {
	
	private TYPE type;
	
	public ArcTypeFigure(Arc arc) {
		super(arc);
        setType();
	}
	
	@Override
	public void update() {
		setType();
	}
	
	/**
	 * This method does the whole update job for this figure.
	 */
	private void setType() {
		// Find out whether their was a change of the type in the arc.
		ArcType arcTypeAttribute = null;
		if (arc instanceof Arc) { 
			arcTypeAttribute = ((Arc)arc).getType();
		}
		TYPE oldType = type;
		if (arcTypeAttribute != null) {
			type = arcTypeAttribute.getText();
		} else {
			type = TYPE.NORMAL;
		}
		
		// do a change in the figure only when there was a change in the type attribute
		if (type != oldType) {
			if (type.equals(TYPE.NORMAL)) {
				this.setLineStyle(Graphics.LINE_SOLID);
			} else if (type.equals(TYPE.INHIBIT)) {
				this.setLineStyle(Graphics.LINE_DASHDOTDOT);
			} else if (type.equals(TYPE.READ)) {
				this.setLineStyle(Graphics.LINE_DOT);
			} else if (type.equals(TYPE.SIGNAL)) {
				// this.setLineStyle(Graphics.LINE_DASH);
				this.setLineStyle(Graphics.LINE_SOLID);
			}
		} 
		setTargetDecoration();
	}
	
	private void setTargetDecoration() {
		RotatableDecoration targetDecorator = null;
		RotatableDecoration sourceDecorator = null;

		if (type.equals(TYPE.NORMAL)) {
			// targetDecorator = new PolylineDecoration();
			targetDecorator = new ArrowHeadDecoration();

		} else if (type.equals(TYPE.INHIBIT)) {
			targetDecorator = new CircleDecoration();
		} else if (type.equals(TYPE.READ)) {
			// none
		} else if (type.equals(TYPE.SIGNAL)) {
			// targetDecorator = new PolylineDecoration();
			targetDecorator = new ArrowHeadDecoration();
			sourceDecorator = new FlashDecoration();
			// sourceDecorator = new CircleDecoration();
		}
		
		if (targetDecorator != null && targetDecorator instanceof Shape ) {
			((Shape) targetDecorator).setLineWidth(this.getLineWidth());
		}
		this.setTargetDecoration(targetDecorator);
		this.setSourceDecoration(sourceDecorator);

	}

}

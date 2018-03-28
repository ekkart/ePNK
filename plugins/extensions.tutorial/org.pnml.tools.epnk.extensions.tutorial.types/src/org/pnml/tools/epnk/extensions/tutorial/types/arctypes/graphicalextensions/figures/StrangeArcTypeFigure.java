package org.pnml.tools.epnk.extensions.tutorial.types.arctypes.graphicalextensions.figures;

import org.eclipse.draw2d.Graphics;
import org.pnml.tools.epnk.gmf.extensions.graphics.decorations.CircleDecoration;
import org.pnml.tools.epnk.gmf.extensions.graphics.decorations.FlashDecoration;
import org.pnml.tools.epnk.gmf.extensions.graphics.figures.ArcFigure;
import org.pnml.tools.epnk.pnmlcoremodel.Arc;

/**
 * Simple extension of the Figure for arcs.
 * 
 * @generated NOT (created manually)
 * @author eki
 */
public class StrangeArcTypeFigure extends ArcFigure {
	
	public StrangeArcTypeFigure(Arc arc) {
		super(arc);

		this.setLineStyle(Graphics.LINE_DOT);
		this.setTargetDecoration(new CircleDecoration());
		this.setSourceDecoration(new FlashDecoration());
	}

}

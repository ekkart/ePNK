package org.pnml.tools.epnk.diagram.edit.parts.gef.extensions.figures;

import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.PrecisionPoint;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gmf.runtime.draw2d.ui.figures.IOvalAnchorableFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.SlidableAnchor;
import org.eclipse.gmf.runtime.gef.ui.figures.SlidableOvalAnchor;

/**
 * This class extends the standard GMF Node Figure so that it uses anchors dependent on
 * the edit parts primary shape. For ellipses, it uses SlidableOvalFigures (connections end
 * at the ellipse within the rectangle that bounds the figure); for all
 * other figures, it uses SlidableAnchors (connections end at the rectangle that
 * bounds the figure). This together with the ReisigsArrowHeadDecration is a feature dedicated to
 * Wolfgang Reisig and his rules on how to draw nice Petri nets.
 * 
 * @generated NOT
 * @author eki
 */
public class DefaultSizeNodeFigureWithFlexibleAnchors extends DefaultSizeNodeFigure implements IOvalAnchorableFigure {

	private boolean isFirst = true;
	private boolean isEllipse = false;

	public DefaultSizeNodeFigureWithFlexibleAnchors(Dimension defSize) {
		super(defSize);
	}

	public DefaultSizeNodeFigureWithFlexibleAnchors(int width, int height) {
		super(width, height);
	}

	@Override
	protected ConnectionAnchor createAnchor(PrecisionPoint p) {
		// eki: this is mostly a copy of the same method in the super class
		if (p==null)
			// If the old terminal for the connection anchor cannot be resolved (by SlidableAnchor) a null
			// PrecisionPoint will passed in - this is handled here
			return createDefaultAnchor();
		// eki: added the next three lines for adding an SlidableOvalAnchor, if the figure is an ellipse
		if (isEllipse) {
			return new SlidableOvalAnchor(this, p);
		}
		return new SlidableAnchor(this, p);
	}

	@Override
	public Rectangle getOvalBounds() {
		return this.getBounds();
	}

	@Override
	protected ConnectionAnchor createDefaultAnchor() {
		// eki: added the next three lines for adding an SlidableOvalAnchor, if the figure is an ellipse
		if (isEllipse) {
			return new SlidableOvalAnchor(this);
		}
		return new SlidableAnchor(this);
	}

	@Override
	public void add(IFigure figure, Object constraint, int index) {
		// eki: keep track of which figure the Node contains; if it is a
		//      single ellipse, the isEllipse is set to true; note that
		//      we do not keep track of removals, since this should not
		//      happen in the context of where this figure is used (as
		//      NodePlate of a GMF EditorPart.
		if (isFirst && figure != null && figure instanceof Ellipse) {
			isEllipse = true;
		} else {
			isEllipse = false;
		}
		isFirst = false;
 		super.add(figure, constraint, index);
	}

}

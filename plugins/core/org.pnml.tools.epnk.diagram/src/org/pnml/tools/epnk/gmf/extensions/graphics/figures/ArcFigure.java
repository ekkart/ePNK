package org.pnml.tools.epnk.gmf.extensions.graphics.figures;

import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.pnml.tools.epnk.gmf.extensions.graphics.IArcFigure;
import org.pnml.tools.epnk.gmf.extensions.graphics.decorations.ArrowHeadDecoration;
import org.pnml.tools.epnk.gmf.extensions.graphics.decorations.ReisigsArrowHeadDecoration;
import org.pnml.tools.epnk.pnmlcoremodel.Arc;

import experiment.QuadraticBezier;

/**
 * This is the default ArcFigure for ePNK diagrams. It was actually copied
 * from automatically generated class of GMF in the ArcEditPart. The reason
 * for factoring out this class was making it easier to use when changing
 * the graphical appearance.
 * 
 * @generated NOT
 * @author eki
 *
 */
public class ArcFigure extends PolylineConnectionEx implements IArcFigure {

	public final Arc arc;
	
	public ArcFigure(Arc arc) {
		this.arc = arc;
		this.setLineWidth(1);
		setTargetDecoration(createTargetDecoration());
	}

	private RotatableDecoration createTargetDecoration() {
		ArrowHeadDecoration df = new ArrowHeadDecoration();
		df.setLineWidth(1);
		return df;
	}
	
	/**
	 * This method is called, when some attributes of the arc have changed.
	 * The figure can then update its appearance. This should be overridden by
	 * figures that depend on the arc's attributes.
	 */
	public void update() {
	}

	/**
	 * Does the bezier interpolation of the arc if the smoothness is set to greater
	 * than 0.
	 */
	@Override
	public PointList getSmoothPoints(boolean calculateAppoxPoints) {
		if (getSmoothness() > 0) {
			return QuadraticBezier.allPoints(this.getPoints());
		}
		return super.getSmoothPoints(calculateAppoxPoints);
	}
	
}
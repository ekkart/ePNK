package dk.dtu.compute.mbse.tutorial.yawl.graphics.figures;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.swt.SWT;
import org.pnml.tools.epnk.gmf.extensions.graphics.decorations.ArrowHeadDecoration;
import org.pnml.tools.epnk.gmf.extensions.graphics.decorations.DoubleArrowHeadDecoration;
import org.pnml.tools.epnk.gmf.extensions.graphics.figures.ArcFigure;
import org.pnml.tools.epnk.pnmlcoremodel.Arc;
import org.pnml.tools.epnk.pnmlcoremodel.Node;

import dk.dtu.compute.mbse.yawl.functions.YAWLFunctions;

/**
 * The class implementing the graphical representation for YAWL arcs. 
 * 
 * @generated NOT
 * @author ekki@dtu.dk
 */
public class YAWLArcFigure extends ArcFigure {

	private boolean isResetArc = false;
	
	public YAWLArcFigure(Arc arc) {
		super(arc);
		isResetArc = YAWLFunctions.isResetArc(arc);
		setGraphics();
	}

	@Override
	public void update() {
		boolean oldIsReadArc = isResetArc;
		isResetArc = YAWLFunctions.isResetArc(arc);
		if (isResetArc != oldIsReadArc) {
			setGraphics();
			// Notify attached target node of the change (which will initiate the update of the
			// corresponding graphical representation if needed).
			Node target = arc.getTarget();
			if (target instanceof InternalEObject) {
				target.eNotify(new ENotificationImpl((InternalEObject) target, Notification.NO_FEATURE_ID, null, null, null));
			}
		}
	}

	private void setGraphics() {
		if (isResetArc) {
			this.setTargetDecoration(new DoubleArrowHeadDecoration());
			this.setLineStyle(SWT.LINE_DASH);
		} else {
			this.setTargetDecoration(new ArrowHeadDecoration());
			this.setLineStyle(SWT.LINE_SOLID);
		}
	}

}

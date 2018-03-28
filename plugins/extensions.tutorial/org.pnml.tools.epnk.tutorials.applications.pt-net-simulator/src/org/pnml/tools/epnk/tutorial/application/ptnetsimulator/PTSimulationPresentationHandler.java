package org.pnml.tools.epnk.tutorial.application.ptnetsimulator;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.pnml.tools.epnk.annotations.netannotations.ObjectAnnotation;
import org.pnml.tools.epnk.applications.ui.IPresentationHandler;
import org.pnml.tools.epnk.applications.ui.figures.EllipseOverlay;
import org.pnml.tools.epnk.applications.ui.figures.RectangleOverlay;
import org.pnml.tools.epnk.pnmlcoremodel.PlaceNode;
import org.pnml.tools.epnk.pnmlcoremodel.TransitionNode;

import ptnetsimulator.Mode;
import ptnetsimulator.PlaceSelectionAnnotation;
import ptnetsimulator.TransitionActivationAnnotation;

public class PTSimulationPresentationHandler implements IPresentationHandler {

	@Override
	public IFigure handle(ObjectAnnotation annotation,
			AbstractGraphicalEditPart editPart) {
		if (annotation instanceof TransitionActivationAnnotation) {
			TransitionActivationAnnotation activationAnnotation =
					(TransitionActivationAnnotation) annotation;
			if (editPart instanceof GraphicalEditPart) {
				GraphicalEditPart graphicalEditPart = (GraphicalEditPart) editPart;
				java.lang.Object modelObject = graphicalEditPart.resolveSemanticElement();
				if (modelObject instanceof TransitionNode) {
					RectangleOverlay overlay = new RectangleOverlay(graphicalEditPart);
					if (activationAnnotation.getMode().equals(Mode.ENABLED)) {
						overlay.setForegroundColor(ColorConstants.blue);
						overlay.setBackgroundColor(ColorConstants.blue);
					}
					return overlay;
				}
			}
		} else if (annotation instanceof PlaceSelectionAnnotation) {
			PlaceSelectionAnnotation placeAnnotation = (PlaceSelectionAnnotation) annotation;
			if (editPart instanceof GraphicalEditPart) {
				GraphicalEditPart graphicalEditPart = (GraphicalEditPart) editPart;
				java.lang.Object modelObject = graphicalEditPart.resolveSemanticElement();
				if (modelObject instanceof PlaceNode) {
					EllipseOverlay overlay = new EllipseOverlay(graphicalEditPart);
					if (!placeAnnotation.isSelected()) {
						overlay.setForegroundColor(ColorConstants.lightGray);
						overlay.setBackgroundColor(ColorConstants.lightGray);
					}
					return overlay;
				}
			}
			
		}
		return null;
	}

}

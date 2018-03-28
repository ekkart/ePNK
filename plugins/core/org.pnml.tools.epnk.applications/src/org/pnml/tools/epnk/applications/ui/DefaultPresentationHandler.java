package org.pnml.tools.epnk.applications.ui;

import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.pnml.tools.epnk.annotations.netannotations.ObjectAnnotation;
import org.pnml.tools.epnk.annotations.netannotations.TextualAnnotation;
import org.pnml.tools.epnk.applications.ui.figures.EllipseOverlay;
import org.pnml.tools.epnk.applications.ui.figures.LabelOverlay;
import org.pnml.tools.epnk.applications.ui.figures.PolylineOverlay;
import org.pnml.tools.epnk.applications.ui.figures.RectangleOverlay;
import org.pnml.tools.epnk.pnmlcoremodel.Arc;
import org.pnml.tools.epnk.pnmlcoremodel.Object;
import org.pnml.tools.epnk.pnmlcoremodel.Page;
import org.pnml.tools.epnk.pnmlcoremodel.PlaceNode;
import org.pnml.tools.epnk.pnmlcoremodel.TransitionNode;

public class DefaultPresentationHandler implements IPresentationHandler {

	@Override
	public IFigure handle(ObjectAnnotation annotation,
			AbstractGraphicalEditPart editPart) {
		if (annotation != null) {
			if (editPart instanceof GraphicalEditPart) {
				GraphicalEditPart graphicalEditPart = (GraphicalEditPart) editPart;
				IFigure figure = graphicalEditPart.getFigure();
				java.lang.Object modelObject = graphicalEditPart.resolveSemanticElement();
				if (modelObject instanceof Object) {
					Object object = (Object) modelObject;
					if (annotation instanceof TextualAnnotation) {
						TextualAnnotation textualAnnotation = (TextualAnnotation) annotation;
						EAttribute attribute = textualAnnotation.getAnnotationAttribute();
						String text = "no text attribute found";
						if (attribute != null) {
							text = textualAnnotation.eGet(attribute).toString();
						}
						return new LabelOverlay(text, figure);
					}
					if (object instanceof PlaceNode) {
						return new EllipseOverlay(graphicalEditPart);
					} else if (object instanceof TransitionNode || object instanceof Page) {
						return new RectangleOverlay(graphicalEditPart);
					} 
				}
			} else if (editPart instanceof ConnectionNodeEditPart) {
				ConnectionNodeEditPart arcEditPart = (ConnectionNodeEditPart) editPart;
				if (arcEditPart.resolveSemanticElement() instanceof Arc) {
					return new PolylineOverlay(arcEditPart);
				}
			}
		}
		return null;
	}

}

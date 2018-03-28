package org.pnml.tools.epnk.applications.ui;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.pnml.tools.epnk.annotations.netannotations.ObjectAnnotation;

public interface IPresentationHandler {
	
	public IFigure handle(ObjectAnnotation annotation,
			AbstractGraphicalEditPart graphicalEditPart);

}

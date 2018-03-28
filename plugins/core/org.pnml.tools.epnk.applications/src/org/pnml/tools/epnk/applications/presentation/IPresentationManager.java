package org.pnml.tools.epnk.applications.presentation;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.pnml.tools.epnk.annotations.netannotations.ObjectAnnotation;

/*
 * Author: Mindaugas Laganeckas
 * Email: s100972@student.dtu.dk
 * 
 * @author ekki@dtu.dk
 *   2016: added getApplication to interface (needed for fixing a problem
 *         updates on notifications coming from currently not active applications) 
 */

public interface IPresentationManager {
	
	// public IApplicationWithPresentation getApplication();

	public IFigure handle(ObjectAnnotation annotation, AbstractGraphicalEditPart graphicalEditPart);

	public void notifyOwner();
	
}

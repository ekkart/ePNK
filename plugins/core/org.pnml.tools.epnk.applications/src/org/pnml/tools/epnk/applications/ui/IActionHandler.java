package org.pnml.tools.epnk.applications.ui;

import org.eclipse.draw2d.MouseEvent;
import org.pnml.tools.epnk.annotations.netannotations.ObjectAnnotation;

public interface IActionHandler {
	
	public boolean mouseDoubleClicked(MouseEvent arg0, ObjectAnnotation annotation);

	public boolean mousePressed(MouseEvent arg0, ObjectAnnotation annotation);

	public boolean mouseReleased(MouseEvent arg0, ObjectAnnotation annotation);

}

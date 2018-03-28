package org.pnml.tools.epnk.applications.presentation;

import org.pnml.tools.epnk.applications.IApplication;

/*
 * Author: Mindaugas Laganeckas
 * Email: s100972@student.dtu.dk
 * @author ekki@dtu.dk
 *   2016: deleted outdated stuff
 */

public interface IApplicationWithPresentation extends IApplication {
	
	public void activate();
	
	public boolean showPopUpMenu();
	
	public IPresentationManager getPresentationManager();
	
}

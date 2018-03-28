package org.pnml.tools.epnk.applications;

import org.eclipse.jface.action.Action;
import org.pnml.tools.epnk.annotations.netannotations.NetAnnotations;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNet;

public interface IApplication {
	
	public String getName();
	
	public void setName(String name);
		
	public Action[] getActions();
	
	public String getDescription();
	
	public String getStatus();
	
	public NetAnnotations getNetAnnotations();
	
	public PetriNet getPetrinet();
	
	public void dispose();

}

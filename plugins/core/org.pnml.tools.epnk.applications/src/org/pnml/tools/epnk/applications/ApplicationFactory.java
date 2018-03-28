package org.pnml.tools.epnk.applications;

import org.pnml.tools.epnk.pnmlcoremodel.PetriNet;

public abstract class ApplicationFactory {
	
	abstract public String getName();
	
	abstract public String getDescription();
	
	abstract public boolean isApplicable(PetriNet net);
	
	abstract public Application startApplication(PetriNet net);
	
	private String id = "";
	
	public String getID() {
		return id;
	}
	
	public void setID(String id) {
		if ((this.id == null || this.id.isEmpty()) && id != null) {
			this.id = id;
		}
	}
	
	public String getVersion() {
		return "0.0.0";
	}
	
	
	public String toString() {
		String result = getName();
		if (result != null && !result.isEmpty()) {
			return result;
		} else {
			return this.getClass().getName();
		}
	}

}

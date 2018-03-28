package org.pnml.tools.epnk.applications.registry;

import org.pnml.tools.epnk.applications.IApplication;

public interface IApplicationsListener {
	
	public void addApplication(IApplication application);
	
	public void removeApplication(IApplication application);
	
	public void update(IApplication application);

}

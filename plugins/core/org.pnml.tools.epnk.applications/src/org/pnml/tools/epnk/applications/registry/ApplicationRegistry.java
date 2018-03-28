package org.pnml.tools.epnk.applications.registry;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.resource.Resource;
import org.pnml.tools.epnk.applications.IApplication;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNet;

public class ApplicationRegistry {

	private List<IApplication> applications;
	private Set<IApplicationsListener> applicationsListeners;

	public ApplicationRegistry() {
		applications = new ArrayList<IApplication>();
		 applicationsListeners = new HashSet<IApplicationsListener>();
	}
	
	public void addApplication(IApplication application) {
		if (!applications.contains(application)) {
			applications.add(application);
			for (IApplicationsListener listener: applicationsListeners ) {
				listener.addApplication(application);
			}
		}
	}

	public void removeApplication(IApplication application) {
		if (applications.contains(application)) {
			applications.remove(application);
			for (IApplicationsListener listener: applicationsListeners ) {
				listener.removeApplication(application);
			}
			application.dispose();
		}
	}
	
	public void removeApplications(Resource resource) {
		if (resource != null) {
			List<IApplication> removeList = new ArrayList<IApplication>();
			for (IApplication application: applications) {
				PetriNet net = application.getPetrinet();
				if (net != null) {
					if (resource.equals(net.eResource())) {
						removeList.add(application);
					}
				}
			}
			for (IApplication application: removeList) {
				removeApplication(application);
			}
		}
	}
	
	/**
	 * Returns an unmodifiable list of all currently running applications.
	 * @return
	 */
	public List<IApplication> getApplications() {
		return Collections.unmodifiableList(applications);
	}
	
	public void addListener(IApplicationsListener listener) {
		 applicationsListeners.add(listener);
	}
	
	public void removeListener(IApplicationsListener listener) {
		 applicationsListeners.remove(listener);
	}

}

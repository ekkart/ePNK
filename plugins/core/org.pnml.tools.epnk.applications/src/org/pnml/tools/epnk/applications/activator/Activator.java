package org.pnml.tools.epnk.applications.activator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;
import org.pnml.tools.epnk.applications.ApplicationFactory;
import org.pnml.tools.epnk.applications.registry.ApplicationRegistry;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNet;


public class Activator extends Plugin {

	private static Activator instance;

	private ApplicationRegistry registry;
	
	private List<ApplicationFactory> factories;

	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		instance = this;
		loadApplicationsFactories();
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		instance = null;
		factories = null;
		super.stop(context);
	}

	public static Activator getInstance() {
		return instance;
	}

	public ApplicationRegistry getApplicationRegistry() {
		if (registry == null) {
			registry = new ApplicationRegistry();
		}
		return registry;
	}
	
	public List<ApplicationFactory> getApplicationFactories() {
		return Collections.unmodifiableList(factories);
	}
	
	public List<ApplicationFactory> getApplicationFactories(PetriNet net) {
		List<ApplicationFactory> result = new ArrayList<ApplicationFactory>();
		for (ApplicationFactory factory: factories) {
			if (factory.isApplicable(net)) {
				result.add(factory);
			}
		}
		return result;
	}
	
	private void loadApplicationsFactories() {
		factories = new ArrayList<ApplicationFactory>();
		
		IExtensionRegistry reg = Platform.getExtensionRegistry();
		IExtensionPoint extPoint = reg.getExtensionPoint("org.pnml.tools.epnk.applications.applicationfactory");

		IExtension[] extensions = extPoint.getExtensions();


		for (int i = 0; i < extensions.length; i++) {
			IExtension extension = extensions[i];
			IConfigurationElement confs[] = extension.getConfigurationElements();
			IConfigurationElement elem = confs[0];
			ApplicationFactory factory = null;
			try {
				factory = (ApplicationFactory) elem.createExecutableExtension("class");
			} catch (Exception e) {}
			if (factory != null) {
				String id = extension.getUniqueIdentifier();
				if (id != null) {
					factory.setID(id);
				}
				factories.add(factory);
			}
		}
	}

}

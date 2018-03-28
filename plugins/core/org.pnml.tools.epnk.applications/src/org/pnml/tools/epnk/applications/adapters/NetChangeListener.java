package org.pnml.tools.epnk.applications.adapters;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.pnml.tools.epnk.applications.Application;
import org.pnml.tools.epnk.helpers.FlatAccess;

public class NetChangeListener implements Adapter {
	
	private Application application;
	private FlatAccess flatAccess;

	public NetChangeListener(Application application) {
		super();
		this.application = application;
		this.registerFlatAccess();
	}

	@Override
	public Notifier getTarget() {
		return null;
	}

	@Override
	public boolean isAdapterForType(Object arg0) {
		return false;
	}

	@Override
	public void notifyChanged(Notification arg0) {
		this.unregisterFlatAccess();
		
		String name = application.getName();
		if (name != null) {
			name = "ePNK Application: " + name; 
		} else {
			name = "ePNK Application";
		}
		
		final String label = name;
		Display.getDefault().asyncExec(new Runnable() {
			public void run() {
				if (MessageDialog.openQuestion(null, label, 
						"The underlying net has been modified." + System.lineSeparator() +
						"It is unsafe to continue using the application, and it may show wrong results." + System.lineSeparator() +
						"Do you want stop this application (recommended)?")) {
					application.dispose();
				} else {
					registerFlatAccess();
				}
			}
		}
		);
	}

	@Override
	public void setTarget(Notifier arg0) {
	}
	
	private boolean disposed = false;
	
	public synchronized void registerFlatAccess() {
		if (!disposed) {
			if (flatAccess != null) {
				flatAccess.removeInvalidationListener(this);
			}
			flatAccess = FlatAccess.getFlatAccess(application.getPetrinet());
			flatAccess.addInvalidationListener(this);
		}
	}
	
	public synchronized void unregisterFlatAccess() {
		if (!disposed) {
			if (flatAccess != null) {
				flatAccess.removeInvalidationListener(this);
				flatAccess = null;
			}
		}
	}
	
	public synchronized void dispose() {
		if (!disposed) {
			disposed = true;
			if (flatAccess != null) {
				flatAccess.removeInvalidationListener(this);
				flatAccess = null;
			}
		}	
	}
	
	public synchronized boolean isDisposed() {
		return disposed;
	}

}

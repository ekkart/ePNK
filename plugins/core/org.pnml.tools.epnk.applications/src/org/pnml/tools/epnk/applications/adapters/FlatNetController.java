package org.pnml.tools.epnk.applications.adapters;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.jface.dialogs.MessageDialog;
import org.pnml.tools.epnk.applications.Application;

@Deprecated
public class FlatNetController implements Adapter {

	private Application application;

	public FlatNetController(Application application) {
		super();
		this.application = application;
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
		String name = application.getName();
		if (name != null) {
			name = "ePNK Application: " + name; 
		} else {
			name = "ePNK Application";
		}
		if (MessageDialog.openConfirm(null, name, 
				"The underlying net has been modified." + System.lineSeparator() +
				"It is unsafe to continue using the application, and it may show wrong results." + System.lineSeparator() +
				"Do you want stop this application (recommended)?")) {
			application.dispose();
		}
	}

	@Override
	public void setTarget(Notifier arg0) {
	}

}

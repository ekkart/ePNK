package org.pnml.tools.epnk.managers.problems;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.NotificationImpl;

public class ProblemNotification extends NotificationImpl {

	ProblemManager notifier;
	
	public ProblemNotification(ProblemManager notifier) {
		super(Notification.ADD, null, "new");
	}

	@Override
	public Object getNotifier() {
		return notifier;
	}

}

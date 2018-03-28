package org.pnml.tools.epnk.applications;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.pnml.tools.epnk.applications.presentation.IApplicationWithPresentation;
import org.pnml.tools.epnk.applications.ui.ApplicationUIManager;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNet;

public class ApplicationWithUIManager extends Application implements
		IApplicationWithPresentation {

	ApplicationUIManager presentationManager;
	
	public ApplicationWithUIManager(PetriNet petrinet) {
		super(petrinet);
		presentationManager = new ApplicationUIManager(this);
	}

	@Override
	public ApplicationUIManager getPresentationManager() {
		return presentationManager;
	}
	
	@Override
	final public void activate() {
		// Should not be used for this kind of Application
	}
	
	final public void update() {
		// to update the user feedback using the presentation manager issue
		// a fake notification on the net annotations
		this.getNetAnnotations().eNotify(
				new ENotificationImpl(
						(InternalEObject) this.getNetAnnotations(),
						Notification.NO_FEATURE_ID,
						null,
						null,
						null));
		this.updateActionEnabledness();
	}

	@Override
	final public boolean showPopUpMenu() {
		// Should not be used for this kind of Application
		return false;
	}

}

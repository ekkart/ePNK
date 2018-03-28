package org.pnml.tools.epnk.tutorials.applications.actions;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.pnml.tools.epnk.annotations.netannotations.NetAnnotation;
import org.pnml.tools.epnk.annotations.netannotations.NetAnnotations;
import org.pnml.tools.epnk.annotations.netannotations.NetannotationsFactory;
import org.pnml.tools.epnk.annotations.netannotations.ObjectAnnotation;
import org.pnml.tools.epnk.applications.Application;

import org.pnml.tools.epnk.helpers.FlatAccess;
import org.pnml.tools.epnk.pnmlcoremodel.Arc;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNet;
import org.pnml.tools.epnk.pnmlcoremodel.Transition;

public class CalculateTransitionContext extends Application {

	private Adapter adapter;
	private FlatAccess flatAccess; 
	
	public CalculateTransitionContext(PetriNet petrinet) {
		super(petrinet);
		
	}

	@Override
	public void initializeContents() {
		NetAnnotations netAnnotations = this.getNetAnnotations();
		PetriNet petrinet = this.getPetrinet();
		
		flatAccess = FlatAccess.getFlatAccess(petrinet);

		adapter = new Adapter () {

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
				Display.getDefault().asyncExec(new Runnable() {
					public void run() {
						if (MessageDialog.openConfirm(null, "Calculate Transition Context", 
								"The underlying net has been modified." + System.lineSeparator() +
								"It is unsafe to continue using the application, and it may show wrong results." + System.lineSeparator() +
								"Do you want stop this application (recommended)?")) {
							CalculateTransitionContext.this.dispose();
						}
					}
				});
			}

			@Override
			public void setTarget(Notifier arg0) {
			}
			
		};
		flatAccess.addInvalidationListener(adapter);
		
		for (Transition transition: flatAccess.getTransitions()) {
			NetAnnotation netAnnotation = NetannotationsFactory.eINSTANCE.createNetAnnotation();
			netAnnotation.setNet(petrinet);
			ObjectAnnotation objectAnnotation = NetannotationsFactory.eINSTANCE.createObjectAnnotation();
			objectAnnotation.setObject(transition);
			netAnnotation.getObjectAnnotations().add(objectAnnotation);

			
			for (Arc arc:transition.getIn()) {
				objectAnnotation = NetannotationsFactory.eINSTANCE.createObjectAnnotation();
				objectAnnotation.setObject(arc);
				netAnnotation.getObjectAnnotations().add(objectAnnotation);
				
				objectAnnotation = NetannotationsFactory.eINSTANCE.createObjectAnnotation();
				objectAnnotation.setObject(arc.getSource());
				netAnnotation.getObjectAnnotations().add(objectAnnotation);
			}
			
			for (Arc arc:transition.getOut()) {
				objectAnnotation = NetannotationsFactory.eINSTANCE.createObjectAnnotation();
				objectAnnotation.setObject(arc);
				netAnnotation.getObjectAnnotations().add(objectAnnotation);
				
				objectAnnotation = NetannotationsFactory.eINSTANCE.createObjectAnnotation();
				objectAnnotation.setObject(arc.getTarget());
				netAnnotation.getObjectAnnotations().add(objectAnnotation);
			}
			
			netAnnotations.getNetAnnotations().add(netAnnotation);
		}
		
		if (netAnnotations.getNetAnnotations().size() > 0) {
			netAnnotations.setCurrent(netAnnotations.getNetAnnotations().get(0));
		}

	}
	
	/* (non-Javadoc)
	 * @see org.pnml.tools.epnk.applications.Application#shutDown()
	 */
	@Override
	protected void shutDown() {
		super.shutDown();
		if (flatAccess != null && adapter != null) {
			flatAccess.removeInvalidationListener(adapter);
		}
		flatAccess = null;
		adapter = null;
	}

}

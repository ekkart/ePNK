package dk.dtu.compute.mbse.tutorial.yawl.simulator.application;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.draw2d.MouseEvent;
import org.pnml.tools.epnk.annotations.netannotations.NetAnnotation;
import org.pnml.tools.epnk.annotations.netannotations.NetAnnotations;
import org.pnml.tools.epnk.annotations.netannotations.ObjectAnnotation;
import org.pnml.tools.epnk.applications.ui.IActionHandler;
import org.pnml.tools.epnk.helpers.FlatAccess;
import org.pnml.tools.epnk.pnmlcoremodel.TransitionNode;

import dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.EnabledTransition;
import dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.SelectArc;
import dk.dtu.compute.mbse.yawl.Action;
import dk.dtu.compute.mbse.yawl.Arc;

import marking.NetMarking;

public class EnabledTransitionHandler implements IActionHandler {

	private YAWLSimulator application;

	public EnabledTransitionHandler(YAWLSimulator application) {
		super();
		this.application = application;	
	}

	public boolean mouseDoubleClicked(MouseEvent arg0, ObjectAnnotation annotation) {
		NetAnnotations netAnnotations = application.getNetAnnotations();
		NetAnnotation current = netAnnotations.getCurrent();
		
		FlatAccess flatNet = FlatAccess.getFlatAccess(application.getPetrinet());
		if (current.getObjectAnnotations().contains(annotation)) {
			Object object = annotation.getObject();
			if (object instanceof TransitionNode) {
				object = flatNet.resolve((TransitionNode) object);
			}
			if (object instanceof Action && annotation instanceof EnabledTransition) {
				Action action = (Action) object;
				NetMarking marking1 = application.computeMarking();
				if (application.enabled(marking1, action)) {
					NetMarking marking2 = application.fireTransition(
							marking1,
							selectedInArc((EnabledTransition) annotation),
							action,
							selectedOutArcs((EnabledTransition) annotation));
					NetAnnotation netAnnotation = application.computeAnnotation(marking2);
					netAnnotation.setNet(application.getPetrinet());
					
					application.deleteNetAnnotationAfterCurrent();
					application.addNetAnnotationAsCurrent(netAnnotation);
					return true;
				}
			}
		}
		return false;
	}

	public boolean mousePressed(MouseEvent arg0, ObjectAnnotation annotation) {
		return false; 
	}

	public boolean mouseReleased(MouseEvent arg0, ObjectAnnotation annotation) {
		return false;
	}
	
	private Arc selectedInArc(EnabledTransition enabledTransition) {
		EnabledTransition resolved = enabledTransition.getResolved();
		if (resolved == null) {
			resolved = enabledTransition;
		}
		for (SelectArc selectArc: resolved.getInArcs()) {
			if (selectArc.isSelected()) {
				Object result = selectArc.getObject();
				if (result instanceof Arc) {
					return (Arc) result;
				}
			}
		}
		return null;
	}
	
	private Collection<Arc> selectedOutArcs(EnabledTransition enabledTransition) {
		EnabledTransition resolved = enabledTransition.getResolved();
		if (resolved == null) {
			resolved = enabledTransition;
		}
		Collection<Arc> result = new ArrayList<Arc>();
		for (SelectArc selectArc: resolved.getOutArcs()) {
			if (selectArc.isSelected()) {
				Object arc = selectArc.getObject();
				if (arc instanceof Arc) {
					result.add((Arc) arc);
				}
			}
		}
		return result;
	}

}

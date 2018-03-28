package dk.dtu.compute.mbse.tutorial.yawl.simulator.application;

import org.eclipse.draw2d.MouseEvent;

import org.pnml.tools.epnk.annotations.netannotations.ObjectAnnotation;
import org.pnml.tools.epnk.applications.ui.IActionHandler;

import dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.EnabledTransition;
import dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.Marking;
import dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.SelectArc;
import dk.dtu.compute.mbse.yawl.Action;
import dk.dtu.compute.mbse.yawl.functions.ControlFlowType;
import dk.dtu.compute.mbse.yawl.functions.YAWLFunctions;

public class SelectArcHandler implements IActionHandler {

	private YAWLSimulator application;
	
	public SelectArcHandler(YAWLSimulator application) {
		super();		
		this.application = application;
	}

	public boolean mouseDoubleClicked(MouseEvent arg0, ObjectAnnotation annotation) {
		return false;
	}

	public boolean mousePressed(MouseEvent arg0, ObjectAnnotation annotation) {
		if (annotation instanceof SelectArc) {
			SelectArc selectArc = (SelectArc) annotation;
			EnabledTransition targetAction = selectArc.getTargetTransition();
			EnabledTransition sourceAction = selectArc.getSourceTransition();
			Marking sourceMarking = selectArc.getSourceMarking();
			
			if (targetAction != null) {
				if (!selectArc.isSelected() && 
						sourceMarking != null && 
						sourceMarking.getValue() > 0) {
					Action action = targetAction.getAction();
					if (YAWLFunctions.getJoinType(action).equals(ControlFlowType.XOR)) {
						for (SelectArc s_arc: targetAction.getInArcs()) {
							s_arc.setSelected(false);
						}
						selectArc.setSelected(true);
						application.update();
						return true; 
					}
				}
			} else if (sourceAction != null) {
				Action action = sourceAction.getAction();
				ControlFlowType cType = YAWLFunctions.getSplitType(action);
				if (cType.equals(ControlFlowType.XOR)) {
					for (SelectArc s_arc: sourceAction.getOutArcs()) {
						s_arc.setSelected(false);
					}
					selectArc.setSelected(true);
					application.update();
					return true; 
				} else if (cType.equals(ControlFlowType.OR)) {
					selectArc.setSelected(!selectArc.isSelected());
					boolean notEmpty = false;
					for (SelectArc s_arc: sourceAction.getOutArcs()) {
						if (s_arc.isSelected()) {
							notEmpty = true;
							break;
						}
					}
					if (!notEmpty) {
						for (SelectArc s_arc: sourceAction.getOutArcs()) {
							if (s_arc != selectArc) {
								s_arc.setSelected(true);
								break;
							}
						}
					}
					application.update();
					return true; 
				}
			}
			
		}
		return false; 
	}

	public boolean mouseReleased(MouseEvent arg0, ObjectAnnotation annotation) {
		return false;
	}

}

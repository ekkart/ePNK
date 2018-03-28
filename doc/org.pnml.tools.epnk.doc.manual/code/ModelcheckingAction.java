package org.pnml.tools.epnk.functions.modelchecking.action;

import
    org.pnml.tools.epnk.actions.framework.jobs.AbstractEPNKAction;
import org.pnml.tools.epnk.actions.framework.jobs.AbstractEPNKJob;

import org.pnml.tools.epnk.pnmlcoremodel.PetriNet;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNetType;
import org.pnml.tools.epnk.pntypes.ptnet.PTNet;

public class ModelcheckingAction extends AbstractEPNKAction {

	@Override
	public boolean isEnabled(PetriNet petrinet) {
		if (petrinet != null) {
			PetriNetType type = petrinet.getType();
			return type != null && type instanceof PTNet;
		}
		return false;
	}
	
	@Override
	protected AbstractEPNKJob createJob(PetriNet petrinet,
			String defaultInput) {
		return new ModelcheckingJob(petrinet,defaultInput);
	}
	
}

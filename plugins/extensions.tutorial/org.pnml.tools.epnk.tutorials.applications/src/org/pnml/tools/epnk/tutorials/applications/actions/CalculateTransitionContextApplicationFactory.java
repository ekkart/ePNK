package org.pnml.tools.epnk.tutorials.applications.actions;

import org.pnml.tools.epnk.applications.Application;
import org.pnml.tools.epnk.applications.ApplicationFactory;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNet;

public class CalculateTransitionContextApplicationFactory extends ApplicationFactory {

	@Override
	public String getName() {
		return "Show transition contexts";
	}

	@Override
	public String getDescription() {
		return "A very applications shown all transition context";
	}

	@Override
	public boolean isApplicable(PetriNet net) {
		return true;
	}

	@Override
	public Application startApplication(PetriNet net) {
		return new CalculateTransitionContext(net);
	}

}

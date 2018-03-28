package org.pnml.tools.epnk.tutorial.application.ptnetsimulator;

import org.pnml.tools.epnk.applications.ApplicationFactory;
import org.pnml.tools.epnk.applications.ApplicationWithUIManager;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNet;
import org.pnml.tools.epnk.pntypes.ptnet.PTNet;

public class PTNetSimulatorApplicationFactory extends ApplicationFactory {

	@Override
	public String getName() {
		return "P/T-Net Simulator";
	}

	@Override
	public String getDescription() {
		return "A very simple P/T-Net simulator as a tutorial for applications";
	}

	@Override
	public boolean isApplicable(PetriNet net) {
		return net.getType() instanceof PTNet;
	}

	@Override
	public ApplicationWithUIManager startApplication(PetriNet net) {
		return new PTNetSimulatorApplication(net);
	}

}

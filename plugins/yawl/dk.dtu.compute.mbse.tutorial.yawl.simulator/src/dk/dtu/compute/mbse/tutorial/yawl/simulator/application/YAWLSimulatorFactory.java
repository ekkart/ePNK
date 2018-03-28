package dk.dtu.compute.mbse.tutorial.yawl.simulator.application;

import org.pnml.tools.epnk.applications.ApplicationFactory;
import org.pnml.tools.epnk.applications.ApplicationWithUIManager;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNet;

import dk.dtu.compute.mbse.yawl.YAWLNet;

public class YAWLSimulatorFactory extends ApplicationFactory {

	@Override
	public String getName() {
		return "YAWL Simulator";
	}

	@Override
	public String getDescription() {
		return "A simple simulator for YAWL nets";
	}

	@Override
	public boolean isApplicable(PetriNet net) {
		return net.getType() instanceof YAWLNet;
	}

	@Override
	public ApplicationWithUIManager startApplication(PetriNet net) {
		return new YAWLSimulator(net);
	}

}

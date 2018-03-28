package org.pnml.tools.epnk.applications.hlpng.utils;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.validation.model.EvaluationMode;
import org.eclipse.emf.validation.service.IBatchValidator;
import org.eclipse.emf.validation.service.ModelValidationService;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.swt.widgets.Display;
import org.pnml.tools.epnk.applications.Application;
import org.pnml.tools.epnk.applications.ApplicationFactory;
import org.pnml.tools.epnk.applications.hlpng.resources.ResourceManager;
import org.pnml.tools.epnk.applications.hlpng.runtime.RuntimeValueFactory;
import org.pnml.tools.epnk.applications.hlpng.simulator.HLSimulator;
import org.pnml.tools.epnk.applications.hlpng.simulator.views.ISimulationViewController;
import org.pnml.tools.epnk.applications.hlpng.simulator.views.SimulationViewController;
import org.pnml.tools.epnk.applications.hlpng.transitionBinding.comparators.ComparisonManager;
import org.pnml.tools.epnk.applications.hlpng.transitionBinding.firing.IFiringStrategy;
import org.pnml.tools.epnk.applications.hlpng.transitionBinding.firing.RandomFiringStrategy;
import org.pnml.tools.epnk.applications.hlpng.transitionBinding.operators.EvaluationManager;
import org.pnml.tools.epnk.applications.hlpng.transitionBinding.operators.reversible.ReversibleOperationManager;
import org.pnml.tools.epnk.applications.hlpng.validation.ValidationDelegateClientSelector;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNet;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNetType;
import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.HLPNG;

/**
 * This is a factory for the HLSimulator application. It is implemented
 * quick and dirty by copying some code from the StartSimulatorApp pop up action.
 * 
 * @author Ekkart Kindler, ekki@dtu.dk
 * @date January 28, 2016
 */
public class HLSimulatorFactory extends ApplicationFactory {

	@Override
	public String getName() {
		return "HLPNG Simulator";
	}

	@Override
	public String getDescription() {
		return "Simulator for high-level Petri nets (HLPNGs)";
	}

	@Override
	public boolean isApplicable(PetriNet net) {
		PetriNetType type = net.getType();
		if (type instanceof HLPNG) {
			/*
			// copied from run method of StartSimulatorApp
			ValidationDelegateClientSelector.running = true;
			IBatchValidator validator = (IBatchValidator) ModelValidationService
					.getInstance().newValidator(EvaluationMode.BATCH);
			validator.setIncludeLiveConstraints(true);
			IStatus status = validator.validate(net);
			ValidationDelegateClientSelector.running = false;
			return status.isOK();
			*/
			return true;
		}

		return false;
	}

	@Override
	public Application startApplication(PetriNet net) {
		// copied from run method of StartSimulatorApp
		
		// runtime value factory
		RuntimeValueFactory runtimeValueFactory = new RuntimeValueFactory();
		// init the evaluation manager
		EvaluationManager evaluationManager = 
				ResourceManager.createEvaluationManager(runtimeValueFactory,
						"org.pnml.tools.epnk.applications.hlpng.transitionBinding.extensions");
		
		// init the reversible operation manager
		ReversibleOperationManager reversibleOperationManager = ResourceManager.createReversibleOperationManager(evaluationManager);
				
		// init the comparison manager
		ComparisonManager comparisonManager = ResourceManager.createComparisonManager(evaluationManager, reversibleOperationManager);
		
		// firing strategy
		IFiringStrategy strategy = ResourceManager.
				getFiringStrategy("org.pnml.tools.epnk.applications.hlpng.simulator.firingStrategy");
		if(strategy == null)
		{
			strategy = new RandomFiringStrategy();
		}

		// perform validation
		ValidationDelegateClientSelector.running = true;
		IBatchValidator validator = (IBatchValidator) ModelValidationService
		        .getInstance().newValidator(EvaluationMode.BATCH);
		validator.setIncludeLiveConstraints(true);
		IStatus status = validator.validate(net);
		ValidationDelegateClientSelector.running = false;

		if (!status.isOK()) 
		{
            ErrorDialog.openError(null, "Validation", "Validation Failed", status);
        }
		else
		{
			// creates a simulator
			try
			{
				HLSimulator application = new HLSimulator(net, evaluationManager, 
						comparisonManager, reversibleOperationManager,
						Display.getDefault().getSystemFont(), runtimeValueFactory, 
						strategy, true, Display.getCurrent());
				// creates simulation view controller
				ISimulationViewController controller = new SimulationViewController();
				controller.setSimulator(application);
				application.setSimulationViewController(controller);
							
				return application;
			}
			catch (Exception e) 
			{
				System.err.println(e);
				IStatus s = new Status(Status.ERROR, status.getPlugin(), 
						"Are you running the Simulator on a usual high level Petri net?\n" +
						"The Simulator is not applicable on network schemes or 3D visualization.");
				ErrorDialog.openError(null, "Error", "Launching the Simulator failed.\n", s);
			}
		}
		
		return null;
	}

}

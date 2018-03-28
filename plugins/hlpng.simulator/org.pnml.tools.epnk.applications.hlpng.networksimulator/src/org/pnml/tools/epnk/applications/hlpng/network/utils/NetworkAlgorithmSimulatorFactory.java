package org.pnml.tools.epnk.applications.hlpng.network.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import networkmodel.DirectedEdge;
import networkmodel.Network;
import networkmodel.NetworkObject;
import networkmodel.Node;
import networkmodel.UndirectedEdge;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.validation.model.EvaluationMode;
import org.eclipse.emf.validation.service.IBatchValidator;
import org.eclipse.emf.validation.service.ModelValidationService;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.pnml.tools.epnk.applications.Application;
import org.pnml.tools.epnk.applications.ApplicationFactory;
import org.pnml.tools.epnk.applications.hlpng.contributors.NetworkExtensionManager;
import org.pnml.tools.epnk.applications.hlpng.network.AbstractFunction;
import org.pnml.tools.epnk.applications.hlpng.network.mindist.NFunction;
import org.pnml.tools.epnk.applications.hlpng.resources.ResourceManager;
import org.pnml.tools.epnk.applications.hlpng.runtime.RuntimeValueFactory;
import org.pnml.tools.epnk.applications.hlpng.simulator.HLSimulator;
import org.pnml.tools.epnk.applications.hlpng.simulator.views.ISimulationViewController;
import org.pnml.tools.epnk.applications.hlpng.simulator.views.SimulationViewController;
import org.pnml.tools.epnk.applications.hlpng.transitionBinding.comparators.ComparisonManager;
import org.pnml.tools.epnk.applications.hlpng.transitionBinding.firing.IFiringStrategy;
import org.pnml.tools.epnk.applications.hlpng.transitionBinding.firing.RandomFiringStrategy;
import org.pnml.tools.epnk.applications.hlpng.transitionBinding.operators.EvaluationManager;
import org.pnml.tools.epnk.applications.hlpng.transitionBinding.operators.IEvaluator;
import org.pnml.tools.epnk.applications.hlpng.transitionBinding.operators.UserOperatorEval;
import org.pnml.tools.epnk.applications.hlpng.transitionBinding.operators.reversible.ReversibleOperationManager;
import org.pnml.tools.epnk.applications.hlpng.validation.ValidationDelegateClientSelector;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNet;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNetType;
import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.HLPNG;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.UserOperatorImpl;

/**
 * This is a factory for the HLSimulator application for network algorithms. It is 
 * implemented quick and dirty by copying some code from the StartSimulatorApp pop
 * up action.
 * 
 * @author Ekkart Kindler, ekki@dtu.dk
 * @date January 28, 2016
 *
 */
public class NetworkAlgorithmSimulatorFactory extends ApplicationFactory {

    private static final String extension = "networkmodel";
    
	@Override
	public String getName() {
		return "Network Algorithm Simulator";
	}

	@Override
	public String getDescription() {
		return "Simulator for network algorithms modelled as high-level Petri nets (HLPNGs)";
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
        ResourceSet resourceSet = new ResourceSetImpl();
        // eki: 2. 10. 2012: I don't think that this is needed:
        // resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xml", new XMLResourceFactoryImpl());
        
        // eki: 1./2. 10. 2012, cleaned up substitution of file extension and 
        //      streamlined dialog for the manual selection of a network file
        Resource resource = null;
        URI networkURI = net.eResource().getURI().trimFileExtension().appendFileExtension(extension);
        try {
        	// try to load the network from the default location
        	resource = resourceSet.getResource(networkURI, true);
        } catch (RuntimeException e) {}
        
        /*
         TODO omitted the part which would allow the user to choose an network file
         
        if (resource == null) {
        	// if there is not file at the default location, ask
        	// the user for a network file
        	networkURI = fileChooser(file.getParent());
        	if (networkURI != null) {
            	try {
            		resource = resourceSet.getResource(networkURI, true);
            	} catch (RuntimeException e) {}
        	} else {
        		// eki: if the user cancelled the file selection (did not select
        		//      a file), the execution is aborted without any further message.
        		return;
        	}
        }
        */

    	// eki 1. 10. 2012: Made the following a bit more defensive (in case the resource
    	//                  does not exist or is not a Network)
        if(resource != null) {
        	EList<EObject> contents = resource.getContents();
        	if ( contents.size() > 0 && contents.get(0) instanceof Network) {
        		// runtime value factory
        		RuntimeValueFactory runtimeValueFactory = new RuntimeValueFactory();

        		// init the evaluation manager
        		EvaluationManager evaluationManager = ResourceManager.
        				createEvaluationManager(runtimeValueFactory, 
        						"org.pnml.tools.epnk.applications.hlpng.transitionBinding.extensions");

        		// init extension manager
        		List<NodeWrapper> nodes = new ArrayList<NodeWrapper>();
        		{
        			Network network = (Network) contents.get(0);
        			int currentId = 0;
        			for(NetworkObject nobj : network.getNetwork())
        			{
        				if(nobj instanceof Node)
        				{
        					NodeWrapper wrapper = new NodeWrapper(currentId, (Node)nobj);
        					currentId++;
        					nodes.add(wrapper);
        				}
        			}

        		}

        		UserOperatorEval userOperatorEval = 
        				(UserOperatorEval)evaluationManager.getHandler(UserOperatorImpl.class);
        		NetworkExtensionManager extensionManager = null;
        		for(IEvaluator eval : userOperatorEval.getArbitraryOperatorEvaluators())
        		{
        			if(eval instanceof NetworkExtensionManager)
        			{
        				extensionManager = (NetworkExtensionManager) eval;
        			}
        		}
        		updateExtensionManager((Network)resource.getContents().get(0), 
        				nodes, extensionManager, runtimeValueFactory);

        		// init the reversible operation manager
        		ReversibleOperationManager reversibleOperationManager = 
        				ResourceManager.createReversibleOperationManager(evaluationManager);

        		// init the comparison manager
        		ComparisonManager comparisonManager = 
        				ResourceManager.createComparisonManager(evaluationManager, reversibleOperationManager);

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
        			try
        			{
        				// init HLPNG simulator
        				HLSimulator simulator = new HLSimulator(net, evaluationManager, 
        						comparisonManager, reversibleOperationManager,
        						Display.getCurrent().getSystemFont(), runtimeValueFactory,
        						strategy, true, Display.getCurrent());

        				// creates simulation view controller
        				ISimulationViewController controller = new SimulationViewController();
        				controller.setSimulator(simulator);
        				simulator.setSimulationViewController(controller);

        				return simulator;
        			}
        			catch(Exception e)
        			{
        				IStatus s = new Status(Status.ERROR, status.getPlugin(), 
        						"Are you running the Simulator on a network scheme model?\n" +
        						"The Simulator is only applicable on network schemes.");
        				ErrorDialog.openError(null, "Error", "Launching the Simulator failed.\n", s);
        			}	
        		}
        	}
        	else
        	{
        		MessageDialog.openError(null, 
        				"Start Network Simulation",
        				"The selected file does not contain a network.");
        	}
        } else {
    		MessageDialog.openError(null, 
    				"Start Network Simulation",
    				"The network for the simulation could not be loaded.");
    	}
        
        return null;
	}
	
    private static void updateExtensionManager(Network network, 
    		List<NodeWrapper> nodes, NetworkExtensionManager extensionManager,
    		RuntimeValueFactory runtimeValueFactory)
    {
        Map<String, NodeWrapper> nodeNameMap = new HashMap<String, NodeWrapper>();
        Map<Integer, NodeWrapper> nodeIdMap = new HashMap<Integer, NodeWrapper>();
        
        for(NodeWrapper nw : nodes)
        {
        	nodeNameMap.put(nw.getNode().getLabel(), nw);
            nodeIdMap.put(nw.getId(), nw);
        }
        
        Integer[][] graph = new Integer[nodes.size()][nodes.size()];

        for(NodeWrapper nw : nodes)
        {
            for(UndirectedEdge edge : nw.getNode().getOut())
            {
                graph[nw.getId()][nodeNameMap.get(edge.getTarget().getLabel()).getId()] = 1;
                if(!(edge instanceof DirectedEdge))
                {
                    graph[nodeNameMap.get(edge.getTarget().getLabel()).getId()][nw.getId()] = 1;
                }
            }
        }

        // update the evaluators managed by ExtensionManager
        {
        	// input function
        	extensionManager.getInputFunction().setCategories(network.getCategories());
        	extensionManager.getInputFunction().setNodes(nodes);
        	
        	// sender
        	extensionManager.getSender().setGraph(graph);
        	extensionManager.getSender().setNodeIdMap(nodeIdMap);
        	extensionManager.getSender().setNodeMap(nodeNameMap);
        	
        	// receiver
        	extensionManager.getReceiver().setGraph(graph);
        	extensionManager.getReceiver().setNodeIdMap(nodeIdMap);
        	extensionManager.getReceiver().setNodeMap(nodeNameMap);
        	
        	// messages
        	extensionManager.getMessages().setGraph(graph);
        	extensionManager.getMessages().setNodeIdMap(nodeIdMap);
        	extensionManager.getMessages().setNodeMap(nodeNameMap);
        	
            // min dist
        	NFunction nf = (NFunction) extensionManager.getEvaluator("N");
        	nf.setGraph(graph);
        	nf.setNodeIdMap(nodeIdMap);
        	nf.setNodeMap(nodeNameMap);
        }
        
        for(IEvaluator evaluator : extensionManager.getEvaluators())
		{
			AbstractFunction function = (AbstractFunction) evaluator;
			function.setRuntimeValueFactory(runtimeValueFactory);
		}
    }

}

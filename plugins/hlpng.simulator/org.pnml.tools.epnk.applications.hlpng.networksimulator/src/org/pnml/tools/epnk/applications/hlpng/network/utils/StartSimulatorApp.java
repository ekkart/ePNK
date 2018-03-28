/*******************************************************************************
 * Copyright (c) 2012 Mindaugas Laganeckas.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Mindaugas Laganeckas - initial API and implementation
 ******************************************************************************/
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

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.ui.dialogs.WorkspaceResourceDialog;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.validation.model.EvaluationMode;
import org.eclipse.emf.validation.service.IBatchValidator;
import org.eclipse.emf.validation.service.ModelValidationService;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.pnml.tools.epnk.applications.activator.Activator;
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
import org.pnml.tools.epnk.applications.registry.ApplicationRegistry;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNet;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.UserOperatorImpl;

/*
 * @author Mindaugas Laganeckas, Ekkart Kindler (eki@imm.dtu.dk)
 */
public class StartSimulatorApp implements IObjectActionDelegate
{
    private PetriNet petrinet;
    private IFile pnfile = null;
    
    private static final String extension = "networkmodel";
    
    @Override
    public void run(IAction action)
    {
        ResourceSet resourceSet = new ResourceSetImpl();
        // eki: 2. 10. 2012: I don't think that this is needed:
        // resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xml", new XMLResourceFactoryImpl());
        
        // eki: 1./2. 10. 2012, cleaned up substitution of file extension and 
        //      streamlined dialog for the manual selection of a network file
        Resource resource = null;
        URI networkURI = petrinet.eResource().getURI().trimFileExtension().appendFileExtension(extension);
        try {
        	// try to load the network from the default location
        	resource = resourceSet.getResource(networkURI, true);
        } catch (RuntimeException e) {}
        
        if (resource == null) {
        	// if there is not file at the default location, ask
        	// the user for a network file
        	networkURI = fileChooser(pnfile.getParent());
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
        		IStatus status = validator.validate(petrinet);
        		ValidationDelegateClientSelector.running = false;

        		if (!status.isOK()) 
        		{
        			ErrorDialog.openError(null, "Validation", "Validation Failed", status);
        		}
        		else
        		{
        			try
        			{
        				// init HLPNG simualtor
        				HLSimulator simulator = new HLSimulator(petrinet, evaluationManager, 
        						comparisonManager, reversibleOperationManager,
        						Display.getCurrent().getSystemFont(), runtimeValueFactory,
        						strategy, true, Display.getCurrent());

        				// creates simulation view controller
        				ISimulationViewController controller = new SimulationViewController();
        				controller.setSimulator(simulator);
        				simulator.setSimulationViewController(controller);

        				// registers the simulator
        				Activator activator = Activator.getInstance();
        				ApplicationRegistry registry = activator.getApplicationRegistry();
        				registry.addApplication(simulator);
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
    }
    
    @Override
    public void selectionChanged(IAction action, ISelection selection)
    {
        petrinet = null;
        if(selection instanceof IStructuredSelection)
        {
            IStructuredSelection structuredSelection = (IStructuredSelection) selection;
            if(structuredSelection.size() == 1)
            {
                java.lang.Object selected = structuredSelection.getFirstElement();
                if(selected instanceof PetriNet)
                {
                    IWorkbenchPart workbenchPart = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActivePart();
                    
                    pnfile = (IFile) workbenchPart.getSite().getPage().getActiveEditor().getEditorInput().getAdapter(IFile.class);
                    petrinet = (PetriNet) selected;
                }
            }
        }
        action.setEnabled(isEnabled());
    }

    private boolean isEnabled()
    {
        return petrinet != null;
    }

    @Override
    public void setActivePart(IAction action, IWorkbenchPart targetPart){}
    
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
        
    /**
     * Creates a dialog for letting the user select a file with a network
     * from the workbench. The URI to this file is returned as a result.
     * Only files with extension "networkmodel" and folders and projects
     * that contain such files are shown. The folder that contains the
     * Petri net file is passed as a parameter (container); this container
     * is pre-selected in the dialog so that it is easier for the user to 
     * navigate to a related file with a network.
     * 
     * @param container the project or folder directly containing the Petri net
     * @return a URI of the selected resource containing a model of a network 
     */
    private static URI fileChooser(final IContainer container) {
        List<ViewerFilter> filters = new ArrayList<ViewerFilter>(1);     
        ViewerFilter viewerFilter = new ViewerFilter(){
        	
        	@Override
        	public boolean select(Viewer viewer, Object parentElement, Object element) {
        		// TODO eki: 1. 10. 2012: Implemented ad hoc; could probably be done
        		//                        more elegantly (and more efficiently)
        		if (element instanceof IProject || element instanceof IFolder ) {
        			if (element.equals(container)) {
        				// eki: the container is included to this view independently of
        				//      whether it has networks contained in it or not (so this
        				//      pre-selected element will not be filtered away)
        				return true;
        			}

        			if (viewer instanceof StructuredViewer) {
        				StructuredViewer structuredViewer = (StructuredViewer) viewer;
        				IContentProvider contentProvider = structuredViewer.getContentProvider();
        				if (contentProvider instanceof ITreeContentProvider) {
        					ITreeContentProvider treeContentprovider = (ITreeContentProvider)structuredViewer.getContentProvider();
        					for(Object child: treeContentprovider.getChildren(element)) {
        						if(select(viewer, element, child)) {
        							return true;
        						}
        					} 
        					return false;
        				} 
        			}
        			return true;
        		} else if (element instanceof IFile) {
        			String extension2 = ((IFile) element).getFileExtension();
        			if (extension.equals(extension2)) {
            			return true;
        			} 
        		}
        		return false;
        	}
        	
        };
        filters.add(viewerFilter);        
    
        // eki: dialog for selecting network files from the workspace with the
        //      above filter (showing network files and the container and their
        //      containers only). The container is preselected.
    	IFile[] files = WorkspaceResourceDialog.openFileSelection(
    			null, 
    			"Select a network file",
    			"There is not network directly associated with this Petri net (via the same file name)." + 
    			"Select a file with the network on which this Petri net schema should run.",
    			false, 
    			new Object[] {container},
    			filters);
    	if (files != null && files.length == 1) {
    		IPath path = files[0].getLocation();
    		String string = path.toOSString();
    		return URI.createFileURI(string);
    	} else {
    		return null;
    	}
    }
}

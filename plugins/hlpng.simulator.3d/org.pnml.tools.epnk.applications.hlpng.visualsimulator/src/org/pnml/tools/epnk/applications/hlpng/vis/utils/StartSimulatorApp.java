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
package org.pnml.tools.epnk.applications.hlpng.vis.utils;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
import org.eclipse.emf.validation.model.EvaluationMode;
import org.eclipse.emf.validation.service.IBatchValidator;
import org.eclipse.emf.validation.service.ModelValidationService;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.osgi.framework.Bundle;
import org.pnml.tools.epnk.applications.activator.Activator;
import org.pnml.tools.epnk.applications.hlpng.contributors.ExtensionManager;
import org.pnml.tools.epnk.applications.hlpng.functions.AbstractFunction;
import org.pnml.tools.epnk.applications.hlpng.resources.ResourceManager;
import org.pnml.tools.epnk.applications.hlpng.simulator.MSListFactory;
import org.pnml.tools.epnk.applications.hlpng.simulator.VisSimulationViewController;
import org.pnml.tools.epnk.applications.hlpng.simulator.VisualSimulator;
import org.pnml.tools.epnk.applications.hlpng.simulator.views.ISimulationViewController;
import org.pnml.tools.epnk.applications.hlpng.transitionBinding.comparators.ComparisonManager;
import org.pnml.tools.epnk.applications.hlpng.transitionBinding.operators.EvaluationManager;
import org.pnml.tools.epnk.applications.hlpng.transitionBinding.operators.IEvaluator;
import org.pnml.tools.epnk.applications.hlpng.transitionBinding.operators.UserOperatorEval;
import org.pnml.tools.epnk.applications.hlpng.transitionBinding.operators.reversible.ReversibleOperationManager;
import org.pnml.tools.epnk.applications.hlpng.validation.ValidationDelegateClientSelector;
import org.pnml.tools.epnk.applications.registry.ApplicationRegistry;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNet;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.UserOperatorImpl;

import visualsimulationconfig.VisualSimulatorConfig;
import dk.dtu.imm.se2.group6.visual.Animator;

public class StartSimulatorApp implements IObjectActionDelegate
{
	private PetriNet petrinet;
    // private String filename = null;
    private IFile pnfile = null;
    private String configExtension = "visualsimulationconfig";
    
	@Override
	public void run(IAction action)
	{
		ResourceSet resourceSet = new ResourceSetImpl();
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xml", new XMLResourceFactoryImpl());
        // VisualsimulationconfigPackage visualsimulationconfigPackage = VisualsimulationconfigPackage.eINSTANCE;
        
        
        // String configFilePath = filename.replaceFirst(pnfile.getFileExtension(), configExtension);
        //
        // This replacement replaces the first occurrence of pnml in the name, which does not
        // always replace the extension correct. So I (ekki) replaced this by (quick and a bit dirty,
        // could be done in a nicer way, but I did not want to change the code too much):
        String configFilePath = pnfile.getLocation().removeFileExtension().addFileExtension(configExtension).toOSString();
        
        File file = new File(configFilePath);
        if(!file.exists())
        {
        	configFilePath = fileChooser(Display.getCurrent().getActiveShell(), ".");
        }
        
        Resource resource = null;
        try
        {
        	URI fileUri = URI.createFileURI(configFilePath);
	        resource = resourceSet.getResource(fileUri, true);
        }
        catch(Exception e){}

		if(resource != null && resource.getContents().size() > 0)
		{
			// runtime value factory
			final MSListFactory factory = new MSListFactory();
			// init the evaluation manager
			final EvaluationManager evaluationManager = ResourceManager.
					createEvaluationManager(factory,
							"org.pnml.tools.epnk.applications.hlpng.transitionBinding.extensions");

			// init the reversible operation manager
			final ReversibleOperationManager reversibleOperationManager = 
					ResourceManager.createReversibleOperationManager(evaluationManager);
					
			// init the comparison manager
			final ComparisonManager comparisonManager = 
					ResourceManager.createComparisonManager(evaluationManager, reversibleOperationManager);
						
			// init config
			final VisualSimulatorConfig config = (VisualSimulatorConfig)resource.getContents().get(0);
			
			// set the Animator to each user defined evaluator
			UserOperatorEval userOperatorEval = 
					(UserOperatorEval)evaluationManager.getHandler(UserOperatorImpl.class);
			final ExtensionManager extensionManager;
			{
				ExtensionManager extensionManagerTmp = null;
				for(IEvaluator eval : userOperatorEval.getArbitraryOperatorEvaluators())
				{
					if(eval instanceof ExtensionManager)
					{
						extensionManagerTmp = (ExtensionManager) eval;
					}
				}	
				extensionManager = extensionManagerTmp;
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
    				Display.getCurrent().syncExec(new Runnable()
    				{
    					public void run()
    					{
    						// init animator
    	    				// Animator animator = createAnimator(filename.replaceFirst(pnfile.getName(), ""));
    				        // This replacement replaces the first occurrence of the file  name, which does not
    				        // always remove the last segment of the path. So I (ekki) replaced this by (quick and
    						// a bit dirty, could be done in a nicer way, but I did not want to change the code
    						// too much):
    						//String path = pnfile.getLocation().removeLastSegments(1).addTrailingSeparator().toOSString();
    						
    						Animator animator = createAnimator();
    						
    	    				// set the animator to the evaluators
    	    				for(IEvaluator eval : extensionManager.getEvaluators())
    	    				{
    	    					((AbstractFunction)eval).setAnimator(animator);
    	    				}
    	    				
    		                // init HLPNG simualtor
    		                VisualSimulator simulator = new VisualSimulator(petrinet, evaluationManager, 
    		                		comparisonManager, reversibleOperationManager,
    		                		Display.getCurrent().getSystemFont(), animator, 
    		                		config.getGeometry().getGlobalAppearancePath(), 
    		                		config.getGeometry(), config.getShapes(), extensionManager,
    		                		factory);
    		                
    		                // creates simulation view controller
    		                ISimulationViewController controller = new VisSimulationViewController();
    		                controller.setSimulator(simulator);
    		                simulator.setSimulationViewController(controller);
    		                
    		                // registers the simulator
    		                Activator activator = Activator.getInstance();
    		                ApplicationRegistry registry = activator.getApplicationRegistry();
    		                registry.addApplication(simulator);
    					}
    				});
                }
                catch(Exception e)
                {
                	IStatus s = new Status(Status.ERROR, status.getPlugin(), 
    						"Are you running the Simulator on a model for 3D visualization?\n" +
    						"The Simulator is only applicable on 3D visualizations.");
    				ErrorDialog.openError(null, "Error", "Launching the Simulator failed.\n", s);
                }
			}
		}
		else
		{
			System.err.println("Configuration file is empty!");
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
                    // filename = pnfile.getRawLocation().toOSString();
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

	private static String getFilePath(String resource) {
		Bundle bundle = Platform.getBundle("org.pnml.tools.epnk.applications.hlpng.visualsimulator");
		URL fileURL = bundle.getEntry(resource);
		
		try {
			return  new File(FileLocator.resolve(fileURL).toURI()).getAbsolutePath();
		} catch (IOException e) {} catch (URISyntaxException e) {
			e.printStackTrace();
		}
		
		return "";
	}
	
	private static Animator createAnimator()
	{
		String planeTexture = getFilePath("resources/texture/grass_texture.jpg");
		String collisionMarker = getFilePath("resources/collision/exclamation.obj");
		String earthTexture = getFilePath("resources/texture/platform_texture.jpg");
		
		String[] skyboxTextures = {
				getFilePath("resources/Skybox/Front.png"),
				getFilePath("resources/Skybox/Left.png"),
				getFilePath("resources/Skybox/Back.png"),
				getFilePath("resources/Skybox/Right.png"),
				getFilePath("resources/Skybox/Top.png"),
				getFilePath("resources/Skybox/Bottom.png"),
		};
		
		return new Animator(600, 600, planeTexture, collisionMarker, earthTexture, skyboxTextures);
	}
	
	public String fileChooser(Shell shell, String path)
	{
		FileDialog fd = new FileDialog(shell, SWT.OPEN);
		fd.setText("Open");
		fd.setFilterPath(path);
		String[] filterExt = { "*." + configExtension };
		fd.setFilterExtensions(filterExt);
		return fd.open();
	}
}

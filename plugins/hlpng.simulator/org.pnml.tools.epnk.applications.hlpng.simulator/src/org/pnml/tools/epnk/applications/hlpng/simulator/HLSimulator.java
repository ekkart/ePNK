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
package org.pnml.tools.epnk.applications.hlpng.simulator;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;
import org.pnml.tools.epnk.annotations.netannotations.NetAnnotations;
import org.pnml.tools.epnk.applications.Application;
import org.pnml.tools.epnk.applications.hlpng.presentation.SimulatorPresentationManager;
import org.pnml.tools.epnk.applications.hlpng.presentation.animation.IWorker;
import org.pnml.tools.epnk.applications.hlpng.presentation.animation.PeriodicalWorkerJob;
import org.pnml.tools.epnk.applications.hlpng.presentation.marking.NetMarking;
import org.pnml.tools.epnk.applications.hlpng.presentation.marking.NetMarkingManager;
import org.pnml.tools.epnk.applications.hlpng.resources.ResourceManager;
import org.pnml.tools.epnk.applications.hlpng.runtime.RuntimeValueFactory;
import org.pnml.tools.epnk.applications.hlpng.runtimeStates.IRuntimeState;
import org.pnml.tools.epnk.applications.hlpng.runtimeStates.RuntimeState;
import org.pnml.tools.epnk.applications.hlpng.runtimeStates.RuntimeStateManager;
import org.pnml.tools.epnk.applications.hlpng.simulator.views.ISimulationViewController;
import org.pnml.tools.epnk.applications.hlpng.transitionBinding.comparators.ComparisonManager;
import org.pnml.tools.epnk.applications.hlpng.transitionBinding.firing.FiringMode;
import org.pnml.tools.epnk.applications.hlpng.transitionBinding.firing.IFiringStrategy;
import org.pnml.tools.epnk.applications.hlpng.transitionBinding.firing.TransitionManager;
import org.pnml.tools.epnk.applications.hlpng.transitionBinding.operators.EvaluationManager;
import org.pnml.tools.epnk.applications.hlpng.transitionBinding.operators.reversible.ReversibleOperationManager;
import org.pnml.tools.epnk.applications.presentation.IPresentationManager;
import org.pnml.tools.epnk.helpers.FlatAccess;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNet;
import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.Transition;

public class HLSimulator extends Application implements ISimulator, IWorker
{
	protected IPresentationManager presentationManager = null;
	protected NetMarkingManager netMarkingManager = null;
	
	protected Font font = null;
	protected FlatAccess flatAccess = null;
	protected EvaluationManager evaluationManager = null; 
	protected ComparisonManager comparisonManager = null; 
	protected ReversibleOperationManager reversibleOperationManager = null;
	
	protected TransitionManager transitionManager = null;
	protected RuntimeStateManager runtimeStateManager = null;
	protected RuntimeValueFactory runtimeValueFactory = null;
	
	protected PeriodicalWorkerJob autoMode = null;
	protected ISimulationViewController simulationViewController = null;
	
	protected long simulationPause = 100;
	protected boolean autoModeEnabled;
	
	protected IFiringStrategy firingStrategy = null;
	protected boolean completed = true;

	private Action[] actions;
	
	protected final Display display;
	
	public HLSimulator(PetriNet petrinet, EvaluationManager evaluationManager, 
			ComparisonManager comparisonManager, 
			ReversibleOperationManager reversibleOperationManager, Font font,
			RuntimeValueFactory runtimeValueFactory, 
			IFiringStrategy firingStrategy, boolean init, Display display)
    {
	    super(petrinet);
	    
	    this.display = display;
	    this.evaluationManager = evaluationManager;
	    this.comparisonManager = comparisonManager;
	    this.reversibleOperationManager = reversibleOperationManager;
	    this.runtimeValueFactory = runtimeValueFactory;
	    this.firingStrategy = firingStrategy;
	    
	    this.font = font;
		
	    this.flatAccess = FlatAccess.getFlatAccess(getPetrinet());
	    
	    if(init)
	    {
	    	init();	
	    }
    }

	@Override
	public void init()
	{
	    this.autoMode = new PeriodicalWorkerJob(Display.getDefault(), 
	    		"Auto transition firing", this);
	    this.transitionManager = new TransitionManager(flatAccess, comparisonManager,
				evaluationManager, reversibleOperationManager, display);
	    this.runtimeStateManager = new RuntimeStateManager(this.flatAccess,
	    		this.runtimeValueFactory, this.transitionManager, this.evaluationManager);
	    
		this.presentationManager = new SimulatorPresentationManager(this, font);
		this.netMarkingManager= new NetMarkingManager(getPetrinet(), this.flatAccess);
		
		// computing initial state
		IRuntimeState initialState = this.runtimeStateManager.
				createInitialState(this.flatAccess.getTransitions());
		this.runtimeStateManager.addState(initialState);

		// creating an annotation layer
		showAnnotations(initialState, netMarkingManager, this.getNetAnnotations());
		
		updateActionEnabledness();
	}
	
	@Override
    public void fire(FiringMode mode, boolean updateAnnotations)
    {
		// setting the selected firing mode for the state
		runtimeStateManager.getCurrentState().setFiringMode(mode);
		// recording
		if(simulationViewController != null)
		{
			this.simulationViewController.record(runtimeStateManager.getCurrentState());	
		}
		// computing the next state
		IRuntimeState runtimeState = this.runtimeStateManager.
				createNextState(runtimeStateManager.getCurrentState(), mode);
		boolean needToClean = runtimeStateManager.addState(runtimeState);
		if(needToClean && simulationViewController != null)
		{
			this.simulationViewController.resetRecords(runtimeStateManager.getStateContainer());
		}
		
		// creating an annotation layer
		if(updateAnnotations)
		{
			showAnnotations(runtimeState, netMarkingManager, this.getNetAnnotations());	
		}
    }
	
	@Override
    public void updateTransitionBinding(IRuntimeState state)
    {
		// updates state transition binding
		this.runtimeStateManager.updateState(state);
    }
	
	@Override
    public void updateTransitionBinding()
    {
		updateTransitionBinding(runtimeStateManager.getCurrentState());
    }
	
	@Override
    public void updateTransitionBinding(IRuntimeState state,
            Transition transition, boolean clear)
    {
		// updates concrete transition binding
		this.runtimeStateManager.updateState(state, transition, clear);
		showAnnotations(state, netMarkingManager, this.getNetAnnotations());
    }
	
	@Override
    public void updateTransitionBinding(Transition transition, boolean clear)
    {
		updateTransitionBinding(runtimeStateManager.getCurrentState(), transition, clear);
    }
	
	@Override
	public void reset()
	{
		// stops the simulation if any
		stop();
		// clears the view
		if(simulationViewController != null)
		{
			simulationViewController.clear();	
		}
		// initializes the application
		init();
	}
	
	@Override
    public void show(IRuntimeState state)
    {
		if(!autoModeEnabled)
		{
			runtimeStateManager.setCurrentState(state);
			// creating an annotation layer
			showAnnotations(state, netMarkingManager, this.getNetAnnotations());	
		}
    }

	@Override
    public void next()
    {
		IRuntimeState state = runtimeStateManager.getStateContainer().relativeNext();
		if(state != null)
		{
			// creating an annotation layer
			showAnnotations(state, netMarkingManager, this.getNetAnnotations());
		}
    }
	
	@Override
    public void previous()
    {
		IRuntimeState state = runtimeStateManager.getStateContainer().relativePrevious();
		if(state != null)
		{
			// creating an annotation layer
			showAnnotations(state, netMarkingManager, this.getNetAnnotations());
		}
    }
	
	@Override
	public void auto()
	{
		if(completed)
		{
			autoModeEnabled = true;
			completed = false;
			autoMode.runInUIThread(null);
		}
	}
	
	@Override
	public void stop()
	{
		completed = true;
		autoModeEnabled = false;
		
		showAnnotations(runtimeStateManager.getCurrentState(), netMarkingManager, 
				this.getNetAnnotations());
	}
	
	@Override
	protected void shutDown() 
	{
		stop();
		if(simulationViewController != null)
		{
			simulationViewController.shutDown();
		}
	}
	
	@Override
	public String getStatus()
	{
		if(completed)
		{
			return "idle";
		}
		return "running";
	}

	@Override
    public void work()
    {
		FiringMode mode = firingStrategy.fire(runtimeStateManager.getCurrentState());
		boolean updateAnnotations = !autoModeEnabled || simulationPause > 0;
		
		if(mode != null)
		{
			this.fire(mode, updateAnnotations);	
		}
		else
		{
			stop();
		}
    }

	@Override
	public boolean showPopUpMenu()
    {
    	return !autoModeEnabled;
    }

	public void setAutoModeEnabled(boolean autoModeEnabled)
    {
    	this.autoModeEnabled = autoModeEnabled;
    }
	
	@Override
	public IPresentationManager getPresentationManager()
    {
    	return presentationManager;
    }

	@Override
    public Action[] getActions()
    {
		if(actions == null)
		{
	    	actions = new Action[5];
			
			actions[0] = new Action() {
				public void run() {
					previous();
				}
			};
			actions[0].setId("previous");
			actions[0].setText("Previous");
			actions[0].setToolTipText("Show previous");
			{
				ImageDescriptor desc = ResourceManager.getImageDescriptor("icons/nav_backward.gif",
						ResourceManager.SIMULATOR_PLUGIN_ID);
				if(desc != null)
				{
					actions[0].setImageDescriptor(desc);	
				}				
			}			
			actions[1] = new DropDownAction(this) {
				public void run() {
					auto();
				}
			};
			actions[1].setId("auto");
			actions[1].setText("Run");
			actions[1].setToolTipText("Automatic mode");
			{
				ImageDescriptor desc = ResourceManager.getImageDescriptor("icons/lrun_obj.gif",
						ResourceManager.SIMULATOR_PLUGIN_ID);
				if(desc != null)
				{
					actions[1].setImageDescriptor(desc);	
				}
			}
			
			actions[2] = new Action() {
				public void run() {
					stop();
				}
			};
			actions[2].setId("stop");
			actions[2].setText("Stop");
			actions[2].setToolTipText("Stop current execution");
			{
				ImageDescriptor desc = ResourceManager.getImageDescriptor("icons/pause.gif",
						ResourceManager.SIMULATOR_PLUGIN_ID);
				if(desc != null)
				{
					actions[2].setImageDescriptor(desc);	
				}
			}			
			
			actions[3] = new Action() {
				public void run() {
					next();
				}
			};
			actions[3].setId("next");
			actions[3].setText("Next");
			actions[3].setToolTipText("Show next");
			{
				ImageDescriptor desc = ResourceManager.getImageDescriptor("icons/nav_forward.gif",
						ResourceManager.SIMULATOR_PLUGIN_ID);
				if(desc != null)
				{
					actions[3].setImageDescriptor(desc);	
				}
			}
			
			actions[4] = new Action() {
				public void run() {
					reset();
				}
			};
			actions[4].setId("reset");
			actions[4].setText("Reset");
			actions[4].setToolTipText("Reset");
			{
				ImageDescriptor desc = ResourceManager.getImageDescriptor("icons/terminatedlaunch_obj.gif",
						ResourceManager.SIMULATOR_PLUGIN_ID);
				if(desc != null)
				{
					actions[4].setImageDescriptor(desc);	
				}
			}
	    }
	    return actions;
    }
	
	protected void showAnnotations(IRuntimeState state, NetMarkingManager netManager,
			NetAnnotations netAnnotations)
	{
		NetMarking netMarking = netManager.createNetMarking(state);
		netAnnotations.setCurrent(netMarking);
		
		if(simulationViewController != null)
		{
			simulationViewController.highlightLine(((RuntimeState)state).getIndex());
		}
	}

	@Override
    public void activate()
    {
		if(simulationViewController != null)
		{
			this.simulationViewController.setCurrent();
		}
    }

	@Override
	public long getSimulationPause()
    {
    	return simulationPause;
    }

	@Override
	public void setSimulationPause(long simulationPause)
    {
    	this.simulationPause = simulationPause;
    }

	@Override
	public void setSimulationViewController(ISimulationViewController simulationViewController)
    {
    	this.simulationViewController = simulationViewController;
    }
	
	@Override
	public boolean isCompleted()
	{
		return completed;
	}
}

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

import geditor.GObject;
import geditor.Geometry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;
import org.pnml.tools.epnk.applications.hlpng.contributors.ExtensionManager;
import org.pnml.tools.epnk.applications.hlpng.functions.AbstractFunction;
import org.pnml.tools.epnk.applications.hlpng.resources.ResourceManager;
import org.pnml.tools.epnk.applications.hlpng.runtime.IValue;
import org.pnml.tools.epnk.applications.hlpng.runtime.IMSValue;
import org.pnml.tools.epnk.applications.hlpng.runtime.NumberValue;
import org.pnml.tools.epnk.applications.hlpng.runtime.ProductValue;
import org.pnml.tools.epnk.applications.hlpng.runtime.RuntimeValueFactory;
import org.pnml.tools.epnk.applications.hlpng.runtime.StringValue;
import org.pnml.tools.epnk.applications.hlpng.runtimeStates.IRuntimeState;
import org.pnml.tools.epnk.applications.hlpng.simulator.HLSimulator;
import org.pnml.tools.epnk.applications.hlpng.transitionBinding.comparators.ComparisonManager;
import org.pnml.tools.epnk.applications.hlpng.transitionBinding.firing.FiringMode;
import org.pnml.tools.epnk.applications.hlpng.transitionBinding.firing.IDWrapper;
import org.pnml.tools.epnk.applications.hlpng.transitionBinding.operators.EvaluationManager;
import org.pnml.tools.epnk.applications.hlpng.transitionBinding.operators.IEvaluator;
import org.pnml.tools.epnk.applications.hlpng.transitionBinding.operators.reversible.ReversibleOperationManager;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNet;
import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.Place;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Sort;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.UserSort;

import Appearence.Shape;
import Appearence.Shapes;

import dk.dtu.imm.se2.group6.interfaces.IAnimator;
import dk.dtu.imm.se2.group6.visual.Animator;

public class VisualSimulator extends HLSimulator implements IVisualSimulator,
	dk.dtu.imm.se2.group6.interfaces.ISimulator
{
	private Action[] actions = null;
	
	private IAnimator animator = null;
	private Map<String, Integer> staticItemMap = new HashMap<String, Integer>();
	private Map<String, Integer> modelMap = new HashMap<String, Integer>();
	private ExtensionManager extensionManager = null;
	
	private Map<String, GObject> geometryMap = null;
	private Map<String, Shape> shapeMap = null;
	
	private boolean reset = false;
	private boolean resetInProgress = false;

	// each time a transition is fired an associated animation is registered here 
	private Set<Integer> runningAnimations = null;

	public VisualSimulator(PetriNet petrinet,
            EvaluationManager evaluationManager,
            ComparisonManager comparisonManager,
            ReversibleOperationManager reversibleOperationManager, Font font,
            Animator animator, String globalAppearancepath, Geometry geometry,
            Shapes appearance, ExtensionManager extensionManager,
            RuntimeValueFactory factory)
    {
	    super(petrinet, evaluationManager, comparisonManager,
	            reversibleOperationManager, font, factory, null, false, 
	            Display.getCurrent());
	    
	    this.animator = animator;
	    this.extensionManager = extensionManager;
	    
		geometryMap = new HashMap<String, GObject>();
		{
			for(GObject g : geometry.getGeometryObjects())
			{
				if(g.getId() != null)
				{
					geometryMap.put(g.getId(), g);
					try
					{
						int id = animator.createStaticItem(g, null, globalAppearancepath);
						registerStaticItem(g.getId(), id);
					}
					catch(Exception e){}
				}
			}
		}
		
		shapeMap = new HashMap<String, Shape>();
		{
			for(Shape s : appearance.getAppearence())
			{
				shapeMap.put(s.getId(), s);
				int id = animator.createModel(s, false);
				registerModel(s.getId(), id);
			}
		}
		
		for(IEvaluator evaluator : extensionManager.getEvaluators())
		{
			AbstractFunction function = (AbstractFunction) evaluator;
			function.setGeometryMap(geometryMap);
			function.setShapeMap(shapeMap);
			function.setVisualSimulator(this);
			function.setFactory(factory);
		}

		// make animator visible
		this.animator.setWindow(new Window(animator));
		this.animator.setSimulator(this);
		this.animator.setVisible(true);
		this.reset = true;
		this.animator.initRequested();
    }

	@Override
	public void reset()
    {
		simulationViewController.clear();
		reset = true;
		animator.setReset(true);
    }
	
	/*
	 * 3D engine simulation methods start here
	 */
	
	@Override
    public void animationFinished(int ItemID, IAnimator animator)
    {
		if(runningAnimations.contains(ItemID))
		{
			runningAnimations.remove(ItemID);
			
			fireAll(this);
		}
    }
	
	@Override
    public void start(IAnimator animator)
    {
		animator.setUpdatePosition(true);
		
		fireAll(this);
    }
	
	@Override
    public void reset(IAnimator animator)
    {	
		resetInProgress = false;
		go(this);
    }
	
	@Override
    public void stop(IAnimator animator)
    {
		animator.setUpdatePosition(false);
    }
	
	@Override
    public void initCompleted(IAnimator animator)
    {
		go(this);
    }

	/*
	 * Visual simulator methods start here
	 */
	
	@Override
    public void registerAnimation(int id)
    {
		runningAnimations.add(id);
    }
	
	@Override
    public boolean isReady(int id)
    {
		if(runningAnimations.contains(id))
		{
			return false;
		}
		return true;
    }
	
	@Override
    public void registerStaticItem(String name, int id)
    {
	    staticItemMap.put(name, id);
    }
	
	@Override
    public void registerModel(String name, int id)
    {
		modelMap.put(name, id);
    }
	
	@Override
    public int getModelId(String name)
    {
	    return modelMap.get(name);
    }
	
	@Override
    public int getStaticItemId(String name)
    {
	    return staticItemMap.get(name);
    }
	
	/*
	 * HLPNG methods start here
	 */

	@Override
    public void show(IRuntimeState state)
    {
		runtimeStateManager.setCurrentState(state);
		
		if(!resetInProgress)
		{
			resetInProgress = true;
			animator.setReset(true);
		}
    }
	
	@Override
    public Action[] getActions()
    {
		if(actions == null)
		{
	    	actions = new Action[3];
			
			actions[0] = new Action() {
				public void run() {
					start(animator);
				}
			};
			actions[0].setId("start");
			actions[0].setText("Start");
			actions[0].setToolTipText("Start the simulation");
			{
				ImageDescriptor desc = ResourceManager.getImageDescriptor("icons/lrun_obj.gif",
						ResourceManager.SIMULATOR_PLUGIN_ID);
				if(desc != null)
				{
					actions[0].setImageDescriptor(desc);	
				}	
			}
			
			actions[1] = new Action() {
				public void run() {
					stop(animator);
				}
			};
			actions[1].setId("stop");
			actions[1].setText("Stop");
			actions[1].setToolTipText("Stop the simulation");
			{
				ImageDescriptor desc = ResourceManager.getImageDescriptor("icons/pause.gif",
						ResourceManager.SIMULATOR_PLUGIN_ID);
				if(desc != null)
				{
					actions[1].setImageDescriptor(desc);	
				}	
			}
			
			
			actions[2] = new Action() {
				public void run() {
					reset();
				}
			};
			actions[2].setId("reset");
			actions[2].setText("Reset");
			actions[2].setToolTipText("Reset the simulation");
			{
				ImageDescriptor desc = ResourceManager.getImageDescriptor("icons/terminatedlaunch_obj.gif",
						ResourceManager.SIMULATOR_PLUGIN_ID);
				if(desc != null)
				{
					actions[2].setImageDescriptor(desc);	
				}	
			}
	    }
	    return actions;
    }

	@Override
    public void shutDown()
    {
		super.shutDown();
	    ((Animator)animator).getWindow().dispose();
    }

	/*
	 * private static functions start here
	 */
	private static void placeObjects(IRuntimeState state, 
			ExtensionManager extensionManager, VisualSimulator simulator)
	{
		for(IDWrapper placeId : state.getPlaces())
		{
			Place place = (Place)placeId.getId();
			IMSValue msValue = state.getValue(placeId);
			
			Sort sort = place.getType().getStructure();
			if(sort instanceof UserSort)
			{
				UserSort userSort = (UserSort)sort;
				if(userSort.getName().equals("DYNAMIC_MODEL"))
				{
					for(Entry<IValue, Integer> entry : msValue.entrySet())
					{
						appear((ProductValue)entry.getKey(), simulator.geometryMap, simulator.shapeMap, 
								simulator.animator, simulator);
					}
				}
				else if(userSort.getName().equals("STATIC_MODEL"))
				{
					IEvaluator appearEvaluator = extensionManager.getHandlers().get("APPEAR_POINT");
					AbstractFunction appearFunction = (AbstractFunction) appearEvaluator;
					
					IEvaluator triggerEvaluator = extensionManager.getHandlers().get("TRIGGER");
					AbstractFunction triggerFunction = (AbstractFunction) triggerEvaluator;

					for(Entry<IValue, Integer> entry : msValue.entrySet())
					{
						IValue value = entry.getKey();
						List<IValue> list = new ArrayList<IValue>();
						list.add(value);
						appearFunction.execute(list);
						triggerFunction.execute(((ProductValue)value).getComponents());
					}
				}
			}
		}
	}
	
	private static void fireAll(VisualSimulator simulator)
	{
		IRuntimeState state = simulator.runtimeStateManager.getCurrentState();
		simulator.updateTransitionBinding(state);
		
		while(state.getTransitions().size() > 0)
		{
			final List<IDWrapper> transitions = new ArrayList<IDWrapper>(state.getTransitions());
			final List<FiringMode> modes = 
					new ArrayList<FiringMode>(state.getFiringModes(transitions.get(0)).getModes());
			simulator.fire(modes.get(0), true);
			
			state = simulator.runtimeStateManager.getCurrentState();
		}
	}
	
	private static void go(VisualSimulator simulator)
	{
		if(simulator.reset)
		{
			simulator.init();
			simulator.reset = false;
		}
		
		display(simulator, simulator.runtimeStateManager.getCurrentState());
	}
	
	private static void appear(ProductValue pValue, Map<String, GObject> geometryMap,
			Map<String, Shape> shapeMap, IAnimator animator, VisualSimulator simulator)
	{
		// model object comes first
		StringValue modelStr = (StringValue)pValue.getComponents().get(0);
		
		// geometry object comes second
		StringValue geoStr = (StringValue)pValue.getComponents().get(1);
		
		// speed comes third
		NumberValue speed = (NumberValue)pValue.getComponents().get(2);
		
		Shape shape = shapeMap.get(modelStr.getData());
		GObject gObj = geometryMap.get(geoStr.getData());
		
		animator.appear(simulator.getModelId(shape.getId()), 
				simulator.getStaticItemId(gObj.getId()), speed.getN());
		
		simulator.registerAnimation(simulator.getModelId(shape.getId()));
	}
	
	private static void display(VisualSimulator simulator, IRuntimeState state)
	{
		simulator.runtimeStateManager.setCurrentState(state);
		
		simulator.runningAnimations = new HashSet<Integer>();
		for(String key : simulator.modelMap.keySet())
		{
			simulator.runningAnimations.add(simulator.modelMap.get(key));
		}
		simulator.stop(simulator.animator);
		// update transition bindings
		simulator.updateTransitionBinding(state);
		// nothing can run after start up
		placeObjects(state, simulator.extensionManager, simulator);
		// creating an annotation layer
		simulator.showAnnotations(state, simulator.netMarkingManager, simulator.getNetAnnotations());
	}
	
}

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
package org.pnml.tools.epnk.applications.hlpng.simulator.views;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.pnml.tools.epnk.applications.hlpng.resources.ResourceManager;
import org.pnml.tools.epnk.applications.hlpng.runtimeStates.IRuntimeState;
import org.pnml.tools.epnk.applications.hlpng.runtimeStates.IRuntimeStateContainer;
import org.pnml.tools.epnk.applications.hlpng.simulator.ISimulator;
import org.pnml.tools.epnk.applications.hlpng.transitionBinding.firing.FiringMode;
import org.pnml.tools.epnk.pnmlcoremodel.Transition;

public class SimulationViewController implements ISimulationViewController
{
	private final SimulationViewController me = this;
	
	protected ISimulator simulator = null;
	protected Display display = null;
	protected List<TableRecord> records = new ArrayList<TableRecord>();
	protected IWorkbenchPage activePage = null;
	
	private Action[] actions = null;

	public SimulationViewController()
	{
		this.display = Display.getCurrent();
		
		if(PlatformUI.getWorkbench() != null && 
				PlatformUI.getWorkbench().getActiveWorkbenchWindow() != null &&
				PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage() != null)
		{
			this.activePage = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		}
	}

	@Override
    public void resetRecords(final IRuntimeStateContainer runtimeStates)
	{
		this.records = new ArrayList<TableRecord>();
		
		for(IRuntimeState runtimeState : runtimeStates)
		{
			FiringMode firingMode = runtimeState.getFiringMode();
			
			// the last state does not have a firing mode assigned
			if(firingMode != null)
			{
				final String[] text = new String[] 
						{
							getName(firingMode.getTransition()), 
							firingMode.toString()
						};

				final TableRecord record = new TableRecord();
				record.setData(runtimeState);
				record.setText(text);
				
				// registers the record
				this.records.add(record);	
			}
		}
		
		final SimulationView simulationView = getSimulationView();
		if(simulationView != null) 
		{	
			display.asyncExec(new Runnable()
			{
				public void run()
				{
					simulationView.resetRecords(me, records);
				}
			});
		}
	}
	
	private static String getName(Transition t)
	{
		if(t.getName() != null)
		{
			return t.getName().getText();
		}
		return t.getId();
	}
	
	@Override
    public void record(final IRuntimeState runtimeState)
	{
		FiringMode firingMode = runtimeState.getFiringMode();
		
		final String[] text = new String[] 
				{
					getName(firingMode.getTransition()), 
					firingMode.toString()
				};

		final TableRecord record = new TableRecord();
		record.setData(runtimeState);
		record.setText(text);
		
		// registers the record
		this.records.add(record);
		
		final SimulationView simulationView = getSimulationView();
		if(simulationView != null) 
		{
			display.asyncExec(new Runnable()
			{
				public void run()
				{
					simulationView.record(me, record);
				}
			});
		}
	}
	
	@Override
    public void clear()
	{
		// clears the records
		this.records.clear();
					
		final SimulationView simulationView = getSimulationView();
		if(simulationView != null) 
		{
			display.syncExec(new Runnable()
			{
				public void run()
				{
					simulationView.clear(me);
				}
			});
		}
	}

	@Override
    public void setCurrent()
	{
		final SimulationView simulationView = getSimulationView();
		if(simulationView != null) 
		{
			simulationView.setCurrentController(me);
			
			display.asyncExec(new Runnable()
			{
				public void run()
				{
					simulationView.resetRecords(me, records);
				}
			});
		}
	}
	
	private SimulationView getSimulationView()
    {
		try
		{
    		if(activePage != null)
    		{
    			IViewPart view = activePage.findView(SimulationView.ID);
    			
    			if(view instanceof SimulationView)
    			{
    				return (SimulationView) view;	
    			}
    		}
		}
		catch(Exception e)
		{
			System.err.println(e.getMessage());
		}
		return null;
    }

	@Override
    public void selectionChanged(SelectionChangedEvent event)
    {
		callback();
    }
	
	private void callback()
	{
		final SimulationView simulationView = getSimulationView();
		if(simulationView != null)
		{
			Object data = currentData(simulationView.getViewer(), display);
			if(data != null && simulator != null)
			{
				simulator.show((IRuntimeState)data);
			}	
		}
	}

	private static Object currentData(TableViewer viewer, Display display)
	{
		viewer.getTable().getItems()[0].setGrayed(true);
		TableItem[] items = viewer.getTable().getSelection();
		if(items != null && items.length > 0)
		{
			final TableItem item = items[0]; 
			
			markCurrentLine(viewer, item, display);
					
			return item.getData();
		}
		
		return null;
	}
	
	@Override
	public void highlightLine(int index)
	{
		final SimulationView simulationView = getSimulationView();
		if(simulationView != null && index >= 0 && 
				index < simulationView.getViewer().getTable().getItemCount()) 
		{
			markCurrentLine(simulationView.getViewer(), 
					simulationView.getViewer().getTable().getItem(index), display);
		}
	}
	
	private static void markCurrentLine(TableViewer viewer, TableItem item, Display display)
	{
		for(final TableItem i : viewer.getTable().getItems())
		{
			// XXX eki used system colours (otherwise color would need to be disposed)
			i.setForeground(ColorConstants.black); // new Color(display, 0, 0, 0));
			i.setBackground(ColorConstants.white); // new Color(display, 255, 255, 255));
		}

		// XXX eki used system colours (otherwise color would need to be disposed)
		item.setForeground(ColorConstants.blue); // new Color(display, 0, 0, 255));
		item.setBackground(ColorConstants.lightGray); // new Color(display, 192, 192, 192));
	}
	
	@Override
	public Action[] getActions()
	{
		if(actions == null)
		{
			actions = new Action[1];
			
			// clear
			{
				actions[0] = new Action("Reset")
				{
					public void run()
					{
						simulator.reset();
					}
				};
				actions[0].setToolTipText("Reset");
				{
					ImageDescriptor desc = ResourceManager.getImageDescriptor("icons/terminatedlaunch_obj.gif",
							ResourceManager.SIMULATOR_PLUGIN_ID);
					if(desc != null)
					{
						actions[0].setImageDescriptor(desc);	
					}
				}	
			}
		}
		return actions;
	}

	@Override
	public void setSimulator(ISimulator simulator)
    {
    	this.simulator = simulator;
    }
	
	@Override
	public void shutDown()
	{
		clear();
		final SimulationView simulationView = getSimulationView();
		if(simulationView != null) 
		{
			simulationView.reset(this);
		}
	}
}

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

import java.util.List;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.ui.part.*;
import org.eclipse.jface.viewers.*;
import org.eclipse.jface.action.*;
import org.eclipse.ui.*;
import org.eclipse.swt.SWT;

public class SimulationView extends ViewPart
{
	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "org.pnml.tools.epnk.applications.hlpng.simulator.views.SimulationView";

	private static final String[] columnHead = new String[] { "Transition name", "Firing mode" };
	private static final int[] columnWidth = new int[] { 150, 500 };
	private static final int[] columnAlignment = new int[] { SWT.LEFT, SWT.LEFT };

	private TableViewer viewer;

	/**
	 * This is a callback that will allow us to create the viewer and initialize
	 * it.
	 */
	public void createPartControl(Composite parent)
	{
		viewer = new TableViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);

		viewer.setContentProvider(new ArrayContentProvider());
		viewer.setLabelProvider(new SimulationViewLabelProvider());
		viewer.setInput(getViewSite());
		
		Table table = viewer.getTable();
		table.setSize(parent.getClientArea().width, parent.getClientArea().height);
		table.setHeaderVisible(true);
		table.setLinesVisible(true);

		TableColumn[] columns = new TableColumn[columnHead.length];

		for(int i = 0; i < columnHead.length; i++)
		{
			columns[i] = new TableColumn(table, columnAlignment[i]);
			columns[i].setText(columnHead[i]);
			columns[i].setWidth(columnWidth[i]);
		}
	}

	private static void contributeToActionBars(IViewSite viewSite,
			ISimulationViewController controller)
	{
		IActionBars bars = viewSite.getActionBars();
		
		IToolBarManager manager = bars.getToolBarManager();
		manager.removeAll();
		
		if(controller != null)
		{
			for(Action action : controller.getActions())
			{
				manager.add(action);
			}	
		}
		
		bars.updateActionBars();
	}

	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus()
	{
		viewer.getControl().setFocus();
	}
	
	/*
	 * Communication with the Controller
	 */
	private ISimulationViewController currentController = null;
	
	public void record(ISimulationViewController controller, TableRecord record)
	{
		if(currentController == controller)
		{
			TableItem item = new TableItem(viewer.getTable(), SWT.NONE);
	        item.setText(record.getText());
	        item.setData(record.getData());	
		}
	}
	
	public void resetRecords(ISimulationViewController controller, List<TableRecord> records)
	{
		if(currentController == controller)
		{
			viewer.getTable().removeAll();
			
			for(TableRecord record : records)
			{
				TableItem item = new TableItem(viewer.getTable(), SWT.NONE);
		        item.setText(record.getText());
		        item.setData(record.getData());		
			}
		}
	}
	
	public void clear(ISimulationViewController controller)
	{
		if(currentController == controller)
		{
			try
            {
	            viewer.getTable().removeAll();
            }
            catch(Exception e){}
		}
	}
	
	public void reset(ISimulationViewController controller)
	{
		if(currentController != null && controller == currentController)
		{
			viewer.removeSelectionChangedListener(currentController);
			this.currentController = null;
			contributeToActionBars(getViewSite(), null);
		}
	}
	
	public void setCurrentController(ISimulationViewController controller)
    {
		// removing old one
		if(currentController != null)
		{
			viewer.removeSelectionChangedListener(currentController);
		}
		// updating current controller
    	this.currentController = controller;
    	// registering new one
    	if(this.currentController != null)
    	{
    		viewer.addSelectionChangedListener(this.currentController);
    	}
    	// update actions
    	contributeToActionBars(getViewSite(), this.currentController);
    }

	public TableViewer getViewer()
    {
    	return viewer;
    }

}

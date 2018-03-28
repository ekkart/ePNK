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
package org.pnml.tools.epnk.applications.hlpng.dialogs;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.TableEditor;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Monitor;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.pnml.tools.epnk.applications.hlpng.transitionBinding.firing.TermWrapper;

public class InputDialog
{
	private final static int EDITABLE_COLUMN = 1;

	private Shell shell = null;
	private boolean canceled = false;
	private final Map<TermWrapper, String> mapping = new HashMap<TermWrapper, String>();
	
	public InputDialog(Set<TermWrapper> variables, Display dialog, String text,
			Map<String, String> values, String textData)
	{
		Monitor primary = dialog.getPrimaryMonitor();
	    Rectangle bounds = primary.getBounds();
	    
	    shell = new Shell(dialog);
	    shell.setText("Assign values");

	    // layout
	    {
	    	RowLayout layout = new RowLayout();
			layout.type = SWT.VERTICAL;
			shell.setLayout(layout);	
	    }
				
		// label
		{
			final Label label = new Label(shell, SWT.NONE);
		    label.setText(text);
		}
		
		// input table
		Table inputTable = createInputTable(shell, variables);
		
		// current binding data
		if(values.size() > 0)
		{
			// label
			{
				final Label label = new Label(shell, SWT.NONE);
			    label.setText(textData);
			}
			createDataTable(shell, values);	
		}
		
		// buttons
		createButtons(shell, inputTable, mapping, this);

		// positioning
		shell.pack();
	    Rectangle rect = shell.getBounds();
	    int x = bounds.x + (bounds.width - rect.width) / 2;
	    int y = bounds.y + (bounds.height - rect.height) / 2;
		shell.setLocation(x, y);
		
		shell.open();
		while(!shell.isDisposed())
		{
			if(!dialog.readAndDispatch())
			{
				dialog.sleep();	
			}
		}
	}

	public Map<TermWrapper, String> getMapping()
    {
    	return mapping;
    }
	
	private static Table createDataTable(final Shell shell, 
			final Map<String, String> values)
	{
		Table table = new Table(shell, SWT.BORDER);

		TableColumn tc1 = new TableColumn(table, SWT.LEFT);
		TableColumn tc2 = new TableColumn(table, SWT.RIGHT);

		tc1.setText("Variable name");
		tc2.setText("Current binding");

		tc1.setWidth(100);
		tc2.setWidth(100);

		table.setHeaderVisible(true);

		for(Entry<String, String> entry : values.entrySet())
		{
			TableItem item = new TableItem(table, SWT.NONE);
			item.setText(new String[] { entry.getKey(), entry.getValue()});
		}

		return table;
	}
	
	private static Table createInputTable(final Shell shell, 
			final Set<TermWrapper> variables)
	{
		Table table = new Table(shell, SWT.BORDER);

		TableColumn tc1 = new TableColumn(table, SWT.LEFT);
		TableColumn tc2 = new TableColumn(table, SWT.RIGHT);

		tc1.setText("Variable name");
		tc2.setText("Variable value");

		tc1.setWidth(100);
		tc2.setWidth(100);

		table.setHeaderVisible(true);

		for(TermWrapper wrapper : variables)
		{
			TableItem item = new TableItem(table, SWT.NONE);
			item.setData(wrapper);
			item.setText(new String[] { wrapper.getName(), ""});
		}

		final TableEditor editor = new TableEditor(table);
		table.addSelectionListener(new TableSelectionListener(table, EDITABLE_COLUMN, editor));
		
		return table;
	}
	
	private static void createButtons(final Shell shell, final Table inputTable,
			final Map<TermWrapper, String> mapping, final InputDialog owner)
	{
		final Composite container = new Composite(shell, SWT.NONE);
		RowLayout rowLayout = new RowLayout();
		rowLayout.type = SWT.HORIZONTAL;
		container.setLayout(rowLayout);
		
		// OK
		{
			final Button okBtn = new Button(container, SWT.PUSH);
			okBtn.setText("OK");
			okBtn.setBounds(20, 20, 50, 25);
			okBtn.addListener(SWT.Selection, new Listener()
			{
				@Override
				public void handleEvent(Event event)
				{
					for(TableItem item : inputTable.getItems())
					{
						mapping.put((TermWrapper)item.getData(), item.getText(1));
					}
					
					shell.dispose();
				}
			});
		}
		
		// cancel
		{
			final Button cancelBtn = new Button(container, SWT.PUSH);
			cancelBtn.setText("Cancel");
			cancelBtn.setBounds(20, 20, 50, 25);
			cancelBtn.addListener(SWT.Selection, new Listener()
			{
				@Override
				public void handleEvent(Event event)
				{
					owner.canceled = true;
					shell.dispose();
				}
			});	
		}
	}

	public boolean isCanceled()
    {
    	return canceled;
    }
}

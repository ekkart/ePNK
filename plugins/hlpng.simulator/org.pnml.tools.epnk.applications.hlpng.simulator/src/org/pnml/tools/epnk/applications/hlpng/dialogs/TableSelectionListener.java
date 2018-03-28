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

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.TableEditor;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;

public class TableSelectionListener extends SelectionAdapter
{
	private TableEditor editor = null;
	private int editableColumn = 0;
	private Table table = null;
	
	public TableSelectionListener(Table table, int editableColumn, TableEditor editor)
	{
		this.table = table;
		this.editableColumn = editableColumn;
		this.editor = editor;
	}
	
	public void widgetSelected(SelectionEvent e)
	{
		// Clean up any previous editor control
		Control oldEditor = editor.getEditor();
		if(oldEditor != null)
		{
			oldEditor.dispose();	
		}
		// Identify the selected row
		TableItem item = (TableItem) e.item;
		if(item == null)
		{
			return;	
		}
		// The control that will be the editor must be a child of the Table
		Text newEditor = new Text(table, SWT.NONE);
		newEditor.setText(item.getText(editableColumn));
		newEditor.addModifyListener(new ModifyListener()
		{
			public void modifyText(ModifyEvent me)
			{
				Text text = (Text) editor.getEditor();
				editor.getItem().setText(editableColumn,
				        text.getText());
			}
		});
		newEditor.selectAll();
		newEditor.setFocus();
		editor.setEditor(newEditor, item, editableColumn);
	}
}

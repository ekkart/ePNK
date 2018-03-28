package org.pnml.tools.epnk.applications.view;

import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.swt.widgets.Composite;
import org.pnml.tools.epnk.applications.Application;

public class ApplicationNameEditingSupport extends EditingSupport {

	private final ColumnViewer viewer;
	
	private TextCellEditor editor = null;
	
	public ApplicationNameEditingSupport(ColumnViewer viewer) {
		super(viewer);
		this.viewer = viewer;
	}

	@Override
	protected CellEditor getCellEditor(Object element) {
		if (editor == null) {
			Composite composite = (Composite) viewer.getControl();
			editor = new TextCellEditor(composite);
		}
		return editor;
	}

	@Override
	protected boolean canEdit(Object element) {
		if (element instanceof Application) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	protected Object getValue(Object element) {
		String result = null;
		if (element instanceof Application) {
			result = ((Application) element).getName();
		}
		if (result == null) {
			result = "";
		}
		return result;
	}

	@Override
	protected void setValue(Object element, Object value) {
		if (element instanceof Application && value instanceof String) {
			((Application) element).setName((String) value);
			viewer.refresh(element);
			((Application) element).updateActionEnabledness();
		}
	}

}

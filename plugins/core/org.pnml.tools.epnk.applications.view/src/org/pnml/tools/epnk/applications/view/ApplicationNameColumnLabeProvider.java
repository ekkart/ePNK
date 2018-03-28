package org.pnml.tools.epnk.applications.view;

import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.pnml.tools.epnk.applications.Application;

public class ApplicationNameColumnLabeProvider extends ColumnLabelProvider {

	@Override
	public String getText(Object element) {
		if (element instanceof Application) {
			return ((Application) element).getName();
		}
		return null;
	}

}

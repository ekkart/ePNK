package org.pnml.tools.epnk.applications.view;

import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;

import org.pnml.tools.epnk.annotations.netannotations.NetAnnotations;
import org.pnml.tools.epnk.applications.Application;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNet;

public class ApplicationsTableLabelProvider extends LabelProvider implements
		ITableLabelProvider {

	@Override
	public Image getColumnImage(Object element, int columnIndex) {
		return null;
	}

	@Override
	public String getColumnText(Object element, int columnIndex) {
		if (element instanceof Application) {
			Application application = (Application) element;
			switch (columnIndex) {
			case 0 :
				return application.getName();
			case 1 : 
				return application.getDescription();
			case 2 : {
				NetAnnotations annotations =  application.getNetAnnotations();
				if (annotations != null && annotations.getCurrent() != null &&
						annotations.getCurrent().getNet() != null) {
					PetriNet net = annotations.getCurrent().getNet();
					if (net.getName() != null) {
						return net.getName().getText();
					}
				}
				return "<unknown>";
			}
			case 3 :
				return application.getStatus();
		    default :
		    	return "<none> " + columnIndex;
			}
		}
		return "<corrupted list content>";
	}

}

package org.pnml.tools.epnk.functions.tutorials.overviewview;

import ...

public class PNMLFileOverviewView extends ViewPart
	implements ISelectionListener {

	...
	
	private TableViewer viewer;
	
	public void createPartControl(Composite parent) {
		viewer = new TableViewer(parent);
		viewer.setContentProvider(new ArrayContentProvider());
		viewer.setLabelProvider(new LabelProvider()); 	
		getSite().getPage().addSelectionListener(this);
		selectionChanged(null, getSite().getPage().getSelection());
	}

	public void setFocus() {
		viewer.getControl().setFocus();
	}

	public void dispose() {
		super.dispose();
		getSite().getPage().removeSelectionListener(this);
	}
    
	public void selectionChanged(IWorkbenchPart part,
			ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structured =
				(IStructuredSelection) selection;
			Object first = structured.getFirstElement();
			if (first instanceof IFile) {
				viewer.setInput(getOverviewInfo((IFile) first));
	}   }   }
	
	public String[] getOverviewInfo(IFile file) { ... }

}
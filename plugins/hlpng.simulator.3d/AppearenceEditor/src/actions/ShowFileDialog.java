package actions;

import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.emf.common.ui.dialogs.*;

import Appearence.Shape;

/*
 * Author: Morten Valvik (s062189)
 */

public class ShowFileDialog implements IObjectActionDelegate, ISelectionChangedListener{
	
	private Shape selectedShape;
	@Override
	public void run(IAction action) {
		if(selectedShape != null)
		{
			Shell parentShell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
			FileDialog fileDialog = new FileDialog(parentShell, SWT.OPEN);
			fileDialog.setFilterExtensions(new String[]{"*.obj;"});
			selectedShape.setObjectStringPath(fileDialog.open());
		}
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		
		if(selection instanceof IStructuredSelection)
		{
			IStructuredSelection struturedSelection = (IStructuredSelection) selection;
			if(struturedSelection.size() == 1 && struturedSelection.getFirstElement() instanceof Shape)
			{
				selectedShape = (Shape) struturedSelection.getFirstElement();
			}
		}
		action.setEnabled(isEnabled());
	}
	public boolean isEnabled()
	{
		return true;
	}

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void selectionChanged(SelectionChangedEvent event) {
		// TODO Auto-generated method stub
		
	}

}

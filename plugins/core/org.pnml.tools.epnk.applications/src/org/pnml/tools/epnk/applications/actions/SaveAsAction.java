package org.pnml.tools.epnk.applications.actions;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.SaveAsDialog;
import org.pnml.tools.epnk.annotations.netannotations.NetAnnotation;
import org.pnml.tools.epnk.annotations.netannotations.NetAnnotations;
import org.pnml.tools.epnk.annotations.netannotations.ObjectAnnotation;
import org.pnml.tools.epnk.applications.Application;

public class SaveAsAction extends Action {
	
	private Application application;
	
	public SaveAsAction(Application application) {
		super("Save As");
		this.application = application;
		this.setId("saveas");
		this.setText("Save as ...");
		this.setToolTipText("Save application as");
		this.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
				getImageDescriptor(ISharedImages.IMG_ETOOL_SAVEAS_EDIT));
	}
	
	@Override
	public void run() {
		Resource resource = this.application.getPetrinet().eResource();
		if (resource != null) {
			IPath path = new Path(resource.getURI().toPlatformString(true));
			path = path.removeFileExtension().addFileExtension("apnml");
			
			IWorkspace workspace = ResourcesPlugin.getWorkspace();
			IWorkspaceRoot workspaceRoot = workspace.getRoot();
			IFile file = workspaceRoot.getFile(path);
			// IContainer container = file.getParent();
			
			IWorkbench workbench = PlatformUI.getWorkbench();
			IWorkbenchWindow window = workbench.getActiveWorkbenchWindow();
			Shell shell = window.getShell(); 
			
			SaveAsDialog dialog = new SaveAsDialog(shell);
			dialog.setOriginalFile(file);
			dialog.setTitle("Save application as");
			dialog.open();
			
			IPath result = dialog.getResult();
			if (result != null) {
				if (result.getFileExtension().equals("apnml")) {
					NetAnnotations netAnnotations = this.application.getNetAnnotations();
					netAnnotations.setDate(new Date().toString());
					List<ObjectAnnotation> orphans = new ArrayList<ObjectAnnotation>();
					for (NetAnnotation netAnnotation: netAnnotations.getNetAnnotations()) {
						for (ObjectAnnotation objectAnnotation: netAnnotation.getObjectAnnotations()) {
							if (objectAnnotation.eContainer() == null) {
								orphans.add(objectAnnotation);
								// netAnnotations.getObjectAnnotations().add(objectAnnotation);
							}
						}
					}
					netAnnotations.getObjectAnnotations().addAll(orphans);

					URI uri = URI.createPlatformResourceURI(result.toString(), true);
					ResourceSet resourceSet = new ResourceSetImpl();
					Resource applicationResource = resourceSet.createResource(uri);
					applicationResource.getContents().add(netAnnotations);

					try {
						applicationResource.save(null);
					} catch (IOException e) {
						MessageDialog.openError(
								null, 
								"Save application as", 
								"Application could not be saved!" + System.lineSeparator() +
								e.toString());
					}
					netAnnotations.getObjectAnnotations().removeAll(orphans);
					applicationResource.setTrackingModification(true);
					applicationResource.setModified(false);
					application.updateActionEnabledness();
				} else {
					MessageDialog.openError(
							null, 
							"Save application as", 
							"Application was not saved!" + System.lineSeparator() +
							"File extension must be \".apnm\" !");
					
				}
			}
		}
		
		
	}

}

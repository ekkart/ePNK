package org.pnml.tools.epnk.applications.actions;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.pnml.tools.epnk.annotations.netannotations.NetAnnotation;
import org.pnml.tools.epnk.annotations.netannotations.NetAnnotations;
import org.pnml.tools.epnk.annotations.netannotations.ObjectAnnotation;
import org.pnml.tools.epnk.applications.Application;

public class SaveAction extends Action {
	
	private Application application;
	
	public SaveAction(Application application) {
		super("Save");
		this.application = application;
		this.setId("save");
		this.setText("Save");
		this.setToolTipText("Save application");
		this.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
				getImageDescriptor(ISharedImages.IMG_ETOOL_SAVE_EDIT)); 
	}
	
	@Override
	public void run() {
		NetAnnotations netAnnotations = this.application.getNetAnnotations();
		if (netAnnotations != null) {
			Resource resource = netAnnotations.eResource();
			if (resource != null) {
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



				try {
					resource.save(null);
				} catch (IOException e) {
					MessageDialog.openError(
							null, 
							"Save application", 
							"Application could not be saved!" + System.lineSeparator() +
							e.toString());
				}
				netAnnotations.getObjectAnnotations().removeAll(orphans);
				// applicationResource.getContents().remove(netAnnotations);
				// resourceSet.getResources().remove(resource);
				resource.setModified(false);
				resource.setTrackingModification(true);
				application.updateActionEnabledness();
				
			}
		}
	}

	@Override
	public boolean isEnabled() {
		NetAnnotations netAnnotations = this.application.getNetAnnotations();
		if (netAnnotations != null) {
			Resource resource = netAnnotations.eResource();
			if (resource != null && resource.isModified()) {
				return true;
			}
		}
		return false;
	}

}

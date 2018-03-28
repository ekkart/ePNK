package org.pnml.tools.epnk.applications.view.actions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ResourceSelectionDialog;
import org.pnml.tools.epnk.annotations.netannotations.NetAnnotation;
import org.pnml.tools.epnk.annotations.netannotations.NetAnnotations;
import org.pnml.tools.epnk.annotations.netannotations.ObjectAnnotation;
import org.pnml.tools.epnk.applications.Application;
import org.pnml.tools.epnk.applications.ApplicationFactory;
import org.pnml.tools.epnk.applications.activator.Activator;
import org.pnml.tools.epnk.helpers.NetFunctions;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNet;

public class LoadAction extends Action {
	
	private PetriNet net;
	
	public LoadAction(PetriNet net) {
		super("Load application", Action.AS_CHECK_BOX);
		this.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
				getImageDescriptor(ISharedImages.IMG_ETOOL_SAVE_EDIT));
		this.net = net;
	}
	
	@Override
	public void run() {
		
		Resource resource = net.eResource();
		if (resource != null) {
			final ResourceSet resourceSet = resource.getResourceSet();
			if (resourceSet != null) {
				IPath path = new Path(resource.getURI().toPlatformString(true));

				IWorkspace workspace = ResourcesPlugin.getWorkspace();
				IWorkspaceRoot workspaceRoot = workspace.getRoot();
				IFile file = workspaceRoot.getFile(path);
				IContainer container = file.getParent();

				IWorkbench workbench = PlatformUI.getWorkbench();
				IWorkbenchWindow window = workbench.getActiveWorkbenchWindow();
				Shell shell = window.getShell(); 

				/*
					ResourceListSelectionDialog dialog =
							new ResourceListSelectionDialog(shell, container, IResource.FILE);
				 */
				ResourceSelectionDialog dialog =
						new ResourceSelectionDialog(shell, container, "Select an application file");
				dialog.setTitle("Select application");
				dialog.open();
				if (dialog.getReturnCode() == Window.OK) {
					Object[] results = dialog.getResult();
					if (results.length > 0) {
						if (results[0] instanceof IFile) {
							IFile selected = (IFile) results[0];
							IPath selectedPath = selected.getFullPath();
							URI uri = URI.createPlatformResourceURI(selectedPath.toString(), true);
							
							List<Resource> resources = new ArrayList<Resource>(resourceSet.getResources());

							Resource newResource = resourceSet.getResource(uri, true);

							NetAnnotations netAnnotations = null;
							boolean valid = true;
							if (newResource != null && !newResource.getContents().isEmpty()) {
								EObject object = newResource.getContents().get(0);
								if (object instanceof NetAnnotations) {
									netAnnotations = (NetAnnotations) object;
									outer: for (NetAnnotation netAnnotation: netAnnotations.getNetAnnotations()) {
										if (net.equals(netAnnotation.getNet())) {
											for (ObjectAnnotation annotation: netAnnotation.getObjectAnnotations()) {
												if (!net.equals(NetFunctions.getPetriNet(annotation.getObject()))) {
													valid = false;
													break outer;
												}
											}
											
										} else {
											valid = false;
											break outer;
										}
									}
								} else {
									valid = false;
								}
							} else {
								valid = false;
							}
							
							List<Resource> allResources = new ArrayList<Resource>(resourceSet.getResources());
							for (Resource res: allResources) {
								// remove all added resources
								if (!resources.contains(res)) {
									// res.unload();
									res.setTrackingModification(false);
									resourceSet.getResources().remove(res);
									if (res == newResource) {
										res.getContents().remove(netAnnotations);

										// This is a hack to remove all adapters from the annotations
										// (in particular the TransactionalEditionDomain adpater will cause problems later)
										netAnnotations.eAdapters().clear();
										Iterator<EObject> iterator = netAnnotations.eAllContents();
										while (iterator.hasNext()) {
											EObject object = iterator.next();
											object.eAdapters().clear();
										}
									}
								}
							}
							
							
							if (valid) {
								List<ApplicationFactory> factories = Activator.getInstance().getApplicationFactories(net);
								for (ApplicationFactory factory: factories) {
									if (factory.getID() != null && factory.getID().equals(netAnnotations.getAppId())) {
										// TODO this should eventually be the applications id
										if (factory.isApplicable(net)) {
											Application application = factory.startApplication(net);
											if (application != null) {
												application.initialize(netAnnotations);
												Activator.getInstance().getApplicationRegistry().addApplication(application);
												ResourceSet freshResourceSet = new ResourceSetImpl();
												Resource freshResource = freshResourceSet.createResource(uri);
												freshResource.getContents().add(netAnnotations);
												freshResource.setModified(false);
												freshResource.setTrackingModification(true);
												// application.updateActionEnabledness();
												return;
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		
		MessageDialog.openError(null, "Load application", "Application could not be started on the chosen file!");
		
	}

}

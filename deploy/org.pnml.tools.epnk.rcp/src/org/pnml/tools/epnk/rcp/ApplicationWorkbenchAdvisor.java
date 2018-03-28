package org.pnml.tools.epnk.rcp;

import java.lang.reflect.InvocationTargetException;
import java.net.URL;

import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.application.IWorkbenchConfigurer;
import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.application.WorkbenchAdvisor;
import org.eclipse.ui.application.WorkbenchWindowAdvisor;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.internal.ide.IDEInternalWorkbenchImages;
import org.eclipse.ui.internal.ide.IDEWorkbenchMessages;
import org.eclipse.ui.internal.progress.ProgressMonitorJobsDialog;
import org.osgi.framework.Bundle;

/**
 * This workbench advisor creates the window advisor, and specifies
 * the perspective id for the initial window.
 */
@SuppressWarnings("restriction")
public class ApplicationWorkbenchAdvisor extends WorkbenchAdvisor {
	
	public WorkbenchWindowAdvisor createWorkbenchWindowAdvisor(IWorkbenchWindowConfigurer configurer) {
        return new ApplicationWorkbenchWindowAdvisor(configurer);
    }

	public String getInitialWindowPerspectiveId() {
		return Perspective.ID;
	} 
	
	public IAdaptable getDefaultPageInput() {
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		return workspace.getRoot();
	}
	
	public void initialize(IWorkbenchConfigurer configurer) {
		super.initialize(configurer);
		configurer.setSaveAndRestore(true);

		IDE.registerAdapters();
		
		Bundle ideBundle = Platform.getBundle("org.eclipse.ui.ide");
		
		final String ICONS_PATH = "icons/full/";
		final String PATH_OBJECT = ICONS_PATH + "obj16/";
		
		declareWorkbenchImage(configurer, ideBundle,
				IDE.SharedImages.IMG_OBJ_PROJECT,
				PATH_OBJECT + "prj_obj.gif",
				true);
		declareWorkbenchImage(configurer, ideBundle,
				IDE.SharedImages.IMG_OBJ_PROJECT_CLOSED,
				PATH_OBJECT + "cprj_obj.gif",
				true);	
		declareWorkbenchImage(configurer, ideBundle,
				IDEInternalWorkbenchImages.IMG_OBJS_ERROR_PATH,
				PATH_OBJECT + "error_tsk.gif",
				true);
		declareWorkbenchImage(configurer, ideBundle,
				IDEInternalWorkbenchImages.IMG_OBJS_WARNING_PATH,
				PATH_OBJECT + "warn_tsk.gif",
				true);
		declareWorkbenchImage(configurer, ideBundle,
				IDEInternalWorkbenchImages.IMG_OBJS_INFO_PATH,
				PATH_OBJECT + "info_tsk.gif",
				true);
		
		final String PATH_ETOOL = ICONS_PATH + "etool16/";

		declareWorkbenchImage(configurer, ideBundle,
				IDEInternalWorkbenchImages.IMG_ETOOL_PROBLEM_CATEGORY,
				PATH_ETOOL + "problem_category.gif",
				true);


	}

	private void declareWorkbenchImage(IWorkbenchConfigurer configurer_p,
			Bundle ideBundle, String symbolicName, String path, boolean shared) {
		URL url = ideBundle.getEntry(path);
		ImageDescriptor desc = ImageDescriptor.createFromURL(url);
		configurer_p.declareImage(symbolicName, desc, shared);
	}

	@Override
	public void postShutdown() {
		saveWorkspace();
	}
	
	/**
	 * Save the workspace. This method is almost an exact copy of the method
	 * disconnectFromWorkspace() of the class IDEWorkbenchAdvisor
	 * from package org.eclipse.ui.internal.ide from the eclipse
	 * implementation
	 */
	private void saveWorkspace() {
		final MultiStatus status = new MultiStatus(
				Activator.PLUGIN_ID, 1,
				IDEWorkbenchMessages.ProblemsSavingWorkspace, null);
		IRunnableWithProgress runnable = new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor) {
				try {
					status.merge(ResourcesPlugin.getWorkspace().save(true,
							monitor));
				} catch (CoreException e) {
					status.merge(e.getStatus());
				}
			}
		};
		try {
			new ProgressMonitorJobsDialog(null).run(true, false, runnable);
		} catch (InvocationTargetException e) {
			status
			.merge(new Status(IStatus.ERROR,
					Activator.PLUGIN_ID, 1,
					IDEWorkbenchMessages.InternalError, e
					.getTargetException()));
		} catch (InterruptedException e) {
			status.merge(new Status(IStatus.ERROR,
					Activator.PLUGIN_ID, 1,
					IDEWorkbenchMessages.InternalError, e));
		}
		ErrorDialog.openError(null,
				IDEWorkbenchMessages.ProblemsSavingWorkspace, null, status,
				IStatus.ERROR | IStatus.WARNING);
	}
	
}

package org.pnml.tools.epnk.extensions.codegenerator;


import org.pnml.tools.epnk.pnmlcoremodel.Name;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNet;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNetType;
import org.pnml.tools.epnk.pntypes.ptnet.PTNet;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.codegen.jet.JETEmitter;
import org.eclipse.emf.codegen.jet.JETException;
import org.eclipse.emf.common.ui.dialogs.WorkspaceResourceDialog;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

/**
 * User action to start the generation of the Java code for
 * a Petri net.
 * 
 * @author kindler
 */
public class GenerateJavaCodeAction implements IObjectActionDelegate {

	private Shell shell;

	// Store last location of the dialog.
	private IContainer container = null;

	private PetriNet petrinet;

	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
	}

	public void run(IAction action) {
		// get the path to the template
		String uri = Activator.getDefault().getBundle().getEntry("templates/Petrinet.javajet").toString();

		// instantiate the JET Engine for our template
		final JETEmitter emitter = new JETEmitter(uri, getClass().getClassLoader());

		// specify filename and ask where to save the generated automaton
		String className = "Net";

		Name name = petrinet.getName();
		if (name != null) {
			className = Utils.convert2ClassName(name.getText());
		}
		
		final String fileName = Utils.convert2ClassName(className) + ".java";
		IContainer[] containers = WorkspaceResourceDialog.openFolderSelection(shell, "Save Java code...",
				"Please select a folder to which the generated java code should go.", false, new IContainer[] { container }, null);
		if (containers.length == 1) {
			container = containers[0];
			final IFile file = container.getFile(new Path(fileName));

			// run jet transformation in a job (separate thread)
			final Job job = new Job("Generating Java code for the Petri net: ") {
				@Override
				protected IStatus run(IProgressMonitor monitor) {
					try {
						// these are the plugins which contain imported packages in the template!
						emitter.addVariable("PETRINET2JAVA", Activator.PLUGIN_ID);
						emitter.addVariable("EPNK", "org.pnml.tools.epnk");
						emitter.addVariable("EPNK_PTNETS", "org.pnml.tools.epnk.pntypes");
						emitter.addVariable("EMF_COMMON", "org.eclipse.emf.common");
						emitter.addVariable("EMF_ECORE", "org.eclipse.emf.ecore");

						// start the generation process with the appropriate argument ;-)
						String result = emitter.generate(monitor, new Object[] { petrinet });
						

						// store result in the specified file
						InputStream newContents = new ByteArrayInputStream(result.getBytes());
						if (file.exists()) {
							file.setContents(newContents, true, true, new SubProgressMonitor(monitor, 1));
						} else {
							file.create(newContents, true, new SubProgressMonitor(monitor, 1));
						}

					// some error handling...
					} catch (JETException e) {
						return new Status(Status.ERROR, Activator.PLUGIN_ID,
								"An exception occurred during the code generation! Please check the error view. "
										+ e.getMessage(), e);
					} catch (CoreException e) {
						return new Status(Status.ERROR, Activator.PLUGIN_ID,
								"An exception occurred saving the generated code! Please check the error view. "
										+ e.getMessage(), e);
					}
					monitor.worked(1);
					return new Status(Status.OK, Activator.PLUGIN_ID, "Code successfully generated");
				}
			};
			
			// enqueue the job
			job.setUser(true);
			job.schedule();
		}
	}

	public void selectionChanged(IAction action, ISelection selection) {
		// get the component from the current selection, if possible
		petrinet = null;
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			if (structuredSelection.size() == 1
					&& structuredSelection.getFirstElement() instanceof PetriNet) {
				petrinet = (PetriNet) structuredSelection.getFirstElement();
			}
		}
		action.setEnabled(isEnabled());
	}

	private boolean isEnabled() {
		if (petrinet != null) {
			PetriNetType type = petrinet.getType();
			if (type instanceof PTNet) {
				return true;
			}
		}
		
		return false;
	}
}

package org.pnml.tools.epnk.actions.handlers;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.expressions.IEvaluationContext;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.pde.core.IBaseModel;
import org.eclipse.pde.core.plugin.IExtensionsModelFactory;
import org.eclipse.pde.core.plugin.IPluginElement;
import org.eclipse.pde.core.plugin.IPluginExtension;
import org.eclipse.pde.core.plugin.IPluginModelBase;
import org.eclipse.pde.core.plugin.PluginRegistry;
import org.eclipse.pde.internal.core.bundle.BundlePluginModel;
import org.eclipse.pde.internal.ui.util.ModelModification;
import org.eclipse.pde.internal.ui.util.PDEModelUtility;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage;

@SuppressWarnings("restriction")
public class AddPackageToPlugin extends AbstractHandler implements IHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IProject project = null;
		IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		if ( window != null ) {
			IWorkbenchPage page = window.getActivePage();
			if ( page != null ) {
				IEditorPart editor = page.getActiveEditor();
				if ( editor != null ) {
					IEditorInput input = editor.getEditorInput();
					if ( input instanceof IFileEditorInput) {
						IFileEditorInput fileInput = (IFileEditorInput) input;
						project = fileInput.getFile().getProject();
					}
				}
			}					
		}

		if (project != null) {
			ISelection selection = HandlerUtil.getActiveWorkbenchWindow(event)
					.getActivePage().getSelection();
			if (selection != null & selection instanceof IStructuredSelection) {
				IStructuredSelection structuredSelection = (IStructuredSelection) selection;
				if (structuredSelection.size() == 1) {
					EPackage pack = getPackage(structuredSelection.getFirstElement());
					if (pack != null) {
						addPackageToPlugin(pack, project);
					}
				}
			}
		}

		return null;
	}
	
	private boolean enabled = true;
	
	@Override
	public boolean isEnabled() {
		return enabled;
	}
	
	final private String PETRI_NET_TYPE_CLASS_NAME = PnmlcoremodelPackage.eINSTANCE.getPetriNetType().getName();
	final private String PNML_CORE_MODEL_URI = PnmlcoremodelPackage.eINSTANCE.getNsURI();
	
	@Override
	public void setEnabled(Object evaluationContext) {
		Object object = ((IEvaluationContext) evaluationContext).getDefaultVariable();
		if (object instanceof List) {
			@SuppressWarnings("rawtypes")
			List list = (List) object;
			if (list.size() == 1) {
				EPackage pack = getPackage(list.get(0));
				if (pack != null) {
					for (EClassifier classifier: pack.getEClassifiers()) {
						if (classifier instanceof EClass) {
							EClass clazz = (EClass) classifier;
							if (!clazz.isAbstract() &&
									!clazz.isInterface()) {
								List<EClass> supers = clazz.getEAllSuperTypes();
								for (EClass superClass: supers) {
									if (superClass.getName().equals(PETRI_NET_TYPE_CLASS_NAME) &&
											superClass.getEPackage().getNsURI().equals(PNML_CORE_MODEL_URI)) {
										enabled = true;
										return;
									}
								}
							}
						}
		 			}
				}
			}
		}
		enabled = false;
	}

	private static EPackage getPackage(Object object) {
		if (object instanceof EPackage) {
			return (EPackage) object;
		} else if (object instanceof IAdaptable) {
			return (EPackage) ((IAdaptable) object).getAdapter(EPackage.class);
		}
		return null;
	}
	
	private static void addPackageToPlugin(final EPackage pack, IProject project) {
		IPluginModelBase plugin = PluginRegistry.findModel(project);

		if (plugin != null) {

			/* In order to allow including some additional information that should be
			 * present, when the PNTD is plugged in to the ePNK, the Ecore model (to be
			 * precise the package containing the PNTD) can be equipped with an annotation
			 * for the ePNK: The value for the source of the annotation is
			 *   http://epnk.tools.pnml.org/pntd 
			 *
			 * The following details entries are possible (key value):
			 *   id:          the id for the plugin (if missing the name
			 *                of the package will be use as id)
			 *
			 *   name:        the name of the PNTD extension (if missing
			 *                the name of the package will be used)
			 *
			 *   type_uri:    the URI used for representing this net type in PNML
			 *                (if missing the package's Ns URI will implicitly be
			 *                used for that purpose)
			 *
			 *   description: description of this PNTD
			 *
			 */
			
			final String id;
			final String name;
			final String type_uri;
			final String description;
			EAnnotation annotation = pack.getEAnnotation("http://epnk.tools.pnml.org/pntd");
			if (annotation != null) {
				EMap<String,String> details = annotation.getDetails();
				String value = details.get("id");
				if (value != null && value.length() != 0) {
					id = value;
				} else {
					id = pack.getName();
				}
				value = details.get("name");
				if (value != null && value.length() != 0) {
					name = value;
				} else {
					name = pack.getName();
				}
				value = details.get("type_uri");
				if (value != null && value.length() != 0) {
					type_uri = value;
				} else {
					type_uri = null;
				}
				value = details.get("description");
				if (value != null && value.length() != 0) {
					description = value;
				} else {
					description = null;
				}
			} else {
				id = pack.getName();
				name = pack.getName();
				type_uri = null;  // the attribute will not be set in the extension,
				                  // but the ePNK will implicitly use the Ns URI of the package
				description = null;
			}

			IFile file = project.getFile("plugin.xml");
			if (!file.exists()) {
				try {
					byte[] bytes = ("").getBytes();
					InputStream source = new ByteArrayInputStream(bytes);
					file.create(source, IResource.NONE, null);
				} catch (CoreException e) {
					MessageDialog.openInformation(
							null,
							"ePNK: Add PNTD package to Plugin",
							"File plugin.xml does not exist and could not be created."
					);
					return;
				}
			}

			ModelModification modification = new ModelModification(project) {

				@Override
				protected void modifyModel(
						IBaseModel model,
						IProgressMonitor monitor)
								throws CoreException {
					BundlePluginModel plugin = (BundlePluginModel) model;
					IExtensionsModelFactory factory = plugin.getFactory();
					if (factory == null) {
						MessageDialog.openInformation(
								null,
								"ePNK: Add PNTD package to Plugin",
								"There does not exists a plugin.xml yet. You need to create a plugin.xml first"
						);
						return;
					}

					IPluginExtension oldExtension = null;
					for (IPluginExtension extension : plugin.getPluginBase().getExtensions()) {
						if (extension.getPoint().equals("org.pnml.tools.epnk.pntd_package") &&
								extension.getId().equals(id)) {
							oldExtension = extension;
							break;
						}
					}
					if (oldExtension != null) {
						plugin.getExtensions().remove(oldExtension);
					}

					IPluginExtension extension = factory.createExtension();
					extension.setPoint("org.pnml.tools.epnk.pntd_package");
					extension.setId(id);
					extension.setName(name);

					IPluginElement element = factory.createElement(extension);
					element.setName("type");
					element.setAttribute("package_uri", pack.getNsURI());
					if (type_uri != null && type_uri.length() !=0 ) {
						element.setAttribute("type_uri", type_uri);
					}
					if (description != null && description.length() !=0 ) {
						element.setAttribute("description", description);
					}
					
					extension.add(element);
					plugin.getExtensions().add(extension);
				}

			};
			PDEModelUtility.modifyModel(modification, null);
		}
	}
	
}

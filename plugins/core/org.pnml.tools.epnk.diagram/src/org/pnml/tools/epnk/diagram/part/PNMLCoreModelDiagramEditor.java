package org.pnml.tools.epnk.diagram.part;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.commands.operations.IUndoContext;
import org.eclipse.core.commands.operations.ObjectUndoContext;
import org.eclipse.core.commands.operations.UndoContext;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.impl.WorkspaceCommandStackImpl;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gmf.runtime.common.ui.services.marker.MarkerNavigationService;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.ui.actions.ActionIds;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.document.IDiagramDocument;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.document.IDocument;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.document.IDocumentProvider;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.parts.DiagramDocumentEditor;
import org.eclipse.gmf.runtime.emf.commands.core.command.EditingDomainUndoContext;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorMatchingStrategy;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.SaveAsDialog;
import org.eclipse.ui.ide.IGotoMarker;
import org.eclipse.ui.navigator.resources.ProjectExplorer;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.IShowInTargetList;
import org.eclipse.ui.part.ShowInContext;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.pnml.tools.epnk.diagram.navigator.PNMLCoreModelNavigatorItem;
import org.pnml.tools.epnk.gmf.integration.helpers.PNMLPageEditorInput;
import org.pnml.tools.epnk.pnmlcoremodel.Label;
import org.pnml.tools.epnk.pnmlcoremodel.LabelProxy;
import org.pnml.tools.epnk.pnmlcoremodel.PageLabelProxy;
import org.pnml.tools.epnk.pnmlcoremodel.presentation.MultipleEditorsInfo;
import org.pnml.tools.epnk.pnmlcoremodel.presentation.MultipleEditorsRegistry;

import experiment.globalhandlers.PropertiesBrowserPageNoPrune;

/**
 * @generated
 */
public class PNMLCoreModelDiagramEditor extends DiagramDocumentEditor implements
		IGotoMarker {

	/**
	 * @generated
	 */
	public static final String ID = "org.pnml.tools.epnk.diagram.part.PNMLCoreModelDiagramEditorID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final String CONTEXT_ID = "org.pnml.tools.epnk.diagram.ui.diagramContext"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public PNMLCoreModelDiagramEditor() {
		super(true);
	}

	/**
	 * @generated
	 */
	protected String getContextID() {
		return CONTEXT_ID;
	}

	/**
	 * @generated
	 */
	protected PaletteRoot createPaletteRoot(PaletteRoot existingPaletteRoot) {
		PaletteRoot root = super.createPaletteRoot(existingPaletteRoot);
		new PNMLCoreModelPaletteFactory().fillPalette(root);
		return root;
	}

	/**
	 * @generated
	 */
	protected PreferencesHint getPreferencesHint() {
		return PNMLCoreModelDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT;
	}

	/**
	 * @generated
	 */
	public String getContributorId() {
		return PNMLCoreModelDiagramEditorPlugin.ID;
	}

	/**
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public Object getAdapterGen(Class type) {
		if (type == IShowInTargetList.class) {
			return new IShowInTargetList() {
				public String[] getShowInTargetIds() {
					return new String[] { ProjectExplorer.VIEW_ID };
				}
			};
		}
		return super.getAdapter(type);
	}

	// @generated NOT
	// @author eki
	public Object getAdapter(Class type) {
		// eki: make sure that we do install the GlobalUndo and GlobalRedoAction
		//      that do not flush the operation history when constraints are
		//      violated.
		if (type == IPropertySheetPage.class) {
			return new PropertiesBrowserPageNoPrune(this);
		}
		return getAdapterGen(type);
	}

	/**
	 * @generated
	 */
	protected IDocumentProvider getDocumentProvider(IEditorInput input) {
		if (input instanceof IFileEditorInput
				|| input instanceof URIEditorInput) {
			return PNMLCoreModelDiagramEditorPlugin.getInstance()
					.getDocumentProvider();
		}
		return super.getDocumentProvider(input);
	}

	/**
	 * @generated
	 */
	public TransactionalEditingDomain getEditingDomain() {
		IDocument document = getEditorInput() != null ? getDocumentProvider()
				.getDocument(getEditorInput()) : null;
		if (document instanceof IDiagramDocument) {
			return ((IDiagramDocument) document).getEditingDomain();
		}
		return super.getEditingDomain();
	}

	/**
	 * @generated
	 */
	protected void setDocumentProviderGen(IEditorInput input) {
		if (input instanceof IFileEditorInput
				|| input instanceof URIEditorInput) {
			setDocumentProvider(PNMLCoreModelDiagramEditorPlugin.getInstance()
					.getDocumentProvider());
		} else {
			super.setDocumentProvider(input);
		}
	}

	// @generated NOT
	// @author eki
	@Override
	public void doSetInput(IEditorInput input, boolean releaseEditorContents)
			throws CoreException {
		super.doSetInput(input, releaseEditorContents);
		if (input instanceof PNMLPageEditorInput) {
			EditingDomain domain = ((PNMLPageEditorInput) input)
					.getEditingDomain();
			if (domain != null) {
				MultipleEditorsInfo editorsInfo = MultipleEditorsRegistry
						.getInstance().getInfo(domain);
				if (editorsInfo != null) {
					editorsInfo.addSecondaryEditor(this);
				}
			}
		}
	}

	/**
	 * @generated NOT EMF/GMF integration
	 * @author eki
	 */
	protected void setDocumentProvider(IEditorInput input) {
		if (input instanceof PNMLPageEditorInput) {
			setDocumentProvider(PNMLCoreModelDiagramEditorPlugin.getInstance()
					.getDocumentProvider());
			/*
			 eki: for this to properly work, this should be done after the
			      input is completely set (see doSetInput() )
			EditingDomain domain = ((PNMLPageEditorInput) input)
					.getEditingDomain();
			if (domain != null) {
				MultipleEditorsInfo editorsInfo = MultipleEditorsRegistry
						.getInstance().getInfo(domain);
				if (editorsInfo != null) {
					editorsInfo.addSecondaryEditor(this);
				}
			}
			 */
		} else {
			setDocumentProviderGen(input);
		}
	}

	/**
	 * @generated
	 */
	public void gotoMarkerGen(IMarker marker) {
		MarkerNavigationService.getInstance().gotoMarker(this, marker);
	}

	/**
	 * Implements the selection of an element implied by a marker. Note that this is
	 * invoked from the respective method of the EMF editor (for reasons that lie deeper
	 * down in the design of eclipse and the ePNK (the GMF diagrams do not use IFile
	 * as input).
	 * 
	 * @generated NOT
	 * @author eki
	 */
	@SuppressWarnings("unchecked")
	public void gotoMarker(IMarker marker) {
		IEditorInput input = this.getEditorInput();
		if (input != null && input instanceof PNMLPageEditorInput) {
			AdapterFactoryEditingDomain domain = (AdapterFactoryEditingDomain) ((PNMLPageEditorInput) input)
					.getEditingDomain();
			if (domain != null) {
				String type = null;
				try {
					type = marker.getType();
				} catch (CoreException e) {

				}
				if (type != null && type.equals(EValidator.MARKER)) {
					String uriAttribute = marker.getAttribute(
							EValidator.URI_ATTRIBUTE, null);
					if (uriAttribute != null) {
						URI uri = URI.createURI(uriAttribute);
						EObject object = domain.getResourceSet().getEObject(
								uri, true);

						while (object != null
								&& !(object instanceof org.pnml.tools.epnk.pnmlcoremodel.Object)
								&& !(object instanceof Label)) {
							object = object.eContainer();
						}

						DiagramEditPart canvas = this.getDiagramEditPart();
						List list = new ArrayList(canvas.getChildren());
						list.addAll(canvas.getConnections());

						if (object != null && canvas != null) {
							for (Object o : list) {
								if (o instanceof EditPart) {
									EditPart part = (EditPart) o;
									IGraphicalEditPart editPart = (IGraphicalEditPart) (part
											.getAdapter(IGraphicalEditPart.class));
									if (editPart != null) {
										EObject element = editPart
												.resolveSemanticElement();
										if (element == object
												|| (element != null
														&& element instanceof LabelProxy && object == ((LabelProxy) element)
														.getLabel())
												|| (element != null
														&& element instanceof PageLabelProxy && object == ((PageLabelProxy) element)
														.getLabel())) {
											this.getGraphicalViewer().select(
													part);
											// this.getGraphicalViewer().setFocus(part);
											IWorkbenchPage page = PlatformUI
													.getWorkbench()
													.getActiveWorkbenchWindow()
													.getActivePage();
											try {
												// TODO: this is a bit brutal since we are opening another editor while still being in
												//       the process of opening the EMF editor; but due to the inner workings of eclipse, and
												//       some design choices of the ePNK diagram editor, there is not other (easy) way.
												//       And it appears to be working without any problems (remains to be seen in the long run).
												page.openEditor(input,
														"org.pnml.tools.epnk.diagram.part.PNMLCoreModelDiagramEditorID");
											} catch (PartInitException e) {
												e.printStackTrace();
											}
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
		// eki: I do not even call the automatically generated method (but I keep it anyway).
		// gotoMarkerGen(marker);
	}

	/**
	 * @generated NOT EMF/GMF integration
	 * @author eki
	 */
	public boolean isSaveAsAllowed() {
		IEditorInput input = getEditorInput();
		if (input != null && !(input instanceof PNMLPageEditorInput)) {
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public void doSaveAs() {
		performSaveAs(new NullProgressMonitor());
	}

	/**
	 * @generated
	 */
	protected void performSaveAs(IProgressMonitor progressMonitor) {
		Shell shell = getSite().getShell();
		IEditorInput input = getEditorInput();
		SaveAsDialog dialog = new SaveAsDialog(shell);
		IFile original = input instanceof IFileEditorInput ? ((IFileEditorInput) input)
				.getFile() : null;
		if (original != null) {
			dialog.setOriginalFile(original);
		}
		dialog.create();
		IDocumentProvider provider = getDocumentProvider();
		if (provider == null) {
			// editor has been programmatically closed while the dialog was open
			return;
		}
		if (provider.isDeleted(input) && original != null) {
			String message = NLS.bind(
					Messages.PNMLCoreModelDiagramEditor_SavingDeletedFile,
					original.getName());
			dialog.setErrorMessage(null);
			dialog.setMessage(message, IMessageProvider.WARNING);
		}
		if (dialog.open() == Window.CANCEL) {
			if (progressMonitor != null) {
				progressMonitor.setCanceled(true);
			}
			return;
		}
		IPath filePath = dialog.getResult();
		if (filePath == null) {
			if (progressMonitor != null) {
				progressMonitor.setCanceled(true);
			}
			return;
		}
		IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
		IFile file = workspaceRoot.getFile(filePath);
		final IEditorInput newInput = new FileEditorInput(file);
		// Check if the editor is already open
		IEditorMatchingStrategy matchingStrategy = getEditorDescriptor()
				.getEditorMatchingStrategy();
		IEditorReference[] editorRefs = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getActivePage()
				.getEditorReferences();
		for (int i = 0; i < editorRefs.length; i++) {
			if (matchingStrategy.matches(editorRefs[i], newInput)) {
				MessageDialog.openWarning(shell,
						Messages.PNMLCoreModelDiagramEditor_SaveAsErrorTitle,
						Messages.PNMLCoreModelDiagramEditor_SaveAsErrorMessage);
				return;
			}
		}
		boolean success = false;
		try {
			provider.aboutToChange(newInput);
			getDocumentProvider(newInput).saveDocument(progressMonitor,
					newInput,
					getDocumentProvider().getDocument(getEditorInput()), true);
			success = true;
		} catch (CoreException x) {
			IStatus status = x.getStatus();
			if (status == null || status.getSeverity() != IStatus.CANCEL) {
				ErrorDialog.openError(shell,
						Messages.PNMLCoreModelDiagramEditor_SaveErrorTitle,
						Messages.PNMLCoreModelDiagramEditor_SaveErrorMessage,
						x.getStatus());
			}
		} finally {
			provider.changed(newInput);
			if (success) {
				setInput(newInput);
			}
		}
		if (progressMonitor != null) {
			progressMonitor.setCanceled(!success);
		}
	}

	/**
	 * @generated
	 */
	public ShowInContext getShowInContext() {
		return new ShowInContext(getEditorInput(), getNavigatorSelection());
	}

	/**
	 * @generated
	 */
	private ISelection getNavigatorSelection() {
		IDiagramDocument document = getDiagramDocument();
		if (document == null) {
			return StructuredSelection.EMPTY;
		}
		Diagram diagram = document.getDiagram();
		if (diagram == null || diagram.eResource() == null) {
			return StructuredSelection.EMPTY;
		}
		IFile file = WorkspaceSynchronizer.getFile(diagram.eResource());
		if (file != null) {
			PNMLCoreModelNavigatorItem item = new PNMLCoreModelNavigatorItem(
					diagram, file, false);
			return new StructuredSelection(item);
		}
		return StructuredSelection.EMPTY;
	}

	/**
	 * @generated
	 */
	protected void configureGraphicalViewerGen() {
		super.configureGraphicalViewer();
		DiagramEditorContextMenuProvider provider = new DiagramEditorContextMenuProvider(
				this, getDiagramGraphicalViewer());
		getDiagramGraphicalViewer().setContextMenu(provider);
		getSite().registerContextMenu(ActionIds.DIAGRAM_EDITOR_CONTEXT_MENU,
				provider, getDiagramGraphicalViewer());
	}

	// @generated NOT
	protected void configureGraphicalViewer() {
		// TODO: This was an experiment and for debugging only: can be deleted.
		configureGraphicalViewerGen();
	}

	IUndoContext undoContext;

	/**
	 * Gets my undo context. Lazily initializes my undo context if it has not
	 * been set.
	 * 
	 * @return my undo context
	 * @override
	 * @generated NOT
	 */
	protected IUndoContext getUndoContext() {

		if (undoContext == null) {
			TransactionalEditingDomain domain = getEditingDomain();

			if (domain != null) {
				org.eclipse.emf.common.command.CommandStack stack = domain
						.getCommandStack();
				if (stack instanceof WorkspaceCommandStackImpl) {
					undoContext = ((WorkspaceCommandStackImpl) stack)
							.getDefaultUndoContext();

				} else {
					undoContext = new EditingDomainUndoContext(domain);
				}

			} else {
				undoContext = new ObjectUndoContext(this);
			}
		}
		return undoContext;
	}

	@Override
	// @generated NOT
	// @author eki
	public boolean isDirty() {
		IEditorInput input = getEditorInput();
		if (input != null && input instanceof PNMLPageEditorInput) {
			// if the input comes from an EMF editor, the graphical editor
			// never get dirty! The content should always be saved with the
			// EMF Editors.
			return false;
		}
		return super.isDirty();
	}

	@Override
	// @generated NOT
	// @author eki
	public void close(boolean save) {
		IEditorInput input = getEditorInput();
		if (input != null && input instanceof PNMLPageEditorInput) {
			// do not ask for saving here
			super.close(false);
		} else {
			super.close(save);
		}
	}

	@Override
	// @generated NOT
	// @author eki
	public void dispose() {
		IEditorInput input = getEditorInput();
		if (input != null && input instanceof PNMLPageEditorInput) {
			MultipleEditorsInfo info = MultipleEditorsRegistry.getInstance()
					.getInfo(((PNMLPageEditorInput) input).getEditingDomain());
			if (info != null) {
				info.removeSecondaryEditor(this);
			}
			// eki: in order not to remove the commands of this editor from
			//      the operation history, the UndoContext is changed here
			//      to a new one. This is a hack. But, otherwise, the dispose
			//      method would be very tricky to implement.
			undoContext = new UndoContext();
		}
		super.dispose();
	}

}

package org.pnml.tools.epnk.pnmlcoremodel.presentation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramGraphicalViewer;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.EditorPart;
import org.pnml.tools.epnk.annotations.manager.DiagramAnnotationsManager;
import org.pnml.tools.epnk.gmf.integration.helpers.PNMLPageEditorInput;
import org.pnml.tools.epnk.managers.graphics.resources.GraphicsResourcesManager;
import org.pnml.tools.epnk.managers.problems.ProblemManager;
import org.pnml.tools.epnk.pnmlcoremodel.Page;

public class MultipleEditorsInfo {
	
	private EditorPart mainEditor;
	private EditingDomain domain;
	
	private List<IEditorPart> secondaryEditors;
	
	private boolean disposed;
	
	private ProblemManager problemManager;
	
	private GraphicsResourcesManager graphicsResourcesManager;
	
	private DiagramAnnotationsManager diagramAnnotationsManager; 

	
	public MultipleEditorsInfo(EditorPart mainEditor, EditingDomain domain) {
		super();
		this.mainEditor = mainEditor;
		this.domain = domain;
		
		secondaryEditors = new ArrayList<IEditorPart>();
		disposed = false;
		problemManager = null;
		graphicsResourcesManager = null;
		diagramAnnotationsManager = null;
		
		MultipleEditorsRegistry.getInstance().addInfo(domain, this);
	}
	
	public EditorPart getMainEditor() {
		return mainEditor;
	}
	
	public void addSecondaryEditor(IEditorPart editor) {
		if (!disposed) {
			secondaryEditors.add(editor);

			for (IEditorPart part: secondaryEditors) {
				if (part != editor && part instanceof DiagramEditor) {
					// eki: make sure to update the context menus of the elements in the other editors;
					//      this is necessary to guarantee that delete action on pages (which is dependent
					//      on whether there are editors open on sub pages)
					DiagramEditor diagramEditor = (DiagramEditor) part;

					IDiagramGraphicalViewer viewer = diagramEditor.getDiagramGraphicalViewer();
					if (viewer != null) {
						// eki: updating the context menus is achieved by "simulating" a new selection 
						viewer.setSelection(viewer.getSelection());
					}

					// redraw sub page open decorators
				    DiagramEditPart part2 = diagramEditor.getDiagramEditPart();
				    if (part2 != null) {
				    	part2.refresh();
				    	for (Object object: part2.getChildren()) {
				    		if (object instanceof EditPart) {
				    			((EditPart) object).refresh();
				    		}
				    	}
				    }
				}
			}
		}
	}
	
	public void removeSecondaryEditor(IEditorPart editor) {
		if (!disposed) {
			secondaryEditors.remove(editor);

			for (IEditorPart part: secondaryEditors) {
				if (part instanceof DiagramEditor) {
					// eki: make sure to update the context menus of the elements in the other editors;
					//      this is necessary to guarantee that delete action on pages (which is dependent
					//      on whether there are editors open on sub pages)
					DiagramEditor diagramEditor = (DiagramEditor) part;
					IDiagramGraphicalViewer viewer = diagramEditor.getDiagramGraphicalViewer();
					if (viewer != null) {
						// eki: updating the context menus is achieved by "simulating" a new selection 
						viewer.setSelection(viewer.getSelection());
					}

					// redraw sub page open decorators
				    DiagramEditPart part2 = diagramEditor.getDiagramEditPart();
				    if (part2 != null) {
				    	part2.refresh();
				    	for (Object object: part2.getChildren()) {
				    		if (object instanceof EditPart) {
				    			((EditPart) object).refresh();
				    		}
				    	}
				    }
				}
			}
		}
	}

	public void closeSecondaryEditors() {
		if (!disposed) {
			List<IEditorPart> editors = new ArrayList<IEditorPart>(secondaryEditors);
		    IWorkbench workbench = PlatformUI.getWorkbench();
		    if (workbench != null) {
		    	IWorkbenchWindow window = workbench.getActiveWorkbenchWindow();
		    	if (window != null) {
					IWorkbenchPage page = window.getActivePage();
					if (page != null) {
						for (IEditorPart editor: editors) {
							page.closeEditor(editor, false);
						}
					}		    		
		    	}
		    }
			secondaryEditors.clear();
		}
	}
	
	public GraphicsResourcesManager getGraphicsResourcesManager() {
		if (graphicsResourcesManager == null) {
			graphicsResourcesManager = new GraphicsResourcesManager();
		} 
		
		return graphicsResourcesManager;
	}
	
	public DiagramAnnotationsManager getAnnotationsManager() {
		if (diagramAnnotationsManager == null) {
			diagramAnnotationsManager = new DiagramAnnotationsManager(this);  
		}
		return diagramAnnotationsManager; 
	}

	public void setProblemManager(ProblemManager manager) {
		if (this.problemManager != null) {
			this.problemManager.dispose();
		}
		this.problemManager = manager;
	}

	public ProblemManager getProblemManager() {
		return problemManager;
	}

	public void dispose() {
		if (!disposed) {
			closeSecondaryEditors();
			if (diagramAnnotationsManager != null) {
				diagramAnnotationsManager.dispose();
				diagramAnnotationsManager = null;
			}
			if (problemManager != null) {
				problemManager.dispose();
				problemManager = null;
			}
			if (graphicsResourcesManager != null && !graphicsResourcesManager.isDisposed()) {
				graphicsResourcesManager.dispose();
				graphicsResourcesManager = null;
			}			
			disposed = true;
		}
		MultipleEditorsRegistry.getInstance().removeInfo(domain);
	}

	public boolean isSecondaryEditorOpenOn(Collection<Page> pages) {
		if (pages != null) {
			for (IEditorPart editor: secondaryEditors) {
				IEditorInput input = editor.getEditorInput();
				if (input != null && input instanceof PNMLPageEditorInput) {
					Page page = ((PNMLPageEditorInput) input).getInputPage();
					if (pages.contains(page)) {
						return true;
					}
				}
			}
		}
		return false;
	}

	/*
	 * eki: not needed for now.
	public void closeSecondaryEditorsOn(Collection<Page> pages) {
		IWorkbenchPage workbenchPage = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();

		if (pages != null) {
			for (IEditorPart editor: secondaryEditors) {
				IEditorInput input = editor.getEditorInput();
				if (input != null && input instanceof PNMLPageEditorInput) {
					Page page = ((PNMLPageEditorInput) input).getInputPage();
					if (pages.contains(page)) {
						workbenchPage.closeEditor(editor, false);
					}
				}
			}
		}
	}
	*/

	public List<IEditorPart> getSecondaryEditors() {
		return new ArrayList<IEditorPart>(secondaryEditors);
	}

}

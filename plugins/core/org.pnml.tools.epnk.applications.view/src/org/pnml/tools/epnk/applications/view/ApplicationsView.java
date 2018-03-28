package org.pnml.tools.epnk.applications.view;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IPartListener2;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchPartReference;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;
import org.pnml.tools.epnk.annotations.manager.DiagramAnnotationsManager;
import org.pnml.tools.epnk.annotations.netannotations.NetAnnotation;
import org.pnml.tools.epnk.annotations.netannotations.NetAnnotations;
import org.pnml.tools.epnk.applications.IApplication;
import org.pnml.tools.epnk.applications.activator.Activator;
import org.pnml.tools.epnk.applications.presentation.IApplicationWithPresentation;
import org.pnml.tools.epnk.applications.registry.ApplicationRegistry;
import org.pnml.tools.epnk.applications.registry.IApplicationsListener;
import org.pnml.tools.epnk.applications.view.actions.StartApplicationMenu;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNet;
import org.pnml.tools.epnk.pnmlcoremodel.presentation.MultipleEditorsInfo;
import org.pnml.tools.epnk.pnmlcoremodel.presentation.MultipleEditorsRegistry;


/**
 * This is a simple view that shows the applications that are currently registered
 * with the ePNK.
 * 
 * @author eki@imm.dtu.dk
 */
public class ApplicationsView extends ViewPart implements ISelectionListener, ISelectionChangedListener, IApplicationsListener {

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "org.pnml.tools.epnk.applications.view";
	
	private static final String[] columnHead = new String[] 
			{ "Runtime name", "Application name", "Net", "Info" };
	private static final int[] columnWidth = new int[] 
			{ 100, 160, 160, 340 };
	private static final int[] columnAlignment = new int[] 
			{ SWT.LEFT, SWT.LEFT, SWT.LEFT, SWT.LEFT };

	/**
	 * The viewer that shows the overview.
	 */
	private CheckboxTableViewer viewer;
	
	/**
	 * This is a callback method that is used to create the viewer and 
	 * initialize it.
	 */
	public void createPartControl(Composite parent) {
		viewer = CheckboxTableViewer.newCheckList(parent, SWT.FULL_SELECTION | SWT.MULTI);
		viewer.setContentProvider(new ArrayContentProvider());
		viewer.setLabelProvider(new ApplicationsTableLabelProvider());

		Table table = viewer.getTable();
		table.setHeaderVisible(true);
		table.setLinesVisible(true);

		TableColumn[] columns = new TableColumn[columnHead.length];

		for (int i=0; i < columnHead.length; i++) {
			columns[i] = new TableColumn(table, columnAlignment[i]);
			columns[i].setText(columnHead[i]);
			columns[i].setWidth(columnWidth[i]);
		}

		TableViewerColumn viewerColumn = new TableViewerColumn(viewer, columns[0]);
		viewerColumn.setEditingSupport(new ApplicationNameEditingSupport(viewer));
		viewerColumn.setLabelProvider(new ApplicationNameColumnLabeProvider());
				
		viewer.addSelectionChangedListener(this);

    	/* We could eventually add this view to the
		 * workbench selection listener, so that the Table could be
		 * filtered for applications concerning the current selection.
		 * But, for now, we do not register this view as a workbench selection
		 * listener since we do not do any filtering.

		   getSite().getPage().addSelectionListener(this);
		   selectionChanged(null, getSite().getPage().getSelection());
		 */
		
        Activator activator = Activator.getInstance();
        ApplicationRegistry registry = activator.getApplicationRegistry();
        
		viewer.setInput(registry.getApplications());
		registry.addListener(this);
		
		createViewActions();
	}

	private StartApplicationMenu startApplicationsMenu;
	private Action deleteApplicationsAction;
	private IActionBars actionBars;

	private void createViewActions() {
		startApplicationsMenu = new StartApplicationMenu();
		startApplicationsMenu.setId("startApplicationsAction");

		deleteApplicationsAction = new Action() {
			public void run() {
				Object[] elements = ApplicationsView.this.viewer.getCheckedElements();
				Activator activator = Activator.getInstance();
				ApplicationRegistry registry = activator.getApplicationRegistry();
				for (int i=0; i < elements.length; i++) {
					if (elements[i] instanceof IApplication) {
						registry.removeApplication((IApplication) elements[i]);
					}
				}
				ApplicationsView.this.viewer.setInput(registry.getApplications());
			}
		};
		deleteApplicationsAction.setId("deleteApplicationsAction");
		deleteApplicationsAction.setText("Delete selected applications");
		deleteApplicationsAction.setToolTipText("Delete the selected applications (check the applications in the table below)");
		deleteApplicationsAction.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
				getImageDescriptor(ISharedImages.IMG_ETOOL_DELETE));
		deleteApplicationsAction.setEnabled(ApplicationsView.this.viewer.getCheckedElements().length > 0);

		actionBars = getViewSite().getActionBars();
		actionBars.getToolBarManager().add(startApplicationsMenu);
		actionBars.getToolBarManager().add(deleteApplicationsAction);
		actionBars.getToolBarManager().update(true);
		
		startApplicationsMenu.updateEnabled();
		
		getSite().getPage().addPartListener(partlistener);
	}
	
	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		viewer.getControl().setFocus();
	}

	/**
	 * Removes this view as SelectionListener when the view is disposed.
	 */
	public void dispose() {
		super.dispose();
		Activator activator = Activator.getInstance();
		ApplicationRegistry registry = activator.getApplicationRegistry();
		registry.removeListener(this);

		getSite().getPage().removePartListener(partlistener);
	}

	/**
	 *  Method required by SelectionListener interface, which will
	 *  be called, when the selection is changed so that the view
	 *  is updated accordingly.
	 */
	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
		// not needed
	}
	
	@Override
	public void selectionChanged(SelectionChangedEvent event) {
		
		// eki: Update the enabledness of the delete action
		deleteApplicationsAction.setEnabled(this.viewer.getCheckedElements().length > 0);
		
		if (event.getSource() == viewer) {
			ISelection selection = event.getSelection();
			if (selection.isEmpty()) {
				clearCurrentApplicationControls();
			} else if (selection instanceof IStructuredSelection) {
				IStructuredSelection structuredSelection = (IStructuredSelection) selection;
				if (structuredSelection.size() == 1) {
					Object object = structuredSelection.getFirstElement();
					if (object instanceof IApplication) {
						IApplication selected = (IApplication) object;
						replaceCurrentApplicationControls(selected);
					} else {
						clearCurrentApplicationControls();	
					}
				} else {
					clearCurrentApplicationControls();	
				}		
			}
		}
	}
	
	private Action[] currentActions = null;
	private NetAnnotations currentNetAnnotations = null;
	private PetriNet petrinet = null;
	
	private void clearCurrentApplicationControls() {
		if (currentActions != null) {
			IToolBarManager mgr = actionBars.getToolBarManager();
			for (Action action: currentActions) {
				mgr.remove(action.getId());
			}
			currentActions = null;
			// update action bar: parameter true is necessary to refresh layout of action bar
			// mgr.update(true);
			// This did not work on Eclipse Mars anymore
			getViewSite().getActionBars().updateActionBars();
		}
		if (currentNetAnnotations != null && petrinet != null) {
			MultipleEditorsRegistry registry = MultipleEditorsRegistry.getInstance();
			DiagramAnnotationsManager manager = registry.getInfo(petrinet).getAnnotationsManager();
			manager.removeNetAnnotations(currentNetAnnotations);
			// mla
			manager.setPresentationManager(null);
			currentNetAnnotations = null;
			petrinet = null;
		}
	}
	
	private void replaceCurrentApplicationControls(IApplication application) {
		MultipleEditorsRegistry registry = MultipleEditorsRegistry.getInstance();
		IToolBarManager mgr = actionBars.getToolBarManager();
		
		// eki: clear the current application controls (almost the same as in
		//      clearCurrentApplicationControls, only the toolbar manager is
		//      not updated right away)
		if (currentActions != null) {
			for (Action action: currentActions) {
				mgr.remove(action.getId());
			}
			currentActions = null;
		}
		if (currentNetAnnotations != null && petrinet != null) {
			DiagramAnnotationsManager manager = registry.getInfo(petrinet).getAnnotationsManager();
			manager.removeNetAnnotations(currentNetAnnotations);
			// mla
			manager.setPresentationManager(null);
			currentNetAnnotations = null;
			petrinet = null;
		}
		
		// eki: Next we set the current actions and the current NetAnnotations
		//
		//      We clone the array with the current actions, just to be a bit more
		//      defensive (in case the application changes the actions for some
		//      reason, we are still able to remove the installed ones)
		currentActions = application.getActions().clone();
		if (currentActions != null) {
			for (Action action: currentActions) {
				mgr.insertBefore("startApplicationsAction", action);
			}
		}
		currentNetAnnotations = application.getNetAnnotations();
		if (currentNetAnnotations != null) {
			NetAnnotation annotation = currentNetAnnotations.getCurrent();
			if (annotation != null && annotation.getNet() != null) {
				petrinet = annotation.getNet();
				MultipleEditorsInfo mei = registry.getInfo(petrinet);
				DiagramAnnotationsManager manager = mei.getAnnotationsManager();
				// mla
				if(application instanceof IApplicationWithPresentation) {
					manager.setPresentationManager(((IApplicationWithPresentation)application).getPresentationManager());
					manager.getPresentationManager().notifyOwner();
				}
				manager.addNetAnnotations(currentNetAnnotations);
			} else {
				// eki: if there is not Petri net, we cannot register the annotations, so
				//      we do not show them (in order to maintain consistency, we set
				//      both attributes to null)
				currentNetAnnotations = null;
				petrinet = null;
			}
		}
		
		// eki: now the toolbar manager is updated
		// update action bar: parameter true is necessary to refresh layout of action bar
		// mgr.update(true);
		// This did not work on Eclipse Mars anymore
		getViewSite().getActionBars().updateActionBars();
	}

	@Override
	public void addApplication(IApplication application) {
		if (viewer != null) {
			viewer.add(application);
			viewer.setSelection(new StructuredSelection(application), true);
		}
	}

	@Override
	public void removeApplication(IApplication application) {
		if (viewer != null) {
			viewer.remove(application);
		}
	}

	@Override
	public void update(IApplication application) {
		if (viewer != null) {
			viewer.update(application, null);
		}
	}
	
	private IPartListener2 partlistener = new IPartListener2() {
		
		public void partActivated(IWorkbenchPartReference ref) {
			// TODO we could show only applications that are running on the
			//      active editor (but I am not yet sure this makes sense;
			//      so, this is not yet implemented. Only the enabledness
			//      of the available applications is updated.
			startApplicationsMenu.updateEnabled();
		}

		@Override
		public void partBroughtToTop(IWorkbenchPartReference partRef) {}
		
		@Override
		public void partClosed(IWorkbenchPartReference partRef) {}

		@Override
		public void partDeactivated(IWorkbenchPartReference partRef) {}

		@Override
		public void partOpened(IWorkbenchPartReference partRef) {}

		@Override
		public void partHidden(IWorkbenchPartReference partRef) {}

		@Override
		public void partVisible(IWorkbenchPartReference partRef) {}

		@Override
		public void partInputChanged(IWorkbenchPartReference partRef) {}
	};

}
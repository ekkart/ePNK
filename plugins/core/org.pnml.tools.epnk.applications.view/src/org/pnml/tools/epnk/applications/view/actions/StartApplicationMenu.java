package org.pnml.tools.epnk.applications.view.actions;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.ActionContributionItem;
import org.eclipse.jface.action.IMenuCreator;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.pnml.tools.epnk.applications.Application;
import org.pnml.tools.epnk.applications.ApplicationFactory;
import org.pnml.tools.epnk.applications.IApplication;
import org.pnml.tools.epnk.applications.activator.Activator;
import org.pnml.tools.epnk.diagram.part.PNMLCoreModelDiagramEditor;
import org.pnml.tools.epnk.helpers.NetFunctions;
import org.pnml.tools.epnk.pnmlcoremodel.Page;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNet;

public class StartApplicationMenu extends Action implements IMenuCreator {

	private Menu menu;
	
	private Activator applicationFactoryRegistry;
	private List<ApplicationFactory> priorities = new ArrayList<ApplicationFactory>();

	public StartApplicationMenu() {
		this.setMenuCreator(this);
		applicationFactoryRegistry = Activator.getInstance();
		this.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
				getImageDescriptor(ISharedImages.IMG_TOOL_NEW_WIZARD));
		this.setToolTipText("Start an application on the net in the active editor");
	}

	@Override
	public Menu getMenu(Control parent) {
		if (menu != null) {
			menu.dispose();
			menu = null;
		}
		
		// find active net
		PetriNet net = this.getActiveNet();
		if (net != null) {
			// compute available applications (factories)
			List<ApplicationFactory> factories = applicationFactoryRegistry.getApplicationFactories(net);
			
			// find the least recently selected factory among the available factories
			ApplicationFactory selected = null;
			for (ApplicationFactory factory: priorities) {
				if (factories.contains(factory)) {
					selected = factory;
					break;
				}
			}

			// create start application actions
			List<Action> actions = new ArrayList<Action>();
			for (ApplicationFactory factory: factories) {
				StartApplicationAction action = new StartApplicationAction(factory, net, factory == selected, this);
				actions.add(action);
			}
			
			actions.add(new LoadAction(net));

			menu = new Menu(parent);
			for(Action action: actions) {
				ActionContributionItem item = new ActionContributionItem(action);
				item.fill(menu, -1);
			}
		}

		return menu;
	};

	@Override
	public Menu getMenu(Menu parent)
	{
		return null;
	}

	@Override
	public void run() {
		// find active net
		PetriNet net = this.getActiveNet();
		if (net != null) {
			// compute available applications (factories)
			List<ApplicationFactory> factories = applicationFactoryRegistry.getApplicationFactories(net);
			
			// find the least recently selected factory among the available factories
			for (ApplicationFactory factory: priorities) {
				if (factories.contains(factory)) {
					// and start it
					startApplication(factory,net);
					break;
				}
			}
		}
	}

	public IApplication startApplication(ApplicationFactory factory, PetriNet net) {
		if (factory != null) {
			this.priorities.remove(factory); // remove the used factory from priorities
			this.priorities.add(0,factory);  // and insert it as first element again
			if (factory.isApplicable(net)) {
				Application application = factory.startApplication(net);
				if (application != null) {
					application.initialize(null);
					application.setName(factory.getName());
					application.getNetAnnotations().setAppId(factory.getID());
					application.getNetAnnotations().setAppVersion(factory.getVersion());
					applicationFactoryRegistry.getApplicationRegistry().addApplication(application);
				}
				return application;
			}
		}
		return null;
	}
	
	@Override
	public void dispose() {
		if(menu != null) {
			menu.dispose();
			menu = null;
		}
	}
	
	public void updateEnabled() {
		// find active net
		PetriNet net = this.getActiveNet();
		if (net != null) {
			// compute available applications (factories)
			List<ApplicationFactory> factories = applicationFactoryRegistry.getApplicationFactories(net);
			if (!factories.isEmpty()) {
				this.setEnabled(true);
				return;
			}
		}
		this.setEnabled(false);
	}

	private PetriNet getActiveNet() {
		IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		if (window == null) {
			return null;
		}
		IWorkbenchPage page = window.getActivePage();
		if (page == null) {
			return null;
		}
		
		IEditorPart editor = page.getActiveEditor();
		if (editor instanceof PNMLCoreModelDiagramEditor) {
			PNMLCoreModelDiagramEditor diagramEditor = (PNMLCoreModelDiagramEditor) editor;
			Object content = diagramEditor.getDiagramDocument().getContent();
			if (content instanceof Diagram) {
				Diagram diagram = (Diagram) content;
				EObject element = diagram.getElement();
				if (element instanceof Page) {
					PetriNet net = NetFunctions.getPetriNet((Page) element);
					return net;
				}	
			}
		}
		return null;	
	}

}

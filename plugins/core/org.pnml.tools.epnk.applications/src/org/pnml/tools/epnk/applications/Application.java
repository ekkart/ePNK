package org.pnml.tools.epnk.applications;

import java.util.List;

import org.eclipse.jface.action.Action;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.pnml.tools.epnk.annotations.netannotations.Annotation;
import org.pnml.tools.epnk.annotations.netannotations.NetAnnotation;
import org.pnml.tools.epnk.annotations.netannotations.NetAnnotations;
import org.pnml.tools.epnk.annotations.netannotations.NetannotationsFactory;
import org.pnml.tools.epnk.applications.actions.SaveAction;
import org.pnml.tools.epnk.applications.actions.SaveAsAction;
import org.pnml.tools.epnk.applications.activator.Activator;
import org.pnml.tools.epnk.applications.registry.ApplicationRegistry;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNet;

public class Application implements IApplication {

	private NetAnnotations netAnnotations;
	
	private Action[] actions;
	
	final private PetriNet petrinet;
	
	public Application(PetriNet petrinet) {
		this.petrinet = petrinet;
		netAnnotations = NetannotationsFactory.eINSTANCE.createNetAnnotations();
		
		int no = 2;
		if (isSavable()) {
			no = 4;
		}
		actions = new Action[no];
		
		actions[0] = new Action() {
			public void run() {
				previousAnnotation();
			}
		};
		actions[0].setId("action0");
		actions[0].setText("Previous");
		actions[0].setToolTipText("Show previous");
		actions[0].setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
			getImageDescriptor(ISharedImages.IMG_TOOL_BACK));
		
		actions[1] = new Action() {
			public void run() {
				nextAnnotation();
			}
		};
		actions[1].setId("action1");
		actions[1].setText("Next");
		actions[1].setToolTipText("Show next");
		actions[1].setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
			getImageDescriptor(ISharedImages.IMG_TOOL_FORWARD));
		
		if (no == 4) {
			actions[2] = new SaveAction(this);
			actions[3] = new SaveAsAction(this);
		}
	}


	public PetriNet getPetrinet() {
		return petrinet;
	}
	
	final public void initialize(NetAnnotations netAnnotations) {
		if (netAnnotations != null) {
			this.netAnnotations = netAnnotations;
		} else {
			initializeContents();
		}	
		updateActionEnabledness();
	}

	/**
	 * Initializes the content (NetAnnotations) of this application. This
	 * should be overridden by sub-classes. It can be assumed that the
	 * actions, and the NetAnnotations are created already, and the
	 * Petri net is set. The actions may still be changed in this method.
	 * 
	 * Note that this method should be called only once (from the constructor
	 * of this class).
	 * 
	 */
    protected void initializeContents() {
    	
    }

	@Override
	public String getName() {
		if (netAnnotations != null) {
			return netAnnotations.getName();
		}
		return null;
	}

	@Override
	public void setName(String name) {
		if (netAnnotations != null) {
			netAnnotations.setName(name);
		}
	}

	@Override
	public Action[] getActions() {
		return actions;
	}

	@Override
	public String getDescription() {
		return this.getClass().getSimpleName();
	}
	
	@Override
	public String getStatus() {
		if (isDisposed) {
			return "disposed";
		}
		return "idle";
	}

	@Override
	public NetAnnotations getNetAnnotations() {
		return netAnnotations;
	}
	
	public void deleteNetAnnotationAfterCurrent() {
		int currentIndex = netAnnotations.getNetAnnotations().indexOf(netAnnotations.getCurrent());
		netAnnotations.getNetAnnotations().subList(currentIndex+1, netAnnotations.getNetAnnotations().size());
		if (currentIndex < 0) {
			currentIndex = 0;
		}
		while (netAnnotations.getNetAnnotations().size()-1 > currentIndex) {
			netAnnotations.getNetAnnotations().remove(netAnnotations.getNetAnnotations().size()-1);
		}
		
		this.updateActionEnabledness();
	}

	public void addNetAnnotationAsCurrent(NetAnnotation netAnnotation) {
		netAnnotations.getNetAnnotations().add(netAnnotation);
		netAnnotations.setCurrent(netAnnotation);
		this.updateActionEnabledness();
	}
	
	private boolean isDisposed = false;
	
	@Override
	final public void dispose() {
		if (!isDisposed) {
			shutDown();
			// eki: Normally the dispose method should be called from
			//      the application registry, when it is removed. In
			//      order to be more defensive, we try to remove the
			//      application from the registry anyway. It is programmed
			//      in such a way, that the shutDown is only called once
			//      and a remove of an already removed application does
			//      not do any harm
			isDisposed = true;
			ApplicationRegistry registry = Activator.getInstance().getApplicationRegistry();
			registry.removeApplication(this);
		}
	}
	
	/**
	 * If the Application has allocated some resources or started some
	 * threads, these should be released here. 
	 */
	protected void shutDown() {
		
	}

	public void updateActionEnabledness() {		
		actions[0].setEnabled(previousEnabled());
		actions[1].setEnabled(nextEnabled());
		if (actions.length >= 4) {
			actions[2].setEnabled(actions[2].isEnabled());
		}
	}

	private boolean nextEnabled() {
		 if (netAnnotations != null) {
			 Annotation current = netAnnotations.getCurrent();
			 if (current != null) {
				 List<NetAnnotation> annotations = netAnnotations.getNetAnnotations();
				 int index = annotations.indexOf(current);
				 if (index >= 0 && index + 1 < annotations.size()) {
					 return true;
				 }
			 }
		 }
		 return false;
	}
	
	private boolean previousEnabled() {
		 if (netAnnotations != null) {
			 Annotation current = netAnnotations.getCurrent();
			 if (current != null) {
				 List<NetAnnotation> annotations = netAnnotations.getNetAnnotations();
				 int index = annotations.indexOf(current);
				 if (index >= 1) {
					 return true;
				 }
			 }
		 }
		 return false;
	}


	public void nextAnnotation() {
		 if (netAnnotations != null) {
			 Annotation current = netAnnotations.getCurrent();
			 if (current != null) {
				 List<NetAnnotation> annotations = netAnnotations.getNetAnnotations();
				 int index = annotations.indexOf(current);
				 if (index >= 0 && index + 1 < annotations.size()) {
					 netAnnotations.setCurrent(annotations.get(index+1));
					 updateActionEnabledness();
				 }
			 }
		 }
	}
	
	public void previousAnnotation() {
		 if (netAnnotations != null) {
			 Annotation current = netAnnotations.getCurrent();
			 if (current != null) {
				 List<NetAnnotation> annotations = netAnnotations.getNetAnnotations();
				 int index = annotations.indexOf(current);
				 if (index >= 1) {
					 netAnnotations.setCurrent(annotations.get(index-1));
					 updateActionEnabledness();
				 }
			 }
		 }
	}
	
	public boolean isSavable() {
		return false;
	}

}

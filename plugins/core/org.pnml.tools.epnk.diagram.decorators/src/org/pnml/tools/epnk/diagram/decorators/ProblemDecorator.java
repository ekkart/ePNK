package org.pnml.tools.epnk.diagram.decorators;

import org.eclipse.core.resources.IMarker;
import org.eclipse.draw2d.Label;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.diagram.core.listener.DiagramEventBroker;
import org.eclipse.gmf.runtime.diagram.core.listener.NotificationListener;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.AbstractDecorator;
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecorator;
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecoratorTarget;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.pnml.tools.epnk.managers.problems.ProblemManager;
import org.pnml.tools.epnk.managers.problems.Problems;
import org.pnml.tools.epnk.pnmlcoremodel.Arc;
import org.pnml.tools.epnk.pnmlcoremodel.LabelProxy;
import org.pnml.tools.epnk.pnmlcoremodel.PageLabelProxy;
import org.pnml.tools.epnk.pnmlcoremodel.presentation.MultipleEditorsInfo;
import org.pnml.tools.epnk.pnmlcoremodel.presentation.MultipleEditorsRegistry;

public class ProblemDecorator extends AbstractDecorator {

    private final Image ERROR_IMAGE = PlatformUI.getWorkbench().getSharedImages().getImage(ISharedImages.IMG_OBJS_ERROR_TSK);
    private final Image WARNING_IMAGE = PlatformUI.getWorkbench().getSharedImages().getImage(ISharedImages.IMG_OBJS_WARN_TSK);

    private ChangeListener changeListener;
    
    protected EObject notifier;
    private ProblemManager problemManager;
    
    private EObject element;
    private EObject problemObject;
    private boolean isActive;
    
    private class ChangeListener implements NotificationListener {

        IDecorator decorator;

        public ChangeListener(IDecorator decorator) {
            this.decorator = decorator;
        }

        public void notifyChanged(Notification evt) {
            decorator.refresh();
        }

    }

    public ProblemDecorator(IDecoratorTarget decoratorTarget) {
        super(decoratorTarget);
        changeListener = new ChangeListener(this);
		IGraphicalEditPart editPart = (IGraphicalEditPart) getDecoratorTarget().getAdapter(IGraphicalEditPart.class);
		element = editPart.resolveSemanticElement();
		isActive = false;
		domain = (TransactionalEditingDomain) AdapterFactoryEditingDomain.getEditingDomainFor(element);
		MultipleEditorsInfo info = MultipleEditorsRegistry.getInstance().getInfo(domain);
		if (info != null) {
			problemManager = info.getProblemManager();
		}

		updateProblemObject();
    }
    
    private TransactionalEditingDomain domain;
    
    public void activate() {
    	IGraphicalEditPart editPart = (IGraphicalEditPart) getDecoratorTarget().getAdapter(IGraphicalEditPart.class);
    	EObject element = editPart.resolveSemanticElement();
    	if (element instanceof org.pnml.tools.epnk.pnmlcoremodel.Object || element instanceof LabelProxy  || element instanceof PageLabelProxy) {
    		notifier = element;
    		DiagramEventBroker.getInstance(domain).
    		addNotificationListener(notifier, changeListener);
    	}

    	if (problemObject != null) {
    		MultipleEditorsInfo info = MultipleEditorsRegistry.getInstance().getInfo(domain);
    		if (info != null) {
    			// problemManager = info.getProblemManager();
    			if (problemManager != null) {
    				problemManager.addListener(changeListener, problemObject);
    			}
    		}
    	}
    	isActive = true;
    	refresh();
    }
    
    public void deactivate() {
    	if (notifier != null) {
    		DiagramEventBroker.getInstance(domain).
    		removeNotificationListener(notifier, changeListener);

    		if (problemManager != null) {
    			problemManager.removeListener(changeListener, problemObject);
    			problemManager = null;
    		}

    		notifier = null;
    	}

        isActive = false;
        super.deactivate();
    }
    
    public void refresh() {
    	updateProblemObject();
    	if (problemObject != null) {
			removeDecoration();
        	
    		if (problemManager != null) {
    			Problems problems = problemManager.getProblems(problemObject);

    			if (problems != null && problems.getSeverity() != IMarker.SEVERITY_INFO) {
    				Image image = null;
    				if (problems.getSeverity() == IMarker.SEVERITY_WARNING) {
    					image = WARNING_IMAGE;
    				} else {
    					image = ERROR_IMAGE;
    				}

    				if (element instanceof Arc) {
    					setDecoration(getDecoratorTarget().addConnectionDecoration(image, 50, true));
    				} else {
    					setDecoration(getDecoratorTarget().addShapeDecoration(image, IDecoratorTarget.Direction.NORTH_WEST, 0, true));
    				}
    				Label tooltip = new Label(problems.getProblemInfo());
    				getDecoration().setToolTip(tooltip);
    			}
    		}
    	} else {
    		removeDecoration();
			setDecoration(getDecoratorTarget().addShapeDecoration(WARNING_IMAGE, IDecoratorTarget.Direction.NORTH_WEST, 0, true));
			Label tooltip = new Label("Label needs to be connected!");
			getDecoration().setToolTip(tooltip);
    	}
    	

    }
    
    private void updateProblemObject() {
    	EObject oldProblemObject = problemObject;
    	problemObject = getProblemObject();
    	
    	if (oldProblemObject != problemObject && isActive) {
    		if (problemManager != null) {
    			problemManager.removeListener(changeListener,oldProblemObject);
				problemManager.addListener(changeListener,problemObject);
    		}
    	}
    }
    
    private EObject getProblemObject() {
		if (element instanceof LabelProxy) {
			LabelProxy proxy = (LabelProxy) element;
			return proxy.getLabel();
		} else if (element instanceof PageLabelProxy) {
			PageLabelProxy proxy = (PageLabelProxy) element;
			return proxy.getLabel();
		} else {
			return element;
		}
    }

}

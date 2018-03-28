package org.pnml.tools.epnk.applications.ui;

import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MouseEvent;
import org.eclipse.draw2d.MouseListener;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.pnml.tools.epnk.annotations.netannotations.ObjectAnnotation;
import org.pnml.tools.epnk.applications.ApplicationWithUIManager;
import org.pnml.tools.epnk.applications.presentation.IPresentationManager;

public class ApplicationUIManager implements IPresentationManager {

	// private ApplicationWithUIManager application;
	
	private List<IPresentationHandler> presentationHandlers = new ArrayList<IPresentationHandler>();
	private List<IActionHandler> actionHandlers = new ArrayList<IActionHandler>();
	private MouseListener mouseListener;
	
	private WeakHashMap<IFigure, ObjectAnnotation> figure2annotation = new WeakHashMap<IFigure,ObjectAnnotation>();

	public ApplicationUIManager(ApplicationWithUIManager application) {
		// this.application = application;
		
		addPresentationHandler(new DefaultPresentationHandler());
		mouseListener = new MouseListener() {

			@Override
			public void mouseDoubleClicked(MouseEvent event) {
				ObjectAnnotation annotation = figure2annotation.get(event.getSource());
				if (annotation != null) {
					for (IActionHandler actionHandler: actionHandlers) {
						boolean consumed = actionHandler.mouseDoubleClicked(event, annotation);
						if (consumed) {
							event.consume();
							return;
						}
					}
				}
			}

			@Override
			public void mousePressed(MouseEvent event) {
				ObjectAnnotation annotation = figure2annotation.get(event.getSource());
				if (annotation != null) {
					for (IActionHandler actionHandler: actionHandlers) {
						boolean consumed = actionHandler.mousePressed(event, annotation);
						if (consumed) {
							event.consume();
							return;
						}
					}
					// note that the event is consumed even if no handler reacted to it;
					// this is necessary to make sure a subsequent double-clicking event
					// is actually propagated to this mouse listener again; otherwise the
					// GEF event handler takes over control, and this mouse listener is
					// not notified about subsequent double-clicking evens!
					event.consume();
				}
			}

			@Override
			public void mouseReleased(MouseEvent event) {
				ObjectAnnotation annotation = figure2annotation.get(event.getSource());
				if (annotation != null) {
					for (IActionHandler actionHandler: actionHandlers) {
						boolean consumed = actionHandler.mouseReleased(event, annotation);
						if (consumed) {
							event.consume();
							return;
						}
					}
				}
			}
			
		};

	}
	
	@Override
	public void notifyOwner() {
		// Probably not needed 
	}

	@Override
	public IFigure handle(ObjectAnnotation annotation,
			AbstractGraphicalEditPart graphicalEditPart) {
		for (IPresentationHandler presentationHandler : presentationHandlers) {
			IFigure figure = presentationHandler.handle(annotation, graphicalEditPart);
			if (figure != null) {
				figure2annotation.put(figure, annotation);
				figure.addMouseListener(mouseListener);
				return figure;
			}
		}
		return null;
	}
	

	/*
	@Override
	public ApplicationWithUIManager getApplication() {
		return application;
	}
    */
	
	public void addPresentationHandler(IPresentationHandler presentationHandler) {
		presentationHandlers.add(0,presentationHandler);
	}
	
	public void removerPresentationHandler(IPresentationHandler presentationHandler) {
		presentationHandlers.remove(presentationHandler);
	}
	
	public void clearPresentationHandlers() {
		presentationHandlers.clear();
	}
	
	public void addActionHandler(IActionHandler actionHandler) {
		actionHandlers.add(0,actionHandler);
	}
	
	public void removerActionHandler(IActionHandler actionHandler) {
		actionHandlers.remove(actionHandler);
	}
	
	public void clearActionHandlers() {
		actionHandlers.clear();
	}

}

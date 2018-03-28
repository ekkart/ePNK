package org.pnml.tools.epnk.annotations.manager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.draw2d.FreeformLayer;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.Layer;
import org.eclipse.draw2d.ScalableFreeformLayeredPane;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.LayerConstants;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramRootEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.parts.DiagramDocumentEditor;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.ui.IEditorPart;

import org.pnml.tools.epnk.annotations.netannotations.NetAnnotation;
import org.pnml.tools.epnk.annotations.netannotations.NetAnnotations;
import org.pnml.tools.epnk.annotations.netannotations.ObjectAnnotation;
import org.pnml.tools.epnk.applications.presentation.IPresentationManager;
import org.pnml.tools.epnk.applications.ui.figures.AbsoluteLabel;
import org.pnml.tools.epnk.applications.ui.figures.EllipseOverlay;
import org.pnml.tools.epnk.applications.ui.figures.PolylineOverlay;
import org.pnml.tools.epnk.applications.ui.figures.RectangleOverlay;
import org.pnml.tools.epnk.helpers.NetFunctions;
import org.pnml.tools.epnk.pnmlcoremodel.Object;
import org.pnml.tools.epnk.pnmlcoremodel.Page;
import org.pnml.tools.epnk.pnmlcoremodel.PlaceNode;
import org.pnml.tools.epnk.pnmlcoremodel.TransitionNode;
import org.pnml.tools.epnk.pnmlcoremodel.presentation.MultipleEditorsInfo;

// @generted NOT
// @author eki
public class DiagramAnnotationsManager {

	private MultipleEditorsInfo info;
	private List<IFigure> figures;
	private NetAnnotations currentAnnotations;
	
	// mla
	private IPresentationManager presentationManager = null;

	public IPresentationManager getPresentationManager()
    {
    	return presentationManager;
    }

	public void setPresentationManager(IPresentationManager presentationManager)
    {
    	this.presentationManager = presentationManager;
    }
	// end mla

	private Adapter adapter;

	public DiagramAnnotationsManager(MultipleEditorsInfo info) {
		super();
		this.info = info;
		this.currentAnnotations = null;
		figures = new ArrayList<IFigure>();

		this.adapter = new Adapter() {

			@Override
			public Notifier getTarget() {
				return null;
			}

			@Override
			public boolean isAdapterForType(java.lang.Object arg0) {
				return false;
			}

			@Override
			public void notifyChanged(Notification notification) {
				java.lang.Object object = notification.getNotifier();
				if (object != null && object instanceof NetAnnotations) {
					if (currentAnnotations == object) {
						DiagramAnnotationsManager.this.clearFeedback();
						DiagramAnnotationsManager.this.createFeedback();
					}
				}
			}

			@Override
			public void setTarget(Notifier arg0) {
			}
		};

	}

	public void addNetAnnotations(NetAnnotations annotations) {
		if (currentAnnotations!= null) {
			currentAnnotations = null;
			clearFeedback();
		}
		currentAnnotations = annotations;
		createFeedback();
		currentAnnotations.eAdapters().add(adapter);
	}

	public void removeNetAnnotations(NetAnnotations annotations) {
		if (currentAnnotations != null && annotations == currentAnnotations) {
			currentAnnotations.eAdapters().remove(adapter);
			currentAnnotations = null;
			clearFeedback();
		}
	}

	private void createFeedback() {
		NetAnnotation netAnnotation = currentAnnotations.getCurrent();

		if (netAnnotation != null) {
			Map<Object,List<ObjectAnnotation>> object2Annotation = new HashMap<Object,List<ObjectAnnotation>>();

			// eki: for efficiency reasons, we create a hash table of all annotated objects first
			for (ObjectAnnotation objectAnnotation: netAnnotation.getObjectAnnotations()) {
				Object object = objectAnnotation.getObject();
				if (object != null) {
					EObject container = object.eContainer();
					if (container instanceof Page) {
						List<ObjectAnnotation> objectAnnotations = object2Annotation.get(object);
						if (objectAnnotations == null) {
							objectAnnotations = new ArrayList<ObjectAnnotation>();
							object2Annotation.put(object, objectAnnotations);
						}
						objectAnnotations.add(objectAnnotation);
					}
				}
			}

			for ( IEditorPart editor: info.getSecondaryEditors() ) {
				if (editor instanceof DiagramDocumentEditor) {
					DiagramDocumentEditor diagramEditor = (DiagramDocumentEditor) editor;
					DiagramEditPart dep = diagramEditor.getDiagramEditPart();
					DiagramRootEditPart rootEditPart = (DiagramRootEditPart) dep.getRoot();

					// ekki@dtu.dk, July 12, 2016: added an additional condition making
					//   sure that net annotations are only transferred to editors on
					//   the same net as the net annotations refers to -- otherwise
					//   wrong Application labels might be shown on pages, which the
					//   application does not refer to (applications are bound to a net
					//   not to a document). To achieve this, the following 9 lines
					//   were added (plus a closing brace in the end of this method):
					java.lang.Object model =  dep.getModel();
					Page page = null;
					if (model instanceof Diagram) {
						EObject object = ((Diagram) model).getElement();
						if (object instanceof Page) {
							page = (Page) object;
						}
					}
					if (netAnnotation.getNet() == NetFunctions.getPetriNet(page)) {

						IFigure nonscalableLayer = this.getNonScalableFeedbackLayer(rootEditPart);
						if (nonscalableLayer != null) {
							// eki: create a text label indicating the application
							String name = currentAnnotations.getName();
							if (name != null && !name.equals("")) {
								name = "Application: " + name;
							} else {
								name = "Application";
							}
							Label label = new AbsoluteLabel(name, new Point(10,10));
							nonscalableLayer.add(label);
							figures.add(label);
						}

						Layer scalableLayer = getScalableFeedbackLayer(rootEditPart);
						for (java.lang.Object editPart: dep.getChildren()) {
							if (editPart instanceof GraphicalEditPart) {
								GraphicalEditPart graphicalEditPart = (GraphicalEditPart) editPart;
								java.lang.Object modelObject = graphicalEditPart.resolveSemanticElement();
								if (modelObject instanceof Object) {
									Object object = (Object) modelObject;
									List<ObjectAnnotation> objectAnnotations = object2Annotation.get(object);
									if (objectAnnotations != null) {
										for (ObjectAnnotation objectAnnotation: objectAnnotations) {
											// mla
											if(presentationManager != null)
											{
												IFigure figure = presentationManager.handle( 
														objectAnnotation, graphicalEditPart);
												if(figure != null)
												{
													scalableLayer.add(figure);
													figures.add(figure);
												}
											}
											else
											{
												if (object instanceof PlaceNode) {
													IFigure figure = new EllipseOverlay(graphicalEditPart);
													scalableLayer.add(figure);
													figures.add(figure);
												} else if (object instanceof TransitionNode || object instanceof Page) {
													IFigure figure = new RectangleOverlay(graphicalEditPart);
													scalableLayer.add(figure);
													figures.add(figure);
												} 
											}
										}
									}
								}
							}
						}

						for (java.lang.Object editPart: dep.getConnections()) {
							if (editPart instanceof ConnectionNodeEditPart) {
								ConnectionNodeEditPart arcEditPart = (ConnectionNodeEditPart) editPart;
								java.lang.Object modelObject = arcEditPart.resolveSemanticElement();
								if (modelObject instanceof Object) {
									Object object = (Object) modelObject;
									List<ObjectAnnotation> objectAnnotations = object2Annotation.get(object);
									if (objectAnnotations != null) {
										for (ObjectAnnotation objectAnnotation: objectAnnotations) {

											// mla
											if(presentationManager != null)
											{
												IFigure figure = presentationManager.handle(
														objectAnnotation, arcEditPart);
												if(figure != null)
												{
													scalableLayer.add(figure);
													figures.add(figure);
												}
											}
											else
											{
												IFigure figure = new PolylineOverlay(arcEditPart);
												scalableLayer.add(figure);
												figures.add(figure);
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	private void clearFeedback() {
		if (figures != null) {
			for (IFigure figure: figures) {
				IFigure parent = figure.getParent();
				if (parent != null) {
					parent.remove(figure);
				}
			}
			figures.clear();
		}
	}

	private Layer getNonScalableFeedbackLayer(DiagramRootEditPart derp) {
		Layer feedbackLayer = null;
		if (derp != null) {
			IFigure figure = derp.getLayer(LayerConstants.FEEDBACK_LAYER);
			if (figure instanceof Layer) {
				feedbackLayer = (Layer) figure;
		    }
		}
		return feedbackLayer;
	}

	private Layer getScalableFeedbackLayer(DiagramRootEditPart derp) {
		Layer feedbackLayer = null;
		if (derp != null) {
			IFigure layer = derp.getLayer(LayerConstants.SCALABLE_LAYERS);
			// layer.setEnabled(true);
			if (layer instanceof ScalableFreeformLayeredPane) {
				feedbackLayer = ((ScalableFreeformLayeredPane) layer).getLayer(LayerConstants.SCALED_FEEDBACK_LAYER);
				if (feedbackLayer == null) {
					feedbackLayer = new FreeformLayer();
					layer.add(feedbackLayer, LayerConstants.SCALED_FEEDBACK_LAYER);
				}
			} 
		}
		return feedbackLayer;
	}

	public void dispose() {
		if (currentAnnotations != null) {
			currentAnnotations.eAdapters().remove(adapter);
			clearFeedback();
			currentAnnotations = null;
		}
	}

}

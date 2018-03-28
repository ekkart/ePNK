/**
 * This file is part of the PNML Tool project. The Universal PNML Tool is a tool that can be used for creating and modifying all kinds of Petri nets and for exporting them in PNML syntax. 
 * Copyright (C) 2009 YoujunHu, s061331@student.dtu.dk
 *  
 * PNML Tool is free software; you can redistribute it and/or modify it under the terms of the Eclipse Public License as published by Eclipse Foundation;version 1 of the License.
 * PNML Tool is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the  Eclipse Public License for more details.
 * You should have received a copy of the Eclipse Public License along with PNML Tool, if not, write to the Eclipse Foundation, Inc.102 Centrepointe Drive Ottawa, Ontario, Canada, K2G 6B1 
 *
 * $Id$
 */
package org.pnml.tools.epnk.diagram.notationtransfer;

import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.gmf.runtime.draw2d.ui.figures.FigureUtilities;
import org.eclipse.gmf.runtime.notation.Bendpoints;
import org.eclipse.gmf.runtime.notation.Bounds;
import org.eclipse.gmf.runtime.notation.Connector;
import org.eclipse.gmf.runtime.notation.ConnectorStyle;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.FillStyle;
import org.eclipse.gmf.runtime.notation.FontStyle;
import org.eclipse.gmf.runtime.notation.LayoutConstraint;
import org.eclipse.gmf.runtime.notation.Location;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.RelativeBendpoints;
import org.eclipse.gmf.runtime.notation.Shape;
import org.eclipse.gmf.runtime.notation.ShapeStyle;
import org.eclipse.gmf.runtime.notation.Size;
import org.eclipse.gmf.runtime.notation.Smoothness;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.runtime.notation.datatype.RelativeBendpoint;
import org.pnml.tools.epnk.diagram.part.PNMLCoreModelDiagramEditorPlugin;
import org.pnml.tools.epnk.graphics.datatypes.CSSColor;
import org.pnml.tools.epnk.graphics.datatypes.CSSFontFamily;
import org.pnml.tools.epnk.graphics.datatypes.CSSFontSize;
import org.pnml.tools.epnk.graphics.datatypes.IllegalFormatException;
import org.pnml.tools.epnk.pnmlcoremodel.AnnotationGraphics;
import org.pnml.tools.epnk.pnmlcoremodel.Arc;
import org.pnml.tools.epnk.pnmlcoremodel.ArcGraphics;
import org.pnml.tools.epnk.pnmlcoremodel.Coordinate;
import org.pnml.tools.epnk.pnmlcoremodel.Fill;
import org.pnml.tools.epnk.pnmlcoremodel.Font;
import org.pnml.tools.epnk.pnmlcoremodel.Graphics;
import org.pnml.tools.epnk.pnmlcoremodel.Label;
import org.pnml.tools.epnk.pnmlcoremodel.LabelProxy;
import org.pnml.tools.epnk.pnmlcoremodel.Line;
import org.pnml.tools.epnk.pnmlcoremodel.LineShape;
import org.pnml.tools.epnk.pnmlcoremodel.Node;
import org.pnml.tools.epnk.pnmlcoremodel.NodeGraphics;
import org.pnml.tools.epnk.pnmlcoremodel.Object;
import org.pnml.tools.epnk.pnmlcoremodel.Page;
import org.pnml.tools.epnk.pnmlcoremodel.PageLabelProxy;
import org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelFactory;

/**
 * The class updates Petri net graphics when the GMF diagram is changed. 
 * @generated NOT
 * @authors Lukasz, Youjun, eki
 */
public class GraphicElementListener extends EContentAdapter {

	private NotificationFilter ModifiedFilter;

	public GraphicElementListener() {
		ModifiedFilter = NotificationFilter.createEventTypeFilter(
				Notification.SET).or(
				NotificationFilter.createEventTypeFilter(Notification.UNSET))
				.or(NotificationFilter.createEventTypeFilter(
				Notification.ADD)).
				or(NotificationFilter.createEventTypeFilter(
						Notification.REMOVE));
	}

	public void notifyChanged(Notification notification) {
		if (notification.getNotifier() instanceof EObject) {
			super.notifyChanged(notification);
		}
		if (ModifiedFilter.matches(notification)
				&& (notification instanceof ENotificationImpl)
				&& (notification.getNotifier() instanceof EObject)
				) {
			
			ENotificationImpl eNotification = (ENotificationImpl) notification;
			EObject eNotifier = (EObject) eNotification.getNotifier();

			if (NotationPackage.eINSTANCE.getLocation().isSuperTypeOf(
					eNotifier.eClass())) {
				updateNodeBounds(eNotification, eNotifier);
			} else if (eNotifier instanceof RelativeBendpoints) {
				// Deal with bendpoints of arcs
				EObject object = eNotifier.eContainer();
				if (object instanceof Edge) {
					Edge edge = (Edge) object;
					object = edge.getElement();
					if (object != null && object instanceof Arc) {
						Arc arc = (Arc) object;
						this.updateIntermediatePositions(edge, arc);
					}
				}
			} else if (eNotifier instanceof org.eclipse.gmf.runtime.notation.Node && eNotification.getNewValue() != null &&
					eNotification.getNewValue() instanceof org.eclipse.gmf.runtime.notation.Connector) {
				// this makes sure that the position of the ProxyLabel is propagated to the Label, 
				// when it is connected to a node.
				org.eclipse.gmf.runtime.notation.Node node = (org.eclipse.gmf.runtime.notation.Node) eNotifier;
				EObject element = node.getElement();
				if (element instanceof LabelProxy) {
					View view = (View) eNotifier;
					updateNodeBounds(view, element);
				}
			} else if (eNotifier instanceof ConnectorStyle &&
					eNotifier.eContainer() instanceof Edge &&
					eNotification.getFeature() instanceof EStructuralFeature) {
				// ConnectorStyle style = (ConnectorStyle) eNotifier;
				Edge edge = (Edge) eNotifier.eContainer();
				EObject object = edge.getElement();
				if (object != null && object instanceof Arc) {
					this.updateArcStyle(edge, (Arc) object,  (ConnectorStyle) eNotifier, (EStructuralFeature) eNotification.getFeature());
				}	
			} else if (eNotifier instanceof ShapeStyle &&
					eNotifier.eContainer() instanceof View &&
					eNotification.getFeature() instanceof EStructuralFeature) {
				// ConnectorStyle style = (ConnectorStyle) eNotifier;
				View view = (View) eNotifier.eContainer();
				EObject object = null;
				// eki 9. 8. 2012: the affected element is different for Shape (which also
				//   implements ShapeStyle) and for ShapeStyle. Therefore, the following
				//   cases needed to be distinguished.
				if (eNotifier instanceof Shape) {
					object = ((Shape) eNotifier).getElement();
				} else {
					object = view.getElement();
				}				
				if (object != null) {
					if (object instanceof Node || object instanceof Page) {
						this.updateNodeStyle(view, (Object) object,  (ShapeStyle) eNotifier, (EStructuralFeature) eNotification.getFeature());
					} else if (object instanceof LabelProxy || object instanceof PageLabelProxy) {
						Label label = null;
						if (object instanceof LabelProxy) {
							label = ((LabelProxy) object).getLabel();
						} else if (object instanceof PageLabelProxy) {
							label = ((PageLabelProxy) object).getLabel();
						}
						if (label != null) {
							this.updateLabelStyle(view,  label,  (ShapeStyle) eNotifier, (EStructuralFeature) eNotification.getFeature());
						}
					}
				}
			} else if (eNotifier instanceof FontStyle) {
				EObject container =  eNotifier.eContainer();
				if (container instanceof org.eclipse.gmf.runtime.notation.Node) {
					Label label = null;
					EObject element = ((org.eclipse.gmf.runtime.notation.Node) container).getElement();
					if (element instanceof LabelProxy) {
						label = ((LabelProxy) element).getLabel();
					} else if (element instanceof PageLabelProxy) {
						label = ((PageLabelProxy) element).getLabel();
					}
					if (label != null) {
						updateLabelStyle(label, (FontStyle) eNotifier, (EStructuralFeature) eNotification.getFeature());
					}
				}
			} else if (eNotifier instanceof FillStyle) {
				EObject container =  eNotifier.eContainer();
				if (container instanceof org.eclipse.gmf.runtime.notation.Node) {
					Label label = null;
					EObject element = ((org.eclipse.gmf.runtime.notation.Node) container).getElement();
					if (element instanceof LabelProxy) {
						label = ((LabelProxy) element).getLabel();
					} else if (element instanceof PageLabelProxy) {
						label = ((PageLabelProxy) element).getLabel();
					}
					if (label != null) {
						updateLabelStyle(label, (FillStyle) eNotifier, (EStructuralFeature) eNotification.getFeature());
					}
				}
			} else if (eNotifier instanceof Connector) {
					EObject element = ((Connector) eNotifier).getElement();
					if (element instanceof Arc) {
						updateArcStyle((Arc) element, (Connector) eNotifier, (EStructuralFeature) eNotification.getFeature());
					} 

			}
		}
	}

	private void updateIntermediatePositions(Edge edge, Arc arc) {
		ArcGraphics arcGraphics = (ArcGraphics) arc.getGraphics();
		if (arcGraphics == null) {
			arcGraphics = PnmlcoremodelFactory.eINSTANCE.createArcGraphics();
			arc.setGraphics(arcGraphics);
		}
		
		arcGraphics.getPosition().clear();
		int x = 0;
		int y = 0;
		Node source = arc.getSource();
		if (source != null) {
			// FIXME should be more defensive
			NodeGraphics nodeGraphics = (NodeGraphics) source.getGraphics();
			if (nodeGraphics != null) {
				x = (int) nodeGraphics.getPosition().getX();
				y = (int) nodeGraphics.getPosition().getY();
			}
		}
		
		Bendpoints bendpoints = edge.getBendpoints();
		if (bendpoints instanceof RelativeBendpoints) {
			// FIXME should be more defensive
			RelativeBendpoints relativeBendpoints = (RelativeBendpoints) bendpoints;
			for (java.lang.Object pointObj: relativeBendpoints.getPoints() ) {
				if (pointObj instanceof RelativeBendpoint) {
					RelativeBendpoint point = (RelativeBendpoint) pointObj;
					Coordinate coord = PnmlcoremodelFactory.eINSTANCE.createCoordinate();
					coord.setX(x + point.getSourceX());
					coord.setY(y + point.getSourceY());
					arcGraphics.getPosition().add(coord);
				}
			}
		}
	}
	
	private void updateNodeBounds(ENotificationImpl eNotification,
			EObject eNotifier) {
		View view = (View) eNotifier.eContainer();
		EObject modelElement = view.getElement();
	    updateNodeBounds(view, modelElement);
	}

	private void updateNodeBounds(View view, EObject modelElement) {
		if (view instanceof org.eclipse.gmf.runtime.notation.Node) {
			org.eclipse.gmf.runtime.notation.Node viewNode = (org.eclipse.gmf.runtime.notation.Node) view;

			if ((modelElement instanceof Node || modelElement instanceof Page)){
				Object modelNode = (Object) modelElement;

				NodeGraphics nodeGraphics = (NodeGraphics) modelNode.getGraphics();
				if (nodeGraphics == null){
					nodeGraphics = PnmlcoremodelFactory.eINSTANCE.createNodeGraphics();
					modelNode.setGraphics(nodeGraphics);
				}

				Coordinate newPosition = getNodePosition(viewNode);
				nodeGraphics.setPosition(newPosition);

				Coordinate newDimension = getNodeDimension(viewNode);
				nodeGraphics.setDimension(newDimension);

				// The labels attached to this node also need to be updated too, since their positions
				// are relative to this position! 

				EObject container = viewNode.eContainer();
				if (container != null && container instanceof Diagram) {
					Diagram diagram = (Diagram) container;
					for (java.lang.Object child: diagram.getChildren()) {
						if (child instanceof org.eclipse.gmf.runtime.notation.Node) {
							org.eclipse.gmf.runtime.notation.Node node = 
								(org.eclipse.gmf.runtime.notation.Node) child;
							EObject element = node.getElement();
							if (element != null && element instanceof LabelProxy) {
								Label label = ((LabelProxy) element).getLabel();
								if (label != null && label.eContainer() == modelElement);
								updateNodeBounds(node,element);
							} 
						}
					}
				}

				// the intermediate points of an arc also need to be updated

				for (java.lang.Object child: viewNode.getSourceEdges()) {
					if (child instanceof Edge) {
						Edge edge = (Edge) child;
						EObject element = edge.getElement();
						if (element != null && element instanceof Arc) {
							updateIntermediatePositions(edge, (Arc) element);
						}
					}
				}


			} else if (modelElement instanceof LabelProxy) {
				LabelProxy labelProxy = (LabelProxy) modelElement;
				Label label = labelProxy.getLabel();

				if (label != null) {
					EObject container = label.eContainer();
					if (container instanceof Object) {
						Object object = (Object) container;
						AnnotationGraphics labelGraphics = (AnnotationGraphics) label.getGraphics();
						if (labelGraphics == null){
							labelGraphics = PnmlcoremodelFactory.eINSTANCE.createAnnotationGraphics();
							label.setGraphics(labelGraphics);
						}

						Coordinate newPosition = getLabelOffset(
								object, 
								viewNode);
						labelGraphics.setOffset(newPosition);
					}
				}
			} else if (modelElement instanceof PageLabelProxy) {
				PageLabelProxy pageLabelProxy = (PageLabelProxy) modelElement;
				Label label = pageLabelProxy.getLabel();

				if (label != null) {
					AnnotationGraphics labelGraphics = (AnnotationGraphics) label.getGraphics();
					if (labelGraphics == null){
						labelGraphics = PnmlcoremodelFactory.eINSTANCE.createAnnotationGraphics();
						label.setGraphics(labelGraphics);
					}

					Coordinate newPosition = getAbsolutePNMLPosition(viewNode);
					labelGraphics.setOffset(newPosition);
				}
			} else if (modelElement == null) {
				// In this case, this is a change not related to the model!
				// This is ignored
			} else {
				// Otherwise, ignoring it might loose some information. In order to
				// follow this situation up, a warning is issued.
				Status status = new Status(Status.WARNING, 
						PNMLCoreModelDiagramEditorPlugin.ID, 
						201, 
						"Undealt case in graphics update!", 
						null);
				PNMLCoreModelDiagramEditorPlugin.getInstance().getLog().log(status);
			}
		}
	}
	
	private void updateArcStyle(Edge edge, Arc arc, ConnectorStyle style, EStructuralFeature feature) {
		if (feature.equals(NotationPackage.eINSTANCE.getRoutingStyle_Smoothness()) ||
				feature.equals(NotationPackage.eINSTANCE.getLineStyle_LineColor()) ) {
			Graphics graphics = arc.getGraphics();
			ArcGraphics arcGraphics = null;
			Line line = null;
			if (graphics instanceof ArcGraphics) {
				arcGraphics = (ArcGraphics) graphics;
				line = arcGraphics.getLine();
				if (line == null) {
					line = PnmlcoremodelFactory.eINSTANCE.createLine();
					arcGraphics.setLine(line);
				}
			} else if (graphics == null) {
				// create arcGraphics
				arcGraphics = PnmlcoremodelFactory.eINSTANCE.createArcGraphics();
				line = PnmlcoremodelFactory.eINSTANCE.createLine();
				arcGraphics.setLine(line);
				arc.setGraphics(arcGraphics);
			} 
			// note that we do not do any update if the graphics is not an arc graphics
			if (line != null) {
				if (feature.equals(NotationPackage.eINSTANCE.getRoutingStyle_Smoothness())) {
					Smoothness smoothness = style.getSmoothness();
					if (smoothness.getValue() == 0 && line.getShape().getValue() != 0 ) {
						line.setShape(LineShape.LINE);
					} else if (smoothness.getValue() !=0  && line.getShape().getValue() == 0) {
						line.setShape(LineShape.CURVE);
					}
				} else if (feature.equals(NotationPackage.eINSTANCE.getLineStyle_LineColor())) {
					int colour = style.getLineColor();
					line.setColor(new CSSColor(FigureUtilities.integerToRGB(colour)));
				}
			}
		}
	}
	
	private void updateArcStyle(Arc arc, Connector connector, EStructuralFeature feature) {
		Graphics graphics = arc.getGraphics();
		ArcGraphics arcGraphics = null;
		if (graphics == null) {
			arcGraphics = PnmlcoremodelFactory.eINSTANCE.createArcGraphics();
			arc.setGraphics(arcGraphics);
		} else if (graphics instanceof ArcGraphics) {
			arcGraphics = (ArcGraphics) graphics;
		} else {
			return;
		}
		
		if (feature.equals(NotationPackage.eINSTANCE.getRoutingStyle_Smoothness())) {
			Line line = arcGraphics.getLine();
			if (line == null) {
				line = PnmlcoremodelFactory.eINSTANCE.createLine();
				arcGraphics.setLine(line);
			}
			Smoothness smoothness = connector.getSmoothness();
			if (smoothness.getValue() == 0 && line.getShape().getValue() != 0 ) {
				line.setShape(LineShape.LINE);
			} else if (smoothness.getValue() !=0  && line.getShape().getValue() == 0) {
				line.setShape(LineShape.CURVE);
			}
		} else if (feature.equals(NotationPackage.eINSTANCE.getLineStyle_LineColor())) {
			Line line = arcGraphics.getLine();
			if (line == null) {
				line = PnmlcoremodelFactory.eINSTANCE.createLine();
				arcGraphics.setLine(line);
			}
			line.setColor(new CSSColor(FigureUtilities.integerToRGB(connector.getLineColor())));
		}
		
	}
	
	private void updateNodeStyle(View view, Object object, ShapeStyle style, EStructuralFeature feature) {
		if (object instanceof Page || object instanceof Node) { 
			if (feature.equals(NotationPackage.eINSTANCE.getLineStyle_LineColor())) {
				Graphics graphics = object.getGraphics();
				NodeGraphics nodeGraphics = null;
				Line line = null;
				if (graphics instanceof NodeGraphics) {
					nodeGraphics = (NodeGraphics) graphics;
					line = nodeGraphics.getLine();
					if (line == null) {
						line = PnmlcoremodelFactory.eINSTANCE.createLine();
						nodeGraphics.setLine(line);
					}
				} else if (graphics == null) {
					// create arcGraphics
					nodeGraphics = PnmlcoremodelFactory.eINSTANCE.createNodeGraphics();
					line = PnmlcoremodelFactory.eINSTANCE.createLine();
					nodeGraphics.setLine(line);
					object.setGraphics(nodeGraphics);
				} 
				// note that we do not do any update, if the graphics is not a NodeGraphics
				if (line != null) {
					if (feature.equals(NotationPackage.eINSTANCE.getLineStyle_LineColor())) {
						int colour = style.getLineColor();
						line.setColor(new CSSColor(FigureUtilities.integerToRGB(colour)));
					}	

				}
			} else if (feature.equals(NotationPackage.eINSTANCE.getFillStyle_FillColor())) {
				Graphics graphics = object.getGraphics();
				NodeGraphics nodeGraphics = null;
				Fill fill = null;
				if (graphics instanceof NodeGraphics) {
					nodeGraphics = (NodeGraphics) graphics;
					fill = nodeGraphics.getFill();
					if (fill == null) {
						fill = PnmlcoremodelFactory.eINSTANCE.createFill();
						nodeGraphics.setFill(fill);
					}
				} else if (graphics == null) {
					// create arcGraphics
					nodeGraphics = PnmlcoremodelFactory.eINSTANCE.createNodeGraphics();
					fill = PnmlcoremodelFactory.eINSTANCE.createFill();
					nodeGraphics.setFill(fill);
					object.setGraphics(nodeGraphics);
				} 
				// note that we do not do any update, if the graphics is not a NodeGraphics
				if (fill != null) {
					if (feature.equals(NotationPackage.eINSTANCE.getFillStyle_FillColor())) {
						int colour = style.getFillColor();
						fill.setColor(new CSSColor(FigureUtilities.integerToRGB(colour)));
					}	
				}
			}
		}
	}
	
	private void updateLabelStyle(View view, Label label, ShapeStyle style, EStructuralFeature feature) {
		if (feature.equals(NotationPackage.eINSTANCE.getFontStyle_FontColor())) { 
			Graphics graphics = label.getGraphics();
			AnnotationGraphics annotationGraphics = null;
			Line line = null;
			if (graphics instanceof AnnotationGraphics) {
				annotationGraphics = (AnnotationGraphics) graphics;
				line = annotationGraphics.getLine();
				if (line == null) {
					line = PnmlcoremodelFactory.eINSTANCE.createLine();
					annotationGraphics.setLine(line);
				}
			} else if (graphics == null) {
				// create AnnotationGraphics
				annotationGraphics = PnmlcoremodelFactory.eINSTANCE.createAnnotationGraphics();
				line = PnmlcoremodelFactory.eINSTANCE.createLine();
				annotationGraphics.setLine(line);
				label.setGraphics(annotationGraphics);
			} 
			// note that we do not do any update, if the graphics is not a AnnotationGraphics
			if (line != null) {
				int colour = style.getFontColor();
				line.setColor(new CSSColor(FigureUtilities.integerToRGB(colour)));
			}
		} else if (feature.equals(NotationPackage.eINSTANCE.getFillStyle_FillColor())) {
			Graphics graphics = label.getGraphics();
			AnnotationGraphics annotationGraphics = null;
			Fill fill = null;
			if (graphics instanceof AnnotationGraphics) {
				annotationGraphics = (AnnotationGraphics) graphics;
				fill = annotationGraphics.getFill();
				if (fill == null) {
					fill = PnmlcoremodelFactory.eINSTANCE.createFill();
					annotationGraphics.setFill(fill);
				}
			} else if (graphics == null) {
				// create annotationGraphicsGraphics
				annotationGraphics = PnmlcoremodelFactory.eINSTANCE.createAnnotationGraphics();
				fill = PnmlcoremodelFactory.eINSTANCE.createFill();
				annotationGraphics.setFill(fill);
				label.setGraphics(annotationGraphics);
			} 
			// note that we do not do any update, if the graphics is not a AnntotionGraphics
			if (fill != null) {
				int colour = style.getFillColor();
				fill.setColor(new CSSColor(FigureUtilities.integerToRGB(colour)));
			}
		} else if (feature.equals(NotationPackage.eINSTANCE.getFontStyle_FontName()) ||
				   feature.equals(NotationPackage.eINSTANCE.getFontStyle_FontHeight())) {
			Graphics graphics = label.getGraphics();
			AnnotationGraphics annotationGraphics = null;
			Font font = null;
			if (graphics instanceof AnnotationGraphics) {
				annotationGraphics = (AnnotationGraphics) graphics;
				font = annotationGraphics.getFont();
				if (font == null) {
					font = PnmlcoremodelFactory.eINSTANCE.createFont();
					annotationGraphics.setFont(font);
				}
			} else if (graphics == null) {
				// create annotationGraphicsGraphics
				annotationGraphics = PnmlcoremodelFactory.eINSTANCE.createAnnotationGraphics();
				font = PnmlcoremodelFactory.eINSTANCE.createFont();
				annotationGraphics.setFont(font);
				label.setGraphics(annotationGraphics);
			} 
			// note that we do not do any update, if the graphics is not a AnntotionGraphics
			if (font != null) {
				if (feature.equals(NotationPackage.eINSTANCE.getFontStyle_FontName())) {
					String fontName = style.getFontName();
					CSSFontFamily fontFamily = null;
					try {
						fontFamily = new CSSFontFamily(fontName);
					} catch (IllegalFormatException e) {
					}
					if (fontFamily != null) {
						font.setFamily(fontFamily);
					}
				} else if (feature.equals(NotationPackage.eINSTANCE.getFontStyle_FontHeight()))  {
					int size = style.getFontHeight();
					font.setSize(new CSSFontSize(size));
				}
			}
		}
	}
	
	private static void updateLabelStyle(Label label, FontStyle style, EStructuralFeature feature) {
		Graphics graphics = label.getGraphics();
		AnnotationGraphics annotationGraphics = null;
		if (graphics == null) {
			annotationGraphics = PnmlcoremodelFactory.eINSTANCE.createAnnotationGraphics();
			label.setGraphics(annotationGraphics);
		} else if (graphics instanceof AnnotationGraphics) {
			annotationGraphics = (AnnotationGraphics) graphics;
		} else {
			return;
		}
		
		if (feature.equals(NotationPackage.eINSTANCE.getFontStyle_FontColor())) {
			Line line = annotationGraphics.getLine();
			if (line == null) {
				line = PnmlcoremodelFactory.eINSTANCE.createLine();
				annotationGraphics.setLine(line);
			}
			line.setColor(new CSSColor(FigureUtilities.integerToRGB(style.getFontColor())));
		} else if (feature.equals(NotationPackage.eINSTANCE.getFontStyle_FontName())) {
			Font font = annotationGraphics.getFont();
			if (font == null) {
				font = PnmlcoremodelFactory.eINSTANCE.createFont();
				annotationGraphics.setFont(font);
			}
			String fontName = style.getFontName();
			CSSFontFamily fontFamily = null;
			try {
				fontFamily = new CSSFontFamily(fontName);
			} catch (IllegalFormatException e) {
			}
			if (fontFamily != null) {
				font.setFamily(fontFamily);
			}
		} else if (feature.equals(NotationPackage.eINSTANCE.getFontStyle_FontHeight())) {
			Font font = annotationGraphics.getFont();
			if (font == null) {
				font = PnmlcoremodelFactory.eINSTANCE.createFont();
				annotationGraphics.setFont(font);
			}
			font.setSize(new CSSFontSize(style.getFontHeight()));
		}
	}
	
	private static void updateLabelStyle(Label label, FillStyle style, EStructuralFeature feature) {
		Graphics graphics = label.getGraphics();
		AnnotationGraphics annotationGraphics = null;
		if (graphics == null) {
			annotationGraphics = PnmlcoremodelFactory.eINSTANCE.createAnnotationGraphics();
			label.setGraphics(annotationGraphics);
		} else if (graphics instanceof AnnotationGraphics) {
			annotationGraphics = (AnnotationGraphics) graphics;
		} else {
			return;
		}
		
		if (feature.equals(NotationPackage.eINSTANCE.getFillStyle_FillColor())) {
			Fill fill = annotationGraphics.getFill();
			if (fill == null) {
				fill = PnmlcoremodelFactory.eINSTANCE.createFill();
				annotationGraphics.setFill(fill);
			}
			fill.setColor(new CSSColor(FigureUtilities.integerToRGB(style.getFillColor())));
		} 
	}
	
	private static Coordinate getNodePosition(org.eclipse.gmf.runtime.notation.Node node) {
		Coordinate coord = PnmlcoremodelFactory.eINSTANCE.createCoordinate();

		LayoutConstraint layout = node.getLayoutConstraint();
		if (layout != null) {
			if (layout instanceof Bounds) {
				Bounds bounds = (Bounds) layout;
				// Transform from upper left corner to center
				Coordinate dimension = getNodeDimension(node);
				coord.setX(bounds.getX()+dimension.getX()/2.0f);
				coord.setY(bounds.getY()+dimension.getY()/2.0f);
			} else if (layout instanceof Location) {
				// Transform from upper left corner to center
                // with GMF standard for width and height (40)
				Location location = (Location) layout;
				coord.setX(location.getX()+20);
				coord.setY(location.getY()+20);
			}
		}

		return coord;
	}
	
	private static Coordinate getNodeDimension(org.eclipse.gmf.runtime.notation.Node node) {
		Coordinate coord = PnmlcoremodelFactory.eINSTANCE.createCoordinate();

		LayoutConstraint layout = node.getLayoutConstraint();
		if (layout != null) {
			if (layout instanceof Size) {
				Size size = (Size) layout;
				int width=size.getWidth();
				if (width < 0) width = 40;
				coord.setX(width);
				int height = size.getHeight();
				if (height < 0) height = 40;
				coord.setY(height);
			} 
		}

		return coord;
	}
	
	private static Coordinate getLabelOffset(Object object, org.eclipse.gmf.runtime.notation.Node node) {
		Coordinate coord = PnmlcoremodelFactory.eINSTANCE.createCoordinate();

		LayoutConstraint layout = node.getLayoutConstraint();
		if (layout != null) {
			if (layout instanceof Location) {
				Location labelLocation = (Location) layout;
				Coordinate absoluteObjectPosition = NotationModelHelper.getAbsolutePNMLPositionObject(object);
				coord.setX(labelLocation.getX() - absoluteObjectPosition.getX());
				coord.setY(labelLocation.getY() - absoluteObjectPosition.getY());
			} 
		}

		return coord;
	}
	
	private static Coordinate getAbsolutePNMLPosition(org.eclipse.gmf.runtime.notation.Node node) {
		Coordinate coord = PnmlcoremodelFactory.eINSTANCE.createCoordinate();

		LayoutConstraint layout = node.getLayoutConstraint();
		if (layout != null) {
			if (layout instanceof Location) {
				Location labelLocation = (Location) layout;
				coord.setX(labelLocation.getX());
				coord.setY(labelLocation.getY());
			} 
		}

		return coord;
	}

}

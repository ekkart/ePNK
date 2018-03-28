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

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.draw2d.ui.figures.FigureUtilities;
import org.eclipse.gmf.runtime.notation.Bounds;
import org.eclipse.gmf.runtime.notation.ConnectorStyle;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.LayoutConstraint;
import org.eclipse.gmf.runtime.notation.Location;
import org.eclipse.gmf.runtime.notation.MeasurementUnit;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.NotationFactory;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.RelativeBendpoints;
import org.eclipse.gmf.runtime.notation.ShapeStyle;
import org.eclipse.gmf.runtime.notation.Smoothness;
import org.eclipse.gmf.runtime.notation.Style;
import org.eclipse.gmf.runtime.notation.datatype.RelativeBendpoint;
import org.pnml.tools.epnk.diagram.edit.parts.ArcEditPart;
import org.pnml.tools.epnk.diagram.edit.parts.LabelProxyEditPart;
import org.pnml.tools.epnk.diagram.edit.parts.LabelProxyTextEditPart;
import org.pnml.tools.epnk.diagram.edit.parts.Page2EditPart;
import org.pnml.tools.epnk.diagram.edit.parts.PageEditPart;
import org.pnml.tools.epnk.diagram.edit.parts.PageLabelProxyEditPart;
import org.pnml.tools.epnk.diagram.edit.parts.PageLabelProxyTextEditPart;
import org.pnml.tools.epnk.diagram.edit.parts.PlaceEditPart;
import org.pnml.tools.epnk.diagram.edit.parts.RefPlaceEditPart;
import org.pnml.tools.epnk.diagram.edit.parts.RefTransitionEditPart;
import org.pnml.tools.epnk.diagram.edit.parts.TransitionEditPart;
import org.pnml.tools.epnk.diagram.part.PNMLCoreModelDiagramEditorPlugin;
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
import org.pnml.tools.epnk.pnmlcoremodel.Name;
import org.pnml.tools.epnk.pnmlcoremodel.NodeGraphics;
import org.pnml.tools.epnk.pnmlcoremodel.Object;
import org.pnml.tools.epnk.pnmlcoremodel.Page;
import org.pnml.tools.epnk.pnmlcoremodel.PageLabelProxy;
import org.pnml.tools.epnk.pnmlcoremodel.Place;
import org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelFactory;
import org.pnml.tools.epnk.pnmlcoremodel.RefPlace;
import org.pnml.tools.epnk.pnmlcoremodel.RefTransition;
import org.pnml.tools.epnk.pnmlcoremodel.Transition;

/**
 * This class transforms PNML syntax to the GMF Notation model
 * @generated NOT
 * @author eki (based on earlier versions from Lukasz and Youjun)
 */
public class NotationModelHelper {

	public static Diagram getNotationModelFromPnml(Page page) {
		
		Hashtable<org.pnml.tools.epnk.pnmlcoremodel.Node,Node> registeredNodes 
		= new Hashtable<org.pnml.tools.epnk.pnmlcoremodel.Node, Node>();
		
		Diagram diagram = NotationFactory.eINSTANCE.createDiagram();
		
		diagram.setMeasurementUnit(MeasurementUnit.get(MeasurementUnit.PIXEL));

		// Set the name of the page (try to use the name, if that does not
		// exist use the id, if that does not exist the path fragment will be used)
		Name name = page.getName();
		if (name != null && name.getText() != null) {
			diagram.setName(name.getText()); 
		} else {
			diagram.setName("Page " + page.getId());
		}
		
		diagram.setType(PageEditPart.MODEL_ID);
		diagram.setElement(page);
		diagram.createStyle(NotationPackage.eINSTANCE.getDiagramStyle());

		// Process the page labels
		createPageProxyLabels(diagram, page);
		
		// Process the nodes
		for (EObject pnObject : page.getObject()) {
			if ((pnObject instanceof org.pnml.tools.epnk.pnmlcoremodel.Node) ){
				Node node=createNotationNode(diagram, (org.pnml.tools.epnk.pnmlcoremodel.Node) pnObject);
				if (pnObject instanceof org.pnml.tools.epnk.pnmlcoremodel.Node) {
					registeredNodes.put((org.pnml.tools.epnk.pnmlcoremodel.Node) pnObject, node);
				}
			} else if (pnObject instanceof Page) {
				createNotationNode(diagram, (org.pnml.tools.epnk.pnmlcoremodel.Object) pnObject);			
			} else if (pnObject instanceof Arc) {
				// deal with this later
			} else {
				Status status = new Status(Status.ERROR, 
						PNMLCoreModelDiagramEditorPlugin.ID, 
						Status.OK, 
						"Undealt object in diagram creation: should not happen!", 
						new Exception());
				PNMLCoreModelDiagramEditorPlugin.getInstance().getLog().log(status);
			}
		}
			
		//Process all arcs
		for (Object pnObject : page.getObject()) {
			if (pnObject instanceof Arc) {
				createNotationEdge(diagram, (Arc) pnObject, registeredNodes);
			}
		}
		
		return diagram;
		
	}

	private static Node createNotationNode(Diagram diagram, org.pnml.tools.epnk.pnmlcoremodel.Object pnObject) {
		Node node = diagram.createChild(NotationPackage.eINSTANCE.getNode());
	
		node.setElement(pnObject);
		if(pnObject instanceof Place) {
			node.setType(Integer.toString(PlaceEditPart.VISUAL_ID));
		} else if(pnObject instanceof Transition) {
			node.setType(Integer.toString(TransitionEditPart.VISUAL_ID));
		} else if(pnObject instanceof RefPlace) {
			node.setType(Integer.toString(RefPlaceEditPart.VISUAL_ID));
		} else if(pnObject instanceof RefTransition) {
			node.setType(Integer.toString(RefTransitionEditPart.VISUAL_ID));
		} else if(pnObject instanceof Page) {
			node.setType(Integer.toString(Page2EditPart.VISUAL_ID));
		} else {
			Status status = new Status(Status.ERROR, 
					PNMLCoreModelDiagramEditorPlugin.ID, 
					Status.OK, 
					"Undealt object in diagram node creation: should not happen!", 
					new Exception());
			PNMLCoreModelDiagramEditorPlugin.getInstance().getLog().log(status);
		}
		
		Bounds bounds = getNodeBounds(pnObject);
		node.setLayoutConstraint(bounds);
		
		// node.createStyle(NotationPackage.eINSTANCE.getDescriptionStyle());
		// experiment: not exactly sure what that would do
		//
		// node.createStyle(NotationPackage.eINSTANCE.getLineTypeStyle());
		// enables the line type button in the appearance section (but for the
		// selection to take effect, more manual programming would be needed)
		//
		// node.createStyle(NotationPackage.eINSTANCE.getLineStyle());
		// enables the line width button in the appearance section (but for the
		// selection to take effect, more manual programming would be needed)
		
		Style style = node.createStyle(NotationPackage.eINSTANCE.getShapeStyle());
        // enables line and fill colour menus in the appearance section		

		Graphics graphics = pnObject.getGraphics();
		
		if (graphics != null && graphics instanceof NodeGraphics) {
			NodeGraphics nodeGraphics = (NodeGraphics) graphics;

			if (style != null && style instanceof ShapeStyle) {
				Line line = nodeGraphics.getLine();
				if (line != null) {
					if (line.getColor() != null) {
						// TODO: Creating colours this way, GMF takes responsibility for disposing them
						//       (I am not sure, they really do it though). Eventually we could use
						//       the ePNKs GraphicsResourcesManager to make sure of proper disposal
						//       of colours.
						((ShapeStyle) style).setLineColor(FigureUtilities.RGBToInteger(line.getColor().getRGB()));
					}
				}
				
				Fill fill = nodeGraphics.getFill();
				if (fill != null) {
					if (fill.getColor() != null) {
						// TODO: Creating colours this way, GMF takes responsibility for disposing them
						//       (I am not sure, they really do it though). Eventually we could use
						//       the ePNKs GraphicsResourcesManager to make sure of proper disposal
						//       of colours.
						((ShapeStyle) style).setFillColor(FigureUtilities.RGBToInteger(fill.getColor().getRGB()));
					}
				}
			}
		}
	
	    createProxyLabels(diagram, pnObject);
		return node;
	}
	
	private static void createProxyLabels(Diagram diagram, org.pnml.tools.epnk.pnmlcoremodel.Object pnObject){
		// TODO This was adjusted from the old version of labelProxies (attached to Objects) to
		//      the new version (attached to the containing Page) in a straight forward way.
		//      This can be made more efficient by doing this on the page directly and not
		//      for every pnObject on it. This should be refactored eventually.
		EObject container = pnObject.eContainer();
		if (container != null && container instanceof Page) {
			Page page = (Page) container;

			for (LabelProxy labelproxy: page.getLabelproxy()) {
				Label label = labelproxy.getLabel();
				if (label != null && label.eContainer() == pnObject) {
					Node node = diagram.createChild(NotationPackage.eINSTANCE.getNode());

					node.setElement(labelproxy);
					node.setType(Integer.toString(LabelProxyEditPart.VISUAL_ID));

					// node.createStyle(NotationPackage.eINSTANCE.getLineTypeStyle());
					// enables line type button in appearance section (but for the changes to
					// take effect more programming would be needed in the handleNotification method
					// of the EditPart)
					//
					// node.createStyle(NotationPackage.eINSTANCE.getLineStyle());
					// enables the line with button in the appearance section (but for the changes to
					// take effect more programming would be needed)
					//
					// node.createStyle(NotationPackage.eINSTANCE.getDescriptionStyle());
					// experiment: no idea what this would do
					
					ShapeStyle style = (ShapeStyle) node.createStyle(NotationPackage.eINSTANCE.getShapeStyle());
					// enables the colour menus in the appearance sections (and holds the resp. information)

					Graphics graphics = label.getGraphics();
					if (graphics != null && graphics instanceof AnnotationGraphics) {
						AnnotationGraphics annotationGraphics = (AnnotationGraphics) graphics;
						Fill fill = annotationGraphics.getFill();
						if (fill != null) {
							// TODO: Creating colours this way, GMF takes responsibility for disposing them
							//       (I am not sure, they really do it though). Eventually we could use
							//       the ePNKs GraphicsResourcesManager to make sure of proper disposal
							//       of colours.
							style.setFillColor(FigureUtilities.RGBToInteger(fill.getColor().getRGB()));
						}
						
						Line line = annotationGraphics.getLine();
						if (line != null) {
							// TODO: Creating colours this way, GMF takes responsibility for disposing them
							//       (I am not sure, they really do it though). Eventually we could use
							//       the ePNKs GraphicsResourcesManager to make sure of proper disposal
							//       of colours.
							style.setFontColor(FigureUtilities.RGBToInteger(line.getColor().getRGB()));
						}
						
						Font font = annotationGraphics.getFont();
						if (font != null) {
							if (font.getFamily() != null) {
								style.setFontName(font.getFamily().getFont().getFamily());
							}
							style.setFontHeight(font.getSize().getSize());
						}
					}
						
					style.setLineColor(style.getFillColor());

				    LayoutConstraint location = getLabelPosition(label);
				    node.setLayoutConstraint(location);

					Node decNode = node.createChild(NotationPackage.eINSTANCE.getDecorationNode());
					decNode.setElement(labelproxy);
					decNode.setType(Integer.toString(LabelProxyTextEditPart.VISUAL_ID));
				}
			}
		}
	}	
	
	private static void createPageProxyLabels(Diagram diagram, Page page){
		for (PageLabelProxy proxy: page.getPageLabelProxy()) {
			Node node = diagram.createChild(NotationPackage.eINSTANCE.getNode());

			node.setElement(proxy);
			node.setType(Integer.toString(PageLabelProxyEditPart.VISUAL_ID));

			ShapeStyle style = (ShapeStyle) node.createStyle(NotationPackage.eINSTANCE.getShapeStyle());
			// ShapeStyle style = (ShapeStyle) node.getStyle(NotationPackage.eINSTANCE.getShapeStyle());
			
			Label label = proxy.getLabel();
			
			if (label != null) {
				Graphics graphics = label.getGraphics();
				if (graphics != null && graphics instanceof AnnotationGraphics) {
					AnnotationGraphics annotationGraphics = (AnnotationGraphics) graphics;
					Fill fill = annotationGraphics.getFill();
					if (fill != null) {
						// TODO: Creating colours this way, GMF takes responsibility for disposing them
						//       (I am not sure, they really do it though). Eventually we could use
						//       the ePNKs GraphicsResourcesManager to make sure of proper disposal
						//       of colours.
						style.setFillColor(FigureUtilities.RGBToInteger(fill.getColor().getRGB()));
					}

					Line line = annotationGraphics.getLine();
					if (line != null) {
						// TODO: Creating colours this way, GMF takes responsibility for disposing them
						//       (I am not sure, they really do it though). Eventually we could use
						//       the ePNKs GraphicsResourcesManager to make sure of proper disposal
						//       of colours.
						style.setFontColor(FigureUtilities.RGBToInteger(line.getColor().getRGB()));
					}
					
					Font font = annotationGraphics.getFont();
					if (font != null) {
						if (font.getFamily() != null) {
							style.setFontName(font.getFamily().getFont().getFamily());
						}
						style.setFontHeight(font.getSize().getSize());
					}
				}
			}
			style.setLineColor(style.getFillColor());
			
			if (label != null) {
				LayoutConstraint location = getPageLabelPosition(label);
				node.setLayoutConstraint(location);
			}	
			
			Node decNode = node.createChild(NotationPackage.eINSTANCE.getDecorationNode());
			decNode.setElement(proxy);
			decNode.setType(Integer.toString(PageLabelProxyTextEditPart.VISUAL_ID));
		}
	}	
	
	static Location getObjectPosition(org.pnml.tools.epnk.pnmlcoremodel.Object object) {
		Location location = NotationFactory.eINSTANCE.createLocation();

		if (object != null) {
			if (object instanceof org.pnml.tools.epnk.pnmlcoremodel.Node ||
					object instanceof Page) {
				NodeGraphics nodeGraphics = (NodeGraphics) object.getGraphics();
				Coordinate pos = null; 
				Coordinate size = null; 
				if (nodeGraphics != null) {
				    pos = nodeGraphics.getPosition();
				    size = nodeGraphics.getDimension();
				}
				if (pos != null) {
					float width =  40; // GMF default node width
					float height = 40; // GMF default node height
					if (size != null) {
						width = size.getX();
						height = size.getY();
					}
					// transform from center to upper left corner:
					location.setX((int) (pos.getX() - width/2));
					location.setY((int) (pos.getY() - height/2));
				}
			} else if (object instanceof Arc) {
				ArcGraphics arcGraphics = (ArcGraphics) object.getGraphics();
				List<Coordinate> positions = null;
				if (arcGraphics != null) {
					positions = arcGraphics.getPosition();
				}
				if (positions!= null && positions.size() > 0) {
					if (positions.size() % 2 == 0) {
						// location is the middle between the two middle points
						Coordinate coord1 = positions.get(positions.size()/2 - 1);
						Coordinate coord2 = positions.get(positions.size()/2);
						location.setX((int) ((coord1.getX() + coord2.getX())/2));
						location.setY((int) ((coord1.getY() + coord2.getY())/2));
					} else {
						// location is the middle point
						Coordinate coord = positions.get(positions.size()/2);
						location.setX((int) (coord.getX()));
						location.setY((int) (coord.getY()));
					}
				} else {
					// location is the middle between the source and target node
					Arc arc = (Arc) object;
					Location location1 = getObjectPosition(arc.getSource());
					Location location2 = getObjectPosition(arc.getTarget());
					location.setX((location1.getX() + location2.getX())/2);
					location.setY((location1.getY() + location2.getY())/2);
				}
			} else {
				Status status = new Status(Status.ERROR, 
						PNMLCoreModelDiagramEditorPlugin.ID, 
						Status.OK, 
						"Undealt object in object position calculation: should not happen!", 
						new Exception());
				PNMLCoreModelDiagramEditorPlugin.getInstance().getLog().log(status);
			}
		}
		
		return location;
		
	}
	
	static Coordinate getAbsolutePNMLPositionObject(Object object) {
		Coordinate coord = PnmlcoremodelFactory.eINSTANCE.createCoordinate();
		if (object instanceof Arc) {
			Location location = getObjectPosition(object);
			coord.setX(location.getX());
			coord.setY(location.getY());
		} else if (object instanceof org.pnml.tools.epnk.pnmlcoremodel.Node || 
				object instanceof Page){
			Bounds bounds = getNodeBounds( object);
			coord.setX(bounds.getX() + bounds.getWidth()/2);
			coord.setY(bounds.getY() + bounds.getHeight()/2);
		} else {
			Status status = new Status(Status.ERROR, 
					PNMLCoreModelDiagramEditorPlugin.ID, 
					Status.OK, 
					"Undealt object in object position calculation: should not happen!", 
					new Exception());
			PNMLCoreModelDiagramEditorPlugin.getInstance().getLog().log(status);
		}
		
		return coord;
	}
	
	static Bounds getNodeBounds(org.pnml.tools.epnk.pnmlcoremodel.Object node) {
		Bounds bounds = NotationFactory.eINSTANCE.createBounds();
		Location location = getObjectPosition(node);
		bounds.setX(location.getX());
		bounds.setY(location.getY());
		
		NodeGraphics nodeGraphics = (NodeGraphics) node.getGraphics();
		if (nodeGraphics != null) {
			Coordinate dimension = nodeGraphics.getDimension();
			if (dimension != null) {
				bounds.setWidth((int)dimension.getX());
				bounds.setHeight((int)dimension.getY());
			}
		}
			
		return bounds;
	}
	
	static LayoutConstraint getLabelPosition(Label label) {
		Bounds location = NotationFactory.eINSTANCE.createBounds();
		AnnotationGraphics labelGraphics = (AnnotationGraphics) label.getGraphics();
		Coordinate coord = null;

		if (labelGraphics != null) {
			coord = labelGraphics.getOffset();
		}
		if (coord != null) {
			org.pnml.tools.epnk.pnmlcoremodel.Object object = (org.pnml.tools.epnk.pnmlcoremodel.Object) label.eContainer();
			Coordinate objLocation = getAbsolutePNMLPositionObject(object);
			if (objLocation != null) {
				// Calculate the absolute position of the label
				location.setX((int) (coord.getX() + objLocation.getX()));
				location.setY((int) (coord.getY() + objLocation.getY()));
			}			
		}
		
		return location;
	}
	
	static LayoutConstraint getPageLabelPosition(Label label) {
		Bounds border = NotationFactory.eINSTANCE.createBounds();
		AnnotationGraphics labelGraphics = (AnnotationGraphics) label.getGraphics();
		Coordinate coord = null;

		if (labelGraphics != null) {
			coord = labelGraphics.getOffset();
		}
		if (coord != null) {

			// Calculate the absolute position of the label
			border.setX((int) coord.getX());
			border.setY((int) coord.getY());		
		}

		return border;
	}

	static void createNotationEdge(Diagram diagram, Arc arc,
			Hashtable<org.pnml.tools.epnk.pnmlcoremodel.Node, Node> registeredNodes) {
		Edge edge = diagram.createEdge(NotationPackage.eINSTANCE.getEdge());
		edge.setElement(arc);
		edge.setType(Integer.toString(ArcEditPart.VISUAL_ID));
		// FIXME eki: Should be more defensive
		edge.setSource(registeredNodes.get(arc.getSource()));
		edge.setTarget(registeredNodes.get(arc.getTarget()));

		
		RelativeBendpoints relativeBendpoints = NotationFactory.eINSTANCE.createRelativeBendpoints();
		//edge.createBendpoints(NotationPackage.eINSTANCE
		//				.getRelativeBendpoints());
		edge.setBendpoints(relativeBendpoints);
        // add the bendpoints from the model:
		ArcGraphics arcGraphics = (ArcGraphics) arc.getGraphics();
		if (arcGraphics != null) {
			int xSource = 0;
			int ySource = 0;
			int xTarget = 0;
			int yTarget = 0;
		    // FIXME should be more defensive
			NodeGraphics nodeGraphics = (NodeGraphics) arc.getSource().getGraphics();
			if (nodeGraphics != null) {
				Coordinate coord = nodeGraphics.getPosition();
				if (coord != null ) {
					xSource = (int) coord.getX();
					ySource = (int) coord.getY();
				}
			}
			nodeGraphics = (NodeGraphics) arc.getTarget().getGraphics();
			if (nodeGraphics != null) {
				Coordinate coord = nodeGraphics.getPosition();
				if (coord != null ) {
					xTarget = (int) coord.getX();
					yTarget = (int) coord.getY();
				}
			}
			
			List<RelativeBendpoint> pointList = new ArrayList<RelativeBendpoint>();
			for (Coordinate coord: arcGraphics.getPosition()) {
				pointList.add(
						new RelativeBendpoint(
								(int) (coord.getX()-xSource),
								(int) (coord.getY()- ySource),
								(int) (coord.getX()-xTarget),
								(int) (coord.getY()-yTarget)));
			}
			relativeBendpoints.setPoints(pointList);
		}
		
		Style style = edge.createStyle(NotationPackage.eINSTANCE.getConnectorStyle()); 
		// enables line colour and line smoothness (and router options) in appearance section

		// edge.createStyle(NotationPackage.eINSTANCE.getLineStyle()); 
		// should enable line width button in appearance section for arcs (but does not!)
		//
		// edge.createStyle(NotationPackage.eINSTANCE.getArrowStyle());
		// enables arrow type button in appearance section for arcs
		//
		// edge.createStyle(NotationPackage.eINSTANCE.getLineTypeStyle());
		// enables line type button in appearance section for arcs

		if (arcGraphics != null && style instanceof ConnectorStyle) {
			Line line = arcGraphics.getLine();
			if (line != null) {
				if (line.getShape().getValue() == 1) {
					((ConnectorStyle) style).setSmoothness(Smoothness.NORMAL_LITERAL);
				}
				if (line.getColor() != null) {
					// TODO: Creating colours this way, GMF takes responsibility for disposing them
					//       (I am not sure, they really do it though). Eventually we could use
					//       the ePNKs GraphicsResourcesManager to make sure of proper disposal
					//       of colours.
					((ConnectorStyle) style).setLineColor(FigureUtilities.RGBToInteger(line.getColor().getRGB()));
				}
			}
		}
				
		createProxyLabels(diagram, arc);
	}

}

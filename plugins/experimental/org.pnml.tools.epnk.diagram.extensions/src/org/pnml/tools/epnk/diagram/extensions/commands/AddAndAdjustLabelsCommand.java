package org.pnml.tools.epnk.diagram.extensions.commands;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.LayoutConstraint;
import org.eclipse.gmf.runtime.notation.Location;
import org.eclipse.gmf.runtime.notation.Node;
import org.pnml.tools.epnk.diagram.edit.parts.LabelProxyEditPart;
import org.pnml.tools.epnk.pnmlcoremodel.Arc;
import org.pnml.tools.epnk.pnmlcoremodel.ArcGraphics;
import org.pnml.tools.epnk.pnmlcoremodel.Coordinate;
import org.pnml.tools.epnk.pnmlcoremodel.Graphics;
import org.pnml.tools.epnk.pnmlcoremodel.Label;
import org.pnml.tools.epnk.pnmlcoremodel.LabelProxy;
import org.pnml.tools.epnk.pnmlcoremodel.NodeGraphics;
import org.pnml.tools.epnk.pnmlcoremodel.Object;
import org.pnml.tools.epnk.pnmlcoremodel.Page;
import org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelFactory;
import org.pnml.tools.epnk.pnmlcoremodel.ToolInfo;
import org.pnml.tools.epnk.toolspecific.diagraminfo.DiagramInfo;

/**
 * This command adds labels provided in the labels mapping to the Petri net object and aligns the
 * labels evenly around the object.
 * 
 * @author Ekkart Kindler, ekki@dtu.dk
 *
 */
public class AddAndAdjustLabelsCommand extends RecordingCommand {
	
	/**
	 * The semantic hint for the ViewService (the String of the VISUAL_ID
	 * of the LabelProxyEditPart). This is needed for creating the view for
	 * the LabelProxy by the help of the ViewService.
	 */
	private static final String LABELPROXY_SEMANTIC_HINT = 
			Integer.toString(LabelProxyEditPart.VISUAL_ID);
	
	private Object object;
	private Map<Label,EReference> labels;
	
	public AddAndAdjustLabelsCommand(
			TransactionalEditingDomain domain,
			Object object, 
			Map<Label,EReference> labels) {
		super(domain,
				"Add missing labels",
				"Adds the missing labels to an object and aligns the labels around the object.");
		this.object = object;
		this.labels = labels;
	}

	@SuppressWarnings({ "unchecked", "rawtypes"})
	@Override
	protected void doExecute() {
		EObject container = object.eContainer();
		if (container instanceof Page) {
			Page page = (Page) container;
			Diagram diagram = null;
			for (ToolInfo toolInfo: page.getToolspecific()) {
				if (toolInfo instanceof DiagramInfo) {
					diagram = ((DiagramInfo) toolInfo).getDiagram();
				}
			}

			for (Label label: labels.keySet()) {
				EReference reference = labels.get(label);
				if (reference != null) {
					// create the missing label and the label proxy in the model
					LabelProxy proxy = PnmlcoremodelFactory.eINSTANCE.createLabelProxy();
					proxy.setLabel(label);
					proxy.setObject(object);
					page.getLabelproxy().add(proxy);

					if (!reference.isMany()) {
						object.eSet(reference, label);
					} else {
						java.lang.Object list = object.eGet(reference);
						if (list instanceof Collection) {
							((Collection) list).add(label);
						}
					}

					if (diagram != null) {
						// create the corresponding view element for the label proxy in the diagram 
						ViewService.createNode(
								diagram, 
								proxy, 
								LABELPROXY_SEMANTIC_HINT,
								PreferencesHint.USE_DEFAULTS);
					}
				}
			}
			
			if (diagram != null) {
				// Find all views in the diagram that correspond to a
				// label (label proxy) of the Petri net object
				List<Node> labelViewList = new ArrayList<Node>();
				for (java.lang.Object view: diagram.getChildren()) {
					if (view instanceof Node) {
						Node node = (Node) view;
						EObject element = node.getElement();
						if (element instanceof LabelProxy) {
							LabelProxy proxy = (LabelProxy) element;
							Object obj = proxy.getObject();
							if (object.equals(obj)) {
								labelViewList.add(node);
							}
						}
					}
				}
				
				// Compute and set the positions for these views (arrange
				// them in a circle around the center of the object)
				if (!labelViewList.isEmpty()) {
					// Compute appropriate center and radius first
					double distance = 30.0;      // distance around radius
					double x = 0.0;
					double y = 0.0;
					double rx = 20.0 + distance; // half of default width
					double ry = 20.0 + distance; // half of default height
					
					Graphics graphics = object.getGraphics();
					if (graphics instanceof NodeGraphics) {
						NodeGraphics nodeGraphics = (NodeGraphics) graphics;
						Coordinate coord =  nodeGraphics.getPosition();
						if (coord != null) {
							x = coord.getX();
							y = coord.getY();
						}
						coord =  nodeGraphics.getDimension();
						if (coord != null) {
							rx = coord.getX()/2 + distance;
							ry = coord.getY()/2 + distance;
						} 
					} else if (graphics instanceof ArcGraphics) {
						ArcGraphics arcGraphics = (ArcGraphics) graphics;
						if (arcGraphics.getPosition() == null || arcGraphics.getPosition().size() <= 2) {
							if (object instanceof Arc) {
								Arc arc = (Arc) object;
								if (arc.getSource() != null && arc.getTarget() != null) {
									Graphics sourceGraphics = arc.getSource().getGraphics();
									Graphics targetGraphics = arc.getTarget().getGraphics();
									if (sourceGraphics instanceof NodeGraphics && targetGraphics instanceof NodeGraphics) {
										Coordinate sourceCoord = ((NodeGraphics) sourceGraphics).getPosition();
										Coordinate targetCoord = ((NodeGraphics) targetGraphics).getPosition();
										if (sourceCoord != null && targetCoord != null) {
											// use the middle of the arc as the center
											x = (sourceCoord.getX() + targetCoord.getX())/2;
											y = (sourceCoord.getY() + targetCoord.getY())/2;
											distance = 0.0;
											rx = 40.0;
											ry = 40.0;
											
										}
									}
								}
							}
						} else {
							// Use the middle intermediate point of the arc as the center
							int i = arcGraphics.getPosition().size()/2;
							Coordinate coord = arcGraphics.getPosition().get(i);
							if (coord != null) {
								x = coord.getX();
								y = coord.getY();
								distance = 0.0;
								rx = 40.0;
								ry = 40.0;
							}
						}	
					}
					
					// Now position the views (nodes) on the respective circle
					double angle = -1*Math.PI;
					double delta = 2*Math.PI / labelViewList.size();
					for (Node node: labelViewList) {
						// TODO ekki@dtu.dk: this needs to be adjusted (some positions refer 
						//      to the center of the resp. view/element, some positions
						//      refer to the top left corner, which results in a "bit off" alignment.
						//
						//      Also, the alignment in a circle might be changed to something
						//      else. I choose the circular alignment of the labels, since
						//      this was the simplest way to evenly distribute the labels.
						// 
						//      Right now, the order of the labels is (or appears) random.
						//      A realistic implementation might want to use a fixed order
						//      of labels of a certain type.
						
						// Compute position of this view (dependent on angle)
						int nx = (int) Math.round(x + rx * Math.cos(angle));
						int ny = (int) Math.round(y + ry * Math.sin(angle));

						// and change the location of the node to this position
						LayoutConstraint layout = node.getLayoutConstraint();
						if (layout instanceof Location) {
							Location location = (Location) layout;
							location.setX(nx);
							location.setY(ny);
						}
						
						// Increment angle
						angle = angle + delta;
					}
				}
			}
		}
	}

}

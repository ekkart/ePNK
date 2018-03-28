package dk.dtu.compute.mbse.yawl.constraints;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;
import org.pnml.tools.epnk.helpers.FlatAccess;
import org.pnml.tools.epnk.helpers.NetFunctions;
import org.pnml.tools.epnk.pnmlcoremodel.Node;
import org.pnml.tools.epnk.pnmlcoremodel.PlaceNode;
import org.pnml.tools.epnk.pnmlcoremodel.TransitionNode;

import dk.dtu.compute.mbse.yawl.Arc;
import dk.dtu.compute.mbse.yawl.functions.YAWLFunctions;

/**
 * This is a constraint saying that there should be no duplicate arcs between
 * two net objects (i.e. two arcs with the same source and target and with
 * the same type). This constraint is a bit more involved, due to the reference
 * nodes, so it is easier to implement it as Java constraint.
 * 
 *
 * @author ekki@dtu.dk
 * @generated NOT
 */
public class NoDuplicateArcs extends AbstractModelConstraint {

	public IStatus validate(IValidationContext ctx) {
		EObject object = ctx.getTarget();
		if (object instanceof Arc) {
			Arc arc = (Arc) object;
			FlatAccess flatAccess = FlatAccess.getFlatAccess(NetFunctions.getPetriNet(arc));
			
			Node source = arc.getSource();
			if (source != null) {
				for (org.pnml.tools.epnk.pnmlcoremodel.Arc other: flatAccess.getOut(source)) {
					if (other != arc) {
						if (other instanceof Arc) {
							Arc arc2 = (Arc) other;
							Node target = arc.getTarget();
							if (target instanceof PlaceNode) {
								target = flatAccess.resolve((PlaceNode) target);
							} else if (target instanceof TransitionNode) {
								target = flatAccess.resolve((TransitionNode) target);
							}
							Node target2 = arc2.getTarget();
							if (target2 instanceof PlaceNode) {
								target2 = flatAccess.resolve((PlaceNode) target2);
							} else if (target2 instanceof TransitionNode) {
								target2 = flatAccess.resolve((TransitionNode) target2);
							}
							
							if (target == target2) {
								if (YAWLFunctions.getType(arc).equals(YAWLFunctions.getType(arc2))) {
									return ctx.createFailureStatus(new Object[] {arc});
								}
							}
						}
					}
				}	
			}
		} 
		return ctx.createSuccessStatus();
	}

}

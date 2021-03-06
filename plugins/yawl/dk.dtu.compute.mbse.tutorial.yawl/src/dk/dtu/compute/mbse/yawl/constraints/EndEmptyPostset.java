package dk.dtu.compute.mbse.yawl.constraints;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;
import org.pnml.tools.epnk.helpers.FlatAccess;
import org.pnml.tools.epnk.helpers.NetFunctions;

import dk.dtu.compute.mbse.yawl.CType;
import dk.dtu.compute.mbse.yawl.Condition;
import dk.dtu.compute.mbse.yawl.functions.YAWLFunctions;

/**
 * This is a constraint saying that a end condition should have an empty postset.
 *
 * @author ekki@dtu.dk
 * @generated NOT
 */
public class EndEmptyPostset extends AbstractModelConstraint {

	public IStatus validate(IValidationContext ctx) {
		EObject object = ctx.getTarget();
		if (object instanceof Condition) {
			Condition condition = (Condition) object;
			CType type = YAWLFunctions.getType(condition);
			if (type.equals(CType.FINISH)) {
				FlatAccess flatNet = FlatAccess.getFlatAccess(NetFunctions.getPetriNet(condition));
				if (flatNet.getOut(condition).size() > 0) {
					return ctx.createFailureStatus(new Object[] {condition});
				}
			}
		} 
		return ctx.createSuccessStatus();
	}

}

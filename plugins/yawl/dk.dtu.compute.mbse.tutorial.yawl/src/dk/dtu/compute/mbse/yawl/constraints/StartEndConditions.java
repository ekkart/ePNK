package dk.dtu.compute.mbse.yawl.constraints;

import java.util.Iterator;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNet;

import dk.dtu.compute.mbse.yawl.CType;
import dk.dtu.compute.mbse.yawl.Condition;
import dk.dtu.compute.mbse.yawl.YAWLNet;
import dk.dtu.compute.mbse.yawl.functions.YAWLFunctions;

/**
 * This is a constraint saying that a YAWL net should have exactly one start place and one
 * end place.
 *
 * @author ekki@dtu.dk
 * @generated NOT
 */
public class StartEndConditions extends AbstractModelConstraint {

	public IStatus validate(IValidationContext ctx) {
		EObject object = ctx.getTarget();
		if (object instanceof YAWLNet) {
			EObject container = object.eContainer();
			if (container instanceof PetriNet) {
				int startCount = 0;
				int endCount = 0;
				Iterator<EObject> iterator = container.eAllContents();
				while (iterator.hasNext()) {
					EObject content = iterator.next();
					if (content instanceof Condition) {
						Condition condition = (Condition) content;
						CType type = YAWLFunctions.getType(condition);
						if (type.equals(CType.START)) {
							startCount++;
							if (startCount > 1) {
								break;
							}
						} else if (type.equals(CType.FINISH)) {
							endCount++;
							if (endCount > 1) {
								break;
							}
						}
					}
				}
				if (startCount != 1 || endCount != 1) {
					return ctx.createFailureStatus(new Object[] {container});
				}
			}
		} 
		return ctx.createSuccessStatus();
	}

}

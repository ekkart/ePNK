package org.pnml.tools.epnk.pntypes.hlpng.pntd.validation;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;
import 
  org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.Condition;
import
  org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.Transition;
import
  org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.Bool;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Sort;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Term;

public class ConditionIsBoolType extends AbstractModelConstraint {

	public IStatus validate(IValidationContext ctx) {
		EObject object = ctx.getTarget();

		if (object instanceof Transition) {
			Transition transition = (Transition) object;
			Condition condition = transition.getCondition();
			if (condition != null) {
				Term term = condition.getStructure();
				if (term != null) {
					Sort sort = term.getSort();
					if (sort != null) {
						if (!(sort instanceof Bool)) {
							return ctx.createFailureStatus(
									new Object[] {transition, 
											condition.getText()});
						}
					}
				}	
			}
		} 
		return ctx.createSuccessStatus();
	}
}

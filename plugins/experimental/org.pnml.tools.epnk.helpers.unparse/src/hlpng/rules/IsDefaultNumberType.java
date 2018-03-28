package hlpng.rules;

import org.eclipse.emf.ecore.EObject;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.NumberConstant;

import parserrules.Rule;
import serializer.Condition;

public class IsDefaultNumberType extends Condition {

	@Override
	public boolean evaluate(Rule rule, EObject object) {
		if (rule.getName().equals("NumberConstantNonDefaultSort")) {
			if (object instanceof NumberConstant) {
				NumberConstant constant = (NumberConstant) object;
				int value = constant.getValue();
				org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.Number number = constant.getType();
				if (number == null) {
					return true;
				} else if (number instanceof org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.Integer) {
					return (value < 0); 
				} else if (number instanceof org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.Natural) {
					return (value == 0);
				} else if (number instanceof org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.Positive) {
					return (value > 0);
				}
			}
		}
		return false;
	}

}

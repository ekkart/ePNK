package serializer;

import org.eclipse.emf.ecore.EObject;

import parserrules.Rule;

public abstract class Condition {
	
	public abstract boolean evaluate(Rule rule, EObject object);

}

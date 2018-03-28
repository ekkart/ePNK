package serializer;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import parserrules.ParserrulesFactory;
import parserrules.Token;

public class WrappedObject {
	
	private Map<String, Integer> map;
	
	private String lastFeature;
	
    EObject object;

	public WrappedObject(EObject object) {
		super();
		this.object = object;
		map = new HashMap<String, Integer>();
	}
	
	@SuppressWarnings("rawtypes")
	public EObject getNextElementOfFeature(String featurename) {
	    int index = 0;
		if (map.containsKey(featurename)) {
			index = map.get(featurename) + 1;
		} else {
		}
		
		EStructuralFeature feature = object.eClass().getEStructuralFeature(featurename);
		if (feature == null) {
			return null;
		}
		Object featureContent = object.eGet(feature);
		if (featureContent instanceof EList) {
			EList list = (EList) featureContent;
			if (list.size() > index) {
				Object result = list.get(index);
				if (result instanceof EObject) {
					map.put(featurename, index);
					lastFeature = featurename;
					return (EObject) result;
				}
			} 
		} else if (featureContent instanceof EObject) {
			if (index == 0) {
				map.put(featurename, index);
				lastFeature = featurename;
				return (EObject) featureContent;
			}
		}
		return null;
	}
	
	public Token getElementOfFeature(String featurename) {
		EStructuralFeature feature = object.eClass().getEStructuralFeature(featurename);
		Object featureContent = object.eGet(feature);
		if (featureContent != null) {
			Token result = ParserrulesFactory.eINSTANCE.createToken();
			result.setSeparator(false);
			result.setText(featureContent.toString());
			return result;
		}
		
		return null;
	}
	
	public void revert() {
		if (lastFeature != null) {
			int index = map.get(lastFeature);
			map.put(lastFeature, index-1);
			lastFeature = null;
		}
	}
	
}

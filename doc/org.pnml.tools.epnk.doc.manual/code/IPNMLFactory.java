package org.pnml.tools.epnk.pnmlcoremodel.serialisation;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public interface IPNMLFactory {

	public boolean canCreateObject(
			EStructuralFeature feature,
			Object container,
			String element,
			String attribute,
			IAttributeProvider provider);

	public EObject createObject(
			EStructuralFeature feature,
			Object container,
			String element,
			String attribute,
			IAttributeProvider provider);
		
	public Object createAttributeObject(
			Object object,
			String attribute,
			IAttributeProvider provider);
	
}

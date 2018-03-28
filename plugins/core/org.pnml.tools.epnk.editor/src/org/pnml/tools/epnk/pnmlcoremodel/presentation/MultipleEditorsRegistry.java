package org.pnml.tools.epnk.pnmlcoremodel.presentation;

import java.util.HashMap;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;

public class MultipleEditorsRegistry {
	
	private static MultipleEditorsRegistry instance;
	
	private HashMap<EditingDomain,MultipleEditorsInfo> mapping;
	
	private MultipleEditorsRegistry() {
		mapping = new HashMap<EditingDomain,MultipleEditorsInfo>();
	}
	
	public static MultipleEditorsRegistry getInstance() {
		if (instance == null) {
			instance = new MultipleEditorsRegistry();
		}
		return instance;
	}
	
	public void addInfo(EditingDomain domain, MultipleEditorsInfo info) {
		if (mapping != null) {
			mapping.put(domain, info);
		}
	}
	
	public void removeInfo(EditingDomain domain) {
		if (mapping != null) {
			mapping.remove(domain);
		}
	}
	
	public MultipleEditorsInfo getInfo(EditingDomain domain) {
		if (mapping != null) {
			return mapping.get(domain);
		}
		return null;
	}
	
	public MultipleEditorsInfo getInfo(EObject object) {
		EditingDomain domain =  AdapterFactoryEditingDomain.getEditingDomainFor(object);
		return getInfo(domain);
	}
	
}

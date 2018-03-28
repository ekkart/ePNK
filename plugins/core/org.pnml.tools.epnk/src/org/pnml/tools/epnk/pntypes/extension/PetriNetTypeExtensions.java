package org.pnml.tools.epnk.pntypes.extension;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.pnml.tools.epnk.pnmlcoremodel.EmptyType;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNet;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNetType;
import org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelFactory;
import org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage;

public class PetriNetTypeExtensions {

	private static PetriNetTypeExtensions instance;
	
	// private String[] names;
	private PetriNetType[] types;	

	public static synchronized PetriNetTypeExtensions getInstance() {
		if (instance == null) {
			instance = new PetriNetTypeExtensions();

			// String[] names = new String[extensions.length+1];	
			// PetriNetType[] types = new PetriNetType[extensions.length+1];
			List<String> names = new ArrayList<String>();
			List<PetriNetType> types = new ArrayList<PetriNetType>();
			
			// the empty type is an implicit extension (it is a bit simpler
			// if all Petri net types are dealt with in this way.
			// names[0] = "org.pnml.tools.epnk.empty";
			// types[0] = PnmlcoremodelFactory.eINSTANCE.createEmptyType();
			names.add("org.pnml.tools.epnk.empty");
			EmptyType empty = PnmlcoremodelFactory.eINSTANCE.createEmptyType();
			empty.setURI("http://www.pnml.org/version-2009/grammar/empty");
			types.add(empty);

			IExtensionRegistry reg = Platform.getExtensionRegistry();
			IExtensionPoint extPoint = reg.
				getExtensionPoint("org.pnml.tools.epnk.pntd");

			IExtension[] extensions = extPoint.getExtensions();
			
			// int invalid = 0;
			for (int i = 0; i < extensions.length; i++) {
				IExtension extension = extensions[i];
				IConfigurationElement confs[] = extension.getConfigurationElements();
				IConfigurationElement elem = confs[0];
				String name = null;
				PetriNetType type = null;
				try {
					name = (String) extension.getLabel();
					type = (PetriNetType) elem.createExecutableExtension("class");
					type.setURI(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
				if (type != null && name != null) {
					names.add(name);
					types.add(type);
				}
			}
			
			IExtensionPoint extPoint2 = reg.
				getExtensionPoint("org.pnml.tools.epnk.pntd_package");

			IExtension[] extensions2 = extPoint2.getExtensions();
			
			for (int i = 0; i < extensions2.length; i++) {
				IExtension extension = extensions2[i];
				IConfigurationElement confs[] = extension.getConfigurationElements();
				IConfigurationElement elem = confs[0];
				String name = null;
				String packageURI = null;
				PetriNetType type = null;
				try {
					name = (String) extension.getLabel();
					packageURI = elem.getAttribute("package_uri");
					if (packageURI != null) {
						EPackage pntdPackage = EPackage.Registry.INSTANCE.getEPackage(packageURI);
						for (EClassifier classifier: pntdPackage.getEClassifiers()) {
							if (classifier instanceof EClass) {
								EClass clazz = (EClass) classifier;
								if (PnmlcoremodelPackage.eINSTANCE.getPetriNetType().isSuperTypeOf(clazz) &&
										!clazz.isAbstract() &&
										!clazz.isInterface()) {
									try {
										type = (PetriNetType) pntdPackage.getEFactoryInstance().create(clazz);
										String uri = elem.getAttribute("type_uri");
										type.setURI(uri);
										break;
									} catch (Exception e) {
										System.err.println("The Petri net type class " + clazz.getName() +
												" could not be instantiated!"); 
									}

								}
							}
			 			}
					}
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				if (type != null && name != null) {
					names.add(name);
					types.add(type);
				}
			}
			
			/*
			instance.names = new String[names.length - invalid];
			instance.types = new PetriNetType[names.length - invalid];
			int i = 0;
			int j = 0;
			while (i<instance.names.length && j<names.length) {
				if (names[j] != null && types[j] != null) {
					instance.names[i] = names[j];
					instance.types[i] = types[j];
					i++;
				}
				j++;
			}
			*/
			// instance.names = names.toArray(new String[0]);
			instance.types = types.toArray(new PetriNetType[0]);
		}

		return instance;
	}
	
	/*
	public PetriNetType[] getPetriNetTypes() {
		return types;
	}
	*/
	
	public List<PetriNetType> getPetriNetTypes() {
		List<PetriNetType> result = new ArrayList<PetriNetType>();
		for (PetriNetType type: types) {
			result.add(type.createPetriNetType());
		}
		return result;
	}
	
	public PetriNetType createPetriNetType(String typeURI) {
		for (PetriNetType type: types) {
			PetriNetType result = type.createPetriNetType(typeURI);
			if (result != null) {
				return result;
			}
		}
		return null;
	}
	
	public PetriNet createPetriNet(String typeURI) {
		for (PetriNetType type: types) {
			PetriNet result = type.createPetriNet(typeURI);
			if (result != null) {
				return result;
			}
		}
		return null;
	}

}

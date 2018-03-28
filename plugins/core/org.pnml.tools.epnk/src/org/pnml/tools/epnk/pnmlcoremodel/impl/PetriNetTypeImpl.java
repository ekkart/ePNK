/**
 * This file is part of the ePNK project (Petri Net Kernel for eclipse). The ePNK
 * is platform for Petri net tools based on the PNML transfer format. Its
 * main idea is to provide generic Petri net types which can be easily plugged
 * in and a simple generic GMF editor, that can be used for graphically editing
 * nets of any plugged in type. Additional functionality can be plugged in.
 * 
 * Note that this project is still in an experimental phase, and is also used
 * as a case study for EMF/GMF based Model-based Software Engineering.
 * 
 * Copyright (C) 2010 Ekkart Kindler, eki@imm.dtu.dk
 * The license under which this software will be distributed is still to be decided -
 * it will probably be the EPL.
 *
 * $Id$
 */
package org.pnml.tools.epnk.pnmlcoremodel.impl;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.pnml.tools.epnk.pnmlcoremodel.Arc;
import org.pnml.tools.epnk.pnmlcoremodel.Page;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNet;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNetType;
import org.pnml.tools.epnk.pnmlcoremodel.Place;
import org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelFactory;
import org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage;
import org.pnml.tools.epnk.pnmlcoremodel.RefPlace;
import org.pnml.tools.epnk.pnmlcoremodel.RefTransition;
import org.pnml.tools.epnk.pnmlcoremodel.Transition;
import org.pnml.tools.epnk.pnmlcoremodel.serialisation.ExtendedPNMLMetaData;
import org.pnml.tools.epnk.pnmlcoremodel.serialisation.PNMLMetaData;
import org.pnml.tools.epnk.structuredpntypemodel.StructuredpntypemodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Petri Net Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class PetriNetTypeImpl extends EObjectImpl implements PetriNetType {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PetriNetTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PnmlcoremodelPackage.Literals.PETRI_NET_TYPE;
	}

	
	private EFactory petriNetFactory = null;
	
	private EClass petriNetClass = null;
	
	// @generated NOT
	// @author eki	
	@Override
	public PetriNet createPetriNet(String type) {
		if (petriNetFactory == null) {
			EClass eClass = this.eClass();
			EPackage ePackage = eClass.getEPackage();
			for (EClassifier classifier: ePackage.getEClassifiers()) {
				if (classifier instanceof EClass) {
					EClass netClass = (EClass) classifier;
					if (PnmlcoremodelPackage.eINSTANCE.getPetriNet().isSuperTypeOf(netClass)) {
						if (ePackage.getEFactoryInstance().create(netClass) != null) {
							petriNetFactory = ePackage.getEFactoryInstance();
							petriNetClass = netClass;
						}
					}
				}
 			}
			if (petriNetFactory == null) {
				petriNetFactory = PnmlcoremodelFactory.eINSTANCE;
				petriNetClass = PnmlcoremodelPackage.eINSTANCE.getPetriNet();
			}
		}
		
		EObject object = petriNetFactory.create(petriNetClass);
		if (object instanceof PetriNet) {
			PetriNet petrinet = (PetriNet) object;
			PetriNetType netType = this.createPetriNetType(type);
			if (netType != null) {
				petrinet.setType(netType);
				return petrinet;
			}
		}
		return null;
	}
	

	// @generated NOT
	// @author eki
	public PetriNetType createPetriNetType() {
		EClass eClass = this.eClass();
		EPackage ePackage = eClass.getEPackage();
		EObject object = ePackage.getEFactoryInstance().create(eClass);
		if (object != null && object instanceof PetriNetType) {
			((PetriNetType) object).setURI(this.uri);
			return (PetriNetType) object;
		}
		return PnmlcoremodelFactory.eINSTANCE.createEmptyType();
	}

	// @generated NOT
	// @author ekki@dtu.dk
	public PetriNetType createPetriNetType(String type) {
		if (type.equals(this.toString())) {
			return createPetriNetType();
		}
		return null;
	}

	/**
	 * Returns a Petri net type's sub class of the corresponding PNML core model
	 * class and the given type of Petri net. A class with the same name takes priority, 
	 * then all classes are searched in the order as they occur in the package.If no
	 * sub-class exists in the package, the super types are investigated; if no
	 * sub-class is found, the class itself is returned.
	 *  
	 * @return the EClass which is a sub class of clazz
	 * 
	 * @generated NOT
	 * @author ekki@dtu.dk
	 */
	private static EClass getPetriNetTypeClass(EClass clazz, EClass typeClass) {
		if (PnmlcoremodelPackage.eINSTANCE.getPetriNetType().equals(typeClass) ||
				PnmlcoremodelPackage.eINSTANCE.getEmptyType().equals(typeClass) ||
				StructuredpntypemodelPackage.eINSTANCE.getStructuredPetriNetType().equals(typeClass)) {
			return clazz;
		}
		
		EPackage ePackage = typeClass.getEPackage();
		String clazzName = clazz.getName(); 
		EClassifier objectClass = ePackage.getEClassifier(clazzName);
		if (objectClass != null &&
				objectClass instanceof EClass &&
				clazz.isSuperTypeOf((EClass) objectClass)) {
			return (EClass) objectClass;
		}

		for (EClassifier classifier: ePackage.getEClassifiers()) {
			if (classifier != null &&
					classifier instanceof EClass &&
					clazz.isSuperTypeOf((EClass) classifier)) {
				return (EClass) classifier;
			}
		}
		
		EClass current = clazz;
		List<EClass> incomparableClasses = new ArrayList<EClass>();
		for(EClass superTypeClass: typeClass.getESuperTypes()) {
			if (PnmlcoremodelPackage.eINSTANCE.getPetriNetType().isSuperTypeOf(superTypeClass)) {
				if (!superTypeClass.isAbstract() && !superTypeClass.isInterface()) {
					EPackage superTypePackage = superTypeClass.getEPackage();
					EObject superType = null;
					try {
						superType = superTypePackage.getEFactoryInstance().create(superTypeClass);
					} catch (IllegalArgumentException e) {
						// TODO do proper error logging
						System.err.println("The Petri net type class " + superTypeClass.getName() +
								" could not be instantiated!"); 
					}
					if (superType instanceof PetriNetTypeImpl) {
						EClass superClazz = ((PetriNetTypeImpl) superType).getPetriNetTypeClass(clazz);
						if (current.isSuperTypeOf(superClazz)) {
							current = superClazz;
						} else if (!superClazz.isSuperTypeOf(current)) {
							incomparableClasses.add(superClazz);
						}
					} else {
						// TODO do proper error logging
						System.err.println("The Petri net type class " + superTypeClass.getName() +
								" does not implement PetriNetTypeImpl!"); 
					}
				} else {
					EClass superClazz = getPetriNetTypeClass(clazz, superTypeClass);
					if (current.isSuperTypeOf(superClazz)) {
						current = superClazz;
					} else if (!superClazz.isSuperTypeOf(current)) {
						incomparableClasses.add(superClazz);
					}
				}
			}
		}
		for (EClass other: incomparableClasses) {
			if (!other.isSuperTypeOf(current)) {
				// TODO do proper error logging
				System.err.println("Element classes of differnt supertypes are not compatible for type " + 
						typeClass.getName() + " and element type " + clazz.getName() + ": " +
						other.getName() + " and " + current.getName());
			}
		}
		return current;
	}

	/**
	 * Returns the Petri net type's sub class of the corresponding PNML core model class.
	 * A class with the same name takes priority, then all classes are searched in the
	 * order as they occur in the package. If no sub-class exists in the package, the
	 * super types of the Petri net type are investigated. 
	 *  
	 * @return the EClass which is a sub class of clazz
	 * 
	 * @generated NOT
	 * @author ekki@dtu.dk
	 */
	protected EClass getPetriNetTypeClass(EClass clazz) {
		EClass typeClass = this.eClass();
		return getPetriNetTypeClass(clazz, typeClass);
	}

	// @generated NOT
	// @author eki
	private EClass placeClass = null;
	
	// @generated NOT
	// @author eki
	final public Place createPlace() {
		if (placeClass == null) {
			placeClass = this.getPetriNetTypeClass(PnmlcoremodelPackage.eINSTANCE.getPlace());
		}
		
		EPackage ePackage = placeClass.getEPackage();
		EObject place = ePackage.getEFactoryInstance().create(placeClass);
		return (Place) place;
	}

	// @generated NOT
	// @author eki
	private EClass transitionClass = null;

	// @generated NOT
	// @author eki
	final public Transition createTransition() {
		if (transitionClass == null) {
			transitionClass = this.getPetriNetTypeClass(PnmlcoremodelPackage.eINSTANCE.getTransition());
		}

		EPackage ePackage = transitionClass.getEPackage();
		EObject transition = ePackage.getEFactoryInstance().create(transitionClass);
		return (Transition) transition;
	}

	// @generated NOT
	// @author eki
	private EClass arcClass = null;
	
	// @generated NOT
	// @author eki
	final public Arc createArc() {
		if (arcClass == null) {
			arcClass = this.getPetriNetTypeClass(PnmlcoremodelPackage.eINSTANCE.getArc());
		}

		EPackage ePackage = arcClass.getEPackage();
		EObject arc = ePackage.getEFactoryInstance().create(arcClass);
		return (Arc) arc;
	}

	// @generated NOT
	// @author eki
	private EClass pageClass = null;
	
	// @generated NOT
	// @author eki
	final public Page createPage() {
		if (pageClass == null) {
			pageClass = this.getPetriNetTypeClass(PnmlcoremodelPackage.eINSTANCE.getPage());
		}

		EPackage ePackage = pageClass.getEPackage();
		EObject page = ePackage.getEFactoryInstance().create(pageClass);
		return (Page) page;
	}

	// @generated NOT
	// @author eki
	private EClass refPlaceClass = null;
	
	// @generated NOT
	// @author eki
	final public RefPlace createRefPlace() {
		if (refPlaceClass == null) {
			refPlaceClass = this.getPetriNetTypeClass(PnmlcoremodelPackage.eINSTANCE.getRefPlace());
		}

		EPackage ePackage = refPlaceClass.getEPackage();
		EObject refPlace = ePackage.getEFactoryInstance().create(refPlaceClass);
		return (RefPlace) refPlace;
	}

	// @generated NOT
	// @author eki
	private EClass refTransitionClass = null;

	// @generated NOT
	// @author eki
	final public RefTransition createRefTransition() {
		if (refTransitionClass == null) {
			refTransitionClass = this.getPetriNetTypeClass(PnmlcoremodelPackage.eINSTANCE.getRefTransition());
		}

		EPackage ePackage = refTransitionClass.getEPackage();
		EObject refTransition = ePackage.getEFactoryInstance().create(refTransitionClass);
		return (RefTransition) refTransition;
	}

	@Override
	public void registerExtendedPNMLMetaData(ExtendedPNMLMetaData metadata) {
		// nothing
	}

	@Override
	public void registerPNMLMetaData(PNMLMetaData metadata) {
		EClass typeClass = this.eClass();
		EPackage ePackage =typeClass.getEPackage();
		for (EClassifier classifier: ePackage.getEClassifiers()) {
			if (classifier instanceof EClass) {
				EClass eClass = (EClass) classifier;
				if (PnmlcoremodelPackage.eINSTANCE.getLabel().isSuperTypeOf(eClass) && 
						!(StructuredpntypemodelPackage.eINSTANCE.getStructuredLabel()) .isSuperTypeOf(eClass) ) {
					// if there is a class that inherits from label, but is not a structural label
					EStructuralFeature feature = eClass.getEStructuralFeature("text");
					if (feature != null) {
						// and there is a text feature, then make this feature an XML Element feature
						metadata.setFeatureKind(feature, ExtendedMetaData.ELEMENT_FEATURE );
					}	
				}
			}
		}
	}

	// @generated NOT
	private String uri = null;
	
	// @generated NOT
	private boolean uriSet = false;
	
	/* 
	 * @see org.pnml.tools.epnk.pnmlcoremodel.PetriNetType#setURI(java.lang.String)
	 * @generated NOT
	 * @author ekki@dtu.dk
	 */
	@Override
	final public void setURI(String uri) {
		if (!uriSet) {
			uriSet = true;
			if(uri != null && uri.length() != 0) {
				this.uri = uri;
			}
		}
	}

	/* 
	 * @see org.pnml.tools.epnk.pnmlcoremodel.PetriNetType#getURI()
	 * @generated NOT
	 * @author ekki@dtu.dk
	 */
	@Override
	public String getURI() {
		if (uri != null && uri.length() != 0) {
			return uri;
		} else {
			return this.eClass().getEPackage().getNsURI();
		}
	}
	// @generated NOT
	@Override
	public String toString() {
		return getURI();
	}

} //PetriNetTypeImpl

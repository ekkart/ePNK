/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.cyclicenumerations.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.cyclicenumerations.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CyclicenumerationsFactoryImpl extends EFactoryImpl implements CyclicenumerationsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CyclicenumerationsFactory init() {
		try {
			CyclicenumerationsFactory theCyclicenumerationsFactory = (CyclicenumerationsFactory)EPackage.Registry.INSTANCE.getEFactory("http://org.pnml.tools/epnk/types/hlpngs/datatypes/cyclicenumerations"); 
			if (theCyclicenumerationsFactory != null) {
				return theCyclicenumerationsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CyclicenumerationsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CyclicenumerationsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CyclicenumerationsPackage.CYCLIC_ENUMERATION: return createCyclicEnumeration();
			case CyclicenumerationsPackage.SUCCESSOR: return createSuccessor();
			case CyclicenumerationsPackage.PREDECESSOR: return createPredecessor();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CyclicEnumeration createCyclicEnumeration() {
		CyclicEnumerationImpl cyclicEnumeration = new CyclicEnumerationImpl();
		return cyclicEnumeration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Successor createSuccessor() {
		SuccessorImpl successor = new SuccessorImpl();
		return successor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Predecessor createPredecessor() {
		PredecessorImpl predecessor = new PredecessorImpl();
		return predecessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CyclicenumerationsPackage getCyclicenumerationsPackage() {
		return (CyclicenumerationsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CyclicenumerationsPackage getPackage() {
		return CyclicenumerationsPackage.eINSTANCE;
	}

} //CyclicenumerationsFactoryImpl

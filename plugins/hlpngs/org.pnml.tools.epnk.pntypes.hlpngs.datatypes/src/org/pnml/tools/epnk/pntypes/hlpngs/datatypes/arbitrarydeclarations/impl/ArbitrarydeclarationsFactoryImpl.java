/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.arbitrarydeclarations.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.arbitrarydeclarations.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArbitrarydeclarationsFactoryImpl extends EFactoryImpl implements ArbitrarydeclarationsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ArbitrarydeclarationsFactory init() {
		try {
			ArbitrarydeclarationsFactory theArbitrarydeclarationsFactory = (ArbitrarydeclarationsFactory)EPackage.Registry.INSTANCE.getEFactory("http://org.pnml.tools/epnk/types/hlpngs/datatypes/arbitrarydeclarations"); 
			if (theArbitrarydeclarationsFactory != null) {
				return theArbitrarydeclarationsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ArbitrarydeclarationsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArbitrarydeclarationsFactoryImpl() {
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
			case ArbitrarydeclarationsPackage.ARBITRARY_SORT: return createArbitrarySort();
			case ArbitrarydeclarationsPackage.ARBITRARY_OPERATOR: return createArbitraryOperator();
			case ArbitrarydeclarationsPackage.UNPARSED: return createUnparsed();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArbitrarySort createArbitrarySort() {
		ArbitrarySortImpl arbitrarySort = new ArbitrarySortImpl();
		return arbitrarySort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArbitraryOperator createArbitraryOperator() {
		ArbitraryOperatorImpl arbitraryOperator = new ArbitraryOperatorImpl();
		return arbitraryOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unparsed createUnparsed() {
		UnparsedImpl unparsed = new UnparsedImpl();
		return unparsed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArbitrarydeclarationsPackage getArbitrarydeclarationsPackage() {
		return (ArbitrarydeclarationsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ArbitrarydeclarationsPackage getPackage() {
		return ArbitrarydeclarationsPackage.eINSTANCE;
	}

} //ArbitrarydeclarationsFactoryImpl

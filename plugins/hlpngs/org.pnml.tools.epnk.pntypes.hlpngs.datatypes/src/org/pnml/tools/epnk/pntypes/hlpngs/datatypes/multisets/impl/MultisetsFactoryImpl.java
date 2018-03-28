/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MultisetsFactoryImpl extends EFactoryImpl implements MultisetsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MultisetsFactory init() {
		try {
			MultisetsFactory theMultisetsFactory = (MultisetsFactory)EPackage.Registry.INSTANCE.getEFactory("http://org.pnml.tools/epnk/types/hlpngs/datatypes/multisets"); 
			if (theMultisetsFactory != null) {
				return theMultisetsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MultisetsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultisetsFactoryImpl() {
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
			case MultisetsPackage.CARDINALITY: return createCardinality();
			case MultisetsPackage.CARDINALITY_OF: return createCardinalityOf();
			case MultisetsPackage.CONTAINS: return createContains();
			case MultisetsPackage.ADD: return createAdd();
			case MultisetsPackage.ALL: return createAll();
			case MultisetsPackage.NUMBER_OF: return createNumberOf();
			case MultisetsPackage.SUBTRACT: return createSubtract();
			case MultisetsPackage.SCALAR_PRODUCT: return createScalarProduct();
			case MultisetsPackage.EMPTY: return createEmpty();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cardinality createCardinality() {
		CardinalityImpl cardinality = new CardinalityImpl();
		return cardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardinalityOf createCardinalityOf() {
		CardinalityOfImpl cardinalityOf = new CardinalityOfImpl();
		return cardinalityOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contains createContains() {
		ContainsImpl contains = new ContainsImpl();
		return contains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Add createAdd() {
		AddImpl add = new AddImpl();
		return add;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public All createAll() {
		AllImpl all = new AllImpl();
		return all;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberOf createNumberOf() {
		NumberOfImpl numberOf = new NumberOfImpl();
		return numberOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subtract createSubtract() {
		SubtractImpl subtract = new SubtractImpl();
		return subtract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScalarProduct createScalarProduct() {
		ScalarProductImpl scalarProduct = new ScalarProductImpl();
		return scalarProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Empty createEmpty() {
		EmptyImpl empty = new EmptyImpl();
		return empty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultisetsPackage getMultisetsPackage() {
		return (MultisetsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MultisetsPackage getPackage() {
		return MultisetsPackage.eINSTANCE;
	}

} //MultisetsFactoryImpl

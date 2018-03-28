/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FiniteintrangesFactoryImpl extends EFactoryImpl implements FiniteintrangesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FiniteintrangesFactory init() {
		try {
			FiniteintrangesFactory theFiniteintrangesFactory = (FiniteintrangesFactory)EPackage.Registry.INSTANCE.getEFactory("http://org.pnml.tools/epnk/types/hlpngs/datatypes/finiteintranges"); 
			if (theFiniteintrangesFactory != null) {
				return theFiniteintrangesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FiniteintrangesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FiniteintrangesFactoryImpl() {
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
			case FiniteintrangesPackage.FINITE_INT_RANGE: return createFiniteIntRange();
			case FiniteintrangesPackage.LESS_THAN: return createLessThan();
			case FiniteintrangesPackage.LESS_THAN_OR_EQUAL: return createLessThanOrEqual();
			case FiniteintrangesPackage.GREATER_THAN: return createGreaterThan();
			case FiniteintrangesPackage.GREATER_THAN_OR_EQUAL: return createGreaterThanOrEqual();
			case FiniteintrangesPackage.FINITE_INT_CONSTANT: return createFiniteIntConstant();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FiniteIntRange createFiniteIntRange() {
		FiniteIntRangeImpl finiteIntRange = new FiniteIntRangeImpl();
		return finiteIntRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LessThan createLessThan() {
		LessThanImpl lessThan = new LessThanImpl();
		return lessThan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LessThanOrEqual createLessThanOrEqual() {
		LessThanOrEqualImpl lessThanOrEqual = new LessThanOrEqualImpl();
		return lessThanOrEqual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GreaterThan createGreaterThan() {
		GreaterThanImpl greaterThan = new GreaterThanImpl();
		return greaterThan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GreaterThanOrEqual createGreaterThanOrEqual() {
		GreaterThanOrEqualImpl greaterThanOrEqual = new GreaterThanOrEqualImpl();
		return greaterThanOrEqual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FiniteIntConstant createFiniteIntConstant() {
		FiniteIntConstantImpl finiteIntConstant = new FiniteIntConstantImpl();
		return finiteIntConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FiniteintrangesPackage getFiniteintrangesPackage() {
		return (FiniteintrangesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FiniteintrangesPackage getPackage() {
		return FiniteintrangesPackage.eINSTANCE;
	}

} //FiniteintrangesFactoryImpl

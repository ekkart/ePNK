/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.Addition;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.Division;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.GreaterThan;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.GreaterThanOrEqual;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.IntegersFactory;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.IntegersPackage;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.LessThan;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.LessThanOrEqual;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.Modulo;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.Multiplication;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.Natural;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.NumberConstant;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.Positive;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.Subtraction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IntegersFactoryImpl extends EFactoryImpl implements IntegersFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IntegersFactory init() {
		try {
			IntegersFactory theIntegersFactory = (IntegersFactory)EPackage.Registry.INSTANCE.getEFactory("http://org.pnml.tools/epnk/types/hlpngs/datatypes/integers"); 
			if (theIntegersFactory != null) {
				return theIntegersFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IntegersFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegersFactoryImpl() {
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
			case IntegersPackage.ADDITION: return createAddition();
			case IntegersPackage.SUBTRACTION: return createSubtraction();
			case IntegersPackage.MULTIPLICATION: return createMultiplication();
			case IntegersPackage.DIVISION: return createDivision();
			case IntegersPackage.GREATER_THAN: return createGreaterThan();
			case IntegersPackage.GREATER_THAN_OR_EQUAL: return createGreaterThanOrEqual();
			case IntegersPackage.LESS_THAN: return createLessThan();
			case IntegersPackage.LESS_THAN_OR_EQUAL: return createLessThanOrEqual();
			case IntegersPackage.MODULO: return createModulo();
			case IntegersPackage.NUMBER_CONSTANT: return createNumberConstant();
			case IntegersPackage.NATURAL: return createNatural();
			case IntegersPackage.POSITIVE: return createPositive();
			case IntegersPackage.INTEGER: return createInteger();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Addition createAddition() {
		AdditionImpl addition = new AdditionImpl();
		return addition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subtraction createSubtraction() {
		SubtractionImpl subtraction = new SubtractionImpl();
		return subtraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Multiplication createMultiplication() {
		MultiplicationImpl multiplication = new MultiplicationImpl();
		return multiplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Division createDivision() {
		DivisionImpl division = new DivisionImpl();
		return division;
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
	public Modulo createModulo() {
		ModuloImpl modulo = new ModuloImpl();
		return modulo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberConstant createNumberConstant() {
		NumberConstantImpl numberConstant = new NumberConstantImpl();
		return numberConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Natural createNatural() {
		NaturalImpl natural = new NaturalImpl();
		return natural;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Positive createPositive() {
		PositiveImpl positive = new PositiveImpl();
		return positive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.Integer createInteger() {
		IntegerImpl integer = new IntegerImpl();
		return integer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegersPackage getIntegersPackage() {
		return (IntegersPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static IntegersPackage getPackage() {
		return IntegersPackage.eINSTANCE;
	}

} //IntegersFactoryImpl

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.Addition;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.Division;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.GreaterThan;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.GreaterThanOrEqual;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.IntegerOperator;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.IntegersPackage;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.LessThan;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.LessThanOrEqual;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.Modulo;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.Multiplication;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.Natural;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.NumberConstant;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.Positive;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.Subtraction;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.BuiltInConst;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.BuiltInOperator;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.BuiltInSort;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Operator;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Sort;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Term;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.IntegersPackage
 * @generated
 */
public class IntegersAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static IntegersPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegersAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = IntegersPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntegersSwitch<Adapter> modelSwitch =
		new IntegersSwitch<Adapter>() {
			@Override
			public Adapter caseIntegerOperator(IntegerOperator object) {
				return createIntegerOperatorAdapter();
			}
			@Override
			public Adapter caseAddition(Addition object) {
				return createAdditionAdapter();
			}
			@Override
			public Adapter caseSubtraction(Subtraction object) {
				return createSubtractionAdapter();
			}
			@Override
			public Adapter caseMultiplication(Multiplication object) {
				return createMultiplicationAdapter();
			}
			@Override
			public Adapter caseDivision(Division object) {
				return createDivisionAdapter();
			}
			@Override
			public Adapter caseGreaterThan(GreaterThan object) {
				return createGreaterThanAdapter();
			}
			@Override
			public Adapter caseGreaterThanOrEqual(GreaterThanOrEqual object) {
				return createGreaterThanOrEqualAdapter();
			}
			@Override
			public Adapter caseLessThan(LessThan object) {
				return createLessThanAdapter();
			}
			@Override
			public Adapter caseLessThanOrEqual(LessThanOrEqual object) {
				return createLessThanOrEqualAdapter();
			}
			@Override
			public Adapter caseModulo(Modulo object) {
				return createModuloAdapter();
			}
			@Override
			public Adapter caseNumber(org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.Number object) {
				return createNumberAdapter();
			}
			@Override
			public Adapter caseNumberConstant(NumberConstant object) {
				return createNumberConstantAdapter();
			}
			@Override
			public Adapter caseNatural(Natural object) {
				return createNaturalAdapter();
			}
			@Override
			public Adapter casePositive(Positive object) {
				return createPositiveAdapter();
			}
			@Override
			public Adapter caseInteger(org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.Integer object) {
				return createIntegerAdapter();
			}
			@Override
			public Adapter caseTerm(Term object) {
				return createTermAdapter();
			}
			@Override
			public Adapter caseOperator(Operator object) {
				return createOperatorAdapter();
			}
			@Override
			public Adapter caseBuiltInOperator(BuiltInOperator object) {
				return createBuiltInOperatorAdapter();
			}
			@Override
			public Adapter caseSort(Sort object) {
				return createSortAdapter();
			}
			@Override
			public Adapter caseBuiltInSort(BuiltInSort object) {
				return createBuiltInSortAdapter();
			}
			@Override
			public Adapter caseBuiltInConst(BuiltInConst object) {
				return createBuiltInConstAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.IntegerOperator <em>Integer Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.IntegerOperator
	 * @generated
	 */
	public Adapter createIntegerOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.Addition <em>Addition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.Addition
	 * @generated
	 */
	public Adapter createAdditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.Subtraction <em>Subtraction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.Subtraction
	 * @generated
	 */
	public Adapter createSubtractionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.Multiplication <em>Multiplication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.Multiplication
	 * @generated
	 */
	public Adapter createMultiplicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.Division <em>Division</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.Division
	 * @generated
	 */
	public Adapter createDivisionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.GreaterThan <em>Greater Than</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.GreaterThan
	 * @generated
	 */
	public Adapter createGreaterThanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.GreaterThanOrEqual <em>Greater Than Or Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.GreaterThanOrEqual
	 * @generated
	 */
	public Adapter createGreaterThanOrEqualAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.LessThan <em>Less Than</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.LessThan
	 * @generated
	 */
	public Adapter createLessThanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.LessThanOrEqual <em>Less Than Or Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.LessThanOrEqual
	 * @generated
	 */
	public Adapter createLessThanOrEqualAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.Modulo <em>Modulo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.Modulo
	 * @generated
	 */
	public Adapter createModuloAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.Number <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.Number
	 * @generated
	 */
	public Adapter createNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.NumberConstant <em>Number Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.NumberConstant
	 * @generated
	 */
	public Adapter createNumberConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.Natural <em>Natural</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.Natural
	 * @generated
	 */
	public Adapter createNaturalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.Positive <em>Positive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.Positive
	 * @generated
	 */
	public Adapter createPositiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.Integer <em>Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.Integer
	 * @generated
	 */
	public Adapter createIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Term <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Term
	 * @generated
	 */
	public Adapter createTermAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Operator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Operator
	 * @generated
	 */
	public Adapter createOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.BuiltInOperator <em>Built In Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.BuiltInOperator
	 * @generated
	 */
	public Adapter createBuiltInOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Sort <em>Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Sort
	 * @generated
	 */
	public Adapter createSortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.BuiltInSort <em>Built In Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.BuiltInSort
	 * @generated
	 */
	public Adapter createBuiltInSortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.BuiltInConst <em>Built In Const</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.BuiltInConst
	 * @generated
	 */
	public Adapter createBuiltInConstAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //IntegersAdapterFactory

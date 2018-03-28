/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges.*;

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
 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges.FiniteintrangesPackage
 * @generated
 */
public class FiniteintrangesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FiniteintrangesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FiniteintrangesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = FiniteintrangesPackage.eINSTANCE;
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
	protected FiniteintrangesSwitch<Adapter> modelSwitch =
		new FiniteintrangesSwitch<Adapter>() {
			@Override
			public Adapter caseFiniteIntRange(FiniteIntRange object) {
				return createFiniteIntRangeAdapter();
			}
			@Override
			public Adapter caseFiniteIntRangeOperator(FiniteIntRangeOperator object) {
				return createFiniteIntRangeOperatorAdapter();
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
			public Adapter caseGreaterThan(GreaterThan object) {
				return createGreaterThanAdapter();
			}
			@Override
			public Adapter caseGreaterThanOrEqual(GreaterThanOrEqual object) {
				return createGreaterThanOrEqualAdapter();
			}
			@Override
			public Adapter caseFiniteIntConstant(FiniteIntConstant object) {
				return createFiniteIntConstantAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges.FiniteIntRange <em>Finite Int Range</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges.FiniteIntRange
	 * @generated
	 */
	public Adapter createFiniteIntRangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges.FiniteIntRangeOperator <em>Finite Int Range Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges.FiniteIntRangeOperator
	 * @generated
	 */
	public Adapter createFiniteIntRangeOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges.LessThan <em>Less Than</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges.LessThan
	 * @generated
	 */
	public Adapter createLessThanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges.LessThanOrEqual <em>Less Than Or Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges.LessThanOrEqual
	 * @generated
	 */
	public Adapter createLessThanOrEqualAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges.GreaterThan <em>Greater Than</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges.GreaterThan
	 * @generated
	 */
	public Adapter createGreaterThanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges.GreaterThanOrEqual <em>Greater Than Or Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges.GreaterThanOrEqual
	 * @generated
	 */
	public Adapter createGreaterThanOrEqualAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges.FiniteIntConstant <em>Finite Int Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges.FiniteIntConstant
	 * @generated
	 */
	public Adapter createFiniteIntConstantAdapter() {
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

} //FiniteintrangesAdapterFactory

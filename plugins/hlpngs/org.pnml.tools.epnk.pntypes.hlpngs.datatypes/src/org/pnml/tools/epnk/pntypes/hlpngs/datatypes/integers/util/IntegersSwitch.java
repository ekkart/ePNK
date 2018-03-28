/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
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
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.IntegersPackage
 * @generated
 */
public class IntegersSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static IntegersPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegersSwitch() {
		if (modelPackage == null) {
			modelPackage = IntegersPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case IntegersPackage.INTEGER_OPERATOR: {
				IntegerOperator integerOperator = (IntegerOperator)theEObject;
				T result = caseIntegerOperator(integerOperator);
				if (result == null) result = caseBuiltInOperator(integerOperator);
				if (result == null) result = caseOperator(integerOperator);
				if (result == null) result = caseTerm(integerOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntegersPackage.ADDITION: {
				Addition addition = (Addition)theEObject;
				T result = caseAddition(addition);
				if (result == null) result = caseIntegerOperator(addition);
				if (result == null) result = caseBuiltInOperator(addition);
				if (result == null) result = caseOperator(addition);
				if (result == null) result = caseTerm(addition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntegersPackage.SUBTRACTION: {
				Subtraction subtraction = (Subtraction)theEObject;
				T result = caseSubtraction(subtraction);
				if (result == null) result = caseIntegerOperator(subtraction);
				if (result == null) result = caseBuiltInOperator(subtraction);
				if (result == null) result = caseOperator(subtraction);
				if (result == null) result = caseTerm(subtraction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntegersPackage.MULTIPLICATION: {
				Multiplication multiplication = (Multiplication)theEObject;
				T result = caseMultiplication(multiplication);
				if (result == null) result = caseIntegerOperator(multiplication);
				if (result == null) result = caseBuiltInOperator(multiplication);
				if (result == null) result = caseOperator(multiplication);
				if (result == null) result = caseTerm(multiplication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntegersPackage.DIVISION: {
				Division division = (Division)theEObject;
				T result = caseDivision(division);
				if (result == null) result = caseIntegerOperator(division);
				if (result == null) result = caseBuiltInOperator(division);
				if (result == null) result = caseOperator(division);
				if (result == null) result = caseTerm(division);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntegersPackage.GREATER_THAN: {
				GreaterThan greaterThan = (GreaterThan)theEObject;
				T result = caseGreaterThan(greaterThan);
				if (result == null) result = caseIntegerOperator(greaterThan);
				if (result == null) result = caseBuiltInOperator(greaterThan);
				if (result == null) result = caseOperator(greaterThan);
				if (result == null) result = caseTerm(greaterThan);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntegersPackage.GREATER_THAN_OR_EQUAL: {
				GreaterThanOrEqual greaterThanOrEqual = (GreaterThanOrEqual)theEObject;
				T result = caseGreaterThanOrEqual(greaterThanOrEqual);
				if (result == null) result = caseIntegerOperator(greaterThanOrEqual);
				if (result == null) result = caseBuiltInOperator(greaterThanOrEqual);
				if (result == null) result = caseOperator(greaterThanOrEqual);
				if (result == null) result = caseTerm(greaterThanOrEqual);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntegersPackage.LESS_THAN: {
				LessThan lessThan = (LessThan)theEObject;
				T result = caseLessThan(lessThan);
				if (result == null) result = caseIntegerOperator(lessThan);
				if (result == null) result = caseBuiltInOperator(lessThan);
				if (result == null) result = caseOperator(lessThan);
				if (result == null) result = caseTerm(lessThan);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntegersPackage.LESS_THAN_OR_EQUAL: {
				LessThanOrEqual lessThanOrEqual = (LessThanOrEqual)theEObject;
				T result = caseLessThanOrEqual(lessThanOrEqual);
				if (result == null) result = caseIntegerOperator(lessThanOrEqual);
				if (result == null) result = caseBuiltInOperator(lessThanOrEqual);
				if (result == null) result = caseOperator(lessThanOrEqual);
				if (result == null) result = caseTerm(lessThanOrEqual);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntegersPackage.MODULO: {
				Modulo modulo = (Modulo)theEObject;
				T result = caseModulo(modulo);
				if (result == null) result = caseIntegerOperator(modulo);
				if (result == null) result = caseBuiltInOperator(modulo);
				if (result == null) result = caseOperator(modulo);
				if (result == null) result = caseTerm(modulo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntegersPackage.NUMBER: {
				org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.Number number = (org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.Number)theEObject;
				T result = caseNumber(number);
				if (result == null) result = caseBuiltInSort(number);
				if (result == null) result = caseSort(number);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntegersPackage.NUMBER_CONSTANT: {
				NumberConstant numberConstant = (NumberConstant)theEObject;
				T result = caseNumberConstant(numberConstant);
				if (result == null) result = caseBuiltInConst(numberConstant);
				if (result == null) result = caseOperator(numberConstant);
				if (result == null) result = caseTerm(numberConstant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntegersPackage.NATURAL: {
				Natural natural = (Natural)theEObject;
				T result = caseNatural(natural);
				if (result == null) result = caseNumber(natural);
				if (result == null) result = caseBuiltInSort(natural);
				if (result == null) result = caseSort(natural);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntegersPackage.POSITIVE: {
				Positive positive = (Positive)theEObject;
				T result = casePositive(positive);
				if (result == null) result = caseNumber(positive);
				if (result == null) result = caseBuiltInSort(positive);
				if (result == null) result = caseSort(positive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntegersPackage.INTEGER: {
				org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.Integer integer = (org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.Integer)theEObject;
				T result = caseInteger(integer);
				if (result == null) result = caseNumber(integer);
				if (result == null) result = caseBuiltInSort(integer);
				if (result == null) result = caseSort(integer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerOperator(IntegerOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Addition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Addition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddition(Addition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subtraction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subtraction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubtraction(Subtraction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiplication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiplication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiplication(Multiplication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Division</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Division</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDivision(Division object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Greater Than</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Greater Than</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGreaterThan(GreaterThan object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Greater Than Or Equal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Greater Than Or Equal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGreaterThanOrEqual(GreaterThanOrEqual object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Less Than</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Less Than</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLessThan(LessThan object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Less Than Or Equal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Less Than Or Equal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLessThanOrEqual(LessThanOrEqual object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modulo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modulo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModulo(Modulo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumber(org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.Number object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumberConstant(NumberConstant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Natural</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Natural</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNatural(Natural object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Positive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Positive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePositive(Positive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteger(org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.Integer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Term</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Term</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerm(Term object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperator(Operator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Built In Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Built In Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuiltInOperator(BuiltInOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sort</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sort</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSort(Sort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Built In Sort</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Built In Sort</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuiltInSort(BuiltInSort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Built In Const</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Built In Const</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuiltInConst(BuiltInConst object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //IntegersSwitch

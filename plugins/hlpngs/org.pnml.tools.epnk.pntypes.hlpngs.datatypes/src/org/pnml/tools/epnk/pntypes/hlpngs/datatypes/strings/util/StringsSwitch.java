/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.Append;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.Concatenation;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.GreaterThan;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.GreaterThanOrEqual;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.Length;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.LessThan;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.LessThanOrEqual;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.StringConstant;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.StringOperator;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.StringsPackage;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.Substring;

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
 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.StringsPackage
 * @generated
 */
public class StringsSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StringsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringsSwitch() {
		if (modelPackage == null) {
			modelPackage = StringsPackage.eINSTANCE;
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
			case StringsPackage.STRING: {
				org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.String string = (org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.String)theEObject;
				T result = caseString(string);
				if (result == null) result = caseBuiltInSort(string);
				if (result == null) result = caseSort(string);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StringsPackage.STRING_OPERATOR: {
				StringOperator stringOperator = (StringOperator)theEObject;
				T result = caseStringOperator(stringOperator);
				if (result == null) result = caseBuiltInOperator(stringOperator);
				if (result == null) result = caseOperator(stringOperator);
				if (result == null) result = caseTerm(stringOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StringsPackage.STRING_CONSTANT: {
				StringConstant stringConstant = (StringConstant)theEObject;
				T result = caseStringConstant(stringConstant);
				if (result == null) result = caseBuiltInConst(stringConstant);
				if (result == null) result = caseOperator(stringConstant);
				if (result == null) result = caseTerm(stringConstant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StringsPackage.SUBSTRING: {
				Substring substring = (Substring)theEObject;
				T result = caseSubstring(substring);
				if (result == null) result = caseStringOperator(substring);
				if (result == null) result = caseBuiltInOperator(substring);
				if (result == null) result = caseOperator(substring);
				if (result == null) result = caseTerm(substring);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StringsPackage.CONCATENATION: {
				Concatenation concatenation = (Concatenation)theEObject;
				T result = caseConcatenation(concatenation);
				if (result == null) result = caseStringOperator(concatenation);
				if (result == null) result = caseBuiltInOperator(concatenation);
				if (result == null) result = caseOperator(concatenation);
				if (result == null) result = caseTerm(concatenation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StringsPackage.APPEND: {
				Append append = (Append)theEObject;
				T result = caseAppend(append);
				if (result == null) result = caseStringOperator(append);
				if (result == null) result = caseBuiltInOperator(append);
				if (result == null) result = caseOperator(append);
				if (result == null) result = caseTerm(append);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StringsPackage.LENGTH: {
				Length length = (Length)theEObject;
				T result = caseLength(length);
				if (result == null) result = caseStringOperator(length);
				if (result == null) result = caseBuiltInOperator(length);
				if (result == null) result = caseOperator(length);
				if (result == null) result = caseTerm(length);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StringsPackage.GREATER_THAN: {
				GreaterThan greaterThan = (GreaterThan)theEObject;
				T result = caseGreaterThan(greaterThan);
				if (result == null) result = caseStringOperator(greaterThan);
				if (result == null) result = caseBuiltInOperator(greaterThan);
				if (result == null) result = caseOperator(greaterThan);
				if (result == null) result = caseTerm(greaterThan);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StringsPackage.GREATER_THAN_OR_EQUAL: {
				GreaterThanOrEqual greaterThanOrEqual = (GreaterThanOrEqual)theEObject;
				T result = caseGreaterThanOrEqual(greaterThanOrEqual);
				if (result == null) result = caseStringOperator(greaterThanOrEqual);
				if (result == null) result = caseBuiltInOperator(greaterThanOrEqual);
				if (result == null) result = caseOperator(greaterThanOrEqual);
				if (result == null) result = caseTerm(greaterThanOrEqual);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StringsPackage.LESS_THAN: {
				LessThan lessThan = (LessThan)theEObject;
				T result = caseLessThan(lessThan);
				if (result == null) result = caseStringOperator(lessThan);
				if (result == null) result = caseBuiltInOperator(lessThan);
				if (result == null) result = caseOperator(lessThan);
				if (result == null) result = caseTerm(lessThan);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StringsPackage.LESS_THAN_OR_EQUAL: {
				LessThanOrEqual lessThanOrEqual = (LessThanOrEqual)theEObject;
				T result = caseLessThanOrEqual(lessThanOrEqual);
				if (result == null) result = caseStringOperator(lessThanOrEqual);
				if (result == null) result = caseBuiltInOperator(lessThanOrEqual);
				if (result == null) result = caseOperator(lessThanOrEqual);
				if (result == null) result = caseTerm(lessThanOrEqual);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseString(org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.String object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringOperator(StringOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringConstant(StringConstant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substring</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substring</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstring(Substring object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concatenation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concatenation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConcatenation(Concatenation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Append</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Append</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAppend(Append object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Length</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Length</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLength(Length object) {
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

} //StringsSwitch

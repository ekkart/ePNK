/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.pnml.tools.epnk.datatypes.pnmldatatypes.PnmldatatypesPackage;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.BooleansPackage;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.dots.DotsPackage;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.IntegersPackage;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.MultisetsPackage;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.Append;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.Concatenation;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.GreaterThan;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.GreaterThanOrEqual;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.Length;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.LessThan;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.LessThanOrEqual;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.StringConstant;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.StringOperator;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.StringsFactory;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.StringsPackage;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.Substring;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.TermsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StringsPackageImpl extends EPackageImpl implements StringsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringConstantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass substringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concatenationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass appendEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lengthEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass greaterThanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass greaterThanOrEqualEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lessThanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lessThanOrEqualEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.StringsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StringsPackageImpl() {
		super(eNS_URI, StringsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link StringsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StringsPackage init() {
		if (isInited) return (StringsPackage)EPackage.Registry.INSTANCE.getEPackage(StringsPackage.eNS_URI);

		// Obtain or create and register package
		StringsPackageImpl theStringsPackage = (StringsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof StringsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new StringsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TermsPackage.eINSTANCE.eClass();
		DotsPackage.eINSTANCE.eClass();
		MultisetsPackage.eINSTANCE.eClass();
		BooleansPackage.eINSTANCE.eClass();
		IntegersPackage.eINSTANCE.eClass();
		PnmldatatypesPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theStringsPackage.createPackageContents();

		// Initialize created meta-data
		theStringsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStringsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StringsPackage.eNS_URI, theStringsPackage);
		return theStringsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getString() {
		return stringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringOperator() {
		return stringOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringConstant() {
		return stringConstantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringConstant_Value() {
		return (EAttribute)stringConstantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubstring() {
		return substringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubstring_Start() {
		return (EAttribute)substringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubstring_Length() {
		return (EAttribute)substringEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConcatenation() {
		return concatenationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAppend() {
		return appendEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLength() {
		return lengthEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGreaterThan() {
		return greaterThanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGreaterThanOrEqual() {
		return greaterThanOrEqualEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLessThan() {
		return lessThanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLessThanOrEqual() {
		return lessThanOrEqualEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringsFactory getStringsFactory() {
		return (StringsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		stringEClass = createEClass(STRING);

		stringOperatorEClass = createEClass(STRING_OPERATOR);

		stringConstantEClass = createEClass(STRING_CONSTANT);
		createEAttribute(stringConstantEClass, STRING_CONSTANT__VALUE);

		substringEClass = createEClass(SUBSTRING);
		createEAttribute(substringEClass, SUBSTRING__START);
		createEAttribute(substringEClass, SUBSTRING__LENGTH);

		concatenationEClass = createEClass(CONCATENATION);

		appendEClass = createEClass(APPEND);

		lengthEClass = createEClass(LENGTH);

		greaterThanEClass = createEClass(GREATER_THAN);

		greaterThanOrEqualEClass = createEClass(GREATER_THAN_OR_EQUAL);

		lessThanEClass = createEClass(LESS_THAN);

		lessThanOrEqualEClass = createEClass(LESS_THAN_OR_EQUAL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		TermsPackage theTermsPackage = (TermsPackage)EPackage.Registry.INSTANCE.getEPackage(TermsPackage.eNS_URI);
		PnmldatatypesPackage thePnmldatatypesPackage = (PnmldatatypesPackage)EPackage.Registry.INSTANCE.getEPackage(PnmldatatypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		stringEClass.getESuperTypes().add(theTermsPackage.getBuiltInSort());
		stringOperatorEClass.getESuperTypes().add(theTermsPackage.getBuiltInOperator());
		stringConstantEClass.getESuperTypes().add(theTermsPackage.getBuiltInConst());
		substringEClass.getESuperTypes().add(this.getStringOperator());
		concatenationEClass.getESuperTypes().add(this.getStringOperator());
		appendEClass.getESuperTypes().add(this.getStringOperator());
		lengthEClass.getESuperTypes().add(this.getStringOperator());
		greaterThanEClass.getESuperTypes().add(this.getStringOperator());
		greaterThanOrEqualEClass.getESuperTypes().add(this.getStringOperator());
		lessThanEClass.getESuperTypes().add(this.getStringOperator());
		lessThanOrEqualEClass.getESuperTypes().add(this.getStringOperator());

		// Initialize classes and features; add operations and parameters
		initEClass(stringEClass, org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.String.class, "String", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stringOperatorEClass, StringOperator.class, "StringOperator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stringConstantEClass, StringConstant.class, "StringConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringConstant_Value(), ecorePackage.getEString(), "value", "", 1, 1, StringConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(substringEClass, Substring.class, "Substring", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubstring_Start(), thePnmldatatypesPackage.getNonNegativeInteger(), "start", "0", 1, 1, Substring.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubstring_Length(), thePnmldatatypesPackage.getNonNegativeInteger(), "length", "0", 1, 1, Substring.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(concatenationEClass, Concatenation.class, "Concatenation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(appendEClass, Append.class, "Append", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lengthEClass, Length.class, "Length", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(greaterThanEClass, GreaterThan.class, "GreaterThan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(greaterThanOrEqualEClass, GreaterThanOrEqual.class, "GreaterThanOrEqual", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lessThanEClass, LessThan.class, "LessThan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lessThanOrEqualEClass, LessThanOrEqual.class, "LessThanOrEqual", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //StringsPackageImpl

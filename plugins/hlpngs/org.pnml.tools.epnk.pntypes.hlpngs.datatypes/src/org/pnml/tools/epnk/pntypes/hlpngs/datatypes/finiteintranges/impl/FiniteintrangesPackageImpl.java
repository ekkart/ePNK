/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.BooleansPackage;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.dots.DotsPackage;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges.FiniteIntConstant;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges.FiniteIntRange;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges.FiniteIntRangeOperator;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges.FiniteintrangesFactory;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges.FiniteintrangesPackage;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges.GreaterThan;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges.GreaterThanOrEqual;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges.LessThan;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges.LessThanOrEqual;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.IntegersPackage;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.MultisetsPackage;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.TermsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FiniteintrangesPackageImpl extends EPackageImpl implements FiniteintrangesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finiteIntRangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finiteIntRangeOperatorEClass = null;

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
	private EClass finiteIntConstantEClass = null;

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
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteintranges.FiniteintrangesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FiniteintrangesPackageImpl() {
		super(eNS_URI, FiniteintrangesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link FiniteintrangesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FiniteintrangesPackage init() {
		if (isInited) return (FiniteintrangesPackage)EPackage.Registry.INSTANCE.getEPackage(FiniteintrangesPackage.eNS_URI);

		// Obtain or create and register package
		FiniteintrangesPackageImpl theFiniteintrangesPackage = (FiniteintrangesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FiniteintrangesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FiniteintrangesPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TermsPackage.eINSTANCE.eClass();
		DotsPackage.eINSTANCE.eClass();
		MultisetsPackage.eINSTANCE.eClass();
		BooleansPackage.eINSTANCE.eClass();
		IntegersPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theFiniteintrangesPackage.createPackageContents();

		// Initialize created meta-data
		theFiniteintrangesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFiniteintrangesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FiniteintrangesPackage.eNS_URI, theFiniteintrangesPackage);
		return theFiniteintrangesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFiniteIntRange() {
		return finiteIntRangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFiniteIntRange_Start() {
		return (EAttribute)finiteIntRangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFiniteIntRange_End() {
		return (EAttribute)finiteIntRangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFiniteIntRangeOperator() {
		return finiteIntRangeOperatorEClass;
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
	public EClass getFiniteIntConstant() {
		return finiteIntConstantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFiniteIntConstant_Value() {
		return (EAttribute)finiteIntConstantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFiniteIntConstant_Range() {
		return (EReference)finiteIntConstantEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FiniteintrangesFactory getFiniteintrangesFactory() {
		return (FiniteintrangesFactory)getEFactoryInstance();
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
		finiteIntRangeEClass = createEClass(FINITE_INT_RANGE);
		createEAttribute(finiteIntRangeEClass, FINITE_INT_RANGE__START);
		createEAttribute(finiteIntRangeEClass, FINITE_INT_RANGE__END);

		finiteIntRangeOperatorEClass = createEClass(FINITE_INT_RANGE_OPERATOR);

		lessThanEClass = createEClass(LESS_THAN);

		lessThanOrEqualEClass = createEClass(LESS_THAN_OR_EQUAL);

		greaterThanEClass = createEClass(GREATER_THAN);

		greaterThanOrEqualEClass = createEClass(GREATER_THAN_OR_EQUAL);

		finiteIntConstantEClass = createEClass(FINITE_INT_CONSTANT);
		createEAttribute(finiteIntConstantEClass, FINITE_INT_CONSTANT__VALUE);
		createEReference(finiteIntConstantEClass, FINITE_INT_CONSTANT__RANGE);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		finiteIntRangeEClass.getESuperTypes().add(theTermsPackage.getBuiltInSort());
		finiteIntRangeOperatorEClass.getESuperTypes().add(theTermsPackage.getBuiltInOperator());
		lessThanEClass.getESuperTypes().add(this.getFiniteIntRangeOperator());
		lessThanOrEqualEClass.getESuperTypes().add(this.getFiniteIntRangeOperator());
		greaterThanEClass.getESuperTypes().add(this.getFiniteIntRangeOperator());
		greaterThanOrEqualEClass.getESuperTypes().add(this.getFiniteIntRangeOperator());
		finiteIntConstantEClass.getESuperTypes().add(theTermsPackage.getBuiltInConst());

		// Initialize classes and features; add operations and parameters
		initEClass(finiteIntRangeEClass, FiniteIntRange.class, "FiniteIntRange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFiniteIntRange_Start(), ecorePackage.getEInt(), "start", "0", 1, 1, FiniteIntRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFiniteIntRange_End(), ecorePackage.getEInt(), "end", "0", 1, 1, FiniteIntRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(finiteIntRangeOperatorEClass, FiniteIntRangeOperator.class, "FiniteIntRangeOperator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lessThanEClass, LessThan.class, "LessThan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lessThanOrEqualEClass, LessThanOrEqual.class, "LessThanOrEqual", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(greaterThanEClass, GreaterThan.class, "GreaterThan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(greaterThanOrEqualEClass, GreaterThanOrEqual.class, "GreaterThanOrEqual", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(finiteIntConstantEClass, FiniteIntConstant.class, "FiniteIntConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFiniteIntConstant_Value(), ecorePackage.getEInt(), "value", "0", 1, 1, FiniteIntConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFiniteIntConstant_Range(), this.getFiniteIntRange(), null, "range", null, 1, 1, FiniteIntConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //FiniteintrangesPackageImpl

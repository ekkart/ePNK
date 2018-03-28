/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.And;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.Bool;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.BooleanConstant;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.BooleanOperator;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.BooleansFactory;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.BooleansPackage;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.Equality;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.Imply;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.Inequality;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.Not;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.Or;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.dots.DotsPackage;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.dots.impl.DotsPackageImpl;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.IntegersPackage;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.impl.IntegersPackageImpl;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.MultisetsPackage;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.impl.MultisetsPackageImpl;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.TermsPackage;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.TermsPackageImpl;
import org.pnml.tools.epnk.structuredpntypemodel.StructuredpntypemodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BooleansPackageImpl extends EPackageImpl implements BooleansPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equalityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inequalityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanConstantEClass = null;

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
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.BooleansPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BooleansPackageImpl() {
		super(eNS_URI, BooleansFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link BooleansPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BooleansPackage init() {
		if (isInited) return (BooleansPackage)EPackage.Registry.INSTANCE.getEPackage(BooleansPackage.eNS_URI);

		// Obtain or create and register package
		BooleansPackageImpl theBooleansPackage = (BooleansPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BooleansPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BooleansPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		StructuredpntypemodelPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		TermsPackageImpl theTermsPackage = (TermsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TermsPackage.eNS_URI) instanceof TermsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TermsPackage.eNS_URI) : TermsPackage.eINSTANCE);
		DotsPackageImpl theDotsPackage = (DotsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DotsPackage.eNS_URI) instanceof DotsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DotsPackage.eNS_URI) : DotsPackage.eINSTANCE);
		MultisetsPackageImpl theMultisetsPackage = (MultisetsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MultisetsPackage.eNS_URI) instanceof MultisetsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MultisetsPackage.eNS_URI) : MultisetsPackage.eINSTANCE);
		IntegersPackageImpl theIntegersPackage = (IntegersPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IntegersPackage.eNS_URI) instanceof IntegersPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IntegersPackage.eNS_URI) : IntegersPackage.eINSTANCE);

		// Create package meta-data objects
		theBooleansPackage.createPackageContents();
		theTermsPackage.createPackageContents();
		theDotsPackage.createPackageContents();
		theMultisetsPackage.createPackageContents();
		theIntegersPackage.createPackageContents();

		// Initialize created meta-data
		theBooleansPackage.initializePackageContents();
		theTermsPackage.initializePackageContents();
		theDotsPackage.initializePackageContents();
		theMultisetsPackage.initializePackageContents();
		theIntegersPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBooleansPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BooleansPackage.eNS_URI, theBooleansPackage);
		return theBooleansPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEquality() {
		return equalityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInequality() {
		return inequalityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBool() {
		return boolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanOperator() {
		return booleanOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOr() {
		return orEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnd() {
		return andEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImply() {
		return implyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNot() {
		return notEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanConstant() {
		return booleanConstantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanConstant_Value() {
		return (EAttribute)booleanConstantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleansFactory getBooleansFactory() {
		return (BooleansFactory)getEFactoryInstance();
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
		equalityEClass = createEClass(EQUALITY);

		inequalityEClass = createEClass(INEQUALITY);

		boolEClass = createEClass(BOOL);

		booleanOperatorEClass = createEClass(BOOLEAN_OPERATOR);

		orEClass = createEClass(OR);

		andEClass = createEClass(AND);

		implyEClass = createEClass(IMPLY);

		notEClass = createEClass(NOT);

		booleanConstantEClass = createEClass(BOOLEAN_CONSTANT);
		createEAttribute(booleanConstantEClass, BOOLEAN_CONSTANT__VALUE);
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
		equalityEClass.getESuperTypes().add(theTermsPackage.getBuiltInOperator());
		inequalityEClass.getESuperTypes().add(theTermsPackage.getBuiltInOperator());
		boolEClass.getESuperTypes().add(theTermsPackage.getBuiltInSort());
		booleanOperatorEClass.getESuperTypes().add(theTermsPackage.getBuiltInOperator());
		orEClass.getESuperTypes().add(this.getBooleanOperator());
		andEClass.getESuperTypes().add(this.getBooleanOperator());
		implyEClass.getESuperTypes().add(this.getBooleanOperator());
		notEClass.getESuperTypes().add(this.getBooleanOperator());
		booleanConstantEClass.getESuperTypes().add(theTermsPackage.getBuiltInConst());

		// Initialize classes and features; add operations and parameters
		initEClass(equalityEClass, Equality.class, "Equality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(inequalityEClass, Inequality.class, "Inequality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(boolEClass, Bool.class, "Bool", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(booleanOperatorEClass, BooleanOperator.class, "BooleanOperator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(orEClass, Or.class, "Or", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(andEClass, And.class, "And", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(implyEClass, Imply.class, "Imply", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(notEClass, Not.class, "Not", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(booleanConstantEClass, BooleanConstant.class, "BooleanConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanConstant_Value(), ecorePackage.getEBoolean(), "value", "false", 1, 1, BooleanConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //BooleansPackageImpl

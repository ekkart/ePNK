/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.BooleansPackage;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.impl.BooleansPackageImpl;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.dots.DotsPackage;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.dots.impl.DotsPackageImpl;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.Addition;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.Division;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.GreaterThan;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.GreaterThanOrEqual;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.IntegerOperator;
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
public class IntegersPackageImpl extends EPackageImpl implements IntegersPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass additionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subtractionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiplicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass divisionEClass = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduloEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numberConstantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass naturalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass positiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerEClass = null;

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
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.IntegersPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private IntegersPackageImpl() {
		super(eNS_URI, IntegersFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link IntegersPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static IntegersPackage init() {
		if (isInited) return (IntegersPackage)EPackage.Registry.INSTANCE.getEPackage(IntegersPackage.eNS_URI);

		// Obtain or create and register package
		IntegersPackageImpl theIntegersPackage = (IntegersPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof IntegersPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new IntegersPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		StructuredpntypemodelPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		TermsPackageImpl theTermsPackage = (TermsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TermsPackage.eNS_URI) instanceof TermsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TermsPackage.eNS_URI) : TermsPackage.eINSTANCE);
		DotsPackageImpl theDotsPackage = (DotsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DotsPackage.eNS_URI) instanceof DotsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DotsPackage.eNS_URI) : DotsPackage.eINSTANCE);
		MultisetsPackageImpl theMultisetsPackage = (MultisetsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MultisetsPackage.eNS_URI) instanceof MultisetsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MultisetsPackage.eNS_URI) : MultisetsPackage.eINSTANCE);
		BooleansPackageImpl theBooleansPackage = (BooleansPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BooleansPackage.eNS_URI) instanceof BooleansPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BooleansPackage.eNS_URI) : BooleansPackage.eINSTANCE);

		// Create package meta-data objects
		theIntegersPackage.createPackageContents();
		theTermsPackage.createPackageContents();
		theDotsPackage.createPackageContents();
		theMultisetsPackage.createPackageContents();
		theBooleansPackage.createPackageContents();

		// Initialize created meta-data
		theIntegersPackage.initializePackageContents();
		theTermsPackage.initializePackageContents();
		theDotsPackage.initializePackageContents();
		theMultisetsPackage.initializePackageContents();
		theBooleansPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theIntegersPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(IntegersPackage.eNS_URI, theIntegersPackage);
		return theIntegersPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerOperator() {
		return integerOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddition() {
		return additionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubtraction() {
		return subtractionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiplication() {
		return multiplicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDivision() {
		return divisionEClass;
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
	public EClass getModulo() {
		return moduloEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumber() {
		return numberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumberConstant() {
		return numberConstantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNumberConstant_Type() {
		return (EReference)numberConstantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberConstant_Value() {
		return (EAttribute)numberConstantEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNatural() {
		return naturalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPositive() {
		return positiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteger() {
		return integerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegersFactory getIntegersFactory() {
		return (IntegersFactory)getEFactoryInstance();
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
		integerOperatorEClass = createEClass(INTEGER_OPERATOR);

		additionEClass = createEClass(ADDITION);

		subtractionEClass = createEClass(SUBTRACTION);

		multiplicationEClass = createEClass(MULTIPLICATION);

		divisionEClass = createEClass(DIVISION);

		greaterThanEClass = createEClass(GREATER_THAN);

		greaterThanOrEqualEClass = createEClass(GREATER_THAN_OR_EQUAL);

		lessThanEClass = createEClass(LESS_THAN);

		lessThanOrEqualEClass = createEClass(LESS_THAN_OR_EQUAL);

		moduloEClass = createEClass(MODULO);

		numberEClass = createEClass(NUMBER);

		numberConstantEClass = createEClass(NUMBER_CONSTANT);
		createEReference(numberConstantEClass, NUMBER_CONSTANT__TYPE);
		createEAttribute(numberConstantEClass, NUMBER_CONSTANT__VALUE);

		naturalEClass = createEClass(NATURAL);

		positiveEClass = createEClass(POSITIVE);

		integerEClass = createEClass(INTEGER);
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
		integerOperatorEClass.getESuperTypes().add(theTermsPackage.getBuiltInOperator());
		additionEClass.getESuperTypes().add(this.getIntegerOperator());
		subtractionEClass.getESuperTypes().add(this.getIntegerOperator());
		multiplicationEClass.getESuperTypes().add(this.getIntegerOperator());
		divisionEClass.getESuperTypes().add(this.getIntegerOperator());
		greaterThanEClass.getESuperTypes().add(this.getIntegerOperator());
		greaterThanOrEqualEClass.getESuperTypes().add(this.getIntegerOperator());
		lessThanEClass.getESuperTypes().add(this.getIntegerOperator());
		lessThanOrEqualEClass.getESuperTypes().add(this.getIntegerOperator());
		moduloEClass.getESuperTypes().add(this.getIntegerOperator());
		numberEClass.getESuperTypes().add(theTermsPackage.getBuiltInSort());
		numberConstantEClass.getESuperTypes().add(theTermsPackage.getBuiltInConst());
		naturalEClass.getESuperTypes().add(this.getNumber());
		positiveEClass.getESuperTypes().add(this.getNumber());
		integerEClass.getESuperTypes().add(this.getNumber());

		// Initialize classes and features; add operations and parameters
		initEClass(integerOperatorEClass, IntegerOperator.class, "IntegerOperator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(additionEClass, Addition.class, "Addition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(subtractionEClass, Subtraction.class, "Subtraction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(multiplicationEClass, Multiplication.class, "Multiplication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(divisionEClass, Division.class, "Division", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(greaterThanEClass, GreaterThan.class, "GreaterThan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(greaterThanOrEqualEClass, GreaterThanOrEqual.class, "GreaterThanOrEqual", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lessThanEClass, LessThan.class, "LessThan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lessThanOrEqualEClass, LessThanOrEqual.class, "LessThanOrEqual", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(moduloEClass, Modulo.class, "Modulo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(numberEClass, org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.Number.class, "Number", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(numberConstantEClass, NumberConstant.class, "NumberConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNumberConstant_Type(), this.getNumber(), null, "type", null, 1, 1, NumberConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNumberConstant_Value(), ecorePackage.getEInt(), "value", "0", 1, 1, NumberConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(naturalEClass, Natural.class, "Natural", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(positiveEClass, Positive.class, "Positive", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(integerEClass, org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.Integer.class, "Integer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //IntegersPackageImpl

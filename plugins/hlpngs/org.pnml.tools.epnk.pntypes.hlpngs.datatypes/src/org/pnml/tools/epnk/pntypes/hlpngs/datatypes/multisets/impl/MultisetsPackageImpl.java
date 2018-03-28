/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.BooleansPackage;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.impl.BooleansPackageImpl;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.dots.DotsPackage;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.dots.impl.DotsPackageImpl;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.IntegersPackage;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.impl.IntegersPackageImpl;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.Add;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.All;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.Cardinality;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.CardinalityOf;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.Contains;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.Empty;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.MultisetsFactory;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.MultisetsPackage;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.NumberOf;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.ScalarProduct;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.Subtract;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.TermsPackage;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.TermsPackageImpl;
import org.pnml.tools.epnk.structuredpntypemodel.StructuredpntypemodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MultisetsPackageImpl extends EPackageImpl implements MultisetsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cardinalityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cardinalityOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numberOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subtractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scalarProductEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emptyEClass = null;

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
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.MultisetsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MultisetsPackageImpl() {
		super(eNS_URI, MultisetsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MultisetsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MultisetsPackage init() {
		if (isInited) return (MultisetsPackage)EPackage.Registry.INSTANCE.getEPackage(MultisetsPackage.eNS_URI);

		// Obtain or create and register package
		MultisetsPackageImpl theMultisetsPackage = (MultisetsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MultisetsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MultisetsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		StructuredpntypemodelPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		TermsPackageImpl theTermsPackage = (TermsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TermsPackage.eNS_URI) instanceof TermsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TermsPackage.eNS_URI) : TermsPackage.eINSTANCE);
		DotsPackageImpl theDotsPackage = (DotsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DotsPackage.eNS_URI) instanceof DotsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DotsPackage.eNS_URI) : DotsPackage.eINSTANCE);
		BooleansPackageImpl theBooleansPackage = (BooleansPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BooleansPackage.eNS_URI) instanceof BooleansPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BooleansPackage.eNS_URI) : BooleansPackage.eINSTANCE);
		IntegersPackageImpl theIntegersPackage = (IntegersPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IntegersPackage.eNS_URI) instanceof IntegersPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IntegersPackage.eNS_URI) : IntegersPackage.eINSTANCE);

		// Create package meta-data objects
		theMultisetsPackage.createPackageContents();
		theTermsPackage.createPackageContents();
		theDotsPackage.createPackageContents();
		theBooleansPackage.createPackageContents();
		theIntegersPackage.createPackageContents();

		// Initialize created meta-data
		theMultisetsPackage.initializePackageContents();
		theTermsPackage.initializePackageContents();
		theDotsPackage.initializePackageContents();
		theBooleansPackage.initializePackageContents();
		theIntegersPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMultisetsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MultisetsPackage.eNS_URI, theMultisetsPackage);
		return theMultisetsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCardinality() {
		return cardinalityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCardinalityOf() {
		return cardinalityOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContains() {
		return containsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdd() {
		return addEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAll() {
		return allEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAll_Refsort() {
		return (EReference)allEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumberOf() {
		return numberOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubtract() {
		return subtractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScalarProduct() {
		return scalarProductEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmpty() {
		return emptyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEmpty_Refsort() {
		return (EReference)emptyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultisetsFactory getMultisetsFactory() {
		return (MultisetsFactory)getEFactoryInstance();
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
		cardinalityEClass = createEClass(CARDINALITY);

		cardinalityOfEClass = createEClass(CARDINALITY_OF);

		containsEClass = createEClass(CONTAINS);

		addEClass = createEClass(ADD);

		allEClass = createEClass(ALL);
		createEReference(allEClass, ALL__REFSORT);

		numberOfEClass = createEClass(NUMBER_OF);

		subtractEClass = createEClass(SUBTRACT);

		scalarProductEClass = createEClass(SCALAR_PRODUCT);

		emptyEClass = createEClass(EMPTY);
		createEReference(emptyEClass, EMPTY__REFSORT);
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
		cardinalityEClass.getESuperTypes().add(theTermsPackage.getBuiltInOperator());
		cardinalityOfEClass.getESuperTypes().add(theTermsPackage.getBuiltInOperator());
		containsEClass.getESuperTypes().add(theTermsPackage.getBuiltInOperator());
		addEClass.getESuperTypes().add(theTermsPackage.getMultiSetOperator());
		allEClass.getESuperTypes().add(theTermsPackage.getMultiSetOperator());
		numberOfEClass.getESuperTypes().add(theTermsPackage.getMultiSetOperator());
		subtractEClass.getESuperTypes().add(theTermsPackage.getMultiSetOperator());
		scalarProductEClass.getESuperTypes().add(theTermsPackage.getMultiSetOperator());
		emptyEClass.getESuperTypes().add(theTermsPackage.getMultiSetOperator());

		// Initialize classes and features; add operations and parameters
		initEClass(cardinalityEClass, Cardinality.class, "Cardinality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cardinalityOfEClass, CardinalityOf.class, "CardinalityOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(containsEClass, Contains.class, "Contains", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(addEClass, Add.class, "Add", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(allEClass, All.class, "All", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAll_Refsort(), theTermsPackage.getSort(), null, "refsort", null, 1, 1, All.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(numberOfEClass, NumberOf.class, "NumberOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(subtractEClass, Subtract.class, "Subtract", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(scalarProductEClass, ScalarProduct.class, "ScalarProduct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(emptyEClass, Empty.class, "Empty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEmpty_Refsort(), theTermsPackage.getSort(), null, "refsort", null, 1, 1, Empty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //MultisetsPackageImpl

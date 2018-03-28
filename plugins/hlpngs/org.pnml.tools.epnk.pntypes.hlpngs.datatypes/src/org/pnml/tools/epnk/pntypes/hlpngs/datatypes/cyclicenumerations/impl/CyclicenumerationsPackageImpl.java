/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.cyclicenumerations.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.cyclicenumerations.CyclicEnumOperator;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.cyclicenumerations.CyclicEnumeration;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.cyclicenumerations.CyclicenumerationsFactory;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.cyclicenumerations.CyclicenumerationsPackage;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.cyclicenumerations.Predecessor;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.cyclicenumerations.Successor;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteenumerations.FiniteenumerationsPackage;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.TermsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CyclicenumerationsPackageImpl extends EPackageImpl implements CyclicenumerationsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cyclicEnumerationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cyclicEnumOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass successorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass predecessorEClass = null;

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
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.cyclicenumerations.CyclicenumerationsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CyclicenumerationsPackageImpl() {
		super(eNS_URI, CyclicenumerationsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CyclicenumerationsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CyclicenumerationsPackage init() {
		if (isInited) return (CyclicenumerationsPackage)EPackage.Registry.INSTANCE.getEPackage(CyclicenumerationsPackage.eNS_URI);

		// Obtain or create and register package
		CyclicenumerationsPackageImpl theCyclicenumerationsPackage = (CyclicenumerationsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CyclicenumerationsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CyclicenumerationsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		FiniteenumerationsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCyclicenumerationsPackage.createPackageContents();

		// Initialize created meta-data
		theCyclicenumerationsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCyclicenumerationsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CyclicenumerationsPackage.eNS_URI, theCyclicenumerationsPackage);
		return theCyclicenumerationsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCyclicEnumeration() {
		return cyclicEnumerationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCyclicEnumOperator() {
		return cyclicEnumOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSuccessor() {
		return successorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPredecessor() {
		return predecessorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CyclicenumerationsFactory getCyclicenumerationsFactory() {
		return (CyclicenumerationsFactory)getEFactoryInstance();
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
		cyclicEnumerationEClass = createEClass(CYCLIC_ENUMERATION);

		cyclicEnumOperatorEClass = createEClass(CYCLIC_ENUM_OPERATOR);

		successorEClass = createEClass(SUCCESSOR);

		predecessorEClass = createEClass(PREDECESSOR);
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
		FiniteenumerationsPackage theFiniteenumerationsPackage = (FiniteenumerationsPackage)EPackage.Registry.INSTANCE.getEPackage(FiniteenumerationsPackage.eNS_URI);
		TermsPackage theTermsPackage = (TermsPackage)EPackage.Registry.INSTANCE.getEPackage(TermsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		cyclicEnumerationEClass.getESuperTypes().add(theFiniteenumerationsPackage.getFiniteEnumeration());
		cyclicEnumOperatorEClass.getESuperTypes().add(theTermsPackage.getBuiltInOperator());
		successorEClass.getESuperTypes().add(this.getCyclicEnumOperator());
		predecessorEClass.getESuperTypes().add(this.getCyclicEnumOperator());

		// Initialize classes and features; add operations and parameters
		initEClass(cyclicEnumerationEClass, CyclicEnumeration.class, "CyclicEnumeration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cyclicEnumOperatorEClass, CyclicEnumOperator.class, "CyclicEnumOperator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(successorEClass, Successor.class, "Successor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(predecessorEClass, Predecessor.class, "Predecessor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //CyclicenumerationsPackageImpl

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.BooleansPackage;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.dots.DotsPackage;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.IntegersPackage;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.MultisetsPackage;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.GreaterThan;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.LessThan;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.Partition;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.PartitionElement;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.PartitionElementOf;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.PartitionOperator;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.PartitionsFactory;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.PartitionsPackage;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.TermsPackage;

import org.pnml.tools.epnk.structuredpntypemodel.StructuredpntypemodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PartitionsPackageImpl extends EPackageImpl implements PartitionsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partitionElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partitionOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partitionElementOfEClass = null;

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
	private EClass greaterThanEClass = null;

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
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.partitions.PartitionsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PartitionsPackageImpl() {
		super(eNS_URI, PartitionsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PartitionsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PartitionsPackage init() {
		if (isInited) return (PartitionsPackage)EPackage.Registry.INSTANCE.getEPackage(PartitionsPackage.eNS_URI);

		// Obtain or create and register package
		PartitionsPackageImpl thePartitionsPackage = (PartitionsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PartitionsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PartitionsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TermsPackage.eINSTANCE.eClass();
		DotsPackage.eINSTANCE.eClass();
		MultisetsPackage.eINSTANCE.eClass();
		BooleansPackage.eINSTANCE.eClass();
		IntegersPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thePartitionsPackage.createPackageContents();

		// Initialize created meta-data
		thePartitionsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePartitionsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PartitionsPackage.eNS_URI, thePartitionsPackage);
		return thePartitionsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPartition() {
		return partitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartition_Def() {
		return (EReference)partitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartition_PartitionElements() {
		return (EReference)partitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPartitionElement() {
		return partitionElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartitionElement_Partitionelementconstant() {
		return (EReference)partitionElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPartitionOperator() {
		return partitionOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPartitionElementOf() {
		return partitionElementOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartitionElementOf_Refpartition() {
		return (EReference)partitionElementOfEClass.getEStructuralFeatures().get(0);
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
	public EClass getGreaterThan() {
		return greaterThanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartitionsFactory getPartitionsFactory() {
		return (PartitionsFactory)getEFactoryInstance();
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
		partitionEClass = createEClass(PARTITION);
		createEReference(partitionEClass, PARTITION__DEF);
		createEReference(partitionEClass, PARTITION__PARTITION_ELEMENTS);

		partitionElementEClass = createEClass(PARTITION_ELEMENT);
		createEReference(partitionElementEClass, PARTITION_ELEMENT__PARTITIONELEMENTCONSTANT);

		partitionOperatorEClass = createEClass(PARTITION_OPERATOR);

		partitionElementOfEClass = createEClass(PARTITION_ELEMENT_OF);
		createEReference(partitionElementOfEClass, PARTITION_ELEMENT_OF__REFPARTITION);

		lessThanEClass = createEClass(LESS_THAN);

		greaterThanEClass = createEClass(GREATER_THAN);
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
		StructuredpntypemodelPackage theStructuredpntypemodelPackage = (StructuredpntypemodelPackage)EPackage.Registry.INSTANCE.getEPackage(StructuredpntypemodelPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		partitionEClass.getESuperTypes().add(theTermsPackage.getSortDecl());
		partitionElementEClass.getESuperTypes().add(theTermsPackage.getOperatorDecl());
		partitionOperatorEClass.getESuperTypes().add(theTermsPackage.getBuiltInOperator());
		partitionElementOfEClass.getESuperTypes().add(this.getPartitionOperator());
		partitionElementOfEClass.getESuperTypes().add(theStructuredpntypemodelPackage.getSymbolUse());
		lessThanEClass.getESuperTypes().add(this.getPartitionOperator());
		greaterThanEClass.getESuperTypes().add(this.getPartitionOperator());

		// Initialize classes and features; add operations and parameters
		initEClass(partitionEClass, Partition.class, "Partition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPartition_Def(), theTermsPackage.getSort(), null, "def", null, 1, 1, Partition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPartition_PartitionElements(), this.getPartitionElement(), null, "partitionElements", null, 1, -1, Partition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(partitionElementEClass, PartitionElement.class, "PartitionElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPartitionElement_Partitionelementconstant(), theTermsPackage.getTerm(), null, "partitionelementconstant", null, 1, -1, PartitionElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(partitionOperatorEClass, PartitionOperator.class, "PartitionOperator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(partitionElementOfEClass, PartitionElementOf.class, "PartitionElementOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPartitionElementOf_Refpartition(), this.getPartition(), null, "refpartition", null, 1, 1, PartitionElementOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lessThanEClass, LessThan.class, "LessThan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(greaterThanEClass, GreaterThan.class, "GreaterThan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //PartitionsPackageImpl

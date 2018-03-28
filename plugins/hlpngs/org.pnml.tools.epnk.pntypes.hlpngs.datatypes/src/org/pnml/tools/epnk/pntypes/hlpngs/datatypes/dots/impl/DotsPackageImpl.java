/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.dots.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.BooleansPackage;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.impl.BooleansPackageImpl;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.dots.Dot;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.dots.DotConstant;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.dots.DotsFactory;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.dots.DotsPackage;

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
public class DotsPackageImpl extends EPackageImpl implements DotsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dotConstantEClass = null;

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
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.dots.DotsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DotsPackageImpl() {
		super(eNS_URI, DotsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DotsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DotsPackage init() {
		if (isInited) return (DotsPackage)EPackage.Registry.INSTANCE.getEPackage(DotsPackage.eNS_URI);

		// Obtain or create and register package
		DotsPackageImpl theDotsPackage = (DotsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DotsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DotsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		StructuredpntypemodelPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		TermsPackageImpl theTermsPackage = (TermsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TermsPackage.eNS_URI) instanceof TermsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TermsPackage.eNS_URI) : TermsPackage.eINSTANCE);
		MultisetsPackageImpl theMultisetsPackage = (MultisetsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MultisetsPackage.eNS_URI) instanceof MultisetsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MultisetsPackage.eNS_URI) : MultisetsPackage.eINSTANCE);
		BooleansPackageImpl theBooleansPackage = (BooleansPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BooleansPackage.eNS_URI) instanceof BooleansPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BooleansPackage.eNS_URI) : BooleansPackage.eINSTANCE);
		IntegersPackageImpl theIntegersPackage = (IntegersPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IntegersPackage.eNS_URI) instanceof IntegersPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IntegersPackage.eNS_URI) : IntegersPackage.eINSTANCE);

		// Create package meta-data objects
		theDotsPackage.createPackageContents();
		theTermsPackage.createPackageContents();
		theMultisetsPackage.createPackageContents();
		theBooleansPackage.createPackageContents();
		theIntegersPackage.createPackageContents();

		// Initialize created meta-data
		theDotsPackage.initializePackageContents();
		theTermsPackage.initializePackageContents();
		theMultisetsPackage.initializePackageContents();
		theBooleansPackage.initializePackageContents();
		theIntegersPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDotsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DotsPackage.eNS_URI, theDotsPackage);
		return theDotsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDot() {
		return dotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDotConstant() {
		return dotConstantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DotsFactory getDotsFactory() {
		return (DotsFactory)getEFactoryInstance();
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
		dotEClass = createEClass(DOT);

		dotConstantEClass = createEClass(DOT_CONSTANT);
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
		dotEClass.getESuperTypes().add(theTermsPackage.getBuiltInSort());
		dotConstantEClass.getESuperTypes().add(theTermsPackage.getBuiltInConst());

		// Initialize classes and features; add operations and parameters
		initEClass(dotEClass, Dot.class, "Dot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dotConstantEClass, DotConstant.class, "DotConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //DotsPackageImpl

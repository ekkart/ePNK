/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.hlpnghelpers.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.BooleansPackage;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.dots.DotsPackage;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.hlpnghelpers.HlpnghelpersFactory;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.hlpnghelpers.HlpnghelpersPackage;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.hlpnghelpers.ProxySort;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.IntegersPackage;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.MultisetsPackage;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.TermsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HlpnghelpersPackageImpl extends EPackageImpl implements HlpnghelpersPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass proxySortEClass = null;

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
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.hlpnghelpers.HlpnghelpersPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private HlpnghelpersPackageImpl() {
		super(eNS_URI, HlpnghelpersFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link HlpnghelpersPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static HlpnghelpersPackage init() {
		if (isInited) return (HlpnghelpersPackage)EPackage.Registry.INSTANCE.getEPackage(HlpnghelpersPackage.eNS_URI);

		// Obtain or create and register package
		HlpnghelpersPackageImpl theHlpnghelpersPackage = (HlpnghelpersPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof HlpnghelpersPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new HlpnghelpersPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TermsPackage.eINSTANCE.eClass();
		DotsPackage.eINSTANCE.eClass();
		MultisetsPackage.eINSTANCE.eClass();
		BooleansPackage.eINSTANCE.eClass();
		IntegersPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theHlpnghelpersPackage.createPackageContents();

		// Initialize created meta-data
		theHlpnghelpersPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theHlpnghelpersPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(HlpnghelpersPackage.eNS_URI, theHlpnghelpersPackage);
		return theHlpnghelpersPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProxySort() {
		return proxySortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProxySort_Sort() {
		return (EReference)proxySortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HlpnghelpersFactory getHlpnghelpersFactory() {
		return (HlpnghelpersFactory)getEFactoryInstance();
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
		proxySortEClass = createEClass(PROXY_SORT);
		createEReference(proxySortEClass, PROXY_SORT__SORT);
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
		proxySortEClass.getESuperTypes().add(theTermsPackage.getSort());

		// Initialize classes and features; add operations and parameters
		initEClass(proxySortEClass, ProxySort.class, "ProxySort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProxySort_Sort(), theTermsPackage.getSort(), null, "sort", null, 1, 1, ProxySort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //HlpnghelpersPackageImpl

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.test.type.refnodeextensions.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage;

import org.pnml.tools.epnk.pntypes.ptnet.PtnetPackage;

import org.pnml.tools.epnk.test.type.refnodeextensions.Page;
import org.pnml.tools.epnk.test.type.refnodeextensions.Pragmatics;
import org.pnml.tools.epnk.test.type.refnodeextensions.RefNodeExtension;
import org.pnml.tools.epnk.test.type.refnodeextensions.RefPlace;
import org.pnml.tools.epnk.test.type.refnodeextensions.RefTransition;
import org.pnml.tools.epnk.test.type.refnodeextensions.RefnodeextensionsFactory;
import org.pnml.tools.epnk.test.type.refnodeextensions.RefnodeextensionsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RefnodeextensionsPackageImpl extends EPackageImpl implements RefnodeextensionsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refNodeExtensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refPlaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pragmaticsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pageEClass = null;

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
	 * @see org.pnml.tools.epnk.test.type.refnodeextensions.RefnodeextensionsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RefnodeextensionsPackageImpl() {
		super(eNS_URI, RefnodeextensionsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RefnodeextensionsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RefnodeextensionsPackage init() {
		if (isInited) return (RefnodeextensionsPackage)EPackage.Registry.INSTANCE.getEPackage(RefnodeextensionsPackage.eNS_URI);

		// Obtain or create and register package
		RefnodeextensionsPackageImpl theRefnodeextensionsPackage = (RefnodeextensionsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RefnodeextensionsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RefnodeextensionsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		PtnetPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theRefnodeextensionsPackage.createPackageContents();

		// Initialize created meta-data
		theRefnodeextensionsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRefnodeextensionsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RefnodeextensionsPackage.eNS_URI, theRefnodeextensionsPackage);
		return theRefnodeextensionsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRefNodeExtension() {
		return refNodeExtensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRefPlace() {
		return refPlaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRefPlace_Pragmatics() {
		return (EReference)refPlaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRefTransition() {
		return refTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRefTransition_Api() {
		return (EReference)refTransitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPragmatics() {
		return pragmaticsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPragmatics_Text() {
		return (EAttribute)pragmaticsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAPI() {
		return apiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAPI_Text() {
		return (EAttribute)apiEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPage() {
		return pageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPage_Pragmatics() {
		return (EReference)pageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPage_Api() {
		return (EReference)pageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefnodeextensionsFactory getRefnodeextensionsFactory() {
		return (RefnodeextensionsFactory)getEFactoryInstance();
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
		refNodeExtensionEClass = createEClass(REF_NODE_EXTENSION);

		refPlaceEClass = createEClass(REF_PLACE);
		createEReference(refPlaceEClass, REF_PLACE__PRAGMATICS);

		refTransitionEClass = createEClass(REF_TRANSITION);
		createEReference(refTransitionEClass, REF_TRANSITION__API);

		pragmaticsEClass = createEClass(PRAGMATICS);
		createEAttribute(pragmaticsEClass, PRAGMATICS__TEXT);

		apiEClass = createEClass(API);
		createEAttribute(apiEClass, API__TEXT);

		pageEClass = createEClass(PAGE);
		createEReference(pageEClass, PAGE__PRAGMATICS);
		createEReference(pageEClass, PAGE__API);
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
		PtnetPackage thePtnetPackage = (PtnetPackage)EPackage.Registry.INSTANCE.getEPackage(PtnetPackage.eNS_URI);
		PnmlcoremodelPackage thePnmlcoremodelPackage = (PnmlcoremodelPackage)EPackage.Registry.INSTANCE.getEPackage(PnmlcoremodelPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		refNodeExtensionEClass.getESuperTypes().add(thePtnetPackage.getPTNet());
		refPlaceEClass.getESuperTypes().add(thePnmlcoremodelPackage.getRefPlace());
		refTransitionEClass.getESuperTypes().add(thePnmlcoremodelPackage.getRefTransition());
		pragmaticsEClass.getESuperTypes().add(thePnmlcoremodelPackage.getLabel());
		apiEClass.getESuperTypes().add(thePnmlcoremodelPackage.getLabel());
		pageEClass.getESuperTypes().add(thePnmlcoremodelPackage.getPage());

		// Initialize classes and features; add operations and parameters
		initEClass(refNodeExtensionEClass, RefNodeExtension.class, "RefNodeExtension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(refPlaceEClass, RefPlace.class, "RefPlace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRefPlace_Pragmatics(), this.getPragmatics(), null, "pragmatics", null, 0, 1, RefPlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(refTransitionEClass, RefTransition.class, "RefTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRefTransition_Api(), this.getAPI(), null, "api", null, 0, 1, RefTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pragmaticsEClass, Pragmatics.class, "Pragmatics", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPragmatics_Text(), ecorePackage.getEString(), "text", null, 0, 1, Pragmatics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(apiEClass, org.pnml.tools.epnk.test.type.refnodeextensions.API.class, "API", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAPI_Text(), ecorePackage.getEString(), "text", null, 0, 1, org.pnml.tools.epnk.test.type.refnodeextensions.API.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pageEClass, Page.class, "Page", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPage_Pragmatics(), this.getPragmatics(), null, "pragmatics", null, 0, -1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPage_Api(), this.getAPI(), null, "api", null, 0, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //RefnodeextensionsPackageImpl

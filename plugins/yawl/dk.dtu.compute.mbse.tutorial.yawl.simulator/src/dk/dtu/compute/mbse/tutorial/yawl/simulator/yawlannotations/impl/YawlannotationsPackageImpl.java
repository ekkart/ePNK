/**
 */
package dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.impl;

import dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.EnabledTransition;
import dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.Marking;
import dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.SelectArc;
import dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.YawlannotationsFactory;
import dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.YawlannotationsPackage;

import dk.dtu.compute.mbse.yawl.YawlPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.pnml.tools.epnk.annotations.netannotations.NetannotationsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class YawlannotationsPackageImpl extends EPackageImpl implements YawlannotationsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enabledTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectArcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass markingEClass = null;

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
	 * @see dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.YawlannotationsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private YawlannotationsPackageImpl() {
		super(eNS_URI, YawlannotationsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link YawlannotationsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static YawlannotationsPackage init() {
		if (isInited) return (YawlannotationsPackage)EPackage.Registry.INSTANCE.getEPackage(YawlannotationsPackage.eNS_URI);

		// Obtain or create and register package
		YawlannotationsPackageImpl theYawlannotationsPackage = (YawlannotationsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof YawlannotationsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new YawlannotationsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		NetannotationsPackage.eINSTANCE.eClass();
		YawlPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theYawlannotationsPackage.createPackageContents();

		// Initialize created meta-data
		theYawlannotationsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theYawlannotationsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(YawlannotationsPackage.eNS_URI, theYawlannotationsPackage);
		return theYawlannotationsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnabledTransition() {
		return enabledTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnabledTransition_InArcs() {
		return (EReference)enabledTransitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnabledTransition_OutArcs() {
		return (EReference)enabledTransitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnabledTransition_Resolved() {
		return (EReference)enabledTransitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelectArc() {
		return selectArcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelectArc_TargetTransition() {
		return (EReference)selectArcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelectArc_SourceTransition() {
		return (EReference)selectArcEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSelectArc_Selected() {
		return (EAttribute)selectArcEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelectArc_SourceMarking() {
		return (EReference)selectArcEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMarking() {
		return markingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMarking_Value() {
		return (EAttribute)markingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YawlannotationsFactory getYawlannotationsFactory() {
		return (YawlannotationsFactory)getEFactoryInstance();
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
		enabledTransitionEClass = createEClass(ENABLED_TRANSITION);
		createEReference(enabledTransitionEClass, ENABLED_TRANSITION__IN_ARCS);
		createEReference(enabledTransitionEClass, ENABLED_TRANSITION__OUT_ARCS);
		createEReference(enabledTransitionEClass, ENABLED_TRANSITION__RESOLVED);

		selectArcEClass = createEClass(SELECT_ARC);
		createEReference(selectArcEClass, SELECT_ARC__TARGET_TRANSITION);
		createEReference(selectArcEClass, SELECT_ARC__SOURCE_TRANSITION);
		createEAttribute(selectArcEClass, SELECT_ARC__SELECTED);
		createEReference(selectArcEClass, SELECT_ARC__SOURCE_MARKING);

		markingEClass = createEClass(MARKING);
		createEAttribute(markingEClass, MARKING__VALUE);
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
		NetannotationsPackage theNetannotationsPackage = (NetannotationsPackage)EPackage.Registry.INSTANCE.getEPackage(NetannotationsPackage.eNS_URI);
		YawlPackage theYawlPackage = (YawlPackage)EPackage.Registry.INSTANCE.getEPackage(YawlPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		enabledTransitionEClass.getESuperTypes().add(theNetannotationsPackage.getObjectAnnotation());
		selectArcEClass.getESuperTypes().add(theNetannotationsPackage.getObjectAnnotation());
		markingEClass.getESuperTypes().add(theNetannotationsPackage.getObjectAnnotation());
		markingEClass.getESuperTypes().add(theNetannotationsPackage.getTextualAnnotation());

		// Initialize classes and features; add operations and parameters
		initEClass(enabledTransitionEClass, EnabledTransition.class, "EnabledTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnabledTransition_InArcs(), this.getSelectArc(), this.getSelectArc_TargetTransition(), "inArcs", null, 0, -1, EnabledTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnabledTransition_OutArcs(), this.getSelectArc(), this.getSelectArc_SourceTransition(), "outArcs", null, 0, -1, EnabledTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnabledTransition_Resolved(), this.getEnabledTransition(), null, "resolved", null, 0, 1, EnabledTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(enabledTransitionEClass, theYawlPackage.getAction(), "getAction", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(selectArcEClass, SelectArc.class, "SelectArc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSelectArc_TargetTransition(), this.getEnabledTransition(), this.getEnabledTransition_InArcs(), "targetTransition", null, 0, 1, SelectArc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSelectArc_SourceTransition(), this.getEnabledTransition(), this.getEnabledTransition_OutArcs(), "sourceTransition", null, 0, 1, SelectArc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSelectArc_Selected(), ecorePackage.getEBoolean(), "selected", null, 1, 1, SelectArc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSelectArc_SourceMarking(), this.getMarking(), null, "sourceMarking", null, 0, 1, SelectArc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(markingEClass, Marking.class, "Marking", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMarking_Value(), ecorePackage.getEInt(), "value", null, 0, 1, Marking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //YawlannotationsPackageImpl

/**
 */
package dk.dtu.compute.mbse.yawl.impl;

import dk.dtu.compute.mbse.yawl.AType;
import dk.dtu.compute.mbse.yawl.Action;
import dk.dtu.compute.mbse.yawl.Arc;
import dk.dtu.compute.mbse.yawl.ArcType;
import dk.dtu.compute.mbse.yawl.CType;
import dk.dtu.compute.mbse.yawl.Condition;
import dk.dtu.compute.mbse.yawl.ConditionType;
import dk.dtu.compute.mbse.yawl.TType;
import dk.dtu.compute.mbse.yawl.TransitionType;
import dk.dtu.compute.mbse.yawl.YAWLNet;
import dk.dtu.compute.mbse.yawl.YawlFactory;
import dk.dtu.compute.mbse.yawl.YawlPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class YawlPackageImpl extends EPackageImpl implements YawlPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yawlNetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arcTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum aTypeEEnum = null;

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
	 * @see dk.dtu.compute.mbse.yawl.YawlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private YawlPackageImpl() {
		super(eNS_URI, YawlFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link YawlPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static YawlPackage init() {
		if (isInited) return (YawlPackage)EPackage.Registry.INSTANCE.getEPackage(YawlPackage.eNS_URI);

		// Obtain or create and register package
		YawlPackageImpl theYawlPackage = (YawlPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof YawlPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new YawlPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		PnmlcoremodelPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theYawlPackage.createPackageContents();

		// Initialize created meta-data
		theYawlPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theYawlPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(YawlPackage.eNS_URI, theYawlPackage);
		return theYawlPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYAWLNet() {
		return yawlNetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCondition() {
		return conditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondition_Type() {
		return (EReference)conditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAction_Jointype() {
		return (EReference)actionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAction_SplitType() {
		return (EReference)actionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionType() {
		return conditionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConditionType_Text() {
		return (EAttribute)conditionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransitionType() {
		return transitionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransitionType_Text() {
		return (EAttribute)transitionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArc() {
		return arcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArc_Type() {
		return (EReference)arcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArcType() {
		return arcTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArcType_Text() {
		return (EAttribute)arcTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCType() {
		return cTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTType() {
		return tTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAType() {
		return aTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YawlFactory getYawlFactory() {
		return (YawlFactory)getEFactoryInstance();
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
		yawlNetEClass = createEClass(YAWL_NET);

		conditionEClass = createEClass(CONDITION);
		createEReference(conditionEClass, CONDITION__TYPE);

		actionEClass = createEClass(ACTION);
		createEReference(actionEClass, ACTION__JOINTYPE);
		createEReference(actionEClass, ACTION__SPLIT_TYPE);

		conditionTypeEClass = createEClass(CONDITION_TYPE);
		createEAttribute(conditionTypeEClass, CONDITION_TYPE__TEXT);

		transitionTypeEClass = createEClass(TRANSITION_TYPE);
		createEAttribute(transitionTypeEClass, TRANSITION_TYPE__TEXT);

		arcEClass = createEClass(ARC);
		createEReference(arcEClass, ARC__TYPE);

		arcTypeEClass = createEClass(ARC_TYPE);
		createEAttribute(arcTypeEClass, ARC_TYPE__TEXT);

		// Create enums
		cTypeEEnum = createEEnum(CTYPE);
		tTypeEEnum = createEEnum(TTYPE);
		aTypeEEnum = createEEnum(ATYPE);
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
		PnmlcoremodelPackage thePnmlcoremodelPackage = (PnmlcoremodelPackage)EPackage.Registry.INSTANCE.getEPackage(PnmlcoremodelPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		yawlNetEClass.getESuperTypes().add(thePnmlcoremodelPackage.getPetriNetType());
		conditionEClass.getESuperTypes().add(thePnmlcoremodelPackage.getPlace());
		actionEClass.getESuperTypes().add(thePnmlcoremodelPackage.getTransition());
		conditionTypeEClass.getESuperTypes().add(thePnmlcoremodelPackage.getAttribute());
		transitionTypeEClass.getESuperTypes().add(thePnmlcoremodelPackage.getAttribute());
		arcEClass.getESuperTypes().add(thePnmlcoremodelPackage.getArc());
		arcTypeEClass.getESuperTypes().add(thePnmlcoremodelPackage.getAttribute());

		// Initialize classes and features; add operations and parameters
		initEClass(yawlNetEClass, YAWLNet.class, "YAWLNet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(conditionEClass, Condition.class, "Condition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCondition_Type(), this.getConditionType(), null, "type", null, 0, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAction_Jointype(), this.getTransitionType(), null, "jointype", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAction_SplitType(), this.getTransitionType(), null, "splitType", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionTypeEClass, ConditionType.class, "ConditionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConditionType_Text(), this.getCType(), "text", null, 1, 1, ConditionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transitionTypeEClass, TransitionType.class, "TransitionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransitionType_Text(), this.getTType(), "text", null, 1, 1, TransitionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arcEClass, Arc.class, "Arc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArc_Type(), this.getArcType(), null, "type", null, 0, 1, Arc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arcTypeEClass, ArcType.class, "ArcType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArcType_Text(), this.getAType(), "text", null, 1, 1, ArcType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(cTypeEEnum, CType.class, "CType");
		addEEnumLiteral(cTypeEEnum, CType.NORMAL);
		addEEnumLiteral(cTypeEEnum, CType.START);
		addEEnumLiteral(cTypeEEnum, CType.FINISH);

		initEEnum(tTypeEEnum, TType.class, "TType");
		addEEnumLiteral(tTypeEEnum, TType.AND);
		addEEnumLiteral(tTypeEEnum, TType.XOR);
		addEEnumLiteral(tTypeEEnum, TType.OR);

		initEEnum(aTypeEEnum, AType.class, "AType");
		addEEnumLiteral(aTypeEEnum, AType.NORMAL);
		addEEnumLiteral(aTypeEEnum, AType.RESET);

		// Create resource
		createResource(eNS_URI);
	}

} //YawlPackageImpl

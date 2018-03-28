/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ptnetsimulator.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.pnml.tools.epnk.annotations.netannotations.NetannotationsPackage;

import ptnetsimulator.Mode;
import ptnetsimulator.PlaceMarkingAnnotation;
import ptnetsimulator.PlaceSelectionAnnotation;
import ptnetsimulator.PtnetsimulatorFactory;
import ptnetsimulator.PtnetsimulatorPackage;
import ptnetsimulator.TransitionActivationAnnotation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PtnetsimulatorPackageImpl extends EPackageImpl implements PtnetsimulatorPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionActivationAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placeMarkingAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placeSelectionAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum modeEEnum = null;

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
	 * @see ptnetsimulator.PtnetsimulatorPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PtnetsimulatorPackageImpl() {
		super(eNS_URI, PtnetsimulatorFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PtnetsimulatorPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PtnetsimulatorPackage init() {
		if (isInited) return (PtnetsimulatorPackage)EPackage.Registry.INSTANCE.getEPackage(PtnetsimulatorPackage.eNS_URI);

		// Obtain or create and register package
		PtnetsimulatorPackageImpl thePtnetsimulatorPackage = (PtnetsimulatorPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PtnetsimulatorPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PtnetsimulatorPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		NetannotationsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thePtnetsimulatorPackage.createPackageContents();

		// Initialize created meta-data
		thePtnetsimulatorPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePtnetsimulatorPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PtnetsimulatorPackage.eNS_URI, thePtnetsimulatorPackage);
		return thePtnetsimulatorPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransitionActivationAnnotation() {
		return transitionActivationAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransitionActivationAnnotation_Mode() {
		return (EAttribute)transitionActivationAnnotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlaceMarkingAnnotation() {
		return placeMarkingAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlaceMarkingAnnotation_Text() {
		return (EAttribute)placeMarkingAnnotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlaceSelectionAnnotation() {
		return placeSelectionAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlaceSelectionAnnotation_Selected() {
		return (EAttribute)placeSelectionAnnotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMode() {
		return modeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PtnetsimulatorFactory getPtnetsimulatorFactory() {
		return (PtnetsimulatorFactory)getEFactoryInstance();
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
		transitionActivationAnnotationEClass = createEClass(TRANSITION_ACTIVATION_ANNOTATION);
		createEAttribute(transitionActivationAnnotationEClass, TRANSITION_ACTIVATION_ANNOTATION__MODE);

		placeMarkingAnnotationEClass = createEClass(PLACE_MARKING_ANNOTATION);
		createEAttribute(placeMarkingAnnotationEClass, PLACE_MARKING_ANNOTATION__TEXT);

		placeSelectionAnnotationEClass = createEClass(PLACE_SELECTION_ANNOTATION);
		createEAttribute(placeSelectionAnnotationEClass, PLACE_SELECTION_ANNOTATION__SELECTED);

		// Create enums
		modeEEnum = createEEnum(MODE);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		transitionActivationAnnotationEClass.getESuperTypes().add(theNetannotationsPackage.getObjectAnnotation());
		placeMarkingAnnotationEClass.getESuperTypes().add(theNetannotationsPackage.getObjectAnnotation());
		placeMarkingAnnotationEClass.getESuperTypes().add(theNetannotationsPackage.getTextualAnnotation());
		placeSelectionAnnotationEClass.getESuperTypes().add(theNetannotationsPackage.getObjectAnnotation());

		// Initialize classes and features; add operations and parameters
		initEClass(transitionActivationAnnotationEClass, TransitionActivationAnnotation.class, "TransitionActivationAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransitionActivationAnnotation_Mode(), this.getMode(), "mode", null, 0, 1, TransitionActivationAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(placeMarkingAnnotationEClass, PlaceMarkingAnnotation.class, "PlaceMarkingAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlaceMarkingAnnotation_Text(), ecorePackage.getEInt(), "text", null, 0, 1, PlaceMarkingAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(placeSelectionAnnotationEClass, PlaceSelectionAnnotation.class, "PlaceSelectionAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlaceSelectionAnnotation_Selected(), ecorePackage.getEBoolean(), "selected", null, 0, 1, PlaceSelectionAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(modeEEnum, Mode.class, "Mode");
		addEEnumLiteral(modeEEnum, Mode.ENABLED);
		addEEnumLiteral(modeEEnum, Mode.FIRED);

		// Create resource
		createResource(eNS_URI);
	}

} //PtnetsimulatorPackageImpl

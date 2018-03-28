/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ptnetsimulator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.pnml.tools.epnk.annotations.netannotations.NetannotationsPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ptnetsimulator.PtnetsimulatorFactory
 * @model kind="package"
 * @generated
 */
public interface PtnetsimulatorPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ptnetsimulator";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.pnml.tools/epnk/applications/ptnet/simulator";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ptsa";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PtnetsimulatorPackage eINSTANCE = ptnetsimulator.impl.PtnetsimulatorPackageImpl.init();

	/**
	 * The meta object id for the '{@link ptnetsimulator.impl.TransitionActivationAnnotationImpl <em>Transition Activation Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetsimulator.impl.TransitionActivationAnnotationImpl
	 * @see ptnetsimulator.impl.PtnetsimulatorPackageImpl#getTransitionActivationAnnotation()
	 * @generated
	 */
	int TRANSITION_ACTIVATION_ANNOTATION = 0;

	/**
	 * The feature id for the '<em><b>Net Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_ACTIVATION_ANNOTATION__NET_ANNOTATIONS = NetannotationsPackage.OBJECT_ANNOTATION__NET_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_ACTIVATION_ANNOTATION__OBJECT = NetannotationsPackage.OBJECT_ANNOTATION__OBJECT;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_ACTIVATION_ANNOTATION__MODE = NetannotationsPackage.OBJECT_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Transition Activation Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_ACTIVATION_ANNOTATION_FEATURE_COUNT = NetannotationsPackage.OBJECT_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ptnetsimulator.impl.PlaceMarkingAnnotationImpl <em>Place Marking Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetsimulator.impl.PlaceMarkingAnnotationImpl
	 * @see ptnetsimulator.impl.PtnetsimulatorPackageImpl#getPlaceMarkingAnnotation()
	 * @generated
	 */
	int PLACE_MARKING_ANNOTATION = 1;

	/**
	 * The feature id for the '<em><b>Net Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_MARKING_ANNOTATION__NET_ANNOTATIONS = NetannotationsPackage.OBJECT_ANNOTATION__NET_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_MARKING_ANNOTATION__OBJECT = NetannotationsPackage.OBJECT_ANNOTATION__OBJECT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_MARKING_ANNOTATION__TEXT = NetannotationsPackage.OBJECT_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Place Marking Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_MARKING_ANNOTATION_FEATURE_COUNT = NetannotationsPackage.OBJECT_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ptnetsimulator.impl.PlaceSelectionAnnotationImpl <em>Place Selection Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetsimulator.impl.PlaceSelectionAnnotationImpl
	 * @see ptnetsimulator.impl.PtnetsimulatorPackageImpl#getPlaceSelectionAnnotation()
	 * @generated
	 */
	int PLACE_SELECTION_ANNOTATION = 2;

	/**
	 * The feature id for the '<em><b>Net Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_SELECTION_ANNOTATION__NET_ANNOTATIONS = NetannotationsPackage.OBJECT_ANNOTATION__NET_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_SELECTION_ANNOTATION__OBJECT = NetannotationsPackage.OBJECT_ANNOTATION__OBJECT;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_SELECTION_ANNOTATION__SELECTED = NetannotationsPackage.OBJECT_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Place Selection Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_SELECTION_ANNOTATION_FEATURE_COUNT = NetannotationsPackage.OBJECT_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ptnetsimulator.Mode <em>Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ptnetsimulator.Mode
	 * @see ptnetsimulator.impl.PtnetsimulatorPackageImpl#getMode()
	 * @generated
	 */
	int MODE = 3;


	/**
	 * Returns the meta object for class '{@link ptnetsimulator.TransitionActivationAnnotation <em>Transition Activation Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition Activation Annotation</em>'.
	 * @see ptnetsimulator.TransitionActivationAnnotation
	 * @generated
	 */
	EClass getTransitionActivationAnnotation();

	/**
	 * Returns the meta object for the attribute '{@link ptnetsimulator.TransitionActivationAnnotation#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see ptnetsimulator.TransitionActivationAnnotation#getMode()
	 * @see #getTransitionActivationAnnotation()
	 * @generated
	 */
	EAttribute getTransitionActivationAnnotation_Mode();

	/**
	 * Returns the meta object for class '{@link ptnetsimulator.PlaceMarkingAnnotation <em>Place Marking Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place Marking Annotation</em>'.
	 * @see ptnetsimulator.PlaceMarkingAnnotation
	 * @generated
	 */
	EClass getPlaceMarkingAnnotation();

	/**
	 * Returns the meta object for the attribute '{@link ptnetsimulator.PlaceMarkingAnnotation#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see ptnetsimulator.PlaceMarkingAnnotation#getText()
	 * @see #getPlaceMarkingAnnotation()
	 * @generated
	 */
	EAttribute getPlaceMarkingAnnotation_Text();

	/**
	 * Returns the meta object for class '{@link ptnetsimulator.PlaceSelectionAnnotation <em>Place Selection Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place Selection Annotation</em>'.
	 * @see ptnetsimulator.PlaceSelectionAnnotation
	 * @generated
	 */
	EClass getPlaceSelectionAnnotation();

	/**
	 * Returns the meta object for the attribute '{@link ptnetsimulator.PlaceSelectionAnnotation#isSelected <em>Selected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selected</em>'.
	 * @see ptnetsimulator.PlaceSelectionAnnotation#isSelected()
	 * @see #getPlaceSelectionAnnotation()
	 * @generated
	 */
	EAttribute getPlaceSelectionAnnotation_Selected();

	/**
	 * Returns the meta object for enum '{@link ptnetsimulator.Mode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Mode</em>'.
	 * @see ptnetsimulator.Mode
	 * @generated
	 */
	EEnum getMode();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PtnetsimulatorFactory getPtnetsimulatorFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ptnetsimulator.impl.TransitionActivationAnnotationImpl <em>Transition Activation Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetsimulator.impl.TransitionActivationAnnotationImpl
		 * @see ptnetsimulator.impl.PtnetsimulatorPackageImpl#getTransitionActivationAnnotation()
		 * @generated
		 */
		EClass TRANSITION_ACTIVATION_ANNOTATION = eINSTANCE.getTransitionActivationAnnotation();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION_ACTIVATION_ANNOTATION__MODE = eINSTANCE.getTransitionActivationAnnotation_Mode();

		/**
		 * The meta object literal for the '{@link ptnetsimulator.impl.PlaceMarkingAnnotationImpl <em>Place Marking Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetsimulator.impl.PlaceMarkingAnnotationImpl
		 * @see ptnetsimulator.impl.PtnetsimulatorPackageImpl#getPlaceMarkingAnnotation()
		 * @generated
		 */
		EClass PLACE_MARKING_ANNOTATION = eINSTANCE.getPlaceMarkingAnnotation();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLACE_MARKING_ANNOTATION__TEXT = eINSTANCE.getPlaceMarkingAnnotation_Text();

		/**
		 * The meta object literal for the '{@link ptnetsimulator.impl.PlaceSelectionAnnotationImpl <em>Place Selection Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetsimulator.impl.PlaceSelectionAnnotationImpl
		 * @see ptnetsimulator.impl.PtnetsimulatorPackageImpl#getPlaceSelectionAnnotation()
		 * @generated
		 */
		EClass PLACE_SELECTION_ANNOTATION = eINSTANCE.getPlaceSelectionAnnotation();

		/**
		 * The meta object literal for the '<em><b>Selected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLACE_SELECTION_ANNOTATION__SELECTED = eINSTANCE.getPlaceSelectionAnnotation_Selected();

		/**
		 * The meta object literal for the '{@link ptnetsimulator.Mode <em>Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ptnetsimulator.Mode
		 * @see ptnetsimulator.impl.PtnetsimulatorPackageImpl#getMode()
		 * @generated
		 */
		EEnum MODE = eINSTANCE.getMode();

	}

} //PtnetsimulatorPackage

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.annotations.netannotations;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.pnml.tools.epnk.annotations.netannotations.NetannotationsFactory
 * @model kind="package"
 * @generated
 */
public interface NetannotationsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "netannotations";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://tools.pnml.org/epnk/netannotations/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "netannotations";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NetannotationsPackage eINSTANCE = org.pnml.tools.epnk.annotations.netannotations.impl.NetannotationsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.annotations.netannotations.impl.AnnotationImpl <em>Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.annotations.netannotations.impl.AnnotationImpl
	 * @see org.pnml.tools.epnk.annotations.netannotations.impl.NetannotationsPackageImpl#getAnnotation()
	 * @generated
	 */
	int ANNOTATION = 5;

	/**
	 * The number of structural features of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.annotations.netannotations.impl.NetAnnotationImpl <em>Net Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.annotations.netannotations.impl.NetAnnotationImpl
	 * @see org.pnml.tools.epnk.annotations.netannotations.impl.NetannotationsPackageImpl#getNetAnnotation()
	 * @generated
	 */
	int NET_ANNOTATION = 0;

	/**
	 * The feature id for the '<em><b>Net</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NET_ANNOTATION__NET = ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Object Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NET_ANNOTATION__OBJECT_ANNOTATIONS = ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Net Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NET_ANNOTATION_FEATURE_COUNT = ANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.annotations.netannotations.impl.ObjectAnnotationImpl <em>Object Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.annotations.netannotations.impl.ObjectAnnotationImpl
	 * @see org.pnml.tools.epnk.annotations.netannotations.impl.NetannotationsPackageImpl#getObjectAnnotation()
	 * @generated
	 */
	int OBJECT_ANNOTATION = 1;

	/**
	 * The feature id for the '<em><b>Net Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ANNOTATION__NET_ANNOTATIONS = ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ANNOTATION__OBJECT = ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Object Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ANNOTATION_FEATURE_COUNT = ANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.annotations.netannotations.impl.NetAnnotationsImpl <em>Net Annotations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.annotations.netannotations.impl.NetAnnotationsImpl
	 * @see org.pnml.tools.epnk.annotations.netannotations.impl.NetannotationsPackageImpl#getNetAnnotations()
	 * @generated
	 */
	int NET_ANNOTATIONS = 2;

	/**
	 * The feature id for the '<em><b>Net Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NET_ANNOTATIONS__NET_ANNOTATIONS = 0;

	/**
	 * The feature id for the '<em><b>Object Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NET_ANNOTATIONS__OBJECT_ANNOTATIONS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NET_ANNOTATIONS__NAME = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NET_ANNOTATIONS__DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Current</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NET_ANNOTATIONS__CURRENT = 4;

	/**
	 * The feature id for the '<em><b>App Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NET_ANNOTATIONS__APP_ID = 5;

	/**
	 * The feature id for the '<em><b>App Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NET_ANNOTATIONS__APP_VERSION = 6;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NET_ANNOTATIONS__DATE = 7;

	/**
	 * The number of structural features of the '<em>Net Annotations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NET_ANNOTATIONS_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.annotations.netannotations.impl.TextualAnnotationImpl <em>Textual Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.annotations.netannotations.impl.TextualAnnotationImpl
	 * @see org.pnml.tools.epnk.annotations.netannotations.impl.NetannotationsPackageImpl#getTextualAnnotation()
	 * @generated
	 */
	int TEXTUAL_ANNOTATION = 3;

	/**
	 * The number of structural features of the '<em>Textual Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_ANNOTATION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.annotations.netannotations.impl.StructuredAnnotationImpl <em>Structured Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.annotations.netannotations.impl.StructuredAnnotationImpl
	 * @see org.pnml.tools.epnk.annotations.netannotations.impl.NetannotationsPackageImpl#getStructuredAnnotation()
	 * @generated
	 */
	int STRUCTURED_ANNOTATION = 4;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ANNOTATION__TEXT = TEXTUAL_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ANNOTATION__VALID = TEXTUAL_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Structured Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ANNOTATION_FEATURE_COUNT = TEXTUAL_ANNOTATION_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.annotations.netannotations.NetAnnotation <em>Net Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Net Annotation</em>'.
	 * @see org.pnml.tools.epnk.annotations.netannotations.NetAnnotation
	 * @generated
	 */
	EClass getNetAnnotation();

	/**
	 * Returns the meta object for the reference '{@link org.pnml.tools.epnk.annotations.netannotations.NetAnnotation#getNet <em>Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Net</em>'.
	 * @see org.pnml.tools.epnk.annotations.netannotations.NetAnnotation#getNet()
	 * @see #getNetAnnotation()
	 * @generated
	 */
	EReference getNetAnnotation_Net();

	/**
	 * Returns the meta object for the reference list '{@link org.pnml.tools.epnk.annotations.netannotations.NetAnnotation#getObjectAnnotations <em>Object Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Object Annotations</em>'.
	 * @see org.pnml.tools.epnk.annotations.netannotations.NetAnnotation#getObjectAnnotations()
	 * @see #getNetAnnotation()
	 * @generated
	 */
	EReference getNetAnnotation_ObjectAnnotations();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.annotations.netannotations.ObjectAnnotation <em>Object Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Annotation</em>'.
	 * @see org.pnml.tools.epnk.annotations.netannotations.ObjectAnnotation
	 * @generated
	 */
	EClass getObjectAnnotation();

	/**
	 * Returns the meta object for the reference list '{@link org.pnml.tools.epnk.annotations.netannotations.ObjectAnnotation#getNetAnnotations <em>Net Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Net Annotations</em>'.
	 * @see org.pnml.tools.epnk.annotations.netannotations.ObjectAnnotation#getNetAnnotations()
	 * @see #getObjectAnnotation()
	 * @generated
	 */
	EReference getObjectAnnotation_NetAnnotations();

	/**
	 * Returns the meta object for the reference '{@link org.pnml.tools.epnk.annotations.netannotations.ObjectAnnotation#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Object</em>'.
	 * @see org.pnml.tools.epnk.annotations.netannotations.ObjectAnnotation#getObject()
	 * @see #getObjectAnnotation()
	 * @generated
	 */
	EReference getObjectAnnotation_Object();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.annotations.netannotations.NetAnnotations <em>Net Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Net Annotations</em>'.
	 * @see org.pnml.tools.epnk.annotations.netannotations.NetAnnotations
	 * @generated
	 */
	EClass getNetAnnotations();

	/**
	 * Returns the meta object for the containment reference list '{@link org.pnml.tools.epnk.annotations.netannotations.NetAnnotations#getNetAnnotations <em>Net Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Net Annotations</em>'.
	 * @see org.pnml.tools.epnk.annotations.netannotations.NetAnnotations#getNetAnnotations()
	 * @see #getNetAnnotations()
	 * @generated
	 */
	EReference getNetAnnotations_NetAnnotations();

	/**
	 * Returns the meta object for the containment reference list '{@link org.pnml.tools.epnk.annotations.netannotations.NetAnnotations#getObjectAnnotations <em>Object Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Object Annotations</em>'.
	 * @see org.pnml.tools.epnk.annotations.netannotations.NetAnnotations#getObjectAnnotations()
	 * @see #getNetAnnotations()
	 * @generated
	 */
	EReference getNetAnnotations_ObjectAnnotations();

	/**
	 * Returns the meta object for the attribute '{@link org.pnml.tools.epnk.annotations.netannotations.NetAnnotations#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.pnml.tools.epnk.annotations.netannotations.NetAnnotations#getName()
	 * @see #getNetAnnotations()
	 * @generated
	 */
	EAttribute getNetAnnotations_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.pnml.tools.epnk.annotations.netannotations.NetAnnotations#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.pnml.tools.epnk.annotations.netannotations.NetAnnotations#getDescription()
	 * @see #getNetAnnotations()
	 * @generated
	 */
	EAttribute getNetAnnotations_Description();

	/**
	 * Returns the meta object for the reference '{@link org.pnml.tools.epnk.annotations.netannotations.NetAnnotations#getCurrent <em>Current</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current</em>'.
	 * @see org.pnml.tools.epnk.annotations.netannotations.NetAnnotations#getCurrent()
	 * @see #getNetAnnotations()
	 * @generated
	 */
	EReference getNetAnnotations_Current();

	/**
	 * Returns the meta object for the attribute '{@link org.pnml.tools.epnk.annotations.netannotations.NetAnnotations#getAppId <em>App Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>App Id</em>'.
	 * @see org.pnml.tools.epnk.annotations.netannotations.NetAnnotations#getAppId()
	 * @see #getNetAnnotations()
	 * @generated
	 */
	EAttribute getNetAnnotations_AppId();

	/**
	 * Returns the meta object for the attribute '{@link org.pnml.tools.epnk.annotations.netannotations.NetAnnotations#getAppVersion <em>App Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>App Version</em>'.
	 * @see org.pnml.tools.epnk.annotations.netannotations.NetAnnotations#getAppVersion()
	 * @see #getNetAnnotations()
	 * @generated
	 */
	EAttribute getNetAnnotations_AppVersion();

	/**
	 * Returns the meta object for the attribute '{@link org.pnml.tools.epnk.annotations.netannotations.NetAnnotations#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see org.pnml.tools.epnk.annotations.netannotations.NetAnnotations#getDate()
	 * @see #getNetAnnotations()
	 * @generated
	 */
	EAttribute getNetAnnotations_Date();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.annotations.netannotations.TextualAnnotation <em>Textual Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Textual Annotation</em>'.
	 * @see org.pnml.tools.epnk.annotations.netannotations.TextualAnnotation
	 * @generated
	 */
	EClass getTextualAnnotation();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.annotations.netannotations.StructuredAnnotation <em>Structured Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structured Annotation</em>'.
	 * @see org.pnml.tools.epnk.annotations.netannotations.StructuredAnnotation
	 * @generated
	 */
	EClass getStructuredAnnotation();

	/**
	 * Returns the meta object for the attribute '{@link org.pnml.tools.epnk.annotations.netannotations.StructuredAnnotation#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.pnml.tools.epnk.annotations.netannotations.StructuredAnnotation#getText()
	 * @see #getStructuredAnnotation()
	 * @generated
	 */
	EAttribute getStructuredAnnotation_Text();

	/**
	 * Returns the meta object for the attribute '{@link org.pnml.tools.epnk.annotations.netannotations.StructuredAnnotation#isValid <em>Valid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid</em>'.
	 * @see org.pnml.tools.epnk.annotations.netannotations.StructuredAnnotation#isValid()
	 * @see #getStructuredAnnotation()
	 * @generated
	 */
	EAttribute getStructuredAnnotation_Valid();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.annotations.netannotations.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation</em>'.
	 * @see org.pnml.tools.epnk.annotations.netannotations.Annotation
	 * @generated
	 */
	EClass getAnnotation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	NetannotationsFactory getNetannotationsFactory();

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
		 * The meta object literal for the '{@link org.pnml.tools.epnk.annotations.netannotations.impl.NetAnnotationImpl <em>Net Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.annotations.netannotations.impl.NetAnnotationImpl
		 * @see org.pnml.tools.epnk.annotations.netannotations.impl.NetannotationsPackageImpl#getNetAnnotation()
		 * @generated
		 */
		EClass NET_ANNOTATION = eINSTANCE.getNetAnnotation();

		/**
		 * The meta object literal for the '<em><b>Net</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NET_ANNOTATION__NET = eINSTANCE.getNetAnnotation_Net();

		/**
		 * The meta object literal for the '<em><b>Object Annotations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NET_ANNOTATION__OBJECT_ANNOTATIONS = eINSTANCE.getNetAnnotation_ObjectAnnotations();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.annotations.netannotations.impl.ObjectAnnotationImpl <em>Object Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.annotations.netannotations.impl.ObjectAnnotationImpl
		 * @see org.pnml.tools.epnk.annotations.netannotations.impl.NetannotationsPackageImpl#getObjectAnnotation()
		 * @generated
		 */
		EClass OBJECT_ANNOTATION = eINSTANCE.getObjectAnnotation();

		/**
		 * The meta object literal for the '<em><b>Net Annotations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_ANNOTATION__NET_ANNOTATIONS = eINSTANCE.getObjectAnnotation_NetAnnotations();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_ANNOTATION__OBJECT = eINSTANCE.getObjectAnnotation_Object();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.annotations.netannotations.impl.NetAnnotationsImpl <em>Net Annotations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.annotations.netannotations.impl.NetAnnotationsImpl
		 * @see org.pnml.tools.epnk.annotations.netannotations.impl.NetannotationsPackageImpl#getNetAnnotations()
		 * @generated
		 */
		EClass NET_ANNOTATIONS = eINSTANCE.getNetAnnotations();

		/**
		 * The meta object literal for the '<em><b>Net Annotations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NET_ANNOTATIONS__NET_ANNOTATIONS = eINSTANCE.getNetAnnotations_NetAnnotations();

		/**
		 * The meta object literal for the '<em><b>Object Annotations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NET_ANNOTATIONS__OBJECT_ANNOTATIONS = eINSTANCE.getNetAnnotations_ObjectAnnotations();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NET_ANNOTATIONS__NAME = eINSTANCE.getNetAnnotations_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NET_ANNOTATIONS__DESCRIPTION = eINSTANCE.getNetAnnotations_Description();

		/**
		 * The meta object literal for the '<em><b>Current</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NET_ANNOTATIONS__CURRENT = eINSTANCE.getNetAnnotations_Current();

		/**
		 * The meta object literal for the '<em><b>App Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NET_ANNOTATIONS__APP_ID = eINSTANCE.getNetAnnotations_AppId();

		/**
		 * The meta object literal for the '<em><b>App Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NET_ANNOTATIONS__APP_VERSION = eINSTANCE.getNetAnnotations_AppVersion();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NET_ANNOTATIONS__DATE = eINSTANCE.getNetAnnotations_Date();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.annotations.netannotations.impl.TextualAnnotationImpl <em>Textual Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.annotations.netannotations.impl.TextualAnnotationImpl
		 * @see org.pnml.tools.epnk.annotations.netannotations.impl.NetannotationsPackageImpl#getTextualAnnotation()
		 * @generated
		 */
		EClass TEXTUAL_ANNOTATION = eINSTANCE.getTextualAnnotation();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.annotations.netannotations.impl.StructuredAnnotationImpl <em>Structured Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.annotations.netannotations.impl.StructuredAnnotationImpl
		 * @see org.pnml.tools.epnk.annotations.netannotations.impl.NetannotationsPackageImpl#getStructuredAnnotation()
		 * @generated
		 */
		EClass STRUCTURED_ANNOTATION = eINSTANCE.getStructuredAnnotation();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRUCTURED_ANNOTATION__TEXT = eINSTANCE.getStructuredAnnotation_Text();

		/**
		 * The meta object literal for the '<em><b>Valid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRUCTURED_ANNOTATION__VALID = eINSTANCE.getStructuredAnnotation_Valid();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.annotations.netannotations.impl.AnnotationImpl <em>Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.annotations.netannotations.impl.AnnotationImpl
		 * @see org.pnml.tools.epnk.annotations.netannotations.impl.NetannotationsPackageImpl#getAnnotation()
		 * @generated
		 */
		EClass ANNOTATION = eINSTANCE.getAnnotation();

	}

} //NetannotationsPackage

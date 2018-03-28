/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Appearence;

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
 * @see Appearence.AppearenceFactory
 * @model kind="package"
 * @generated
 */
public interface AppearencePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Appearence";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "Appearence";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Appearence";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AppearencePackage eINSTANCE = Appearence.impl.AppearencePackageImpl.init();

	/**
	 * The meta object id for the '{@link Appearence.impl.ShapesImpl <em>Shapes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Appearence.impl.ShapesImpl
	 * @see Appearence.impl.AppearencePackageImpl#getShapes()
	 * @generated
	 */
	int SHAPES = 0;

	/**
	 * The feature id for the '<em><b>Appearence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPES__APPEARENCE = 0;

	/**
	 * The number of structural features of the '<em>Shapes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPES_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link Appearence.impl.ShapeImpl <em>Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Appearence.impl.ShapeImpl
	 * @see Appearence.impl.AppearencePackageImpl#getShape()
	 * @generated
	 */
	int SHAPE = 1;

	/**
	 * The feature id for the '<em><b>Object String Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__OBJECT_STRING_PATH = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link Appearence.Shapes <em>Shapes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shapes</em>'.
	 * @see Appearence.Shapes
	 * @generated
	 */
	EClass getShapes();

	/**
	 * Returns the meta object for the containment reference list '{@link Appearence.Shapes#getAppearence <em>Appearence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Appearence</em>'.
	 * @see Appearence.Shapes#getAppearence()
	 * @see #getShapes()
	 * @generated
	 */
	EReference getShapes_Appearence();

	/**
	 * Returns the meta object for class '{@link Appearence.Shape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shape</em>'.
	 * @see Appearence.Shape
	 * @generated
	 */
	EClass getShape();

	/**
	 * Returns the meta object for the attribute '{@link Appearence.Shape#getObjectStringPath <em>Object String Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object String Path</em>'.
	 * @see Appearence.Shape#getObjectStringPath()
	 * @see #getShape()
	 * @generated
	 */
	EAttribute getShape_ObjectStringPath();

	/**
	 * Returns the meta object for the attribute '{@link Appearence.Shape#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Appearence.Shape#getId()
	 * @see #getShape()
	 * @generated
	 */
	EAttribute getShape_Id();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AppearenceFactory getAppearenceFactory();

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
		 * The meta object literal for the '{@link Appearence.impl.ShapesImpl <em>Shapes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Appearence.impl.ShapesImpl
		 * @see Appearence.impl.AppearencePackageImpl#getShapes()
		 * @generated
		 */
		EClass SHAPES = eINSTANCE.getShapes();

		/**
		 * The meta object literal for the '<em><b>Appearence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHAPES__APPEARENCE = eINSTANCE.getShapes_Appearence();

		/**
		 * The meta object literal for the '{@link Appearence.impl.ShapeImpl <em>Shape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Appearence.impl.ShapeImpl
		 * @see Appearence.impl.AppearencePackageImpl#getShape()
		 * @generated
		 */
		EClass SHAPE = eINSTANCE.getShape();

		/**
		 * The meta object literal for the '<em><b>Object String Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHAPE__OBJECT_STRING_PATH = eINSTANCE.getShape_ObjectStringPath();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHAPE__ID = eINSTANCE.getShape_Id();

	}

} //AppearencePackage

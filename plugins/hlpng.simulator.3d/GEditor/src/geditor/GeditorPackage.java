/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package geditor;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains
 * accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see geditor.GeditorFactory
 * @model kind="package"
 * @generated
 */
public interface GeditorPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "geditor";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://geditor/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "geditor";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	GeditorPackage eINSTANCE = geditor.impl.GeditorPackageImpl.init();

	/**
	 * The meta object id for the '{@link geditor.impl.GeometryImpl <em>Geometry</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see geditor.impl.GeometryImpl
	 * @see geditor.impl.GeditorPackageImpl#getGeometry()
	 * @generated
	 */
	int GEOMETRY = 0;

	/**
	 * The feature id for the '<em><b>Geometry Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY__GEOMETRY_OBJECTS = 0;

	/**
	 * The feature id for the '<em><b>Global Appearance Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY__GLOBAL_APPEARANCE_PATH = 1;

	/**
	 * The number of structural features of the '<em>Geometry</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link geditor.impl.GObjectImpl <em>GObject</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see geditor.impl.GObjectImpl
	 * @see geditor.impl.GeditorPackageImpl#getGObject()
	 * @generated
	 */
	int GOBJECT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GOBJECT__ID = 0;

	/**
	 * The feature id for the '<em><b>Appearance Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOBJECT__APPEARANCE_PATH = 1;

	/**
	 * The number of structural features of the '<em>GObject</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GOBJECT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link geditor.impl.PointImpl <em>Point</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see geditor.impl.PointImpl
	 * @see geditor.impl.GeditorPackageImpl#getPoint()
	 * @generated
	 */
	int POINT = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int POINT__ID = GOBJECT__ID;

	/**
	 * The feature id for the '<em><b>Appearance Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__APPEARANCE_PATH = GOBJECT__APPEARANCE_PATH;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__X = GOBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__Y = GOBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__Z = GOBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Point</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int POINT_FEATURE_COUNT = GOBJECT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link geditor.impl.ArcImpl <em>Arc</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see geditor.impl.ArcImpl
	 * @see geditor.impl.GeditorPackageImpl#getArc()
	 * @generated
	 */
	int ARC = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ARC__ID = GOBJECT__ID;

	/**
	 * The feature id for the '<em><b>Appearance Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__APPEARANCE_PATH = GOBJECT__APPEARANCE_PATH;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ARC__START = GOBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ARC__END = GOBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Control Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__CONTROL_POINTS = GOBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Arc</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ARC_FEATURE_COUNT = GOBJECT_FEATURE_COUNT + 3;

	/**
	 * Returns the meta object for class '{@link geditor.Geometry <em>Geometry</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Geometry</em>'.
	 * @see geditor.Geometry
	 * @generated
	 */
	EClass getGeometry();

	/**
	 * Returns the meta object for the containment reference list '{@link geditor.Geometry#getGeometryObjects <em>Geometry Objects</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Geometry Objects</em>'.
	 * @see geditor.Geometry#getGeometryObjects()
	 * @see #getGeometry()
	 * @generated
	 */
	EReference getGeometry_GeometryObjects();

	/**
	 * Returns the meta object for the attribute '{@link geditor.Geometry#getGlobalAppearancePath <em>Global Appearance Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Global Appearance Path</em>'.
	 * @see geditor.Geometry#getGlobalAppearancePath()
	 * @see #getGeometry()
	 * @generated
	 */
	EAttribute getGeometry_GlobalAppearancePath();

	/**
	 * Returns the meta object for class '{@link geditor.GObject <em>GObject</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>GObject</em>'.
	 * @see geditor.GObject
	 * @generated
	 */
	EClass getGObject();

	/**
	 * Returns the meta object for the attribute '{@link geditor.GObject#getId <em>Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see geditor.GObject#getId()
	 * @see #getGObject()
	 * @generated
	 */
	EAttribute getGObject_Id();

	/**
	 * Returns the meta object for the attribute '{@link geditor.GObject#getAppearancePath <em>Appearance Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Appearance Path</em>'.
	 * @see geditor.GObject#getAppearancePath()
	 * @see #getGObject()
	 * @generated
	 */
	EAttribute getGObject_AppearancePath();

	/**
	 * Returns the meta object for class '{@link geditor.Point <em>Point</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Point</em>'.
	 * @see geditor.Point
	 * @generated
	 */
	EClass getPoint();

	/**
	 * Returns the meta object for the attribute '{@link geditor.Point#getX <em>X</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see geditor.Point#getX()
	 * @see #getPoint()
	 * @generated
	 */
	EAttribute getPoint_X();

	/**
	 * Returns the meta object for the attribute '{@link geditor.Point#getY <em>Y</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see geditor.Point#getY()
	 * @see #getPoint()
	 * @generated
	 */
	EAttribute getPoint_Y();

	/**
	 * Returns the meta object for the attribute '{@link geditor.Point#getZ <em>Z</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Z</em>'.
	 * @see geditor.Point#getZ()
	 * @see #getPoint()
	 * @generated
	 */
	EAttribute getPoint_Z();

	/**
	 * Returns the meta object for class '{@link geditor.Arc <em>Arc</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc</em>'.
	 * @see geditor.Arc
	 * @generated
	 */
	EClass getArc();

	/**
	 * Returns the meta object for the reference '{@link geditor.Arc#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see geditor.Arc#getStart()
	 * @see #getArc()
	 * @generated
	 */
	EReference getArc_Start();

	/**
	 * Returns the meta object for the reference '{@link geditor.Arc#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see geditor.Arc#getEnd()
	 * @see #getArc()
	 * @generated
	 */
	EReference getArc_End();

	/**
	 * Returns the meta object for the containment reference list '{@link geditor.Arc#getControlPoints <em>Control Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Control Points</em>'.
	 * @see geditor.Arc#getControlPoints()
	 * @see #getArc()
	 * @generated
	 */
	EReference getArc_ControlPoints();

	/**
	 * Returns the factory that creates the instances of the model. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GeditorFactory getGeditorFactory();

	/**
	 * <!-- begin-user-doc --> Defines literals for the meta objects that
	 * represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link geditor.impl.GeometryImpl
		 * <em>Geometry</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @see geditor.impl.GeometryImpl
		 * @see geditor.impl.GeditorPackageImpl#getGeometry()
		 * @generated
		 */
		EClass GEOMETRY = eINSTANCE.getGeometry();

		/**
		 * The meta object literal for the '<em><b>Geometry Objects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference GEOMETRY__GEOMETRY_OBJECTS = eINSTANCE.getGeometry_GeometryObjects();

		/**
		 * The meta object literal for the '<em><b>Global Appearance Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEOMETRY__GLOBAL_APPEARANCE_PATH = eINSTANCE.getGeometry_GlobalAppearancePath();

		/**
		 * The meta object literal for the '{@link geditor.impl.GObjectImpl
		 * <em>GObject</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @see geditor.impl.GObjectImpl
		 * @see geditor.impl.GeditorPackageImpl#getGObject()
		 * @generated
		 */
		EClass GOBJECT = eINSTANCE.getGObject();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOBJECT__ID = eINSTANCE.getGObject_Id();

		/**
		 * The meta object literal for the '<em><b>Appearance Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOBJECT__APPEARANCE_PATH = eINSTANCE.getGObject_AppearancePath();

		/**
		 * The meta object literal for the '{@link geditor.impl.PointImpl <em>Point</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see geditor.impl.PointImpl
		 * @see geditor.impl.GeditorPackageImpl#getPoint()
		 * @generated
		 */
		EClass POINT = eINSTANCE.getPoint();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT__X = eINSTANCE.getPoint_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT__Y = eINSTANCE.getPoint_Y();

		/**
		 * The meta object literal for the '<em><b>Z</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT__Z = eINSTANCE.getPoint_Z();

		/**
		 * The meta object literal for the '{@link geditor.impl.ArcImpl <em>Arc</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see geditor.impl.ArcImpl
		 * @see geditor.impl.GeditorPackageImpl#getArc()
		 * @generated
		 */
		EClass ARC = eINSTANCE.getArc();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARC__START = eINSTANCE.getArc_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARC__END = eINSTANCE.getArc_End();

		/**
		 * The meta object literal for the '<em><b>Control Points</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARC__CONTROL_POINTS = eINSTANCE.getArc_ControlPoints();

	}

} // GeditorPackage

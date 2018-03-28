/**
 */
package dk.dtu.compute.mbse.yawl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage;

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
 * @see dk.dtu.compute.mbse.yawl.YawlFactory
 * @model kind="package"
 * @generated
 */
public interface YawlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "yawl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://se.compute.dtu.dk/mbse/yawl";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "yawl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	YawlPackage eINSTANCE = dk.dtu.compute.mbse.yawl.impl.YawlPackageImpl.init();

	/**
	 * The meta object id for the '{@link dk.dtu.compute.mbse.yawl.impl.YAWLNetImpl <em>YAWL Net</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.compute.mbse.yawl.impl.YAWLNetImpl
	 * @see dk.dtu.compute.mbse.yawl.impl.YawlPackageImpl#getYAWLNet()
	 * @generated
	 */
	int YAWL_NET = 0;

	/**
	 * The number of structural features of the '<em>YAWL Net</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YAWL_NET_FEATURE_COUNT = PnmlcoremodelPackage.PETRI_NET_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.dtu.compute.mbse.yawl.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.compute.mbse.yawl.impl.ConditionImpl
	 * @see dk.dtu.compute.mbse.yawl.impl.YawlPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__ID = PnmlcoremodelPackage.PLACE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__NAME = PnmlcoremodelPackage.PLACE__NAME;

	/**
	 * The feature id for the '<em><b>Toolspecific</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__TOOLSPECIFIC = PnmlcoremodelPackage.PLACE__TOOLSPECIFIC;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__GRAPHICS = PnmlcoremodelPackage.PLACE__GRAPHICS;

	/**
	 * The feature id for the '<em><b>Unknown</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__UNKNOWN = PnmlcoremodelPackage.PLACE__UNKNOWN;

	/**
	 * The feature id for the '<em><b>Out</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__OUT = PnmlcoremodelPackage.PLACE__OUT;

	/**
	 * The feature id for the '<em><b>In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__IN = PnmlcoremodelPackage.PLACE__IN;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__TYPE = PnmlcoremodelPackage.PLACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = PnmlcoremodelPackage.PLACE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link dk.dtu.compute.mbse.yawl.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.compute.mbse.yawl.impl.ActionImpl
	 * @see dk.dtu.compute.mbse.yawl.impl.YawlPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ID = PnmlcoremodelPackage.TRANSITION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NAME = PnmlcoremodelPackage.TRANSITION__NAME;

	/**
	 * The feature id for the '<em><b>Toolspecific</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__TOOLSPECIFIC = PnmlcoremodelPackage.TRANSITION__TOOLSPECIFIC;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__GRAPHICS = PnmlcoremodelPackage.TRANSITION__GRAPHICS;

	/**
	 * The feature id for the '<em><b>Unknown</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__UNKNOWN = PnmlcoremodelPackage.TRANSITION__UNKNOWN;

	/**
	 * The feature id for the '<em><b>Out</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__OUT = PnmlcoremodelPackage.TRANSITION__OUT;

	/**
	 * The feature id for the '<em><b>In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__IN = PnmlcoremodelPackage.TRANSITION__IN;

	/**
	 * The feature id for the '<em><b>Jointype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__JOINTYPE = PnmlcoremodelPackage.TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Split Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__SPLIT_TYPE = PnmlcoremodelPackage.TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = PnmlcoremodelPackage.TRANSITION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link dk.dtu.compute.mbse.yawl.impl.ConditionTypeImpl <em>Condition Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.compute.mbse.yawl.impl.ConditionTypeImpl
	 * @see dk.dtu.compute.mbse.yawl.impl.YawlPackageImpl#getConditionType()
	 * @generated
	 */
	int CONDITION_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Toolspecific</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_TYPE__TOOLSPECIFIC = PnmlcoremodelPackage.ATTRIBUTE__TOOLSPECIFIC;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_TYPE__GRAPHICS = PnmlcoremodelPackage.ATTRIBUTE__GRAPHICS;

	/**
	 * The feature id for the '<em><b>Unknown</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_TYPE__UNKNOWN = PnmlcoremodelPackage.ATTRIBUTE__UNKNOWN;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_TYPE__TEXT = PnmlcoremodelPackage.ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Condition Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_TYPE_FEATURE_COUNT = PnmlcoremodelPackage.ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link dk.dtu.compute.mbse.yawl.impl.TransitionTypeImpl <em>Transition Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.compute.mbse.yawl.impl.TransitionTypeImpl
	 * @see dk.dtu.compute.mbse.yawl.impl.YawlPackageImpl#getTransitionType()
	 * @generated
	 */
	int TRANSITION_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Toolspecific</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE__TOOLSPECIFIC = PnmlcoremodelPackage.ATTRIBUTE__TOOLSPECIFIC;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE__GRAPHICS = PnmlcoremodelPackage.ATTRIBUTE__GRAPHICS;

	/**
	 * The feature id for the '<em><b>Unknown</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE__UNKNOWN = PnmlcoremodelPackage.ATTRIBUTE__UNKNOWN;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE__TEXT = PnmlcoremodelPackage.ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Transition Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE_FEATURE_COUNT = PnmlcoremodelPackage.ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link dk.dtu.compute.mbse.yawl.impl.ArcImpl <em>Arc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.compute.mbse.yawl.impl.ArcImpl
	 * @see dk.dtu.compute.mbse.yawl.impl.YawlPackageImpl#getArc()
	 * @generated
	 */
	int ARC = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__ID = PnmlcoremodelPackage.ARC__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__NAME = PnmlcoremodelPackage.ARC__NAME;

	/**
	 * The feature id for the '<em><b>Toolspecific</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__TOOLSPECIFIC = PnmlcoremodelPackage.ARC__TOOLSPECIFIC;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__GRAPHICS = PnmlcoremodelPackage.ARC__GRAPHICS;

	/**
	 * The feature id for the '<em><b>Unknown</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__UNKNOWN = PnmlcoremodelPackage.ARC__UNKNOWN;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__SOURCE = PnmlcoremodelPackage.ARC__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__TARGET = PnmlcoremodelPackage.ARC__TARGET;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__TYPE = PnmlcoremodelPackage.ARC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_FEATURE_COUNT = PnmlcoremodelPackage.ARC_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link dk.dtu.compute.mbse.yawl.impl.ArcTypeImpl <em>Arc Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.compute.mbse.yawl.impl.ArcTypeImpl
	 * @see dk.dtu.compute.mbse.yawl.impl.YawlPackageImpl#getArcType()
	 * @generated
	 */
	int ARC_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Toolspecific</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_TYPE__TOOLSPECIFIC = PnmlcoremodelPackage.ATTRIBUTE__TOOLSPECIFIC;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_TYPE__GRAPHICS = PnmlcoremodelPackage.ATTRIBUTE__GRAPHICS;

	/**
	 * The feature id for the '<em><b>Unknown</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_TYPE__UNKNOWN = PnmlcoremodelPackage.ATTRIBUTE__UNKNOWN;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_TYPE__TEXT = PnmlcoremodelPackage.ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Arc Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_TYPE_FEATURE_COUNT = PnmlcoremodelPackage.ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link dk.dtu.compute.mbse.yawl.CType <em>CType</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.compute.mbse.yawl.CType
	 * @see dk.dtu.compute.mbse.yawl.impl.YawlPackageImpl#getCType()
	 * @generated
	 */
	int CTYPE = 7;

	/**
	 * The meta object id for the '{@link dk.dtu.compute.mbse.yawl.TType <em>TType</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.compute.mbse.yawl.TType
	 * @see dk.dtu.compute.mbse.yawl.impl.YawlPackageImpl#getTType()
	 * @generated
	 */
	int TTYPE = 8;

	/**
	 * The meta object id for the '{@link dk.dtu.compute.mbse.yawl.AType <em>AType</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.compute.mbse.yawl.AType
	 * @see dk.dtu.compute.mbse.yawl.impl.YawlPackageImpl#getAType()
	 * @generated
	 */
	int ATYPE = 9;


	/**
	 * Returns the meta object for class '{@link dk.dtu.compute.mbse.yawl.YAWLNet <em>YAWL Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YAWL Net</em>'.
	 * @see dk.dtu.compute.mbse.yawl.YAWLNet
	 * @generated
	 */
	EClass getYAWLNet();

	/**
	 * Returns the meta object for class '{@link dk.dtu.compute.mbse.yawl.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see dk.dtu.compute.mbse.yawl.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the containment reference '{@link dk.dtu.compute.mbse.yawl.Condition#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see dk.dtu.compute.mbse.yawl.Condition#getType()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_Type();

	/**
	 * Returns the meta object for class '{@link dk.dtu.compute.mbse.yawl.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see dk.dtu.compute.mbse.yawl.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the containment reference '{@link dk.dtu.compute.mbse.yawl.Action#getJointype <em>Jointype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Jointype</em>'.
	 * @see dk.dtu.compute.mbse.yawl.Action#getJointype()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Jointype();

	/**
	 * Returns the meta object for the containment reference '{@link dk.dtu.compute.mbse.yawl.Action#getSplitType <em>Split Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Split Type</em>'.
	 * @see dk.dtu.compute.mbse.yawl.Action#getSplitType()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_SplitType();

	/**
	 * Returns the meta object for class '{@link dk.dtu.compute.mbse.yawl.ConditionType <em>Condition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition Type</em>'.
	 * @see dk.dtu.compute.mbse.yawl.ConditionType
	 * @generated
	 */
	EClass getConditionType();

	/**
	 * Returns the meta object for the attribute '{@link dk.dtu.compute.mbse.yawl.ConditionType#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see dk.dtu.compute.mbse.yawl.ConditionType#getText()
	 * @see #getConditionType()
	 * @generated
	 */
	EAttribute getConditionType_Text();

	/**
	 * Returns the meta object for class '{@link dk.dtu.compute.mbse.yawl.TransitionType <em>Transition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition Type</em>'.
	 * @see dk.dtu.compute.mbse.yawl.TransitionType
	 * @generated
	 */
	EClass getTransitionType();

	/**
	 * Returns the meta object for the attribute '{@link dk.dtu.compute.mbse.yawl.TransitionType#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see dk.dtu.compute.mbse.yawl.TransitionType#getText()
	 * @see #getTransitionType()
	 * @generated
	 */
	EAttribute getTransitionType_Text();

	/**
	 * Returns the meta object for class '{@link dk.dtu.compute.mbse.yawl.Arc <em>Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc</em>'.
	 * @see dk.dtu.compute.mbse.yawl.Arc
	 * @generated
	 */
	EClass getArc();

	/**
	 * Returns the meta object for the containment reference '{@link dk.dtu.compute.mbse.yawl.Arc#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see dk.dtu.compute.mbse.yawl.Arc#getType()
	 * @see #getArc()
	 * @generated
	 */
	EReference getArc_Type();

	/**
	 * Returns the meta object for class '{@link dk.dtu.compute.mbse.yawl.ArcType <em>Arc Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc Type</em>'.
	 * @see dk.dtu.compute.mbse.yawl.ArcType
	 * @generated
	 */
	EClass getArcType();

	/**
	 * Returns the meta object for the attribute '{@link dk.dtu.compute.mbse.yawl.ArcType#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see dk.dtu.compute.mbse.yawl.ArcType#getText()
	 * @see #getArcType()
	 * @generated
	 */
	EAttribute getArcType_Text();

	/**
	 * Returns the meta object for enum '{@link dk.dtu.compute.mbse.yawl.CType <em>CType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>CType</em>'.
	 * @see dk.dtu.compute.mbse.yawl.CType
	 * @generated
	 */
	EEnum getCType();

	/**
	 * Returns the meta object for enum '{@link dk.dtu.compute.mbse.yawl.TType <em>TType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TType</em>'.
	 * @see dk.dtu.compute.mbse.yawl.TType
	 * @generated
	 */
	EEnum getTType();

	/**
	 * Returns the meta object for enum '{@link dk.dtu.compute.mbse.yawl.AType <em>AType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>AType</em>'.
	 * @see dk.dtu.compute.mbse.yawl.AType
	 * @generated
	 */
	EEnum getAType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	YawlFactory getYawlFactory();

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
		 * The meta object literal for the '{@link dk.dtu.compute.mbse.yawl.impl.YAWLNetImpl <em>YAWL Net</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.compute.mbse.yawl.impl.YAWLNetImpl
		 * @see dk.dtu.compute.mbse.yawl.impl.YawlPackageImpl#getYAWLNet()
		 * @generated
		 */
		EClass YAWL_NET = eINSTANCE.getYAWLNet();

		/**
		 * The meta object literal for the '{@link dk.dtu.compute.mbse.yawl.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.compute.mbse.yawl.impl.ConditionImpl
		 * @see dk.dtu.compute.mbse.yawl.impl.YawlPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION__TYPE = eINSTANCE.getCondition_Type();

		/**
		 * The meta object literal for the '{@link dk.dtu.compute.mbse.yawl.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.compute.mbse.yawl.impl.ActionImpl
		 * @see dk.dtu.compute.mbse.yawl.impl.YawlPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Jointype</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__JOINTYPE = eINSTANCE.getAction_Jointype();

		/**
		 * The meta object literal for the '<em><b>Split Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__SPLIT_TYPE = eINSTANCE.getAction_SplitType();

		/**
		 * The meta object literal for the '{@link dk.dtu.compute.mbse.yawl.impl.ConditionTypeImpl <em>Condition Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.compute.mbse.yawl.impl.ConditionTypeImpl
		 * @see dk.dtu.compute.mbse.yawl.impl.YawlPackageImpl#getConditionType()
		 * @generated
		 */
		EClass CONDITION_TYPE = eINSTANCE.getConditionType();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION_TYPE__TEXT = eINSTANCE.getConditionType_Text();

		/**
		 * The meta object literal for the '{@link dk.dtu.compute.mbse.yawl.impl.TransitionTypeImpl <em>Transition Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.compute.mbse.yawl.impl.TransitionTypeImpl
		 * @see dk.dtu.compute.mbse.yawl.impl.YawlPackageImpl#getTransitionType()
		 * @generated
		 */
		EClass TRANSITION_TYPE = eINSTANCE.getTransitionType();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION_TYPE__TEXT = eINSTANCE.getTransitionType_Text();

		/**
		 * The meta object literal for the '{@link dk.dtu.compute.mbse.yawl.impl.ArcImpl <em>Arc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.compute.mbse.yawl.impl.ArcImpl
		 * @see dk.dtu.compute.mbse.yawl.impl.YawlPackageImpl#getArc()
		 * @generated
		 */
		EClass ARC = eINSTANCE.getArc();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARC__TYPE = eINSTANCE.getArc_Type();

		/**
		 * The meta object literal for the '{@link dk.dtu.compute.mbse.yawl.impl.ArcTypeImpl <em>Arc Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.compute.mbse.yawl.impl.ArcTypeImpl
		 * @see dk.dtu.compute.mbse.yawl.impl.YawlPackageImpl#getArcType()
		 * @generated
		 */
		EClass ARC_TYPE = eINSTANCE.getArcType();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARC_TYPE__TEXT = eINSTANCE.getArcType_Text();

		/**
		 * The meta object literal for the '{@link dk.dtu.compute.mbse.yawl.CType <em>CType</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.compute.mbse.yawl.CType
		 * @see dk.dtu.compute.mbse.yawl.impl.YawlPackageImpl#getCType()
		 * @generated
		 */
		EEnum CTYPE = eINSTANCE.getCType();

		/**
		 * The meta object literal for the '{@link dk.dtu.compute.mbse.yawl.TType <em>TType</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.compute.mbse.yawl.TType
		 * @see dk.dtu.compute.mbse.yawl.impl.YawlPackageImpl#getTType()
		 * @generated
		 */
		EEnum TTYPE = eINSTANCE.getTType();

		/**
		 * The meta object literal for the '{@link dk.dtu.compute.mbse.yawl.AType <em>AType</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.compute.mbse.yawl.AType
		 * @see dk.dtu.compute.mbse.yawl.impl.YawlPackageImpl#getAType()
		 * @generated
		 */
		EEnum ATYPE = eINSTANCE.getAType();

	}

} //YawlPackage

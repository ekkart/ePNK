/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.test.type.refnodeextensions;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage;

import org.pnml.tools.epnk.pntypes.ptnet.PtnetPackage;

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
 * @see org.pnml.tools.epnk.test.type.refnodeextensions.RefnodeextensionsFactory
 * @model kind="package"
 * @generated
 */
public interface RefnodeextensionsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "refnodeextensions";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.pnml.tools/epnk/test/types/ptnetrefnodeextensions/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "refnodeext";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RefnodeextensionsPackage eINSTANCE = org.pnml.tools.epnk.test.type.refnodeextensions.impl.RefnodeextensionsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.test.type.refnodeextensions.impl.RefNodeExtensionImpl <em>Ref Node Extension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.test.type.refnodeextensions.impl.RefNodeExtensionImpl
	 * @see org.pnml.tools.epnk.test.type.refnodeextensions.impl.RefnodeextensionsPackageImpl#getRefNodeExtension()
	 * @generated
	 */
	int REF_NODE_EXTENSION = 0;

	/**
	 * The number of structural features of the '<em>Ref Node Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_NODE_EXTENSION_FEATURE_COUNT = PtnetPackage.PT_NET_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.test.type.refnodeextensions.impl.RefPlaceImpl <em>Ref Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.test.type.refnodeextensions.impl.RefPlaceImpl
	 * @see org.pnml.tools.epnk.test.type.refnodeextensions.impl.RefnodeextensionsPackageImpl#getRefPlace()
	 * @generated
	 */
	int REF_PLACE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_PLACE__ID = PnmlcoremodelPackage.REF_PLACE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_PLACE__NAME = PnmlcoremodelPackage.REF_PLACE__NAME;

	/**
	 * The feature id for the '<em><b>Toolspecific</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_PLACE__TOOLSPECIFIC = PnmlcoremodelPackage.REF_PLACE__TOOLSPECIFIC;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_PLACE__GRAPHICS = PnmlcoremodelPackage.REF_PLACE__GRAPHICS;

	/**
	 * The feature id for the '<em><b>Unknown</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_PLACE__UNKNOWN = PnmlcoremodelPackage.REF_PLACE__UNKNOWN;

	/**
	 * The feature id for the '<em><b>Out</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_PLACE__OUT = PnmlcoremodelPackage.REF_PLACE__OUT;

	/**
	 * The feature id for the '<em><b>In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_PLACE__IN = PnmlcoremodelPackage.REF_PLACE__IN;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_PLACE__REF = PnmlcoremodelPackage.REF_PLACE__REF;

	/**
	 * The feature id for the '<em><b>Pragmatics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_PLACE__PRAGMATICS = PnmlcoremodelPackage.REF_PLACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ref Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_PLACE_FEATURE_COUNT = PnmlcoremodelPackage.REF_PLACE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.test.type.refnodeextensions.impl.RefTransitionImpl <em>Ref Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.test.type.refnodeextensions.impl.RefTransitionImpl
	 * @see org.pnml.tools.epnk.test.type.refnodeextensions.impl.RefnodeextensionsPackageImpl#getRefTransition()
	 * @generated
	 */
	int REF_TRANSITION = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_TRANSITION__ID = PnmlcoremodelPackage.REF_TRANSITION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_TRANSITION__NAME = PnmlcoremodelPackage.REF_TRANSITION__NAME;

	/**
	 * The feature id for the '<em><b>Toolspecific</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_TRANSITION__TOOLSPECIFIC = PnmlcoremodelPackage.REF_TRANSITION__TOOLSPECIFIC;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_TRANSITION__GRAPHICS = PnmlcoremodelPackage.REF_TRANSITION__GRAPHICS;

	/**
	 * The feature id for the '<em><b>Unknown</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_TRANSITION__UNKNOWN = PnmlcoremodelPackage.REF_TRANSITION__UNKNOWN;

	/**
	 * The feature id for the '<em><b>Out</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_TRANSITION__OUT = PnmlcoremodelPackage.REF_TRANSITION__OUT;

	/**
	 * The feature id for the '<em><b>In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_TRANSITION__IN = PnmlcoremodelPackage.REF_TRANSITION__IN;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_TRANSITION__REF = PnmlcoremodelPackage.REF_TRANSITION__REF;

	/**
	 * The feature id for the '<em><b>Api</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_TRANSITION__API = PnmlcoremodelPackage.REF_TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ref Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_TRANSITION_FEATURE_COUNT = PnmlcoremodelPackage.REF_TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.test.type.refnodeextensions.impl.PragmaticsImpl <em>Pragmatics</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.test.type.refnodeextensions.impl.PragmaticsImpl
	 * @see org.pnml.tools.epnk.test.type.refnodeextensions.impl.RefnodeextensionsPackageImpl#getPragmatics()
	 * @generated
	 */
	int PRAGMATICS = 3;

	/**
	 * The feature id for the '<em><b>Toolspecific</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRAGMATICS__TOOLSPECIFIC = PnmlcoremodelPackage.LABEL__TOOLSPECIFIC;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRAGMATICS__GRAPHICS = PnmlcoremodelPackage.LABEL__GRAPHICS;

	/**
	 * The feature id for the '<em><b>Unknown</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRAGMATICS__UNKNOWN = PnmlcoremodelPackage.LABEL__UNKNOWN;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRAGMATICS__TEXT = PnmlcoremodelPackage.LABEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pragmatics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRAGMATICS_FEATURE_COUNT = PnmlcoremodelPackage.LABEL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.test.type.refnodeextensions.impl.APIImpl <em>API</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.test.type.refnodeextensions.impl.APIImpl
	 * @see org.pnml.tools.epnk.test.type.refnodeextensions.impl.RefnodeextensionsPackageImpl#getAPI()
	 * @generated
	 */
	int API = 4;

	/**
	 * The feature id for the '<em><b>Toolspecific</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__TOOLSPECIFIC = PnmlcoremodelPackage.LABEL__TOOLSPECIFIC;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__GRAPHICS = PnmlcoremodelPackage.LABEL__GRAPHICS;

	/**
	 * The feature id for the '<em><b>Unknown</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__UNKNOWN = PnmlcoremodelPackage.LABEL__UNKNOWN;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__TEXT = PnmlcoremodelPackage.LABEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>API</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_FEATURE_COUNT = PnmlcoremodelPackage.LABEL_FEATURE_COUNT + 1;


	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.test.type.refnodeextensions.impl.PageImpl <em>Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.test.type.refnodeextensions.impl.PageImpl
	 * @see org.pnml.tools.epnk.test.type.refnodeextensions.impl.RefnodeextensionsPackageImpl#getPage()
	 * @generated
	 */
	int PAGE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__ID = PnmlcoremodelPackage.PAGE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__NAME = PnmlcoremodelPackage.PAGE__NAME;

	/**
	 * The feature id for the '<em><b>Toolspecific</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__TOOLSPECIFIC = PnmlcoremodelPackage.PAGE__TOOLSPECIFIC;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__GRAPHICS = PnmlcoremodelPackage.PAGE__GRAPHICS;

	/**
	 * The feature id for the '<em><b>Unknown</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__UNKNOWN = PnmlcoremodelPackage.PAGE__UNKNOWN;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__OBJECT = PnmlcoremodelPackage.PAGE__OBJECT;

	/**
	 * The feature id for the '<em><b>Page Label Proxy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__PAGE_LABEL_PROXY = PnmlcoremodelPackage.PAGE__PAGE_LABEL_PROXY;

	/**
	 * The feature id for the '<em><b>Labelproxy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__LABELPROXY = PnmlcoremodelPackage.PAGE__LABELPROXY;

	/**
	 * The feature id for the '<em><b>Pragmatics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__PRAGMATICS = PnmlcoremodelPackage.PAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Api</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__API = PnmlcoremodelPackage.PAGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_FEATURE_COUNT = PnmlcoremodelPackage.PAGE_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.test.type.refnodeextensions.RefNodeExtension <em>Ref Node Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ref Node Extension</em>'.
	 * @see org.pnml.tools.epnk.test.type.refnodeextensions.RefNodeExtension
	 * @generated
	 */
	EClass getRefNodeExtension();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.test.type.refnodeextensions.RefPlace <em>Ref Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ref Place</em>'.
	 * @see org.pnml.tools.epnk.test.type.refnodeextensions.RefPlace
	 * @generated
	 */
	EClass getRefPlace();

	/**
	 * Returns the meta object for the containment reference '{@link org.pnml.tools.epnk.test.type.refnodeextensions.RefPlace#getPragmatics <em>Pragmatics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pragmatics</em>'.
	 * @see org.pnml.tools.epnk.test.type.refnodeextensions.RefPlace#getPragmatics()
	 * @see #getRefPlace()
	 * @generated
	 */
	EReference getRefPlace_Pragmatics();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.test.type.refnodeextensions.RefTransition <em>Ref Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ref Transition</em>'.
	 * @see org.pnml.tools.epnk.test.type.refnodeextensions.RefTransition
	 * @generated
	 */
	EClass getRefTransition();

	/**
	 * Returns the meta object for the containment reference '{@link org.pnml.tools.epnk.test.type.refnodeextensions.RefTransition#getApi <em>Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Api</em>'.
	 * @see org.pnml.tools.epnk.test.type.refnodeextensions.RefTransition#getApi()
	 * @see #getRefTransition()
	 * @generated
	 */
	EReference getRefTransition_Api();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.test.type.refnodeextensions.Pragmatics <em>Pragmatics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pragmatics</em>'.
	 * @see org.pnml.tools.epnk.test.type.refnodeextensions.Pragmatics
	 * @generated
	 */
	EClass getPragmatics();

	/**
	 * Returns the meta object for the attribute '{@link org.pnml.tools.epnk.test.type.refnodeextensions.Pragmatics#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.pnml.tools.epnk.test.type.refnodeextensions.Pragmatics#getText()
	 * @see #getPragmatics()
	 * @generated
	 */
	EAttribute getPragmatics_Text();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.test.type.refnodeextensions.API <em>API</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>API</em>'.
	 * @see org.pnml.tools.epnk.test.type.refnodeextensions.API
	 * @generated
	 */
	EClass getAPI();

	/**
	 * Returns the meta object for the attribute '{@link org.pnml.tools.epnk.test.type.refnodeextensions.API#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.pnml.tools.epnk.test.type.refnodeextensions.API#getText()
	 * @see #getAPI()
	 * @generated
	 */
	EAttribute getAPI_Text();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.test.type.refnodeextensions.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page</em>'.
	 * @see org.pnml.tools.epnk.test.type.refnodeextensions.Page
	 * @generated
	 */
	EClass getPage();

	/**
	 * Returns the meta object for the containment reference list '{@link org.pnml.tools.epnk.test.type.refnodeextensions.Page#getPragmatics <em>Pragmatics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pragmatics</em>'.
	 * @see org.pnml.tools.epnk.test.type.refnodeextensions.Page#getPragmatics()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_Pragmatics();

	/**
	 * Returns the meta object for the containment reference '{@link org.pnml.tools.epnk.test.type.refnodeextensions.Page#getApi <em>Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Api</em>'.
	 * @see org.pnml.tools.epnk.test.type.refnodeextensions.Page#getApi()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_Api();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RefnodeextensionsFactory getRefnodeextensionsFactory();

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
		 * The meta object literal for the '{@link org.pnml.tools.epnk.test.type.refnodeextensions.impl.RefNodeExtensionImpl <em>Ref Node Extension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.test.type.refnodeextensions.impl.RefNodeExtensionImpl
		 * @see org.pnml.tools.epnk.test.type.refnodeextensions.impl.RefnodeextensionsPackageImpl#getRefNodeExtension()
		 * @generated
		 */
		EClass REF_NODE_EXTENSION = eINSTANCE.getRefNodeExtension();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.test.type.refnodeextensions.impl.RefPlaceImpl <em>Ref Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.test.type.refnodeextensions.impl.RefPlaceImpl
		 * @see org.pnml.tools.epnk.test.type.refnodeextensions.impl.RefnodeextensionsPackageImpl#getRefPlace()
		 * @generated
		 */
		EClass REF_PLACE = eINSTANCE.getRefPlace();

		/**
		 * The meta object literal for the '<em><b>Pragmatics</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REF_PLACE__PRAGMATICS = eINSTANCE.getRefPlace_Pragmatics();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.test.type.refnodeextensions.impl.RefTransitionImpl <em>Ref Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.test.type.refnodeextensions.impl.RefTransitionImpl
		 * @see org.pnml.tools.epnk.test.type.refnodeextensions.impl.RefnodeextensionsPackageImpl#getRefTransition()
		 * @generated
		 */
		EClass REF_TRANSITION = eINSTANCE.getRefTransition();

		/**
		 * The meta object literal for the '<em><b>Api</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REF_TRANSITION__API = eINSTANCE.getRefTransition_Api();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.test.type.refnodeextensions.impl.PragmaticsImpl <em>Pragmatics</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.test.type.refnodeextensions.impl.PragmaticsImpl
		 * @see org.pnml.tools.epnk.test.type.refnodeextensions.impl.RefnodeextensionsPackageImpl#getPragmatics()
		 * @generated
		 */
		EClass PRAGMATICS = eINSTANCE.getPragmatics();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRAGMATICS__TEXT = eINSTANCE.getPragmatics_Text();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.test.type.refnodeextensions.impl.APIImpl <em>API</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.test.type.refnodeextensions.impl.APIImpl
		 * @see org.pnml.tools.epnk.test.type.refnodeextensions.impl.RefnodeextensionsPackageImpl#getAPI()
		 * @generated
		 */
		EClass API = eINSTANCE.getAPI();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute API__TEXT = eINSTANCE.getAPI_Text();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.test.type.refnodeextensions.impl.PageImpl <em>Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.test.type.refnodeextensions.impl.PageImpl
		 * @see org.pnml.tools.epnk.test.type.refnodeextensions.impl.RefnodeextensionsPackageImpl#getPage()
		 * @generated
		 */
		EClass PAGE = eINSTANCE.getPage();

		/**
		 * The meta object literal for the '<em><b>Pragmatics</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__PRAGMATICS = eINSTANCE.getPage_Pragmatics();

		/**
		 * The meta object literal for the '<em><b>Api</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__API = eINSTANCE.getPage_Api();

	}

} //RefnodeextensionsPackage

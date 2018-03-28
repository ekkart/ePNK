/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax.hlpnginscriptiondocument;

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
 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax.hlpnginscriptiondocument.HlpnginscriptiondocumentFactory
 * @model kind="package"
 * @generated
 */
public interface HlpnginscriptiondocumentPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "hlpnginscriptiondocument";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.pnml.tools/epnk/types/hlpngs/datatypes/hlpnginscriptiondocument";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "hlpngid";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HlpnginscriptiondocumentPackage eINSTANCE = org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax.hlpnginscriptiondocument.impl.HlpnginscriptiondocumentPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax.hlpnginscriptiondocument.impl.HLPNGInscriptionDocumentImpl <em>HLPNG Inscription Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax.hlpnginscriptiondocument.impl.HLPNGInscriptionDocumentImpl
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax.hlpnginscriptiondocument.impl.HlpnginscriptiondocumentPackageImpl#getHLPNGInscriptionDocument()
	 * @generated
	 */
	int HLPNG_INSCRIPTION_DOCUMENT = 0;

	/**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLPNG_INSCRIPTION_DOCUMENT__DECLARATIONS = 0;

	/**
	 * The feature id for the '<em><b>Term</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLPNG_INSCRIPTION_DOCUMENT__TERM = 1;

	/**
	 * The number of structural features of the '<em>HLPNG Inscription Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HLPNG_INSCRIPTION_DOCUMENT_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax.hlpnginscriptiondocument.HLPNGInscriptionDocument <em>HLPNG Inscription Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HLPNG Inscription Document</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax.hlpnginscriptiondocument.HLPNGInscriptionDocument
	 * @generated
	 */
	EClass getHLPNGInscriptionDocument();

	/**
	 * Returns the meta object for the containment reference list '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax.hlpnginscriptiondocument.HLPNGInscriptionDocument#getDeclarations <em>Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declarations</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax.hlpnginscriptiondocument.HLPNGInscriptionDocument#getDeclarations()
	 * @see #getHLPNGInscriptionDocument()
	 * @generated
	 */
	EReference getHLPNGInscriptionDocument_Declarations();

	/**
	 * Returns the meta object for the containment reference list '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax.hlpnginscriptiondocument.HLPNGInscriptionDocument#getTerm <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Term</em>'.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax.hlpnginscriptiondocument.HLPNGInscriptionDocument#getTerm()
	 * @see #getHLPNGInscriptionDocument()
	 * @generated
	 */
	EReference getHLPNGInscriptionDocument_Term();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HlpnginscriptiondocumentFactory getHlpnginscriptiondocumentFactory();

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
		 * The meta object literal for the '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax.hlpnginscriptiondocument.impl.HLPNGInscriptionDocumentImpl <em>HLPNG Inscription Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax.hlpnginscriptiondocument.impl.HLPNGInscriptionDocumentImpl
		 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax.hlpnginscriptiondocument.impl.HlpnginscriptiondocumentPackageImpl#getHLPNGInscriptionDocument()
		 * @generated
		 */
		EClass HLPNG_INSCRIPTION_DOCUMENT = eINSTANCE.getHLPNGInscriptionDocument();

		/**
		 * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HLPNG_INSCRIPTION_DOCUMENT__DECLARATIONS = eINSTANCE.getHLPNGInscriptionDocument_Declarations();

		/**
		 * The meta object literal for the '<em><b>Term</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HLPNG_INSCRIPTION_DOCUMENT__TERM = eINSTANCE.getHLPNGInscriptionDocument_Term();

	}

} //HlpnginscriptiondocumentPackage

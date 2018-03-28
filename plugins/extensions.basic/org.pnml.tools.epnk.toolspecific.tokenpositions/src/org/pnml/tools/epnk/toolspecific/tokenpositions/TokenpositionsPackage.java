/**
 * This file is part of the ePNK project (Petri Net Kernel for eclipse). The ePNK
 * is platform for Petri net tools based on the PNML transfer format. Its
 * main idea is to provide generic Petri net types which can be easily plugged
 * in and a simple generic GMF editor, that can be used for graphically editing
 * nets of any plugged in type. Additional functionality can be plugged in.
 * 
 * Note that this project is still in an experimental phase, and is also used
 * as a case study for EMF/GMF based Model-based Software Engineering.
 * 
 * Copyright (C) 2010 Ekkart Kindler, eki@imm.dtu.dk
 * The license under which this software will be distributed is still to be decided -
 * it will probably be the EPL.
 *
 * $Id$
 */
package org.pnml.tools.epnk.toolspecific.tokenpositions;

import org.eclipse.emf.ecore.EClass;
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
 * @see org.pnml.tools.epnk.toolspecific.tokenpositions.TokenpositionsFactory
 * @model kind="package"
 * @generated
 */
public interface TokenpositionsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tokenpositions"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.pnml.tools/epnk/toolspecific/tokenpositions"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tokenpositions"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TokenpositionsPackage eINSTANCE = org.pnml.tools.epnk.toolspecific.tokenpositions.impl.TokenpositionsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.toolspecific.tokenpositions.impl.TokengraphicsImpl <em>Tokengraphics</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.toolspecific.tokenpositions.impl.TokengraphicsImpl
	 * @see org.pnml.tools.epnk.toolspecific.tokenpositions.impl.TokenpositionsPackageImpl#getTokengraphics()
	 * @generated
	 */
	int TOKENGRAPHICS = 0;

	/**
	 * The feature id for the '<em><b>Tokenposition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKENGRAPHICS__TOKENPOSITION = 0;

	/**
	 * The number of structural features of the '<em>Tokengraphics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKENGRAPHICS_FEATURE_COUNT = 1;


	/**
	 * The meta object id for the '{@link org.pnml.tools.epnk.toolspecific.tokenpositions.impl.PNMLToolInfoImpl <em>PNML Tool Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.toolspecific.tokenpositions.impl.PNMLToolInfoImpl
	 * @see org.pnml.tools.epnk.toolspecific.tokenpositions.impl.TokenpositionsPackageImpl#getPNMLToolInfo()
	 * @generated
	 */
	int PNML_TOOL_INFO = 1;

	/**
	 * The feature id for the '<em><b>Tool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNML_TOOL_INFO__TOOL = PnmlcoremodelPackage.TOOL_INFO__TOOL;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNML_TOOL_INFO__VERSION = PnmlcoremodelPackage.TOOL_INFO__VERSION;

	/**
	 * The feature id for the '<em><b>Tokengraphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNML_TOOL_INFO__TOKENGRAPHICS = PnmlcoremodelPackage.TOOL_INFO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PNML Tool Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNML_TOOL_INFO_FEATURE_COUNT = PnmlcoremodelPackage.TOOL_INFO_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.toolspecific.tokenpositions.Tokengraphics <em>Tokengraphics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tokengraphics</em>'.
	 * @see org.pnml.tools.epnk.toolspecific.tokenpositions.Tokengraphics
	 * @generated
	 */
	EClass getTokengraphics();

	/**
	 * Returns the meta object for the containment reference list '{@link org.pnml.tools.epnk.toolspecific.tokenpositions.Tokengraphics#getTokenposition <em>Tokenposition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tokenposition</em>'.
	 * @see org.pnml.tools.epnk.toolspecific.tokenpositions.Tokengraphics#getTokenposition()
	 * @see #getTokengraphics()
	 * @generated
	 */
	EReference getTokengraphics_Tokenposition();

	/**
	 * Returns the meta object for class '{@link org.pnml.tools.epnk.toolspecific.tokenpositions.PNMLToolInfo <em>PNML Tool Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PNML Tool Info</em>'.
	 * @see org.pnml.tools.epnk.toolspecific.tokenpositions.PNMLToolInfo
	 * @generated
	 */
	EClass getPNMLToolInfo();

	/**
	 * Returns the meta object for the containment reference '{@link org.pnml.tools.epnk.toolspecific.tokenpositions.PNMLToolInfo#getTokengraphics <em>Tokengraphics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tokengraphics</em>'.
	 * @see org.pnml.tools.epnk.toolspecific.tokenpositions.PNMLToolInfo#getTokengraphics()
	 * @see #getPNMLToolInfo()
	 * @generated
	 */
	EReference getPNMLToolInfo_Tokengraphics();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TokenpositionsFactory getTokenpositionsFactory();

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
		 * The meta object literal for the '{@link org.pnml.tools.epnk.toolspecific.tokenpositions.impl.TokengraphicsImpl <em>Tokengraphics</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.toolspecific.tokenpositions.impl.TokengraphicsImpl
		 * @see org.pnml.tools.epnk.toolspecific.tokenpositions.impl.TokenpositionsPackageImpl#getTokengraphics()
		 * @generated
		 */
		EClass TOKENGRAPHICS = eINSTANCE.getTokengraphics();

		/**
		 * The meta object literal for the '<em><b>Tokenposition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOKENGRAPHICS__TOKENPOSITION = eINSTANCE.getTokengraphics_Tokenposition();

		/**
		 * The meta object literal for the '{@link org.pnml.tools.epnk.toolspecific.tokenpositions.impl.PNMLToolInfoImpl <em>PNML Tool Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.toolspecific.tokenpositions.impl.PNMLToolInfoImpl
		 * @see org.pnml.tools.epnk.toolspecific.tokenpositions.impl.TokenpositionsPackageImpl#getPNMLToolInfo()
		 * @generated
		 */
		EClass PNML_TOOL_INFO = eINSTANCE.getPNMLToolInfo();

		/**
		 * The meta object literal for the '<em><b>Tokengraphics</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PNML_TOOL_INFO__TOKENGRAPHICS = eINSTANCE.getPNMLToolInfo_Tokengraphics();

	}

} //TokenpositionsPackage

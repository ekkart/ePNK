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
package org.pnml.tools.epnk.toolspecific.tokenpositions.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage;

import org.pnml.tools.epnk.toolspecific.tokenpositions.PNMLToolInfo;
import org.pnml.tools.epnk.toolspecific.tokenpositions.Tokengraphics;
import org.pnml.tools.epnk.toolspecific.tokenpositions.TokenpositionsFactory;
import org.pnml.tools.epnk.toolspecific.tokenpositions.TokenpositionsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TokenpositionsPackageImpl extends EPackageImpl implements TokenpositionsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tokengraphicsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pnmlToolInfoEClass = null;

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
	 * @see org.pnml.tools.epnk.toolspecific.tokenpositions.TokenpositionsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TokenpositionsPackageImpl() {
		super(eNS_URI, TokenpositionsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TokenpositionsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TokenpositionsPackage init() {
		if (isInited) return (TokenpositionsPackage)EPackage.Registry.INSTANCE.getEPackage(TokenpositionsPackage.eNS_URI);

		// Obtain or create and register package
		TokenpositionsPackageImpl theTokenpositionsPackage = (TokenpositionsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TokenpositionsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TokenpositionsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		PnmlcoremodelPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theTokenpositionsPackage.createPackageContents();

		// Initialize created meta-data
		theTokenpositionsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTokenpositionsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TokenpositionsPackage.eNS_URI, theTokenpositionsPackage);
		return theTokenpositionsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTokengraphics() {
		return tokengraphicsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTokengraphics_Tokenposition() {
		return (EReference)tokengraphicsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPNMLToolInfo() {
		return pnmlToolInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPNMLToolInfo_Tokengraphics() {
		return (EReference)pnmlToolInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TokenpositionsFactory getTokenpositionsFactory() {
		return (TokenpositionsFactory)getEFactoryInstance();
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
		tokengraphicsEClass = createEClass(TOKENGRAPHICS);
		createEReference(tokengraphicsEClass, TOKENGRAPHICS__TOKENPOSITION);

		pnmlToolInfoEClass = createEClass(PNML_TOOL_INFO);
		createEReference(pnmlToolInfoEClass, PNML_TOOL_INFO__TOKENGRAPHICS);
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
		pnmlToolInfoEClass.getESuperTypes().add(thePnmlcoremodelPackage.getToolInfo());

		// Initialize classes and features; add operations and parameters
		initEClass(tokengraphicsEClass, Tokengraphics.class, "Tokengraphics", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getTokengraphics_Tokenposition(), thePnmlcoremodelPackage.getCoordinate(), null, "tokenposition", null, 1, -1, Tokengraphics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(pnmlToolInfoEClass, PNMLToolInfo.class, "PNMLToolInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getPNMLToolInfo_Tokengraphics(), this.getTokengraphics(), null, "tokengraphics", null, 0, 1, PNMLToolInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		// Create resource
		createResource(eNS_URI);
	}

} //TokenpositionsPackageImpl

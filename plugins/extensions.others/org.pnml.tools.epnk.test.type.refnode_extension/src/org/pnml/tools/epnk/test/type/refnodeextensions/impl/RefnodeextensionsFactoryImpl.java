/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.test.type.refnodeextensions.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.pnml.tools.epnk.test.type.refnodeextensions.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RefnodeextensionsFactoryImpl extends EFactoryImpl implements RefnodeextensionsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RefnodeextensionsFactory init() {
		try {
			RefnodeextensionsFactory theRefnodeextensionsFactory = (RefnodeextensionsFactory)EPackage.Registry.INSTANCE.getEFactory("http://org.pnml.tools/epnk/test/types/ptnetrefnodeextensions/1.0"); 
			if (theRefnodeextensionsFactory != null) {
				return theRefnodeextensionsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RefnodeextensionsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefnodeextensionsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case RefnodeextensionsPackage.REF_NODE_EXTENSION: return createRefNodeExtension();
			case RefnodeextensionsPackage.REF_PLACE: return createRefPlace();
			case RefnodeextensionsPackage.REF_TRANSITION: return createRefTransition();
			case RefnodeextensionsPackage.PRAGMATICS: return createPragmatics();
			case RefnodeextensionsPackage.API: return createAPI();
			case RefnodeextensionsPackage.PAGE: return createPage();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefNodeExtension createRefNodeExtension() {
		RefNodeExtensionImpl refNodeExtension = new RefNodeExtensionImpl();
		return refNodeExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefPlace createRefPlace() {
		RefPlaceImpl refPlace = new RefPlaceImpl();
		return refPlace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefTransition createRefTransition() {
		RefTransitionImpl refTransition = new RefTransitionImpl();
		return refTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pragmatics createPragmatics() {
		PragmaticsImpl pragmatics = new PragmaticsImpl();
		return pragmatics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public API createAPI() {
		APIImpl api = new APIImpl();
		return api;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page createPage() {
		PageImpl page = new PageImpl();
		return page;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefnodeextensionsPackage getRefnodeextensionsPackage() {
		return (RefnodeextensionsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RefnodeextensionsPackage getPackage() {
		return RefnodeextensionsPackage.eINSTANCE;
	}

} //RefnodeextensionsFactoryImpl

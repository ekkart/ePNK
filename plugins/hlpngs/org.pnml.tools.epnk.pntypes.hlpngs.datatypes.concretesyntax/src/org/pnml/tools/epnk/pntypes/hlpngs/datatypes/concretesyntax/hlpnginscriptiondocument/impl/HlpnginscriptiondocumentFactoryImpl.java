/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax.hlpnginscriptiondocument.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.concretesyntax.hlpnginscriptiondocument.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HlpnginscriptiondocumentFactoryImpl extends EFactoryImpl implements HlpnginscriptiondocumentFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HlpnginscriptiondocumentFactory init() {
		try {
			HlpnginscriptiondocumentFactory theHlpnginscriptiondocumentFactory = (HlpnginscriptiondocumentFactory)EPackage.Registry.INSTANCE.getEFactory("http://org.pnml.tools/epnk/types/hlpngs/datatypes/hlpnginscriptiondocument"); 
			if (theHlpnginscriptiondocumentFactory != null) {
				return theHlpnginscriptiondocumentFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new HlpnginscriptiondocumentFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HlpnginscriptiondocumentFactoryImpl() {
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
			case HlpnginscriptiondocumentPackage.HLPNG_INSCRIPTION_DOCUMENT: return createHLPNGInscriptionDocument();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HLPNGInscriptionDocument createHLPNGInscriptionDocument() {
		HLPNGInscriptionDocumentImpl hlpngInscriptionDocument = new HLPNGInscriptionDocumentImpl();
		return hlpngInscriptionDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HlpnginscriptiondocumentPackage getHlpnginscriptiondocumentPackage() {
		return (HlpnginscriptiondocumentPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static HlpnginscriptiondocumentPackage getPackage() {
		return HlpnginscriptiondocumentPackage.eINSTANCE;
	}

} //HlpnginscriptiondocumentFactoryImpl

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ptnetsimulator.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import ptnetsimulator.PtnetsimulatorPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PtnetsimulatorXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PtnetsimulatorXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		PtnetsimulatorPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the PtnetsimulatorResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new PtnetsimulatorResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new PtnetsimulatorResourceFactoryImpl());
		}
		return registrations;
	}

} //PtnetsimulatorXMLProcessor

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.test.type.refnodeextensions.impl;

import org.eclipse.emf.ecore.EClass;

import org.pnml.tools.epnk.pntypes.ptnet.impl.PTNetImpl;

import org.pnml.tools.epnk.test.type.refnodeextensions.RefNodeExtension;
import org.pnml.tools.epnk.test.type.refnodeextensions.RefnodeextensionsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ref Node Extension</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class RefNodeExtensionImpl extends PTNetImpl implements RefNodeExtension {


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public RefNodeExtensionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RefnodeextensionsPackage.Literals.REF_NODE_EXTENSION;
	}
	
	@Override
	// @generated NOT
	public String toString() {
		return "http://www.pnml.org/epnk/test/refnodeextension";
	}

} //RefNodeExtensionImpl

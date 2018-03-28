/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.provider;

import org.eclipse.emf.common.EMFPlugin;

import org.eclipse.emf.common.util.ResourceLocator;

import org.pnml.tools.epnk.datatypes.pnmldatatypes.provider.PNMLDataTypesEditPlugin;

import org.pnml.tools.epnk.pnmlcoremodel.provider.PNMLCoreModelEditPlugin;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.provider.HLPNGDataTypesEditPlugin;

import org.pnml.tools.epnk.structuredpntypemodel.provider.PNMLStructuredPNTypeModelEditPlugin;

/**
 * This is the central singleton for the HLPNGLists edit plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class HLPNGListsEditPlugin extends EMFPlugin {
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final HLPNGListsEditPlugin INSTANCE = new HLPNGListsEditPlugin();

	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static Implementation plugin;

	/**
	 * Create the instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HLPNGListsEditPlugin() {
		super
		  (new ResourceLocator [] {
		     HLPNGDataTypesEditPlugin.INSTANCE,
		     PNMLCoreModelEditPlugin.INSTANCE,
		     PNMLDataTypesEditPlugin.INSTANCE,
		     PNMLStructuredPNTypeModelEditPlugin.INSTANCE,
		   });
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	@Override
	public ResourceLocator getPluginResourceLocator() {
		return plugin;
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	public static Implementation getPlugin() {
		return plugin;
	}

	/**
	 * The actual implementation of the Eclipse <b>Plugin</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class Implementation extends EclipsePlugin {
		/**
		 * Creates an instance.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public Implementation() {
			super();

			// Remember the static instance.
			//
			plugin = this;
		}
	}

}

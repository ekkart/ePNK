/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.StringsFactory;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.TermsPackage;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.provider.BuiltInOperatorItemProvider;

/**
 * This is the item provider adapter for a {@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.StringOperator} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class StringOperatorItemProvider
	extends BuiltInOperatorItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringOperatorItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_StringOperator_type");
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.OPERATOR__SUBTERM,
				 StringsFactory.eINSTANCE.createStringConstant()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.OPERATOR__SUBTERM,
				 StringsFactory.eINSTANCE.createSubstring()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.OPERATOR__SUBTERM,
				 StringsFactory.eINSTANCE.createConcatenation()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.OPERATOR__SUBTERM,
				 StringsFactory.eINSTANCE.createAppend()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.OPERATOR__SUBTERM,
				 StringsFactory.eINSTANCE.createLength()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.OPERATOR__SUBTERM,
				 StringsFactory.eINSTANCE.createGreaterThan()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.OPERATOR__SUBTERM,
				 StringsFactory.eINSTANCE.createGreaterThanOrEqual()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.OPERATOR__SUBTERM,
				 StringsFactory.eINSTANCE.createLessThan()));

		newChildDescriptors.add
			(createChildParameter
				(TermsPackage.Literals.OPERATOR__SUBTERM,
				 StringsFactory.eINSTANCE.createLessThanOrEqual()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return HLPNGStringsEditPlugin.INSTANCE;
	}

}

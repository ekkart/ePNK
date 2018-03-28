/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.BooleansFactory;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.dots.DotsFactory;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.IntegersFactory;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.ListsFactory;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.ListsPackage;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.TermsFactory;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.provider.BuiltInSortItemProvider;

/**
 * This is the item provider adapter for a {@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.List} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ListItemProvider
	extends BuiltInSortItemProvider
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
	public ListItemProvider(AdapterFactory adapterFactory) {
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
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ListsPackage.Literals.LIST__BASIS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns List.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/List"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_List_type");
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

		switch (notification.getFeatureID(org.pnml.tools.epnk.pntypes.hlpngs.datatypes.lists.List.class)) {
			case ListsPackage.LIST__BASIS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
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
				(ListsPackage.Literals.LIST__BASIS,
				 ListsFactory.eINSTANCE.createList()));

		newChildDescriptors.add
			(createChildParameter
				(ListsPackage.Literals.LIST__BASIS,
				 TermsFactory.eINSTANCE.createMultiSetSort()));

		newChildDescriptors.add
			(createChildParameter
				(ListsPackage.Literals.LIST__BASIS,
				 TermsFactory.eINSTANCE.createProductSort()));

		newChildDescriptors.add
			(createChildParameter
				(ListsPackage.Literals.LIST__BASIS,
				 TermsFactory.eINSTANCE.createUserSort()));

		newChildDescriptors.add
			(createChildParameter
				(ListsPackage.Literals.LIST__BASIS,
				 DotsFactory.eINSTANCE.createDot()));

		newChildDescriptors.add
			(createChildParameter
				(ListsPackage.Literals.LIST__BASIS,
				 BooleansFactory.eINSTANCE.createBool()));

		newChildDescriptors.add
			(createChildParameter
				(ListsPackage.Literals.LIST__BASIS,
				 IntegersFactory.eINSTANCE.createNatural()));

		newChildDescriptors.add
			(createChildParameter
				(ListsPackage.Literals.LIST__BASIS,
				 IntegersFactory.eINSTANCE.createPositive()));

		newChildDescriptors.add
			(createChildParameter
				(ListsPackage.Literals.LIST__BASIS,
				 IntegersFactory.eINSTANCE.createInteger()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return HLPNGListsEditPlugin.INSTANCE;
	}

}

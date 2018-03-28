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
package org.pnml.tools.epnk.pnmlcoremodel.provider;


import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.pnml.tools.epnk.pnmlcoremodel.LabelProxy;
import org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelFactory;
import org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage;
import org.pnml.tools.epnk.pntypes.hlpng.pntd.hlpngdefinition.HlpngdefinitionFactory;

/**
 * This is the item provider adapter for a {@link org.pnml.tools.epnk.pnmlcoremodel.LabelProxy} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LabelProxyItemProvider
	extends ItemProviderAdapter
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
	public LabelProxyItemProvider(AdapterFactory adapterFactory) {
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

			addLabelPropertyDescriptor(object);
			addTextPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Label feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LabelProxy_label_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_LabelProxy_label_feature", "_UI_LabelProxy_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 PnmlcoremodelPackage.Literals.LABEL_PROXY__LABEL,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Text feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTextPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LabelProxy_text_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_LabelProxy_text_feature", "_UI_LabelProxy_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 PnmlcoremodelPackage.Literals.LABEL_PROXY__TEXT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns LabelProxy.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/LabelProxy")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((LabelProxy)object).getText();
		return label == null || label.length() == 0 ?
			getString("_UI_LabelProxy_type") : //$NON-NLS-1$
			getString("_UI_LabelProxy_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

		switch (notification.getFeatureID(LabelProxy.class)) {
			case PnmlcoremodelPackage.LABEL_PROXY__TEXT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return PNMLCoreModelEditPlugin.INSTANCE;
	}

	@Override
	public Object getEditableValue(Object object) {
		// TODO Auto-generated method stub
		return super.getEditableValue(object);
	}

	@Override
	public Collection<?> getElements(Object object) {
		// TODO Auto-generated method stub
		return super.getElements(object);
	}

	@Override
	protected Object getFeatureValue(EObject object, EStructuralFeature feature) {
		// TODO Auto-generated method stub
		return super.getFeatureValue(object, feature);
	}

	@Override
	public IItemPropertyDescriptor getPropertyDescriptor(Object object,
			Object propertyId) {
		// TODO Auto-generated method stub
		return super.getPropertyDescriptor(object, propertyId);
	}

	@Override
	public void setPropertyValue(Object object, String property, Object value) {
		// TODO Auto-generated method stub
		super.setPropertyValue(object, property, value);
	}

	@Override
	public Collection<?> getNewChildDescriptors(Object object,
			EditingDomain editingDomain, Object sibling) {
		// TODO Auto-generated method stub
		return super.getNewChildDescriptors(object, editingDomain, sibling);
	}

	@Override
	protected Command createAddCommand(EditingDomain domain, EObject owner,
			EStructuralFeature feature, Collection<?> collection, int index) {
		// TODO Auto-generated method stub
		return super.createAddCommand(domain, owner, feature, collection, index);
	}

	@Override
	// @generated NOT
	protected ItemPropertyDescriptor createItemPropertyDescriptor(
			AdapterFactory adapterFactory, ResourceLocator resourceLocator,
			String displayName, String description, EStructuralFeature feature,
			boolean isSettable, boolean multiLine, boolean sortChoices,
			Object staticImage, String category, String[] filterFlags) {
		// TODO Auto-generated method stub
		final ItemPropertyDescriptor desc = 
		super.createItemPropertyDescriptor(adapterFactory, resourceLocator,
				displayName, description, feature, isSettable, multiLine, sortChoices,
				staticImage, category, filterFlags);
		if (feature != PnmlcoremodelPackage.eINSTANCE.getLabelProxy_Label()) {
			return desc;
		} 
		
		// eki: This is a terrible hack to override the usual ItemProviderDescriptor, so that
		//      the possible choiceOfValues for the Label feature is just the new possible
		//      elements for the object this LabelProxy was attached to.
	
		return new ItemPropertyDescriptor(adapterFactory, resourceLocator, category, category, feature, sortChoices, sortChoices, sortChoices, staticImage, category, filterFlags) {

			@Override
			public boolean canSetProperty(Object object) {
				// TODO Auto-generated method stub
				return desc.canSetProperty(object);
			}

			@Override
			public String getCategory(Object object) {
				// TODO Auto-generated method stub
				return desc.getCategory(object);
			}

			@Override
			public Collection<?> getChoiceOfValues(Object object) {
				// TODO Auto-generated method stub
				 // Collection<?> result = desc.getChoiceOfValues(object);
				 // result.clear();
				// TODO eki: here we calculate the legal new values for this label
				//           right now, this is just an experiment. Don't forget to
				//           delete the dependency to .... pntypes.hlpntd.pntd!!!
				HashSet result = new HashSet();
				 result.add(HlpngdefinitionFactory.eINSTANCE.createCondition());
				return result;
			}

			@Override
			public Object getCommandOwner() {
				// TODO Auto-generated method stub
				return desc.getCommandOwner();
			}

			@Override
			public String getDescription(Object object) {
				// TODO Auto-generated method stub
				return desc.getDescription(object);
			}

			@Override
			public String getDisplayName(Object object) {
				// TODO Auto-generated method stub
				return desc.getDisplayName(object);
			}

			@Override
			public EditingDomain getEditingDomain(Object object) {
				// TODO Auto-generated method stub
				return desc.getEditingDomain(object);
			}

			@Override
			public Object getFeature(Object object) {
				// TODO Auto-generated method stub
				return desc.getFeature(object);
			}

			@Override
			public String[] getFilterFlags(Object object) {
				// TODO Auto-generated method stub
				return desc.getFilterFlags(object);
			}

			@Override
			public Object getHelpContextIds(Object object) {
				// TODO Auto-generated method stub
				return desc.getHelpContextIds(object);
			}

			@Override
			public String getId(Object object) {
				// TODO Auto-generated method stub
				return desc.getId(object);
			}

			@Override
			public IItemLabelProvider getLabelProvider(Object object) {
				// TODO Auto-generated method stub
				return desc.getLabelProvider(object);
			}

			@Override
			public Object getPropertyValue(Object object) {
				// TODO Auto-generated method stub
				return desc.getPropertyValue(object);
			}

			@Override
			public boolean isCompatibleWith(Object object,
					Object anotherObject,
					IItemPropertyDescriptor anotherItemPropertyDescriptor) {
				// TODO Auto-generated method stub
				return desc.isCompatibleWith(object, anotherObject,
						anotherItemPropertyDescriptor);
			}

			@Override
			public boolean isMany(Object object) {
				// TODO Auto-generated method stub
				return desc.isMany(object);
			}

			@Override
			public boolean isMultiLine(Object object) {
				// TODO Auto-generated method stub
				return desc.isMultiLine(object);
			}

			@Override
			public boolean isPropertySet(Object object) {
				// TODO Auto-generated method stub
				return desc.isPropertySet(object);
			}

			@Override
			public boolean isSortChoices(Object object) {
				// TODO Auto-generated method stub
				return desc.isSortChoices(object);
			}

			@Override
			public void resetPropertyValue(Object object) {
				// TODO Auto-generated method stub
				desc.resetPropertyValue(object);
			}

			@Override
			public void setCommandOwner(Object commandOwner) {
				// TODO Auto-generated method stub
				desc.setCommandOwner(commandOwner);
			}

			@Override
			public void setPropertyValue(Object object, Object value) {
				// TODO Auto-generated method stub
				desc.setPropertyValue(object, value);
			}
			
		};
	}

	@Override
	protected ItemPropertyDescriptor createItemPropertyDescriptor(
			AdapterFactory adapterFactory, ResourceLocator resourceLocator,
			String displayName, String description, EStructuralFeature feature,
			boolean isSettable, Object staticImage, String category,
			String[] filterFlags) {
		// TODO Auto-generated method stub
		/* super.createItemPropertyDescriptor(adapterFactory, resourceLocator,
				displayName, description, feature, isSettable, staticImage, category,
				filterFlags); */
		return new ItemPropertyDescriptor(adapterFactory, resourceLocator, category, category, feature, isSettable, staticImage, category, filterFlags);
	}

	@Override
	public AdapterFactory getAdapterFactory() {
		// TODO Auto-generated method stub
		AdapterFactory factory = super.getAdapterFactory();
		return factory;
	}
	
	
	
	

}

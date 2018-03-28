/**
 * This file is part of the ePNK project (Petri Net Kernel for eclipse). The ePNK
 *  is platform for Petri net tools based on the PNML transfer format. Its
 * main idea is to provide generic Petri net types which can be easily plugged
 *  in and a simple generic GMF editor, that can be used for graphically editing
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
import java.util.List;
import java.util.Vector;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.pnml.tools.epnk.helpers.NetFunctions;

import org.pnml.tools.epnk.pnmlcoremodel.Arc;
import org.pnml.tools.epnk.pnmlcoremodel.Page;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNetType;
import org.pnml.tools.epnk.pnmlcoremodel.Place;
import org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelFactory;
import org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage;
import org.pnml.tools.epnk.pnmlcoremodel.RefPlace;
import org.pnml.tools.epnk.pnmlcoremodel.RefTransition;
import org.pnml.tools.epnk.pnmlcoremodel.Transition;

/**
 * This is the item provider adapter for a {@link org.pnml.tools.epnk.pnmlcoremodel.Page} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PageItemProvider
	extends NodeItemProvider
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
	public PageItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(PnmlcoremodelPackage.Literals.PAGE__OBJECT);
			childrenFeatures.add(PnmlcoremodelPackage.Literals.PAGE__PAGE_LABEL_PROXY);
			childrenFeatures.add(PnmlcoremodelPackage.Literals.PAGE__LABELPROXY);
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
	 * This returns Page.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Page")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Page)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_Page_type") : //$NON-NLS-1$
			getString("_UI_Page_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

		switch (notification.getFeatureID(Page.class)) {
			case PnmlcoremodelPackage.PAGE__OBJECT:
			case PnmlcoremodelPackage.PAGE__PAGE_LABEL_PROXY:
			case PnmlcoremodelPackage.PAGE__LABELPROXY:
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
				(PnmlcoremodelPackage.Literals.PAGE__OBJECT,
				 PnmlcoremodelFactory.eINSTANCE.createPage()));

		newChildDescriptors.add
			(createChildParameter
				(PnmlcoremodelPackage.Literals.PAGE__OBJECT,
				 PnmlcoremodelFactory.eINSTANCE.createArc()));

		newChildDescriptors.add
			(createChildParameter
				(PnmlcoremodelPackage.Literals.PAGE__OBJECT,
				 PnmlcoremodelFactory.eINSTANCE.createPlace()));

		newChildDescriptors.add
			(createChildParameter
				(PnmlcoremodelPackage.Literals.PAGE__OBJECT,
				 PnmlcoremodelFactory.eINSTANCE.createRefPlace()));

		newChildDescriptors.add
			(createChildParameter
				(PnmlcoremodelPackage.Literals.PAGE__OBJECT,
				 PnmlcoremodelFactory.eINSTANCE.createRefTransition()));

		newChildDescriptors.add
			(createChildParameter
				(PnmlcoremodelPackage.Literals.PAGE__OBJECT,
				 PnmlcoremodelFactory.eINSTANCE.createTransition()));

		newChildDescriptors.add
			(createChildParameter
				(PnmlcoremodelPackage.Literals.PAGE__PAGE_LABEL_PROXY,
				 PnmlcoremodelFactory.eINSTANCE.createPageLabelProxy()));

		newChildDescriptors.add
			(createChildParameter
				(PnmlcoremodelPackage.Literals.PAGE__LABELPROXY,
				 PnmlcoremodelFactory.eINSTANCE.createLabelProxy()));
	}


	@Override
	// @generated NOT
	protected Command createAddCommand(EditingDomain domain, EObject owner,
			EStructuralFeature feature, Collection<?> collection, int index) {
		// TODO make that type specific for pages, places and transitions
		if (collection.size() == 1) {
			Object o = collection.toArray()[0];
			
			// FIXME this needs to be done in a slightly nicer way.
			// This replaces places resp. transitions with the type of place
			// fitting to the type of this Petri net.
			if (o instanceof Place) {
				PetriNetType type = NetFunctions.getPetriNetType(owner);
				if (type != null) {
					Place p = type.createPlace();
					Vector<EObject> c = new Vector<EObject>();
					c.add(p);
					return super.createAddCommand(domain, owner, feature, c, index);
				}
			} else if (o instanceof Transition) {
				PetriNetType type = NetFunctions.getPetriNetType(owner);
				if (type != null) {
					Transition t = type.createTransition();
					Vector<EObject> c = new Vector<EObject>();
					c.add(t);
					return super.createAddCommand(domain, owner, feature, c, index);
				}
			} else if (o instanceof Arc) {
				PetriNetType type = NetFunctions.getPetriNetType(owner);
				if (type != null) {
					Arc a = type.createArc();
					Vector<EObject> c = new Vector<EObject>();
					c.add(a);
					return super.createAddCommand(domain, owner, feature, c, index);
				}
			} else if (o instanceof Page) {
				PetriNetType type = NetFunctions.getPetriNetType(owner);
				if (type != null) {
					Page p = type.createPage();
					Vector<EObject> c = new Vector<EObject>();
					c.add(p);
					return super.createAddCommand(domain, owner, feature, c, index);
				}
			} else if (o instanceof RefPlace) {
				PetriNetType type = NetFunctions.getPetriNetType(owner);
				if (type != null) {
					RefPlace p = type.createRefPlace();
					Vector<EObject> c = new Vector<EObject>();
					c.add(p);
					return super.createAddCommand(domain, owner, feature, c, index);
				}
			} else if (o instanceof RefTransition) {
				PetriNetType type = NetFunctions.getPetriNetType(owner);
				if (type != null) {
					RefTransition t = type.createRefTransition();
					Vector<EObject> c = new Vector<EObject>();
					c.add(t);
					return super.createAddCommand(domain, owner, feature, c, index);
				}
			}
		}
		
		return super.createAddCommand(domain, owner, feature, collection, index);
	}	

}

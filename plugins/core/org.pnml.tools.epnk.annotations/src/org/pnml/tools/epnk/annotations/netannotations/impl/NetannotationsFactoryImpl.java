/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.annotations.netannotations.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.pnml.tools.epnk.annotations.netannotations.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NetannotationsFactoryImpl extends EFactoryImpl implements NetannotationsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NetannotationsFactory init() {
		try {
			NetannotationsFactory theNetannotationsFactory = (NetannotationsFactory)EPackage.Registry.INSTANCE.getEFactory("http://tools.pnml.org/epnk/netannotations/1.0"); 
			if (theNetannotationsFactory != null) {
				return theNetannotationsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new NetannotationsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetannotationsFactoryImpl() {
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
			case NetannotationsPackage.NET_ANNOTATION: return createNetAnnotation();
			case NetannotationsPackage.OBJECT_ANNOTATION: return createObjectAnnotation();
			case NetannotationsPackage.NET_ANNOTATIONS: return createNetAnnotations();
			case NetannotationsPackage.ANNOTATION: return createAnnotation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetAnnotation createNetAnnotation() {
		NetAnnotationImpl netAnnotation = new NetAnnotationImpl();
		return netAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectAnnotation createObjectAnnotation() {
		ObjectAnnotationImpl objectAnnotation = new ObjectAnnotationImpl();
		return objectAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetAnnotations createNetAnnotations() {
		NetAnnotationsImpl netAnnotations = new NetAnnotationsImpl();
		return netAnnotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation createAnnotation() {
		AnnotationImpl annotation = new AnnotationImpl();
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetannotationsPackage getNetannotationsPackage() {
		return (NetannotationsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static NetannotationsPackage getPackage() {
		return NetannotationsPackage.eINSTANCE;
	}

} //NetannotationsFactoryImpl

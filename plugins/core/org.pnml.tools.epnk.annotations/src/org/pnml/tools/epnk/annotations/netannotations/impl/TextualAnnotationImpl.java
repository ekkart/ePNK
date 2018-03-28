/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.annotations.netannotations.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.pnml.tools.epnk.annotations.netannotations.NetannotationsPackage;
import org.pnml.tools.epnk.annotations.netannotations.TextualAnnotation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Textual Annotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class TextualAnnotationImpl extends EObjectImpl implements TextualAnnotation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextualAnnotationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NetannotationsPackage.Literals.TEXTUAL_ANNOTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotationAttribute() {
		EClass eClass = this.eClass();
		Object feature = eClass.getEStructuralFeature("text");
		if (feature instanceof EAttribute) {
			return (EAttribute) feature;
		}
		feature = eClass.getEStructuralFeature("value");
		if (feature instanceof EAttribute) {
			return (EAttribute) feature;
		}
				
		for (EAttribute attribute: eClass.getEAllAttributes()) {
			return attribute;
		}
		return null;
	}

} //TextualAnnotationImpl

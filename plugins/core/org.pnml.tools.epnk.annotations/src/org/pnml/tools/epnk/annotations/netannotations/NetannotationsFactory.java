/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.annotations.netannotations;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.pnml.tools.epnk.annotations.netannotations.NetannotationsPackage
 * @generated
 */
public interface NetannotationsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NetannotationsFactory eINSTANCE = org.pnml.tools.epnk.annotations.netannotations.impl.NetannotationsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Net Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Net Annotation</em>'.
	 * @generated
	 */
	NetAnnotation createNetAnnotation();

	/**
	 * Returns a new object of class '<em>Object Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Annotation</em>'.
	 * @generated
	 */
	ObjectAnnotation createObjectAnnotation();

	/**
	 * Returns a new object of class '<em>Net Annotations</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Net Annotations</em>'.
	 * @generated
	 */
	NetAnnotations createNetAnnotations();

	/**
	 * Returns a new object of class '<em>Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annotation</em>'.
	 * @generated
	 */
	Annotation createAnnotation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	NetannotationsPackage getNetannotationsPackage();

} //NetannotationsFactory

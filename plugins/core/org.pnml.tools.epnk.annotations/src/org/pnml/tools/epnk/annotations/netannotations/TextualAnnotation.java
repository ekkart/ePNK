/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.annotations.netannotations;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Textual Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.pnml.tools.epnk.annotations.netannotations.NetannotationsPackage#getTextualAnnotation()
 * @model abstract="true"
 * @generated
 */
public interface TextualAnnotation extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='EClass eClass = this.eClass();\r\nObject feature = eClass.getEStructuralFeature(\"text\");\r\nif (feature instanceof EAttribute) {\r\n\treturn (EAttribute) feature;\r\n}\r\nfeature = eClass.getEStructuralFeature(\"value\");\r\nif (feature instanceof EAttribute) {\r\n\treturn (EAttribute) feature;\r\n}\r\n\t\t\r\nfor (EAttribute attribute: eClass.getEAllAttributes()) {\r\n\treturn attribute;\r\n}\r\nreturn null;'"
	 * @generated
	 */
	EAttribute getAnnotationAttribute();

} // TextualAnnotation

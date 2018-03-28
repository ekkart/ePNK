/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package geditor;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Point</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link geditor.Point#getX <em>X</em>}</li>
 *   <li>{@link geditor.Point#getY <em>Y</em>}</li>
 *   <li>{@link geditor.Point#getZ <em>Z</em>}</li>
 * </ul>
 * </p>
 *
 * @see geditor.GeditorPackage#getPoint()
 * @model
 * @generated
 */
public interface Point extends GObject {
	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(int)
	 * @see geditor.GeditorPackage#getPoint_X()
	 * @model
	 * @generated
	 */
	int getX();

	/**
	 * Sets the value of the '{@link geditor.Point#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(int value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #setY(int)
	 * @see geditor.GeditorPackage#getPoint_Y()
	 * @model
	 * @generated
	 */
	int getY();

	/**
	 * Sets the value of the '{@link geditor.Point#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(int value);

	/**
	 * Returns the value of the '<em><b>Z</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Z</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Z</em>' attribute.
	 * @see #setZ(int)
	 * @see geditor.GeditorPackage#getPoint_Z()
	 * @model
	 * @generated
	 */
	int getZ();

	/**
	 * Sets the value of the '{@link geditor.Point#getZ <em>Z</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Z</em>' attribute.
	 * @see #getZ()
	 * @generated
	 */
	void setZ(int value);

} // Point

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ptnetsimulator;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ptnetsimulator.PtnetsimulatorPackage
 * @generated
 */
public interface PtnetsimulatorFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PtnetsimulatorFactory eINSTANCE = ptnetsimulator.impl.PtnetsimulatorFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Transition Activation Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transition Activation Annotation</em>'.
	 * @generated
	 */
	TransitionActivationAnnotation createTransitionActivationAnnotation();

	/**
	 * Returns a new object of class '<em>Place Marking Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Place Marking Annotation</em>'.
	 * @generated
	 */
	PlaceMarkingAnnotation createPlaceMarkingAnnotation();

	/**
	 * Returns a new object of class '<em>Place Selection Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Place Selection Annotation</em>'.
	 * @generated
	 */
	PlaceSelectionAnnotation createPlaceSelectionAnnotation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PtnetsimulatorPackage getPtnetsimulatorPackage();

} //PtnetsimulatorFactory

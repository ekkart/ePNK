/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ptnetsimulator.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ptnetsimulator.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PtnetsimulatorFactoryImpl extends EFactoryImpl implements PtnetsimulatorFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PtnetsimulatorFactory init() {
		try {
			PtnetsimulatorFactory thePtnetsimulatorFactory = (PtnetsimulatorFactory)EPackage.Registry.INSTANCE.getEFactory("http://org.pnml.tools/epnk/applications/ptnet/simulator"); 
			if (thePtnetsimulatorFactory != null) {
				return thePtnetsimulatorFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PtnetsimulatorFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PtnetsimulatorFactoryImpl() {
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
			case PtnetsimulatorPackage.TRANSITION_ACTIVATION_ANNOTATION: return createTransitionActivationAnnotation();
			case PtnetsimulatorPackage.PLACE_MARKING_ANNOTATION: return createPlaceMarkingAnnotation();
			case PtnetsimulatorPackage.PLACE_SELECTION_ANNOTATION: return createPlaceSelectionAnnotation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case PtnetsimulatorPackage.MODE:
				return createModeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case PtnetsimulatorPackage.MODE:
				return convertModeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionActivationAnnotation createTransitionActivationAnnotation() {
		TransitionActivationAnnotationImpl transitionActivationAnnotation = new TransitionActivationAnnotationImpl();
		return transitionActivationAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlaceMarkingAnnotation createPlaceMarkingAnnotation() {
		PlaceMarkingAnnotationImpl placeMarkingAnnotation = new PlaceMarkingAnnotationImpl();
		return placeMarkingAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlaceSelectionAnnotation createPlaceSelectionAnnotation() {
		PlaceSelectionAnnotationImpl placeSelectionAnnotation = new PlaceSelectionAnnotationImpl();
		return placeSelectionAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mode createModeFromString(EDataType eDataType, String initialValue) {
		Mode result = Mode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PtnetsimulatorPackage getPtnetsimulatorPackage() {
		return (PtnetsimulatorPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PtnetsimulatorPackage getPackage() {
		return PtnetsimulatorPackage.eINSTANCE;
	}

} //PtnetsimulatorFactoryImpl

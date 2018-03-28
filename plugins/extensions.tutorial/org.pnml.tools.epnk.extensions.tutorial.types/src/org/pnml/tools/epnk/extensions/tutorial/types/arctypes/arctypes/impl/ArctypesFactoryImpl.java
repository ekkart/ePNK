/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.extensions.tutorial.types.arctypes.arctypes.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.pnml.tools.epnk.extensions.tutorial.types.arctypes.arctypes.ARCTYPES;
import org.pnml.tools.epnk.extensions.tutorial.types.arctypes.arctypes.Arc;
import org.pnml.tools.epnk.extensions.tutorial.types.arctypes.arctypes.ArcType;
import org.pnml.tools.epnk.extensions.tutorial.types.arctypes.arctypes.ArctypesFactory;
import org.pnml.tools.epnk.extensions.tutorial.types.arctypes.arctypes.ArctypesPackage;
import org.pnml.tools.epnk.extensions.tutorial.types.arctypes.arctypes.Comment;
import org.pnml.tools.epnk.extensions.tutorial.types.arctypes.arctypes.Page;
import org.pnml.tools.epnk.extensions.tutorial.types.arctypes.arctypes.TYPE;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArctypesFactoryImpl extends EFactoryImpl implements ArctypesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ArctypesFactory init() {
		try {
			ArctypesFactory theArctypesFactory = (ArctypesFactory)EPackage.Registry.INSTANCE.getEFactory("http://org.pnml.tools/epnk/extensions/types/arctypes"); 
			if (theArctypesFactory != null) {
				return theArctypesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ArctypesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArctypesFactoryImpl() {
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
			case ArctypesPackage.ARCTYPES: return createARCTYPES();
			case ArctypesPackage.ARC: return createArc();
			case ArctypesPackage.ARC_TYPE: return createArcType();
			case ArctypesPackage.BOOLEAN: return createBoolean();
			case ArctypesPackage.COMMENT: return createComment();
			case ArctypesPackage.PAGE: return createPage();
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
			case ArctypesPackage.TYPE:
				return createTYPEFromString(eDataType, initialValue);
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
			case ArctypesPackage.TYPE:
				return convertTYPEToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ARCTYPES createARCTYPES() {
		ARCTYPESImpl arctypes = new ARCTYPESImpl();
		return arctypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arc createArc() {
		ArcImpl arc = new ArcImpl();
		return arc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArcType createArcType() {
		ArcTypeImpl arcType = new ArcTypeImpl();
		return arcType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.pnml.tools.epnk.extensions.tutorial.types.arctypes.arctypes.Boolean createBoolean() {
		BooleanImpl boolean_ = new BooleanImpl();
		return boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comment createComment() {
		CommentImpl comment = new CommentImpl();
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page createPage() {
		PageImpl page = new PageImpl();
		return page;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TYPE createTYPEFromString(EDataType eDataType, String initialValue) {
		TYPE result = TYPE.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTYPEToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArctypesPackage getArctypesPackage() {
		return (ArctypesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ArctypesPackage getPackage() {
		return ArctypesPackage.eINSTANCE;
	}

} //ArctypesFactoryImpl

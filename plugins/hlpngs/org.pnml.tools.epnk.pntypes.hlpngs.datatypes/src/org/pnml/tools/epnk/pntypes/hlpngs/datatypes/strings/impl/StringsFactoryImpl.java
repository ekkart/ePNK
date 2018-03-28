/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.Append;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.Concatenation;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.GreaterThan;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.GreaterThanOrEqual;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.Length;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.LessThan;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.LessThanOrEqual;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.StringConstant;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.StringsFactory;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.StringsPackage;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.Substring;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StringsFactoryImpl extends EFactoryImpl implements StringsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StringsFactory init() {
		try {
			StringsFactory theStringsFactory = (StringsFactory)EPackage.Registry.INSTANCE.getEFactory("http://org.pnml.tools/epnk/types/hlpngs/datatypes/strings"); 
			if (theStringsFactory != null) {
				return theStringsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StringsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringsFactoryImpl() {
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
			case StringsPackage.STRING: return createString();
			case StringsPackage.STRING_CONSTANT: return createStringConstant();
			case StringsPackage.SUBSTRING: return createSubstring();
			case StringsPackage.CONCATENATION: return createConcatenation();
			case StringsPackage.APPEND: return createAppend();
			case StringsPackage.LENGTH: return createLength();
			case StringsPackage.GREATER_THAN: return createGreaterThan();
			case StringsPackage.GREATER_THAN_OR_EQUAL: return createGreaterThanOrEqual();
			case StringsPackage.LESS_THAN: return createLessThan();
			case StringsPackage.LESS_THAN_OR_EQUAL: return createLessThanOrEqual();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.String createString() {
		StringImpl string = new StringImpl();
		return string;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringConstant createStringConstant() {
		StringConstantImpl stringConstant = new StringConstantImpl();
		return stringConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Substring createSubstring() {
		SubstringImpl substring = new SubstringImpl();
		return substring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Concatenation createConcatenation() {
		ConcatenationImpl concatenation = new ConcatenationImpl();
		return concatenation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Append createAppend() {
		AppendImpl append = new AppendImpl();
		return append;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Length createLength() {
		LengthImpl length = new LengthImpl();
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GreaterThan createGreaterThan() {
		GreaterThanImpl greaterThan = new GreaterThanImpl();
		return greaterThan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GreaterThanOrEqual createGreaterThanOrEqual() {
		GreaterThanOrEqualImpl greaterThanOrEqual = new GreaterThanOrEqualImpl();
		return greaterThanOrEqual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LessThan createLessThan() {
		LessThanImpl lessThan = new LessThanImpl();
		return lessThan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LessThanOrEqual createLessThanOrEqual() {
		LessThanOrEqualImpl lessThanOrEqual = new LessThanOrEqualImpl();
		return lessThanOrEqual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringsPackage getStringsPackage() {
		return (StringsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StringsPackage getPackage() {
		return StringsPackage.eINSTANCE;
	}

} //StringsFactoryImpl

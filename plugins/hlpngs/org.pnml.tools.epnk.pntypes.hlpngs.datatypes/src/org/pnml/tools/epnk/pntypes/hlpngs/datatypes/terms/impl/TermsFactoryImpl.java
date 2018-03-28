/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Declarations;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.MultiSetSort;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.NamedOperator;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.NamedSort;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.ProductSort;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.TermsFactory;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.TermsPackage;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Tuple;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.UserOperator;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.UserSort;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Variable;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.VariableDecl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TermsFactoryImpl extends EFactoryImpl implements TermsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TermsFactory init() {
		try {
			TermsFactory theTermsFactory = (TermsFactory)EPackage.Registry.INSTANCE.getEFactory("http://org.pnml.tools/epnk/types/hlpngs/datatypes/terms"); 
			if (theTermsFactory != null) {
				return theTermsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TermsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TermsFactoryImpl() {
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
			case TermsPackage.DECLARATIONS: return createDeclarations();
			case TermsPackage.VARIABLE_DECL: return createVariableDecl();
			case TermsPackage.VARIABLE: return createVariable();
			case TermsPackage.NAMED_SORT: return createNamedSort();
			case TermsPackage.MULTI_SET_SORT: return createMultiSetSort();
			case TermsPackage.PRODUCT_SORT: return createProductSort();
			case TermsPackage.USER_SORT: return createUserSort();
			case TermsPackage.TUPLE: return createTuple();
			case TermsPackage.USER_OPERATOR: return createUserOperator();
			case TermsPackage.NAMED_OPERATOR: return createNamedOperator();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Declarations createDeclarations() {
		DeclarationsImpl declarations = new DeclarationsImpl();
		return declarations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDecl createVariableDecl() {
		VariableDeclImpl variableDecl = new VariableDeclImpl();
		return variableDecl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedSort createNamedSort() {
		NamedSortImpl namedSort = new NamedSortImpl();
		return namedSort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiSetSort createMultiSetSort() {
		MultiSetSortImpl multiSetSort = new MultiSetSortImpl();
		return multiSetSort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductSort createProductSort() {
		ProductSortImpl productSort = new ProductSortImpl();
		return productSort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserSort createUserSort() {
		UserSortImpl userSort = new UserSortImpl();
		return userSort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tuple createTuple() {
		TupleImpl tuple = new TupleImpl();
		return tuple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserOperator createUserOperator() {
		UserOperatorImpl userOperator = new UserOperatorImpl();
		return userOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedOperator createNamedOperator() {
		NamedOperatorImpl namedOperator = new NamedOperatorImpl();
		return namedOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TermsPackage getTermsPackage() {
		return (TermsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TermsPackage getPackage() {
		return TermsPackage.eINSTANCE;
	}

} //TermsFactoryImpl

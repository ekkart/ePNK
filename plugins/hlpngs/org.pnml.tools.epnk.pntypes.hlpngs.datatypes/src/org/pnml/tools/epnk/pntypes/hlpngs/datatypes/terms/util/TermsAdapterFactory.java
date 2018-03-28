/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.pnml.tools.epnk.pnmlcoremodel.ID;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.*;
import org.pnml.tools.epnk.structuredpntypemodel.SymbolDef;
import org.pnml.tools.epnk.structuredpntypemodel.SymbolUse;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.TermsPackage
 * @generated
 */
public class TermsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TermsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TermsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TermsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TermsSwitch<Adapter> modelSwitch =
		new TermsSwitch<Adapter>() {
			@Override
			public Adapter caseDeclarations(Declarations object) {
				return createDeclarationsAdapter();
			}
			@Override
			public Adapter caseDeclaration(Declaration object) {
				return createDeclarationAdapter();
			}
			@Override
			public Adapter caseSortDecl(SortDecl object) {
				return createSortDeclAdapter();
			}
			@Override
			public Adapter caseVariableDecl(VariableDecl object) {
				return createVariableDeclAdapter();
			}
			@Override
			public Adapter caseVariable(Variable object) {
				return createVariableAdapter();
			}
			@Override
			public Adapter caseTerm(Term object) {
				return createTermAdapter();
			}
			@Override
			public Adapter caseSort(Sort object) {
				return createSortAdapter();
			}
			@Override
			public Adapter caseOperator(Operator object) {
				return createOperatorAdapter();
			}
			@Override
			public Adapter caseNamedSort(NamedSort object) {
				return createNamedSortAdapter();
			}
			@Override
			public Adapter caseBuiltInSort(BuiltInSort object) {
				return createBuiltInSortAdapter();
			}
			@Override
			public Adapter caseMultiSetSort(MultiSetSort object) {
				return createMultiSetSortAdapter();
			}
			@Override
			public Adapter caseProductSort(ProductSort object) {
				return createProductSortAdapter();
			}
			@Override
			public Adapter caseUserSort(UserSort object) {
				return createUserSortAdapter();
			}
			@Override
			public Adapter caseBuiltInOperator(BuiltInOperator object) {
				return createBuiltInOperatorAdapter();
			}
			@Override
			public Adapter caseBuiltInConst(BuiltInConst object) {
				return createBuiltInConstAdapter();
			}
			@Override
			public Adapter caseMultiSetOperator(MultiSetOperator object) {
				return createMultiSetOperatorAdapter();
			}
			@Override
			public Adapter caseTuple(Tuple object) {
				return createTupleAdapter();
			}
			@Override
			public Adapter caseUserOperator(UserOperator object) {
				return createUserOperatorAdapter();
			}
			@Override
			public Adapter caseOperatorDecl(OperatorDecl object) {
				return createOperatorDeclAdapter();
			}
			@Override
			public Adapter caseNamedOperator(NamedOperator object) {
				return createNamedOperatorAdapter();
			}
			@Override
			public Adapter caseID(ID object) {
				return createIDAdapter();
			}
			@Override
			public Adapter caseSymbolDef(SymbolDef object) {
				return createSymbolDefAdapter();
			}
			@Override
			public Adapter caseSymbolUse(SymbolUse object) {
				return createSymbolUseAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Declarations <em>Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Declarations
	 * @generated
	 */
	public Adapter createDeclarationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Declaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Declaration
	 * @generated
	 */
	public Adapter createDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.pnml.tools.epnk.structuredpntypemodel.SymbolDef <em>Symbol Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.pnml.tools.epnk.structuredpntypemodel.SymbolDef
	 * @generated
	 */
	public Adapter createSymbolDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.SortDecl <em>Sort Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.SortDecl
	 * @generated
	 */
	public Adapter createSortDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.VariableDecl <em>Variable Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.VariableDecl
	 * @generated
	 */
	public Adapter createVariableDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Variable
	 * @generated
	 */
	public Adapter createVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.pnml.tools.epnk.structuredpntypemodel.SymbolUse <em>Symbol Use</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.pnml.tools.epnk.structuredpntypemodel.SymbolUse
	 * @generated
	 */
	public Adapter createSymbolUseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Term <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Term
	 * @generated
	 */
	public Adapter createTermAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Sort <em>Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Sort
	 * @generated
	 */
	public Adapter createSortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Operator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Operator
	 * @generated
	 */
	public Adapter createOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.NamedSort <em>Named Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.NamedSort
	 * @generated
	 */
	public Adapter createNamedSortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.BuiltInSort <em>Built In Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.BuiltInSort
	 * @generated
	 */
	public Adapter createBuiltInSortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.MultiSetSort <em>Multi Set Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.MultiSetSort
	 * @generated
	 */
	public Adapter createMultiSetSortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.ProductSort <em>Product Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.ProductSort
	 * @generated
	 */
	public Adapter createProductSortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.UserSort <em>User Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.UserSort
	 * @generated
	 */
	public Adapter createUserSortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.BuiltInOperator <em>Built In Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.BuiltInOperator
	 * @generated
	 */
	public Adapter createBuiltInOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.BuiltInConst <em>Built In Const</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.BuiltInConst
	 * @generated
	 */
	public Adapter createBuiltInConstAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.MultiSetOperator <em>Multi Set Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.MultiSetOperator
	 * @generated
	 */
	public Adapter createMultiSetOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Tuple <em>Tuple</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Tuple
	 * @generated
	 */
	public Adapter createTupleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.UserOperator <em>User Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.UserOperator
	 * @generated
	 */
	public Adapter createUserOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.OperatorDecl <em>Operator Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.OperatorDecl
	 * @generated
	 */
	public Adapter createOperatorDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.NamedOperator <em>Named Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.NamedOperator
	 * @generated
	 */
	public Adapter createNamedOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.pnml.tools.epnk.pnmlcoremodel.ID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.pnml.tools.epnk.pnmlcoremodel.ID
	 * @generated
	 */
	public Adapter createIDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //TermsAdapterFactory

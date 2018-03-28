/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.arbitrarydeclarations.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.pnml.tools.epnk.pnmlcoremodel.ID;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.arbitrarydeclarations.*;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Declaration;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.OperatorDecl;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.SortDecl;

import org.pnml.tools.epnk.structuredpntypemodel.SymbolDef;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.arbitrarydeclarations.ArbitrarydeclarationsPackage
 * @generated
 */
public class ArbitrarydeclarationsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ArbitrarydeclarationsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArbitrarydeclarationsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ArbitrarydeclarationsPackage.eINSTANCE;
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
	protected ArbitrarydeclarationsSwitch<Adapter> modelSwitch =
		new ArbitrarydeclarationsSwitch<Adapter>() {
			@Override
			public Adapter caseArbitrarySort(ArbitrarySort object) {
				return createArbitrarySortAdapter();
			}
			@Override
			public Adapter caseArbitraryOperator(ArbitraryOperator object) {
				return createArbitraryOperatorAdapter();
			}
			@Override
			public Adapter caseUnparsed(Unparsed object) {
				return createUnparsedAdapter();
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
			public Adapter caseDeclaration(Declaration object) {
				return createDeclarationAdapter();
			}
			@Override
			public Adapter caseSortDecl(SortDecl object) {
				return createSortDeclAdapter();
			}
			@Override
			public Adapter caseOperatorDecl(OperatorDecl object) {
				return createOperatorDeclAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.arbitrarydeclarations.ArbitrarySort <em>Arbitrary Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.arbitrarydeclarations.ArbitrarySort
	 * @generated
	 */
	public Adapter createArbitrarySortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.arbitrarydeclarations.ArbitraryOperator <em>Arbitrary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.arbitrarydeclarations.ArbitraryOperator
	 * @generated
	 */
	public Adapter createArbitraryOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.arbitrarydeclarations.Unparsed <em>Unparsed</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.arbitrarydeclarations.Unparsed
	 * @generated
	 */
	public Adapter createUnparsedAdapter() {
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

} //ArbitrarydeclarationsAdapterFactory

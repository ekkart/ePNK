/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.impl;

import org.eclipse.emf.ecore.EClass;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.IntegersFactory;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.IntegersPackage;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.Natural;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Sort;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Natural</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class NaturalImpl extends NumberImpl implements Natural {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NaturalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IntegersPackage.Literals.NATURAL;
	}

	/*
	 * (non-Javadoc)
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.SortImpl#isSuperSortOf(org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Sort)
	 * @generated NOT
	 */
	@Override
	public boolean isSuperSortOf(Sort sort) {
		if (sort instanceof org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.Natural || 
			sort instanceof org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.Positive) {
			return true;
		}
		return false;
	}

	/*
	 * (non-Javadoc)
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.SortImpl#leastCommonSuper(org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Sort)
	 * @generated NOT
	 */
	@Override
	public Sort leastCommonSuper(Sort sort) {
		if (sort instanceof org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.Natural || 
		    sort instanceof org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.Positive) {
			return IntegersFactory.eINSTANCE.createNatural();
		} else if (sort instanceof org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.Integer) {
			return IntegersFactory.eINSTANCE.createInteger();
		}
		return null;
	}
} //NaturalImpl

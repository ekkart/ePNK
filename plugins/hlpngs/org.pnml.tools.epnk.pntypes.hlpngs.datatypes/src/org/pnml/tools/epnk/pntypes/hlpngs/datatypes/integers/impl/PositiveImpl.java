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
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.Positive;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Sort;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Positive</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PositiveImpl extends NumberImpl implements Positive {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PositiveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IntegersPackage.Literals.POSITIVE;
	}

	/*
	 * (non-Javadoc)
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.SortImpl#leastCommonSuper(org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Sort)
	 * @generated NOT
	 */
	@Override
	public Sort leastCommonSuper(Sort sort) {
		if (sort instanceof org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.Positive) {
			return IntegersFactory.eINSTANCE.createPositive();
		} else if (sort instanceof org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.Natural) {
			return IntegersFactory.eINSTANCE.createNatural();
		} else if (sort instanceof org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.Integer) {
			return IntegersFactory.eINSTANCE.createInteger();
		} 
		return null;
	}
} //PositiveImpl

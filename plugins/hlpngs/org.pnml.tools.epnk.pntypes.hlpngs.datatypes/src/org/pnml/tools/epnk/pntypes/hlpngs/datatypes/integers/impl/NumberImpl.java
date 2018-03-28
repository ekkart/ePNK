/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.impl;

import org.eclipse.emf.ecore.EClass;

import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.IntegersPackage;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.Natural;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.Integer;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.Positive;


import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Sort;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.BuiltInSortImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Number</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class NumberImpl extends BuiltInSortImpl implements org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.Number {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NumberImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IntegersPackage.Literals.NUMBER;
	}

	// @generated NOT
	// @author eki
	@Override
	public boolean isSuperSortOf(Sort sort) {
		return
		  ( this instanceof Integer &&
				  (sort instanceof Integer ||
				   sort instanceof Natural ||
				   sort instanceof Positive) )   ||
	      ( this instanceof Natural &&
	    		  ( sort instanceof  Natural ||
	    		    sort instanceof Positive ) ) ||
          (this instanceof Positive &&
        		    sort instanceof Positive );
	}

	
} //NumberImpl

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.impl;

import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.IntegersFactory;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.Length;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.String;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.strings.StringsPackage;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.NamedOperator;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Sort;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Term;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Length</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class LengthImpl extends StringOperatorImpl implements Length {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LengthImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StringsPackage.Literals.LENGTH;
	}

	@Override
	// @generated NOT
	// @author eki
	public Sort getSort(Set<NamedOperator> used) {
		List<Term> subterms = this.getSubterm();
		
		if (subterms == null ||
				subterms.size() != 1 ) {
			return null;
		}
		
		Sort sort = subterms.get(0).getSort(used);
		if (sort == null || !(sort instanceof String)) {
			return null;
		}
		return IntegersFactory.eINSTANCE.createNatural();
	}

} //LengthImpl

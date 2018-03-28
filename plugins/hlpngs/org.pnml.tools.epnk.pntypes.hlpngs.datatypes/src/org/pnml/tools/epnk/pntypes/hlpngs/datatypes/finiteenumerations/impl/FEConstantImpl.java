/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteenumerations.impl;

import java.util.Set;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteenumerations.FEConstant;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteenumerations.FiniteEnumeration;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.finiteenumerations.FiniteenumerationsPackage;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.NamedOperator;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Sort;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.OperatorDeclImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FE Constant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class FEConstantImpl extends OperatorDeclImpl implements FEConstant {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FEConstantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FiniteenumerationsPackage.Literals.FE_CONSTANT;
	}

	@Override
	// @generated NOT
	// @author eki
	public EList<Sort> getInputSorts() {
		return new BasicEList<Sort>();
	}

	@Override
	// @generated NOT
	// @author eki
	public Sort getOutPutSort() {
		return getOutPutSort(null);
	}

	@Override
	// @generated NOT
	// @author eki
	public Sort getOutPutSort(Set<NamedOperator> used) {
		EObject parent = this.eContainer;
		if (parent != null && parent instanceof FiniteEnumeration) {
			return ((FiniteEnumeration) parent).resolve(null);
		}
		return null;		
	}

} //FEConstantImpl

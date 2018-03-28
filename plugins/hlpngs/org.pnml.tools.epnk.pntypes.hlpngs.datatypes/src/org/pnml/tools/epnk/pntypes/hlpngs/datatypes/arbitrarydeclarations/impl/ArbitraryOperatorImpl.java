/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.arbitrarydeclarations.impl;

import java.util.Collection;
import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.arbitrarydeclarations.ArbitraryOperator;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.arbitrarydeclarations.ArbitrarydeclarationsPackage;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.NamedOperator;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Sort;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl.OperatorDeclImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arbitrary Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.arbitrarydeclarations.impl.ArbitraryOperatorImpl#getInput <em>Input</em>}</li>
 *   <li>{@link org.pnml.tools.epnk.pntypes.hlpngs.datatypes.arbitrarydeclarations.impl.ArbitraryOperatorImpl#getOutput <em>Output</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArbitraryOperatorImpl extends OperatorDeclImpl implements ArbitraryOperator {
	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected EList<Sort> input;

	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected Sort output;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArbitraryOperatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArbitrarydeclarationsPackage.Literals.ARBITRARY_OPERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sort> getInput() {
		if (input == null) {
			input = new EObjectContainmentEList<Sort>(Sort.class, this, ArbitrarydeclarationsPackage.ARBITRARY_OPERATOR__INPUT);
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sort getOutput() {
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutput(Sort newOutput, NotificationChain msgs) {
		Sort oldOutput = output;
		output = newOutput;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArbitrarydeclarationsPackage.ARBITRARY_OPERATOR__OUTPUT, oldOutput, newOutput);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput(Sort newOutput) {
		if (newOutput != output) {
			NotificationChain msgs = null;
			if (output != null)
				msgs = ((InternalEObject)output).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ArbitrarydeclarationsPackage.ARBITRARY_OPERATOR__OUTPUT, null, msgs);
			if (newOutput != null)
				msgs = ((InternalEObject)newOutput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ArbitrarydeclarationsPackage.ARBITRARY_OPERATOR__OUTPUT, null, msgs);
			msgs = basicSetOutput(newOutput, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArbitrarydeclarationsPackage.ARBITRARY_OPERATOR__OUTPUT, newOutput, newOutput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArbitrarydeclarationsPackage.ARBITRARY_OPERATOR__INPUT:
				return ((InternalEList<?>)getInput()).basicRemove(otherEnd, msgs);
			case ArbitrarydeclarationsPackage.ARBITRARY_OPERATOR__OUTPUT:
				return basicSetOutput(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArbitrarydeclarationsPackage.ARBITRARY_OPERATOR__INPUT:
				return getInput();
			case ArbitrarydeclarationsPackage.ARBITRARY_OPERATOR__OUTPUT:
				return getOutput();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ArbitrarydeclarationsPackage.ARBITRARY_OPERATOR__INPUT:
				getInput().clear();
				getInput().addAll((Collection<? extends Sort>)newValue);
				return;
			case ArbitrarydeclarationsPackage.ARBITRARY_OPERATOR__OUTPUT:
				setOutput((Sort)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ArbitrarydeclarationsPackage.ARBITRARY_OPERATOR__INPUT:
				getInput().clear();
				return;
			case ArbitrarydeclarationsPackage.ARBITRARY_OPERATOR__OUTPUT:
				setOutput((Sort)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ArbitrarydeclarationsPackage.ARBITRARY_OPERATOR__INPUT:
				return input != null && !input.isEmpty();
			case ArbitrarydeclarationsPackage.ARBITRARY_OPERATOR__OUTPUT:
				return output != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	// @generated NOT
	// @author eki
	public EList<Sort> getInputSorts() {
		EList<Sort> result = new BasicEList<Sort>();
				
		for (Sort sort: this.getInput()) {
				Sort rSort = sort.resolve(null);
				if (rSort != null) {
					result.add(rSort);
				} else {
					return null;
				}
		}
		return result;
	}

	@Override
	// @generated NOT
	// @author eki
	public Sort getOutPutSort() {
		Sort sort = this.getOutput();
		if (sort != null) {
			return sort.resolve(null);
		}	
		return null;
	}

	@Override
	// @generated NOT
	// @author eki	
	public Sort getOutPutSort(Set<NamedOperator> used) {
		return getOutPutSort();
	}

} //ArbitraryOperatorImpl

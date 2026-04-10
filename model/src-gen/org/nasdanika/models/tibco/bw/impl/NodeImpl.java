/**
 */
package org.nasdanika.models.tibco.bw.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.tibco.bw.BwPackage;
import org.nasdanika.models.tibco.bw.Node;
import org.nasdanika.models.tibco.bw.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.tibco.bw.impl.NodeImpl#getX <em>X</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.impl.NodeImpl#getY <em>Y</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.impl.NodeImpl#getOutgoingTransitions <em>Outgoing Transitions</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.impl.NodeImpl#getIncomingTransitions <em>Incoming Transitions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeImpl extends NamedElementImpl implements Node {
	/**
	 * The default value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected static final int X_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected static final int Y_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BwPackage.Literals.NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getX() {
		return (Integer)eDynamicGet(BwPackage.NODE__X, BwPackage.Literals.NODE__X, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setX(int newX) {
		eDynamicSet(BwPackage.NODE__X, BwPackage.Literals.NODE__X, newX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getY() {
		return (Integer)eDynamicGet(BwPackage.NODE__Y, BwPackage.Literals.NODE__Y, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setY(int newY) {
		eDynamicSet(BwPackage.NODE__Y, BwPackage.Literals.NODE__Y, newY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Transition> getOutgoingTransitions() {
		return (EList<Transition>)eDynamicGet(BwPackage.NODE__OUTGOING_TRANSITIONS, BwPackage.Literals.NODE__OUTGOING_TRANSITIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Transition> getIncomingTransitions() {
		return (EList<Transition>)eDynamicGet(BwPackage.NODE__INCOMING_TRANSITIONS, BwPackage.Literals.NODE__INCOMING_TRANSITIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BwPackage.NODE__OUTGOING_TRANSITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingTransitions()).basicAdd(otherEnd, msgs);
			case BwPackage.NODE__INCOMING_TRANSITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingTransitions()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BwPackage.NODE__OUTGOING_TRANSITIONS:
				return ((InternalEList<?>)getOutgoingTransitions()).basicRemove(otherEnd, msgs);
			case BwPackage.NODE__INCOMING_TRANSITIONS:
				return ((InternalEList<?>)getIncomingTransitions()).basicRemove(otherEnd, msgs);
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
			case BwPackage.NODE__X:
				return getX();
			case BwPackage.NODE__Y:
				return getY();
			case BwPackage.NODE__OUTGOING_TRANSITIONS:
				return getOutgoingTransitions();
			case BwPackage.NODE__INCOMING_TRANSITIONS:
				return getIncomingTransitions();
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
			case BwPackage.NODE__X:
				setX((Integer)newValue);
				return;
			case BwPackage.NODE__Y:
				setY((Integer)newValue);
				return;
			case BwPackage.NODE__OUTGOING_TRANSITIONS:
				getOutgoingTransitions().clear();
				getOutgoingTransitions().addAll((Collection<? extends Transition>)newValue);
				return;
			case BwPackage.NODE__INCOMING_TRANSITIONS:
				getIncomingTransitions().clear();
				getIncomingTransitions().addAll((Collection<? extends Transition>)newValue);
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
			case BwPackage.NODE__X:
				setX(X_EDEFAULT);
				return;
			case BwPackage.NODE__Y:
				setY(Y_EDEFAULT);
				return;
			case BwPackage.NODE__OUTGOING_TRANSITIONS:
				getOutgoingTransitions().clear();
				return;
			case BwPackage.NODE__INCOMING_TRANSITIONS:
				getIncomingTransitions().clear();
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
			case BwPackage.NODE__X:
				return getX() != X_EDEFAULT;
			case BwPackage.NODE__Y:
				return getY() != Y_EDEFAULT;
			case BwPackage.NODE__OUTGOING_TRANSITIONS:
				return !getOutgoingTransitions().isEmpty();
			case BwPackage.NODE__INCOMING_TRANSITIONS:
				return !getIncomingTransitions().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NodeImpl

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
import org.nasdanika.models.tibco.bw.TypedNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Typed Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.tibco.bw.impl.TypedNodeImpl#getX <em>X</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.impl.TypedNodeImpl#getY <em>Y</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.impl.TypedNodeImpl#getOutgoingTransitions <em>Outgoing Transitions</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.impl.TypedNodeImpl#getIncomingTransitions <em>Incoming Transitions</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.impl.TypedNodeImpl#getResourceType <em>Resource Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypedNodeImpl extends TypedElementImpl implements TypedNode {
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
	 * The default value of the '{@link #getResourceType() <em>Resource Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceType()
	 * @generated
	 * @ordered
	 */
	protected static final String RESOURCE_TYPE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypedNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BwPackage.Literals.TYPED_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getX() {
		return (Integer)eDynamicGet(BwPackage.TYPED_NODE__X, BwPackage.Literals.NODE__X, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setX(int newX) {
		eDynamicSet(BwPackage.TYPED_NODE__X, BwPackage.Literals.NODE__X, newX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getY() {
		return (Integer)eDynamicGet(BwPackage.TYPED_NODE__Y, BwPackage.Literals.NODE__Y, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setY(int newY) {
		eDynamicSet(BwPackage.TYPED_NODE__Y, BwPackage.Literals.NODE__Y, newY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Transition> getOutgoingTransitions() {
		return (EList<Transition>)eDynamicGet(BwPackage.TYPED_NODE__OUTGOING_TRANSITIONS, BwPackage.Literals.NODE__OUTGOING_TRANSITIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Transition> getIncomingTransitions() {
		return (EList<Transition>)eDynamicGet(BwPackage.TYPED_NODE__INCOMING_TRANSITIONS, BwPackage.Literals.NODE__INCOMING_TRANSITIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getResourceType() {
		return (String)eDynamicGet(BwPackage.TYPED_NODE__RESOURCE_TYPE, BwPackage.Literals.TYPED_NODE__RESOURCE_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResourceType(String newResourceType) {
		eDynamicSet(BwPackage.TYPED_NODE__RESOURCE_TYPE, BwPackage.Literals.TYPED_NODE__RESOURCE_TYPE, newResourceType);
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
			case BwPackage.TYPED_NODE__OUTGOING_TRANSITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingTransitions()).basicAdd(otherEnd, msgs);
			case BwPackage.TYPED_NODE__INCOMING_TRANSITIONS:
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
			case BwPackage.TYPED_NODE__OUTGOING_TRANSITIONS:
				return ((InternalEList<?>)getOutgoingTransitions()).basicRemove(otherEnd, msgs);
			case BwPackage.TYPED_NODE__INCOMING_TRANSITIONS:
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
			case BwPackage.TYPED_NODE__X:
				return getX();
			case BwPackage.TYPED_NODE__Y:
				return getY();
			case BwPackage.TYPED_NODE__OUTGOING_TRANSITIONS:
				return getOutgoingTransitions();
			case BwPackage.TYPED_NODE__INCOMING_TRANSITIONS:
				return getIncomingTransitions();
			case BwPackage.TYPED_NODE__RESOURCE_TYPE:
				return getResourceType();
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
			case BwPackage.TYPED_NODE__X:
				setX((Integer)newValue);
				return;
			case BwPackage.TYPED_NODE__Y:
				setY((Integer)newValue);
				return;
			case BwPackage.TYPED_NODE__OUTGOING_TRANSITIONS:
				getOutgoingTransitions().clear();
				getOutgoingTransitions().addAll((Collection<? extends Transition>)newValue);
				return;
			case BwPackage.TYPED_NODE__INCOMING_TRANSITIONS:
				getIncomingTransitions().clear();
				getIncomingTransitions().addAll((Collection<? extends Transition>)newValue);
				return;
			case BwPackage.TYPED_NODE__RESOURCE_TYPE:
				setResourceType((String)newValue);
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
			case BwPackage.TYPED_NODE__X:
				setX(X_EDEFAULT);
				return;
			case BwPackage.TYPED_NODE__Y:
				setY(Y_EDEFAULT);
				return;
			case BwPackage.TYPED_NODE__OUTGOING_TRANSITIONS:
				getOutgoingTransitions().clear();
				return;
			case BwPackage.TYPED_NODE__INCOMING_TRANSITIONS:
				getIncomingTransitions().clear();
				return;
			case BwPackage.TYPED_NODE__RESOURCE_TYPE:
				setResourceType(RESOURCE_TYPE_EDEFAULT);
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
			case BwPackage.TYPED_NODE__X:
				return getX() != X_EDEFAULT;
			case BwPackage.TYPED_NODE__Y:
				return getY() != Y_EDEFAULT;
			case BwPackage.TYPED_NODE__OUTGOING_TRANSITIONS:
				return !getOutgoingTransitions().isEmpty();
			case BwPackage.TYPED_NODE__INCOMING_TRANSITIONS:
				return !getIncomingTransitions().isEmpty();
			case BwPackage.TYPED_NODE__RESOURCE_TYPE:
				return RESOURCE_TYPE_EDEFAULT == null ? getResourceType() != null : !RESOURCE_TYPE_EDEFAULT.equals(getResourceType());
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Node.class) {
			switch (derivedFeatureID) {
				case BwPackage.TYPED_NODE__X: return BwPackage.NODE__X;
				case BwPackage.TYPED_NODE__Y: return BwPackage.NODE__Y;
				case BwPackage.TYPED_NODE__OUTGOING_TRANSITIONS: return BwPackage.NODE__OUTGOING_TRANSITIONS;
				case BwPackage.TYPED_NODE__INCOMING_TRANSITIONS: return BwPackage.NODE__INCOMING_TRANSITIONS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Node.class) {
			switch (baseFeatureID) {
				case BwPackage.NODE__X: return BwPackage.TYPED_NODE__X;
				case BwPackage.NODE__Y: return BwPackage.TYPED_NODE__Y;
				case BwPackage.NODE__OUTGOING_TRANSITIONS: return BwPackage.TYPED_NODE__OUTGOING_TRANSITIONS;
				case BwPackage.NODE__INCOMING_TRANSITIONS: return BwPackage.TYPED_NODE__INCOMING_TRANSITIONS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //TypedNodeImpl

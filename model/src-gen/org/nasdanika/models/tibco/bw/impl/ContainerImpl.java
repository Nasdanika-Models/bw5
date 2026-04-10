/**
 */
package org.nasdanika.models.tibco.bw.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.tibco.bw.Activity;
import org.nasdanika.models.tibco.bw.BwPackage;
import org.nasdanika.models.tibco.bw.Group;
import org.nasdanika.models.tibco.bw.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.tibco.bw.impl.ContainerImpl#getActivities <em>Activities</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.impl.ContainerImpl#getGroups <em>Groups</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.impl.ContainerImpl#getTransitions <em>Transitions</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ContainerImpl extends NamedElementImpl implements org.nasdanika.models.tibco.bw.Container {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BwPackage.Literals.CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Activity> getActivities() {
		return (EList<Activity>)eDynamicGet(BwPackage.CONTAINER__ACTIVITIES, BwPackage.Literals.CONTAINER__ACTIVITIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Group> getGroups() {
		return (EList<Group>)eDynamicGet(BwPackage.CONTAINER__GROUPS, BwPackage.Literals.CONTAINER__GROUPS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Transition> getTransitions() {
		return (EList<Transition>)eDynamicGet(BwPackage.CONTAINER__TRANSITIONS, BwPackage.Literals.CONTAINER__TRANSITIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BwPackage.CONTAINER__ACTIVITIES:
				return ((InternalEList<?>)getActivities()).basicRemove(otherEnd, msgs);
			case BwPackage.CONTAINER__GROUPS:
				return ((InternalEList<?>)getGroups()).basicRemove(otherEnd, msgs);
			case BwPackage.CONTAINER__TRANSITIONS:
				return ((InternalEList<?>)getTransitions()).basicRemove(otherEnd, msgs);
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
			case BwPackage.CONTAINER__ACTIVITIES:
				return getActivities();
			case BwPackage.CONTAINER__GROUPS:
				return getGroups();
			case BwPackage.CONTAINER__TRANSITIONS:
				return getTransitions();
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
			case BwPackage.CONTAINER__ACTIVITIES:
				getActivities().clear();
				getActivities().addAll((Collection<? extends Activity>)newValue);
				return;
			case BwPackage.CONTAINER__GROUPS:
				getGroups().clear();
				getGroups().addAll((Collection<? extends Group>)newValue);
				return;
			case BwPackage.CONTAINER__TRANSITIONS:
				getTransitions().clear();
				getTransitions().addAll((Collection<? extends Transition>)newValue);
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
			case BwPackage.CONTAINER__ACTIVITIES:
				getActivities().clear();
				return;
			case BwPackage.CONTAINER__GROUPS:
				getGroups().clear();
				return;
			case BwPackage.CONTAINER__TRANSITIONS:
				getTransitions().clear();
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
			case BwPackage.CONTAINER__ACTIVITIES:
				return !getActivities().isEmpty();
			case BwPackage.CONTAINER__GROUPS:
				return !getGroups().isEmpty();
			case BwPackage.CONTAINER__TRANSITIONS:
				return !getTransitions().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ContainerImpl

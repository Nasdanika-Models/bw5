/**
 */
package org.nasdanika.models.bw5.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.bw5.Activity;
import org.nasdanika.models.bw5.Bw5Package;
import org.nasdanika.models.bw5.Group;
import org.nasdanika.models.bw5.Node;
import org.nasdanika.models.bw5.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.bw5.impl.ContainerImpl#getActivities <em>Activities</em>}</li>
 *   <li>{@link org.nasdanika.models.bw5.impl.ContainerImpl#getGroups <em>Groups</em>}</li>
 *   <li>{@link org.nasdanika.models.bw5.impl.ContainerImpl#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link org.nasdanika.models.bw5.impl.ContainerImpl#getStart <em>Start</em>}</li>
 *   <li>{@link org.nasdanika.models.bw5.impl.ContainerImpl#getEnd <em>End</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ContainerImpl extends NamedElementImpl implements org.nasdanika.models.bw5.Container {
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
		return Bw5Package.Literals.CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Activity> getActivities() {
		return (EList<Activity>)eDynamicGet(Bw5Package.CONTAINER__ACTIVITIES, Bw5Package.Literals.CONTAINER__ACTIVITIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Group> getGroups() {
		return (EList<Group>)eDynamicGet(Bw5Package.CONTAINER__GROUPS, Bw5Package.Literals.CONTAINER__GROUPS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Transition> getTransitions() {
		return (EList<Transition>)eDynamicGet(Bw5Package.CONTAINER__TRANSITIONS, Bw5Package.Literals.CONTAINER__TRANSITIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Node getStart() {
		return (Node)eDynamicGet(Bw5Package.CONTAINER__START, Bw5Package.Literals.CONTAINER__START, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetStart() {
		return (Node)eDynamicGet(Bw5Package.CONTAINER__START, Bw5Package.Literals.CONTAINER__START, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStart(Node newStart) {
		eDynamicSet(Bw5Package.CONTAINER__START, Bw5Package.Literals.CONTAINER__START, newStart);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Node getEnd() {
		return (Node)eDynamicGet(Bw5Package.CONTAINER__END, Bw5Package.Literals.CONTAINER__END, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetEnd() {
		return (Node)eDynamicGet(Bw5Package.CONTAINER__END, Bw5Package.Literals.CONTAINER__END, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnd(Node newEnd) {
		eDynamicSet(Bw5Package.CONTAINER__END, Bw5Package.Literals.CONTAINER__END, newEnd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Bw5Package.CONTAINER__ACTIVITIES:
				return ((InternalEList<?>)getActivities()).basicRemove(otherEnd, msgs);
			case Bw5Package.CONTAINER__GROUPS:
				return ((InternalEList<?>)getGroups()).basicRemove(otherEnd, msgs);
			case Bw5Package.CONTAINER__TRANSITIONS:
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
			case Bw5Package.CONTAINER__ACTIVITIES:
				return getActivities();
			case Bw5Package.CONTAINER__GROUPS:
				return getGroups();
			case Bw5Package.CONTAINER__TRANSITIONS:
				return getTransitions();
			case Bw5Package.CONTAINER__START:
				if (resolve) return getStart();
				return basicGetStart();
			case Bw5Package.CONTAINER__END:
				if (resolve) return getEnd();
				return basicGetEnd();
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
			case Bw5Package.CONTAINER__ACTIVITIES:
				getActivities().clear();
				getActivities().addAll((Collection<? extends Activity>)newValue);
				return;
			case Bw5Package.CONTAINER__GROUPS:
				getGroups().clear();
				getGroups().addAll((Collection<? extends Group>)newValue);
				return;
			case Bw5Package.CONTAINER__TRANSITIONS:
				getTransitions().clear();
				getTransitions().addAll((Collection<? extends Transition>)newValue);
				return;
			case Bw5Package.CONTAINER__START:
				setStart((Node)newValue);
				return;
			case Bw5Package.CONTAINER__END:
				setEnd((Node)newValue);
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
			case Bw5Package.CONTAINER__ACTIVITIES:
				getActivities().clear();
				return;
			case Bw5Package.CONTAINER__GROUPS:
				getGroups().clear();
				return;
			case Bw5Package.CONTAINER__TRANSITIONS:
				getTransitions().clear();
				return;
			case Bw5Package.CONTAINER__START:
				setStart((Node)null);
				return;
			case Bw5Package.CONTAINER__END:
				setEnd((Node)null);
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
			case Bw5Package.CONTAINER__ACTIVITIES:
				return !getActivities().isEmpty();
			case Bw5Package.CONTAINER__GROUPS:
				return !getGroups().isEmpty();
			case Bw5Package.CONTAINER__TRANSITIONS:
				return !getTransitions().isEmpty();
			case Bw5Package.CONTAINER__START:
				return basicGetStart() != null;
			case Bw5Package.CONTAINER__END:
				return basicGetEnd() != null;
		}
		return super.eIsSet(featureID);
	}

} //ContainerImpl

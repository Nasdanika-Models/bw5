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
 * An implementation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.tibco.bw.impl.GroupImpl#getActivities <em>Activities</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.impl.GroupImpl#getGroups <em>Groups</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.impl.GroupImpl#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.impl.GroupImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.impl.GroupImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.impl.GroupImpl#getCollapsedWidth <em>Collapsed Width</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.impl.GroupImpl#getCollapsedHeight <em>Collapsed Height</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.impl.GroupImpl#isExpanded <em>Expanded</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GroupImpl extends ActivityImpl implements Group {
	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int WIDTH_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final int HEIGHT_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getCollapsedWidth() <em>Collapsed Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollapsedWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int COLLAPSED_WIDTH_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getCollapsedHeight() <em>Collapsed Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollapsedHeight()
	 * @generated
	 * @ordered
	 */
	protected static final int COLLAPSED_HEIGHT_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #isExpanded() <em>Expanded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExpanded()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXPANDED_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BwPackage.Literals.GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Activity> getActivities() {
		return (EList<Activity>)eDynamicGet(BwPackage.GROUP__ACTIVITIES, BwPackage.Literals.CONTAINER__ACTIVITIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Group> getGroups() {
		return (EList<Group>)eDynamicGet(BwPackage.GROUP__GROUPS, BwPackage.Literals.CONTAINER__GROUPS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Transition> getTransitions() {
		return (EList<Transition>)eDynamicGet(BwPackage.GROUP__TRANSITIONS, BwPackage.Literals.CONTAINER__TRANSITIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getWidth() {
		return (Integer)eDynamicGet(BwPackage.GROUP__WIDTH, BwPackage.Literals.GROUP__WIDTH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWidth(int newWidth) {
		eDynamicSet(BwPackage.GROUP__WIDTH, BwPackage.Literals.GROUP__WIDTH, newWidth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getHeight() {
		return (Integer)eDynamicGet(BwPackage.GROUP__HEIGHT, BwPackage.Literals.GROUP__HEIGHT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeight(int newHeight) {
		eDynamicSet(BwPackage.GROUP__HEIGHT, BwPackage.Literals.GROUP__HEIGHT, newHeight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getCollapsedWidth() {
		return (Integer)eDynamicGet(BwPackage.GROUP__COLLAPSED_WIDTH, BwPackage.Literals.GROUP__COLLAPSED_WIDTH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCollapsedWidth(int newCollapsedWidth) {
		eDynamicSet(BwPackage.GROUP__COLLAPSED_WIDTH, BwPackage.Literals.GROUP__COLLAPSED_WIDTH, newCollapsedWidth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getCollapsedHeight() {
		return (Integer)eDynamicGet(BwPackage.GROUP__COLLAPSED_HEIGHT, BwPackage.Literals.GROUP__COLLAPSED_HEIGHT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCollapsedHeight(int newCollapsedHeight) {
		eDynamicSet(BwPackage.GROUP__COLLAPSED_HEIGHT, BwPackage.Literals.GROUP__COLLAPSED_HEIGHT, newCollapsedHeight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isExpanded() {
		return (Boolean)eDynamicGet(BwPackage.GROUP__EXPANDED, BwPackage.Literals.GROUP__EXPANDED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpanded(boolean newExpanded) {
		eDynamicSet(BwPackage.GROUP__EXPANDED, BwPackage.Literals.GROUP__EXPANDED, newExpanded);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BwPackage.GROUP__ACTIVITIES:
				return ((InternalEList<?>)getActivities()).basicRemove(otherEnd, msgs);
			case BwPackage.GROUP__GROUPS:
				return ((InternalEList<?>)getGroups()).basicRemove(otherEnd, msgs);
			case BwPackage.GROUP__TRANSITIONS:
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
			case BwPackage.GROUP__ACTIVITIES:
				return getActivities();
			case BwPackage.GROUP__GROUPS:
				return getGroups();
			case BwPackage.GROUP__TRANSITIONS:
				return getTransitions();
			case BwPackage.GROUP__WIDTH:
				return getWidth();
			case BwPackage.GROUP__HEIGHT:
				return getHeight();
			case BwPackage.GROUP__COLLAPSED_WIDTH:
				return getCollapsedWidth();
			case BwPackage.GROUP__COLLAPSED_HEIGHT:
				return getCollapsedHeight();
			case BwPackage.GROUP__EXPANDED:
				return isExpanded();
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
			case BwPackage.GROUP__ACTIVITIES:
				getActivities().clear();
				getActivities().addAll((Collection<? extends Activity>)newValue);
				return;
			case BwPackage.GROUP__GROUPS:
				getGroups().clear();
				getGroups().addAll((Collection<? extends Group>)newValue);
				return;
			case BwPackage.GROUP__TRANSITIONS:
				getTransitions().clear();
				getTransitions().addAll((Collection<? extends Transition>)newValue);
				return;
			case BwPackage.GROUP__WIDTH:
				setWidth((Integer)newValue);
				return;
			case BwPackage.GROUP__HEIGHT:
				setHeight((Integer)newValue);
				return;
			case BwPackage.GROUP__COLLAPSED_WIDTH:
				setCollapsedWidth((Integer)newValue);
				return;
			case BwPackage.GROUP__COLLAPSED_HEIGHT:
				setCollapsedHeight((Integer)newValue);
				return;
			case BwPackage.GROUP__EXPANDED:
				setExpanded((Boolean)newValue);
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
			case BwPackage.GROUP__ACTIVITIES:
				getActivities().clear();
				return;
			case BwPackage.GROUP__GROUPS:
				getGroups().clear();
				return;
			case BwPackage.GROUP__TRANSITIONS:
				getTransitions().clear();
				return;
			case BwPackage.GROUP__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case BwPackage.GROUP__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case BwPackage.GROUP__COLLAPSED_WIDTH:
				setCollapsedWidth(COLLAPSED_WIDTH_EDEFAULT);
				return;
			case BwPackage.GROUP__COLLAPSED_HEIGHT:
				setCollapsedHeight(COLLAPSED_HEIGHT_EDEFAULT);
				return;
			case BwPackage.GROUP__EXPANDED:
				setExpanded(EXPANDED_EDEFAULT);
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
			case BwPackage.GROUP__ACTIVITIES:
				return !getActivities().isEmpty();
			case BwPackage.GROUP__GROUPS:
				return !getGroups().isEmpty();
			case BwPackage.GROUP__TRANSITIONS:
				return !getTransitions().isEmpty();
			case BwPackage.GROUP__WIDTH:
				return getWidth() != WIDTH_EDEFAULT;
			case BwPackage.GROUP__HEIGHT:
				return getHeight() != HEIGHT_EDEFAULT;
			case BwPackage.GROUP__COLLAPSED_WIDTH:
				return getCollapsedWidth() != COLLAPSED_WIDTH_EDEFAULT;
			case BwPackage.GROUP__COLLAPSED_HEIGHT:
				return getCollapsedHeight() != COLLAPSED_HEIGHT_EDEFAULT;
			case BwPackage.GROUP__EXPANDED:
				return isExpanded() != EXPANDED_EDEFAULT;
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
		if (baseClass == org.nasdanika.models.tibco.bw.Container.class) {
			switch (derivedFeatureID) {
				case BwPackage.GROUP__ACTIVITIES: return BwPackage.CONTAINER__ACTIVITIES;
				case BwPackage.GROUP__GROUPS: return BwPackage.CONTAINER__GROUPS;
				case BwPackage.GROUP__TRANSITIONS: return BwPackage.CONTAINER__TRANSITIONS;
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
		if (baseClass == org.nasdanika.models.tibco.bw.Container.class) {
			switch (baseFeatureID) {
				case BwPackage.CONTAINER__ACTIVITIES: return BwPackage.GROUP__ACTIVITIES;
				case BwPackage.CONTAINER__GROUPS: return BwPackage.GROUP__GROUPS;
				case BwPackage.CONTAINER__TRANSITIONS: return BwPackage.GROUP__TRANSITIONS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //GroupImpl

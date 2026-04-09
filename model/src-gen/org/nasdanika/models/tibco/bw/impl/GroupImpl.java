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
 *   <li>{@link org.nasdanika.models.tibco.bw.impl.GroupImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.impl.GroupImpl#getResourceType <em>Resource Type</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.impl.GroupImpl#getX <em>X</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.impl.GroupImpl#getY <em>Y</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.impl.GroupImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.impl.GroupImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.impl.GroupImpl#getCollapsedWidth <em>Collapsed Width</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.impl.GroupImpl#getCollapsedHeight <em>Collapsed Height</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.impl.GroupImpl#isExpanded <em>Expanded</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.impl.GroupImpl#getConfig <em>Config</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.impl.GroupImpl#getInputBindings <em>Input Bindings</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.impl.GroupImpl#getActivities <em>Activities</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.impl.GroupImpl#getGroups <em>Groups</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.impl.GroupImpl#getTransitions <em>Transitions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GroupImpl extends NamedElementImpl implements Group {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

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
	 * The default value of the '{@link #getConfig() <em>Config</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfig()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFIG_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getInputBindings() <em>Input Bindings</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputBindings()
	 * @generated
	 * @ordered
	 */
	protected static final String INPUT_BINDINGS_EDEFAULT = null;

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
	@Override
	public String getType() {
		return (String)eDynamicGet(BwPackage.GROUP__TYPE, BwPackage.Literals.GROUP__TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(String newType) {
		eDynamicSet(BwPackage.GROUP__TYPE, BwPackage.Literals.GROUP__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getResourceType() {
		return (String)eDynamicGet(BwPackage.GROUP__RESOURCE_TYPE, BwPackage.Literals.GROUP__RESOURCE_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResourceType(String newResourceType) {
		eDynamicSet(BwPackage.GROUP__RESOURCE_TYPE, BwPackage.Literals.GROUP__RESOURCE_TYPE, newResourceType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getX() {
		return (Integer)eDynamicGet(BwPackage.GROUP__X, BwPackage.Literals.GROUP__X, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setX(int newX) {
		eDynamicSet(BwPackage.GROUP__X, BwPackage.Literals.GROUP__X, newX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getY() {
		return (Integer)eDynamicGet(BwPackage.GROUP__Y, BwPackage.Literals.GROUP__Y, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setY(int newY) {
		eDynamicSet(BwPackage.GROUP__Y, BwPackage.Literals.GROUP__Y, newY);
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
	public String getConfig() {
		return (String)eDynamicGet(BwPackage.GROUP__CONFIG, BwPackage.Literals.GROUP__CONFIG, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfig(String newConfig) {
		eDynamicSet(BwPackage.GROUP__CONFIG, BwPackage.Literals.GROUP__CONFIG, newConfig);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInputBindings() {
		return (String)eDynamicGet(BwPackage.GROUP__INPUT_BINDINGS, BwPackage.Literals.GROUP__INPUT_BINDINGS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInputBindings(String newInputBindings) {
		eDynamicSet(BwPackage.GROUP__INPUT_BINDINGS, BwPackage.Literals.GROUP__INPUT_BINDINGS, newInputBindings);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Activity> getActivities() {
		return (EList<Activity>)eDynamicGet(BwPackage.GROUP__ACTIVITIES, BwPackage.Literals.GROUP__ACTIVITIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Group> getGroups() {
		return (EList<Group>)eDynamicGet(BwPackage.GROUP__GROUPS, BwPackage.Literals.GROUP__GROUPS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Transition> getTransitions() {
		return (EList<Transition>)eDynamicGet(BwPackage.GROUP__TRANSITIONS, BwPackage.Literals.GROUP__TRANSITIONS, true, true);
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
			case BwPackage.GROUP__TYPE:
				return getType();
			case BwPackage.GROUP__RESOURCE_TYPE:
				return getResourceType();
			case BwPackage.GROUP__X:
				return getX();
			case BwPackage.GROUP__Y:
				return getY();
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
			case BwPackage.GROUP__CONFIG:
				return getConfig();
			case BwPackage.GROUP__INPUT_BINDINGS:
				return getInputBindings();
			case BwPackage.GROUP__ACTIVITIES:
				return getActivities();
			case BwPackage.GROUP__GROUPS:
				return getGroups();
			case BwPackage.GROUP__TRANSITIONS:
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
			case BwPackage.GROUP__TYPE:
				setType((String)newValue);
				return;
			case BwPackage.GROUP__RESOURCE_TYPE:
				setResourceType((String)newValue);
				return;
			case BwPackage.GROUP__X:
				setX((Integer)newValue);
				return;
			case BwPackage.GROUP__Y:
				setY((Integer)newValue);
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
			case BwPackage.GROUP__CONFIG:
				setConfig((String)newValue);
				return;
			case BwPackage.GROUP__INPUT_BINDINGS:
				setInputBindings((String)newValue);
				return;
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
			case BwPackage.GROUP__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case BwPackage.GROUP__RESOURCE_TYPE:
				setResourceType(RESOURCE_TYPE_EDEFAULT);
				return;
			case BwPackage.GROUP__X:
				setX(X_EDEFAULT);
				return;
			case BwPackage.GROUP__Y:
				setY(Y_EDEFAULT);
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
			case BwPackage.GROUP__CONFIG:
				setConfig(CONFIG_EDEFAULT);
				return;
			case BwPackage.GROUP__INPUT_BINDINGS:
				setInputBindings(INPUT_BINDINGS_EDEFAULT);
				return;
			case BwPackage.GROUP__ACTIVITIES:
				getActivities().clear();
				return;
			case BwPackage.GROUP__GROUPS:
				getGroups().clear();
				return;
			case BwPackage.GROUP__TRANSITIONS:
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
			case BwPackage.GROUP__TYPE:
				return TYPE_EDEFAULT == null ? getType() != null : !TYPE_EDEFAULT.equals(getType());
			case BwPackage.GROUP__RESOURCE_TYPE:
				return RESOURCE_TYPE_EDEFAULT == null ? getResourceType() != null : !RESOURCE_TYPE_EDEFAULT.equals(getResourceType());
			case BwPackage.GROUP__X:
				return getX() != X_EDEFAULT;
			case BwPackage.GROUP__Y:
				return getY() != Y_EDEFAULT;
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
			case BwPackage.GROUP__CONFIG:
				return CONFIG_EDEFAULT == null ? getConfig() != null : !CONFIG_EDEFAULT.equals(getConfig());
			case BwPackage.GROUP__INPUT_BINDINGS:
				return INPUT_BINDINGS_EDEFAULT == null ? getInputBindings() != null : !INPUT_BINDINGS_EDEFAULT.equals(getInputBindings());
			case BwPackage.GROUP__ACTIVITIES:
				return !getActivities().isEmpty();
			case BwPackage.GROUP__GROUPS:
				return !getGroups().isEmpty();
			case BwPackage.GROUP__TRANSITIONS:
				return !getTransitions().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GroupImpl

/**
 */
package org.nasdanika.models.tibco.bw.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.tibco.bw.Activity;
import org.nasdanika.models.tibco.bw.BwPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.tibco.bw.impl.ActivityImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.impl.ActivityImpl#getResourceType <em>Resource Type</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.impl.ActivityImpl#getX <em>X</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.impl.ActivityImpl#getY <em>Y</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.impl.ActivityImpl#getConfig <em>Config</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.impl.ActivityImpl#getInputBindings <em>Input Bindings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivityImpl extends NamedElementImpl implements Activity {
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
	protected ActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BwPackage.Literals.ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getType() {
		return (String)eDynamicGet(BwPackage.ACTIVITY__TYPE, BwPackage.Literals.ACTIVITY__TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(String newType) {
		eDynamicSet(BwPackage.ACTIVITY__TYPE, BwPackage.Literals.ACTIVITY__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getResourceType() {
		return (String)eDynamicGet(BwPackage.ACTIVITY__RESOURCE_TYPE, BwPackage.Literals.ACTIVITY__RESOURCE_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResourceType(String newResourceType) {
		eDynamicSet(BwPackage.ACTIVITY__RESOURCE_TYPE, BwPackage.Literals.ACTIVITY__RESOURCE_TYPE, newResourceType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getX() {
		return (Integer)eDynamicGet(BwPackage.ACTIVITY__X, BwPackage.Literals.ACTIVITY__X, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setX(int newX) {
		eDynamicSet(BwPackage.ACTIVITY__X, BwPackage.Literals.ACTIVITY__X, newX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getY() {
		return (Integer)eDynamicGet(BwPackage.ACTIVITY__Y, BwPackage.Literals.ACTIVITY__Y, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setY(int newY) {
		eDynamicSet(BwPackage.ACTIVITY__Y, BwPackage.Literals.ACTIVITY__Y, newY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConfig() {
		return (String)eDynamicGet(BwPackage.ACTIVITY__CONFIG, BwPackage.Literals.ACTIVITY__CONFIG, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfig(String newConfig) {
		eDynamicSet(BwPackage.ACTIVITY__CONFIG, BwPackage.Literals.ACTIVITY__CONFIG, newConfig);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInputBindings() {
		return (String)eDynamicGet(BwPackage.ACTIVITY__INPUT_BINDINGS, BwPackage.Literals.ACTIVITY__INPUT_BINDINGS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInputBindings(String newInputBindings) {
		eDynamicSet(BwPackage.ACTIVITY__INPUT_BINDINGS, BwPackage.Literals.ACTIVITY__INPUT_BINDINGS, newInputBindings);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BwPackage.ACTIVITY__TYPE:
				return getType();
			case BwPackage.ACTIVITY__RESOURCE_TYPE:
				return getResourceType();
			case BwPackage.ACTIVITY__X:
				return getX();
			case BwPackage.ACTIVITY__Y:
				return getY();
			case BwPackage.ACTIVITY__CONFIG:
				return getConfig();
			case BwPackage.ACTIVITY__INPUT_BINDINGS:
				return getInputBindings();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BwPackage.ACTIVITY__TYPE:
				setType((String)newValue);
				return;
			case BwPackage.ACTIVITY__RESOURCE_TYPE:
				setResourceType((String)newValue);
				return;
			case BwPackage.ACTIVITY__X:
				setX((Integer)newValue);
				return;
			case BwPackage.ACTIVITY__Y:
				setY((Integer)newValue);
				return;
			case BwPackage.ACTIVITY__CONFIG:
				setConfig((String)newValue);
				return;
			case BwPackage.ACTIVITY__INPUT_BINDINGS:
				setInputBindings((String)newValue);
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
			case BwPackage.ACTIVITY__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case BwPackage.ACTIVITY__RESOURCE_TYPE:
				setResourceType(RESOURCE_TYPE_EDEFAULT);
				return;
			case BwPackage.ACTIVITY__X:
				setX(X_EDEFAULT);
				return;
			case BwPackage.ACTIVITY__Y:
				setY(Y_EDEFAULT);
				return;
			case BwPackage.ACTIVITY__CONFIG:
				setConfig(CONFIG_EDEFAULT);
				return;
			case BwPackage.ACTIVITY__INPUT_BINDINGS:
				setInputBindings(INPUT_BINDINGS_EDEFAULT);
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
			case BwPackage.ACTIVITY__TYPE:
				return TYPE_EDEFAULT == null ? getType() != null : !TYPE_EDEFAULT.equals(getType());
			case BwPackage.ACTIVITY__RESOURCE_TYPE:
				return RESOURCE_TYPE_EDEFAULT == null ? getResourceType() != null : !RESOURCE_TYPE_EDEFAULT.equals(getResourceType());
			case BwPackage.ACTIVITY__X:
				return getX() != X_EDEFAULT;
			case BwPackage.ACTIVITY__Y:
				return getY() != Y_EDEFAULT;
			case BwPackage.ACTIVITY__CONFIG:
				return CONFIG_EDEFAULT == null ? getConfig() != null : !CONFIG_EDEFAULT.equals(getConfig());
			case BwPackage.ACTIVITY__INPUT_BINDINGS:
				return INPUT_BINDINGS_EDEFAULT == null ? getInputBindings() != null : !INPUT_BINDINGS_EDEFAULT.equals(getInputBindings());
		}
		return super.eIsSet(featureID);
	}

} //ActivityImpl

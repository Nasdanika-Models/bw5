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
 *   <li>{@link org.nasdanika.models.tibco.bw.impl.ActivityImpl#getConfig <em>Config</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.impl.ActivityImpl#getInputBindings <em>Input Bindings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivityImpl extends TypedNodeImpl implements Activity {
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
			case BwPackage.ACTIVITY__CONFIG:
				return CONFIG_EDEFAULT == null ? getConfig() != null : !CONFIG_EDEFAULT.equals(getConfig());
			case BwPackage.ACTIVITY__INPUT_BINDINGS:
				return INPUT_BINDINGS_EDEFAULT == null ? getInputBindings() != null : !INPUT_BINDINGS_EDEFAULT.equals(getInputBindings());
		}
		return super.eIsSet(featureID);
	}

} //ActivityImpl

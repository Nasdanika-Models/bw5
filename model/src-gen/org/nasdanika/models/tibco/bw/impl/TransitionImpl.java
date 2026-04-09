/**
 */
package org.nasdanika.models.tibco.bw.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.tibco.bw.BwPackage;
import org.nasdanika.models.tibco.bw.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.tibco.bw.impl.TransitionImpl#getFrom <em>From</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.impl.TransitionImpl#getTo <em>To</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.impl.TransitionImpl#getLineType <em>Line Type</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.impl.TransitionImpl#getLineColor <em>Line Color</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.impl.TransitionImpl#getConditionType <em>Condition Type</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.impl.TransitionImpl#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionImpl extends MinimalEObjectImpl.Container implements Transition {
	/**
	 * The default value of the '{@link #getFrom() <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected static final String FROM_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTo() <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected static final String TO_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getLineType() <em>Line Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineType()
	 * @generated
	 * @ordered
	 */
	protected static final String LINE_TYPE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getLineColor() <em>Line Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineColor()
	 * @generated
	 * @ordered
	 */
	protected static final String LINE_COLOR_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getConditionType() <em>Condition Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionType()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITION_TYPE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITION_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BwPackage.Literals.TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFrom() {
		return (String)eDynamicGet(BwPackage.TRANSITION__FROM, BwPackage.Literals.TRANSITION__FROM, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFrom(String newFrom) {
		eDynamicSet(BwPackage.TRANSITION__FROM, BwPackage.Literals.TRANSITION__FROM, newFrom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTo() {
		return (String)eDynamicGet(BwPackage.TRANSITION__TO, BwPackage.Literals.TRANSITION__TO, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTo(String newTo) {
		eDynamicSet(BwPackage.TRANSITION__TO, BwPackage.Literals.TRANSITION__TO, newTo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLineType() {
		return (String)eDynamicGet(BwPackage.TRANSITION__LINE_TYPE, BwPackage.Literals.TRANSITION__LINE_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLineType(String newLineType) {
		eDynamicSet(BwPackage.TRANSITION__LINE_TYPE, BwPackage.Literals.TRANSITION__LINE_TYPE, newLineType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLineColor() {
		return (String)eDynamicGet(BwPackage.TRANSITION__LINE_COLOR, BwPackage.Literals.TRANSITION__LINE_COLOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLineColor(String newLineColor) {
		eDynamicSet(BwPackage.TRANSITION__LINE_COLOR, BwPackage.Literals.TRANSITION__LINE_COLOR, newLineColor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConditionType() {
		return (String)eDynamicGet(BwPackage.TRANSITION__CONDITION_TYPE, BwPackage.Literals.TRANSITION__CONDITION_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConditionType(String newConditionType) {
		eDynamicSet(BwPackage.TRANSITION__CONDITION_TYPE, BwPackage.Literals.TRANSITION__CONDITION_TYPE, newConditionType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCondition() {
		return (String)eDynamicGet(BwPackage.TRANSITION__CONDITION, BwPackage.Literals.TRANSITION__CONDITION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCondition(String newCondition) {
		eDynamicSet(BwPackage.TRANSITION__CONDITION, BwPackage.Literals.TRANSITION__CONDITION, newCondition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BwPackage.TRANSITION__FROM:
				return getFrom();
			case BwPackage.TRANSITION__TO:
				return getTo();
			case BwPackage.TRANSITION__LINE_TYPE:
				return getLineType();
			case BwPackage.TRANSITION__LINE_COLOR:
				return getLineColor();
			case BwPackage.TRANSITION__CONDITION_TYPE:
				return getConditionType();
			case BwPackage.TRANSITION__CONDITION:
				return getCondition();
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
			case BwPackage.TRANSITION__FROM:
				setFrom((String)newValue);
				return;
			case BwPackage.TRANSITION__TO:
				setTo((String)newValue);
				return;
			case BwPackage.TRANSITION__LINE_TYPE:
				setLineType((String)newValue);
				return;
			case BwPackage.TRANSITION__LINE_COLOR:
				setLineColor((String)newValue);
				return;
			case BwPackage.TRANSITION__CONDITION_TYPE:
				setConditionType((String)newValue);
				return;
			case BwPackage.TRANSITION__CONDITION:
				setCondition((String)newValue);
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
			case BwPackage.TRANSITION__FROM:
				setFrom(FROM_EDEFAULT);
				return;
			case BwPackage.TRANSITION__TO:
				setTo(TO_EDEFAULT);
				return;
			case BwPackage.TRANSITION__LINE_TYPE:
				setLineType(LINE_TYPE_EDEFAULT);
				return;
			case BwPackage.TRANSITION__LINE_COLOR:
				setLineColor(LINE_COLOR_EDEFAULT);
				return;
			case BwPackage.TRANSITION__CONDITION_TYPE:
				setConditionType(CONDITION_TYPE_EDEFAULT);
				return;
			case BwPackage.TRANSITION__CONDITION:
				setCondition(CONDITION_EDEFAULT);
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
			case BwPackage.TRANSITION__FROM:
				return FROM_EDEFAULT == null ? getFrom() != null : !FROM_EDEFAULT.equals(getFrom());
			case BwPackage.TRANSITION__TO:
				return TO_EDEFAULT == null ? getTo() != null : !TO_EDEFAULT.equals(getTo());
			case BwPackage.TRANSITION__LINE_TYPE:
				return LINE_TYPE_EDEFAULT == null ? getLineType() != null : !LINE_TYPE_EDEFAULT.equals(getLineType());
			case BwPackage.TRANSITION__LINE_COLOR:
				return LINE_COLOR_EDEFAULT == null ? getLineColor() != null : !LINE_COLOR_EDEFAULT.equals(getLineColor());
			case BwPackage.TRANSITION__CONDITION_TYPE:
				return CONDITION_TYPE_EDEFAULT == null ? getConditionType() != null : !CONDITION_TYPE_EDEFAULT.equals(getConditionType());
			case BwPackage.TRANSITION__CONDITION:
				return CONDITION_EDEFAULT == null ? getCondition() != null : !CONDITION_EDEFAULT.equals(getCondition());
		}
		return super.eIsSet(featureID);
	}

} //TransitionImpl

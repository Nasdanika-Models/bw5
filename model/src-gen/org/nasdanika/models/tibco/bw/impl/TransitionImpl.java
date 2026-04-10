/**
 */
package org.nasdanika.models.tibco.bw.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.tibco.bw.BwPackage;
import org.nasdanika.models.tibco.bw.Node;
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
 *   <li>{@link org.nasdanika.models.tibco.bw.impl.TransitionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.impl.TransitionImpl#getTo <em>To</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.impl.TransitionImpl#getTarget <em>Target</em>}</li>
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
	public Node getSource() {
		return (Node)eDynamicGet(BwPackage.TRANSITION__SOURCE, BwPackage.Literals.TRANSITION__SOURCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetSource() {
		return (Node)eDynamicGet(BwPackage.TRANSITION__SOURCE, BwPackage.Literals.TRANSITION__SOURCE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(Node newSource, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newSource, BwPackage.TRANSITION__SOURCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource(Node newSource) {
		eDynamicSet(BwPackage.TRANSITION__SOURCE, BwPackage.Literals.TRANSITION__SOURCE, newSource);
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
	public Node getTarget() {
		return (Node)eDynamicGet(BwPackage.TRANSITION__TARGET, BwPackage.Literals.TRANSITION__TARGET, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetTarget() {
		return (Node)eDynamicGet(BwPackage.TRANSITION__TARGET, BwPackage.Literals.TRANSITION__TARGET, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(Node newTarget, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newTarget, BwPackage.TRANSITION__TARGET, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget(Node newTarget) {
		eDynamicSet(BwPackage.TRANSITION__TARGET, BwPackage.Literals.TRANSITION__TARGET, newTarget);
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
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BwPackage.TRANSITION__SOURCE:
				Node source = basicGetSource();
				if (source != null)
					msgs = ((InternalEObject)source).eInverseRemove(this, BwPackage.NODE__OUTGOING_TRANSITIONS, Node.class, msgs);
				return basicSetSource((Node)otherEnd, msgs);
			case BwPackage.TRANSITION__TARGET:
				Node target = basicGetTarget();
				if (target != null)
					msgs = ((InternalEObject)target).eInverseRemove(this, BwPackage.NODE__INCOMING_TRANSITIONS, Node.class, msgs);
				return basicSetTarget((Node)otherEnd, msgs);
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
			case BwPackage.TRANSITION__SOURCE:
				return basicSetSource(null, msgs);
			case BwPackage.TRANSITION__TARGET:
				return basicSetTarget(null, msgs);
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
			case BwPackage.TRANSITION__FROM:
				return getFrom();
			case BwPackage.TRANSITION__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case BwPackage.TRANSITION__TO:
				return getTo();
			case BwPackage.TRANSITION__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
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
			case BwPackage.TRANSITION__SOURCE:
				setSource((Node)newValue);
				return;
			case BwPackage.TRANSITION__TO:
				setTo((String)newValue);
				return;
			case BwPackage.TRANSITION__TARGET:
				setTarget((Node)newValue);
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
			case BwPackage.TRANSITION__SOURCE:
				setSource((Node)null);
				return;
			case BwPackage.TRANSITION__TO:
				setTo(TO_EDEFAULT);
				return;
			case BwPackage.TRANSITION__TARGET:
				setTarget((Node)null);
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
			case BwPackage.TRANSITION__SOURCE:
				return basicGetSource() != null;
			case BwPackage.TRANSITION__TO:
				return TO_EDEFAULT == null ? getTo() != null : !TO_EDEFAULT.equals(getTo());
			case BwPackage.TRANSITION__TARGET:
				return basicGetTarget() != null;
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

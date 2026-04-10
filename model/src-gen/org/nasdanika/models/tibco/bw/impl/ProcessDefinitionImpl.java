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
import org.nasdanika.models.tibco.bw.Label;
import org.nasdanika.models.tibco.bw.ProcessDefinition;
import org.nasdanika.models.tibco.bw.ProcessVariable;
import org.nasdanika.models.tibco.bw.Starter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.tibco.bw.impl.ProcessDefinitionImpl#getStartName <em>Start Name</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.impl.ProcessDefinitionImpl#getStartType <em>Start Type</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.impl.ProcessDefinitionImpl#getStartX <em>Start X</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.impl.ProcessDefinitionImpl#getStartY <em>Start Y</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.impl.ProcessDefinitionImpl#getEndName <em>End Name</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.impl.ProcessDefinitionImpl#getEndType <em>End Type</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.impl.ProcessDefinitionImpl#getEndX <em>End X</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.impl.ProcessDefinitionImpl#getEndY <em>End Y</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.impl.ProcessDefinitionImpl#getTargetNamespace <em>Target Namespace</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.impl.ProcessDefinitionImpl#getReturnBindings <em>Return Bindings</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.impl.ProcessDefinitionImpl#getStarter <em>Starter</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.impl.ProcessDefinitionImpl#getLabels <em>Labels</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.impl.ProcessDefinitionImpl#getProcessVariables <em>Process Variables</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.impl.ProcessDefinitionImpl#getErrorSchemas <em>Error Schemas</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessDefinitionImpl extends ContainerImpl implements ProcessDefinition {
	/**
	 * The default value of the '{@link #getStartName() <em>Start Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartName()
	 * @generated
	 * @ordered
	 */
	protected static final String START_NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getStartType() <em>Start Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartType()
	 * @generated
	 * @ordered
	 */
	protected static final String START_TYPE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getStartX() <em>Start X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartX()
	 * @generated
	 * @ordered
	 */
	protected static final int START_X_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getStartY() <em>Start Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartY()
	 * @generated
	 * @ordered
	 */
	protected static final int START_Y_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getEndName() <em>End Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndName()
	 * @generated
	 * @ordered
	 */
	protected static final String END_NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getEndType() <em>End Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndType()
	 * @generated
	 * @ordered
	 */
	protected static final String END_TYPE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getEndX() <em>End X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndX()
	 * @generated
	 * @ordered
	 */
	protected static final int END_X_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getEndY() <em>End Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndY()
	 * @generated
	 * @ordered
	 */
	protected static final int END_Y_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getTargetNamespace() <em>Target Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetNamespace()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_NAMESPACE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getReturnBindings() <em>Return Bindings</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnBindings()
	 * @generated
	 * @ordered
	 */
	protected static final String RETURN_BINDINGS_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getErrorSchemas() <em>Error Schemas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorSchemas()
	 * @generated
	 * @ordered
	 */
	protected static final String ERROR_SCHEMAS_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BwPackage.Literals.PROCESS_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStartName() {
		return (String)eDynamicGet(BwPackage.PROCESS_DEFINITION__START_NAME, BwPackage.Literals.PROCESS_DEFINITION__START_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartName(String newStartName) {
		eDynamicSet(BwPackage.PROCESS_DEFINITION__START_NAME, BwPackage.Literals.PROCESS_DEFINITION__START_NAME, newStartName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStartType() {
		return (String)eDynamicGet(BwPackage.PROCESS_DEFINITION__START_TYPE, BwPackage.Literals.PROCESS_DEFINITION__START_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartType(String newStartType) {
		eDynamicSet(BwPackage.PROCESS_DEFINITION__START_TYPE, BwPackage.Literals.PROCESS_DEFINITION__START_TYPE, newStartType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getStartX() {
		return (Integer)eDynamicGet(BwPackage.PROCESS_DEFINITION__START_X, BwPackage.Literals.PROCESS_DEFINITION__START_X, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartX(int newStartX) {
		eDynamicSet(BwPackage.PROCESS_DEFINITION__START_X, BwPackage.Literals.PROCESS_DEFINITION__START_X, newStartX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getStartY() {
		return (Integer)eDynamicGet(BwPackage.PROCESS_DEFINITION__START_Y, BwPackage.Literals.PROCESS_DEFINITION__START_Y, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartY(int newStartY) {
		eDynamicSet(BwPackage.PROCESS_DEFINITION__START_Y, BwPackage.Literals.PROCESS_DEFINITION__START_Y, newStartY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEndName() {
		return (String)eDynamicGet(BwPackage.PROCESS_DEFINITION__END_NAME, BwPackage.Literals.PROCESS_DEFINITION__END_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEndName(String newEndName) {
		eDynamicSet(BwPackage.PROCESS_DEFINITION__END_NAME, BwPackage.Literals.PROCESS_DEFINITION__END_NAME, newEndName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEndType() {
		return (String)eDynamicGet(BwPackage.PROCESS_DEFINITION__END_TYPE, BwPackage.Literals.PROCESS_DEFINITION__END_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEndType(String newEndType) {
		eDynamicSet(BwPackage.PROCESS_DEFINITION__END_TYPE, BwPackage.Literals.PROCESS_DEFINITION__END_TYPE, newEndType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getEndX() {
		return (Integer)eDynamicGet(BwPackage.PROCESS_DEFINITION__END_X, BwPackage.Literals.PROCESS_DEFINITION__END_X, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEndX(int newEndX) {
		eDynamicSet(BwPackage.PROCESS_DEFINITION__END_X, BwPackage.Literals.PROCESS_DEFINITION__END_X, newEndX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getEndY() {
		return (Integer)eDynamicGet(BwPackage.PROCESS_DEFINITION__END_Y, BwPackage.Literals.PROCESS_DEFINITION__END_Y, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEndY(int newEndY) {
		eDynamicSet(BwPackage.PROCESS_DEFINITION__END_Y, BwPackage.Literals.PROCESS_DEFINITION__END_Y, newEndY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTargetNamespace() {
		return (String)eDynamicGet(BwPackage.PROCESS_DEFINITION__TARGET_NAMESPACE, BwPackage.Literals.PROCESS_DEFINITION__TARGET_NAMESPACE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetNamespace(String newTargetNamespace) {
		eDynamicSet(BwPackage.PROCESS_DEFINITION__TARGET_NAMESPACE, BwPackage.Literals.PROCESS_DEFINITION__TARGET_NAMESPACE, newTargetNamespace);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReturnBindings() {
		return (String)eDynamicGet(BwPackage.PROCESS_DEFINITION__RETURN_BINDINGS, BwPackage.Literals.PROCESS_DEFINITION__RETURN_BINDINGS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReturnBindings(String newReturnBindings) {
		eDynamicSet(BwPackage.PROCESS_DEFINITION__RETURN_BINDINGS, BwPackage.Literals.PROCESS_DEFINITION__RETURN_BINDINGS, newReturnBindings);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Starter getStarter() {
		return (Starter)eDynamicGet(BwPackage.PROCESS_DEFINITION__STARTER, BwPackage.Literals.PROCESS_DEFINITION__STARTER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStarter(Starter newStarter, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newStarter, BwPackage.PROCESS_DEFINITION__STARTER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStarter(Starter newStarter) {
		eDynamicSet(BwPackage.PROCESS_DEFINITION__STARTER, BwPackage.Literals.PROCESS_DEFINITION__STARTER, newStarter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Label> getLabels() {
		return (EList<Label>)eDynamicGet(BwPackage.PROCESS_DEFINITION__LABELS, BwPackage.Literals.PROCESS_DEFINITION__LABELS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ProcessVariable> getProcessVariables() {
		return (EList<ProcessVariable>)eDynamicGet(BwPackage.PROCESS_DEFINITION__PROCESS_VARIABLES, BwPackage.Literals.PROCESS_DEFINITION__PROCESS_VARIABLES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getErrorSchemas() {
		return (String)eDynamicGet(BwPackage.PROCESS_DEFINITION__ERROR_SCHEMAS, BwPackage.Literals.PROCESS_DEFINITION__ERROR_SCHEMAS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setErrorSchemas(String newErrorSchemas) {
		eDynamicSet(BwPackage.PROCESS_DEFINITION__ERROR_SCHEMAS, BwPackage.Literals.PROCESS_DEFINITION__ERROR_SCHEMAS, newErrorSchemas);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BwPackage.PROCESS_DEFINITION__STARTER:
				return basicSetStarter(null, msgs);
			case BwPackage.PROCESS_DEFINITION__LABELS:
				return ((InternalEList<?>)getLabels()).basicRemove(otherEnd, msgs);
			case BwPackage.PROCESS_DEFINITION__PROCESS_VARIABLES:
				return ((InternalEList<?>)getProcessVariables()).basicRemove(otherEnd, msgs);
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
			case BwPackage.PROCESS_DEFINITION__START_NAME:
				return getStartName();
			case BwPackage.PROCESS_DEFINITION__START_TYPE:
				return getStartType();
			case BwPackage.PROCESS_DEFINITION__START_X:
				return getStartX();
			case BwPackage.PROCESS_DEFINITION__START_Y:
				return getStartY();
			case BwPackage.PROCESS_DEFINITION__END_NAME:
				return getEndName();
			case BwPackage.PROCESS_DEFINITION__END_TYPE:
				return getEndType();
			case BwPackage.PROCESS_DEFINITION__END_X:
				return getEndX();
			case BwPackage.PROCESS_DEFINITION__END_Y:
				return getEndY();
			case BwPackage.PROCESS_DEFINITION__TARGET_NAMESPACE:
				return getTargetNamespace();
			case BwPackage.PROCESS_DEFINITION__RETURN_BINDINGS:
				return getReturnBindings();
			case BwPackage.PROCESS_DEFINITION__STARTER:
				return getStarter();
			case BwPackage.PROCESS_DEFINITION__LABELS:
				return getLabels();
			case BwPackage.PROCESS_DEFINITION__PROCESS_VARIABLES:
				return getProcessVariables();
			case BwPackage.PROCESS_DEFINITION__ERROR_SCHEMAS:
				return getErrorSchemas();
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
			case BwPackage.PROCESS_DEFINITION__START_NAME:
				setStartName((String)newValue);
				return;
			case BwPackage.PROCESS_DEFINITION__START_TYPE:
				setStartType((String)newValue);
				return;
			case BwPackage.PROCESS_DEFINITION__START_X:
				setStartX((Integer)newValue);
				return;
			case BwPackage.PROCESS_DEFINITION__START_Y:
				setStartY((Integer)newValue);
				return;
			case BwPackage.PROCESS_DEFINITION__END_NAME:
				setEndName((String)newValue);
				return;
			case BwPackage.PROCESS_DEFINITION__END_TYPE:
				setEndType((String)newValue);
				return;
			case BwPackage.PROCESS_DEFINITION__END_X:
				setEndX((Integer)newValue);
				return;
			case BwPackage.PROCESS_DEFINITION__END_Y:
				setEndY((Integer)newValue);
				return;
			case BwPackage.PROCESS_DEFINITION__TARGET_NAMESPACE:
				setTargetNamespace((String)newValue);
				return;
			case BwPackage.PROCESS_DEFINITION__RETURN_BINDINGS:
				setReturnBindings((String)newValue);
				return;
			case BwPackage.PROCESS_DEFINITION__STARTER:
				setStarter((Starter)newValue);
				return;
			case BwPackage.PROCESS_DEFINITION__LABELS:
				getLabels().clear();
				getLabels().addAll((Collection<? extends Label>)newValue);
				return;
			case BwPackage.PROCESS_DEFINITION__PROCESS_VARIABLES:
				getProcessVariables().clear();
				getProcessVariables().addAll((Collection<? extends ProcessVariable>)newValue);
				return;
			case BwPackage.PROCESS_DEFINITION__ERROR_SCHEMAS:
				setErrorSchemas((String)newValue);
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
			case BwPackage.PROCESS_DEFINITION__START_NAME:
				setStartName(START_NAME_EDEFAULT);
				return;
			case BwPackage.PROCESS_DEFINITION__START_TYPE:
				setStartType(START_TYPE_EDEFAULT);
				return;
			case BwPackage.PROCESS_DEFINITION__START_X:
				setStartX(START_X_EDEFAULT);
				return;
			case BwPackage.PROCESS_DEFINITION__START_Y:
				setStartY(START_Y_EDEFAULT);
				return;
			case BwPackage.PROCESS_DEFINITION__END_NAME:
				setEndName(END_NAME_EDEFAULT);
				return;
			case BwPackage.PROCESS_DEFINITION__END_TYPE:
				setEndType(END_TYPE_EDEFAULT);
				return;
			case BwPackage.PROCESS_DEFINITION__END_X:
				setEndX(END_X_EDEFAULT);
				return;
			case BwPackage.PROCESS_DEFINITION__END_Y:
				setEndY(END_Y_EDEFAULT);
				return;
			case BwPackage.PROCESS_DEFINITION__TARGET_NAMESPACE:
				setTargetNamespace(TARGET_NAMESPACE_EDEFAULT);
				return;
			case BwPackage.PROCESS_DEFINITION__RETURN_BINDINGS:
				setReturnBindings(RETURN_BINDINGS_EDEFAULT);
				return;
			case BwPackage.PROCESS_DEFINITION__STARTER:
				setStarter((Starter)null);
				return;
			case BwPackage.PROCESS_DEFINITION__LABELS:
				getLabels().clear();
				return;
			case BwPackage.PROCESS_DEFINITION__PROCESS_VARIABLES:
				getProcessVariables().clear();
				return;
			case BwPackage.PROCESS_DEFINITION__ERROR_SCHEMAS:
				setErrorSchemas(ERROR_SCHEMAS_EDEFAULT);
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
			case BwPackage.PROCESS_DEFINITION__START_NAME:
				return START_NAME_EDEFAULT == null ? getStartName() != null : !START_NAME_EDEFAULT.equals(getStartName());
			case BwPackage.PROCESS_DEFINITION__START_TYPE:
				return START_TYPE_EDEFAULT == null ? getStartType() != null : !START_TYPE_EDEFAULT.equals(getStartType());
			case BwPackage.PROCESS_DEFINITION__START_X:
				return getStartX() != START_X_EDEFAULT;
			case BwPackage.PROCESS_DEFINITION__START_Y:
				return getStartY() != START_Y_EDEFAULT;
			case BwPackage.PROCESS_DEFINITION__END_NAME:
				return END_NAME_EDEFAULT == null ? getEndName() != null : !END_NAME_EDEFAULT.equals(getEndName());
			case BwPackage.PROCESS_DEFINITION__END_TYPE:
				return END_TYPE_EDEFAULT == null ? getEndType() != null : !END_TYPE_EDEFAULT.equals(getEndType());
			case BwPackage.PROCESS_DEFINITION__END_X:
				return getEndX() != END_X_EDEFAULT;
			case BwPackage.PROCESS_DEFINITION__END_Y:
				return getEndY() != END_Y_EDEFAULT;
			case BwPackage.PROCESS_DEFINITION__TARGET_NAMESPACE:
				return TARGET_NAMESPACE_EDEFAULT == null ? getTargetNamespace() != null : !TARGET_NAMESPACE_EDEFAULT.equals(getTargetNamespace());
			case BwPackage.PROCESS_DEFINITION__RETURN_BINDINGS:
				return RETURN_BINDINGS_EDEFAULT == null ? getReturnBindings() != null : !RETURN_BINDINGS_EDEFAULT.equals(getReturnBindings());
			case BwPackage.PROCESS_DEFINITION__STARTER:
				return getStarter() != null;
			case BwPackage.PROCESS_DEFINITION__LABELS:
				return !getLabels().isEmpty();
			case BwPackage.PROCESS_DEFINITION__PROCESS_VARIABLES:
				return !getProcessVariables().isEmpty();
			case BwPackage.PROCESS_DEFINITION__ERROR_SCHEMAS:
				return ERROR_SCHEMAS_EDEFAULT == null ? getErrorSchemas() != null : !ERROR_SCHEMAS_EDEFAULT.equals(getErrorSchemas());
		}
		return super.eIsSet(featureID);
	}

} //ProcessDefinitionImpl

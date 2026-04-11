/**
 */
package org.nasdanika.models.tibco.bw.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.tibco.bw.BwPackage;
import org.nasdanika.models.tibco.bw.Folder;
import org.nasdanika.models.tibco.bw.Resource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.tibco.bw.impl.ResourceImpl#getProjectPath <em>Project Path</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.impl.ResourceImpl#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceImpl extends MinimalEObjectImpl.Container implements Resource {
	/**
	 * The default value of the '{@link #getProjectPath() <em>Project Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PROJECT_PATH_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BwPackage.Literals.RESOURCE;
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
	public String getProjectPath() {
		return (String)eDynamicGet(BwPackage.RESOURCE__PROJECT_PATH, BwPackage.Literals.RESOURCE__PROJECT_PATH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProjectPath(String newProjectPath) {
		eDynamicSet(BwPackage.RESOURCE__PROJECT_PATH, BwPackage.Literals.RESOURCE__PROJECT_PATH, newProjectPath);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Folder getParent() {
		return (Folder)eDynamicGet(BwPackage.RESOURCE__PARENT, BwPackage.Literals.RESOURCE__PARENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Folder basicGetParent() {
		return (Folder)eDynamicGet(BwPackage.RESOURCE__PARENT, BwPackage.Literals.RESOURCE__PARENT, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(Folder newParent, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newParent, BwPackage.RESOURCE__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParent(Folder newParent) {
		eDynamicSet(BwPackage.RESOURCE__PARENT, BwPackage.Literals.RESOURCE__PARENT, newParent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BwPackage.RESOURCE__PARENT:
				Folder parent = basicGetParent();
				if (parent != null)
					msgs = ((InternalEObject)parent).eInverseRemove(this, BwPackage.FOLDER__RESOURCES, Folder.class, msgs);
				return basicSetParent((Folder)otherEnd, msgs);
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
			case BwPackage.RESOURCE__PARENT:
				return basicSetParent(null, msgs);
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
			case BwPackage.RESOURCE__PROJECT_PATH:
				return getProjectPath();
			case BwPackage.RESOURCE__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
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
			case BwPackage.RESOURCE__PROJECT_PATH:
				setProjectPath((String)newValue);
				return;
			case BwPackage.RESOURCE__PARENT:
				setParent((Folder)newValue);
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
			case BwPackage.RESOURCE__PROJECT_PATH:
				setProjectPath(PROJECT_PATH_EDEFAULT);
				return;
			case BwPackage.RESOURCE__PARENT:
				setParent((Folder)null);
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
			case BwPackage.RESOURCE__PROJECT_PATH:
				return PROJECT_PATH_EDEFAULT == null ? getProjectPath() != null : !PROJECT_PATH_EDEFAULT.equals(getProjectPath());
			case BwPackage.RESOURCE__PARENT:
				return basicGetParent() != null;
		}
		return super.eIsSet(featureID);
	}

} //ResourceImpl

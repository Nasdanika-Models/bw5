/**
 */
package org.nasdanika.models.tibco.bw;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.tibco.bw.Container#getActivities <em>Activities</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.Container#getGroups <em>Groups</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.Container#getTransitions <em>Transitions</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.tibco.bw.BwPackage#getContainer()
 * @model abstract="true"
 * @generated
 */
public interface Container extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Activities</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.tibco.bw.Activity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Activities (tasks/steps) at the top level of this process.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Activities</em>' containment reference list.
	 * @see org.nasdanika.models.tibco.bw.BwPackage#getContainer_Activities()
	 * @model containment="true" keys="name"
	 * @generated
	 */
	EList<Activity> getActivities();

	/**
	 * Returns the value of the '<em><b>Groups</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.tibco.bw.Group}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Groups of activities at the top level of this process (loops, scope, etc.).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Groups</em>' containment reference list.
	 * @see org.nasdanika.models.tibco.bw.BwPackage#getContainer_Groups()
	 * @model containment="true" keys="name"
	 * @generated
	 */
	EList<Group> getGroups();

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.tibco.bw.Transition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Transitions at the top level of this process.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see org.nasdanika.models.tibco.bw.BwPackage#getContainer_Transitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getTransitions();

} // Container

/**
 */
package org.nasdanika.models.bw5;

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
 *   <li>{@link org.nasdanika.models.bw5.Container#getActivities <em>Activities</em>}</li>
 *   <li>{@link org.nasdanika.models.bw5.Container#getGroups <em>Groups</em>}</li>
 *   <li>{@link org.nasdanika.models.bw5.Container#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link org.nasdanika.models.bw5.Container#getStart <em>Start</em>}</li>
 *   <li>{@link org.nasdanika.models.bw5.Container#getEnd <em>End</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.bw5.Bw5Package#getContainer()
 * @model abstract="true"
 * @generated
 */
public interface Container extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Activities</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.bw5.Activity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Activities (tasks/steps) at the top level of this process.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Activities</em>' containment reference list.
	 * @see org.nasdanika.models.bw5.Bw5Package#getContainer_Activities()
	 * @model containment="true" keys="name"
	 * @generated
	 */
	EList<Activity> getActivities();

	/**
	 * Returns the value of the '<em><b>Groups</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.bw5.Group}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Groups of activities at the top level of this process (loops, scope, etc.).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Groups</em>' containment reference list.
	 * @see org.nasdanika.models.bw5.Bw5Package#getContainer_Groups()
	 * @model containment="true" keys="name"
	 * @generated
	 */
	EList<Group> getGroups();

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.bw5.Transition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Transitions at the top level of this process.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see org.nasdanika.models.bw5.Bw5Package#getContainer_Transitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getTransitions();

	/**
	 * Returns the value of the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * A synthetic node populated from startName, startType, startX, startY
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start</em>' reference.
	 * @see #setStart(Node)
	 * @see org.nasdanika.models.bw5.Bw5Package#getContainer_Start()
	 * @model
	 * @generated
	 */
	Node getStart();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.bw5.Container#getStart <em>Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(Node value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * A synthetic node populated from endName, endType, endX, endY
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End</em>' reference.
	 * @see #setEnd(Node)
	 * @see org.nasdanika.models.bw5.Bw5Package#getContainer_End()
	 * @model
	 * @generated
	 */
	Node getEnd();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.bw5.Container#getEnd <em>End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(Node value);

} // Container

/**
 */
package org.nasdanika.models.tibco.bw;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Caller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Something making calls
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.tibco.bw.Caller#getOutgoingCalls <em>Outgoing Calls</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.tibco.bw.BwPackage#getCaller()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Caller extends EObject {
	/**
	 * Returns the value of the '<em><b>Outgoing Calls</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.tibco.bw.Call}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.tibco.bw.Call#getCaller <em>Caller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Calls</em>' containment reference list.
	 * @see org.nasdanika.models.tibco.bw.BwPackage#getCaller_OutgoingCalls()
	 * @see org.nasdanika.models.tibco.bw.Call#getCaller
	 * @model opposite="caller" containment="true"
	 * @generated
	 */
	EList<Call> getOutgoingCalls();

} // Caller

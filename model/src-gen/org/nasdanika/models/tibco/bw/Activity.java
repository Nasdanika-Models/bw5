/**
 */
package org.nasdanika.models.tibco.bw;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * An activity (task or step) within a BW process or group.
 * Corresponds to pd:activity in the process XML.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.tibco.bw.Activity#getType <em>Type</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.Activity#getResourceType <em>Resource Type</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.Activity#getX <em>X</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.Activity#getY <em>Y</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.Activity#getConfig <em>Config</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.Activity#getInputBindings <em>Input Bindings</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.tibco.bw.BwPackage#getActivity()
 * @model
 * @generated
 */
public interface Activity extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Fully-qualified Java class name of the activity implementation,
	 * e.g. "com.tibco.pe.core.WriteToLogActivity".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.nasdanika.models.tibco.bw.BwPackage#getActivity_Type()
	 * @model unique="false"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.tibco.bw.Activity#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Resource Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Palette / resource-type identifier used by the BW Designer,
	 * e.g. "ae.activities.log".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resource Type</em>' attribute.
	 * @see #setResourceType(String)
	 * @see org.nasdanika.models.tibco.bw.BwPackage#getActivity_ResourceType()
	 * @model unique="false"
	 * @generated
	 */
	String getResourceType();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.tibco.bw.Activity#getResourceType <em>Resource Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Type</em>' attribute.
	 * @see #getResourceType()
	 * @generated
	 */
	void setResourceType(String value);

	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * X coordinate on the design canvas.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(int)
	 * @see org.nasdanika.models.tibco.bw.BwPackage#getActivity_X()
	 * @model unique="false"
	 * @generated
	 */
	int getX();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.tibco.bw.Activity#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(int value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Y coordinate on the design canvas.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #setY(int)
	 * @see org.nasdanika.models.tibco.bw.BwPackage#getActivity_Y()
	 * @model unique="false"
	 * @generated
	 */
	int getY();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.tibco.bw.Activity#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(int value);

	/**
	 * Returns the value of the '<em><b>Config</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Activity-specific configuration, stored as raw XML text.
	 * The structure varies per activity type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Config</em>' attribute.
	 * @see #setConfig(String)
	 * @see org.nasdanika.models.tibco.bw.BwPackage#getActivity_Config()
	 * @model unique="false"
	 * @generated
	 */
	String getConfig();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.tibco.bw.Activity#getConfig <em>Config</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config</em>' attribute.
	 * @see #getConfig()
	 * @generated
	 */
	void setConfig(String value);

	/**
	 * Returns the value of the '<em><b>Input Bindings</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * XSL input bindings for this activity, stored as raw XML text.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Input Bindings</em>' attribute.
	 * @see #setInputBindings(String)
	 * @see org.nasdanika.models.tibco.bw.BwPackage#getActivity_InputBindings()
	 * @model unique="false"
	 * @generated
	 */
	String getInputBindings();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.tibco.bw.Activity#getInputBindings <em>Input Bindings</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Bindings</em>' attribute.
	 * @see #getInputBindings()
	 * @generated
	 */
	void setInputBindings(String value);

} // Activity

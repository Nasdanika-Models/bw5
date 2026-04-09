/**
 */
package org.nasdanika.models.tibco.bw;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * A group of activities, used to model structured constructs such as:
 *   - Loops (Repeat-Until, For-Each, While)
 *   - Error handlers / Fault handlers
 *   - Critical sections
 *   - Scope groups
 * 
 * Corresponds to pd:group in the process XML.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.tibco.bw.Group#getType <em>Type</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.Group#getResourceType <em>Resource Type</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.Group#getX <em>X</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.Group#getY <em>Y</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.Group#getWidth <em>Width</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.Group#getHeight <em>Height</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.Group#getCollapsedWidth <em>Collapsed Width</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.Group#getCollapsedHeight <em>Collapsed Height</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.Group#isExpanded <em>Expanded</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.Group#getConfig <em>Config</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.Group#getInputBindings <em>Input Bindings</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.Group#getActivities <em>Activities</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.Group#getGroups <em>Groups</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.Group#getTransitions <em>Transitions</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.tibco.bw.BwPackage#getGroup()
 * @model
 * @generated
 */
public interface Group extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Fully-qualified Java class name of the group implementation,
	 * e.g. "com.tibco.pe.core.LoopGroup".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.nasdanika.models.tibco.bw.BwPackage#getGroup_Type()
	 * @model unique="false"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.tibco.bw.Group#getType <em>Type</em>}' attribute.
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
	 * Palette / resource-type identifier, e.g. "ae.process.group".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resource Type</em>' attribute.
	 * @see #setResourceType(String)
	 * @see org.nasdanika.models.tibco.bw.BwPackage#getGroup_ResourceType()
	 * @model unique="false"
	 * @generated
	 */
	String getResourceType();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.tibco.bw.Group#getResourceType <em>Resource Type</em>}' attribute.
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
	 * X coordinate of the group frame on the design canvas.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(int)
	 * @see org.nasdanika.models.tibco.bw.BwPackage#getGroup_X()
	 * @model unique="false"
	 * @generated
	 */
	int getX();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.tibco.bw.Group#getX <em>X</em>}' attribute.
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
	 * Y coordinate of the group frame on the design canvas.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #setY(int)
	 * @see org.nasdanika.models.tibco.bw.BwPackage#getGroup_Y()
	 * @model unique="false"
	 * @generated
	 */
	int getY();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.tibco.bw.Group#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(int value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Width of the expanded group frame on the design canvas.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(int)
	 * @see org.nasdanika.models.tibco.bw.BwPackage#getGroup_Width()
	 * @model unique="false"
	 * @generated
	 */
	int getWidth();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.tibco.bw.Group#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(int value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Height of the expanded group frame on the design canvas.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(int)
	 * @see org.nasdanika.models.tibco.bw.BwPackage#getGroup_Height()
	 * @model unique="false"
	 * @generated
	 */
	int getHeight();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.tibco.bw.Group#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(int value);

	/**
	 * Returns the value of the '<em><b>Collapsed Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Width of the group icon when collapsed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Collapsed Width</em>' attribute.
	 * @see #setCollapsedWidth(int)
	 * @see org.nasdanika.models.tibco.bw.BwPackage#getGroup_CollapsedWidth()
	 * @model unique="false"
	 * @generated
	 */
	int getCollapsedWidth();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.tibco.bw.Group#getCollapsedWidth <em>Collapsed Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collapsed Width</em>' attribute.
	 * @see #getCollapsedWidth()
	 * @generated
	 */
	void setCollapsedWidth(int value);

	/**
	 * Returns the value of the '<em><b>Collapsed Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Height of the group icon when collapsed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Collapsed Height</em>' attribute.
	 * @see #setCollapsedHeight(int)
	 * @see org.nasdanika.models.tibco.bw.BwPackage#getGroup_CollapsedHeight()
	 * @model unique="false"
	 * @generated
	 */
	int getCollapsedHeight();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.tibco.bw.Group#getCollapsedHeight <em>Collapsed Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collapsed Height</em>' attribute.
	 * @see #getCollapsedHeight()
	 * @generated
	 */
	void setCollapsedHeight(int value);

	/**
	 * Returns the value of the '<em><b>Expanded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Whether the group is shown in expanded form on the canvas.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expanded</em>' attribute.
	 * @see #setExpanded(boolean)
	 * @see org.nasdanika.models.tibco.bw.BwPackage#getGroup_Expanded()
	 * @model unique="false"
	 * @generated
	 */
	boolean isExpanded();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.tibco.bw.Group#isExpanded <em>Expanded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expanded</em>' attribute.
	 * @see #isExpanded()
	 * @generated
	 */
	void setExpanded(boolean value);

	/**
	 * Returns the value of the '<em><b>Config</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Group-type-specific configuration, stored as raw XML text.
	 * For a LoopGroup this contains the loop condition and index slot.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Config</em>' attribute.
	 * @see #setConfig(String)
	 * @see org.nasdanika.models.tibco.bw.BwPackage#getGroup_Config()
	 * @model unique="false"
	 * @generated
	 */
	String getConfig();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.tibco.bw.Group#getConfig <em>Config</em>}' attribute.
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
	 * XSL input bindings for the group, stored as raw XML text.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Input Bindings</em>' attribute.
	 * @see #setInputBindings(String)
	 * @see org.nasdanika.models.tibco.bw.BwPackage#getGroup_InputBindings()
	 * @model unique="false"
	 * @generated
	 */
	String getInputBindings();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.tibco.bw.Group#getInputBindings <em>Input Bindings</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Bindings</em>' attribute.
	 * @see #getInputBindings()
	 * @generated
	 */
	void setInputBindings(String value);

	/**
	 * Returns the value of the '<em><b>Activities</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.tibco.bw.Activity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Activities contained inside this group.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Activities</em>' containment reference list.
	 * @see org.nasdanika.models.tibco.bw.BwPackage#getGroup_Activities()
	 * @model containment="true"
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
	 * Sub-groups nested inside this group.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Groups</em>' containment reference list.
	 * @see org.nasdanika.models.tibco.bw.BwPackage#getGroup_Groups()
	 * @model containment="true"
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
	 * Transitions between the activities inside this group.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see org.nasdanika.models.tibco.bw.BwPackage#getGroup_Transitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getTransitions();

} // Group

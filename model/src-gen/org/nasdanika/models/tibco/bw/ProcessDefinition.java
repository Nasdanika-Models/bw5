/**
 */
package org.nasdanika.models.tibco.bw;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Root element of a Tibco BW 5.x process file (.process).
 * Corresponds to pd:ProcessDefinition in the XML namespace
 * http://xmlns.tibco.com/bw/process/2003.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.tibco.bw.ProcessDefinition#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.ProcessDefinition#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.ProcessDefinition#getStartName <em>Start Name</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.ProcessDefinition#getStartType <em>Start Type</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.ProcessDefinition#getStartX <em>Start X</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.ProcessDefinition#getStartY <em>Start Y</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.ProcessDefinition#getEndName <em>End Name</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.ProcessDefinition#getEndType <em>End Type</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.ProcessDefinition#getEndX <em>End X</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.ProcessDefinition#getEndY <em>End Y</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.ProcessDefinition#getTargetNamespace <em>Target Namespace</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.ProcessDefinition#getReturnBindings <em>Return Bindings</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.ProcessDefinition#getStarter <em>Starter</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.ProcessDefinition#getActivities <em>Activities</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.ProcessDefinition#getGroups <em>Groups</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.ProcessDefinition#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.ProcessDefinition#getLabels <em>Labels</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.ProcessDefinition#getProcessVariables <em>Process Variables</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.ProcessDefinition#getErrorSchemas <em>Error Schemas</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.tibco.bw.BwPackage#getProcessDefinition()
 * @model
 * @generated
 */
public interface ProcessDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Fully-qualified process name (including package path),
	 * e.g. "Processes/MyProcess.process".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.nasdanika.models.tibco.bw.BwPackage#getProcessDefinition_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.tibco.bw.ProcessDefinition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Optional human-readable description.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.nasdanika.models.tibco.bw.BwPackage#getProcessDefinition_Description()
	 * @model unique="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.tibco.bw.ProcessDefinition#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Start Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Name of the implicit Start node (the process trigger).
	 * When a Starter is present this is the starter's name; otherwise BW
	 * generates a plain Start pseudo-state.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start Name</em>' attribute.
	 * @see #setStartName(String)
	 * @see org.nasdanika.models.tibco.bw.BwPackage#getProcessDefinition_StartName()
	 * @model unique="false"
	 * @generated
	 */
	String getStartName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.tibco.bw.ProcessDefinition#getStartName <em>Start Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Name</em>' attribute.
	 * @see #getStartName()
	 * @generated
	 */
	void setStartName(String value);

	/**
	 * Returns the value of the '<em><b>Start Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Canonical type of the start element (optional).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start Type</em>' attribute.
	 * @see #setStartType(String)
	 * @see org.nasdanika.models.tibco.bw.BwPackage#getProcessDefinition_StartType()
	 * @model unique="false"
	 * @generated
	 */
	String getStartType();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.tibco.bw.ProcessDefinition#getStartType <em>Start Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Type</em>' attribute.
	 * @see #getStartType()
	 * @generated
	 */
	void setStartType(String value);

	/**
	 * Returns the value of the '<em><b>Start X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * X coordinate of the Start node on the design canvas.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start X</em>' attribute.
	 * @see #setStartX(int)
	 * @see org.nasdanika.models.tibco.bw.BwPackage#getProcessDefinition_StartX()
	 * @model unique="false"
	 * @generated
	 */
	int getStartX();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.tibco.bw.ProcessDefinition#getStartX <em>Start X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start X</em>' attribute.
	 * @see #getStartX()
	 * @generated
	 */
	void setStartX(int value);

	/**
	 * Returns the value of the '<em><b>Start Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Y coordinate of the Start node on the design canvas.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start Y</em>' attribute.
	 * @see #setStartY(int)
	 * @see org.nasdanika.models.tibco.bw.BwPackage#getProcessDefinition_StartY()
	 * @model unique="false"
	 * @generated
	 */
	int getStartY();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.tibco.bw.ProcessDefinition#getStartY <em>Start Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Y</em>' attribute.
	 * @see #getStartY()
	 * @generated
	 */
	void setStartY(int value);

	/**
	 * Returns the value of the '<em><b>End Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Name of the implicit End node.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End Name</em>' attribute.
	 * @see #setEndName(String)
	 * @see org.nasdanika.models.tibco.bw.BwPackage#getProcessDefinition_EndName()
	 * @model unique="false"
	 * @generated
	 */
	String getEndName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.tibco.bw.ProcessDefinition#getEndName <em>End Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Name</em>' attribute.
	 * @see #getEndName()
	 * @generated
	 */
	void setEndName(String value);

	/**
	 * Returns the value of the '<em><b>End Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Canonical type of the end element (optional).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End Type</em>' attribute.
	 * @see #setEndType(String)
	 * @see org.nasdanika.models.tibco.bw.BwPackage#getProcessDefinition_EndType()
	 * @model unique="false"
	 * @generated
	 */
	String getEndType();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.tibco.bw.ProcessDefinition#getEndType <em>End Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Type</em>' attribute.
	 * @see #getEndType()
	 * @generated
	 */
	void setEndType(String value);

	/**
	 * Returns the value of the '<em><b>End X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * X coordinate of the End node on the design canvas.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End X</em>' attribute.
	 * @see #setEndX(int)
	 * @see org.nasdanika.models.tibco.bw.BwPackage#getProcessDefinition_EndX()
	 * @model unique="false"
	 * @generated
	 */
	int getEndX();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.tibco.bw.ProcessDefinition#getEndX <em>End X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End X</em>' attribute.
	 * @see #getEndX()
	 * @generated
	 */
	void setEndX(int value);

	/**
	 * Returns the value of the '<em><b>End Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Y coordinate of the End node on the design canvas.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End Y</em>' attribute.
	 * @see #setEndY(int)
	 * @see org.nasdanika.models.tibco.bw.BwPackage#getProcessDefinition_EndY()
	 * @model unique="false"
	 * @generated
	 */
	int getEndY();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.tibco.bw.ProcessDefinition#getEndY <em>End Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Y</em>' attribute.
	 * @see #getEndY()
	 * @generated
	 */
	void setEndY(int value);

	/**
	 * Returns the value of the '<em><b>Target Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * The XML target namespace declared in the process file.
	 * Used to qualify XPath expressions within the process.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Namespace</em>' attribute.
	 * @see #setTargetNamespace(String)
	 * @see org.nasdanika.models.tibco.bw.BwPackage#getProcessDefinition_TargetNamespace()
	 * @model unique="false"
	 * @generated
	 */
	String getTargetNamespace();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.tibco.bw.ProcessDefinition#getTargetNamespace <em>Target Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Namespace</em>' attribute.
	 * @see #getTargetNamespace()
	 * @generated
	 */
	void setTargetNamespace(String value);

	/**
	 * Returns the value of the '<em><b>Return Bindings</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * XSL bindings that produce the process return value (output schema).
	 * Stored as raw XML text because the bindings reference arbitrary namespaces.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Return Bindings</em>' attribute.
	 * @see #setReturnBindings(String)
	 * @see org.nasdanika.models.tibco.bw.BwPackage#getProcessDefinition_ReturnBindings()
	 * @model unique="false"
	 * @generated
	 */
	String getReturnBindings();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.tibco.bw.ProcessDefinition#getReturnBindings <em>Return Bindings</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Bindings</em>' attribute.
	 * @see #getReturnBindings()
	 * @generated
	 */
	void setReturnBindings(String value);

	/**
	 * Returns the value of the '<em><b>Starter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * The optional event-source activity that starts this process
	 * (e.g. an HTTP receiver, JMS queue listener, Timer, ...).
	 * When present, startName refers to this starter's name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Starter</em>' containment reference.
	 * @see #setStarter(Starter)
	 * @see org.nasdanika.models.tibco.bw.BwPackage#getProcessDefinition_Starter()
	 * @model containment="true"
	 * @generated
	 */
	Starter getStarter();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.tibco.bw.ProcessDefinition#getStarter <em>Starter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Starter</em>' containment reference.
	 * @see #getStarter()
	 * @generated
	 */
	void setStarter(Starter value);

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
	 * @see org.nasdanika.models.tibco.bw.BwPackage#getProcessDefinition_Activities()
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
	 * Groups of activities at the top level of this process (loops, scope, etc.).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Groups</em>' containment reference list.
	 * @see org.nasdanika.models.tibco.bw.BwPackage#getProcessDefinition_Groups()
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
	 * Transitions at the top level of this process.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see org.nasdanika.models.tibco.bw.BwPackage#getProcessDefinition_Transitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getTransitions();

	/**
	 * Returns the value of the '<em><b>Labels</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.tibco.bw.Label}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Visual annotation labels on the diagram.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Labels</em>' containment reference list.
	 * @see org.nasdanika.models.tibco.bw.BwPackage#getProcessDefinition_Labels()
	 * @model containment="true"
	 * @generated
	 */
	EList<Label> getLabels();

	/**
	 * Returns the value of the '<em><b>Process Variables</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.tibco.bw.ProcessVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Process-scoped variables declared in the process.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Process Variables</em>' containment reference list.
	 * @see org.nasdanika.models.tibco.bw.BwPackage#getProcessDefinition_ProcessVariables()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProcessVariable> getProcessVariables();

	/**
	 * Returns the value of the '<em><b>Error Schemas</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Error schemas that this process can throw.
	 * Stored as raw XML text because they are arbitrary XSD fragments.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Error Schemas</em>' attribute.
	 * @see #setErrorSchemas(String)
	 * @see org.nasdanika.models.tibco.bw.BwPackage#getProcessDefinition_ErrorSchemas()
	 * @model unique="false"
	 * @generated
	 */
	String getErrorSchemas();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.tibco.bw.ProcessDefinition#getErrorSchemas <em>Error Schemas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Schemas</em>' attribute.
	 * @see #getErrorSchemas()
	 * @generated
	 */
	void setErrorSchemas(String value);

} // ProcessDefinition

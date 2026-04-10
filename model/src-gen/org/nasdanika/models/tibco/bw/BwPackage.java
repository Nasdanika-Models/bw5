/**
 */
package org.nasdanika.models.tibco.bw;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.tibco.bw.BwFactory
 * @model kind="package"
 * @generated
 */
public interface BwPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "bw";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://bw.tibco.models.nasdanika.org";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.models.tibco.bw";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BwPackage eINSTANCE = org.nasdanika.models.tibco.bw.impl.BwPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.models.tibco.bw.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.tibco.bw.impl.NamedElementImpl
	 * @see org.nasdanika.models.tibco.bw.impl.BwPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.tibco.bw.impl.ContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.tibco.bw.impl.ContainerImpl
	 * @see org.nasdanika.models.tibco.bw.impl.BwPackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__DESCRIPTION = NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__ACTIVITIES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__GROUPS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__TRANSITIONS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.tibco.bw.impl.ProcessDefinitionImpl <em>Process Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.tibco.bw.impl.ProcessDefinitionImpl
	 * @see org.nasdanika.models.tibco.bw.impl.BwPackageImpl#getProcessDefinition()
	 * @generated
	 */
	int PROCESS_DEFINITION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION__NAME = CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION__DESCRIPTION = CONTAINER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION__ACTIVITIES = CONTAINER__ACTIVITIES;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION__GROUPS = CONTAINER__GROUPS;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION__TRANSITIONS = CONTAINER__TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Start Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION__START_NAME = CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Start Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION__START_TYPE = CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Start X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION__START_X = CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Start Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION__START_Y = CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>End Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION__END_NAME = CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>End Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION__END_TYPE = CONTAINER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>End X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION__END_X = CONTAINER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>End Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION__END_Y = CONTAINER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Target Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION__TARGET_NAMESPACE = CONTAINER_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Return Bindings</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION__RETURN_BINDINGS = CONTAINER_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Starter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION__STARTER = CONTAINER_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION__LABELS = CONTAINER_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Process Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION__PROCESS_VARIABLES = CONTAINER_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Error Schemas</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION__ERROR_SCHEMAS = CONTAINER_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Process Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION_FEATURE_COUNT = CONTAINER_FEATURE_COUNT + 14;

	/**
	 * The number of operations of the '<em>Process Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION_OPERATION_COUNT = CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.tibco.bw.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.tibco.bw.impl.NodeImpl
	 * @see org.nasdanika.models.tibco.bw.impl.BwPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__DESCRIPTION = NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__X = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__Y = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Outgoing Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__OUTGOING_TRANSITIONS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Incoming Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__INCOMING_TRANSITIONS = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.tibco.bw.impl.TypedElementImpl <em>Typed Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.tibco.bw.impl.TypedElementImpl
	 * @see org.nasdanika.models.tibco.bw.impl.BwPackageImpl#getTypedElement()
	 * @generated
	 */
	int TYPED_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT__DESCRIPTION = NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Typed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Typed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.tibco.bw.impl.TypedNodeImpl <em>Typed Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.tibco.bw.impl.TypedNodeImpl
	 * @see org.nasdanika.models.tibco.bw.impl.BwPackageImpl#getTypedNode()
	 * @generated
	 */
	int TYPED_NODE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_NODE__NAME = TYPED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_NODE__DESCRIPTION = TYPED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_NODE__TYPE = TYPED_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_NODE__X = TYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_NODE__Y = TYPED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Outgoing Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_NODE__OUTGOING_TRANSITIONS = TYPED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Incoming Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_NODE__INCOMING_TRANSITIONS = TYPED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Resource Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_NODE__RESOURCE_TYPE = TYPED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Typed Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_NODE_FEATURE_COUNT = TYPED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Typed Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_NODE_OPERATION_COUNT = TYPED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.tibco.bw.impl.ActivityImpl <em>Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.tibco.bw.impl.ActivityImpl
	 * @see org.nasdanika.models.tibco.bw.impl.BwPackageImpl#getActivity()
	 * @generated
	 */
	int ACTIVITY = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__NAME = TYPED_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__DESCRIPTION = TYPED_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__TYPE = TYPED_NODE__TYPE;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__X = TYPED_NODE__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__Y = TYPED_NODE__Y;

	/**
	 * The feature id for the '<em><b>Outgoing Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__OUTGOING_TRANSITIONS = TYPED_NODE__OUTGOING_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Incoming Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__INCOMING_TRANSITIONS = TYPED_NODE__INCOMING_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Resource Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__RESOURCE_TYPE = TYPED_NODE__RESOURCE_TYPE;

	/**
	 * The feature id for the '<em><b>Config</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__CONFIG = TYPED_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input Bindings</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__INPUT_BINDINGS = TYPED_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FEATURE_COUNT = TYPED_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_OPERATION_COUNT = TYPED_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.tibco.bw.impl.StarterImpl <em>Starter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.tibco.bw.impl.StarterImpl
	 * @see org.nasdanika.models.tibco.bw.impl.BwPackageImpl#getStarter()
	 * @generated
	 */
	int STARTER = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTER__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTER__DESCRIPTION = ACTIVITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTER__TYPE = ACTIVITY__TYPE;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTER__X = ACTIVITY__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTER__Y = ACTIVITY__Y;

	/**
	 * The feature id for the '<em><b>Outgoing Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTER__OUTGOING_TRANSITIONS = ACTIVITY__OUTGOING_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Incoming Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTER__INCOMING_TRANSITIONS = ACTIVITY__INCOMING_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Resource Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTER__RESOURCE_TYPE = ACTIVITY__RESOURCE_TYPE;

	/**
	 * The feature id for the '<em><b>Config</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTER__CONFIG = ACTIVITY__CONFIG;

	/**
	 * The feature id for the '<em><b>Input Bindings</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTER__INPUT_BINDINGS = ACTIVITY__INPUT_BINDINGS;

	/**
	 * The number of structural features of the '<em>Starter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTER_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Starter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTER_OPERATION_COUNT = ACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.tibco.bw.impl.GroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.tibco.bw.impl.GroupImpl
	 * @see org.nasdanika.models.tibco.bw.impl.BwPackageImpl#getGroup()
	 * @generated
	 */
	int GROUP = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__DESCRIPTION = ACTIVITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__TYPE = ACTIVITY__TYPE;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__X = ACTIVITY__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__Y = ACTIVITY__Y;

	/**
	 * The feature id for the '<em><b>Outgoing Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__OUTGOING_TRANSITIONS = ACTIVITY__OUTGOING_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Incoming Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__INCOMING_TRANSITIONS = ACTIVITY__INCOMING_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Resource Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__RESOURCE_TYPE = ACTIVITY__RESOURCE_TYPE;

	/**
	 * The feature id for the '<em><b>Config</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__CONFIG = ACTIVITY__CONFIG;

	/**
	 * The feature id for the '<em><b>Input Bindings</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__INPUT_BINDINGS = ACTIVITY__INPUT_BINDINGS;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__ACTIVITIES = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__GROUPS = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__TRANSITIONS = ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__WIDTH = ACTIVITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__HEIGHT = ACTIVITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Collapsed Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__COLLAPSED_WIDTH = ACTIVITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Collapsed Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__COLLAPSED_HEIGHT = ACTIVITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Expanded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__EXPANDED = ACTIVITY_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_OPERATION_COUNT = ACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.tibco.bw.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.tibco.bw.impl.TransitionImpl
	 * @see org.nasdanika.models.tibco.bw.impl.BwPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 9;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__FROM = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TO = 2;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TARGET = 3;

	/**
	 * The feature id for the '<em><b>Line Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__LINE_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Line Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__LINE_COLOR = 5;

	/**
	 * The feature id for the '<em><b>Condition Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__CONDITION_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__CONDITION = 7;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.tibco.bw.impl.LabelImpl <em>Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.tibco.bw.impl.LabelImpl
	 * @see org.nasdanika.models.tibco.bw.impl.BwPackageImpl#getLabel()
	 * @generated
	 */
	int LABEL = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__DESCRIPTION = NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__X = NODE__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__Y = NODE__Y;

	/**
	 * The feature id for the '<em><b>Outgoing Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__OUTGOING_TRANSITIONS = NODE__OUTGOING_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Incoming Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__INCOMING_TRANSITIONS = NODE__INCOMING_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__WIDTH = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__HEIGHT = NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Font Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__FONT_COLOR = NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__COLOR = NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__TYPE = NODE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Thickness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__THICKNESS = NODE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Fade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__FADE = NODE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_FEATURE_COUNT = NODE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.tibco.bw.impl.ProcessVariableImpl <em>Process Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.tibco.bw.impl.ProcessVariableImpl
	 * @see org.nasdanika.models.tibco.bw.impl.BwPackageImpl#getProcessVariable()
	 * @generated
	 */
	int PROCESS_VARIABLE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_VARIABLE__NAME = TYPED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_VARIABLE__DESCRIPTION = TYPED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_VARIABLE__TYPE = TYPED_ELEMENT__TYPE;

	/**
	 * The number of structural features of the '<em>Process Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_VARIABLE_FEATURE_COUNT = TYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Process Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_VARIABLE_OPERATION_COUNT = TYPED_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.tibco.bw.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see org.nasdanika.models.tibco.bw.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.tibco.bw.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.models.tibco.bw.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.tibco.bw.NamedElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.nasdanika.models.tibco.bw.NamedElement#getDescription()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Description();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.tibco.bw.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see org.nasdanika.models.tibco.bw.Container
	 * @generated
	 */
	EClass getContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.tibco.bw.Container#getActivities <em>Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activities</em>'.
	 * @see org.nasdanika.models.tibco.bw.Container#getActivities()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Activities();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.tibco.bw.Container#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Groups</em>'.
	 * @see org.nasdanika.models.tibco.bw.Container#getGroups()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Groups();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.tibco.bw.Container#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see org.nasdanika.models.tibco.bw.Container#getTransitions()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Transitions();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.tibco.bw.ProcessDefinition <em>Process Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Definition</em>'.
	 * @see org.nasdanika.models.tibco.bw.ProcessDefinition
	 * @generated
	 */
	EClass getProcessDefinition();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.tibco.bw.ProcessDefinition#getStartName <em>Start Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Name</em>'.
	 * @see org.nasdanika.models.tibco.bw.ProcessDefinition#getStartName()
	 * @see #getProcessDefinition()
	 * @generated
	 */
	EAttribute getProcessDefinition_StartName();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.tibco.bw.ProcessDefinition#getStartType <em>Start Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Type</em>'.
	 * @see org.nasdanika.models.tibco.bw.ProcessDefinition#getStartType()
	 * @see #getProcessDefinition()
	 * @generated
	 */
	EAttribute getProcessDefinition_StartType();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.tibco.bw.ProcessDefinition#getStartX <em>Start X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start X</em>'.
	 * @see org.nasdanika.models.tibco.bw.ProcessDefinition#getStartX()
	 * @see #getProcessDefinition()
	 * @generated
	 */
	EAttribute getProcessDefinition_StartX();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.tibco.bw.ProcessDefinition#getStartY <em>Start Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Y</em>'.
	 * @see org.nasdanika.models.tibco.bw.ProcessDefinition#getStartY()
	 * @see #getProcessDefinition()
	 * @generated
	 */
	EAttribute getProcessDefinition_StartY();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.tibco.bw.ProcessDefinition#getEndName <em>End Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Name</em>'.
	 * @see org.nasdanika.models.tibco.bw.ProcessDefinition#getEndName()
	 * @see #getProcessDefinition()
	 * @generated
	 */
	EAttribute getProcessDefinition_EndName();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.tibco.bw.ProcessDefinition#getEndType <em>End Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Type</em>'.
	 * @see org.nasdanika.models.tibco.bw.ProcessDefinition#getEndType()
	 * @see #getProcessDefinition()
	 * @generated
	 */
	EAttribute getProcessDefinition_EndType();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.tibco.bw.ProcessDefinition#getEndX <em>End X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End X</em>'.
	 * @see org.nasdanika.models.tibco.bw.ProcessDefinition#getEndX()
	 * @see #getProcessDefinition()
	 * @generated
	 */
	EAttribute getProcessDefinition_EndX();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.tibco.bw.ProcessDefinition#getEndY <em>End Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Y</em>'.
	 * @see org.nasdanika.models.tibco.bw.ProcessDefinition#getEndY()
	 * @see #getProcessDefinition()
	 * @generated
	 */
	EAttribute getProcessDefinition_EndY();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.tibco.bw.ProcessDefinition#getTargetNamespace <em>Target Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Namespace</em>'.
	 * @see org.nasdanika.models.tibco.bw.ProcessDefinition#getTargetNamespace()
	 * @see #getProcessDefinition()
	 * @generated
	 */
	EAttribute getProcessDefinition_TargetNamespace();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.tibco.bw.ProcessDefinition#getReturnBindings <em>Return Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Bindings</em>'.
	 * @see org.nasdanika.models.tibco.bw.ProcessDefinition#getReturnBindings()
	 * @see #getProcessDefinition()
	 * @generated
	 */
	EAttribute getProcessDefinition_ReturnBindings();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.tibco.bw.ProcessDefinition#getStarter <em>Starter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Starter</em>'.
	 * @see org.nasdanika.models.tibco.bw.ProcessDefinition#getStarter()
	 * @see #getProcessDefinition()
	 * @generated
	 */
	EReference getProcessDefinition_Starter();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.tibco.bw.ProcessDefinition#getLabels <em>Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Labels</em>'.
	 * @see org.nasdanika.models.tibco.bw.ProcessDefinition#getLabels()
	 * @see #getProcessDefinition()
	 * @generated
	 */
	EReference getProcessDefinition_Labels();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.tibco.bw.ProcessDefinition#getProcessVariables <em>Process Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Process Variables</em>'.
	 * @see org.nasdanika.models.tibco.bw.ProcessDefinition#getProcessVariables()
	 * @see #getProcessDefinition()
	 * @generated
	 */
	EReference getProcessDefinition_ProcessVariables();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.tibco.bw.ProcessDefinition#getErrorSchemas <em>Error Schemas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Schemas</em>'.
	 * @see org.nasdanika.models.tibco.bw.ProcessDefinition#getErrorSchemas()
	 * @see #getProcessDefinition()
	 * @generated
	 */
	EAttribute getProcessDefinition_ErrorSchemas();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.tibco.bw.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see org.nasdanika.models.tibco.bw.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.tibco.bw.Node#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.nasdanika.models.tibco.bw.Node#getX()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_X();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.tibco.bw.Node#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.nasdanika.models.tibco.bw.Node#getY()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Y();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.tibco.bw.Node#getOutgoingTransitions <em>Outgoing Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing Transitions</em>'.
	 * @see org.nasdanika.models.tibco.bw.Node#getOutgoingTransitions()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_OutgoingTransitions();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.tibco.bw.Node#getIncomingTransitions <em>Incoming Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming Transitions</em>'.
	 * @see org.nasdanika.models.tibco.bw.Node#getIncomingTransitions()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_IncomingTransitions();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.tibco.bw.TypedElement <em>Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typed Element</em>'.
	 * @see org.nasdanika.models.tibco.bw.TypedElement
	 * @generated
	 */
	EClass getTypedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.tibco.bw.TypedElement#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.nasdanika.models.tibco.bw.TypedElement#getType()
	 * @see #getTypedElement()
	 * @generated
	 */
	EAttribute getTypedElement_Type();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.tibco.bw.TypedNode <em>Typed Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typed Node</em>'.
	 * @see org.nasdanika.models.tibco.bw.TypedNode
	 * @generated
	 */
	EClass getTypedNode();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.tibco.bw.TypedNode#getResourceType <em>Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Type</em>'.
	 * @see org.nasdanika.models.tibco.bw.TypedNode#getResourceType()
	 * @see #getTypedNode()
	 * @generated
	 */
	EAttribute getTypedNode_ResourceType();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.tibco.bw.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity</em>'.
	 * @see org.nasdanika.models.tibco.bw.Activity
	 * @generated
	 */
	EClass getActivity();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.tibco.bw.Activity#getConfig <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Config</em>'.
	 * @see org.nasdanika.models.tibco.bw.Activity#getConfig()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_Config();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.tibco.bw.Activity#getInputBindings <em>Input Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Bindings</em>'.
	 * @see org.nasdanika.models.tibco.bw.Activity#getInputBindings()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_InputBindings();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.tibco.bw.Starter <em>Starter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Starter</em>'.
	 * @see org.nasdanika.models.tibco.bw.Starter
	 * @generated
	 */
	EClass getStarter();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.tibco.bw.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see org.nasdanika.models.tibco.bw.Group
	 * @generated
	 */
	EClass getGroup();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.tibco.bw.Group#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.nasdanika.models.tibco.bw.Group#getWidth()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_Width();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.tibco.bw.Group#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.nasdanika.models.tibco.bw.Group#getHeight()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_Height();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.tibco.bw.Group#getCollapsedWidth <em>Collapsed Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Collapsed Width</em>'.
	 * @see org.nasdanika.models.tibco.bw.Group#getCollapsedWidth()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_CollapsedWidth();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.tibco.bw.Group#getCollapsedHeight <em>Collapsed Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Collapsed Height</em>'.
	 * @see org.nasdanika.models.tibco.bw.Group#getCollapsedHeight()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_CollapsedHeight();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.tibco.bw.Group#isExpanded <em>Expanded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expanded</em>'.
	 * @see org.nasdanika.models.tibco.bw.Group#isExpanded()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_Expanded();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.tibco.bw.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see org.nasdanika.models.tibco.bw.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.tibco.bw.Transition#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From</em>'.
	 * @see org.nasdanika.models.tibco.bw.Transition#getFrom()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_From();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.tibco.bw.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.nasdanika.models.tibco.bw.Transition#getSource()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Source();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.tibco.bw.Transition#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To</em>'.
	 * @see org.nasdanika.models.tibco.bw.Transition#getTo()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_To();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.tibco.bw.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.nasdanika.models.tibco.bw.Transition#getTarget()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Target();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.tibco.bw.Transition#getLineType <em>Line Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Type</em>'.
	 * @see org.nasdanika.models.tibco.bw.Transition#getLineType()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_LineType();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.tibco.bw.Transition#getLineColor <em>Line Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Color</em>'.
	 * @see org.nasdanika.models.tibco.bw.Transition#getLineColor()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_LineColor();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.tibco.bw.Transition#getConditionType <em>Condition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition Type</em>'.
	 * @see org.nasdanika.models.tibco.bw.Transition#getConditionType()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_ConditionType();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.tibco.bw.Transition#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see org.nasdanika.models.tibco.bw.Transition#getCondition()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Condition();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.tibco.bw.Label <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label</em>'.
	 * @see org.nasdanika.models.tibco.bw.Label
	 * @generated
	 */
	EClass getLabel();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.tibco.bw.Label#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.nasdanika.models.tibco.bw.Label#getWidth()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_Width();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.tibco.bw.Label#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.nasdanika.models.tibco.bw.Label#getHeight()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_Height();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.tibco.bw.Label#getFontColor <em>Font Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Color</em>'.
	 * @see org.nasdanika.models.tibco.bw.Label#getFontColor()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_FontColor();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.tibco.bw.Label#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see org.nasdanika.models.tibco.bw.Label#getColor()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_Color();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.tibco.bw.Label#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.nasdanika.models.tibco.bw.Label#getType()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.tibco.bw.Label#getThickness <em>Thickness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thickness</em>'.
	 * @see org.nasdanika.models.tibco.bw.Label#getThickness()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_Thickness();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.tibco.bw.Label#getFade <em>Fade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fade</em>'.
	 * @see org.nasdanika.models.tibco.bw.Label#getFade()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_Fade();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.tibco.bw.ProcessVariable <em>Process Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Variable</em>'.
	 * @see org.nasdanika.models.tibco.bw.ProcessVariable
	 * @generated
	 */
	EClass getProcessVariable();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BwFactory getBwFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.tibco.bw.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.tibco.bw.impl.NamedElementImpl
		 * @see org.nasdanika.models.tibco.bw.impl.BwPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__DESCRIPTION = eINSTANCE.getNamedElement_Description();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.tibco.bw.impl.ContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.tibco.bw.impl.ContainerImpl
		 * @see org.nasdanika.models.tibco.bw.impl.BwPackageImpl#getContainer()
		 * @generated
		 */
		EClass CONTAINER = eINSTANCE.getContainer();

		/**
		 * The meta object literal for the '<em><b>Activities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__ACTIVITIES = eINSTANCE.getContainer_Activities();

		/**
		 * The meta object literal for the '<em><b>Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__GROUPS = eINSTANCE.getContainer_Groups();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__TRANSITIONS = eINSTANCE.getContainer_Transitions();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.tibco.bw.impl.ProcessDefinitionImpl <em>Process Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.tibco.bw.impl.ProcessDefinitionImpl
		 * @see org.nasdanika.models.tibco.bw.impl.BwPackageImpl#getProcessDefinition()
		 * @generated
		 */
		EClass PROCESS_DEFINITION = eINSTANCE.getProcessDefinition();

		/**
		 * The meta object literal for the '<em><b>Start Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_DEFINITION__START_NAME = eINSTANCE.getProcessDefinition_StartName();

		/**
		 * The meta object literal for the '<em><b>Start Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_DEFINITION__START_TYPE = eINSTANCE.getProcessDefinition_StartType();

		/**
		 * The meta object literal for the '<em><b>Start X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_DEFINITION__START_X = eINSTANCE.getProcessDefinition_StartX();

		/**
		 * The meta object literal for the '<em><b>Start Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_DEFINITION__START_Y = eINSTANCE.getProcessDefinition_StartY();

		/**
		 * The meta object literal for the '<em><b>End Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_DEFINITION__END_NAME = eINSTANCE.getProcessDefinition_EndName();

		/**
		 * The meta object literal for the '<em><b>End Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_DEFINITION__END_TYPE = eINSTANCE.getProcessDefinition_EndType();

		/**
		 * The meta object literal for the '<em><b>End X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_DEFINITION__END_X = eINSTANCE.getProcessDefinition_EndX();

		/**
		 * The meta object literal for the '<em><b>End Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_DEFINITION__END_Y = eINSTANCE.getProcessDefinition_EndY();

		/**
		 * The meta object literal for the '<em><b>Target Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_DEFINITION__TARGET_NAMESPACE = eINSTANCE.getProcessDefinition_TargetNamespace();

		/**
		 * The meta object literal for the '<em><b>Return Bindings</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_DEFINITION__RETURN_BINDINGS = eINSTANCE.getProcessDefinition_ReturnBindings();

		/**
		 * The meta object literal for the '<em><b>Starter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_DEFINITION__STARTER = eINSTANCE.getProcessDefinition_Starter();

		/**
		 * The meta object literal for the '<em><b>Labels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_DEFINITION__LABELS = eINSTANCE.getProcessDefinition_Labels();

		/**
		 * The meta object literal for the '<em><b>Process Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_DEFINITION__PROCESS_VARIABLES = eINSTANCE.getProcessDefinition_ProcessVariables();

		/**
		 * The meta object literal for the '<em><b>Error Schemas</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_DEFINITION__ERROR_SCHEMAS = eINSTANCE.getProcessDefinition_ErrorSchemas();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.tibco.bw.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.tibco.bw.impl.NodeImpl
		 * @see org.nasdanika.models.tibco.bw.impl.BwPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__X = eINSTANCE.getNode_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__Y = eINSTANCE.getNode_Y();

		/**
		 * The meta object literal for the '<em><b>Outgoing Transitions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__OUTGOING_TRANSITIONS = eINSTANCE.getNode_OutgoingTransitions();

		/**
		 * The meta object literal for the '<em><b>Incoming Transitions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__INCOMING_TRANSITIONS = eINSTANCE.getNode_IncomingTransitions();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.tibco.bw.impl.TypedElementImpl <em>Typed Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.tibco.bw.impl.TypedElementImpl
		 * @see org.nasdanika.models.tibco.bw.impl.BwPackageImpl#getTypedElement()
		 * @generated
		 */
		EClass TYPED_ELEMENT = eINSTANCE.getTypedElement();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPED_ELEMENT__TYPE = eINSTANCE.getTypedElement_Type();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.tibco.bw.impl.TypedNodeImpl <em>Typed Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.tibco.bw.impl.TypedNodeImpl
		 * @see org.nasdanika.models.tibco.bw.impl.BwPackageImpl#getTypedNode()
		 * @generated
		 */
		EClass TYPED_NODE = eINSTANCE.getTypedNode();

		/**
		 * The meta object literal for the '<em><b>Resource Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPED_NODE__RESOURCE_TYPE = eINSTANCE.getTypedNode_ResourceType();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.tibco.bw.impl.ActivityImpl <em>Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.tibco.bw.impl.ActivityImpl
		 * @see org.nasdanika.models.tibco.bw.impl.BwPackageImpl#getActivity()
		 * @generated
		 */
		EClass ACTIVITY = eINSTANCE.getActivity();

		/**
		 * The meta object literal for the '<em><b>Config</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__CONFIG = eINSTANCE.getActivity_Config();

		/**
		 * The meta object literal for the '<em><b>Input Bindings</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__INPUT_BINDINGS = eINSTANCE.getActivity_InputBindings();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.tibco.bw.impl.StarterImpl <em>Starter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.tibco.bw.impl.StarterImpl
		 * @see org.nasdanika.models.tibco.bw.impl.BwPackageImpl#getStarter()
		 * @generated
		 */
		EClass STARTER = eINSTANCE.getStarter();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.tibco.bw.impl.GroupImpl <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.tibco.bw.impl.GroupImpl
		 * @see org.nasdanika.models.tibco.bw.impl.BwPackageImpl#getGroup()
		 * @generated
		 */
		EClass GROUP = eINSTANCE.getGroup();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__WIDTH = eINSTANCE.getGroup_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__HEIGHT = eINSTANCE.getGroup_Height();

		/**
		 * The meta object literal for the '<em><b>Collapsed Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__COLLAPSED_WIDTH = eINSTANCE.getGroup_CollapsedWidth();

		/**
		 * The meta object literal for the '<em><b>Collapsed Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__COLLAPSED_HEIGHT = eINSTANCE.getGroup_CollapsedHeight();

		/**
		 * The meta object literal for the '<em><b>Expanded</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__EXPANDED = eINSTANCE.getGroup_Expanded();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.tibco.bw.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.tibco.bw.impl.TransitionImpl
		 * @see org.nasdanika.models.tibco.bw.impl.BwPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__FROM = eINSTANCE.getTransition_From();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__SOURCE = eINSTANCE.getTransition_Source();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__TO = eINSTANCE.getTransition_To();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TARGET = eINSTANCE.getTransition_Target();

		/**
		 * The meta object literal for the '<em><b>Line Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__LINE_TYPE = eINSTANCE.getTransition_LineType();

		/**
		 * The meta object literal for the '<em><b>Line Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__LINE_COLOR = eINSTANCE.getTransition_LineColor();

		/**
		 * The meta object literal for the '<em><b>Condition Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__CONDITION_TYPE = eINSTANCE.getTransition_ConditionType();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__CONDITION = eINSTANCE.getTransition_Condition();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.tibco.bw.impl.LabelImpl <em>Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.tibco.bw.impl.LabelImpl
		 * @see org.nasdanika.models.tibco.bw.impl.BwPackageImpl#getLabel()
		 * @generated
		 */
		EClass LABEL = eINSTANCE.getLabel();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__WIDTH = eINSTANCE.getLabel_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__HEIGHT = eINSTANCE.getLabel_Height();

		/**
		 * The meta object literal for the '<em><b>Font Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__FONT_COLOR = eINSTANCE.getLabel_FontColor();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__COLOR = eINSTANCE.getLabel_Color();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__TYPE = eINSTANCE.getLabel_Type();

		/**
		 * The meta object literal for the '<em><b>Thickness</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__THICKNESS = eINSTANCE.getLabel_Thickness();

		/**
		 * The meta object literal for the '<em><b>Fade</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__FADE = eINSTANCE.getLabel_Fade();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.tibco.bw.impl.ProcessVariableImpl <em>Process Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.tibco.bw.impl.ProcessVariableImpl
		 * @see org.nasdanika.models.tibco.bw.impl.BwPackageImpl#getProcessVariable()
		 * @generated
		 */
		EClass PROCESS_VARIABLE = eINSTANCE.getProcessVariable();

	}

} //BwPackage

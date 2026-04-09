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
 * <!-- begin-model-doc -->
 * Xcore model for Tibco BusinessWorks 5.x process concepts.
 * <!-- end-model-doc -->
 * @see org.nasdanika.models.tibco.bw.BwFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel bundleManifest='false' featureDelegation='Dynamic' complianceLevel='21.0' suppressGenModelAnnotations='false' copyrightFields='false' operationReflection='true' importOrganizing='true' basePackage='org.nasdanika.models.tibco'"
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
	 * The meta object id for the '{@link org.nasdanika.models.tibco.bw.impl.ProcessDefinitionImpl <em>Process Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.tibco.bw.impl.ProcessDefinitionImpl
	 * @see org.nasdanika.models.tibco.bw.impl.BwPackageImpl#getProcessDefinition()
	 * @generated
	 */
	int PROCESS_DEFINITION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Start Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION__START_NAME = 2;

	/**
	 * The feature id for the '<em><b>Start Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION__START_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Start X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION__START_X = 4;

	/**
	 * The feature id for the '<em><b>Start Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION__START_Y = 5;

	/**
	 * The feature id for the '<em><b>End Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION__END_NAME = 6;

	/**
	 * The feature id for the '<em><b>End Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION__END_TYPE = 7;

	/**
	 * The feature id for the '<em><b>End X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION__END_X = 8;

	/**
	 * The feature id for the '<em><b>End Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION__END_Y = 9;

	/**
	 * The feature id for the '<em><b>Target Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION__TARGET_NAMESPACE = 10;

	/**
	 * The feature id for the '<em><b>Return Bindings</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION__RETURN_BINDINGS = 11;

	/**
	 * The feature id for the '<em><b>Starter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION__STARTER = 12;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION__ACTIVITIES = 13;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION__GROUPS = 14;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION__TRANSITIONS = 15;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION__LABELS = 16;

	/**
	 * The feature id for the '<em><b>Process Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION__PROCESS_VARIABLES = 17;

	/**
	 * The feature id for the '<em><b>Error Schemas</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION__ERROR_SCHEMAS = 18;

	/**
	 * The number of structural features of the '<em>Process Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION_FEATURE_COUNT = 19;

	/**
	 * The number of operations of the '<em>Process Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.tibco.bw.impl.ActivityImpl <em>Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.tibco.bw.impl.ActivityImpl
	 * @see org.nasdanika.models.tibco.bw.impl.BwPackageImpl#getActivity()
	 * @generated
	 */
	int ACTIVITY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__DESCRIPTION = NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resource Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__RESOURCE_TYPE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__X = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__Y = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Config</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__CONFIG = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Input Bindings</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__INPUT_BINDINGS = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.tibco.bw.impl.StarterImpl <em>Starter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.tibco.bw.impl.StarterImpl
	 * @see org.nasdanika.models.tibco.bw.impl.BwPackageImpl#getStarter()
	 * @generated
	 */
	int STARTER = 3;

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
	 * The feature id for the '<em><b>Resource Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTER__RESOURCE_TYPE = ACTIVITY__RESOURCE_TYPE;

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
	int GROUP = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__DESCRIPTION = NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resource Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__RESOURCE_TYPE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__X = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__Y = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__WIDTH = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__HEIGHT = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Collapsed Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__COLLAPSED_WIDTH = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Collapsed Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__COLLAPSED_HEIGHT = NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Expanded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__EXPANDED = NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Config</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__CONFIG = NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Input Bindings</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__INPUT_BINDINGS = NAMED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__ACTIVITIES = NAMED_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__GROUPS = NAMED_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__TRANSITIONS = NAMED_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The number of operations of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.tibco.bw.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.tibco.bw.impl.TransitionImpl
	 * @see org.nasdanika.models.tibco.bw.impl.BwPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 5;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__FROM = 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TO = 1;

	/**
	 * The feature id for the '<em><b>Line Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__LINE_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Line Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__LINE_COLOR = 3;

	/**
	 * The feature id for the '<em><b>Condition Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__CONDITION_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__CONDITION = 5;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = 6;

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
	int LABEL = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__X = 2;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__Y = 3;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__WIDTH = 4;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__HEIGHT = 5;

	/**
	 * The feature id for the '<em><b>Font Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__FONT_COLOR = 6;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__COLOR = 7;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__TYPE = 8;

	/**
	 * The feature id for the '<em><b>Thickness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__THICKNESS = 9;

	/**
	 * The feature id for the '<em><b>Fade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__FADE = 10;

	/**
	 * The number of structural features of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.tibco.bw.impl.ProcessVariableImpl <em>Process Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.tibco.bw.impl.ProcessVariableImpl
	 * @see org.nasdanika.models.tibco.bw.impl.BwPackageImpl#getProcessVariable()
	 * @generated
	 */
	int PROCESS_VARIABLE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_VARIABLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_VARIABLE__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_VARIABLE__DESCRIPTION = 2;

	/**
	 * The number of structural features of the '<em>Process Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_VARIABLE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Process Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_VARIABLE_OPERATION_COUNT = 0;


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
	 * Returns the meta object for class '{@link org.nasdanika.models.tibco.bw.ProcessDefinition <em>Process Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Definition</em>'.
	 * @see org.nasdanika.models.tibco.bw.ProcessDefinition
	 * @generated
	 */
	EClass getProcessDefinition();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.tibco.bw.ProcessDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.models.tibco.bw.ProcessDefinition#getName()
	 * @see #getProcessDefinition()
	 * @generated
	 */
	EAttribute getProcessDefinition_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.tibco.bw.ProcessDefinition#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.nasdanika.models.tibco.bw.ProcessDefinition#getDescription()
	 * @see #getProcessDefinition()
	 * @generated
	 */
	EAttribute getProcessDefinition_Description();

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
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.tibco.bw.ProcessDefinition#getActivities <em>Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activities</em>'.
	 * @see org.nasdanika.models.tibco.bw.ProcessDefinition#getActivities()
	 * @see #getProcessDefinition()
	 * @generated
	 */
	EReference getProcessDefinition_Activities();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.tibco.bw.ProcessDefinition#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Groups</em>'.
	 * @see org.nasdanika.models.tibco.bw.ProcessDefinition#getGroups()
	 * @see #getProcessDefinition()
	 * @generated
	 */
	EReference getProcessDefinition_Groups();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.tibco.bw.ProcessDefinition#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see org.nasdanika.models.tibco.bw.ProcessDefinition#getTransitions()
	 * @see #getProcessDefinition()
	 * @generated
	 */
	EReference getProcessDefinition_Transitions();

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
	 * Returns the meta object for class '{@link org.nasdanika.models.tibco.bw.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity</em>'.
	 * @see org.nasdanika.models.tibco.bw.Activity
	 * @generated
	 */
	EClass getActivity();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.tibco.bw.Activity#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.nasdanika.models.tibco.bw.Activity#getType()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.tibco.bw.Activity#getResourceType <em>Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Type</em>'.
	 * @see org.nasdanika.models.tibco.bw.Activity#getResourceType()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_ResourceType();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.tibco.bw.Activity#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.nasdanika.models.tibco.bw.Activity#getX()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_X();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.tibco.bw.Activity#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.nasdanika.models.tibco.bw.Activity#getY()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_Y();

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
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.tibco.bw.Group#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.nasdanika.models.tibco.bw.Group#getType()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.tibco.bw.Group#getResourceType <em>Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Type</em>'.
	 * @see org.nasdanika.models.tibco.bw.Group#getResourceType()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_ResourceType();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.tibco.bw.Group#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.nasdanika.models.tibco.bw.Group#getX()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_X();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.tibco.bw.Group#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.nasdanika.models.tibco.bw.Group#getY()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_Y();

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
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.tibco.bw.Group#getConfig <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Config</em>'.
	 * @see org.nasdanika.models.tibco.bw.Group#getConfig()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_Config();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.tibco.bw.Group#getInputBindings <em>Input Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Bindings</em>'.
	 * @see org.nasdanika.models.tibco.bw.Group#getInputBindings()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_InputBindings();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.tibco.bw.Group#getActivities <em>Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activities</em>'.
	 * @see org.nasdanika.models.tibco.bw.Group#getActivities()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_Activities();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.tibco.bw.Group#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Groups</em>'.
	 * @see org.nasdanika.models.tibco.bw.Group#getGroups()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_Groups();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.tibco.bw.Group#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see org.nasdanika.models.tibco.bw.Group#getTransitions()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_Transitions();

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
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.tibco.bw.Label#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.models.tibco.bw.Label#getName()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.tibco.bw.Label#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.nasdanika.models.tibco.bw.Label#getDescription()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.tibco.bw.Label#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.nasdanika.models.tibco.bw.Label#getX()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_X();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.tibco.bw.Label#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.nasdanika.models.tibco.bw.Label#getY()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_Y();

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
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.tibco.bw.ProcessVariable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.models.tibco.bw.ProcessVariable#getName()
	 * @see #getProcessVariable()
	 * @generated
	 */
	EAttribute getProcessVariable_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.tibco.bw.ProcessVariable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.nasdanika.models.tibco.bw.ProcessVariable#getType()
	 * @see #getProcessVariable()
	 * @generated
	 */
	EAttribute getProcessVariable_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.tibco.bw.ProcessVariable#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.nasdanika.models.tibco.bw.ProcessVariable#getDescription()
	 * @see #getProcessVariable()
	 * @generated
	 */
	EAttribute getProcessVariable_Description();

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
		 * The meta object literal for the '{@link org.nasdanika.models.tibco.bw.impl.ProcessDefinitionImpl <em>Process Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.tibco.bw.impl.ProcessDefinitionImpl
		 * @see org.nasdanika.models.tibco.bw.impl.BwPackageImpl#getProcessDefinition()
		 * @generated
		 */
		EClass PROCESS_DEFINITION = eINSTANCE.getProcessDefinition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_DEFINITION__NAME = eINSTANCE.getProcessDefinition_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_DEFINITION__DESCRIPTION = eINSTANCE.getProcessDefinition_Description();

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
		 * The meta object literal for the '<em><b>Activities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_DEFINITION__ACTIVITIES = eINSTANCE.getProcessDefinition_Activities();

		/**
		 * The meta object literal for the '<em><b>Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_DEFINITION__GROUPS = eINSTANCE.getProcessDefinition_Groups();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_DEFINITION__TRANSITIONS = eINSTANCE.getProcessDefinition_Transitions();

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
		 * The meta object literal for the '{@link org.nasdanika.models.tibco.bw.impl.ActivityImpl <em>Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.tibco.bw.impl.ActivityImpl
		 * @see org.nasdanika.models.tibco.bw.impl.BwPackageImpl#getActivity()
		 * @generated
		 */
		EClass ACTIVITY = eINSTANCE.getActivity();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__TYPE = eINSTANCE.getActivity_Type();

		/**
		 * The meta object literal for the '<em><b>Resource Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__RESOURCE_TYPE = eINSTANCE.getActivity_ResourceType();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__X = eINSTANCE.getActivity_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__Y = eINSTANCE.getActivity_Y();

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
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__TYPE = eINSTANCE.getGroup_Type();

		/**
		 * The meta object literal for the '<em><b>Resource Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__RESOURCE_TYPE = eINSTANCE.getGroup_ResourceType();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__X = eINSTANCE.getGroup_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__Y = eINSTANCE.getGroup_Y();

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
		 * The meta object literal for the '<em><b>Config</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__CONFIG = eINSTANCE.getGroup_Config();

		/**
		 * The meta object literal for the '<em><b>Input Bindings</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__INPUT_BINDINGS = eINSTANCE.getGroup_InputBindings();

		/**
		 * The meta object literal for the '<em><b>Activities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__ACTIVITIES = eINSTANCE.getGroup_Activities();

		/**
		 * The meta object literal for the '<em><b>Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__GROUPS = eINSTANCE.getGroup_Groups();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__TRANSITIONS = eINSTANCE.getGroup_Transitions();

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
		 * The meta object literal for the '<em><b>To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__TO = eINSTANCE.getTransition_To();

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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__NAME = eINSTANCE.getLabel_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__DESCRIPTION = eINSTANCE.getLabel_Description();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__X = eINSTANCE.getLabel_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__Y = eINSTANCE.getLabel_Y();

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

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_VARIABLE__NAME = eINSTANCE.getProcessVariable_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_VARIABLE__TYPE = eINSTANCE.getProcessVariable_Type();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_VARIABLE__DESCRIPTION = eINSTANCE.getProcessVariable_Description();

	}

} //BwPackage

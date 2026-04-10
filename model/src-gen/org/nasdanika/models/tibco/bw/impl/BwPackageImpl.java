/**
 */
package org.nasdanika.models.tibco.bw.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nasdanika.models.tibco.bw.Activity;
import org.nasdanika.models.tibco.bw.BwFactory;
import org.nasdanika.models.tibco.bw.BwPackage;
import org.nasdanika.models.tibco.bw.Group;
import org.nasdanika.models.tibco.bw.Label;
import org.nasdanika.models.tibco.bw.NamedElement;
import org.nasdanika.models.tibco.bw.Node;
import org.nasdanika.models.tibco.bw.ProcessDefinition;
import org.nasdanika.models.tibco.bw.ProcessVariable;
import org.nasdanika.models.tibco.bw.Starter;
import org.nasdanika.models.tibco.bw.Transition;
import org.nasdanika.models.tibco.bw.TypedElement;
import org.nasdanika.models.tibco.bw.TypedNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BwPackageImpl extends EPackageImpl implements BwPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typedNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass starterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processVariableEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.nasdanika.models.tibco.bw.BwPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BwPackageImpl() {
		super(eNS_URI, BwFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link BwPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BwPackage init() {
		if (isInited) return (BwPackage)EPackage.Registry.INSTANCE.getEPackage(BwPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredBwPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		BwPackageImpl theBwPackage = registeredBwPackage instanceof BwPackageImpl ? (BwPackageImpl)registeredBwPackage : new BwPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theBwPackage.createPackageContents();

		// Initialize created meta-data
		theBwPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBwPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BwPackage.eNS_URI, theBwPackage);
		return theBwPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNamedElement_Description() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContainer() {
		return containerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_Activities() {
		return (EReference)containerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_Groups() {
		return (EReference)containerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_Transitions() {
		return (EReference)containerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProcessDefinition() {
		return processDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProcessDefinition_StartName() {
		return (EAttribute)processDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProcessDefinition_StartType() {
		return (EAttribute)processDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProcessDefinition_StartX() {
		return (EAttribute)processDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProcessDefinition_StartY() {
		return (EAttribute)processDefinitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProcessDefinition_EndName() {
		return (EAttribute)processDefinitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProcessDefinition_EndType() {
		return (EAttribute)processDefinitionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProcessDefinition_EndX() {
		return (EAttribute)processDefinitionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProcessDefinition_EndY() {
		return (EAttribute)processDefinitionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProcessDefinition_TargetNamespace() {
		return (EAttribute)processDefinitionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProcessDefinition_ReturnBindings() {
		return (EAttribute)processDefinitionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessDefinition_Starter() {
		return (EReference)processDefinitionEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessDefinition_Labels() {
		return (EReference)processDefinitionEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessDefinition_ProcessVariables() {
		return (EReference)processDefinitionEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProcessDefinition_ErrorSchemas() {
		return (EAttribute)processDefinitionEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNode() {
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNode_X() {
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNode_Y() {
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNode_OutgoingTransitions() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNode_IncomingTransitions() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTypedElement() {
		return typedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTypedElement_Type() {
		return (EAttribute)typedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTypedNode() {
		return typedNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTypedNode_ResourceType() {
		return (EAttribute)typedNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getActivity() {
		return activityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActivity_Config() {
		return (EAttribute)activityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActivity_InputBindings() {
		return (EAttribute)activityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStarter() {
		return starterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGroup() {
		return groupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGroup_Width() {
		return (EAttribute)groupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGroup_Height() {
		return (EAttribute)groupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGroup_CollapsedWidth() {
		return (EAttribute)groupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGroup_CollapsedHeight() {
		return (EAttribute)groupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGroup_Expanded() {
		return (EAttribute)groupEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTransition() {
		return transitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransition_From() {
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransition_Source() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransition_To() {
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransition_Target() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransition_LineType() {
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransition_LineColor() {
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransition_ConditionType() {
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransition_Condition() {
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLabel() {
		return labelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLabel_Width() {
		return (EAttribute)labelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLabel_Height() {
		return (EAttribute)labelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLabel_FontColor() {
		return (EAttribute)labelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLabel_Color() {
		return (EAttribute)labelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLabel_Type() {
		return (EAttribute)labelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLabel_Thickness() {
		return (EAttribute)labelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLabel_Fade() {
		return (EAttribute)labelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProcessVariable() {
		return processVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BwFactory getBwFactory() {
		return (BwFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__DESCRIPTION);

		containerEClass = createEClass(CONTAINER);
		createEReference(containerEClass, CONTAINER__ACTIVITIES);
		createEReference(containerEClass, CONTAINER__GROUPS);
		createEReference(containerEClass, CONTAINER__TRANSITIONS);

		processDefinitionEClass = createEClass(PROCESS_DEFINITION);
		createEAttribute(processDefinitionEClass, PROCESS_DEFINITION__START_NAME);
		createEAttribute(processDefinitionEClass, PROCESS_DEFINITION__START_TYPE);
		createEAttribute(processDefinitionEClass, PROCESS_DEFINITION__START_X);
		createEAttribute(processDefinitionEClass, PROCESS_DEFINITION__START_Y);
		createEAttribute(processDefinitionEClass, PROCESS_DEFINITION__END_NAME);
		createEAttribute(processDefinitionEClass, PROCESS_DEFINITION__END_TYPE);
		createEAttribute(processDefinitionEClass, PROCESS_DEFINITION__END_X);
		createEAttribute(processDefinitionEClass, PROCESS_DEFINITION__END_Y);
		createEAttribute(processDefinitionEClass, PROCESS_DEFINITION__TARGET_NAMESPACE);
		createEAttribute(processDefinitionEClass, PROCESS_DEFINITION__RETURN_BINDINGS);
		createEReference(processDefinitionEClass, PROCESS_DEFINITION__STARTER);
		createEReference(processDefinitionEClass, PROCESS_DEFINITION__LABELS);
		createEReference(processDefinitionEClass, PROCESS_DEFINITION__PROCESS_VARIABLES);
		createEAttribute(processDefinitionEClass, PROCESS_DEFINITION__ERROR_SCHEMAS);

		nodeEClass = createEClass(NODE);
		createEAttribute(nodeEClass, NODE__X);
		createEAttribute(nodeEClass, NODE__Y);
		createEReference(nodeEClass, NODE__OUTGOING_TRANSITIONS);
		createEReference(nodeEClass, NODE__INCOMING_TRANSITIONS);

		typedElementEClass = createEClass(TYPED_ELEMENT);
		createEAttribute(typedElementEClass, TYPED_ELEMENT__TYPE);

		typedNodeEClass = createEClass(TYPED_NODE);
		createEAttribute(typedNodeEClass, TYPED_NODE__RESOURCE_TYPE);

		activityEClass = createEClass(ACTIVITY);
		createEAttribute(activityEClass, ACTIVITY__CONFIG);
		createEAttribute(activityEClass, ACTIVITY__INPUT_BINDINGS);

		starterEClass = createEClass(STARTER);

		groupEClass = createEClass(GROUP);
		createEAttribute(groupEClass, GROUP__WIDTH);
		createEAttribute(groupEClass, GROUP__HEIGHT);
		createEAttribute(groupEClass, GROUP__COLLAPSED_WIDTH);
		createEAttribute(groupEClass, GROUP__COLLAPSED_HEIGHT);
		createEAttribute(groupEClass, GROUP__EXPANDED);

		transitionEClass = createEClass(TRANSITION);
		createEAttribute(transitionEClass, TRANSITION__FROM);
		createEReference(transitionEClass, TRANSITION__SOURCE);
		createEAttribute(transitionEClass, TRANSITION__TO);
		createEReference(transitionEClass, TRANSITION__TARGET);
		createEAttribute(transitionEClass, TRANSITION__LINE_TYPE);
		createEAttribute(transitionEClass, TRANSITION__LINE_COLOR);
		createEAttribute(transitionEClass, TRANSITION__CONDITION_TYPE);
		createEAttribute(transitionEClass, TRANSITION__CONDITION);

		labelEClass = createEClass(LABEL);
		createEAttribute(labelEClass, LABEL__WIDTH);
		createEAttribute(labelEClass, LABEL__HEIGHT);
		createEAttribute(labelEClass, LABEL__FONT_COLOR);
		createEAttribute(labelEClass, LABEL__COLOR);
		createEAttribute(labelEClass, LABEL__TYPE);
		createEAttribute(labelEClass, LABEL__THICKNESS);
		createEAttribute(labelEClass, LABEL__FADE);

		processVariableEClass = createEClass(PROCESS_VARIABLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		containerEClass.getESuperTypes().add(this.getNamedElement());
		processDefinitionEClass.getESuperTypes().add(this.getContainer());
		nodeEClass.getESuperTypes().add(this.getNamedElement());
		typedElementEClass.getESuperTypes().add(this.getNamedElement());
		typedNodeEClass.getESuperTypes().add(this.getTypedElement());
		typedNodeEClass.getESuperTypes().add(this.getNode());
		activityEClass.getESuperTypes().add(this.getTypedNode());
		starterEClass.getESuperTypes().add(this.getActivity());
		groupEClass.getESuperTypes().add(this.getActivity());
		groupEClass.getESuperTypes().add(this.getContainer());
		labelEClass.getESuperTypes().add(this.getNode());
		processVariableEClass.getESuperTypes().add(this.getTypedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), theEcorePackage.getEString(), "name", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNamedElement_Description(), theEcorePackage.getEString(), "description", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containerEClass, org.nasdanika.models.tibco.bw.Container.class, "Container", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContainer_Activities(), this.getActivity(), null, "activities", null, 0, -1, org.nasdanika.models.tibco.bw.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getContainer_Activities().getEKeys().add(this.getNamedElement_Name());
		initEReference(getContainer_Groups(), this.getGroup(), null, "groups", null, 0, -1, org.nasdanika.models.tibco.bw.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getContainer_Groups().getEKeys().add(this.getNamedElement_Name());
		initEReference(getContainer_Transitions(), this.getTransition(), null, "transitions", null, 0, -1, org.nasdanika.models.tibco.bw.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processDefinitionEClass, ProcessDefinition.class, "ProcessDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProcessDefinition_StartName(), theEcorePackage.getEString(), "startName", null, 0, 1, ProcessDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessDefinition_StartType(), theEcorePackage.getEString(), "startType", null, 0, 1, ProcessDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessDefinition_StartX(), theEcorePackage.getEInt(), "startX", null, 0, 1, ProcessDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessDefinition_StartY(), theEcorePackage.getEInt(), "startY", null, 0, 1, ProcessDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessDefinition_EndName(), theEcorePackage.getEString(), "endName", null, 0, 1, ProcessDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessDefinition_EndType(), theEcorePackage.getEString(), "endType", null, 0, 1, ProcessDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessDefinition_EndX(), theEcorePackage.getEInt(), "endX", null, 0, 1, ProcessDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessDefinition_EndY(), theEcorePackage.getEInt(), "endY", null, 0, 1, ProcessDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessDefinition_TargetNamespace(), theEcorePackage.getEString(), "targetNamespace", null, 0, 1, ProcessDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessDefinition_ReturnBindings(), theEcorePackage.getEString(), "returnBindings", null, 0, 1, ProcessDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessDefinition_Starter(), this.getStarter(), null, "starter", null, 0, 1, ProcessDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessDefinition_Labels(), this.getLabel(), null, "labels", null, 0, -1, ProcessDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessDefinition_ProcessVariables(), this.getProcessVariable(), null, "processVariables", null, 0, -1, ProcessDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProcessDefinition_ProcessVariables().getEKeys().add(this.getNamedElement_Name());
		initEAttribute(getProcessDefinition_ErrorSchemas(), theEcorePackage.getEString(), "errorSchemas", null, 0, 1, ProcessDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNode_X(), theEcorePackage.getEInt(), "x", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_Y(), theEcorePackage.getEInt(), "y", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_OutgoingTransitions(), this.getTransition(), this.getTransition_Source(), "outgoingTransitions", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_IncomingTransitions(), this.getTransition(), this.getTransition_Target(), "incomingTransitions", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typedElementEClass, TypedElement.class, "TypedElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTypedElement_Type(), theEcorePackage.getEString(), "type", null, 0, 1, TypedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typedNodeEClass, TypedNode.class, "TypedNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTypedNode_ResourceType(), theEcorePackage.getEString(), "resourceType", null, 0, 1, TypedNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityEClass, Activity.class, "Activity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActivity_Config(), theEcorePackage.getEString(), "config", null, 0, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivity_InputBindings(), theEcorePackage.getEString(), "inputBindings", null, 0, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(starterEClass, Starter.class, "Starter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(groupEClass, Group.class, "Group", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGroup_Width(), theEcorePackage.getEInt(), "width", null, 0, 1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroup_Height(), theEcorePackage.getEInt(), "height", null, 0, 1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroup_CollapsedWidth(), theEcorePackage.getEInt(), "collapsedWidth", null, 0, 1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroup_CollapsedHeight(), theEcorePackage.getEInt(), "collapsedHeight", null, 0, 1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroup_Expanded(), theEcorePackage.getEBoolean(), "expanded", null, 0, 1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransition_From(), theEcorePackage.getEString(), "from", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Source(), this.getNode(), this.getNode_OutgoingTransitions(), "source", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_To(), theEcorePackage.getEString(), "to", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Target(), this.getNode(), this.getNode_IncomingTransitions(), "target", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_LineType(), theEcorePackage.getEString(), "lineType", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_LineColor(), theEcorePackage.getEString(), "lineColor", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_ConditionType(), theEcorePackage.getEString(), "conditionType", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_Condition(), theEcorePackage.getEString(), "condition", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(labelEClass, Label.class, "Label", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLabel_Width(), theEcorePackage.getEInt(), "width", null, 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLabel_Height(), theEcorePackage.getEInt(), "height", null, 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLabel_FontColor(), theEcorePackage.getEString(), "fontColor", null, 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLabel_Color(), theEcorePackage.getEString(), "color", null, 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLabel_Type(), theEcorePackage.getEString(), "type", null, 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLabel_Thickness(), theEcorePackage.getEString(), "thickness", null, 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLabel_Fade(), theEcorePackage.getEString(), "fade", null, 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processVariableEClass, ProcessVariable.class, "ProcessVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// null
		createNullAnnotations();
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
	}

	/**
	 * Initializes the annotations for <b>null</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createNullAnnotations() {
		String source = null;
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "documentation", "Xcore model for Tibco BusinessWorks 5.x process concepts.",
			   "bundleManifest", "false",
			   "featureDelegation", "Dynamic",
			   "complianceLevel", "21.0",
			   "suppressGenModelAnnotations", "false",
			   "copyrightFields", "false",
			   "operationReflection", "true",
			   "importOrganizing", "true",
			   "basePackage", "org.nasdanika.models.tibco"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";
		addAnnotation
		  (namedElementEClass,
		   source,
		   new String[] {
			   "documentation", "*\nAbstract base for process elements that are identified by name within a process.\nCorresponds to the NamedType complex type in the BW process schema."
		   });
		addAnnotation
		  (getNamedElement_Name(),
		   source,
		   new String[] {
			   "documentation", "*\nThe element\'s unique name within its containing scope (process or group).\nUsed as the reference target in Transition.from and Transition.to."
		   });
		addAnnotation
		  (getNamedElement_Description(),
		   source,
		   new String[] {
			   "documentation", "*\nOptional human-readable description of this element."
		   });
		addAnnotation
		  (getContainer_Activities(),
		   source,
		   new String[] {
			   "documentation", "*\nActivities (tasks/steps) at the top level of this process."
		   });
		addAnnotation
		  (getContainer_Groups(),
		   source,
		   new String[] {
			   "documentation", "*\nGroups of activities at the top level of this process (loops, scope, etc.)."
		   });
		addAnnotation
		  (getContainer_Transitions(),
		   source,
		   new String[] {
			   "documentation", "*\nTransitions at the top level of this process."
		   });
		addAnnotation
		  (processDefinitionEClass,
		   source,
		   new String[] {
			   "documentation", "*\nRoot element of a Tibco BW 5.x process file (.process).\nCorresponds to pd:ProcessDefinition in the XML namespace\nhttp://xmlns.tibco.com/bw/process/2003."
		   });
		addAnnotation
		  (getProcessDefinition_StartName(),
		   source,
		   new String[] {
			   "documentation", "*\nName of the implicit Start node (the process trigger).\nWhen a Starter is present this is the starter\'s name; otherwise BW\ngenerates a plain Start pseudo-state."
		   });
		addAnnotation
		  (getProcessDefinition_StartType(),
		   source,
		   new String[] {
			   "documentation", "*\nCanonical type of the start element (optional)."
		   });
		addAnnotation
		  (getProcessDefinition_StartX(),
		   source,
		   new String[] {
			   "documentation", "*\nX coordinate of the Start node on the design canvas."
		   });
		addAnnotation
		  (getProcessDefinition_StartY(),
		   source,
		   new String[] {
			   "documentation", "*\nY coordinate of the Start node on the design canvas."
		   });
		addAnnotation
		  (getProcessDefinition_EndName(),
		   source,
		   new String[] {
			   "documentation", "*\nName of the implicit End node."
		   });
		addAnnotation
		  (getProcessDefinition_EndType(),
		   source,
		   new String[] {
			   "documentation", "*\nCanonical type of the end element (optional)."
		   });
		addAnnotation
		  (getProcessDefinition_EndX(),
		   source,
		   new String[] {
			   "documentation", "*\nX coordinate of the End node on the design canvas."
		   });
		addAnnotation
		  (getProcessDefinition_EndY(),
		   source,
		   new String[] {
			   "documentation", "*\nY coordinate of the End node on the design canvas."
		   });
		addAnnotation
		  (getProcessDefinition_TargetNamespace(),
		   source,
		   new String[] {
			   "documentation", "*\nThe XML target namespace declared in the process file.\nUsed to qualify XPath expressions within the process."
		   });
		addAnnotation
		  (getProcessDefinition_ReturnBindings(),
		   source,
		   new String[] {
			   "documentation", "*\nXSL bindings that produce the process return value (output schema).\nStored as raw XML text because the bindings reference arbitrary namespaces."
		   });
		addAnnotation
		  (getProcessDefinition_Starter(),
		   source,
		   new String[] {
			   "documentation", "*\nThe optional event-source activity that starts this process\n(e.g. an HTTP receiver, JMS queue listener, Timer, ...).\nWhen present, startName refers to this starter\'s name."
		   });
		addAnnotation
		  (getProcessDefinition_Labels(),
		   source,
		   new String[] {
			   "documentation", "*\nVisual annotation labels on the diagram."
		   });
		addAnnotation
		  (getProcessDefinition_ProcessVariables(),
		   source,
		   new String[] {
			   "documentation", "*\nProcess-scoped variables declared in the process."
		   });
		addAnnotation
		  (getProcessDefinition_ErrorSchemas(),
		   source,
		   new String[] {
			   "documentation", "*\nError schemas that this process can throw.\nStored as raw XML text because they are arbitrary XSD fragments."
		   });
		addAnnotation
		  (getNode_X(),
		   source,
		   new String[] {
			   "documentation", "*\nX coordinate on the design canvas."
		   });
		addAnnotation
		  (getNode_Y(),
		   source,
		   new String[] {
			   "documentation", "*\nY coordinate on the design canvas."
		   });
		addAnnotation
		  (getTypedElement_Type(),
		   source,
		   new String[] {
			   "documentation", "*\nFully-qualified Java class name of the activity implementation,\ne.g. \"com.tibco.pe.core.WriteToLogActivity\"."
		   });
		addAnnotation
		  (getTypedNode_ResourceType(),
		   source,
		   new String[] {
			   "documentation", "*\nPalette / resource-type identifier used by the BW Designer,\ne.g. \"ae.activities.log\"."
		   });
		addAnnotation
		  (activityEClass,
		   source,
		   new String[] {
			   "documentation", "*\nAn activity (task or step) within a BW process or group.\nCorresponds to pd:activity in the process XML."
		   });
		addAnnotation
		  (getActivity_Config(),
		   source,
		   new String[] {
			   "documentation", "*\nActivity-specific configuration, stored as raw XML text.\nThe structure varies per activity type."
		   });
		addAnnotation
		  (getActivity_InputBindings(),
		   source,
		   new String[] {
			   "documentation", "*\nXSL input bindings for this activity, stored as raw XML text."
		   });
		addAnnotation
		  (starterEClass,
		   source,
		   new String[] {
			   "documentation", "*\nAn event-source (starter) activity that triggers the process.\nCorresponds to pd:starter in the process XML.\nExamples: HTTP Event Source, JMS Queue Receiver, Timer, File Poller.\n\nStructurally identical to a regular Activity; modelled as a distinct\nclass so that tooling can easily distinguish starters from regular steps."
		   });
		addAnnotation
		  (groupEClass,
		   source,
		   new String[] {
			   "documentation", "*\nA group of activities, used to model structured constructs such as:\n  - Loops (Repeat-Until, For-Each, While)\n  - Error handlers / Fault handlers\n  - Critical sections\n  - Scope groups\n\nCorresponds to pd:group in the process XML."
		   });
		addAnnotation
		  (getGroup_Width(),
		   source,
		   new String[] {
			   "documentation", "*\nWidth of the expanded group frame on the design canvas."
		   });
		addAnnotation
		  (getGroup_Height(),
		   source,
		   new String[] {
			   "documentation", "*\nHeight of the expanded group frame on the design canvas."
		   });
		addAnnotation
		  (getGroup_CollapsedWidth(),
		   source,
		   new String[] {
			   "documentation", "*\nWidth of the group icon when collapsed."
		   });
		addAnnotation
		  (getGroup_CollapsedHeight(),
		   source,
		   new String[] {
			   "documentation", "*\nHeight of the group icon when collapsed."
		   });
		addAnnotation
		  (getGroup_Expanded(),
		   source,
		   new String[] {
			   "documentation", "*\nWhether the group is shown in expanded form on the canvas."
		   });
		addAnnotation
		  (transitionEClass,
		   source,
		   new String[] {
			   "documentation", "*\nA directed connection from one activity (or pseudo-state) to another.\nCorresponds to pd:transition in the process XML.\n\nThe source and target are identified by the name of the containing\nNamedElement (Activity, Starter, Group, or the special names \"Start\"\nand \"End\" / \"start\" and \"end\" inside a group)."
		   });
		addAnnotation
		  (getTransition_From(),
		   source,
		   new String[] {
			   "documentation", "*\nName of the source activity, group, or pseudo-state\n(e.g. \"Log\", \"Start\", \"IterateAndFindMatch\")."
		   });
		addAnnotation
		  (getTransition_To(),
		   source,
		   new String[] {
			   "documentation", "*\nName of the target activity, group, or pseudo-state\n(e.g. \"End\", \"MapResultToResponse\")."
		   });
		addAnnotation
		  (getTransition_LineType(),
		   source,
		   new String[] {
			   "documentation", "*\nVisual style of the transition line.\nCommon values: \"Default\", \"Straight\", \"Curved\"."
		   });
		addAnnotation
		  (getTransition_LineColor(),
		   source,
		   new String[] {
			   "documentation", "*\nRGB color of the transition line encoded as a signed integer\n(Java AWT convention), e.g. \"-16777216\" for black."
		   });
		addAnnotation
		  (getTransition_ConditionType(),
		   source,
		   new String[] {
			   "documentation", "*\nHow the transition is enabled.\nCommon values: \"always\", \"expression\", \"error\", \"timeout\"."
		   });
		addAnnotation
		  (getTransition_Condition(),
		   source,
		   new String[] {
			   "documentation", "*\nXPath/XSL condition expression evaluated at runtime to decide\nwhether this transition fires.  Only used when conditionType\nis \"expression\"."
		   });
		addAnnotation
		  (labelEClass,
		   source,
		   new String[] {
			   "documentation", "*\nA visual annotation (sticky-note style label) placed on the design canvas.\nCorresponds to pd:label in the process XML."
		   });
		addAnnotation
		  (getLabel_Width(),
		   source,
		   new String[] {
			   "documentation", "*\nWidth of the label box on the canvas."
		   });
		addAnnotation
		  (getLabel_Height(),
		   source,
		   new String[] {
			   "documentation", "*\nHeight of the label box on the canvas."
		   });
		addAnnotation
		  (getLabel_FontColor(),
		   source,
		   new String[] {
			   "documentation", "*\nFont color encoded as an RGB integer string."
		   });
		addAnnotation
		  (getLabel_Color(),
		   source,
		   new String[] {
			   "documentation", "*\nBackground color encoded as an RGB integer string."
		   });
		addAnnotation
		  (getLabel_Type(),
		   source,
		   new String[] {
			   "documentation", "*\nLabel shape type."
		   });
		addAnnotation
		  (getLabel_Thickness(),
		   source,
		   new String[] {
			   "documentation", "*\nBorder line thickness."
		   });
		addAnnotation
		  (getLabel_Fade(),
		   source,
		   new String[] {
			   "documentation", "*\nOpacity / fade value."
		   });
		addAnnotation
		  (processVariableEClass,
		   source,
		   new String[] {
			   "documentation", "*\nA process-level variable declared in the processVariables section.\nProcess variables hold state that is visible to all activities within\nthe same process instance."
		   });
	}

} //BwPackageImpl

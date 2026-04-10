/**
 */
package org.nasdanika.models.tibco.bw;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.tibco.bw.BwPackage
 * @generated
 */
public interface BwFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BwFactory eINSTANCE = org.nasdanika.models.tibco.bw.impl.BwFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Process Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Process Definition</em>'.
	 * @generated
	 */
	ProcessDefinition createProcessDefinition();

	/**
	 * Returns a new object of class '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node</em>'.
	 * @generated
	 */
	Node createNode();

	/**
	 * Returns a new object of class '<em>Typed Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Typed Element</em>'.
	 * @generated
	 */
	TypedElement createTypedElement();

	/**
	 * Returns a new object of class '<em>Typed Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Typed Node</em>'.
	 * @generated
	 */
	TypedNode createTypedNode();

	/**
	 * Returns a new object of class '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity</em>'.
	 * @generated
	 */
	Activity createActivity();

	/**
	 * Returns a new object of class '<em>Starter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Starter</em>'.
	 * @generated
	 */
	Starter createStarter();

	/**
	 * Returns a new object of class '<em>Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Group</em>'.
	 * @generated
	 */
	Group createGroup();

	/**
	 * Returns a new object of class '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transition</em>'.
	 * @generated
	 */
	Transition createTransition();

	/**
	 * Returns a new object of class '<em>Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Label</em>'.
	 * @generated
	 */
	Label createLabel();

	/**
	 * Returns a new object of class '<em>Process Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Process Variable</em>'.
	 * @generated
	 */
	ProcessVariable createProcessVariable();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BwPackage getBwPackage();

} //BwFactory

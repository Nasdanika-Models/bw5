/**
 */
package org.nasdanika.models.bw5;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Folder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.bw5.Folder#getResources <em>Resources</em>}</li>
 *   <li>{@link org.nasdanika.models.bw5.Folder#getResourceType <em>Resource Type</em>}</li>
 *   <li>{@link org.nasdanika.models.bw5.Folder#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.bw5.Bw5Package#getFolder()
 * @model
 * @generated
 */
public interface Folder extends Resource {
	/**
	 * Returns the value of the '<em><b>Resources</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.bw5.Resource}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.bw5.Resource#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' reference list.
	 * @see org.nasdanika.models.bw5.Bw5Package#getFolder_Resources()
	 * @see org.nasdanika.models.bw5.Resource#getParent
	 * @model opposite="parent"
	 * @generated
	 */
	EList<Resource> getResources();

	/**
	 * Returns the value of the '<em><b>Resource Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Loaded from .folder file repository/folder resourceType attribute
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resource Type</em>' attribute.
	 * @see #setResourceType(String)
	 * @see org.nasdanika.models.bw5.Bw5Package#getFolder_ResourceType()
	 * @model unique="false"
	 * @generated
	 */
	String getResourceType();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.bw5.Folder#getResourceType <em>Resource Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Type</em>' attribute.
	 * @see #getResourceType()
	 * @generated
	 */
	void setResourceType(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Loaded from .folder file repository/folder name attribute
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.nasdanika.models.bw5.Bw5Package#getFolder_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.bw5.Folder#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Folder

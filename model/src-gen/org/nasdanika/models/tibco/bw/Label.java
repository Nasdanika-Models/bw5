/**
 */
package org.nasdanika.models.tibco.bw;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Label</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * A visual annotation (sticky-note style label) placed on the design canvas.
 * Corresponds to pd:label in the process XML.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.tibco.bw.Label#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.Label#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.Label#getX <em>X</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.Label#getY <em>Y</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.Label#getWidth <em>Width</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.Label#getHeight <em>Height</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.Label#getFontColor <em>Font Color</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.Label#getColor <em>Color</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.Label#getType <em>Type</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.Label#getThickness <em>Thickness</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.Label#getFade <em>Fade</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.tibco.bw.BwPackage#getLabel()
 * @model
 * @generated
 */
public interface Label extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Label title / identifier on the canvas.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.nasdanika.models.tibco.bw.BwPackage#getLabel_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.tibco.bw.Label#getName <em>Name</em>}' attribute.
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
	 * Text content of the label.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.nasdanika.models.tibco.bw.BwPackage#getLabel_Description()
	 * @model unique="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.tibco.bw.Label#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

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
	 * @see org.nasdanika.models.tibco.bw.BwPackage#getLabel_X()
	 * @model unique="false"
	 * @generated
	 */
	int getX();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.tibco.bw.Label#getX <em>X</em>}' attribute.
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
	 * @see org.nasdanika.models.tibco.bw.BwPackage#getLabel_Y()
	 * @model unique="false"
	 * @generated
	 */
	int getY();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.tibco.bw.Label#getY <em>Y</em>}' attribute.
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
	 * Width of the label box on the canvas.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(int)
	 * @see org.nasdanika.models.tibco.bw.BwPackage#getLabel_Width()
	 * @model unique="false"
	 * @generated
	 */
	int getWidth();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.tibco.bw.Label#getWidth <em>Width</em>}' attribute.
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
	 * Height of the label box on the canvas.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(int)
	 * @see org.nasdanika.models.tibco.bw.BwPackage#getLabel_Height()
	 * @model unique="false"
	 * @generated
	 */
	int getHeight();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.tibco.bw.Label#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(int value);

	/**
	 * Returns the value of the '<em><b>Font Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Font color encoded as an RGB integer string.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Font Color</em>' attribute.
	 * @see #setFontColor(String)
	 * @see org.nasdanika.models.tibco.bw.BwPackage#getLabel_FontColor()
	 * @model unique="false"
	 * @generated
	 */
	String getFontColor();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.tibco.bw.Label#getFontColor <em>Font Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Color</em>' attribute.
	 * @see #getFontColor()
	 * @generated
	 */
	void setFontColor(String value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Background color encoded as an RGB integer string.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #setColor(String)
	 * @see org.nasdanika.models.tibco.bw.BwPackage#getLabel_Color()
	 * @model unique="false"
	 * @generated
	 */
	String getColor();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.tibco.bw.Label#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Label shape type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.nasdanika.models.tibco.bw.BwPackage#getLabel_Type()
	 * @model unique="false"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.tibco.bw.Label#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Thickness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Border line thickness.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Thickness</em>' attribute.
	 * @see #setThickness(String)
	 * @see org.nasdanika.models.tibco.bw.BwPackage#getLabel_Thickness()
	 * @model unique="false"
	 * @generated
	 */
	String getThickness();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.tibco.bw.Label#getThickness <em>Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thickness</em>' attribute.
	 * @see #getThickness()
	 * @generated
	 */
	void setThickness(String value);

	/**
	 * Returns the value of the '<em><b>Fade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Opacity / fade value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fade</em>' attribute.
	 * @see #setFade(String)
	 * @see org.nasdanika.models.tibco.bw.BwPackage#getLabel_Fade()
	 * @model unique="false"
	 * @generated
	 */
	String getFade();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.tibco.bw.Label#getFade <em>Fade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fade</em>' attribute.
	 * @see #getFade()
	 * @generated
	 */
	void setFade(String value);

} // Label

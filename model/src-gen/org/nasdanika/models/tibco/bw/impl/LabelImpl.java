/**
 */
package org.nasdanika.models.tibco.bw.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.tibco.bw.BwPackage;
import org.nasdanika.models.tibco.bw.Label;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Label</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.tibco.bw.impl.LabelImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.impl.LabelImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.impl.LabelImpl#getX <em>X</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.impl.LabelImpl#getY <em>Y</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.impl.LabelImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.impl.LabelImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.impl.LabelImpl#getFontColor <em>Font Color</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.impl.LabelImpl#getColor <em>Color</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.impl.LabelImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.impl.LabelImpl#getThickness <em>Thickness</em>}</li>
 *   <li>{@link org.nasdanika.models.tibco.bw.impl.LabelImpl#getFade <em>Fade</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LabelImpl extends MinimalEObjectImpl.Container implements Label {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected static final int X_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected static final int Y_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int WIDTH_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final int HEIGHT_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getFontColor() <em>Font Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontColor()
	 * @generated
	 * @ordered
	 */
	protected static final String FONT_COLOR_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final String COLOR_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getThickness() <em>Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThickness()
	 * @generated
	 * @ordered
	 */
	protected static final String THICKNESS_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getFade() <em>Fade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFade()
	 * @generated
	 * @ordered
	 */
	protected static final String FADE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LabelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BwPackage.Literals.LABEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return (String)eDynamicGet(BwPackage.LABEL__NAME, BwPackage.Literals.LABEL__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		eDynamicSet(BwPackage.LABEL__NAME, BwPackage.Literals.LABEL__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eDynamicGet(BwPackage.LABEL__DESCRIPTION, BwPackage.Literals.LABEL__DESCRIPTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eDynamicSet(BwPackage.LABEL__DESCRIPTION, BwPackage.Literals.LABEL__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getX() {
		return (Integer)eDynamicGet(BwPackage.LABEL__X, BwPackage.Literals.LABEL__X, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setX(int newX) {
		eDynamicSet(BwPackage.LABEL__X, BwPackage.Literals.LABEL__X, newX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getY() {
		return (Integer)eDynamicGet(BwPackage.LABEL__Y, BwPackage.Literals.LABEL__Y, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setY(int newY) {
		eDynamicSet(BwPackage.LABEL__Y, BwPackage.Literals.LABEL__Y, newY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getWidth() {
		return (Integer)eDynamicGet(BwPackage.LABEL__WIDTH, BwPackage.Literals.LABEL__WIDTH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWidth(int newWidth) {
		eDynamicSet(BwPackage.LABEL__WIDTH, BwPackage.Literals.LABEL__WIDTH, newWidth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getHeight() {
		return (Integer)eDynamicGet(BwPackage.LABEL__HEIGHT, BwPackage.Literals.LABEL__HEIGHT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeight(int newHeight) {
		eDynamicSet(BwPackage.LABEL__HEIGHT, BwPackage.Literals.LABEL__HEIGHT, newHeight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFontColor() {
		return (String)eDynamicGet(BwPackage.LABEL__FONT_COLOR, BwPackage.Literals.LABEL__FONT_COLOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFontColor(String newFontColor) {
		eDynamicSet(BwPackage.LABEL__FONT_COLOR, BwPackage.Literals.LABEL__FONT_COLOR, newFontColor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getColor() {
		return (String)eDynamicGet(BwPackage.LABEL__COLOR, BwPackage.Literals.LABEL__COLOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColor(String newColor) {
		eDynamicSet(BwPackage.LABEL__COLOR, BwPackage.Literals.LABEL__COLOR, newColor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getType() {
		return (String)eDynamicGet(BwPackage.LABEL__TYPE, BwPackage.Literals.LABEL__TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(String newType) {
		eDynamicSet(BwPackage.LABEL__TYPE, BwPackage.Literals.LABEL__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getThickness() {
		return (String)eDynamicGet(BwPackage.LABEL__THICKNESS, BwPackage.Literals.LABEL__THICKNESS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThickness(String newThickness) {
		eDynamicSet(BwPackage.LABEL__THICKNESS, BwPackage.Literals.LABEL__THICKNESS, newThickness);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFade() {
		return (String)eDynamicGet(BwPackage.LABEL__FADE, BwPackage.Literals.LABEL__FADE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFade(String newFade) {
		eDynamicSet(BwPackage.LABEL__FADE, BwPackage.Literals.LABEL__FADE, newFade);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BwPackage.LABEL__NAME:
				return getName();
			case BwPackage.LABEL__DESCRIPTION:
				return getDescription();
			case BwPackage.LABEL__X:
				return getX();
			case BwPackage.LABEL__Y:
				return getY();
			case BwPackage.LABEL__WIDTH:
				return getWidth();
			case BwPackage.LABEL__HEIGHT:
				return getHeight();
			case BwPackage.LABEL__FONT_COLOR:
				return getFontColor();
			case BwPackage.LABEL__COLOR:
				return getColor();
			case BwPackage.LABEL__TYPE:
				return getType();
			case BwPackage.LABEL__THICKNESS:
				return getThickness();
			case BwPackage.LABEL__FADE:
				return getFade();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BwPackage.LABEL__NAME:
				setName((String)newValue);
				return;
			case BwPackage.LABEL__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case BwPackage.LABEL__X:
				setX((Integer)newValue);
				return;
			case BwPackage.LABEL__Y:
				setY((Integer)newValue);
				return;
			case BwPackage.LABEL__WIDTH:
				setWidth((Integer)newValue);
				return;
			case BwPackage.LABEL__HEIGHT:
				setHeight((Integer)newValue);
				return;
			case BwPackage.LABEL__FONT_COLOR:
				setFontColor((String)newValue);
				return;
			case BwPackage.LABEL__COLOR:
				setColor((String)newValue);
				return;
			case BwPackage.LABEL__TYPE:
				setType((String)newValue);
				return;
			case BwPackage.LABEL__THICKNESS:
				setThickness((String)newValue);
				return;
			case BwPackage.LABEL__FADE:
				setFade((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BwPackage.LABEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BwPackage.LABEL__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case BwPackage.LABEL__X:
				setX(X_EDEFAULT);
				return;
			case BwPackage.LABEL__Y:
				setY(Y_EDEFAULT);
				return;
			case BwPackage.LABEL__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case BwPackage.LABEL__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case BwPackage.LABEL__FONT_COLOR:
				setFontColor(FONT_COLOR_EDEFAULT);
				return;
			case BwPackage.LABEL__COLOR:
				setColor(COLOR_EDEFAULT);
				return;
			case BwPackage.LABEL__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case BwPackage.LABEL__THICKNESS:
				setThickness(THICKNESS_EDEFAULT);
				return;
			case BwPackage.LABEL__FADE:
				setFade(FADE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BwPackage.LABEL__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case BwPackage.LABEL__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case BwPackage.LABEL__X:
				return getX() != X_EDEFAULT;
			case BwPackage.LABEL__Y:
				return getY() != Y_EDEFAULT;
			case BwPackage.LABEL__WIDTH:
				return getWidth() != WIDTH_EDEFAULT;
			case BwPackage.LABEL__HEIGHT:
				return getHeight() != HEIGHT_EDEFAULT;
			case BwPackage.LABEL__FONT_COLOR:
				return FONT_COLOR_EDEFAULT == null ? getFontColor() != null : !FONT_COLOR_EDEFAULT.equals(getFontColor());
			case BwPackage.LABEL__COLOR:
				return COLOR_EDEFAULT == null ? getColor() != null : !COLOR_EDEFAULT.equals(getColor());
			case BwPackage.LABEL__TYPE:
				return TYPE_EDEFAULT == null ? getType() != null : !TYPE_EDEFAULT.equals(getType());
			case BwPackage.LABEL__THICKNESS:
				return THICKNESS_EDEFAULT == null ? getThickness() != null : !THICKNESS_EDEFAULT.equals(getThickness());
			case BwPackage.LABEL__FADE:
				return FADE_EDEFAULT == null ? getFade() != null : !FADE_EDEFAULT.equals(getFade());
		}
		return super.eIsSet(featureID);
	}

} //LabelImpl

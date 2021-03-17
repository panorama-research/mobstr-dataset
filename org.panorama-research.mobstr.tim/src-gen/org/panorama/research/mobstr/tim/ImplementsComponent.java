/**
 */
package org.panorama.research.mobstr.tim;

import org.eclipse.app4mc.amalthea.model.INamed;

import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.Component;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implements Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Links Runnables to Components
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.panorama.research.mobstr.tim.ImplementsComponent#getSource <em>Source</em>}</li>
 *   <li>{@link org.panorama.research.mobstr.tim.ImplementsComponent#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.panorama.research.mobstr.tim.TimPackage#getImplementsComponent()
 * @model
 * @generated
 */
public interface ImplementsComponent extends DirectedTraceLink {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(INamed)
	 * @see org.panorama.research.mobstr.tim.TimPackage#getImplementsComponent_Source()
	 * @model required="true"
	 * @generated
	 */
	INamed getSource();

	/**
	 * Sets the value of the '{@link org.panorama.research.mobstr.tim.ImplementsComponent#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(INamed value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Component}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference list.
	 * @see org.panorama.research.mobstr.tim.TimPackage#getImplementsComponent_Target()
	 * @model required="true"
	 * @generated
	 */
	EList<Component> getTarget();

} // ImplementsComponent

/**
 */
package org.panorama.research.mobstr.tim;

import ode.base.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Details Hazard With</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Links the Safety Case to the Fault Tree Analysis
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.panorama.research.mobstr.tim.DetailsHazardWith#getSource <em>Source</em>}</li>
 *   <li>{@link org.panorama.research.mobstr.tim.DetailsHazardWith#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.panorama.research.mobstr.tim.TimPackage#getDetailsHazardWith()
 * @model
 * @generated
 */
public interface DetailsHazardWith extends DirectedTraceLink {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Element)
	 * @see org.panorama.research.mobstr.tim.TimPackage#getDetailsHazardWith_Source()
	 * @model required="true"
	 * @generated
	 */
	Element getSource();

	/**
	 * Sets the value of the '{@link org.panorama.research.mobstr.tim.DetailsHazardWith#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Element value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Element)
	 * @see org.panorama.research.mobstr.tim.TimPackage#getDetailsHazardWith_Target()
	 * @model required="true"
	 * @generated
	 */
	Element getTarget();

	/**
	 * Sets the value of the '{@link org.panorama.research.mobstr.tim.DetailsHazardWith#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Element value);

} // DetailsHazardWith

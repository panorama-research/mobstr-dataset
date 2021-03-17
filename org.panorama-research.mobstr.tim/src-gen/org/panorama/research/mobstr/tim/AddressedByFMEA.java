/**
 */
package org.panorama.research.mobstr.tim;

import ode.base.Element;

import ode.failureLogic.FMEA;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Addressed By FMEA</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Links Safety Case to FMEA
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.panorama.research.mobstr.tim.AddressedByFMEA#getSource <em>Source</em>}</li>
 *   <li>{@link org.panorama.research.mobstr.tim.AddressedByFMEA#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.panorama.research.mobstr.tim.TimPackage#getAddressedByFMEA()
 * @model
 * @generated
 */
public interface AddressedByFMEA extends DirectedTraceLink {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Element)
	 * @see org.panorama.research.mobstr.tim.TimPackage#getAddressedByFMEA_Source()
	 * @model required="true"
	 * @generated
	 */
	Element getSource();

	/**
	 * Sets the value of the '{@link org.panorama.research.mobstr.tim.AddressedByFMEA#getSource <em>Source</em>}' reference.
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
	 * @see #setTarget(FMEA)
	 * @see org.panorama.research.mobstr.tim.TimPackage#getAddressedByFMEA_Target()
	 * @model required="true"
	 * @generated
	 */
	FMEA getTarget();

	/**
	 * Sets the value of the '{@link org.panorama.research.mobstr.tim.AddressedByFMEA#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(FMEA value);

} // AddressedByFMEA

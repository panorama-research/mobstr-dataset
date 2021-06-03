/**
 */
package org.panorama.research.mobstr.tim;

import ode.base.Element;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>References As Top Level Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Links the Safety Case to a Failure from Fault Tree Analysis
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.panorama.research.mobstr.tim.ReferencesAsTopLevelEvent#getSource <em>Source</em>}</li>
 *   <li>{@link org.panorama.research.mobstr.tim.ReferencesAsTopLevelEvent#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.panorama.research.mobstr.tim.TimPackage#getReferencesAsTopLevelEvent()
 * @model
 * @generated
 */
public interface ReferencesAsTopLevelEvent extends DirectedTraceLink {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Element)
	 * @see org.panorama.research.mobstr.tim.TimPackage#getReferencesAsTopLevelEvent_Source()
	 * @model required="true"
	 * @generated
	 */
	Element getSource();

	/**
	 * Sets the value of the '{@link org.panorama.research.mobstr.tim.ReferencesAsTopLevelEvent#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Element value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference list.
	 * The list contents are of type {@link ode.base.Element}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference list.
	 * @see org.panorama.research.mobstr.tim.TimPackage#getReferencesAsTopLevelEvent_Target()
	 * @model required="true"
	 * @generated
	 */
	EList<Element> getTarget();

} // ReferencesAsTopLevelEvent

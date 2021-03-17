/**
 */
package org.panorama.research.mobstr.tim;

import ode.failureLogic.Failure;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Leads To Hazard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Links Effects to Hazards
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.panorama.research.mobstr.tim.LeadsToHazard#getSource <em>Source</em>}</li>
 *   <li>{@link org.panorama.research.mobstr.tim.LeadsToHazard#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.panorama.research.mobstr.tim.TimPackage#getLeadsToHazard()
 * @model
 * @generated
 */
public interface LeadsToHazard extends DirectedTraceLink {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Failure)
	 * @see org.panorama.research.mobstr.tim.TimPackage#getLeadsToHazard_Source()
	 * @model required="true"
	 * @generated
	 */
	Failure getSource();

	/**
	 * Sets the value of the '{@link org.panorama.research.mobstr.tim.LeadsToHazard#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Failure value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference list.
	 * @see org.panorama.research.mobstr.tim.TimPackage#getLeadsToHazard_Target()
	 * @model required="true"
	 *        annotation="http://panorama-research.org/mobstr/UseWrapperType className='CapraOfficeObject'"
	 * @generated
	 */
	EList<EObject> getTarget();

} // LeadsToHazard

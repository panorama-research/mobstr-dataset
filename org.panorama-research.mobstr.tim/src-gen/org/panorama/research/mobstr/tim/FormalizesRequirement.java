/**
 */
package org.panorama.research.mobstr.tim;

import ode.dependability.DependabilityContract;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Formalizes Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ******************************
 *       OFFIS Extensions
 * *****************************
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.panorama.research.mobstr.tim.FormalizesRequirement#getSource <em>Source</em>}</li>
 *   <li>{@link org.panorama.research.mobstr.tim.FormalizesRequirement#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.panorama.research.mobstr.tim.TimPackage#getFormalizesRequirement()
 * @model
 * @generated
 */
public interface FormalizesRequirement extends DirectedTraceLink {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(DependabilityContract)
	 * @see org.panorama.research.mobstr.tim.TimPackage#getFormalizesRequirement_Source()
	 * @model required="true"
	 * @generated
	 */
	DependabilityContract getSource();

	/**
	 * Sets the value of the '{@link org.panorama.research.mobstr.tim.FormalizesRequirement#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(DependabilityContract value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference list.
	 * @see org.panorama.research.mobstr.tim.TimPackage#getFormalizesRequirement_Target()
	 * @model required="true"
	 *        annotation="http://panorama-research.org/mobstr/UseWrapperType className='CapraOfficeObject'"
	 * @generated
	 */
	EList<EObject> getTarget();

} // FormalizesRequirement

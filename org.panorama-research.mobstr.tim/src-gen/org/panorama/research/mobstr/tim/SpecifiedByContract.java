/**
 */
package org.panorama.research.mobstr.tim;

import ode.dependability.DependabilityContract;

import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.Component;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specified By Contract</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Links Components to their Contracts
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.panorama.research.mobstr.tim.SpecifiedByContract#getSource <em>Source</em>}</li>
 *   <li>{@link org.panorama.research.mobstr.tim.SpecifiedByContract#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.panorama.research.mobstr.tim.TimPackage#getSpecifiedByContract()
 * @model
 * @generated
 */
public interface SpecifiedByContract extends DirectedTraceLink {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Component)
	 * @see org.panorama.research.mobstr.tim.TimPackage#getSpecifiedByContract_Source()
	 * @model required="true"
	 * @generated
	 */
	Component getSource();

	/**
	 * Sets the value of the '{@link org.panorama.research.mobstr.tim.SpecifiedByContract#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Component value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference list.
	 * The list contents are of type {@link ode.dependability.DependabilityContract}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference list.
	 * @see org.panorama.research.mobstr.tim.TimPackage#getSpecifiedByContract_Target()
	 * @model required="true"
	 * @generated
	 */
	EList<DependabilityContract> getTarget();

} // SpecifiedByContract

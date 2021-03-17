/**
 */
package org.panorama.research.mobstr.tim;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Component;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Realizes Item Defintion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Links Components to Item Definition
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.panorama.research.mobstr.tim.RealizesItemDefintion#getSource <em>Source</em>}</li>
 *   <li>{@link org.panorama.research.mobstr.tim.RealizesItemDefintion#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.panorama.research.mobstr.tim.TimPackage#getRealizesItemDefintion()
 * @model
 * @generated
 */
public interface RealizesItemDefintion extends DirectedTraceLink {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Component)
	 * @see org.panorama.research.mobstr.tim.TimPackage#getRealizesItemDefintion_Source()
	 * @model required="true"
	 * @generated
	 */
	Component getSource();

	/**
	 * Sets the value of the '{@link org.panorama.research.mobstr.tim.RealizesItemDefintion#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Component value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(EObject)
	 * @see org.panorama.research.mobstr.tim.TimPackage#getRealizesItemDefintion_Target()
	 * @model required="true"
	 *        annotation="http://panorama-research.org/mobstr/UseWrapperType className='File'"
	 * @generated
	 */
	EObject getTarget();

	/**
	 * Sets the value of the '{@link org.panorama.research.mobstr.tim.RealizesItemDefintion#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(EObject value);

} // RealizesItemDefintion

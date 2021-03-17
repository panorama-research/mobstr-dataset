/**
 */
package org.panorama.research.mobstr.tim;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Trace Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Provides an abstract base class for trace links
 * that contains an ID and a name.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.panorama.research.mobstr.tim.AbstractTraceLink#getID <em>ID</em>}</li>
 *   <li>{@link org.panorama.research.mobstr.tim.AbstractTraceLink#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.panorama.research.mobstr.tim.TimPackage#getAbstractTraceLink()
 * @model abstract="true"
 * @generated
 */
public interface AbstractTraceLink extends EObject {
	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see org.panorama.research.mobstr.tim.TimPackage#getAbstractTraceLink_ID()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getID();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.panorama.research.mobstr.tim.TimPackage#getAbstractTraceLink_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.panorama.research.mobstr.tim.AbstractTraceLink#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // AbstractTraceLink

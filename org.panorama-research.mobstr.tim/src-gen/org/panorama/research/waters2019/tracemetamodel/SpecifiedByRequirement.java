/**
 */
package org.panorama.research.waters2019.tracemetamodel;

import ode.dependability.Measure;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specified By Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Links measures to safety requirements
 * TODO: Use name from ISO
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.panorama.research.waters2019.tracemetamodel.SpecifiedByRequirement#getSource <em>Source</em>}</li>
 *   <li>{@link org.panorama.research.waters2019.tracemetamodel.SpecifiedByRequirement#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.panorama.research.waters2019.tracemetamodel.TracemetamodelPackage#getSpecifiedByRequirement()
 * @model
 * @generated
 */
public interface SpecifiedByRequirement extends DirectedTraceLink {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Measure)
	 * @see org.panorama.research.waters2019.tracemetamodel.TracemetamodelPackage#getSpecifiedByRequirement_Source()
	 * @model required="true"
	 * @generated
	 */
	Measure getSource();

	/**
	 * Sets the value of the '{@link org.panorama.research.waters2019.tracemetamodel.SpecifiedByRequirement#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Measure value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference list.
	 * @see org.panorama.research.waters2019.tracemetamodel.TracemetamodelPackage#getSpecifiedByRequirement_Target()
	 * @model required="true"
	 *        annotation="http://panorama-research.org/waters2019/UseWrapperType className='CapraOfficeObject'"
	 * @generated
	 */
	EList<EObject> getTarget();

} // SpecifiedByRequirement

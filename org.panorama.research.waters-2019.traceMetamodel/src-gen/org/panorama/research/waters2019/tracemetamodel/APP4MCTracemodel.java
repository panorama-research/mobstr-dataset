/**
 */
package org.panorama.research.waters2019.tracemetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>APP4MC Tracemodel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.panorama.research.waters2019.tracemetamodel.APP4MCTracemodel#getTraces <em>Traces</em>}</li>
 * </ul>
 *
 * @see org.panorama.research.waters2019.tracemetamodel.TracemetamodelPackage#getAPP4MCTracemodel()
 * @model
 * @generated
 */
public interface APP4MCTracemodel extends EObject {
	/**
	 * Returns the value of the '<em><b>Traces</b></em>' containment reference list.
	 * The list contents are of type {@link org.panorama.research.waters2019.tracemetamodel.RelatedTo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Traces</em>' containment reference list.
	 * @see org.panorama.research.waters2019.tracemetamodel.TracemetamodelPackage#getAPP4MCTracemodel_Traces()
	 * @model containment="true"
	 * @generated
	 */
	EList<RelatedTo> getTraces();

} // APP4MCTracemodel

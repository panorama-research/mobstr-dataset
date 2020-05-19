/**
 */
package org.panorama.research.waters2019.tracemetamodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.panorama.research.waters2019.tracemetamodel.TracemetamodelPackage
 * @generated
 */
public interface TracemetamodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TracemetamodelFactory eINSTANCE = org.panorama.research.waters2019.tracemetamodel.impl.TracemetamodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>APP4MC Tracemodel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>APP4MC Tracemodel</em>'.
	 * @generated
	 */
	APP4MCTracemodel createAPP4MCTracemodel();

	/**
	 * Returns a new object of class '<em>Related To</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Related To</em>'.
	 * @generated
	 */
	RelatedTo createRelatedTo();

	/**
	 * Returns a new object of class '<em>Realized by</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Realized by</em>'.
	 * @generated
	 */
	Realized_by createRealized_by();

	/**
	 * Returns a new object of class '<em>Excecuted by</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Excecuted by</em>'.
	 * @generated
	 */
	Excecuted_by createExcecuted_by();

	/**
	 * Returns a new object of class '<em>Prevented by</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prevented by</em>'.
	 * @generated
	 */
	Prevented_by createPrevented_by();

	/**
	 * Returns a new object of class '<em>Formalized by</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Formalized by</em>'.
	 * @generated
	 */
	Formalized_by createFormalized_by();

	/**
	 * Returns a new object of class '<em>Implemented by</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Implemented by</em>'.
	 * @generated
	 */
	Implemented_by createImplemented_by();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TracemetamodelPackage getTracemetamodelPackage();

} //TracemetamodelFactory

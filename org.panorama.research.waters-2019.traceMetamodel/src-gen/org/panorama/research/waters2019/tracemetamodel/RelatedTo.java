/**
 */
package org.panorama.research.waters2019.tracemetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Related To</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.panorama.research.waters2019.tracemetamodel.RelatedTo#getID <em>ID</em>}</li>
 *   <li>{@link org.panorama.research.waters2019.tracemetamodel.RelatedTo#getName <em>Name</em>}</li>
 *   <li>{@link org.panorama.research.waters2019.tracemetamodel.RelatedTo#getItem <em>Item</em>}</li>
 * </ul>
 *
 * @see org.panorama.research.waters2019.tracemetamodel.TracemetamodelPackage#getRelatedTo()
 * @model
 * @generated
 */
public interface RelatedTo extends EObject {
	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see org.panorama.research.waters2019.tracemetamodel.TracemetamodelPackage#getRelatedTo_ID()
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
	 * @see org.panorama.research.waters2019.tracemetamodel.TracemetamodelPackage#getRelatedTo_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.panorama.research.waters2019.tracemetamodel.RelatedTo#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Item</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item</em>' reference list.
	 * @see org.panorama.research.waters2019.tracemetamodel.TracemetamodelPackage#getRelatedTo_Item()
	 * @model
	 * @generated
	 */
	EList<EObject> getItem();

} // RelatedTo

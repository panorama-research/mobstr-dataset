/**
 */
package org.panorama.research.mobstr.tim;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Related To</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A generic trace link that can accept arbitrary
 * elements and is undirected.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.panorama.research.mobstr.tim.RelatedTo#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @see org.panorama.research.mobstr.tim.TimPackage#getRelatedTo()
 * @model
 * @generated
 */
public interface RelatedTo extends AbstractTraceLink {
	/**
	 * Returns the value of the '<em><b>Items</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' reference list.
	 * @see org.panorama.research.mobstr.tim.TimPackage#getRelatedTo_Items()
	 * @model
	 * @generated
	 */
	EList<EObject> getItems();

} // RelatedTo

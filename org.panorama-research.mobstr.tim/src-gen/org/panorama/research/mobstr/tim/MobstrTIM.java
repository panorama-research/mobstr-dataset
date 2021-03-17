/**
 */
package org.panorama.research.mobstr.tim;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mobstr TIM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Container for the trace links relevant for
 * the WATERS challenge.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.panorama.research.mobstr.tim.MobstrTIM#getTraces <em>Traces</em>}</li>
 * </ul>
 *
 * @see org.panorama.research.mobstr.tim.TimPackage#getMobstrTIM()
 * @model
 * @generated
 */
public interface MobstrTIM extends EObject {
	/**
	 * Returns the value of the '<em><b>Traces</b></em>' containment reference list.
	 * The list contents are of type {@link org.panorama.research.mobstr.tim.AbstractTraceLink}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Traces</em>' containment reference list.
	 * @see org.panorama.research.mobstr.tim.TimPackage#getMobstrTIM_Traces()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractTraceLink> getTraces();

} // MobstrTIM

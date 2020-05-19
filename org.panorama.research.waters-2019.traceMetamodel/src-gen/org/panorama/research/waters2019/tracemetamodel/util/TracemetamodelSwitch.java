/**
 */
package org.panorama.research.waters2019.tracemetamodel.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.panorama.research.waters2019.tracemetamodel.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.panorama.research.waters2019.tracemetamodel.TracemetamodelPackage
 * @generated
 */
public class TracemetamodelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TracemetamodelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracemetamodelSwitch() {
		if (modelPackage == null) {
			modelPackage = TracemetamodelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case TracemetamodelPackage.APP4MC_TRACEMODEL: {
				APP4MCTracemodel app4MCTracemodel = (APP4MCTracemodel)theEObject;
				T result = caseAPP4MCTracemodel(app4MCTracemodel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TracemetamodelPackage.RELATED_TO: {
				RelatedTo relatedTo = (RelatedTo)theEObject;
				T result = caseRelatedTo(relatedTo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TracemetamodelPackage.REALIZED_BY: {
				Realized_by realized_by = (Realized_by)theEObject;
				T result = caseRealized_by(realized_by);
				if (result == null) result = caseRelatedTo(realized_by);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TracemetamodelPackage.EXCECUTED_BY: {
				Excecuted_by excecuted_by = (Excecuted_by)theEObject;
				T result = caseExcecuted_by(excecuted_by);
				if (result == null) result = caseRelatedTo(excecuted_by);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TracemetamodelPackage.PREVENTED_BY: {
				Prevented_by prevented_by = (Prevented_by)theEObject;
				T result = casePrevented_by(prevented_by);
				if (result == null) result = caseRelatedTo(prevented_by);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TracemetamodelPackage.FORMALIZED_BY: {
				Formalized_by formalized_by = (Formalized_by)theEObject;
				T result = caseFormalized_by(formalized_by);
				if (result == null) result = caseRelatedTo(formalized_by);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TracemetamodelPackage.IMPLEMENTED_BY: {
				Implemented_by implemented_by = (Implemented_by)theEObject;
				T result = caseImplemented_by(implemented_by);
				if (result == null) result = caseRelatedTo(implemented_by);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>APP4MC Tracemodel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>APP4MC Tracemodel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAPP4MCTracemodel(APP4MCTracemodel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Related To</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Related To</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelatedTo(RelatedTo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Realized by</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Realized by</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRealized_by(Realized_by object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Excecuted by</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Excecuted by</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExcecuted_by(Excecuted_by object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prevented by</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prevented by</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrevented_by(Prevented_by object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Formalized by</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Formalized by</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormalized_by(Formalized_by object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implemented by</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implemented by</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplemented_by(Implemented_by object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //TracemetamodelSwitch

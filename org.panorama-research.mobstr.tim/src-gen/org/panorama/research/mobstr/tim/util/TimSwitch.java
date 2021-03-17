/**
 */
package org.panorama.research.mobstr.tim.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.panorama.research.mobstr.tim.*;

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
 * @see org.panorama.research.mobstr.tim.TimPackage
 * @generated
 */
public class TimSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TimPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimSwitch() {
		if (modelPackage == null) {
			modelPackage = TimPackage.eINSTANCE;
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
			case TimPackage.MOBSTR_TIM: {
				MobstrTIM mobstrTIM = (MobstrTIM)theEObject;
				T result = caseMobstrTIM(mobstrTIM);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimPackage.ABSTRACT_TRACE_LINK: {
				AbstractTraceLink abstractTraceLink = (AbstractTraceLink)theEObject;
				T result = caseAbstractTraceLink(abstractTraceLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimPackage.RELATED_TO: {
				RelatedTo relatedTo = (RelatedTo)theEObject;
				T result = caseRelatedTo(relatedTo);
				if (result == null) result = caseAbstractTraceLink(relatedTo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimPackage.DIRECTED_TRACE_LINK: {
				DirectedTraceLink directedTraceLink = (DirectedTraceLink)theEObject;
				T result = caseDirectedTraceLink(directedTraceLink);
				if (result == null) result = caseAbstractTraceLink(directedTraceLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimPackage.BASED_ON_ASSUMPTION: {
				BasedOnAssumption basedOnAssumption = (BasedOnAssumption)theEObject;
				T result = caseBasedOnAssumption(basedOnAssumption);
				if (result == null) result = caseDirectedTraceLink(basedOnAssumption);
				if (result == null) result = caseAbstractTraceLink(basedOnAssumption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimPackage.DERIVED_FROM_ITEM_DEFINITION: {
				DerivedFromItemDefinition derivedFromItemDefinition = (DerivedFromItemDefinition)theEObject;
				T result = caseDerivedFromItemDefinition(derivedFromItemDefinition);
				if (result == null) result = caseDirectedTraceLink(derivedFromItemDefinition);
				if (result == null) result = caseAbstractTraceLink(derivedFromItemDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimPackage.SPECIFIED_BY_REQUIREMENT: {
				SpecifiedByRequirement specifiedByRequirement = (SpecifiedByRequirement)theEObject;
				T result = caseSpecifiedByRequirement(specifiedByRequirement);
				if (result == null) result = caseDirectedTraceLink(specifiedByRequirement);
				if (result == null) result = caseAbstractTraceLink(specifiedByRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimPackage.ADDRESSED_BY_SAFETY_GOAL: {
				AddressedBySafetyGoal addressedBySafetyGoal = (AddressedBySafetyGoal)theEObject;
				T result = caseAddressedBySafetyGoal(addressedBySafetyGoal);
				if (result == null) result = caseDirectedTraceLink(addressedBySafetyGoal);
				if (result == null) result = caseAbstractTraceLink(addressedBySafetyGoal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimPackage.LEADS_TO_HAZARD: {
				LeadsToHazard leadsToHazard = (LeadsToHazard)theEObject;
				T result = caseLeadsToHazard(leadsToHazard);
				if (result == null) result = caseDirectedTraceLink(leadsToHazard);
				if (result == null) result = caseAbstractTraceLink(leadsToHazard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimPackage.EFFECTS_COMPONENT: {
				EffectsComponent effectsComponent = (EffectsComponent)theEObject;
				T result = caseEffectsComponent(effectsComponent);
				if (result == null) result = caseDirectedTraceLink(effectsComponent);
				if (result == null) result = caseAbstractTraceLink(effectsComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimPackage.HAS_FAILURE_MODE: {
				HasFailureMode hasFailureMode = (HasFailureMode)theEObject;
				T result = caseHasFailureMode(hasFailureMode);
				if (result == null) result = caseDirectedTraceLink(hasFailureMode);
				if (result == null) result = caseAbstractTraceLink(hasFailureMode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimPackage.IMPLEMENTS_COMPONENT: {
				ImplementsComponent implementsComponent = (ImplementsComponent)theEObject;
				T result = caseImplementsComponent(implementsComponent);
				if (result == null) result = caseDirectedTraceLink(implementsComponent);
				if (result == null) result = caseAbstractTraceLink(implementsComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimPackage.REALIZES_ITEM_DEFINTION: {
				RealizesItemDefintion realizesItemDefintion = (RealizesItemDefintion)theEObject;
				T result = caseRealizesItemDefintion(realizesItemDefintion);
				if (result == null) result = caseDirectedTraceLink(realizesItemDefintion);
				if (result == null) result = caseAbstractTraceLink(realizesItemDefintion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimPackage.REFINES_ITEM_DEFINITION: {
				RefinesItemDefinition refinesItemDefinition = (RefinesItemDefinition)theEObject;
				T result = caseRefinesItemDefinition(refinesItemDefinition);
				if (result == null) result = caseDirectedTraceLink(refinesItemDefinition);
				if (result == null) result = caseAbstractTraceLink(refinesItemDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimPackage.MODELS_IMPLEMENTATION_OF_REQUIREMENT: {
				ModelsImplementationOfRequirement modelsImplementationOfRequirement = (ModelsImplementationOfRequirement)theEObject;
				T result = caseModelsImplementationOfRequirement(modelsImplementationOfRequirement);
				if (result == null) result = caseDirectedTraceLink(modelsImplementationOfRequirement);
				if (result == null) result = caseAbstractTraceLink(modelsImplementationOfRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimPackage.REFINES_TIMING_REQUIREMENT: {
				RefinesTimingRequirement refinesTimingRequirement = (RefinesTimingRequirement)theEObject;
				T result = caseRefinesTimingRequirement(refinesTimingRequirement);
				if (result == null) result = caseDirectedTraceLink(refinesTimingRequirement);
				if (result == null) result = caseAbstractTraceLink(refinesTimingRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimPackage.EXPRESSES_AS_CLAIM: {
				ExpressesAsClaim expressesAsClaim = (ExpressesAsClaim)theEObject;
				T result = caseExpressesAsClaim(expressesAsClaim);
				if (result == null) result = caseDirectedTraceLink(expressesAsClaim);
				if (result == null) result = caseAbstractTraceLink(expressesAsClaim);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimPackage.EXPRESSES_AS_GOAL: {
				ExpressesAsGoal expressesAsGoal = (ExpressesAsGoal)theEObject;
				T result = caseExpressesAsGoal(expressesAsGoal);
				if (result == null) result = caseDirectedTraceLink(expressesAsGoal);
				if (result == null) result = caseAbstractTraceLink(expressesAsGoal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimPackage.USES_AS_EVIDENCE: {
				UsesAsEvidence usesAsEvidence = (UsesAsEvidence)theEObject;
				T result = caseUsesAsEvidence(usesAsEvidence);
				if (result == null) result = caseDirectedTraceLink(usesAsEvidence);
				if (result == null) result = caseAbstractTraceLink(usesAsEvidence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimPackage.REFERENCES_COMPONENT: {
				ReferencesComponent referencesComponent = (ReferencesComponent)theEObject;
				T result = caseReferencesComponent(referencesComponent);
				if (result == null) result = caseDirectedTraceLink(referencesComponent);
				if (result == null) result = caseAbstractTraceLink(referencesComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimPackage.ADDRESSED_BY_FMEA: {
				AddressedByFMEA addressedByFMEA = (AddressedByFMEA)theEObject;
				T result = caseAddressedByFMEA(addressedByFMEA);
				if (result == null) result = caseDirectedTraceLink(addressedByFMEA);
				if (result == null) result = caseAbstractTraceLink(addressedByFMEA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimPackage.REFERENCES_IN_EVIDENCES: {
				ReferencesInEvidences referencesInEvidences = (ReferencesInEvidences)theEObject;
				T result = caseReferencesInEvidences(referencesInEvidences);
				if (result == null) result = caseDirectedTraceLink(referencesInEvidences);
				if (result == null) result = caseAbstractTraceLink(referencesInEvidences);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimPackage.DETAILS_CAUSES_OF: {
				DetailsCausesOf detailsCausesOf = (DetailsCausesOf)theEObject;
				T result = caseDetailsCausesOf(detailsCausesOf);
				if (result == null) result = caseDirectedTraceLink(detailsCausesOf);
				if (result == null) result = caseAbstractTraceLink(detailsCausesOf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimPackage.DETAILS_HAZARD_WITH: {
				DetailsHazardWith detailsHazardWith = (DetailsHazardWith)theEObject;
				T result = caseDetailsHazardWith(detailsHazardWith);
				if (result == null) result = caseDirectedTraceLink(detailsHazardWith);
				if (result == null) result = caseAbstractTraceLink(detailsHazardWith);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mobstr TIM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mobstr TIM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobstrTIM(MobstrTIM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Trace Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Trace Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractTraceLink(AbstractTraceLink object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Directed Trace Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Directed Trace Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDirectedTraceLink(DirectedTraceLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Based On Assumption</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Based On Assumption</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasedOnAssumption(BasedOnAssumption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Derived From Item Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Derived From Item Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDerivedFromItemDefinition(DerivedFromItemDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specified By Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specified By Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecifiedByRequirement(SpecifiedByRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Addressed By Safety Goal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Addressed By Safety Goal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddressedBySafetyGoal(AddressedBySafetyGoal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Leads To Hazard</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Leads To Hazard</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLeadsToHazard(LeadsToHazard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Effects Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Effects Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEffectsComponent(EffectsComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Has Failure Mode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Has Failure Mode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHasFailureMode(HasFailureMode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implements Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implements Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplementsComponent(ImplementsComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Realizes Item Defintion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Realizes Item Defintion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRealizesItemDefintion(RealizesItemDefintion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Refines Item Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Refines Item Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRefinesItemDefinition(RefinesItemDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Models Implementation Of Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Models Implementation Of Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelsImplementationOfRequirement(ModelsImplementationOfRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Refines Timing Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Refines Timing Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRefinesTimingRequirement(RefinesTimingRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expresses As Claim</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expresses As Claim</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpressesAsClaim(ExpressesAsClaim object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expresses As Goal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expresses As Goal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpressesAsGoal(ExpressesAsGoal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uses As Evidence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uses As Evidence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUsesAsEvidence(UsesAsEvidence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>References Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>References Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferencesComponent(ReferencesComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Addressed By FMEA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Addressed By FMEA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddressedByFMEA(AddressedByFMEA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>References In Evidences</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>References In Evidences</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferencesInEvidences(ReferencesInEvidences object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Details Causes Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Details Causes Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDetailsCausesOf(DetailsCausesOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Details Hazard With</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Details Hazard With</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDetailsHazardWith(DetailsHazardWith object) {
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

} //TimSwitch

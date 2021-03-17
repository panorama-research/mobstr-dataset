/**
 */
package org.panorama.research.mobstr.tim.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.panorama.research.mobstr.tim.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.panorama.research.mobstr.tim.TimPackage
 * @generated
 */
public class TimAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TimPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TimPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimSwitch<Adapter> modelSwitch =
		new TimSwitch<Adapter>() {
			@Override
			public Adapter caseMobstrTIM(MobstrTIM object) {
				return createMobstrTIMAdapter();
			}
			@Override
			public Adapter caseAbstractTraceLink(AbstractTraceLink object) {
				return createAbstractTraceLinkAdapter();
			}
			@Override
			public Adapter caseRelatedTo(RelatedTo object) {
				return createRelatedToAdapter();
			}
			@Override
			public Adapter caseDirectedTraceLink(DirectedTraceLink object) {
				return createDirectedTraceLinkAdapter();
			}
			@Override
			public Adapter caseBasedOnAssumption(BasedOnAssumption object) {
				return createBasedOnAssumptionAdapter();
			}
			@Override
			public Adapter caseDerivedFromItemDefinition(DerivedFromItemDefinition object) {
				return createDerivedFromItemDefinitionAdapter();
			}
			@Override
			public Adapter caseSpecifiedByRequirement(SpecifiedByRequirement object) {
				return createSpecifiedByRequirementAdapter();
			}
			@Override
			public Adapter caseAddressedBySafetyGoal(AddressedBySafetyGoal object) {
				return createAddressedBySafetyGoalAdapter();
			}
			@Override
			public Adapter caseLeadsToHazard(LeadsToHazard object) {
				return createLeadsToHazardAdapter();
			}
			@Override
			public Adapter caseEffectsComponent(EffectsComponent object) {
				return createEffectsComponentAdapter();
			}
			@Override
			public Adapter caseHasFailureMode(HasFailureMode object) {
				return createHasFailureModeAdapter();
			}
			@Override
			public Adapter caseImplementsComponent(ImplementsComponent object) {
				return createImplementsComponentAdapter();
			}
			@Override
			public Adapter caseRealizesItemDefintion(RealizesItemDefintion object) {
				return createRealizesItemDefintionAdapter();
			}
			@Override
			public Adapter caseRefinesItemDefinition(RefinesItemDefinition object) {
				return createRefinesItemDefinitionAdapter();
			}
			@Override
			public Adapter caseModelsImplementationOfRequirement(ModelsImplementationOfRequirement object) {
				return createModelsImplementationOfRequirementAdapter();
			}
			@Override
			public Adapter caseRefinesTimingRequirement(RefinesTimingRequirement object) {
				return createRefinesTimingRequirementAdapter();
			}
			@Override
			public Adapter caseExpressesAsClaim(ExpressesAsClaim object) {
				return createExpressesAsClaimAdapter();
			}
			@Override
			public Adapter caseExpressesAsGoal(ExpressesAsGoal object) {
				return createExpressesAsGoalAdapter();
			}
			@Override
			public Adapter caseUsesAsEvidence(UsesAsEvidence object) {
				return createUsesAsEvidenceAdapter();
			}
			@Override
			public Adapter caseReferencesComponent(ReferencesComponent object) {
				return createReferencesComponentAdapter();
			}
			@Override
			public Adapter caseAddressedByFMEA(AddressedByFMEA object) {
				return createAddressedByFMEAAdapter();
			}
			@Override
			public Adapter caseReferencesInEvidences(ReferencesInEvidences object) {
				return createReferencesInEvidencesAdapter();
			}
			@Override
			public Adapter caseDetailsCausesOf(DetailsCausesOf object) {
				return createDetailsCausesOfAdapter();
			}
			@Override
			public Adapter caseDetailsHazardWith(DetailsHazardWith object) {
				return createDetailsHazardWithAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.panorama.research.mobstr.tim.MobstrTIM <em>Mobstr TIM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.panorama.research.mobstr.tim.MobstrTIM
	 * @generated
	 */
	public Adapter createMobstrTIMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.panorama.research.mobstr.tim.AbstractTraceLink <em>Abstract Trace Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.panorama.research.mobstr.tim.AbstractTraceLink
	 * @generated
	 */
	public Adapter createAbstractTraceLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.panorama.research.mobstr.tim.RelatedTo <em>Related To</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.panorama.research.mobstr.tim.RelatedTo
	 * @generated
	 */
	public Adapter createRelatedToAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.panorama.research.mobstr.tim.DirectedTraceLink <em>Directed Trace Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.panorama.research.mobstr.tim.DirectedTraceLink
	 * @generated
	 */
	public Adapter createDirectedTraceLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.panorama.research.mobstr.tim.BasedOnAssumption <em>Based On Assumption</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.panorama.research.mobstr.tim.BasedOnAssumption
	 * @generated
	 */
	public Adapter createBasedOnAssumptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.panorama.research.mobstr.tim.DerivedFromItemDefinition <em>Derived From Item Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.panorama.research.mobstr.tim.DerivedFromItemDefinition
	 * @generated
	 */
	public Adapter createDerivedFromItemDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.panorama.research.mobstr.tim.SpecifiedByRequirement <em>Specified By Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.panorama.research.mobstr.tim.SpecifiedByRequirement
	 * @generated
	 */
	public Adapter createSpecifiedByRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.panorama.research.mobstr.tim.AddressedBySafetyGoal <em>Addressed By Safety Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.panorama.research.mobstr.tim.AddressedBySafetyGoal
	 * @generated
	 */
	public Adapter createAddressedBySafetyGoalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.panorama.research.mobstr.tim.LeadsToHazard <em>Leads To Hazard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.panorama.research.mobstr.tim.LeadsToHazard
	 * @generated
	 */
	public Adapter createLeadsToHazardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.panorama.research.mobstr.tim.EffectsComponent <em>Effects Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.panorama.research.mobstr.tim.EffectsComponent
	 * @generated
	 */
	public Adapter createEffectsComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.panorama.research.mobstr.tim.HasFailureMode <em>Has Failure Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.panorama.research.mobstr.tim.HasFailureMode
	 * @generated
	 */
	public Adapter createHasFailureModeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.panorama.research.mobstr.tim.ImplementsComponent <em>Implements Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.panorama.research.mobstr.tim.ImplementsComponent
	 * @generated
	 */
	public Adapter createImplementsComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.panorama.research.mobstr.tim.RealizesItemDefintion <em>Realizes Item Defintion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.panorama.research.mobstr.tim.RealizesItemDefintion
	 * @generated
	 */
	public Adapter createRealizesItemDefintionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.panorama.research.mobstr.tim.RefinesItemDefinition <em>Refines Item Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.panorama.research.mobstr.tim.RefinesItemDefinition
	 * @generated
	 */
	public Adapter createRefinesItemDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.panorama.research.mobstr.tim.ModelsImplementationOfRequirement <em>Models Implementation Of Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.panorama.research.mobstr.tim.ModelsImplementationOfRequirement
	 * @generated
	 */
	public Adapter createModelsImplementationOfRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.panorama.research.mobstr.tim.RefinesTimingRequirement <em>Refines Timing Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.panorama.research.mobstr.tim.RefinesTimingRequirement
	 * @generated
	 */
	public Adapter createRefinesTimingRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.panorama.research.mobstr.tim.ExpressesAsClaim <em>Expresses As Claim</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.panorama.research.mobstr.tim.ExpressesAsClaim
	 * @generated
	 */
	public Adapter createExpressesAsClaimAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.panorama.research.mobstr.tim.ExpressesAsGoal <em>Expresses As Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.panorama.research.mobstr.tim.ExpressesAsGoal
	 * @generated
	 */
	public Adapter createExpressesAsGoalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.panorama.research.mobstr.tim.UsesAsEvidence <em>Uses As Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.panorama.research.mobstr.tim.UsesAsEvidence
	 * @generated
	 */
	public Adapter createUsesAsEvidenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.panorama.research.mobstr.tim.ReferencesComponent <em>References Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.panorama.research.mobstr.tim.ReferencesComponent
	 * @generated
	 */
	public Adapter createReferencesComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.panorama.research.mobstr.tim.AddressedByFMEA <em>Addressed By FMEA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.panorama.research.mobstr.tim.AddressedByFMEA
	 * @generated
	 */
	public Adapter createAddressedByFMEAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.panorama.research.mobstr.tim.ReferencesInEvidences <em>References In Evidences</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.panorama.research.mobstr.tim.ReferencesInEvidences
	 * @generated
	 */
	public Adapter createReferencesInEvidencesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.panorama.research.mobstr.tim.DetailsCausesOf <em>Details Causes Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.panorama.research.mobstr.tim.DetailsCausesOf
	 * @generated
	 */
	public Adapter createDetailsCausesOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.panorama.research.mobstr.tim.DetailsHazardWith <em>Details Hazard With</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.panorama.research.mobstr.tim.DetailsHazardWith
	 * @generated
	 */
	public Adapter createDetailsHazardWithAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //TimAdapterFactory

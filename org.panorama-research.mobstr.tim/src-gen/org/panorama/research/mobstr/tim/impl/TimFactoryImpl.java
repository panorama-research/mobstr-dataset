/**
 */
package org.panorama.research.mobstr.tim.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.panorama.research.mobstr.tim.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TimFactoryImpl extends EFactoryImpl implements TimFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TimFactory init() {
		try {
			TimFactory theTimFactory = (TimFactory)EPackage.Registry.INSTANCE.getEFactory(TimPackage.eNS_URI);
			if (theTimFactory != null) {
				return theTimFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TimFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TimPackage.MOBSTR_TIM: return createMobstrTIM();
			case TimPackage.RELATED_TO: return createRelatedTo();
			case TimPackage.BASED_ON_ASSUMPTION: return createBasedOnAssumption();
			case TimPackage.DERIVED_FROM_ITEM_DEFINITION: return createDerivedFromItemDefinition();
			case TimPackage.SPECIFIED_BY_REQUIREMENT: return createSpecifiedByRequirement();
			case TimPackage.ADDRESSED_BY_SAFETY_GOAL: return createAddressedBySafetyGoal();
			case TimPackage.LEADS_TO_HAZARD: return createLeadsToHazard();
			case TimPackage.EFFECTS_COMPONENT: return createEffectsComponent();
			case TimPackage.HAS_FAILURE_MODE: return createHasFailureMode();
			case TimPackage.IMPLEMENTS_COMPONENT: return createImplementsComponent();
			case TimPackage.REALIZES_ITEM_DEFINTION: return createRealizesItemDefintion();
			case TimPackage.REFINES_ITEM_DEFINITION: return createRefinesItemDefinition();
			case TimPackage.MODELS_IMPLEMENTATION_OF_REQUIREMENT: return createModelsImplementationOfRequirement();
			case TimPackage.REFINES_TIMING_REQUIREMENT: return createRefinesTimingRequirement();
			case TimPackage.EXPRESSES_AS_CLAIM: return createExpressesAsClaim();
			case TimPackage.EXPRESSES_AS_GOAL: return createExpressesAsGoal();
			case TimPackage.USES_AS_EVIDENCE: return createUsesAsEvidence();
			case TimPackage.REFERENCES_COMPONENT: return createReferencesComponent();
			case TimPackage.ADDRESSED_BY_FMEA: return createAddressedByFMEA();
			case TimPackage.REFERENCES_IN_EVIDENCES: return createReferencesInEvidences();
			case TimPackage.DETAILS_CAUSES_OF: return createDetailsCausesOf();
			case TimPackage.DETAILS_HAZARD_WITH: return createDetailsHazardWith();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MobstrTIM createMobstrTIM() {
		MobstrTIMImpl mobstrTIM = new MobstrTIMImpl();
		return mobstrTIM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelatedTo createRelatedTo() {
		RelatedToImpl relatedTo = new RelatedToImpl();
		return relatedTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BasedOnAssumption createBasedOnAssumption() {
		BasedOnAssumptionImpl basedOnAssumption = new BasedOnAssumptionImpl();
		return basedOnAssumption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DerivedFromItemDefinition createDerivedFromItemDefinition() {
		DerivedFromItemDefinitionImpl derivedFromItemDefinition = new DerivedFromItemDefinitionImpl();
		return derivedFromItemDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpecifiedByRequirement createSpecifiedByRequirement() {
		SpecifiedByRequirementImpl specifiedByRequirement = new SpecifiedByRequirementImpl();
		return specifiedByRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AddressedBySafetyGoal createAddressedBySafetyGoal() {
		AddressedBySafetyGoalImpl addressedBySafetyGoal = new AddressedBySafetyGoalImpl();
		return addressedBySafetyGoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LeadsToHazard createLeadsToHazard() {
		LeadsToHazardImpl leadsToHazard = new LeadsToHazardImpl();
		return leadsToHazard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EffectsComponent createEffectsComponent() {
		EffectsComponentImpl effectsComponent = new EffectsComponentImpl();
		return effectsComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HasFailureMode createHasFailureMode() {
		HasFailureModeImpl hasFailureMode = new HasFailureModeImpl();
		return hasFailureMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImplementsComponent createImplementsComponent() {
		ImplementsComponentImpl implementsComponent = new ImplementsComponentImpl();
		return implementsComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RealizesItemDefintion createRealizesItemDefintion() {
		RealizesItemDefintionImpl realizesItemDefintion = new RealizesItemDefintionImpl();
		return realizesItemDefintion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefinesItemDefinition createRefinesItemDefinition() {
		RefinesItemDefinitionImpl refinesItemDefinition = new RefinesItemDefinitionImpl();
		return refinesItemDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModelsImplementationOfRequirement createModelsImplementationOfRequirement() {
		ModelsImplementationOfRequirementImpl modelsImplementationOfRequirement = new ModelsImplementationOfRequirementImpl();
		return modelsImplementationOfRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefinesTimingRequirement createRefinesTimingRequirement() {
		RefinesTimingRequirementImpl refinesTimingRequirement = new RefinesTimingRequirementImpl();
		return refinesTimingRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExpressesAsClaim createExpressesAsClaim() {
		ExpressesAsClaimImpl expressesAsClaim = new ExpressesAsClaimImpl();
		return expressesAsClaim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExpressesAsGoal createExpressesAsGoal() {
		ExpressesAsGoalImpl expressesAsGoal = new ExpressesAsGoalImpl();
		return expressesAsGoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UsesAsEvidence createUsesAsEvidence() {
		UsesAsEvidenceImpl usesAsEvidence = new UsesAsEvidenceImpl();
		return usesAsEvidence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReferencesComponent createReferencesComponent() {
		ReferencesComponentImpl referencesComponent = new ReferencesComponentImpl();
		return referencesComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AddressedByFMEA createAddressedByFMEA() {
		AddressedByFMEAImpl addressedByFMEA = new AddressedByFMEAImpl();
		return addressedByFMEA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReferencesInEvidences createReferencesInEvidences() {
		ReferencesInEvidencesImpl referencesInEvidences = new ReferencesInEvidencesImpl();
		return referencesInEvidences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DetailsCausesOf createDetailsCausesOf() {
		DetailsCausesOfImpl detailsCausesOf = new DetailsCausesOfImpl();
		return detailsCausesOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DetailsHazardWith createDetailsHazardWith() {
		DetailsHazardWithImpl detailsHazardWith = new DetailsHazardWithImpl();
		return detailsHazardWith;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimPackage getTimPackage() {
		return (TimPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TimPackage getPackage() {
		return TimPackage.eINSTANCE;
	}

} //TimFactoryImpl

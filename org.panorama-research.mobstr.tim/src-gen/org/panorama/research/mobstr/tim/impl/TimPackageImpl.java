/**
 */
package org.panorama.research.mobstr.tim.impl;

import ode.argumentation.ArgumentationPackage;

import ode.artifact.Artifact_Package;

import ode.assuranceCase.AssuranceCase_Package;

import ode.base.BasePackage;

import ode.dependability.Dependability_Package;

import ode.failureLogic.FailureLogic_Package;

import ode.integration.IntegrationPackage;

import ode.odeBase.OdeBasePackage;

import ode.terminology.Terminology_Package;

import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.uml.UMLPackage;

import org.panorama.research.mobstr.tim.AbstractTraceLink;
import org.panorama.research.mobstr.tim.AddressedByFMEA;
import org.panorama.research.mobstr.tim.AddressedBySafetyGoal;
import org.panorama.research.mobstr.tim.BasedOnAssumption;
import org.panorama.research.mobstr.tim.DerivedFromItemDefinition;
import org.panorama.research.mobstr.tim.DetailsCausesOf;
import org.panorama.research.mobstr.tim.DetailsHazardWith;
import org.panorama.research.mobstr.tim.DirectedTraceLink;
import org.panorama.research.mobstr.tim.EffectsComponent;
import org.panorama.research.mobstr.tim.ExpressesAsClaim;
import org.panorama.research.mobstr.tim.ExpressesAsGoal;
import org.panorama.research.mobstr.tim.HasFailureMode;
import org.panorama.research.mobstr.tim.ImplementsComponent;
import org.panorama.research.mobstr.tim.LeadsToHazard;
import org.panorama.research.mobstr.tim.MobstrTIM;
import org.panorama.research.mobstr.tim.ModelsImplementationOfRequirement;
import org.panorama.research.mobstr.tim.RealizesItemDefintion;
import org.panorama.research.mobstr.tim.ReferencesComponent;
import org.panorama.research.mobstr.tim.ReferencesInEvidences;
import org.panorama.research.mobstr.tim.RefinesItemDefinition;
import org.panorama.research.mobstr.tim.RefinesTimingRequirement;
import org.panorama.research.mobstr.tim.RelatedTo;
import org.panorama.research.mobstr.tim.SpecifiedByRequirement;
import org.panorama.research.mobstr.tim.TimFactory;
import org.panorama.research.mobstr.tim.TimPackage;
import org.panorama.research.mobstr.tim.UsesAsEvidence;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TimPackageImpl extends EPackageImpl implements TimPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mobstrTIMEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractTraceLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relatedToEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass directedTraceLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basedOnAssumptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass derivedFromItemDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specifiedByRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addressedBySafetyGoalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass leadsToHazardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass effectsComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hasFailureModeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implementsComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass realizesItemDefintionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refinesItemDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelsImplementationOfRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refinesTimingRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressesAsClaimEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressesAsGoalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass usesAsEvidenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referencesComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addressedByFMEAEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referencesInEvidencesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass detailsCausesOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass detailsHazardWithEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.panorama.research.mobstr.tim.TimPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TimPackageImpl() {
		super(eNS_URI, TimFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link TimPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TimPackage init() {
		if (isInited) return (TimPackage)EPackage.Registry.INSTANCE.getEPackage(TimPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTimPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TimPackageImpl theTimPackage = registeredTimPackage instanceof TimPackageImpl ? (TimPackageImpl)registeredTimPackage : new TimPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		Dependability_Package.eINSTANCE.eClass();
		FailureLogic_Package.eINSTANCE.eClass();
		BasePackage.eINSTANCE.eClass();
		UMLPackage.eINSTANCE.eClass();
		AmaltheaPackage.eINSTANCE.eClass();
		OdeBasePackage.eINSTANCE.eClass();
		IntegrationPackage.eINSTANCE.eClass();
		TypesPackage.eINSTANCE.eClass();
		AssuranceCase_Package.eINSTANCE.eClass();
		Artifact_Package.eINSTANCE.eClass();
		ArgumentationPackage.eINSTANCE.eClass();
		Terminology_Package.eINSTANCE.eClass();

		// Create package meta-data objects
		theTimPackage.createPackageContents();

		// Initialize created meta-data
		theTimPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTimPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TimPackage.eNS_URI, theTimPackage);
		return theTimPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMobstrTIM() {
		return mobstrTIMEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMobstrTIM_Traces() {
		return (EReference)mobstrTIMEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractTraceLink() {
		return abstractTraceLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstractTraceLink_ID() {
		return (EAttribute)abstractTraceLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstractTraceLink_Name() {
		return (EAttribute)abstractTraceLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRelatedTo() {
		return relatedToEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelatedTo_Items() {
		return (EReference)relatedToEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDirectedTraceLink() {
		return directedTraceLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBasedOnAssumption() {
		return basedOnAssumptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBasedOnAssumption_Source() {
		return (EReference)basedOnAssumptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBasedOnAssumption_Target() {
		return (EReference)basedOnAssumptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDerivedFromItemDefinition() {
		return derivedFromItemDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDerivedFromItemDefinition_Source() {
		return (EReference)derivedFromItemDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDerivedFromItemDefinition_Target() {
		return (EReference)derivedFromItemDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpecifiedByRequirement() {
		return specifiedByRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSpecifiedByRequirement_Source() {
		return (EReference)specifiedByRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSpecifiedByRequirement_Target() {
		return (EReference)specifiedByRequirementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAddressedBySafetyGoal() {
		return addressedBySafetyGoalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAddressedBySafetyGoal_Source() {
		return (EReference)addressedBySafetyGoalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAddressedBySafetyGoal_Target() {
		return (EReference)addressedBySafetyGoalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLeadsToHazard() {
		return leadsToHazardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLeadsToHazard_Source() {
		return (EReference)leadsToHazardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLeadsToHazard_Target() {
		return (EReference)leadsToHazardEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEffectsComponent() {
		return effectsComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEffectsComponent_Source() {
		return (EReference)effectsComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEffectsComponent_Target() {
		return (EReference)effectsComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHasFailureMode() {
		return hasFailureModeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHasFailureMode_Source() {
		return (EReference)hasFailureModeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHasFailureMode_Target() {
		return (EReference)hasFailureModeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImplementsComponent() {
		return implementsComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getImplementsComponent_Source() {
		return (EReference)implementsComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getImplementsComponent_Target() {
		return (EReference)implementsComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRealizesItemDefintion() {
		return realizesItemDefintionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRealizesItemDefintion_Source() {
		return (EReference)realizesItemDefintionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRealizesItemDefintion_Target() {
		return (EReference)realizesItemDefintionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefinesItemDefinition() {
		return refinesItemDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRefinesItemDefinition_Source() {
		return (EReference)refinesItemDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRefinesItemDefinition_Target() {
		return (EReference)refinesItemDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModelsImplementationOfRequirement() {
		return modelsImplementationOfRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModelsImplementationOfRequirement_Source() {
		return (EReference)modelsImplementationOfRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModelsImplementationOfRequirement_Target() {
		return (EReference)modelsImplementationOfRequirementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefinesTimingRequirement() {
		return refinesTimingRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRefinesTimingRequirement_Source() {
		return (EReference)refinesTimingRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRefinesTimingRequirement_Target() {
		return (EReference)refinesTimingRequirementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExpressesAsClaim() {
		return expressesAsClaimEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExpressesAsClaim_Source() {
		return (EReference)expressesAsClaimEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExpressesAsClaim_Target() {
		return (EReference)expressesAsClaimEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExpressesAsGoal() {
		return expressesAsGoalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExpressesAsGoal_Source() {
		return (EReference)expressesAsGoalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExpressesAsGoal_Target() {
		return (EReference)expressesAsGoalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUsesAsEvidence() {
		return usesAsEvidenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUsesAsEvidence_Source() {
		return (EReference)usesAsEvidenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUsesAsEvidence_Target() {
		return (EReference)usesAsEvidenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReferencesComponent() {
		return referencesComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReferencesComponent_Source() {
		return (EReference)referencesComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReferencesComponent_Target() {
		return (EReference)referencesComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAddressedByFMEA() {
		return addressedByFMEAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAddressedByFMEA_Source() {
		return (EReference)addressedByFMEAEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAddressedByFMEA_Target() {
		return (EReference)addressedByFMEAEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReferencesInEvidences() {
		return referencesInEvidencesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReferencesInEvidences_Source() {
		return (EReference)referencesInEvidencesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReferencesInEvidences_Target() {
		return (EReference)referencesInEvidencesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDetailsCausesOf() {
		return detailsCausesOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDetailsCausesOf_Source() {
		return (EReference)detailsCausesOfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDetailsCausesOf_Target() {
		return (EReference)detailsCausesOfEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDetailsHazardWith() {
		return detailsHazardWithEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDetailsHazardWith_Source() {
		return (EReference)detailsHazardWithEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDetailsHazardWith_Target() {
		return (EReference)detailsHazardWithEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimFactory getTimFactory() {
		return (TimFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		mobstrTIMEClass = createEClass(MOBSTR_TIM);
		createEReference(mobstrTIMEClass, MOBSTR_TIM__TRACES);

		abstractTraceLinkEClass = createEClass(ABSTRACT_TRACE_LINK);
		createEAttribute(abstractTraceLinkEClass, ABSTRACT_TRACE_LINK__ID);
		createEAttribute(abstractTraceLinkEClass, ABSTRACT_TRACE_LINK__NAME);

		relatedToEClass = createEClass(RELATED_TO);
		createEReference(relatedToEClass, RELATED_TO__ITEMS);

		directedTraceLinkEClass = createEClass(DIRECTED_TRACE_LINK);

		basedOnAssumptionEClass = createEClass(BASED_ON_ASSUMPTION);
		createEReference(basedOnAssumptionEClass, BASED_ON_ASSUMPTION__SOURCE);
		createEReference(basedOnAssumptionEClass, BASED_ON_ASSUMPTION__TARGET);

		derivedFromItemDefinitionEClass = createEClass(DERIVED_FROM_ITEM_DEFINITION);
		createEReference(derivedFromItemDefinitionEClass, DERIVED_FROM_ITEM_DEFINITION__SOURCE);
		createEReference(derivedFromItemDefinitionEClass, DERIVED_FROM_ITEM_DEFINITION__TARGET);

		specifiedByRequirementEClass = createEClass(SPECIFIED_BY_REQUIREMENT);
		createEReference(specifiedByRequirementEClass, SPECIFIED_BY_REQUIREMENT__SOURCE);
		createEReference(specifiedByRequirementEClass, SPECIFIED_BY_REQUIREMENT__TARGET);

		addressedBySafetyGoalEClass = createEClass(ADDRESSED_BY_SAFETY_GOAL);
		createEReference(addressedBySafetyGoalEClass, ADDRESSED_BY_SAFETY_GOAL__SOURCE);
		createEReference(addressedBySafetyGoalEClass, ADDRESSED_BY_SAFETY_GOAL__TARGET);

		leadsToHazardEClass = createEClass(LEADS_TO_HAZARD);
		createEReference(leadsToHazardEClass, LEADS_TO_HAZARD__SOURCE);
		createEReference(leadsToHazardEClass, LEADS_TO_HAZARD__TARGET);

		effectsComponentEClass = createEClass(EFFECTS_COMPONENT);
		createEReference(effectsComponentEClass, EFFECTS_COMPONENT__SOURCE);
		createEReference(effectsComponentEClass, EFFECTS_COMPONENT__TARGET);

		hasFailureModeEClass = createEClass(HAS_FAILURE_MODE);
		createEReference(hasFailureModeEClass, HAS_FAILURE_MODE__SOURCE);
		createEReference(hasFailureModeEClass, HAS_FAILURE_MODE__TARGET);

		implementsComponentEClass = createEClass(IMPLEMENTS_COMPONENT);
		createEReference(implementsComponentEClass, IMPLEMENTS_COMPONENT__SOURCE);
		createEReference(implementsComponentEClass, IMPLEMENTS_COMPONENT__TARGET);

		realizesItemDefintionEClass = createEClass(REALIZES_ITEM_DEFINTION);
		createEReference(realizesItemDefintionEClass, REALIZES_ITEM_DEFINTION__SOURCE);
		createEReference(realizesItemDefintionEClass, REALIZES_ITEM_DEFINTION__TARGET);

		refinesItemDefinitionEClass = createEClass(REFINES_ITEM_DEFINITION);
		createEReference(refinesItemDefinitionEClass, REFINES_ITEM_DEFINITION__SOURCE);
		createEReference(refinesItemDefinitionEClass, REFINES_ITEM_DEFINITION__TARGET);

		modelsImplementationOfRequirementEClass = createEClass(MODELS_IMPLEMENTATION_OF_REQUIREMENT);
		createEReference(modelsImplementationOfRequirementEClass, MODELS_IMPLEMENTATION_OF_REQUIREMENT__SOURCE);
		createEReference(modelsImplementationOfRequirementEClass, MODELS_IMPLEMENTATION_OF_REQUIREMENT__TARGET);

		refinesTimingRequirementEClass = createEClass(REFINES_TIMING_REQUIREMENT);
		createEReference(refinesTimingRequirementEClass, REFINES_TIMING_REQUIREMENT__SOURCE);
		createEReference(refinesTimingRequirementEClass, REFINES_TIMING_REQUIREMENT__TARGET);

		expressesAsClaimEClass = createEClass(EXPRESSES_AS_CLAIM);
		createEReference(expressesAsClaimEClass, EXPRESSES_AS_CLAIM__SOURCE);
		createEReference(expressesAsClaimEClass, EXPRESSES_AS_CLAIM__TARGET);

		expressesAsGoalEClass = createEClass(EXPRESSES_AS_GOAL);
		createEReference(expressesAsGoalEClass, EXPRESSES_AS_GOAL__SOURCE);
		createEReference(expressesAsGoalEClass, EXPRESSES_AS_GOAL__TARGET);

		usesAsEvidenceEClass = createEClass(USES_AS_EVIDENCE);
		createEReference(usesAsEvidenceEClass, USES_AS_EVIDENCE__SOURCE);
		createEReference(usesAsEvidenceEClass, USES_AS_EVIDENCE__TARGET);

		referencesComponentEClass = createEClass(REFERENCES_COMPONENT);
		createEReference(referencesComponentEClass, REFERENCES_COMPONENT__SOURCE);
		createEReference(referencesComponentEClass, REFERENCES_COMPONENT__TARGET);

		addressedByFMEAEClass = createEClass(ADDRESSED_BY_FMEA);
		createEReference(addressedByFMEAEClass, ADDRESSED_BY_FMEA__SOURCE);
		createEReference(addressedByFMEAEClass, ADDRESSED_BY_FMEA__TARGET);

		referencesInEvidencesEClass = createEClass(REFERENCES_IN_EVIDENCES);
		createEReference(referencesInEvidencesEClass, REFERENCES_IN_EVIDENCES__SOURCE);
		createEReference(referencesInEvidencesEClass, REFERENCES_IN_EVIDENCES__TARGET);

		detailsCausesOfEClass = createEClass(DETAILS_CAUSES_OF);
		createEReference(detailsCausesOfEClass, DETAILS_CAUSES_OF__SOURCE);
		createEReference(detailsCausesOfEClass, DETAILS_CAUSES_OF__TARGET);

		detailsHazardWithEClass = createEClass(DETAILS_HAZARD_WITH);
		createEReference(detailsHazardWithEClass, DETAILS_HAZARD_WITH__SOURCE);
		createEReference(detailsHazardWithEClass, DETAILS_HAZARD_WITH__TARGET);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		Dependability_Package theDependability_Package = (Dependability_Package)EPackage.Registry.INSTANCE.getEPackage(Dependability_Package.eNS_URI);
		FailureLogic_Package theFailureLogic_Package = (FailureLogic_Package)EPackage.Registry.INSTANCE.getEPackage(FailureLogic_Package.eNS_URI);
		BasePackage theBasePackage = (BasePackage)EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI);
		UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);
		AmaltheaPackage theAmaltheaPackage = (AmaltheaPackage)EPackage.Registry.INSTANCE.getEPackage(AmaltheaPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		relatedToEClass.getESuperTypes().add(this.getAbstractTraceLink());
		directedTraceLinkEClass.getESuperTypes().add(this.getAbstractTraceLink());
		basedOnAssumptionEClass.getESuperTypes().add(this.getDirectedTraceLink());
		derivedFromItemDefinitionEClass.getESuperTypes().add(this.getDirectedTraceLink());
		specifiedByRequirementEClass.getESuperTypes().add(this.getDirectedTraceLink());
		addressedBySafetyGoalEClass.getESuperTypes().add(this.getDirectedTraceLink());
		leadsToHazardEClass.getESuperTypes().add(this.getDirectedTraceLink());
		effectsComponentEClass.getESuperTypes().add(this.getDirectedTraceLink());
		hasFailureModeEClass.getESuperTypes().add(this.getDirectedTraceLink());
		implementsComponentEClass.getESuperTypes().add(this.getDirectedTraceLink());
		realizesItemDefintionEClass.getESuperTypes().add(this.getDirectedTraceLink());
		refinesItemDefinitionEClass.getESuperTypes().add(this.getDirectedTraceLink());
		modelsImplementationOfRequirementEClass.getESuperTypes().add(this.getDirectedTraceLink());
		refinesTimingRequirementEClass.getESuperTypes().add(this.getDirectedTraceLink());
		expressesAsClaimEClass.getESuperTypes().add(this.getDirectedTraceLink());
		expressesAsGoalEClass.getESuperTypes().add(this.getDirectedTraceLink());
		usesAsEvidenceEClass.getESuperTypes().add(this.getDirectedTraceLink());
		referencesComponentEClass.getESuperTypes().add(this.getDirectedTraceLink());
		addressedByFMEAEClass.getESuperTypes().add(this.getDirectedTraceLink());
		referencesInEvidencesEClass.getESuperTypes().add(this.getDirectedTraceLink());
		detailsCausesOfEClass.getESuperTypes().add(this.getDirectedTraceLink());
		detailsHazardWithEClass.getESuperTypes().add(this.getDirectedTraceLink());

		// Initialize classes, features, and operations; add parameters
		initEClass(mobstrTIMEClass, MobstrTIM.class, "MobstrTIM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMobstrTIM_Traces(), this.getAbstractTraceLink(), null, "traces", null, 0, -1, MobstrTIM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractTraceLinkEClass, AbstractTraceLink.class, "AbstractTraceLink", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractTraceLink_ID(), theEcorePackage.getEString(), "ID", null, 0, 1, AbstractTraceLink.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractTraceLink_Name(), theEcorePackage.getEString(), "name", null, 0, 1, AbstractTraceLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relatedToEClass, RelatedTo.class, "RelatedTo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelatedTo_Items(), theEcorePackage.getEObject(), null, "items", null, 0, -1, RelatedTo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(directedTraceLinkEClass, DirectedTraceLink.class, "DirectedTraceLink", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(basedOnAssumptionEClass, BasedOnAssumption.class, "BasedOnAssumption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBasedOnAssumption_Source(), theEcorePackage.getEObject(), null, "source", null, 1, 1, BasedOnAssumption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBasedOnAssumption_Target(), theEcorePackage.getEObject(), null, "target", null, 1, -1, BasedOnAssumption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(derivedFromItemDefinitionEClass, DerivedFromItemDefinition.class, "DerivedFromItemDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDerivedFromItemDefinition_Source(), theEcorePackage.getEObject(), null, "source", null, 1, 1, DerivedFromItemDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDerivedFromItemDefinition_Target(), theEcorePackage.getEObject(), null, "target", null, 1, -1, DerivedFromItemDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(specifiedByRequirementEClass, SpecifiedByRequirement.class, "SpecifiedByRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpecifiedByRequirement_Source(), theDependability_Package.getMeasure(), null, "source", null, 1, 1, SpecifiedByRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecifiedByRequirement_Target(), theEcorePackage.getEObject(), null, "target", null, 1, -1, SpecifiedByRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addressedBySafetyGoalEClass, AddressedBySafetyGoal.class, "AddressedBySafetyGoal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAddressedBySafetyGoal_Source(), theEcorePackage.getEObject(), null, "source", null, 1, 1, AddressedBySafetyGoal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAddressedBySafetyGoal_Target(), theEcorePackage.getEObject(), null, "target", null, 1, -1, AddressedBySafetyGoal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(leadsToHazardEClass, LeadsToHazard.class, "LeadsToHazard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLeadsToHazard_Source(), theFailureLogic_Package.getFailure(), null, "source", null, 1, 1, LeadsToHazard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLeadsToHazard_Target(), theEcorePackage.getEObject(), null, "target", null, 1, -1, LeadsToHazard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(effectsComponentEClass, EffectsComponent.class, "EffectsComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEffectsComponent_Source(), theBasePackage.getElement(), null, "source", null, 1, 1, EffectsComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEffectsComponent_Target(), theUMLPackage.getComponent(), null, "target", null, 1, 1, EffectsComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hasFailureModeEClass, HasFailureMode.class, "HasFailureMode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHasFailureMode_Source(), theUMLPackage.getComponent(), null, "source", null, 1, 1, HasFailureMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHasFailureMode_Target(), theBasePackage.getElement(), null, "target", null, 1, -1, HasFailureMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(implementsComponentEClass, ImplementsComponent.class, "ImplementsComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImplementsComponent_Source(), theAmaltheaPackage.getINamed(), null, "source", null, 1, 1, ImplementsComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImplementsComponent_Target(), theUMLPackage.getComponent(), null, "target", null, 1, -1, ImplementsComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(realizesItemDefintionEClass, RealizesItemDefintion.class, "RealizesItemDefintion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRealizesItemDefintion_Source(), theUMLPackage.getComponent(), null, "source", null, 1, 1, RealizesItemDefintion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRealizesItemDefintion_Target(), theEcorePackage.getEObject(), null, "target", null, 1, 1, RealizesItemDefintion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(refinesItemDefinitionEClass, RefinesItemDefinition.class, "RefinesItemDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRefinesItemDefinition_Source(), theAmaltheaPackage.getINamed(), null, "source", null, 1, 1, RefinesItemDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRefinesItemDefinition_Target(), theEcorePackage.getEObject(), null, "target", null, 1, 1, RefinesItemDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelsImplementationOfRequirementEClass, ModelsImplementationOfRequirement.class, "ModelsImplementationOfRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelsImplementationOfRequirement_Source(), theAmaltheaPackage.getRequirement(), null, "source", null, 1, 1, ModelsImplementationOfRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelsImplementationOfRequirement_Target(), theEcorePackage.getEObject(), null, "target", null, 1, -1, ModelsImplementationOfRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(refinesTimingRequirementEClass, RefinesTimingRequirement.class, "RefinesTimingRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRefinesTimingRequirement_Source(), theAmaltheaPackage.getINamed(), null, "source", null, 1, 1, RefinesTimingRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRefinesTimingRequirement_Target(), theEcorePackage.getEObject(), null, "target", null, 1, 1, RefinesTimingRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressesAsClaimEClass, ExpressesAsClaim.class, "ExpressesAsClaim", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpressesAsClaim_Source(), theBasePackage.getElement(), null, "source", null, 1, 1, ExpressesAsClaim.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExpressesAsClaim_Target(), theEcorePackage.getEObject(), null, "target", null, 1, -1, ExpressesAsClaim.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressesAsGoalEClass, ExpressesAsGoal.class, "ExpressesAsGoal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpressesAsGoal_Source(), theBasePackage.getElement(), null, "source", null, 1, 1, ExpressesAsGoal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExpressesAsGoal_Target(), theEcorePackage.getEObject(), null, "target", null, 1, -1, ExpressesAsGoal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(usesAsEvidenceEClass, UsesAsEvidence.class, "UsesAsEvidence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUsesAsEvidence_Source(), theBasePackage.getElement(), null, "source", null, 1, 1, UsesAsEvidence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUsesAsEvidence_Target(), theEcorePackage.getEObject(), null, "target", null, 1, -1, UsesAsEvidence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referencesComponentEClass, ReferencesComponent.class, "ReferencesComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReferencesComponent_Source(), theBasePackage.getElement(), null, "source", null, 1, 1, ReferencesComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReferencesComponent_Target(), theUMLPackage.getComponent(), null, "target", null, 1, -1, ReferencesComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addressedByFMEAEClass, AddressedByFMEA.class, "AddressedByFMEA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAddressedByFMEA_Source(), theBasePackage.getElement(), null, "source", null, 1, 1, AddressedByFMEA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAddressedByFMEA_Target(), theFailureLogic_Package.getFMEA(), null, "target", null, 1, 1, AddressedByFMEA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referencesInEvidencesEClass, ReferencesInEvidences.class, "ReferencesInEvidences", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReferencesInEvidences_Source(), theBasePackage.getElement(), null, "source", null, 1, 1, ReferencesInEvidences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReferencesInEvidences_Target(), theAmaltheaPackage.getINamed(), null, "target", null, 1, -1, ReferencesInEvidences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(detailsCausesOfEClass, DetailsCausesOf.class, "DetailsCausesOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDetailsCausesOf_Source(), theBasePackage.getElement(), null, "source", null, 1, 1, DetailsCausesOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDetailsCausesOf_Target(), theBasePackage.getElement(), null, "target", null, 1, -1, DetailsCausesOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(detailsHazardWithEClass, DetailsHazardWith.class, "DetailsHazardWith", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDetailsHazardWith_Source(), theBasePackage.getElement(), null, "source", null, 1, 1, DetailsHazardWith.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDetailsHazardWith_Target(), theBasePackage.getElement(), null, "target", null, 1, 1, DetailsHazardWith.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2011/Xcore
		createXcoreAnnotations();
		// http://panorama-research.org/mobstr/UseWrapperType
		createUseWrapperTypeAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2011/Xcore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createXcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2011/Xcore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "UseWrapperType", "http://panorama-research.org/mobstr/UseWrapperType"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://panorama-research.org/mobstr/UseWrapperType</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUseWrapperTypeAnnotations() {
		String source = "http://panorama-research.org/mobstr/UseWrapperType";
		addAnnotation
		  (getBasedOnAssumption_Source(),
		   source,
		   new String[] {
			   "className", "CapraOfficeObject"
		   });
		addAnnotation
		  (getBasedOnAssumption_Target(),
		   source,
		   new String[] {
			   "className", "CapraOfficeObject"
		   });
		addAnnotation
		  (getDerivedFromItemDefinition_Source(),
		   source,
		   new String[] {
			   "className", "CapraOfficeObject"
		   });
		addAnnotation
		  (getDerivedFromItemDefinition_Target(),
		   source,
		   new String[] {
			   "className", "File"
		   });
		addAnnotation
		  (getSpecifiedByRequirement_Target(),
		   source,
		   new String[] {
			   "className", "CapraOfficeObject"
		   });
		addAnnotation
		  (getAddressedBySafetyGoal_Source(),
		   source,
		   new String[] {
			   "className", "CapraOfficeObject"
		   });
		addAnnotation
		  (getAddressedBySafetyGoal_Target(),
		   source,
		   new String[] {
			   "className", "CapraOfficeObject"
		   });
		addAnnotation
		  (getLeadsToHazard_Target(),
		   source,
		   new String[] {
			   "className", "CapraOfficeObject"
		   });
		addAnnotation
		  (getRealizesItemDefintion_Target(),
		   source,
		   new String[] {
			   "className", "File"
		   });
		addAnnotation
		  (getRefinesItemDefinition_Target(),
		   source,
		   new String[] {
			   "className", "File"
		   });
		addAnnotation
		  (getModelsImplementationOfRequirement_Target(),
		   source,
		   new String[] {
			   "className", "CapraOfficeObject"
		   });
		addAnnotation
		  (getRefinesTimingRequirement_Target(),
		   source,
		   new String[] {
			   "className", "CapraOfficeObject"
		   });
		addAnnotation
		  (getExpressesAsClaim_Target(),
		   source,
		   new String[] {
			   "className", "CapraOfficeObject"
		   });
		addAnnotation
		  (getExpressesAsGoal_Target(),
		   source,
		   new String[] {
			   "className", "CapraOfficeObject"
		   });
		addAnnotation
		  (getUsesAsEvidence_Target(),
		   source,
		   new String[] {
			   "className", "File"
		   });
	}

} //TimPackageImpl

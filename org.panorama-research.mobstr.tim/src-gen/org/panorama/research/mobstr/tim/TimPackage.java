/**
 */
package org.panorama.research.mobstr.tim;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.panorama.research.mobstr.tim.TimFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2011/Xcore UseWrapperType='http://panorama-research.org/mobstr/UseWrapperType'"
 * @generated
 */
public interface TimPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tim";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "org.panorama.research.mobstr.tim";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tim";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TimPackage eINSTANCE = org.panorama.research.mobstr.tim.impl.TimPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.panorama.research.mobstr.tim.impl.MobstrTIMImpl <em>Mobstr TIM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.panorama.research.mobstr.tim.impl.MobstrTIMImpl
	 * @see org.panorama.research.mobstr.tim.impl.TimPackageImpl#getMobstrTIM()
	 * @generated
	 */
	int MOBSTR_TIM = 0;

	/**
	 * The feature id for the '<em><b>Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBSTR_TIM__TRACES = 0;

	/**
	 * The number of structural features of the '<em>Mobstr TIM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBSTR_TIM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Mobstr TIM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBSTR_TIM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.panorama.research.mobstr.tim.impl.AbstractTraceLinkImpl <em>Abstract Trace Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.panorama.research.mobstr.tim.impl.AbstractTraceLinkImpl
	 * @see org.panorama.research.mobstr.tim.impl.TimPackageImpl#getAbstractTraceLink()
	 * @generated
	 */
	int ABSTRACT_TRACE_LINK = 1;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TRACE_LINK__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TRACE_LINK__NAME = 1;

	/**
	 * The number of structural features of the '<em>Abstract Trace Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TRACE_LINK_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Abstract Trace Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TRACE_LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.panorama.research.mobstr.tim.impl.RelatedToImpl <em>Related To</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.panorama.research.mobstr.tim.impl.RelatedToImpl
	 * @see org.panorama.research.mobstr.tim.impl.TimPackageImpl#getRelatedTo()
	 * @generated
	 */
	int RELATED_TO = 2;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_TO__ID = ABSTRACT_TRACE_LINK__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_TO__NAME = ABSTRACT_TRACE_LINK__NAME;

	/**
	 * The feature id for the '<em><b>Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_TO__ITEMS = ABSTRACT_TRACE_LINK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Related To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_TO_FEATURE_COUNT = ABSTRACT_TRACE_LINK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Related To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_TO_OPERATION_COUNT = ABSTRACT_TRACE_LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.panorama.research.mobstr.tim.impl.DirectedTraceLinkImpl <em>Directed Trace Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.panorama.research.mobstr.tim.impl.DirectedTraceLinkImpl
	 * @see org.panorama.research.mobstr.tim.impl.TimPackageImpl#getDirectedTraceLink()
	 * @generated
	 */
	int DIRECTED_TRACE_LINK = 3;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_TRACE_LINK__ID = ABSTRACT_TRACE_LINK__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_TRACE_LINK__NAME = ABSTRACT_TRACE_LINK__NAME;

	/**
	 * The number of structural features of the '<em>Directed Trace Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_TRACE_LINK_FEATURE_COUNT = ABSTRACT_TRACE_LINK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Directed Trace Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_TRACE_LINK_OPERATION_COUNT = ABSTRACT_TRACE_LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.panorama.research.mobstr.tim.impl.BasedOnAssumptionImpl <em>Based On Assumption</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.panorama.research.mobstr.tim.impl.BasedOnAssumptionImpl
	 * @see org.panorama.research.mobstr.tim.impl.TimPackageImpl#getBasedOnAssumption()
	 * @generated
	 */
	int BASED_ON_ASSUMPTION = 4;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASED_ON_ASSUMPTION__ID = DIRECTED_TRACE_LINK__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASED_ON_ASSUMPTION__NAME = DIRECTED_TRACE_LINK__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASED_ON_ASSUMPTION__SOURCE = DIRECTED_TRACE_LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASED_ON_ASSUMPTION__TARGET = DIRECTED_TRACE_LINK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Based On Assumption</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASED_ON_ASSUMPTION_FEATURE_COUNT = DIRECTED_TRACE_LINK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Based On Assumption</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASED_ON_ASSUMPTION_OPERATION_COUNT = DIRECTED_TRACE_LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.panorama.research.mobstr.tim.impl.DerivedFromItemDefinitionImpl <em>Derived From Item Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.panorama.research.mobstr.tim.impl.DerivedFromItemDefinitionImpl
	 * @see org.panorama.research.mobstr.tim.impl.TimPackageImpl#getDerivedFromItemDefinition()
	 * @generated
	 */
	int DERIVED_FROM_ITEM_DEFINITION = 5;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_FROM_ITEM_DEFINITION__ID = DIRECTED_TRACE_LINK__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_FROM_ITEM_DEFINITION__NAME = DIRECTED_TRACE_LINK__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_FROM_ITEM_DEFINITION__SOURCE = DIRECTED_TRACE_LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_FROM_ITEM_DEFINITION__TARGET = DIRECTED_TRACE_LINK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Derived From Item Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_FROM_ITEM_DEFINITION_FEATURE_COUNT = DIRECTED_TRACE_LINK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Derived From Item Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_FROM_ITEM_DEFINITION_OPERATION_COUNT = DIRECTED_TRACE_LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.panorama.research.mobstr.tim.impl.SpecifiedByRequirementImpl <em>Specified By Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.panorama.research.mobstr.tim.impl.SpecifiedByRequirementImpl
	 * @see org.panorama.research.mobstr.tim.impl.TimPackageImpl#getSpecifiedByRequirement()
	 * @generated
	 */
	int SPECIFIED_BY_REQUIREMENT = 6;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIED_BY_REQUIREMENT__ID = DIRECTED_TRACE_LINK__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIED_BY_REQUIREMENT__NAME = DIRECTED_TRACE_LINK__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIED_BY_REQUIREMENT__SOURCE = DIRECTED_TRACE_LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIED_BY_REQUIREMENT__TARGET = DIRECTED_TRACE_LINK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Specified By Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIED_BY_REQUIREMENT_FEATURE_COUNT = DIRECTED_TRACE_LINK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Specified By Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIED_BY_REQUIREMENT_OPERATION_COUNT = DIRECTED_TRACE_LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.panorama.research.mobstr.tim.impl.AddressedBySafetyGoalImpl <em>Addressed By Safety Goal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.panorama.research.mobstr.tim.impl.AddressedBySafetyGoalImpl
	 * @see org.panorama.research.mobstr.tim.impl.TimPackageImpl#getAddressedBySafetyGoal()
	 * @generated
	 */
	int ADDRESSED_BY_SAFETY_GOAL = 7;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESSED_BY_SAFETY_GOAL__ID = DIRECTED_TRACE_LINK__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESSED_BY_SAFETY_GOAL__NAME = DIRECTED_TRACE_LINK__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESSED_BY_SAFETY_GOAL__SOURCE = DIRECTED_TRACE_LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESSED_BY_SAFETY_GOAL__TARGET = DIRECTED_TRACE_LINK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Addressed By Safety Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESSED_BY_SAFETY_GOAL_FEATURE_COUNT = DIRECTED_TRACE_LINK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Addressed By Safety Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESSED_BY_SAFETY_GOAL_OPERATION_COUNT = DIRECTED_TRACE_LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.panorama.research.mobstr.tim.impl.LeadsToHazardImpl <em>Leads To Hazard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.panorama.research.mobstr.tim.impl.LeadsToHazardImpl
	 * @see org.panorama.research.mobstr.tim.impl.TimPackageImpl#getLeadsToHazard()
	 * @generated
	 */
	int LEADS_TO_HAZARD = 8;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEADS_TO_HAZARD__ID = DIRECTED_TRACE_LINK__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEADS_TO_HAZARD__NAME = DIRECTED_TRACE_LINK__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEADS_TO_HAZARD__SOURCE = DIRECTED_TRACE_LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEADS_TO_HAZARD__TARGET = DIRECTED_TRACE_LINK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Leads To Hazard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEADS_TO_HAZARD_FEATURE_COUNT = DIRECTED_TRACE_LINK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Leads To Hazard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEADS_TO_HAZARD_OPERATION_COUNT = DIRECTED_TRACE_LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.panorama.research.mobstr.tim.impl.EffectsComponentImpl <em>Effects Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.panorama.research.mobstr.tim.impl.EffectsComponentImpl
	 * @see org.panorama.research.mobstr.tim.impl.TimPackageImpl#getEffectsComponent()
	 * @generated
	 */
	int EFFECTS_COMPONENT = 9;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECTS_COMPONENT__ID = DIRECTED_TRACE_LINK__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECTS_COMPONENT__NAME = DIRECTED_TRACE_LINK__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECTS_COMPONENT__SOURCE = DIRECTED_TRACE_LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECTS_COMPONENT__TARGET = DIRECTED_TRACE_LINK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Effects Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECTS_COMPONENT_FEATURE_COUNT = DIRECTED_TRACE_LINK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Effects Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECTS_COMPONENT_OPERATION_COUNT = DIRECTED_TRACE_LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.panorama.research.mobstr.tim.impl.HasFailureModeImpl <em>Has Failure Mode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.panorama.research.mobstr.tim.impl.HasFailureModeImpl
	 * @see org.panorama.research.mobstr.tim.impl.TimPackageImpl#getHasFailureMode()
	 * @generated
	 */
	int HAS_FAILURE_MODE = 10;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_FAILURE_MODE__ID = DIRECTED_TRACE_LINK__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_FAILURE_MODE__NAME = DIRECTED_TRACE_LINK__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_FAILURE_MODE__SOURCE = DIRECTED_TRACE_LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_FAILURE_MODE__TARGET = DIRECTED_TRACE_LINK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Has Failure Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_FAILURE_MODE_FEATURE_COUNT = DIRECTED_TRACE_LINK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Has Failure Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_FAILURE_MODE_OPERATION_COUNT = DIRECTED_TRACE_LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.panorama.research.mobstr.tim.impl.ImplementsComponentImpl <em>Implements Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.panorama.research.mobstr.tim.impl.ImplementsComponentImpl
	 * @see org.panorama.research.mobstr.tim.impl.TimPackageImpl#getImplementsComponent()
	 * @generated
	 */
	int IMPLEMENTS_COMPONENT = 11;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTS_COMPONENT__ID = DIRECTED_TRACE_LINK__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTS_COMPONENT__NAME = DIRECTED_TRACE_LINK__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTS_COMPONENT__SOURCE = DIRECTED_TRACE_LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTS_COMPONENT__TARGET = DIRECTED_TRACE_LINK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Implements Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTS_COMPONENT_FEATURE_COUNT = DIRECTED_TRACE_LINK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Implements Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTS_COMPONENT_OPERATION_COUNT = DIRECTED_TRACE_LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.panorama.research.mobstr.tim.impl.RealizesItemDefintionImpl <em>Realizes Item Defintion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.panorama.research.mobstr.tim.impl.RealizesItemDefintionImpl
	 * @see org.panorama.research.mobstr.tim.impl.TimPackageImpl#getRealizesItemDefintion()
	 * @generated
	 */
	int REALIZES_ITEM_DEFINTION = 12;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZES_ITEM_DEFINTION__ID = DIRECTED_TRACE_LINK__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZES_ITEM_DEFINTION__NAME = DIRECTED_TRACE_LINK__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZES_ITEM_DEFINTION__SOURCE = DIRECTED_TRACE_LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZES_ITEM_DEFINTION__TARGET = DIRECTED_TRACE_LINK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Realizes Item Defintion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZES_ITEM_DEFINTION_FEATURE_COUNT = DIRECTED_TRACE_LINK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Realizes Item Defintion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZES_ITEM_DEFINTION_OPERATION_COUNT = DIRECTED_TRACE_LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.panorama.research.mobstr.tim.impl.RefinesItemDefinitionImpl <em>Refines Item Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.panorama.research.mobstr.tim.impl.RefinesItemDefinitionImpl
	 * @see org.panorama.research.mobstr.tim.impl.TimPackageImpl#getRefinesItemDefinition()
	 * @generated
	 */
	int REFINES_ITEM_DEFINITION = 13;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINES_ITEM_DEFINITION__ID = DIRECTED_TRACE_LINK__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINES_ITEM_DEFINITION__NAME = DIRECTED_TRACE_LINK__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINES_ITEM_DEFINITION__SOURCE = DIRECTED_TRACE_LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINES_ITEM_DEFINITION__TARGET = DIRECTED_TRACE_LINK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Refines Item Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINES_ITEM_DEFINITION_FEATURE_COUNT = DIRECTED_TRACE_LINK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Refines Item Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINES_ITEM_DEFINITION_OPERATION_COUNT = DIRECTED_TRACE_LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.panorama.research.mobstr.tim.impl.ModelsImplementationOfRequirementImpl <em>Models Implementation Of Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.panorama.research.mobstr.tim.impl.ModelsImplementationOfRequirementImpl
	 * @see org.panorama.research.mobstr.tim.impl.TimPackageImpl#getModelsImplementationOfRequirement()
	 * @generated
	 */
	int MODELS_IMPLEMENTATION_OF_REQUIREMENT = 14;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELS_IMPLEMENTATION_OF_REQUIREMENT__ID = DIRECTED_TRACE_LINK__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELS_IMPLEMENTATION_OF_REQUIREMENT__NAME = DIRECTED_TRACE_LINK__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELS_IMPLEMENTATION_OF_REQUIREMENT__SOURCE = DIRECTED_TRACE_LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELS_IMPLEMENTATION_OF_REQUIREMENT__TARGET = DIRECTED_TRACE_LINK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Models Implementation Of Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELS_IMPLEMENTATION_OF_REQUIREMENT_FEATURE_COUNT = DIRECTED_TRACE_LINK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Models Implementation Of Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELS_IMPLEMENTATION_OF_REQUIREMENT_OPERATION_COUNT = DIRECTED_TRACE_LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.panorama.research.mobstr.tim.impl.RefinesTimingRequirementImpl <em>Refines Timing Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.panorama.research.mobstr.tim.impl.RefinesTimingRequirementImpl
	 * @see org.panorama.research.mobstr.tim.impl.TimPackageImpl#getRefinesTimingRequirement()
	 * @generated
	 */
	int REFINES_TIMING_REQUIREMENT = 15;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINES_TIMING_REQUIREMENT__ID = DIRECTED_TRACE_LINK__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINES_TIMING_REQUIREMENT__NAME = DIRECTED_TRACE_LINK__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINES_TIMING_REQUIREMENT__SOURCE = DIRECTED_TRACE_LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINES_TIMING_REQUIREMENT__TARGET = DIRECTED_TRACE_LINK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Refines Timing Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINES_TIMING_REQUIREMENT_FEATURE_COUNT = DIRECTED_TRACE_LINK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Refines Timing Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINES_TIMING_REQUIREMENT_OPERATION_COUNT = DIRECTED_TRACE_LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.panorama.research.mobstr.tim.impl.ExpressesAsClaimImpl <em>Expresses As Claim</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.panorama.research.mobstr.tim.impl.ExpressesAsClaimImpl
	 * @see org.panorama.research.mobstr.tim.impl.TimPackageImpl#getExpressesAsClaim()
	 * @generated
	 */
	int EXPRESSES_AS_CLAIM = 16;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSES_AS_CLAIM__ID = DIRECTED_TRACE_LINK__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSES_AS_CLAIM__NAME = DIRECTED_TRACE_LINK__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSES_AS_CLAIM__SOURCE = DIRECTED_TRACE_LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSES_AS_CLAIM__TARGET = DIRECTED_TRACE_LINK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Expresses As Claim</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSES_AS_CLAIM_FEATURE_COUNT = DIRECTED_TRACE_LINK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Expresses As Claim</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSES_AS_CLAIM_OPERATION_COUNT = DIRECTED_TRACE_LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.panorama.research.mobstr.tim.impl.ExpressesAsGoalImpl <em>Expresses As Goal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.panorama.research.mobstr.tim.impl.ExpressesAsGoalImpl
	 * @see org.panorama.research.mobstr.tim.impl.TimPackageImpl#getExpressesAsGoal()
	 * @generated
	 */
	int EXPRESSES_AS_GOAL = 17;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSES_AS_GOAL__ID = DIRECTED_TRACE_LINK__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSES_AS_GOAL__NAME = DIRECTED_TRACE_LINK__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSES_AS_GOAL__SOURCE = DIRECTED_TRACE_LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSES_AS_GOAL__TARGET = DIRECTED_TRACE_LINK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Expresses As Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSES_AS_GOAL_FEATURE_COUNT = DIRECTED_TRACE_LINK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Expresses As Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSES_AS_GOAL_OPERATION_COUNT = DIRECTED_TRACE_LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.panorama.research.mobstr.tim.impl.UsesAsEvidenceImpl <em>Uses As Evidence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.panorama.research.mobstr.tim.impl.UsesAsEvidenceImpl
	 * @see org.panorama.research.mobstr.tim.impl.TimPackageImpl#getUsesAsEvidence()
	 * @generated
	 */
	int USES_AS_EVIDENCE = 18;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES_AS_EVIDENCE__ID = DIRECTED_TRACE_LINK__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES_AS_EVIDENCE__NAME = DIRECTED_TRACE_LINK__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES_AS_EVIDENCE__SOURCE = DIRECTED_TRACE_LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES_AS_EVIDENCE__TARGET = DIRECTED_TRACE_LINK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Uses As Evidence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES_AS_EVIDENCE_FEATURE_COUNT = DIRECTED_TRACE_LINK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Uses As Evidence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES_AS_EVIDENCE_OPERATION_COUNT = DIRECTED_TRACE_LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.panorama.research.mobstr.tim.impl.ReferencesComponentImpl <em>References Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.panorama.research.mobstr.tim.impl.ReferencesComponentImpl
	 * @see org.panorama.research.mobstr.tim.impl.TimPackageImpl#getReferencesComponent()
	 * @generated
	 */
	int REFERENCES_COMPONENT = 19;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCES_COMPONENT__ID = DIRECTED_TRACE_LINK__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCES_COMPONENT__NAME = DIRECTED_TRACE_LINK__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCES_COMPONENT__SOURCE = DIRECTED_TRACE_LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCES_COMPONENT__TARGET = DIRECTED_TRACE_LINK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>References Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCES_COMPONENT_FEATURE_COUNT = DIRECTED_TRACE_LINK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>References Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCES_COMPONENT_OPERATION_COUNT = DIRECTED_TRACE_LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.panorama.research.mobstr.tim.impl.AddressedByFMEAImpl <em>Addressed By FMEA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.panorama.research.mobstr.tim.impl.AddressedByFMEAImpl
	 * @see org.panorama.research.mobstr.tim.impl.TimPackageImpl#getAddressedByFMEA()
	 * @generated
	 */
	int ADDRESSED_BY_FMEA = 20;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESSED_BY_FMEA__ID = DIRECTED_TRACE_LINK__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESSED_BY_FMEA__NAME = DIRECTED_TRACE_LINK__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESSED_BY_FMEA__SOURCE = DIRECTED_TRACE_LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESSED_BY_FMEA__TARGET = DIRECTED_TRACE_LINK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Addressed By FMEA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESSED_BY_FMEA_FEATURE_COUNT = DIRECTED_TRACE_LINK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Addressed By FMEA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESSED_BY_FMEA_OPERATION_COUNT = DIRECTED_TRACE_LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.panorama.research.mobstr.tim.impl.ReferencesInEvidencesImpl <em>References In Evidences</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.panorama.research.mobstr.tim.impl.ReferencesInEvidencesImpl
	 * @see org.panorama.research.mobstr.tim.impl.TimPackageImpl#getReferencesInEvidences()
	 * @generated
	 */
	int REFERENCES_IN_EVIDENCES = 21;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCES_IN_EVIDENCES__ID = DIRECTED_TRACE_LINK__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCES_IN_EVIDENCES__NAME = DIRECTED_TRACE_LINK__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCES_IN_EVIDENCES__SOURCE = DIRECTED_TRACE_LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCES_IN_EVIDENCES__TARGET = DIRECTED_TRACE_LINK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>References In Evidences</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCES_IN_EVIDENCES_FEATURE_COUNT = DIRECTED_TRACE_LINK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>References In Evidences</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCES_IN_EVIDENCES_OPERATION_COUNT = DIRECTED_TRACE_LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.panorama.research.mobstr.tim.impl.DetailsCausesOfImpl <em>Details Causes Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.panorama.research.mobstr.tim.impl.DetailsCausesOfImpl
	 * @see org.panorama.research.mobstr.tim.impl.TimPackageImpl#getDetailsCausesOf()
	 * @generated
	 */
	int DETAILS_CAUSES_OF = 22;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_CAUSES_OF__ID = DIRECTED_TRACE_LINK__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_CAUSES_OF__NAME = DIRECTED_TRACE_LINK__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_CAUSES_OF__SOURCE = DIRECTED_TRACE_LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_CAUSES_OF__TARGET = DIRECTED_TRACE_LINK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Details Causes Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_CAUSES_OF_FEATURE_COUNT = DIRECTED_TRACE_LINK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Details Causes Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_CAUSES_OF_OPERATION_COUNT = DIRECTED_TRACE_LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.panorama.research.mobstr.tim.impl.DetailsHazardWithImpl <em>Details Hazard With</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.panorama.research.mobstr.tim.impl.DetailsHazardWithImpl
	 * @see org.panorama.research.mobstr.tim.impl.TimPackageImpl#getDetailsHazardWith()
	 * @generated
	 */
	int DETAILS_HAZARD_WITH = 23;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_HAZARD_WITH__ID = DIRECTED_TRACE_LINK__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_HAZARD_WITH__NAME = DIRECTED_TRACE_LINK__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_HAZARD_WITH__SOURCE = DIRECTED_TRACE_LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_HAZARD_WITH__TARGET = DIRECTED_TRACE_LINK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Details Hazard With</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_HAZARD_WITH_FEATURE_COUNT = DIRECTED_TRACE_LINK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Details Hazard With</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_HAZARD_WITH_OPERATION_COUNT = DIRECTED_TRACE_LINK_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.panorama.research.mobstr.tim.MobstrTIM <em>Mobstr TIM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mobstr TIM</em>'.
	 * @see org.panorama.research.mobstr.tim.MobstrTIM
	 * @generated
	 */
	EClass getMobstrTIM();

	/**
	 * Returns the meta object for the containment reference list '{@link org.panorama.research.mobstr.tim.MobstrTIM#getTraces <em>Traces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Traces</em>'.
	 * @see org.panorama.research.mobstr.tim.MobstrTIM#getTraces()
	 * @see #getMobstrTIM()
	 * @generated
	 */
	EReference getMobstrTIM_Traces();

	/**
	 * Returns the meta object for class '{@link org.panorama.research.mobstr.tim.AbstractTraceLink <em>Abstract Trace Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Trace Link</em>'.
	 * @see org.panorama.research.mobstr.tim.AbstractTraceLink
	 * @generated
	 */
	EClass getAbstractTraceLink();

	/**
	 * Returns the meta object for the attribute '{@link org.panorama.research.mobstr.tim.AbstractTraceLink#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see org.panorama.research.mobstr.tim.AbstractTraceLink#getID()
	 * @see #getAbstractTraceLink()
	 * @generated
	 */
	EAttribute getAbstractTraceLink_ID();

	/**
	 * Returns the meta object for the attribute '{@link org.panorama.research.mobstr.tim.AbstractTraceLink#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.panorama.research.mobstr.tim.AbstractTraceLink#getName()
	 * @see #getAbstractTraceLink()
	 * @generated
	 */
	EAttribute getAbstractTraceLink_Name();

	/**
	 * Returns the meta object for class '{@link org.panorama.research.mobstr.tim.RelatedTo <em>Related To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Related To</em>'.
	 * @see org.panorama.research.mobstr.tim.RelatedTo
	 * @generated
	 */
	EClass getRelatedTo();

	/**
	 * Returns the meta object for the reference list '{@link org.panorama.research.mobstr.tim.RelatedTo#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Items</em>'.
	 * @see org.panorama.research.mobstr.tim.RelatedTo#getItems()
	 * @see #getRelatedTo()
	 * @generated
	 */
	EReference getRelatedTo_Items();

	/**
	 * Returns the meta object for class '{@link org.panorama.research.mobstr.tim.DirectedTraceLink <em>Directed Trace Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Directed Trace Link</em>'.
	 * @see org.panorama.research.mobstr.tim.DirectedTraceLink
	 * @generated
	 */
	EClass getDirectedTraceLink();

	/**
	 * Returns the meta object for class '{@link org.panorama.research.mobstr.tim.BasedOnAssumption <em>Based On Assumption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Based On Assumption</em>'.
	 * @see org.panorama.research.mobstr.tim.BasedOnAssumption
	 * @generated
	 */
	EClass getBasedOnAssumption();

	/**
	 * Returns the meta object for the reference '{@link org.panorama.research.mobstr.tim.BasedOnAssumption#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.panorama.research.mobstr.tim.BasedOnAssumption#getSource()
	 * @see #getBasedOnAssumption()
	 * @generated
	 */
	EReference getBasedOnAssumption_Source();

	/**
	 * Returns the meta object for the reference list '{@link org.panorama.research.mobstr.tim.BasedOnAssumption#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target</em>'.
	 * @see org.panorama.research.mobstr.tim.BasedOnAssumption#getTarget()
	 * @see #getBasedOnAssumption()
	 * @generated
	 */
	EReference getBasedOnAssumption_Target();

	/**
	 * Returns the meta object for class '{@link org.panorama.research.mobstr.tim.DerivedFromItemDefinition <em>Derived From Item Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Derived From Item Definition</em>'.
	 * @see org.panorama.research.mobstr.tim.DerivedFromItemDefinition
	 * @generated
	 */
	EClass getDerivedFromItemDefinition();

	/**
	 * Returns the meta object for the reference '{@link org.panorama.research.mobstr.tim.DerivedFromItemDefinition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.panorama.research.mobstr.tim.DerivedFromItemDefinition#getSource()
	 * @see #getDerivedFromItemDefinition()
	 * @generated
	 */
	EReference getDerivedFromItemDefinition_Source();

	/**
	 * Returns the meta object for the reference list '{@link org.panorama.research.mobstr.tim.DerivedFromItemDefinition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target</em>'.
	 * @see org.panorama.research.mobstr.tim.DerivedFromItemDefinition#getTarget()
	 * @see #getDerivedFromItemDefinition()
	 * @generated
	 */
	EReference getDerivedFromItemDefinition_Target();

	/**
	 * Returns the meta object for class '{@link org.panorama.research.mobstr.tim.SpecifiedByRequirement <em>Specified By Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specified By Requirement</em>'.
	 * @see org.panorama.research.mobstr.tim.SpecifiedByRequirement
	 * @generated
	 */
	EClass getSpecifiedByRequirement();

	/**
	 * Returns the meta object for the reference '{@link org.panorama.research.mobstr.tim.SpecifiedByRequirement#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.panorama.research.mobstr.tim.SpecifiedByRequirement#getSource()
	 * @see #getSpecifiedByRequirement()
	 * @generated
	 */
	EReference getSpecifiedByRequirement_Source();

	/**
	 * Returns the meta object for the reference list '{@link org.panorama.research.mobstr.tim.SpecifiedByRequirement#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target</em>'.
	 * @see org.panorama.research.mobstr.tim.SpecifiedByRequirement#getTarget()
	 * @see #getSpecifiedByRequirement()
	 * @generated
	 */
	EReference getSpecifiedByRequirement_Target();

	/**
	 * Returns the meta object for class '{@link org.panorama.research.mobstr.tim.AddressedBySafetyGoal <em>Addressed By Safety Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Addressed By Safety Goal</em>'.
	 * @see org.panorama.research.mobstr.tim.AddressedBySafetyGoal
	 * @generated
	 */
	EClass getAddressedBySafetyGoal();

	/**
	 * Returns the meta object for the reference '{@link org.panorama.research.mobstr.tim.AddressedBySafetyGoal#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.panorama.research.mobstr.tim.AddressedBySafetyGoal#getSource()
	 * @see #getAddressedBySafetyGoal()
	 * @generated
	 */
	EReference getAddressedBySafetyGoal_Source();

	/**
	 * Returns the meta object for the reference list '{@link org.panorama.research.mobstr.tim.AddressedBySafetyGoal#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target</em>'.
	 * @see org.panorama.research.mobstr.tim.AddressedBySafetyGoal#getTarget()
	 * @see #getAddressedBySafetyGoal()
	 * @generated
	 */
	EReference getAddressedBySafetyGoal_Target();

	/**
	 * Returns the meta object for class '{@link org.panorama.research.mobstr.tim.LeadsToHazard <em>Leads To Hazard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Leads To Hazard</em>'.
	 * @see org.panorama.research.mobstr.tim.LeadsToHazard
	 * @generated
	 */
	EClass getLeadsToHazard();

	/**
	 * Returns the meta object for the reference '{@link org.panorama.research.mobstr.tim.LeadsToHazard#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.panorama.research.mobstr.tim.LeadsToHazard#getSource()
	 * @see #getLeadsToHazard()
	 * @generated
	 */
	EReference getLeadsToHazard_Source();

	/**
	 * Returns the meta object for the reference list '{@link org.panorama.research.mobstr.tim.LeadsToHazard#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target</em>'.
	 * @see org.panorama.research.mobstr.tim.LeadsToHazard#getTarget()
	 * @see #getLeadsToHazard()
	 * @generated
	 */
	EReference getLeadsToHazard_Target();

	/**
	 * Returns the meta object for class '{@link org.panorama.research.mobstr.tim.EffectsComponent <em>Effects Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Effects Component</em>'.
	 * @see org.panorama.research.mobstr.tim.EffectsComponent
	 * @generated
	 */
	EClass getEffectsComponent();

	/**
	 * Returns the meta object for the reference '{@link org.panorama.research.mobstr.tim.EffectsComponent#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.panorama.research.mobstr.tim.EffectsComponent#getSource()
	 * @see #getEffectsComponent()
	 * @generated
	 */
	EReference getEffectsComponent_Source();

	/**
	 * Returns the meta object for the reference '{@link org.panorama.research.mobstr.tim.EffectsComponent#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.panorama.research.mobstr.tim.EffectsComponent#getTarget()
	 * @see #getEffectsComponent()
	 * @generated
	 */
	EReference getEffectsComponent_Target();

	/**
	 * Returns the meta object for class '{@link org.panorama.research.mobstr.tim.HasFailureMode <em>Has Failure Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Has Failure Mode</em>'.
	 * @see org.panorama.research.mobstr.tim.HasFailureMode
	 * @generated
	 */
	EClass getHasFailureMode();

	/**
	 * Returns the meta object for the reference '{@link org.panorama.research.mobstr.tim.HasFailureMode#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.panorama.research.mobstr.tim.HasFailureMode#getSource()
	 * @see #getHasFailureMode()
	 * @generated
	 */
	EReference getHasFailureMode_Source();

	/**
	 * Returns the meta object for the reference list '{@link org.panorama.research.mobstr.tim.HasFailureMode#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target</em>'.
	 * @see org.panorama.research.mobstr.tim.HasFailureMode#getTarget()
	 * @see #getHasFailureMode()
	 * @generated
	 */
	EReference getHasFailureMode_Target();

	/**
	 * Returns the meta object for class '{@link org.panorama.research.mobstr.tim.ImplementsComponent <em>Implements Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implements Component</em>'.
	 * @see org.panorama.research.mobstr.tim.ImplementsComponent
	 * @generated
	 */
	EClass getImplementsComponent();

	/**
	 * Returns the meta object for the reference '{@link org.panorama.research.mobstr.tim.ImplementsComponent#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.panorama.research.mobstr.tim.ImplementsComponent#getSource()
	 * @see #getImplementsComponent()
	 * @generated
	 */
	EReference getImplementsComponent_Source();

	/**
	 * Returns the meta object for the reference list '{@link org.panorama.research.mobstr.tim.ImplementsComponent#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target</em>'.
	 * @see org.panorama.research.mobstr.tim.ImplementsComponent#getTarget()
	 * @see #getImplementsComponent()
	 * @generated
	 */
	EReference getImplementsComponent_Target();

	/**
	 * Returns the meta object for class '{@link org.panorama.research.mobstr.tim.RealizesItemDefintion <em>Realizes Item Defintion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Realizes Item Defintion</em>'.
	 * @see org.panorama.research.mobstr.tim.RealizesItemDefintion
	 * @generated
	 */
	EClass getRealizesItemDefintion();

	/**
	 * Returns the meta object for the reference '{@link org.panorama.research.mobstr.tim.RealizesItemDefintion#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.panorama.research.mobstr.tim.RealizesItemDefintion#getSource()
	 * @see #getRealizesItemDefintion()
	 * @generated
	 */
	EReference getRealizesItemDefintion_Source();

	/**
	 * Returns the meta object for the reference '{@link org.panorama.research.mobstr.tim.RealizesItemDefintion#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.panorama.research.mobstr.tim.RealizesItemDefintion#getTarget()
	 * @see #getRealizesItemDefintion()
	 * @generated
	 */
	EReference getRealizesItemDefintion_Target();

	/**
	 * Returns the meta object for class '{@link org.panorama.research.mobstr.tim.RefinesItemDefinition <em>Refines Item Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Refines Item Definition</em>'.
	 * @see org.panorama.research.mobstr.tim.RefinesItemDefinition
	 * @generated
	 */
	EClass getRefinesItemDefinition();

	/**
	 * Returns the meta object for the reference '{@link org.panorama.research.mobstr.tim.RefinesItemDefinition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.panorama.research.mobstr.tim.RefinesItemDefinition#getSource()
	 * @see #getRefinesItemDefinition()
	 * @generated
	 */
	EReference getRefinesItemDefinition_Source();

	/**
	 * Returns the meta object for the reference '{@link org.panorama.research.mobstr.tim.RefinesItemDefinition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.panorama.research.mobstr.tim.RefinesItemDefinition#getTarget()
	 * @see #getRefinesItemDefinition()
	 * @generated
	 */
	EReference getRefinesItemDefinition_Target();

	/**
	 * Returns the meta object for class '{@link org.panorama.research.mobstr.tim.ModelsImplementationOfRequirement <em>Models Implementation Of Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Models Implementation Of Requirement</em>'.
	 * @see org.panorama.research.mobstr.tim.ModelsImplementationOfRequirement
	 * @generated
	 */
	EClass getModelsImplementationOfRequirement();

	/**
	 * Returns the meta object for the reference '{@link org.panorama.research.mobstr.tim.ModelsImplementationOfRequirement#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.panorama.research.mobstr.tim.ModelsImplementationOfRequirement#getSource()
	 * @see #getModelsImplementationOfRequirement()
	 * @generated
	 */
	EReference getModelsImplementationOfRequirement_Source();

	/**
	 * Returns the meta object for the reference list '{@link org.panorama.research.mobstr.tim.ModelsImplementationOfRequirement#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target</em>'.
	 * @see org.panorama.research.mobstr.tim.ModelsImplementationOfRequirement#getTarget()
	 * @see #getModelsImplementationOfRequirement()
	 * @generated
	 */
	EReference getModelsImplementationOfRequirement_Target();

	/**
	 * Returns the meta object for class '{@link org.panorama.research.mobstr.tim.RefinesTimingRequirement <em>Refines Timing Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Refines Timing Requirement</em>'.
	 * @see org.panorama.research.mobstr.tim.RefinesTimingRequirement
	 * @generated
	 */
	EClass getRefinesTimingRequirement();

	/**
	 * Returns the meta object for the reference '{@link org.panorama.research.mobstr.tim.RefinesTimingRequirement#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.panorama.research.mobstr.tim.RefinesTimingRequirement#getSource()
	 * @see #getRefinesTimingRequirement()
	 * @generated
	 */
	EReference getRefinesTimingRequirement_Source();

	/**
	 * Returns the meta object for the reference '{@link org.panorama.research.mobstr.tim.RefinesTimingRequirement#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.panorama.research.mobstr.tim.RefinesTimingRequirement#getTarget()
	 * @see #getRefinesTimingRequirement()
	 * @generated
	 */
	EReference getRefinesTimingRequirement_Target();

	/**
	 * Returns the meta object for class '{@link org.panorama.research.mobstr.tim.ExpressesAsClaim <em>Expresses As Claim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expresses As Claim</em>'.
	 * @see org.panorama.research.mobstr.tim.ExpressesAsClaim
	 * @generated
	 */
	EClass getExpressesAsClaim();

	/**
	 * Returns the meta object for the reference '{@link org.panorama.research.mobstr.tim.ExpressesAsClaim#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.panorama.research.mobstr.tim.ExpressesAsClaim#getSource()
	 * @see #getExpressesAsClaim()
	 * @generated
	 */
	EReference getExpressesAsClaim_Source();

	/**
	 * Returns the meta object for the reference list '{@link org.panorama.research.mobstr.tim.ExpressesAsClaim#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target</em>'.
	 * @see org.panorama.research.mobstr.tim.ExpressesAsClaim#getTarget()
	 * @see #getExpressesAsClaim()
	 * @generated
	 */
	EReference getExpressesAsClaim_Target();

	/**
	 * Returns the meta object for class '{@link org.panorama.research.mobstr.tim.ExpressesAsGoal <em>Expresses As Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expresses As Goal</em>'.
	 * @see org.panorama.research.mobstr.tim.ExpressesAsGoal
	 * @generated
	 */
	EClass getExpressesAsGoal();

	/**
	 * Returns the meta object for the reference '{@link org.panorama.research.mobstr.tim.ExpressesAsGoal#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.panorama.research.mobstr.tim.ExpressesAsGoal#getSource()
	 * @see #getExpressesAsGoal()
	 * @generated
	 */
	EReference getExpressesAsGoal_Source();

	/**
	 * Returns the meta object for the reference list '{@link org.panorama.research.mobstr.tim.ExpressesAsGoal#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target</em>'.
	 * @see org.panorama.research.mobstr.tim.ExpressesAsGoal#getTarget()
	 * @see #getExpressesAsGoal()
	 * @generated
	 */
	EReference getExpressesAsGoal_Target();

	/**
	 * Returns the meta object for class '{@link org.panorama.research.mobstr.tim.UsesAsEvidence <em>Uses As Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uses As Evidence</em>'.
	 * @see org.panorama.research.mobstr.tim.UsesAsEvidence
	 * @generated
	 */
	EClass getUsesAsEvidence();

	/**
	 * Returns the meta object for the reference '{@link org.panorama.research.mobstr.tim.UsesAsEvidence#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.panorama.research.mobstr.tim.UsesAsEvidence#getSource()
	 * @see #getUsesAsEvidence()
	 * @generated
	 */
	EReference getUsesAsEvidence_Source();

	/**
	 * Returns the meta object for the reference list '{@link org.panorama.research.mobstr.tim.UsesAsEvidence#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target</em>'.
	 * @see org.panorama.research.mobstr.tim.UsesAsEvidence#getTarget()
	 * @see #getUsesAsEvidence()
	 * @generated
	 */
	EReference getUsesAsEvidence_Target();

	/**
	 * Returns the meta object for class '{@link org.panorama.research.mobstr.tim.ReferencesComponent <em>References Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>References Component</em>'.
	 * @see org.panorama.research.mobstr.tim.ReferencesComponent
	 * @generated
	 */
	EClass getReferencesComponent();

	/**
	 * Returns the meta object for the reference '{@link org.panorama.research.mobstr.tim.ReferencesComponent#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.panorama.research.mobstr.tim.ReferencesComponent#getSource()
	 * @see #getReferencesComponent()
	 * @generated
	 */
	EReference getReferencesComponent_Source();

	/**
	 * Returns the meta object for the reference list '{@link org.panorama.research.mobstr.tim.ReferencesComponent#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target</em>'.
	 * @see org.panorama.research.mobstr.tim.ReferencesComponent#getTarget()
	 * @see #getReferencesComponent()
	 * @generated
	 */
	EReference getReferencesComponent_Target();

	/**
	 * Returns the meta object for class '{@link org.panorama.research.mobstr.tim.AddressedByFMEA <em>Addressed By FMEA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Addressed By FMEA</em>'.
	 * @see org.panorama.research.mobstr.tim.AddressedByFMEA
	 * @generated
	 */
	EClass getAddressedByFMEA();

	/**
	 * Returns the meta object for the reference '{@link org.panorama.research.mobstr.tim.AddressedByFMEA#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.panorama.research.mobstr.tim.AddressedByFMEA#getSource()
	 * @see #getAddressedByFMEA()
	 * @generated
	 */
	EReference getAddressedByFMEA_Source();

	/**
	 * Returns the meta object for the reference '{@link org.panorama.research.mobstr.tim.AddressedByFMEA#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.panorama.research.mobstr.tim.AddressedByFMEA#getTarget()
	 * @see #getAddressedByFMEA()
	 * @generated
	 */
	EReference getAddressedByFMEA_Target();

	/**
	 * Returns the meta object for class '{@link org.panorama.research.mobstr.tim.ReferencesInEvidences <em>References In Evidences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>References In Evidences</em>'.
	 * @see org.panorama.research.mobstr.tim.ReferencesInEvidences
	 * @generated
	 */
	EClass getReferencesInEvidences();

	/**
	 * Returns the meta object for the reference '{@link org.panorama.research.mobstr.tim.ReferencesInEvidences#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.panorama.research.mobstr.tim.ReferencesInEvidences#getSource()
	 * @see #getReferencesInEvidences()
	 * @generated
	 */
	EReference getReferencesInEvidences_Source();

	/**
	 * Returns the meta object for the reference list '{@link org.panorama.research.mobstr.tim.ReferencesInEvidences#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target</em>'.
	 * @see org.panorama.research.mobstr.tim.ReferencesInEvidences#getTarget()
	 * @see #getReferencesInEvidences()
	 * @generated
	 */
	EReference getReferencesInEvidences_Target();

	/**
	 * Returns the meta object for class '{@link org.panorama.research.mobstr.tim.DetailsCausesOf <em>Details Causes Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Details Causes Of</em>'.
	 * @see org.panorama.research.mobstr.tim.DetailsCausesOf
	 * @generated
	 */
	EClass getDetailsCausesOf();

	/**
	 * Returns the meta object for the reference '{@link org.panorama.research.mobstr.tim.DetailsCausesOf#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.panorama.research.mobstr.tim.DetailsCausesOf#getSource()
	 * @see #getDetailsCausesOf()
	 * @generated
	 */
	EReference getDetailsCausesOf_Source();

	/**
	 * Returns the meta object for the reference list '{@link org.panorama.research.mobstr.tim.DetailsCausesOf#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target</em>'.
	 * @see org.panorama.research.mobstr.tim.DetailsCausesOf#getTarget()
	 * @see #getDetailsCausesOf()
	 * @generated
	 */
	EReference getDetailsCausesOf_Target();

	/**
	 * Returns the meta object for class '{@link org.panorama.research.mobstr.tim.DetailsHazardWith <em>Details Hazard With</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Details Hazard With</em>'.
	 * @see org.panorama.research.mobstr.tim.DetailsHazardWith
	 * @generated
	 */
	EClass getDetailsHazardWith();

	/**
	 * Returns the meta object for the reference '{@link org.panorama.research.mobstr.tim.DetailsHazardWith#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.panorama.research.mobstr.tim.DetailsHazardWith#getSource()
	 * @see #getDetailsHazardWith()
	 * @generated
	 */
	EReference getDetailsHazardWith_Source();

	/**
	 * Returns the meta object for the reference '{@link org.panorama.research.mobstr.tim.DetailsHazardWith#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.panorama.research.mobstr.tim.DetailsHazardWith#getTarget()
	 * @see #getDetailsHazardWith()
	 * @generated
	 */
	EReference getDetailsHazardWith_Target();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TimFactory getTimFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.panorama.research.mobstr.tim.impl.MobstrTIMImpl <em>Mobstr TIM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.panorama.research.mobstr.tim.impl.MobstrTIMImpl
		 * @see org.panorama.research.mobstr.tim.impl.TimPackageImpl#getMobstrTIM()
		 * @generated
		 */
		EClass MOBSTR_TIM = eINSTANCE.getMobstrTIM();

		/**
		 * The meta object literal for the '<em><b>Traces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOBSTR_TIM__TRACES = eINSTANCE.getMobstrTIM_Traces();

		/**
		 * The meta object literal for the '{@link org.panorama.research.mobstr.tim.impl.AbstractTraceLinkImpl <em>Abstract Trace Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.panorama.research.mobstr.tim.impl.AbstractTraceLinkImpl
		 * @see org.panorama.research.mobstr.tim.impl.TimPackageImpl#getAbstractTraceLink()
		 * @generated
		 */
		EClass ABSTRACT_TRACE_LINK = eINSTANCE.getAbstractTraceLink();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_TRACE_LINK__ID = eINSTANCE.getAbstractTraceLink_ID();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_TRACE_LINK__NAME = eINSTANCE.getAbstractTraceLink_Name();

		/**
		 * The meta object literal for the '{@link org.panorama.research.mobstr.tim.impl.RelatedToImpl <em>Related To</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.panorama.research.mobstr.tim.impl.RelatedToImpl
		 * @see org.panorama.research.mobstr.tim.impl.TimPackageImpl#getRelatedTo()
		 * @generated
		 */
		EClass RELATED_TO = eINSTANCE.getRelatedTo();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATED_TO__ITEMS = eINSTANCE.getRelatedTo_Items();

		/**
		 * The meta object literal for the '{@link org.panorama.research.mobstr.tim.impl.DirectedTraceLinkImpl <em>Directed Trace Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.panorama.research.mobstr.tim.impl.DirectedTraceLinkImpl
		 * @see org.panorama.research.mobstr.tim.impl.TimPackageImpl#getDirectedTraceLink()
		 * @generated
		 */
		EClass DIRECTED_TRACE_LINK = eINSTANCE.getDirectedTraceLink();

		/**
		 * The meta object literal for the '{@link org.panorama.research.mobstr.tim.impl.BasedOnAssumptionImpl <em>Based On Assumption</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.panorama.research.mobstr.tim.impl.BasedOnAssumptionImpl
		 * @see org.panorama.research.mobstr.tim.impl.TimPackageImpl#getBasedOnAssumption()
		 * @generated
		 */
		EClass BASED_ON_ASSUMPTION = eINSTANCE.getBasedOnAssumption();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASED_ON_ASSUMPTION__SOURCE = eINSTANCE.getBasedOnAssumption_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASED_ON_ASSUMPTION__TARGET = eINSTANCE.getBasedOnAssumption_Target();

		/**
		 * The meta object literal for the '{@link org.panorama.research.mobstr.tim.impl.DerivedFromItemDefinitionImpl <em>Derived From Item Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.panorama.research.mobstr.tim.impl.DerivedFromItemDefinitionImpl
		 * @see org.panorama.research.mobstr.tim.impl.TimPackageImpl#getDerivedFromItemDefinition()
		 * @generated
		 */
		EClass DERIVED_FROM_ITEM_DEFINITION = eINSTANCE.getDerivedFromItemDefinition();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DERIVED_FROM_ITEM_DEFINITION__SOURCE = eINSTANCE.getDerivedFromItemDefinition_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DERIVED_FROM_ITEM_DEFINITION__TARGET = eINSTANCE.getDerivedFromItemDefinition_Target();

		/**
		 * The meta object literal for the '{@link org.panorama.research.mobstr.tim.impl.SpecifiedByRequirementImpl <em>Specified By Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.panorama.research.mobstr.tim.impl.SpecifiedByRequirementImpl
		 * @see org.panorama.research.mobstr.tim.impl.TimPackageImpl#getSpecifiedByRequirement()
		 * @generated
		 */
		EClass SPECIFIED_BY_REQUIREMENT = eINSTANCE.getSpecifiedByRequirement();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIED_BY_REQUIREMENT__SOURCE = eINSTANCE.getSpecifiedByRequirement_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIED_BY_REQUIREMENT__TARGET = eINSTANCE.getSpecifiedByRequirement_Target();

		/**
		 * The meta object literal for the '{@link org.panorama.research.mobstr.tim.impl.AddressedBySafetyGoalImpl <em>Addressed By Safety Goal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.panorama.research.mobstr.tim.impl.AddressedBySafetyGoalImpl
		 * @see org.panorama.research.mobstr.tim.impl.TimPackageImpl#getAddressedBySafetyGoal()
		 * @generated
		 */
		EClass ADDRESSED_BY_SAFETY_GOAL = eINSTANCE.getAddressedBySafetyGoal();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDRESSED_BY_SAFETY_GOAL__SOURCE = eINSTANCE.getAddressedBySafetyGoal_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDRESSED_BY_SAFETY_GOAL__TARGET = eINSTANCE.getAddressedBySafetyGoal_Target();

		/**
		 * The meta object literal for the '{@link org.panorama.research.mobstr.tim.impl.LeadsToHazardImpl <em>Leads To Hazard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.panorama.research.mobstr.tim.impl.LeadsToHazardImpl
		 * @see org.panorama.research.mobstr.tim.impl.TimPackageImpl#getLeadsToHazard()
		 * @generated
		 */
		EClass LEADS_TO_HAZARD = eINSTANCE.getLeadsToHazard();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEADS_TO_HAZARD__SOURCE = eINSTANCE.getLeadsToHazard_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEADS_TO_HAZARD__TARGET = eINSTANCE.getLeadsToHazard_Target();

		/**
		 * The meta object literal for the '{@link org.panorama.research.mobstr.tim.impl.EffectsComponentImpl <em>Effects Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.panorama.research.mobstr.tim.impl.EffectsComponentImpl
		 * @see org.panorama.research.mobstr.tim.impl.TimPackageImpl#getEffectsComponent()
		 * @generated
		 */
		EClass EFFECTS_COMPONENT = eINSTANCE.getEffectsComponent();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EFFECTS_COMPONENT__SOURCE = eINSTANCE.getEffectsComponent_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EFFECTS_COMPONENT__TARGET = eINSTANCE.getEffectsComponent_Target();

		/**
		 * The meta object literal for the '{@link org.panorama.research.mobstr.tim.impl.HasFailureModeImpl <em>Has Failure Mode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.panorama.research.mobstr.tim.impl.HasFailureModeImpl
		 * @see org.panorama.research.mobstr.tim.impl.TimPackageImpl#getHasFailureMode()
		 * @generated
		 */
		EClass HAS_FAILURE_MODE = eINSTANCE.getHasFailureMode();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HAS_FAILURE_MODE__SOURCE = eINSTANCE.getHasFailureMode_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HAS_FAILURE_MODE__TARGET = eINSTANCE.getHasFailureMode_Target();

		/**
		 * The meta object literal for the '{@link org.panorama.research.mobstr.tim.impl.ImplementsComponentImpl <em>Implements Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.panorama.research.mobstr.tim.impl.ImplementsComponentImpl
		 * @see org.panorama.research.mobstr.tim.impl.TimPackageImpl#getImplementsComponent()
		 * @generated
		 */
		EClass IMPLEMENTS_COMPONENT = eINSTANCE.getImplementsComponent();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLEMENTS_COMPONENT__SOURCE = eINSTANCE.getImplementsComponent_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLEMENTS_COMPONENT__TARGET = eINSTANCE.getImplementsComponent_Target();

		/**
		 * The meta object literal for the '{@link org.panorama.research.mobstr.tim.impl.RealizesItemDefintionImpl <em>Realizes Item Defintion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.panorama.research.mobstr.tim.impl.RealizesItemDefintionImpl
		 * @see org.panorama.research.mobstr.tim.impl.TimPackageImpl#getRealizesItemDefintion()
		 * @generated
		 */
		EClass REALIZES_ITEM_DEFINTION = eINSTANCE.getRealizesItemDefintion();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REALIZES_ITEM_DEFINTION__SOURCE = eINSTANCE.getRealizesItemDefintion_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REALIZES_ITEM_DEFINTION__TARGET = eINSTANCE.getRealizesItemDefintion_Target();

		/**
		 * The meta object literal for the '{@link org.panorama.research.mobstr.tim.impl.RefinesItemDefinitionImpl <em>Refines Item Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.panorama.research.mobstr.tim.impl.RefinesItemDefinitionImpl
		 * @see org.panorama.research.mobstr.tim.impl.TimPackageImpl#getRefinesItemDefinition()
		 * @generated
		 */
		EClass REFINES_ITEM_DEFINITION = eINSTANCE.getRefinesItemDefinition();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFINES_ITEM_DEFINITION__SOURCE = eINSTANCE.getRefinesItemDefinition_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFINES_ITEM_DEFINITION__TARGET = eINSTANCE.getRefinesItemDefinition_Target();

		/**
		 * The meta object literal for the '{@link org.panorama.research.mobstr.tim.impl.ModelsImplementationOfRequirementImpl <em>Models Implementation Of Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.panorama.research.mobstr.tim.impl.ModelsImplementationOfRequirementImpl
		 * @see org.panorama.research.mobstr.tim.impl.TimPackageImpl#getModelsImplementationOfRequirement()
		 * @generated
		 */
		EClass MODELS_IMPLEMENTATION_OF_REQUIREMENT = eINSTANCE.getModelsImplementationOfRequirement();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODELS_IMPLEMENTATION_OF_REQUIREMENT__SOURCE = eINSTANCE.getModelsImplementationOfRequirement_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODELS_IMPLEMENTATION_OF_REQUIREMENT__TARGET = eINSTANCE.getModelsImplementationOfRequirement_Target();

		/**
		 * The meta object literal for the '{@link org.panorama.research.mobstr.tim.impl.RefinesTimingRequirementImpl <em>Refines Timing Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.panorama.research.mobstr.tim.impl.RefinesTimingRequirementImpl
		 * @see org.panorama.research.mobstr.tim.impl.TimPackageImpl#getRefinesTimingRequirement()
		 * @generated
		 */
		EClass REFINES_TIMING_REQUIREMENT = eINSTANCE.getRefinesTimingRequirement();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFINES_TIMING_REQUIREMENT__SOURCE = eINSTANCE.getRefinesTimingRequirement_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFINES_TIMING_REQUIREMENT__TARGET = eINSTANCE.getRefinesTimingRequirement_Target();

		/**
		 * The meta object literal for the '{@link org.panorama.research.mobstr.tim.impl.ExpressesAsClaimImpl <em>Expresses As Claim</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.panorama.research.mobstr.tim.impl.ExpressesAsClaimImpl
		 * @see org.panorama.research.mobstr.tim.impl.TimPackageImpl#getExpressesAsClaim()
		 * @generated
		 */
		EClass EXPRESSES_AS_CLAIM = eINSTANCE.getExpressesAsClaim();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSES_AS_CLAIM__SOURCE = eINSTANCE.getExpressesAsClaim_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSES_AS_CLAIM__TARGET = eINSTANCE.getExpressesAsClaim_Target();

		/**
		 * The meta object literal for the '{@link org.panorama.research.mobstr.tim.impl.ExpressesAsGoalImpl <em>Expresses As Goal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.panorama.research.mobstr.tim.impl.ExpressesAsGoalImpl
		 * @see org.panorama.research.mobstr.tim.impl.TimPackageImpl#getExpressesAsGoal()
		 * @generated
		 */
		EClass EXPRESSES_AS_GOAL = eINSTANCE.getExpressesAsGoal();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSES_AS_GOAL__SOURCE = eINSTANCE.getExpressesAsGoal_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSES_AS_GOAL__TARGET = eINSTANCE.getExpressesAsGoal_Target();

		/**
		 * The meta object literal for the '{@link org.panorama.research.mobstr.tim.impl.UsesAsEvidenceImpl <em>Uses As Evidence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.panorama.research.mobstr.tim.impl.UsesAsEvidenceImpl
		 * @see org.panorama.research.mobstr.tim.impl.TimPackageImpl#getUsesAsEvidence()
		 * @generated
		 */
		EClass USES_AS_EVIDENCE = eINSTANCE.getUsesAsEvidence();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USES_AS_EVIDENCE__SOURCE = eINSTANCE.getUsesAsEvidence_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USES_AS_EVIDENCE__TARGET = eINSTANCE.getUsesAsEvidence_Target();

		/**
		 * The meta object literal for the '{@link org.panorama.research.mobstr.tim.impl.ReferencesComponentImpl <em>References Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.panorama.research.mobstr.tim.impl.ReferencesComponentImpl
		 * @see org.panorama.research.mobstr.tim.impl.TimPackageImpl#getReferencesComponent()
		 * @generated
		 */
		EClass REFERENCES_COMPONENT = eINSTANCE.getReferencesComponent();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCES_COMPONENT__SOURCE = eINSTANCE.getReferencesComponent_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCES_COMPONENT__TARGET = eINSTANCE.getReferencesComponent_Target();

		/**
		 * The meta object literal for the '{@link org.panorama.research.mobstr.tim.impl.AddressedByFMEAImpl <em>Addressed By FMEA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.panorama.research.mobstr.tim.impl.AddressedByFMEAImpl
		 * @see org.panorama.research.mobstr.tim.impl.TimPackageImpl#getAddressedByFMEA()
		 * @generated
		 */
		EClass ADDRESSED_BY_FMEA = eINSTANCE.getAddressedByFMEA();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDRESSED_BY_FMEA__SOURCE = eINSTANCE.getAddressedByFMEA_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDRESSED_BY_FMEA__TARGET = eINSTANCE.getAddressedByFMEA_Target();

		/**
		 * The meta object literal for the '{@link org.panorama.research.mobstr.tim.impl.ReferencesInEvidencesImpl <em>References In Evidences</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.panorama.research.mobstr.tim.impl.ReferencesInEvidencesImpl
		 * @see org.panorama.research.mobstr.tim.impl.TimPackageImpl#getReferencesInEvidences()
		 * @generated
		 */
		EClass REFERENCES_IN_EVIDENCES = eINSTANCE.getReferencesInEvidences();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCES_IN_EVIDENCES__SOURCE = eINSTANCE.getReferencesInEvidences_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCES_IN_EVIDENCES__TARGET = eINSTANCE.getReferencesInEvidences_Target();

		/**
		 * The meta object literal for the '{@link org.panorama.research.mobstr.tim.impl.DetailsCausesOfImpl <em>Details Causes Of</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.panorama.research.mobstr.tim.impl.DetailsCausesOfImpl
		 * @see org.panorama.research.mobstr.tim.impl.TimPackageImpl#getDetailsCausesOf()
		 * @generated
		 */
		EClass DETAILS_CAUSES_OF = eINSTANCE.getDetailsCausesOf();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DETAILS_CAUSES_OF__SOURCE = eINSTANCE.getDetailsCausesOf_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DETAILS_CAUSES_OF__TARGET = eINSTANCE.getDetailsCausesOf_Target();

		/**
		 * The meta object literal for the '{@link org.panorama.research.mobstr.tim.impl.DetailsHazardWithImpl <em>Details Hazard With</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.panorama.research.mobstr.tim.impl.DetailsHazardWithImpl
		 * @see org.panorama.research.mobstr.tim.impl.TimPackageImpl#getDetailsHazardWith()
		 * @generated
		 */
		EClass DETAILS_HAZARD_WITH = eINSTANCE.getDetailsHazardWith();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DETAILS_HAZARD_WITH__SOURCE = eINSTANCE.getDetailsHazardWith_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DETAILS_HAZARD_WITH__TARGET = eINSTANCE.getDetailsHazardWith_Target();

	}

} //TimPackage

/**
 */
package org.panorama.research.waters2019.tracemetamodel.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.panorama.research.waters2019.tracemetamodel.APP4MCTracemodel;
import org.panorama.research.waters2019.tracemetamodel.Excecuted_by;
import org.panorama.research.waters2019.tracemetamodel.Formalized_by;
import org.panorama.research.waters2019.tracemetamodel.Implemented_by;
import org.panorama.research.waters2019.tracemetamodel.Prevented_by;
import org.panorama.research.waters2019.tracemetamodel.Realized_by;
import org.panorama.research.waters2019.tracemetamodel.RelatedTo;
import org.panorama.research.waters2019.tracemetamodel.TracemetamodelFactory;
import org.panorama.research.waters2019.tracemetamodel.TracemetamodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TracemetamodelPackageImpl extends EPackageImpl implements TracemetamodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass app4MCTracemodelEClass = null;

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
	private EClass realized_byEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass excecuted_byEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prevented_byEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formalized_byEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implemented_byEClass = null;

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
	 * @see org.panorama.research.waters2019.tracemetamodel.TracemetamodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TracemetamodelPackageImpl() {
		super(eNS_URI, TracemetamodelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TracemetamodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TracemetamodelPackage init() {
		if (isInited) return (TracemetamodelPackage)EPackage.Registry.INSTANCE.getEPackage(TracemetamodelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTracemetamodelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TracemetamodelPackageImpl theTracemetamodelPackage = registeredTracemetamodelPackage instanceof TracemetamodelPackageImpl ? (TracemetamodelPackageImpl)registeredTracemetamodelPackage : new TracemetamodelPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theTracemetamodelPackage.createPackageContents();

		// Initialize created meta-data
		theTracemetamodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTracemetamodelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TracemetamodelPackage.eNS_URI, theTracemetamodelPackage);
		return theTracemetamodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAPP4MCTracemodel() {
		return app4MCTracemodelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAPP4MCTracemodel_Traces() {
		return (EReference)app4MCTracemodelEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getRelatedTo_ID() {
		return (EAttribute)relatedToEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRelatedTo_Name() {
		return (EAttribute)relatedToEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelatedTo_Item() {
		return (EReference)relatedToEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRealized_by() {
		return realized_byEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExcecuted_by() {
		return excecuted_byEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrevented_by() {
		return prevented_byEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFormalized_by() {
		return formalized_byEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImplemented_by() {
		return implemented_byEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TracemetamodelFactory getTracemetamodelFactory() {
		return (TracemetamodelFactory)getEFactoryInstance();
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
		app4MCTracemodelEClass = createEClass(APP4MC_TRACEMODEL);
		createEReference(app4MCTracemodelEClass, APP4MC_TRACEMODEL__TRACES);

		relatedToEClass = createEClass(RELATED_TO);
		createEAttribute(relatedToEClass, RELATED_TO__ID);
		createEAttribute(relatedToEClass, RELATED_TO__NAME);
		createEReference(relatedToEClass, RELATED_TO__ITEM);

		realized_byEClass = createEClass(REALIZED_BY);

		excecuted_byEClass = createEClass(EXCECUTED_BY);

		prevented_byEClass = createEClass(PREVENTED_BY);

		formalized_byEClass = createEClass(FORMALIZED_BY);

		implemented_byEClass = createEClass(IMPLEMENTED_BY);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		realized_byEClass.getESuperTypes().add(this.getRelatedTo());
		excecuted_byEClass.getESuperTypes().add(this.getRelatedTo());
		prevented_byEClass.getESuperTypes().add(this.getRelatedTo());
		formalized_byEClass.getESuperTypes().add(this.getRelatedTo());
		implemented_byEClass.getESuperTypes().add(this.getRelatedTo());

		// Initialize classes, features, and operations; add parameters
		initEClass(app4MCTracemodelEClass, APP4MCTracemodel.class, "APP4MCTracemodel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAPP4MCTracemodel_Traces(), this.getRelatedTo(), null, "traces", null, 0, -1, APP4MCTracemodel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relatedToEClass, RelatedTo.class, "RelatedTo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelatedTo_ID(), theEcorePackage.getEString(), "ID", null, 0, 1, RelatedTo.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelatedTo_Name(), theEcorePackage.getEString(), "name", null, 0, 1, RelatedTo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelatedTo_Item(), theEcorePackage.getEObject(), null, "item", null, 0, -1, RelatedTo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(realized_byEClass, Realized_by.class, "Realized_by", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(excecuted_byEClass, Excecuted_by.class, "Excecuted_by", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(prevented_byEClass, Prevented_by.class, "Prevented_by", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(formalized_byEClass, Formalized_by.class, "Formalized_by", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(implemented_byEClass, Implemented_by.class, "Implemented_by", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //TracemetamodelPackageImpl

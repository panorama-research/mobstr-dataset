/**
 */
package org.panorama.research.waters2019.tracemetamodel;

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
 * @see org.panorama.research.waters2019.tracemetamodel.TracemetamodelFactory
 * @model kind="package"
 * @generated
 */
public interface TracemetamodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tracemetamodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "org.panorama.research.waters2019.tracemetamodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tracemetamodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TracemetamodelPackage eINSTANCE = org.panorama.research.waters2019.tracemetamodel.impl.TracemetamodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.panorama.research.waters2019.tracemetamodel.impl.APP4MCTracemodelImpl <em>APP4MC Tracemodel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.panorama.research.waters2019.tracemetamodel.impl.APP4MCTracemodelImpl
	 * @see org.panorama.research.waters2019.tracemetamodel.impl.TracemetamodelPackageImpl#getAPP4MCTracemodel()
	 * @generated
	 */
	int APP4MC_TRACEMODEL = 0;

	/**
	 * The feature id for the '<em><b>Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP4MC_TRACEMODEL__TRACES = 0;

	/**
	 * The number of structural features of the '<em>APP4MC Tracemodel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP4MC_TRACEMODEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>APP4MC Tracemodel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP4MC_TRACEMODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.panorama.research.waters2019.tracemetamodel.impl.RelatedToImpl <em>Related To</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.panorama.research.waters2019.tracemetamodel.impl.RelatedToImpl
	 * @see org.panorama.research.waters2019.tracemetamodel.impl.TracemetamodelPackageImpl#getRelatedTo()
	 * @generated
	 */
	int RELATED_TO = 1;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_TO__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_TO__NAME = 1;

	/**
	 * The feature id for the '<em><b>Item</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_TO__ITEM = 2;

	/**
	 * The number of structural features of the '<em>Related To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_TO_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Related To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_TO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.panorama.research.waters2019.tracemetamodel.impl.Realized_byImpl <em>Realized by</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.panorama.research.waters2019.tracemetamodel.impl.Realized_byImpl
	 * @see org.panorama.research.waters2019.tracemetamodel.impl.TracemetamodelPackageImpl#getRealized_by()
	 * @generated
	 */
	int REALIZED_BY = 2;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZED_BY__ID = RELATED_TO__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZED_BY__NAME = RELATED_TO__NAME;

	/**
	 * The feature id for the '<em><b>Item</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZED_BY__ITEM = RELATED_TO__ITEM;

	/**
	 * The number of structural features of the '<em>Realized by</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZED_BY_FEATURE_COUNT = RELATED_TO_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Realized by</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZED_BY_OPERATION_COUNT = RELATED_TO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.panorama.research.waters2019.tracemetamodel.impl.Excecuted_byImpl <em>Excecuted by</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.panorama.research.waters2019.tracemetamodel.impl.Excecuted_byImpl
	 * @see org.panorama.research.waters2019.tracemetamodel.impl.TracemetamodelPackageImpl#getExcecuted_by()
	 * @generated
	 */
	int EXCECUTED_BY = 3;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCECUTED_BY__ID = RELATED_TO__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCECUTED_BY__NAME = RELATED_TO__NAME;

	/**
	 * The feature id for the '<em><b>Item</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCECUTED_BY__ITEM = RELATED_TO__ITEM;

	/**
	 * The number of structural features of the '<em>Excecuted by</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCECUTED_BY_FEATURE_COUNT = RELATED_TO_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Excecuted by</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCECUTED_BY_OPERATION_COUNT = RELATED_TO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.panorama.research.waters2019.tracemetamodel.impl.Prevented_byImpl <em>Prevented by</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.panorama.research.waters2019.tracemetamodel.impl.Prevented_byImpl
	 * @see org.panorama.research.waters2019.tracemetamodel.impl.TracemetamodelPackageImpl#getPrevented_by()
	 * @generated
	 */
	int PREVENTED_BY = 4;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREVENTED_BY__ID = RELATED_TO__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREVENTED_BY__NAME = RELATED_TO__NAME;

	/**
	 * The feature id for the '<em><b>Item</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREVENTED_BY__ITEM = RELATED_TO__ITEM;

	/**
	 * The number of structural features of the '<em>Prevented by</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREVENTED_BY_FEATURE_COUNT = RELATED_TO_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Prevented by</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREVENTED_BY_OPERATION_COUNT = RELATED_TO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.panorama.research.waters2019.tracemetamodel.impl.Formalized_byImpl <em>Formalized by</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.panorama.research.waters2019.tracemetamodel.impl.Formalized_byImpl
	 * @see org.panorama.research.waters2019.tracemetamodel.impl.TracemetamodelPackageImpl#getFormalized_by()
	 * @generated
	 */
	int FORMALIZED_BY = 5;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMALIZED_BY__ID = RELATED_TO__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMALIZED_BY__NAME = RELATED_TO__NAME;

	/**
	 * The feature id for the '<em><b>Item</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMALIZED_BY__ITEM = RELATED_TO__ITEM;

	/**
	 * The number of structural features of the '<em>Formalized by</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMALIZED_BY_FEATURE_COUNT = RELATED_TO_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Formalized by</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMALIZED_BY_OPERATION_COUNT = RELATED_TO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.panorama.research.waters2019.tracemetamodel.impl.Implemented_byImpl <em>Implemented by</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.panorama.research.waters2019.tracemetamodel.impl.Implemented_byImpl
	 * @see org.panorama.research.waters2019.tracemetamodel.impl.TracemetamodelPackageImpl#getImplemented_by()
	 * @generated
	 */
	int IMPLEMENTED_BY = 6;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTED_BY__ID = RELATED_TO__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTED_BY__NAME = RELATED_TO__NAME;

	/**
	 * The feature id for the '<em><b>Item</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTED_BY__ITEM = RELATED_TO__ITEM;

	/**
	 * The number of structural features of the '<em>Implemented by</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTED_BY_FEATURE_COUNT = RELATED_TO_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Implemented by</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTED_BY_OPERATION_COUNT = RELATED_TO_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.panorama.research.waters2019.tracemetamodel.APP4MCTracemodel <em>APP4MC Tracemodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>APP4MC Tracemodel</em>'.
	 * @see org.panorama.research.waters2019.tracemetamodel.APP4MCTracemodel
	 * @generated
	 */
	EClass getAPP4MCTracemodel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.panorama.research.waters2019.tracemetamodel.APP4MCTracemodel#getTraces <em>Traces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Traces</em>'.
	 * @see org.panorama.research.waters2019.tracemetamodel.APP4MCTracemodel#getTraces()
	 * @see #getAPP4MCTracemodel()
	 * @generated
	 */
	EReference getAPP4MCTracemodel_Traces();

	/**
	 * Returns the meta object for class '{@link org.panorama.research.waters2019.tracemetamodel.RelatedTo <em>Related To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Related To</em>'.
	 * @see org.panorama.research.waters2019.tracemetamodel.RelatedTo
	 * @generated
	 */
	EClass getRelatedTo();

	/**
	 * Returns the meta object for the attribute '{@link org.panorama.research.waters2019.tracemetamodel.RelatedTo#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see org.panorama.research.waters2019.tracemetamodel.RelatedTo#getID()
	 * @see #getRelatedTo()
	 * @generated
	 */
	EAttribute getRelatedTo_ID();

	/**
	 * Returns the meta object for the attribute '{@link org.panorama.research.waters2019.tracemetamodel.RelatedTo#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.panorama.research.waters2019.tracemetamodel.RelatedTo#getName()
	 * @see #getRelatedTo()
	 * @generated
	 */
	EAttribute getRelatedTo_Name();

	/**
	 * Returns the meta object for the reference list '{@link org.panorama.research.waters2019.tracemetamodel.RelatedTo#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Item</em>'.
	 * @see org.panorama.research.waters2019.tracemetamodel.RelatedTo#getItem()
	 * @see #getRelatedTo()
	 * @generated
	 */
	EReference getRelatedTo_Item();

	/**
	 * Returns the meta object for class '{@link org.panorama.research.waters2019.tracemetamodel.Realized_by <em>Realized by</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Realized by</em>'.
	 * @see org.panorama.research.waters2019.tracemetamodel.Realized_by
	 * @generated
	 */
	EClass getRealized_by();

	/**
	 * Returns the meta object for class '{@link org.panorama.research.waters2019.tracemetamodel.Excecuted_by <em>Excecuted by</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Excecuted by</em>'.
	 * @see org.panorama.research.waters2019.tracemetamodel.Excecuted_by
	 * @generated
	 */
	EClass getExcecuted_by();

	/**
	 * Returns the meta object for class '{@link org.panorama.research.waters2019.tracemetamodel.Prevented_by <em>Prevented by</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prevented by</em>'.
	 * @see org.panorama.research.waters2019.tracemetamodel.Prevented_by
	 * @generated
	 */
	EClass getPrevented_by();

	/**
	 * Returns the meta object for class '{@link org.panorama.research.waters2019.tracemetamodel.Formalized_by <em>Formalized by</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Formalized by</em>'.
	 * @see org.panorama.research.waters2019.tracemetamodel.Formalized_by
	 * @generated
	 */
	EClass getFormalized_by();

	/**
	 * Returns the meta object for class '{@link org.panorama.research.waters2019.tracemetamodel.Implemented_by <em>Implemented by</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implemented by</em>'.
	 * @see org.panorama.research.waters2019.tracemetamodel.Implemented_by
	 * @generated
	 */
	EClass getImplemented_by();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TracemetamodelFactory getTracemetamodelFactory();

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
		 * The meta object literal for the '{@link org.panorama.research.waters2019.tracemetamodel.impl.APP4MCTracemodelImpl <em>APP4MC Tracemodel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.panorama.research.waters2019.tracemetamodel.impl.APP4MCTracemodelImpl
		 * @see org.panorama.research.waters2019.tracemetamodel.impl.TracemetamodelPackageImpl#getAPP4MCTracemodel()
		 * @generated
		 */
		EClass APP4MC_TRACEMODEL = eINSTANCE.getAPP4MCTracemodel();

		/**
		 * The meta object literal for the '<em><b>Traces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP4MC_TRACEMODEL__TRACES = eINSTANCE.getAPP4MCTracemodel_Traces();

		/**
		 * The meta object literal for the '{@link org.panorama.research.waters2019.tracemetamodel.impl.RelatedToImpl <em>Related To</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.panorama.research.waters2019.tracemetamodel.impl.RelatedToImpl
		 * @see org.panorama.research.waters2019.tracemetamodel.impl.TracemetamodelPackageImpl#getRelatedTo()
		 * @generated
		 */
		EClass RELATED_TO = eINSTANCE.getRelatedTo();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATED_TO__ID = eINSTANCE.getRelatedTo_ID();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATED_TO__NAME = eINSTANCE.getRelatedTo_Name();

		/**
		 * The meta object literal for the '<em><b>Item</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATED_TO__ITEM = eINSTANCE.getRelatedTo_Item();

		/**
		 * The meta object literal for the '{@link org.panorama.research.waters2019.tracemetamodel.impl.Realized_byImpl <em>Realized by</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.panorama.research.waters2019.tracemetamodel.impl.Realized_byImpl
		 * @see org.panorama.research.waters2019.tracemetamodel.impl.TracemetamodelPackageImpl#getRealized_by()
		 * @generated
		 */
		EClass REALIZED_BY = eINSTANCE.getRealized_by();

		/**
		 * The meta object literal for the '{@link org.panorama.research.waters2019.tracemetamodel.impl.Excecuted_byImpl <em>Excecuted by</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.panorama.research.waters2019.tracemetamodel.impl.Excecuted_byImpl
		 * @see org.panorama.research.waters2019.tracemetamodel.impl.TracemetamodelPackageImpl#getExcecuted_by()
		 * @generated
		 */
		EClass EXCECUTED_BY = eINSTANCE.getExcecuted_by();

		/**
		 * The meta object literal for the '{@link org.panorama.research.waters2019.tracemetamodel.impl.Prevented_byImpl <em>Prevented by</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.panorama.research.waters2019.tracemetamodel.impl.Prevented_byImpl
		 * @see org.panorama.research.waters2019.tracemetamodel.impl.TracemetamodelPackageImpl#getPrevented_by()
		 * @generated
		 */
		EClass PREVENTED_BY = eINSTANCE.getPrevented_by();

		/**
		 * The meta object literal for the '{@link org.panorama.research.waters2019.tracemetamodel.impl.Formalized_byImpl <em>Formalized by</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.panorama.research.waters2019.tracemetamodel.impl.Formalized_byImpl
		 * @see org.panorama.research.waters2019.tracemetamodel.impl.TracemetamodelPackageImpl#getFormalized_by()
		 * @generated
		 */
		EClass FORMALIZED_BY = eINSTANCE.getFormalized_by();

		/**
		 * The meta object literal for the '{@link org.panorama.research.waters2019.tracemetamodel.impl.Implemented_byImpl <em>Implemented by</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.panorama.research.waters2019.tracemetamodel.impl.Implemented_byImpl
		 * @see org.panorama.research.waters2019.tracemetamodel.impl.TracemetamodelPackageImpl#getImplemented_by()
		 * @generated
		 */
		EClass IMPLEMENTED_BY = eINSTANCE.getImplemented_by();

	}

} //TracemetamodelPackage

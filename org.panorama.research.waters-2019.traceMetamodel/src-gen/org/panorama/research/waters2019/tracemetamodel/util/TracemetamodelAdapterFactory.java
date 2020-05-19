/**
 */
package org.panorama.research.waters2019.tracemetamodel.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.panorama.research.waters2019.tracemetamodel.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.panorama.research.waters2019.tracemetamodel.TracemetamodelPackage
 * @generated
 */
public class TracemetamodelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TracemetamodelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracemetamodelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TracemetamodelPackage.eINSTANCE;
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
	protected TracemetamodelSwitch<Adapter> modelSwitch =
		new TracemetamodelSwitch<Adapter>() {
			@Override
			public Adapter caseAPP4MCTracemodel(APP4MCTracemodel object) {
				return createAPP4MCTracemodelAdapter();
			}
			@Override
			public Adapter caseRelatedTo(RelatedTo object) {
				return createRelatedToAdapter();
			}
			@Override
			public Adapter caseRealized_by(Realized_by object) {
				return createRealized_byAdapter();
			}
			@Override
			public Adapter caseExcecuted_by(Excecuted_by object) {
				return createExcecuted_byAdapter();
			}
			@Override
			public Adapter casePrevented_by(Prevented_by object) {
				return createPrevented_byAdapter();
			}
			@Override
			public Adapter caseFormalized_by(Formalized_by object) {
				return createFormalized_byAdapter();
			}
			@Override
			public Adapter caseImplemented_by(Implemented_by object) {
				return createImplemented_byAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.panorama.research.waters2019.tracemetamodel.APP4MCTracemodel <em>APP4MC Tracemodel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.panorama.research.waters2019.tracemetamodel.APP4MCTracemodel
	 * @generated
	 */
	public Adapter createAPP4MCTracemodelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.panorama.research.waters2019.tracemetamodel.RelatedTo <em>Related To</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.panorama.research.waters2019.tracemetamodel.RelatedTo
	 * @generated
	 */
	public Adapter createRelatedToAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.panorama.research.waters2019.tracemetamodel.Realized_by <em>Realized by</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.panorama.research.waters2019.tracemetamodel.Realized_by
	 * @generated
	 */
	public Adapter createRealized_byAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.panorama.research.waters2019.tracemetamodel.Excecuted_by <em>Excecuted by</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.panorama.research.waters2019.tracemetamodel.Excecuted_by
	 * @generated
	 */
	public Adapter createExcecuted_byAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.panorama.research.waters2019.tracemetamodel.Prevented_by <em>Prevented by</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.panorama.research.waters2019.tracemetamodel.Prevented_by
	 * @generated
	 */
	public Adapter createPrevented_byAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.panorama.research.waters2019.tracemetamodel.Formalized_by <em>Formalized by</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.panorama.research.waters2019.tracemetamodel.Formalized_by
	 * @generated
	 */
	public Adapter createFormalized_byAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.panorama.research.waters2019.tracemetamodel.Implemented_by <em>Implemented by</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.panorama.research.waters2019.tracemetamodel.Implemented_by
	 * @generated
	 */
	public Adapter createImplemented_byAdapter() {
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

} //TracemetamodelAdapterFactory

/**
 */
package org.panorama.research.waters2019.tracemetamodel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.panorama.research.waters2019.tracemetamodel.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TracemetamodelFactoryImpl extends EFactoryImpl implements TracemetamodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TracemetamodelFactory init() {
		try {
			TracemetamodelFactory theTracemetamodelFactory = (TracemetamodelFactory)EPackage.Registry.INSTANCE.getEFactory(TracemetamodelPackage.eNS_URI);
			if (theTracemetamodelFactory != null) {
				return theTracemetamodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TracemetamodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracemetamodelFactoryImpl() {
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
			case TracemetamodelPackage.APP4MC_TRACEMODEL: return createAPP4MCTracemodel();
			case TracemetamodelPackage.RELATED_TO: return createRelatedTo();
			case TracemetamodelPackage.REALIZED_BY: return createRealized_by();
			case TracemetamodelPackage.EXCECUTED_BY: return createExcecuted_by();
			case TracemetamodelPackage.PREVENTED_BY: return createPrevented_by();
			case TracemetamodelPackage.FORMALIZED_BY: return createFormalized_by();
			case TracemetamodelPackage.IMPLEMENTED_BY: return createImplemented_by();
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
	public APP4MCTracemodel createAPP4MCTracemodel() {
		APP4MCTracemodelImpl app4MCTracemodel = new APP4MCTracemodelImpl();
		return app4MCTracemodel;
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
	public Realized_by createRealized_by() {
		Realized_byImpl realized_by = new Realized_byImpl();
		return realized_by;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Excecuted_by createExcecuted_by() {
		Excecuted_byImpl excecuted_by = new Excecuted_byImpl();
		return excecuted_by;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Prevented_by createPrevented_by() {
		Prevented_byImpl prevented_by = new Prevented_byImpl();
		return prevented_by;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Formalized_by createFormalized_by() {
		Formalized_byImpl formalized_by = new Formalized_byImpl();
		return formalized_by;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Implemented_by createImplemented_by() {
		Implemented_byImpl implemented_by = new Implemented_byImpl();
		return implemented_by;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TracemetamodelPackage getTracemetamodelPackage() {
		return (TracemetamodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TracemetamodelPackage getPackage() {
		return TracemetamodelPackage.eINSTANCE;
	}

} //TracemetamodelFactoryImpl

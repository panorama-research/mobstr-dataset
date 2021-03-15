/**
 */
package org.panorama.research.waters2019.tracemetamodel.impl;

import java.util.Collection;

import ode.failureLogic.Failure;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.panorama.research.waters2019.tracemetamodel.LeadsToHazard;
import org.panorama.research.waters2019.tracemetamodel.TracemetamodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Leads To Hazard</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.panorama.research.waters2019.tracemetamodel.impl.LeadsToHazardImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.panorama.research.waters2019.tracemetamodel.impl.LeadsToHazardImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LeadsToHazardImpl extends DirectedTraceLinkImpl implements LeadsToHazard {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Failure source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LeadsToHazardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TracemetamodelPackage.Literals.LEADS_TO_HAZARD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Failure getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (Failure)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TracemetamodelPackage.LEADS_TO_HAZARD__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Failure basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource(Failure newSource) {
		Failure oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TracemetamodelPackage.LEADS_TO_HAZARD__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EObject> getTarget() {
		if (target == null) {
			target = new EObjectResolvingEList<EObject>(EObject.class, this, TracemetamodelPackage.LEADS_TO_HAZARD__TARGET);
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TracemetamodelPackage.LEADS_TO_HAZARD__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case TracemetamodelPackage.LEADS_TO_HAZARD__TARGET:
				return getTarget();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TracemetamodelPackage.LEADS_TO_HAZARD__SOURCE:
				setSource((Failure)newValue);
				return;
			case TracemetamodelPackage.LEADS_TO_HAZARD__TARGET:
				getTarget().clear();
				getTarget().addAll((Collection<? extends EObject>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TracemetamodelPackage.LEADS_TO_HAZARD__SOURCE:
				setSource((Failure)null);
				return;
			case TracemetamodelPackage.LEADS_TO_HAZARD__TARGET:
				getTarget().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TracemetamodelPackage.LEADS_TO_HAZARD__SOURCE:
				return source != null;
			case TracemetamodelPackage.LEADS_TO_HAZARD__TARGET:
				return target != null && !target.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LeadsToHazardImpl

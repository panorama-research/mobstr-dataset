/**
 */
package org.panorama.research.mobstr.tim.impl;

import java.util.Collection;

import ode.dependability.Measure;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.panorama.research.mobstr.tim.SpecifiedByRequirement;
import org.panorama.research.mobstr.tim.TimPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specified By Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.panorama.research.mobstr.tim.impl.SpecifiedByRequirementImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.panorama.research.mobstr.tim.impl.SpecifiedByRequirementImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecifiedByRequirementImpl extends DirectedTraceLinkImpl implements SpecifiedByRequirement {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Measure source;

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
	protected SpecifiedByRequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimPackage.Literals.SPECIFIED_BY_REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Measure getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (Measure)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimPackage.SPECIFIED_BY_REQUIREMENT__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Measure basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource(Measure newSource) {
		Measure oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimPackage.SPECIFIED_BY_REQUIREMENT__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EObject> getTarget() {
		if (target == null) {
			target = new EObjectResolvingEList<EObject>(EObject.class, this, TimPackage.SPECIFIED_BY_REQUIREMENT__TARGET);
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
			case TimPackage.SPECIFIED_BY_REQUIREMENT__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case TimPackage.SPECIFIED_BY_REQUIREMENT__TARGET:
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
			case TimPackage.SPECIFIED_BY_REQUIREMENT__SOURCE:
				setSource((Measure)newValue);
				return;
			case TimPackage.SPECIFIED_BY_REQUIREMENT__TARGET:
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
			case TimPackage.SPECIFIED_BY_REQUIREMENT__SOURCE:
				setSource((Measure)null);
				return;
			case TimPackage.SPECIFIED_BY_REQUIREMENT__TARGET:
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
			case TimPackage.SPECIFIED_BY_REQUIREMENT__SOURCE:
				return source != null;
			case TimPackage.SPECIFIED_BY_REQUIREMENT__TARGET:
				return target != null && !target.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SpecifiedByRequirementImpl

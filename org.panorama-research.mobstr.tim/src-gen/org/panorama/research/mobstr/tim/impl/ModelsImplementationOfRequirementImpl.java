/**
 */
package org.panorama.research.mobstr.tim.impl;

import java.util.Collection;

import org.eclipse.app4mc.amalthea.model.Requirement;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.panorama.research.mobstr.tim.ModelsImplementationOfRequirement;
import org.panorama.research.mobstr.tim.TimPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Models Implementation Of Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.panorama.research.mobstr.tim.impl.ModelsImplementationOfRequirementImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.panorama.research.mobstr.tim.impl.ModelsImplementationOfRequirementImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelsImplementationOfRequirementImpl extends DirectedTraceLinkImpl implements ModelsImplementationOfRequirement {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Requirement source;

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
	protected ModelsImplementationOfRequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimPackage.Literals.MODELS_IMPLEMENTATION_OF_REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Requirement getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (Requirement)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimPackage.MODELS_IMPLEMENTATION_OF_REQUIREMENT__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirement basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource(Requirement newSource) {
		Requirement oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimPackage.MODELS_IMPLEMENTATION_OF_REQUIREMENT__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EObject> getTarget() {
		if (target == null) {
			target = new EObjectResolvingEList<EObject>(EObject.class, this, TimPackage.MODELS_IMPLEMENTATION_OF_REQUIREMENT__TARGET);
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
			case TimPackage.MODELS_IMPLEMENTATION_OF_REQUIREMENT__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case TimPackage.MODELS_IMPLEMENTATION_OF_REQUIREMENT__TARGET:
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
			case TimPackage.MODELS_IMPLEMENTATION_OF_REQUIREMENT__SOURCE:
				setSource((Requirement)newValue);
				return;
			case TimPackage.MODELS_IMPLEMENTATION_OF_REQUIREMENT__TARGET:
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
			case TimPackage.MODELS_IMPLEMENTATION_OF_REQUIREMENT__SOURCE:
				setSource((Requirement)null);
				return;
			case TimPackage.MODELS_IMPLEMENTATION_OF_REQUIREMENT__TARGET:
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
			case TimPackage.MODELS_IMPLEMENTATION_OF_REQUIREMENT__SOURCE:
				return source != null;
			case TimPackage.MODELS_IMPLEMENTATION_OF_REQUIREMENT__TARGET:
				return target != null && !target.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModelsImplementationOfRequirementImpl

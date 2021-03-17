/**
 */
package org.panorama.research.mobstr.tim.impl;

import java.util.Collection;

import ode.base.Element;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.panorama.research.mobstr.tim.ExpressesAsClaim;
import org.panorama.research.mobstr.tim.TimPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expresses As Claim</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.panorama.research.mobstr.tim.impl.ExpressesAsClaimImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.panorama.research.mobstr.tim.impl.ExpressesAsClaimImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExpressesAsClaimImpl extends DirectedTraceLinkImpl implements ExpressesAsClaim {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Element source;

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
	protected ExpressesAsClaimImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimPackage.Literals.EXPRESSES_AS_CLAIM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (Element)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimPackage.EXPRESSES_AS_CLAIM__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource(Element newSource) {
		Element oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimPackage.EXPRESSES_AS_CLAIM__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EObject> getTarget() {
		if (target == null) {
			target = new EObjectResolvingEList<EObject>(EObject.class, this, TimPackage.EXPRESSES_AS_CLAIM__TARGET);
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
			case TimPackage.EXPRESSES_AS_CLAIM__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case TimPackage.EXPRESSES_AS_CLAIM__TARGET:
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
			case TimPackage.EXPRESSES_AS_CLAIM__SOURCE:
				setSource((Element)newValue);
				return;
			case TimPackage.EXPRESSES_AS_CLAIM__TARGET:
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
			case TimPackage.EXPRESSES_AS_CLAIM__SOURCE:
				setSource((Element)null);
				return;
			case TimPackage.EXPRESSES_AS_CLAIM__TARGET:
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
			case TimPackage.EXPRESSES_AS_CLAIM__SOURCE:
				return source != null;
			case TimPackage.EXPRESSES_AS_CLAIM__TARGET:
				return target != null && !target.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ExpressesAsClaimImpl

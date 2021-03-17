/**
 */
package org.panorama.research.mobstr.tim.impl;

import ode.base.Element;

import ode.failureLogic.FMEA;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.panorama.research.mobstr.tim.AddressedByFMEA;
import org.panorama.research.mobstr.tim.TimPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Addressed By FMEA</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.panorama.research.mobstr.tim.impl.AddressedByFMEAImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.panorama.research.mobstr.tim.impl.AddressedByFMEAImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AddressedByFMEAImpl extends DirectedTraceLinkImpl implements AddressedByFMEA {
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
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected FMEA target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddressedByFMEAImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimPackage.Literals.ADDRESSED_BY_FMEA;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimPackage.ADDRESSED_BY_FMEA__SOURCE, oldSource, source));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TimPackage.ADDRESSED_BY_FMEA__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FMEA getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (FMEA)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimPackage.ADDRESSED_BY_FMEA__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FMEA basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget(FMEA newTarget) {
		FMEA oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimPackage.ADDRESSED_BY_FMEA__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TimPackage.ADDRESSED_BY_FMEA__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case TimPackage.ADDRESSED_BY_FMEA__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TimPackage.ADDRESSED_BY_FMEA__SOURCE:
				setSource((Element)newValue);
				return;
			case TimPackage.ADDRESSED_BY_FMEA__TARGET:
				setTarget((FMEA)newValue);
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
			case TimPackage.ADDRESSED_BY_FMEA__SOURCE:
				setSource((Element)null);
				return;
			case TimPackage.ADDRESSED_BY_FMEA__TARGET:
				setTarget((FMEA)null);
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
			case TimPackage.ADDRESSED_BY_FMEA__SOURCE:
				return source != null;
			case TimPackage.ADDRESSED_BY_FMEA__TARGET:
				return target != null;
		}
		return super.eIsSet(featureID);
	}

} //AddressedByFMEAImpl

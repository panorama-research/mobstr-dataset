/**
 */
package org.panorama.research.mobstr.tim.impl;

import java.util.Collection;

import org.eclipse.app4mc.amalthea.model.INamed;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.uml2.uml.Component;

import org.panorama.research.mobstr.tim.ImplementsComponent;
import org.panorama.research.mobstr.tim.TimPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Implements Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.panorama.research.mobstr.tim.impl.ImplementsComponentImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.panorama.research.mobstr.tim.impl.ImplementsComponentImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImplementsComponentImpl extends DirectedTraceLinkImpl implements ImplementsComponent {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected INamed source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImplementsComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimPackage.Literals.IMPLEMENTS_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public INamed getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (INamed)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimPackage.IMPLEMENTS_COMPONENT__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INamed basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource(INamed newSource) {
		INamed oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimPackage.IMPLEMENTS_COMPONENT__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Component> getTarget() {
		if (target == null) {
			target = new EObjectResolvingEList<Component>(Component.class, this, TimPackage.IMPLEMENTS_COMPONENT__TARGET);
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
			case TimPackage.IMPLEMENTS_COMPONENT__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case TimPackage.IMPLEMENTS_COMPONENT__TARGET:
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
			case TimPackage.IMPLEMENTS_COMPONENT__SOURCE:
				setSource((INamed)newValue);
				return;
			case TimPackage.IMPLEMENTS_COMPONENT__TARGET:
				getTarget().clear();
				getTarget().addAll((Collection<? extends Component>)newValue);
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
			case TimPackage.IMPLEMENTS_COMPONENT__SOURCE:
				setSource((INamed)null);
				return;
			case TimPackage.IMPLEMENTS_COMPONENT__TARGET:
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
			case TimPackage.IMPLEMENTS_COMPONENT__SOURCE:
				return source != null;
			case TimPackage.IMPLEMENTS_COMPONENT__TARGET:
				return target != null && !target.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ImplementsComponentImpl

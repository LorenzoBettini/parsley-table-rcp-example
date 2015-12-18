/**
 */
package logevent.impl;

import java.util.Collection;

import logevent.LogEventGroup;
import logevent.LogEventQueue;
import logevent.LogeventPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Log Event Queue</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link logevent.impl.LogEventQueueImpl#getEventGroups <em>Event Groups</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LogEventQueueImpl extends MinimalEObjectImpl.Container implements LogEventQueue {
	/**
	 * The cached value of the '{@link #getEventGroups() <em>Event Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<LogEventGroup> eventGroups;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogEventQueueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogeventPackage.Literals.LOG_EVENT_QUEUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LogEventGroup> getEventGroups() {
		if (eventGroups == null) {
			eventGroups = new EObjectContainmentEList<LogEventGroup>(LogEventGroup.class, this, LogeventPackage.LOG_EVENT_QUEUE__EVENT_GROUPS);
		}
		return eventGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogeventPackage.LOG_EVENT_QUEUE__EVENT_GROUPS:
				return ((InternalEList<?>)getEventGroups()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LogeventPackage.LOG_EVENT_QUEUE__EVENT_GROUPS:
				return getEventGroups();
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
			case LogeventPackage.LOG_EVENT_QUEUE__EVENT_GROUPS:
				getEventGroups().clear();
				getEventGroups().addAll((Collection<? extends LogEventGroup>)newValue);
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
			case LogeventPackage.LOG_EVENT_QUEUE__EVENT_GROUPS:
				getEventGroups().clear();
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
			case LogeventPackage.LOG_EVENT_QUEUE__EVENT_GROUPS:
				return eventGroups != null && !eventGroups.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LogEventQueueImpl

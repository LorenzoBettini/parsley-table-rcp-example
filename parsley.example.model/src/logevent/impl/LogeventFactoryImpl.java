/**
 */
package logevent.impl;

import logevent.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LogeventFactoryImpl extends EFactoryImpl implements LogeventFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LogeventFactory init() {
		try {
			LogeventFactory theLogeventFactory = (LogeventFactory)EPackage.Registry.INSTANCE.getEFactory(LogeventPackage.eNS_URI);
			if (theLogeventFactory != null) {
				return theLogeventFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LogeventFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogeventFactoryImpl() {
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
			case LogeventPackage.LOG_EVENT_QUEUE: return createLogEventQueue();
			case LogeventPackage.LOG_EVENT_GROUP: return createLogEventGroup();
			case LogeventPackage.LOG_EVENT: return createLogEvent();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogEventQueue createLogEventQueue() {
		LogEventQueueImpl logEventQueue = new LogEventQueueImpl();
		return logEventQueue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogEventGroup createLogEventGroup() {
		LogEventGroupImpl logEventGroup = new LogEventGroupImpl();
		return logEventGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogEvent createLogEvent() {
		LogEventImpl logEvent = new LogEventImpl();
		return logEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogeventPackage getLogeventPackage() {
		return (LogeventPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LogeventPackage getPackage() {
		return LogeventPackage.eINSTANCE;
	}

} //LogeventFactoryImpl

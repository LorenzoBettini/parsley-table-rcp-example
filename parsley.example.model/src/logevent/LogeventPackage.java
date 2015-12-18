/**
 */
package logevent;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see logevent.LogeventFactory
 * @model kind="package"
 * @generated
 */
public interface LogeventPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "logevent";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///org/eclipse/emf/parsley/examples/models/logevent.ecore/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "logevent";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LogeventPackage eINSTANCE = logevent.impl.LogeventPackageImpl.init();

	/**
	 * The meta object id for the '{@link logevent.impl.LogEventQueueImpl <em>Log Event Queue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logevent.impl.LogEventQueueImpl
	 * @see logevent.impl.LogeventPackageImpl#getLogEventQueue()
	 * @generated
	 */
	int LOG_EVENT_QUEUE = 0;

	/**
	 * The feature id for the '<em><b>Event Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_EVENT_QUEUE__EVENT_GROUPS = 0;

	/**
	 * The number of structural features of the '<em>Log Event Queue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_EVENT_QUEUE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Log Event Queue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_EVENT_QUEUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link logevent.impl.LogEventGroupImpl <em>Log Event Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logevent.impl.LogEventGroupImpl
	 * @see logevent.impl.LogeventPackageImpl#getLogEventGroup()
	 * @generated
	 */
	int LOG_EVENT_GROUP = 1;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_EVENT_GROUP__EVENTS = 0;

	/**
	 * The number of structural features of the '<em>Log Event Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_EVENT_GROUP_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Log Event Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_EVENT_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link logevent.impl.LogEventImpl <em>Log Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logevent.impl.LogEventImpl
	 * @see logevent.impl.LogeventPackageImpl#getLogEvent()
	 * @generated
	 */
	int LOG_EVENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_EVENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Log Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_EVENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Log Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_EVENT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link logevent.LogEventQueue <em>Log Event Queue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Log Event Queue</em>'.
	 * @see logevent.LogEventQueue
	 * @generated
	 */
	EClass getLogEventQueue();

	/**
	 * Returns the meta object for the containment reference list '{@link logevent.LogEventQueue#getEventGroups <em>Event Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Event Groups</em>'.
	 * @see logevent.LogEventQueue#getEventGroups()
	 * @see #getLogEventQueue()
	 * @generated
	 */
	EReference getLogEventQueue_EventGroups();

	/**
	 * Returns the meta object for class '{@link logevent.LogEventGroup <em>Log Event Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Log Event Group</em>'.
	 * @see logevent.LogEventGroup
	 * @generated
	 */
	EClass getLogEventGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link logevent.LogEventGroup#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Events</em>'.
	 * @see logevent.LogEventGroup#getEvents()
	 * @see #getLogEventGroup()
	 * @generated
	 */
	EReference getLogEventGroup_Events();

	/**
	 * Returns the meta object for class '{@link logevent.LogEvent <em>Log Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Log Event</em>'.
	 * @see logevent.LogEvent
	 * @generated
	 */
	EClass getLogEvent();

	/**
	 * Returns the meta object for the attribute '{@link logevent.LogEvent#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see logevent.LogEvent#getName()
	 * @see #getLogEvent()
	 * @generated
	 */
	EAttribute getLogEvent_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LogeventFactory getLogeventFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link logevent.impl.LogEventQueueImpl <em>Log Event Queue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logevent.impl.LogEventQueueImpl
		 * @see logevent.impl.LogeventPackageImpl#getLogEventQueue()
		 * @generated
		 */
		EClass LOG_EVENT_QUEUE = eINSTANCE.getLogEventQueue();

		/**
		 * The meta object literal for the '<em><b>Event Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOG_EVENT_QUEUE__EVENT_GROUPS = eINSTANCE.getLogEventQueue_EventGroups();

		/**
		 * The meta object literal for the '{@link logevent.impl.LogEventGroupImpl <em>Log Event Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logevent.impl.LogEventGroupImpl
		 * @see logevent.impl.LogeventPackageImpl#getLogEventGroup()
		 * @generated
		 */
		EClass LOG_EVENT_GROUP = eINSTANCE.getLogEventGroup();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOG_EVENT_GROUP__EVENTS = eINSTANCE.getLogEventGroup_Events();

		/**
		 * The meta object literal for the '{@link logevent.impl.LogEventImpl <em>Log Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logevent.impl.LogEventImpl
		 * @see logevent.impl.LogeventPackageImpl#getLogEvent()
		 * @generated
		 */
		EClass LOG_EVENT = eINSTANCE.getLogEvent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOG_EVENT__NAME = eINSTANCE.getLogEvent_Name();

	}

} //LogeventPackage

/**
 */
package logevent.impl;

import logevent.LogEvent;
import logevent.LogEventGroup;
import logevent.LogEventQueue;
import logevent.LogeventFactory;
import logevent.LogeventPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LogeventPackageImpl extends EPackageImpl implements LogeventPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logEventQueueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logEventGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logEventEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see logevent.LogeventPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LogeventPackageImpl() {
		super(eNS_URI, LogeventFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link LogeventPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LogeventPackage init() {
		if (isInited) return (LogeventPackage)EPackage.Registry.INSTANCE.getEPackage(LogeventPackage.eNS_URI);

		// Obtain or create and register package
		LogeventPackageImpl theLogeventPackage = (LogeventPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof LogeventPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new LogeventPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theLogeventPackage.createPackageContents();

		// Initialize created meta-data
		theLogeventPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLogeventPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LogeventPackage.eNS_URI, theLogeventPackage);
		return theLogeventPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogEventQueue() {
		return logEventQueueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogEventQueue_EventGroups() {
		return (EReference)logEventQueueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogEventGroup() {
		return logEventGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogEventGroup_Events() {
		return (EReference)logEventGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogEventGroup_Name() {
		return (EAttribute)logEventGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogEvent() {
		return logEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogEvent_Name() {
		return (EAttribute)logEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogEvent_Group() {
		return (EReference)logEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogeventFactory getLogeventFactory() {
		return (LogeventFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		logEventQueueEClass = createEClass(LOG_EVENT_QUEUE);
		createEReference(logEventQueueEClass, LOG_EVENT_QUEUE__EVENT_GROUPS);

		logEventGroupEClass = createEClass(LOG_EVENT_GROUP);
		createEReference(logEventGroupEClass, LOG_EVENT_GROUP__EVENTS);
		createEAttribute(logEventGroupEClass, LOG_EVENT_GROUP__NAME);

		logEventEClass = createEClass(LOG_EVENT);
		createEAttribute(logEventEClass, LOG_EVENT__NAME);
		createEReference(logEventEClass, LOG_EVENT__GROUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(logEventQueueEClass, LogEventQueue.class, "LogEventQueue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLogEventQueue_EventGroups(), this.getLogEventGroup(), null, "eventGroups", null, 0, -1, LogEventQueue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(logEventGroupEClass, LogEventGroup.class, "LogEventGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLogEventGroup_Events(), this.getLogEvent(), this.getLogEvent_Group(), "events", null, 0, -1, LogEventGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogEventGroup_Name(), ecorePackage.getEString(), "name", null, 0, 1, LogEventGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(logEventEClass, LogEvent.class, "LogEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLogEvent_Name(), ecorePackage.getEString(), "name", null, 0, 1, LogEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogEvent_Group(), this.getLogEventGroup(), this.getLogEventGroup_Events(), "group", null, 0, 1, LogEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //LogeventPackageImpl

/**
 */
package logevent;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Log Event Queue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link logevent.LogEventQueue#getEventGroups <em>Event Groups</em>}</li>
 * </ul>
 *
 * @see logevent.LogeventPackage#getLogEventQueue()
 * @model
 * @generated
 */
public interface LogEventQueue extends EObject {
	/**
	 * Returns the value of the '<em><b>Event Groups</b></em>' containment reference list.
	 * The list contents are of type {@link logevent.LogEventGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Groups</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Groups</em>' containment reference list.
	 * @see logevent.LogeventPackage#getLogEventQueue_EventGroups()
	 * @model containment="true"
	 * @generated
	 */
	EList<LogEventGroup> getEventGroups();

} // LogEventQueue

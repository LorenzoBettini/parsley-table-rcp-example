/**
 */
package logevent;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Log Event Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link logevent.LogEventGroup#getEvents <em>Events</em>}</li>
 *   <li>{@link logevent.LogEventGroup#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see logevent.LogeventPackage#getLogEventGroup()
 * @model
 * @generated
 */
public interface LogEventGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Events</b></em>' containment reference list.
	 * The list contents are of type {@link logevent.LogEvent}.
	 * It is bidirectional and its opposite is '{@link logevent.LogEvent#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Events</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' containment reference list.
	 * @see logevent.LogeventPackage#getLogEventGroup_Events()
	 * @see logevent.LogEvent#getGroup
	 * @model opposite="group" containment="true"
	 * @generated
	 */
	EList<LogEvent> getEvents();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see logevent.LogeventPackage#getLogEventGroup_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link logevent.LogEventGroup#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // LogEventGroup

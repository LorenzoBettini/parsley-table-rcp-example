/**
 */
package logevent;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see logevent.LogeventPackage
 * @generated
 */
public interface LogeventFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LogeventFactory eINSTANCE = logevent.impl.LogeventFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Log Event Queue</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Log Event Queue</em>'.
	 * @generated
	 */
	LogEventQueue createLogEventQueue();

	/**
	 * Returns a new object of class '<em>Log Event Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Log Event Group</em>'.
	 * @generated
	 */
	LogEventGroup createLogEventGroup();

	/**
	 * Returns a new object of class '<em>Log Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Log Event</em>'.
	 * @generated
	 */
	LogEvent createLogEvent();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LogeventPackage getLogeventPackage();

} //LogeventFactory

/**
 */
package org.gemoc.arduino.melange.arduinomt.arduino;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gemoc.arduino.melange.arduinomt.arduino.Project#getHardware <em>Hardware</em>}</li>
 *   <li>{@link org.gemoc.arduino.melange.arduinomt.arduino.Project#getSketch <em>Sketch</em>}</li>
 *   <li>{@link org.gemoc.arduino.melange.arduinomt.arduino.Project#getModules <em>Modules</em>}</li>
 *   <li>{@link org.gemoc.arduino.melange.arduinomt.arduino.Project#getPlatform <em>Platform</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage#getProject()
 * @model
 * @generated
 */
public interface Project extends EObject {
	/**
	 * Returns the value of the '<em><b>Hardware</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hardware</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hardware</em>' containment reference.
	 * @see #setHardware(Hardware)
	 * @see org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage#getProject_Hardware()
	 * @model containment="true"
	 * @generated
	 */
	Hardware getHardware();

	/**
	 * Sets the value of the '{@link org.gemoc.arduino.melange.arduinomt.arduino.Project#getHardware <em>Hardware</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hardware</em>' containment reference.
	 * @see #getHardware()
	 * @generated
	 */
	void setHardware(Hardware value);

	/**
	 * Returns the value of the '<em><b>Sketch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sketch</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sketch</em>' containment reference.
	 * @see #setSketch(Sketch)
	 * @see org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage#getProject_Sketch()
	 * @model containment="true"
	 * @generated
	 */
	Sketch getSketch();

	/**
	 * Sets the value of the '{@link org.gemoc.arduino.melange.arduinomt.arduino.Project#getSketch <em>Sketch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sketch</em>' containment reference.
	 * @see #getSketch()
	 * @generated
	 */
	void setSketch(Sketch value);

	/**
	 * Returns the value of the '<em><b>Modules</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.arduino.melange.arduinomt.arduino.Module}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modules</em>' containment reference list.
	 * @see org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage#getProject_Modules()
	 * @model containment="true"
	 * @generated
	 */
	EList<Module> getModules();

	/**
	 * Returns the value of the '<em><b>Platform</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.arduino.melange.arduinomt.arduino.Platform}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Platform</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Platform</em>' containment reference list.
	 * @see org.gemoc.arduino.melange.arduinomt.arduino.ArduinoPackage#getProject_Platform()
	 * @model containment="true"
	 * @generated
	 */
	EList<Platform> getPlatform();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void execute();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setup();

} // Project

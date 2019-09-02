/**
 */
package no.ntnu.tdt4250.oving1.studies;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Study Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.oving1.studies.StudyInstance#getStudy <em>Study</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.oving1.studies.StudyInstance#getStartYear <em>Start Year</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.oving1.studies.StudyInstance#getYear <em>Year</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.oving1.studies.StudiesPackage#getStudyInstance()
 * @model
 * @generated
 */
public interface StudyInstance extends EObject {
	/**
	 * Returns the value of the '<em><b>Study</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link no.ntnu.tdt4250.oving1.studies.Study#getStudyInstances <em>Study Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Study</em>' container reference.
	 * @see #setStudy(Study)
	 * @see no.ntnu.tdt4250.oving1.studies.StudiesPackage#getStudyInstance_Study()
	 * @see no.ntnu.tdt4250.oving1.studies.Study#getStudyInstances
	 * @model opposite="studyInstances" required="true" transient="false"
	 * @generated
	 */
	Study getStudy();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.oving1.studies.StudyInstance#getStudy <em>Study</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Study</em>' container reference.
	 * @see #getStudy()
	 * @generated
	 */
	void setStudy(Study value);

	/**
	 * Returns the value of the '<em><b>Start Year</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Year</em>' containment reference.
	 * @see #setStartYear(StudyYear)
	 * @see no.ntnu.tdt4250.oving1.studies.StudiesPackage#getStudyInstance_StartYear()
	 * @model containment="true" required="true"
	 * @generated
	 */
	StudyYear getStartYear();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.oving1.studies.StudyInstance#getStartYear <em>Start Year</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Year</em>' containment reference.
	 * @see #getStartYear()
	 * @generated
	 */
	void setStartYear(StudyYear value);

	/**
	 * Returns the value of the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year</em>' attribute.
	 * @see #setYear(int)
	 * @see no.ntnu.tdt4250.oving1.studies.StudiesPackage#getStudyInstance_Year()
	 * @model
	 * @generated
	 */
	int getYear();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.oving1.studies.StudyInstance#getYear <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year</em>' attribute.
	 * @see #getYear()
	 * @generated
	 */
	void setYear(int value);

} // StudyInstance

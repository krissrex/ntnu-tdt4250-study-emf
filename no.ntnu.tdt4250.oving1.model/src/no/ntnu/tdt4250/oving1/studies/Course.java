/**
 */
package no.ntnu.tdt4250.oving1.studies;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Course</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link no.ntnu.tdt4250.oving1.studies.Course#getName <em>Name</em>}</li>
 * <li>{@link no.ntnu.tdt4250.oving1.studies.Course#getCode <em>Code</em>}</li>
 * <li>{@link no.ntnu.tdt4250.oving1.studies.Course#getStudyPoints <em>Study
 * Points</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.oving1.studies.StudiesPackage#getCourse()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore
 *        constraints='shouldStartWith2Or3Letters shouldEndWithNumbers'"
 *        annotation="http://www.eclipse.org/acceleo/query/1.0
 *        shouldStartWith2Or3Letters='self.code.matches(\'^[A-Z]{2,3}.*\')'
 *        shouldEndWithNumbers='self.code.matches(\'.*[0-9]{4}$\')'"
 * @generated
 */
public interface Course extends EObject {
    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see no.ntnu.tdt4250.oving1.studies.StudiesPackage#getCourse_Name()
     * @model
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link no.ntnu.tdt4250.oving1.studies.Course#getName
     * <em>Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Code</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Code</em>' attribute.
     * @see #setCode(String)
     * @see no.ntnu.tdt4250.oving1.studies.StudiesPackage#getCourse_Code()
     * @model dataType="no.ntnu.tdt4250.oving1.studies.CourseCode"
     * @generated
     */
    String getCode();

    /**
     * Sets the value of the '{@link no.ntnu.tdt4250.oving1.studies.Course#getCode
     * <em>Code</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value the new value of the '<em>Code</em>' attribute.
     * @see #getCode()
     * @generated
     */
    void setCode(String value);

    /**
     * Returns the value of the '<em><b>Study Points</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Study Points</em>' attribute.
     * @see #setStudyPoints(float)
     * @see no.ntnu.tdt4250.oving1.studies.StudiesPackage#getCourse_StudyPoints()
     * @model
     * @generated
     */
    float getStudyPoints();

    /**
     * Sets the value of the
     * '{@link no.ntnu.tdt4250.oving1.studies.Course#getStudyPoints <em>Study
     * Points</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value the new value of the '<em>Study Points</em>' attribute.
     * @see #getStudyPoints()
     * @generated
     */
    void setStudyPoints(float value);

} // Course

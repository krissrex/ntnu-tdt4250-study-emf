/**
 */
package no.ntnu.tdt4250.oving1.studies;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Study
 * Year</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link no.ntnu.tdt4250.oving1.studies.StudyYear#getNextYear <em>Next
 * Year</em>}</li>
 * <li>{@link no.ntnu.tdt4250.oving1.studies.StudyYear#getProgramName
 * <em>Program Name</em>}</li>
 * <li>{@link no.ntnu.tdt4250.oving1.studies.StudyYear#getSpringSemester
 * <em>Spring Semester</em>}</li>
 * <li>{@link no.ntnu.tdt4250.oving1.studies.StudyYear#getFallSemester <em>Fall
 * Semester</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.oving1.studies.StudiesPackage#getStudyYear()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore
 *        constraints='springContainsOnlySpringClasses
 *        fallContainsOnlyFallClasses'"
 *        annotation="http://www.eclipse.org/acceleo/query/1.0
 *        springContainsOnlySpringClasses='if self.springSemester &lt;&gt; null
 *        then self.springSemester.courses.semester.name-&gt;exists(name | name
 *        &lt;&gt; \'Spring\') else true endif'
 *        fallContainsOnlySpringClasses='if self.fallSemester &lt;&gt; null then
 *        self.fallSemester.courses.semester.name-&gt;exists(name | name
 *        &lt;&gt; \'Fall\') else true endif'"
 * @generated
 */
public interface StudyYear extends EObject {
    /**
     * Returns the value of the '<em><b>Next Year</b></em>' containment reference
     * list. The list contents are of type
     * {@link no.ntnu.tdt4250.oving1.studies.StudyYear}. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Next Year</em>' containment reference list.
     * @see no.ntnu.tdt4250.oving1.studies.StudiesPackage#getStudyYear_NextYear()
     * @model containment="true"
     * @generated
     */
    EList<StudyYear> getNextYear();

    /**
     * Returns the value of the '<em><b>Program Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Program Name</em>' attribute.
     * @see #setProgramName(String)
     * @see no.ntnu.tdt4250.oving1.studies.StudiesPackage#getStudyYear_ProgramName()
     * @model
     * @generated
     */
    String getProgramName();

    /**
     * Sets the value of the
     * '{@link no.ntnu.tdt4250.oving1.studies.StudyYear#getProgramName <em>Program
     * Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value the new value of the '<em>Program Name</em>' attribute.
     * @see #getProgramName()
     * @generated
     */
    void setProgramName(String value);

    /**
     * Returns the value of the '<em><b>Spring Semester</b></em>' containment
     * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Spring Semester</em>' containment reference.
     * @see #setSpringSemester(Semester)
     * @see no.ntnu.tdt4250.oving1.studies.StudiesPackage#getStudyYear_SpringSemester()
     * @model containment="true"
     * @generated
     */
    Semester getSpringSemester();

    /**
     * Sets the value of the
     * '{@link no.ntnu.tdt4250.oving1.studies.StudyYear#getSpringSemester <em>Spring
     * Semester</em>}' containment reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @param value the new value of the '<em>Spring Semester</em>' containment
     *              reference.
     * @see #getSpringSemester()
     * @generated
     */
    void setSpringSemester(Semester value);

    /**
     * Returns the value of the '<em><b>Fall Semester</b></em>' containment
     * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Fall Semester</em>' containment reference.
     * @see #setFallSemester(Semester)
     * @see no.ntnu.tdt4250.oving1.studies.StudiesPackage#getStudyYear_FallSemester()
     * @model containment="true"
     * @generated
     */
    Semester getFallSemester();

    /**
     * Sets the value of the
     * '{@link no.ntnu.tdt4250.oving1.studies.StudyYear#getFallSemester <em>Fall
     * Semester</em>}' containment reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @param value the new value of the '<em>Fall Semester</em>' containment
     *              reference.
     * @see #getFallSemester()
     * @generated
     */
    void setFallSemester(Semester value);

} // StudyYear

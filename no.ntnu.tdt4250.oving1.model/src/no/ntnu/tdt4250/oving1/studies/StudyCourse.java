/**
 */
package no.ntnu.tdt4250.oving1.studies;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Study
 * Course</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link no.ntnu.tdt4250.oving1.studies.StudyCourse#getCourseInstance
 * <em>Course Instance</em>}</li>
 * <li>{@link no.ntnu.tdt4250.oving1.studies.StudyCourse#isMandatory
 * <em>Mandatory</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.oving1.studies.StudiesPackage#getStudyCourse()
 * @model
 * @generated
 */
public interface StudyCourse extends EObject {
    /**
     * Returns the value of the '<em><b>Course Instance</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Course Instance</em>' reference.
     * @see #setCourseInstance(CourseInstance)
     * @see no.ntnu.tdt4250.oving1.studies.StudiesPackage#getStudyCourse_CourseInstance()
     * @model required="true"
     * @generated
     */
    CourseInstance getCourseInstance();

    /**
     * Sets the value of the
     * '{@link no.ntnu.tdt4250.oving1.studies.StudyCourse#getCourseInstance
     * <em>Course Instance</em>}' reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @param value the new value of the '<em>Course Instance</em>' reference.
     * @see #getCourseInstance()
     * @generated
     */
    void setCourseInstance(CourseInstance value);

    /**
     * Returns the value of the '<em><b>Mandatory</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Mandatory</em>' attribute.
     * @see #setMandatory(boolean)
     * @see no.ntnu.tdt4250.oving1.studies.StudiesPackage#getStudyCourse_Mandatory()
     * @model
     * @generated
     */
    boolean isMandatory();

    /**
     * Sets the value of the
     * '{@link no.ntnu.tdt4250.oving1.studies.StudyCourse#isMandatory
     * <em>Mandatory</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value the new value of the '<em>Mandatory</em>' attribute.
     * @see #isMandatory()
     * @generated
     */
    void setMandatory(boolean value);

} // StudyCourse

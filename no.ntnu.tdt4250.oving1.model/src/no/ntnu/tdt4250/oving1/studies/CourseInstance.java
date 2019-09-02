/**
 */
package no.ntnu.tdt4250.oving1.studies;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.oving1.studies.CourseInstance#getCourse <em>Course</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.oving1.studies.CourseInstance#getYear <em>Year</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.oving1.studies.CourseInstance#getSemester <em>Semester</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.oving1.studies.CourseInstance#getInstanceName <em>Instance Name</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.oving1.studies.StudiesPackage#getCourseInstance()
 * @model
 * @generated
 */
public interface CourseInstance extends EObject {
	/**
	 * Returns the value of the '<em><b>Course</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course</em>' reference.
	 * @see #setCourse(Course)
	 * @see no.ntnu.tdt4250.oving1.studies.StudiesPackage#getCourseInstance_Course()
	 * @model required="true"
	 * @generated
	 */
	Course getCourse();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.oving1.studies.CourseInstance#getCourse <em>Course</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course</em>' reference.
	 * @see #getCourse()
	 * @generated
	 */
	void setCourse(Course value);

	/**
	 * Returns the value of the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year</em>' attribute.
	 * @see #setYear(int)
	 * @see no.ntnu.tdt4250.oving1.studies.StudiesPackage#getCourseInstance_Year()
	 * @model
	 * @generated
	 */
	int getYear();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.oving1.studies.CourseInstance#getYear <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year</em>' attribute.
	 * @see #getYear()
	 * @generated
	 */
	void setYear(int value);

	/**
	 * Returns the value of the '<em><b>Semester</b></em>' attribute.
	 * The literals are from the enumeration {@link no.ntnu.tdt4250.oving1.studies.SemesterCode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semester</em>' attribute.
	 * @see no.ntnu.tdt4250.oving1.studies.SemesterCode
	 * @see #setSemester(SemesterCode)
	 * @see no.ntnu.tdt4250.oving1.studies.StudiesPackage#getCourseInstance_Semester()
	 * @model required="true"
	 * @generated
	 */
	SemesterCode getSemester();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.oving1.studies.CourseInstance#getSemester <em>Semester</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semester</em>' attribute.
	 * @see no.ntnu.tdt4250.oving1.studies.SemesterCode
	 * @see #getSemester()
	 * @generated
	 */
	void setSemester(SemesterCode value);

	/**
	 * Returns the value of the '<em><b>Instance Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Name</em>' attribute.
	 * @see no.ntnu.tdt4250.oving1.studies.StudiesPackage#getCourseInstance_InstanceName()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/acceleo/query/1.0 derivation='self.course.name + \' - \' + self.semester.name + \' \' + self.year'"
	 * @generated
	 */
	String getInstanceName();

} // CourseInstance

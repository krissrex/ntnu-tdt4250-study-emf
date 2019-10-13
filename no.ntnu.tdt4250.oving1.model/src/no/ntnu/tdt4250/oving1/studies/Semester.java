/**
 */
package no.ntnu.tdt4250.oving1.studies;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Semester</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.oving1.studies.Semester#getCourses <em>Courses</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.oving1.studies.Semester#getSemesterCode <em>Semester Code</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.oving1.studies.StudiesPackage#getSemester()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='shouldHave30StudyPoints'"
 *        annotation="http://www.eclipse.org/acceleo/query/1.0 shouldHave30StudyPoints='self.courses.course.studyPoints-&gt;sum() = 30.0'"
 * @generated
 */
public interface Semester extends EObject {
	/**
	 * Returns the value of the '<em><b>Courses</b></em>' reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.oving1.studies.CourseInstance}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the value of the '<em>Courses</em>' reference list.
	 * @see no.ntnu.tdt4250.oving1.studies.StudiesPackage#getSemester_Courses()
	 * @model required="true"
	 * @generated
	 */
	EList<CourseInstance> getCourses();

	/**
	 * Returns the value of the '<em><b>Semester Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semester Code</em>' attribute.
	 * @see no.ntnu.tdt4250.oving1.studies.StudiesPackage#getSemester_SemesterCode()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/acceleo/query/1.0 derivation='if self.eContainmentFeature() &lt;&gt; null and self.eContainmentFeature().name = \'autumnSemester\' then \'Autumn\' else \'Spring\' endif'"
	 * @generated
	 */
	String getSemesterCode();

} // Semester

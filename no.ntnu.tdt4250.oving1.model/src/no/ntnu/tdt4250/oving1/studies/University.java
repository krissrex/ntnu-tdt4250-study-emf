/**
 */
package no.ntnu.tdt4250.oving1.studies;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>University</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link no.ntnu.tdt4250.oving1.studies.University#getName
 * <em>Name</em>}</li>
 * <li>{@link no.ntnu.tdt4250.oving1.studies.University#getCourseInstances
 * <em>Course Instances</em>}</li>
 * <li>{@link no.ntnu.tdt4250.oving1.studies.University#getCourses
 * <em>Courses</em>}</li>
 * <li>{@link no.ntnu.tdt4250.oving1.studies.University#getStudies
 * <em>Studies</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.oving1.studies.StudiesPackage#getUniversity()
 * @model
 * @generated
 */
public interface University extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see no.ntnu.tdt4250.oving1.studies.StudiesPackage#getUniversity_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the
	 * '{@link no.ntnu.tdt4250.oving1.studies.University#getName <em>Name</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Course Instances</b></em>' containment
	 * reference list. The list contents are of type
	 * {@link no.ntnu.tdt4250.oving1.studies.CourseInstance}. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Course Instances</em>' containment reference
	 *         list.
	 * @see no.ntnu.tdt4250.oving1.studies.StudiesPackage#getUniversity_CourseInstances()
	 * @model containment="true"
	 * @generated
	 */
	EList<CourseInstance> getCourseInstances();

	/**
	 * Returns the value of the '<em><b>Courses</b></em>' containment reference
	 * list. The list contents are of type
	 * {@link no.ntnu.tdt4250.oving1.studies.Course}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the value of the '<em>Courses</em>' containment reference list.
	 * @see no.ntnu.tdt4250.oving1.studies.StudiesPackage#getUniversity_Courses()
	 * @model containment="true"
	 * @generated
	 */
	EList<Course> getCourses();

	/**
	 * Returns the value of the '<em><b>Studies</b></em>' containment reference
	 * list. The list contents are of type
	 * {@link no.ntnu.tdt4250.oving1.studies.Study}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the value of the '<em>Studies</em>' containment reference list.
	 * @see no.ntnu.tdt4250.oving1.studies.StudiesPackage#getUniversity_Studies()
	 * @model containment="true"
	 * @generated
	 */
	EList<Study> getStudies();

} // University

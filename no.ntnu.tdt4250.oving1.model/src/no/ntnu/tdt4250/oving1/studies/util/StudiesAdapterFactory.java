/**
 */
package no.ntnu.tdt4250.oving1.studies.util;

import no.ntnu.tdt4250.oving1.studies.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides
 * an adapter <code>createXXX</code> method for each class of the model. <!--
 * end-user-doc -->
 * @see no.ntnu.tdt4250.oving1.studies.StudiesPackage
 * @generated
 */
public class StudiesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected static StudiesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public StudiesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = StudiesPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object. <!--
	 * begin-user-doc --> This implementation returns <code>true</code> if the
	 * object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * 
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected StudiesSwitch<Adapter> modelSwitch = new StudiesSwitch<Adapter>() {
			@Override
			public Adapter caseUniversity(University object) {
				return createUniversityAdapter();
			}
			@Override
			public Adapter caseCourse(Course object) {
				return createCourseAdapter();
			}
			@Override
			public Adapter caseCourseInstance(CourseInstance object) {
				return createCourseInstanceAdapter();
			}
			@Override
			public Adapter caseStudy(Study object) {
				return createStudyAdapter();
			}
			@Override
			public Adapter caseStudyInstance(StudyInstance object) {
				return createStudyInstanceAdapter();
			}
			@Override
			public Adapter caseStudyYear(StudyYear object) {
				return createStudyYearAdapter();
			}
			@Override
			public Adapter caseStudyCourse(StudyCourse object) {
				return createStudyCourseAdapter();
			}
			@Override
			public Adapter caseSemester(Semester object) {
				return createSemesterAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link no.ntnu.tdt4250.oving1.studies.University <em>University</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can
	 * easily ignore cases; it's useful to ignore a case when inheritance will catch
	 * all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see no.ntnu.tdt4250.oving1.studies.University
	 * @generated
	 */
	public Adapter createUniversityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link no.ntnu.tdt4250.oving1.studies.Course <em>Course</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can
	 * easily ignore cases; it's useful to ignore a case when inheritance will catch
	 * all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see no.ntnu.tdt4250.oving1.studies.Course
	 * @generated
	 */
	public Adapter createCourseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.ntnu.tdt4250.oving1.studies.CourseInstance <em>Course Instance</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns
	 * null so that we can easily ignore cases; it's useful to ignore a case when
	 * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.ntnu.tdt4250.oving1.studies.CourseInstance
	 * @generated
	 */
	public Adapter createCourseInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link no.ntnu.tdt4250.oving1.studies.Study <em>Study</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can
	 * easily ignore cases; it's useful to ignore a case when inheritance will catch
	 * all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see no.ntnu.tdt4250.oving1.studies.Study
	 * @generated
	 */
	public Adapter createStudyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.ntnu.tdt4250.oving1.studies.StudyInstance <em>Study Instance</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns
	 * null so that we can easily ignore cases; it's useful to ignore a case when
	 * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.ntnu.tdt4250.oving1.studies.StudyInstance
	 * @generated
	 */
	public Adapter createStudyInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link no.ntnu.tdt4250.oving1.studies.StudyYear <em>Study Year</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can
	 * easily ignore cases; it's useful to ignore a case when inheritance will catch
	 * all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see no.ntnu.tdt4250.oving1.studies.StudyYear
	 * @generated
	 */
	public Adapter createStudyYearAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.ntnu.tdt4250.oving1.studies.StudyCourse <em>Study Course</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance will
	 * catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.ntnu.tdt4250.oving1.studies.StudyCourse
	 * @generated
	 */
	public Adapter createStudyCourseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link no.ntnu.tdt4250.oving1.studies.Semester <em>Semester</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can
	 * easily ignore cases; it's useful to ignore a case when inheritance will catch
	 * all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see no.ntnu.tdt4250.oving1.studies.Semester
	 * @generated
	 */
	public Adapter createSemesterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc --> This
	 * default implementation returns null. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} // StudiesAdapterFactory

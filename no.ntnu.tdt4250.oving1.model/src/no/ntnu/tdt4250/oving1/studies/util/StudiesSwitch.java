/**
 */
package no.ntnu.tdt4250.oving1.studies.util;

import no.ntnu.tdt4250.oving1.studies.*;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance
 * hierarchy. It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object and proceeding up the
 * inheritance hierarchy until a non-null result is returned, which is the
 * result of the switch. <!-- end-user-doc -->
 * 
 * @see no.ntnu.tdt4250.oving1.studies.StudiesPackage
 * @generated
 */
public class StudiesSwitch<T> extends Switch<T> {
    /**
     * The cached model package <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected static StudiesPackage modelPackage;

    /**
     * Creates an instance of the switch. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     */
    public StudiesSwitch() {
        if (modelPackage == null) {
            modelPackage = StudiesPackage.eINSTANCE;
        }
    }

    /**
     * Checks whether this is a switch for the given package. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @param ePackage the package in question.
     * @return whether this is a switch for the given package.
     * @generated
     */
    @Override
    protected boolean isSwitchFor(EPackage ePackage) {
        return ePackage == modelPackage;
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a
     * non null result; it yields that result. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    @Override
    protected T doSwitch(int classifierID, EObject theEObject) {
        switch (classifierID) {
        case StudiesPackage.UNIVERSITY: {
            University university = (University) theEObject;
            T result = caseUniversity(university);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case StudiesPackage.COURSE: {
            Course course = (Course) theEObject;
            T result = caseCourse(course);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case StudiesPackage.COURSE_INSTANCE: {
            CourseInstance courseInstance = (CourseInstance) theEObject;
            T result = caseCourseInstance(courseInstance);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case StudiesPackage.STUDY: {
            Study study = (Study) theEObject;
            T result = caseStudy(study);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case StudiesPackage.STUDY_INSTANCE: {
            StudyInstance studyInstance = (StudyInstance) theEObject;
            T result = caseStudyInstance(studyInstance);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case StudiesPackage.STUDY_YEAR: {
            StudyYear studyYear = (StudyYear) theEObject;
            T result = caseStudyYear(studyYear);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case StudiesPackage.STUDY_COURSE: {
            StudyCourse studyCourse = (StudyCourse) theEObject;
            T result = caseStudyCourse(studyCourse);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case StudiesPackage.SEMESTER: {
            Semester semester = (Semester) theEObject;
            T result = caseSemester(semester);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        default:
            return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of
     * '<em>University</em>'. <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * 
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of
     *         '<em>University</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseUniversity(University object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of
     * '<em>Course</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of
     *         '<em>Course</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCourse(Course object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Course
     * Instance</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Course
     *         Instance</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCourseInstance(CourseInstance object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of
     * '<em>Study</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of
     *         '<em>Study</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseStudy(Study object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Study
     * Instance</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Study
     *         Instance</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseStudyInstance(StudyInstance object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Study
     * Year</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Study
     *         Year</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseStudyYear(StudyYear object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Study
     * Course</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Study
     *         Course</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseStudyCourse(StudyCourse object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of
     * '<em>Semester</em>'. <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * 
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of
     *         '<em>Semester</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSemester(Semester object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of
     * '<em>EObject</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch, but this is the last
     * case anyway. <!-- end-user-doc -->
     * 
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of
     *         '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    @Override
    public T defaultCase(EObject object) {
        return null;
    }

} // StudiesSwitch

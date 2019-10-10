/**
 */
package no.ntnu.tdt4250.oving1.studies.impl;

import no.ntnu.tdt4250.oving1.studies.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class StudiesFactoryImpl extends EFactoryImpl implements StudiesFactory {
    /**
     * Creates the default factory implementation. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    public static StudiesFactory init() {
        try {
            StudiesFactory theStudiesFactory = (StudiesFactory) EPackage.Registry.INSTANCE
                    .getEFactory(StudiesPackage.eNS_URI);
            if (theStudiesFactory != null) {
                return theStudiesFactory;
            }
        } catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new StudiesFactoryImpl();
    }

    /**
     * Creates an instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     */
    public StudiesFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
        case StudiesPackage.UNIVERSITY:
            return createUniversity();
        case StudiesPackage.COURSE:
            return createCourse();
        case StudiesPackage.COURSE_INSTANCE:
            return createCourseInstance();
        case StudiesPackage.STUDY:
            return createStudy();
        case StudiesPackage.STUDY_INSTANCE:
            return createStudyInstance();
        case StudiesPackage.STUDY_YEAR:
            return createStudyYear();
        case StudiesPackage.STUDY_COURSE:
            return createStudyCourse();
        case StudiesPackage.SEMESTER:
            return createSemester();
        default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object createFromString(EDataType eDataType, String initialValue) {
        switch (eDataType.getClassifierID()) {
        case StudiesPackage.SEMESTER_CODE:
            return createSemesterCodeFromString(eDataType, initialValue);
        case StudiesPackage.COURSE_CODE:
            return createCourseCodeFromString(eDataType, initialValue);
        default:
            throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String convertToString(EDataType eDataType, Object instanceValue) {
        switch (eDataType.getClassifierID()) {
        case StudiesPackage.SEMESTER_CODE:
            return convertSemesterCodeToString(eDataType, instanceValue);
        case StudiesPackage.COURSE_CODE:
            return convertCourseCodeToString(eDataType, instanceValue);
        default:
            throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public University createUniversity() {
        UniversityImpl university = new UniversityImpl();
        return university;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public Course createCourse() {
        CourseImpl course = new CourseImpl();
        return course;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public CourseInstance createCourseInstance() {
        CourseInstanceImpl courseInstance = new CourseInstanceImpl();
        return courseInstance;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public Study createStudy() {
        StudyImpl study = new StudyImpl();
        return study;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public StudyInstance createStudyInstance() {
        StudyInstanceImpl studyInstance = new StudyInstanceImpl();
        return studyInstance;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public StudyYear createStudyYear() {
        StudyYearImpl studyYear = new StudyYearImpl();
        return studyYear;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public StudyCourse createStudyCourse() {
        StudyCourseImpl studyCourse = new StudyCourseImpl();
        return studyCourse;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public Semester createSemester() {
        SemesterImpl semester = new SemesterImpl();
        return semester;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public SemesterCode createSemesterCodeFromString(EDataType eDataType, String initialValue) {
        SemesterCode result = SemesterCode.get(initialValue);
        if (result == null)
            throw new IllegalArgumentException(
                    "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public String convertSemesterCodeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public String createCourseCodeFromString(EDataType eDataType, String initialValue) {
        return (String) super.createFromString(eDataType, initialValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public String convertCourseCodeToString(EDataType eDataType, Object instanceValue) {
        return super.convertToString(eDataType, instanceValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public StudiesPackage getStudiesPackage() {
        return (StudiesPackage) getEPackage();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @deprecated
     * @generated
     */
    @Deprecated
    public static StudiesPackage getPackage() {
        return StudiesPackage.eINSTANCE;
    }

} // StudiesFactoryImpl

/**
 */
package no.ntnu.tdt4250.oving1.studies;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains
 * accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each operation of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see no.ntnu.tdt4250.oving1.studies.StudiesFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore validationDelegates='http://www.eclipse.org/acceleo/query/1.0' settingDelegates='http://www.eclipse.org/acceleo/query/1.0' invocationDelegates='http://www.eclipse.org/acceleo/query/1.0'"
 * @generated
 */
public interface StudiesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "studies";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/no.ntnu.tdt4250.oving1.model/model/studies.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "studies";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	StudiesPackage eINSTANCE = no.ntnu.tdt4250.oving1.studies.impl.StudiesPackageImpl.init();

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.oving1.studies.impl.UniversityImpl <em>University</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.oving1.studies.impl.UniversityImpl
	 * @see no.ntnu.tdt4250.oving1.studies.impl.StudiesPackageImpl#getUniversity()
	 * @generated
	 */
	int UNIVERSITY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Courses</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY__COURSES = 1;

	/**
	 * The feature id for the '<em><b>Studies</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY__STUDIES = 2;

	/**
	 * The number of structural features of the '<em>University</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>University</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.oving1.studies.impl.CourseImpl <em>Course</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.oving1.studies.impl.CourseImpl
	 * @see no.ntnu.tdt4250.oving1.studies.impl.StudiesPackageImpl#getCourse()
	 * @generated
	 */
	int COURSE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Study Points</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COURSE__STUDY_POINTS = 2;

	/**
	 * The feature id for the '<em><b>Course Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__COURSE_INSTANCES = 3;

	/**
	 * The number of structural features of the '<em>Course</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COURSE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Course</em>' class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.oving1.studies.impl.CourseInstanceImpl <em>Course Instance</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.oving1.studies.impl.CourseInstanceImpl
	 * @see no.ntnu.tdt4250.oving1.studies.impl.StudiesPackageImpl#getCourseInstance()
	 * @generated
	 */
	int COURSE_INSTANCE = 2;

	/**
	 * The feature id for the '<em><b>Course</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COURSE_INSTANCE__COURSE = 0;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_INSTANCE__YEAR = 1;

	/**
	 * The feature id for the '<em><b>Semester</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COURSE_INSTANCE__SEMESTER = 2;

	/**
	 * The feature id for the '<em><b>Instance Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COURSE_INSTANCE__INSTANCE_NAME = 3;

	/**
	 * The number of structural features of the '<em>Course Instance</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_INSTANCE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Course Instance</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COURSE_INSTANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.oving1.studies.impl.StudyImpl <em>Study</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.oving1.studies.impl.StudyImpl
	 * @see no.ntnu.tdt4250.oving1.studies.impl.StudiesPackageImpl#getStudy()
	 * @generated
	 */
	int STUDY = 3;

	/**
	 * The feature id for the '<em><b>Study Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY__STUDY_INSTANCES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY__NAME = 1;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY__CODE = 2;

	/**
	 * The number of structural features of the '<em>Study</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STUDY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Study</em>' class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.oving1.studies.impl.StudyInstanceImpl <em>Study Instance</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.oving1.studies.impl.StudyInstanceImpl
	 * @see no.ntnu.tdt4250.oving1.studies.impl.StudiesPackageImpl#getStudyInstance()
	 * @generated
	 */
	int STUDY_INSTANCE = 4;

	/**
	 * The feature id for the '<em><b>Study</b></em>' container reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STUDY_INSTANCE__STUDY = 0;

	/**
	 * The feature id for the '<em><b>Start Year</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_INSTANCE__START_YEAR = 1;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_INSTANCE__YEAR = 2;

	/**
	 * The number of structural features of the '<em>Study Instance</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_INSTANCE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Study Instance</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STUDY_INSTANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.oving1.studies.impl.StudyYearImpl <em>Study Year</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.oving1.studies.impl.StudyYearImpl
	 * @see no.ntnu.tdt4250.oving1.studies.impl.StudiesPackageImpl#getStudyYear()
	 * @generated
	 */
	int STUDY_YEAR = 5;

	/**
	 * The feature id for the '<em><b>Next Year</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_YEAR__NEXT_YEAR = 0;

	/**
	 * The feature id for the '<em><b>Program Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STUDY_YEAR__PROGRAM_NAME = 1;

	/**
	 * The feature id for the '<em><b>Spring Semester</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_YEAR__SPRING_SEMESTER = 2;

	/**
	 * The feature id for the '<em><b>Autumn Semester</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_YEAR__AUTUMN_SEMESTER = 3;

	/**
	 * The number of structural features of the '<em>Study Year</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STUDY_YEAR_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Study Year</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STUDY_YEAR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.oving1.studies.impl.StudyCourseImpl <em>Study Course</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.oving1.studies.impl.StudyCourseImpl
	 * @see no.ntnu.tdt4250.oving1.studies.impl.StudiesPackageImpl#getStudyCourse()
	 * @generated
	 */
	int STUDY_COURSE = 6;

	/**
	 * The feature id for the '<em><b>Course Instance</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STUDY_COURSE__COURSE_INSTANCE = 0;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STUDY_COURSE__MANDATORY = 1;

	/**
	 * The number of structural features of the '<em>Study Course</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STUDY_COURSE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Study Course</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STUDY_COURSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.oving1.studies.impl.SemesterImpl <em>Semester</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.oving1.studies.impl.SemesterImpl
	 * @see no.ntnu.tdt4250.oving1.studies.impl.StudiesPackageImpl#getSemester()
	 * @generated
	 */
	int SEMESTER = 7;

	/**
	 * The feature id for the '<em><b>Courses</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SEMESTER__COURSES = 0;

	/**
	 * The feature id for the '<em><b>Study Year Semester</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__STUDY_YEAR_SEMESTER = 1;

	/**
	 * The number of structural features of the '<em>Semester</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SEMESTER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Semester</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SEMESTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.oving1.studies.SemesterCode <em>Semester Code</em>}' enum.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.oving1.studies.SemesterCode
	 * @see no.ntnu.tdt4250.oving1.studies.impl.StudiesPackageImpl#getSemesterCode()
	 * @generated
	 */
	int SEMESTER_CODE = 8;

	/**
	 * The meta object id for the '<em>Course Code</em>' data type. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see java.lang.String
	 * @see no.ntnu.tdt4250.oving1.studies.impl.StudiesPackageImpl#getCourseCode()
	 * @generated
	 */
	int COURSE_CODE = 9;

	/**
	 * Returns the meta object for class
	 * '{@link no.ntnu.tdt4250.oving1.studies.University <em>University</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>University</em>'.
	 * @see no.ntnu.tdt4250.oving1.studies.University
	 * @generated
	 */
	EClass getUniversity();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.oving1.studies.University#getName <em>Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.ntnu.tdt4250.oving1.studies.University#getName()
	 * @see #getUniversity()
	 * @generated
	 */
	EAttribute getUniversity_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link no.ntnu.tdt4250.oving1.studies.University#getCourses <em>Courses</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Courses</em>'.
	 * @see no.ntnu.tdt4250.oving1.studies.University#getCourses()
	 * @see #getUniversity()
	 * @generated
	 */
	EReference getUniversity_Courses();

	/**
	 * Returns the meta object for the containment reference list '{@link no.ntnu.tdt4250.oving1.studies.University#getStudies <em>Studies</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Studies</em>'.
	 * @see no.ntnu.tdt4250.oving1.studies.University#getStudies()
	 * @see #getUniversity()
	 * @generated
	 */
	EReference getUniversity_Studies();

	/**
	 * Returns the meta object for class
	 * '{@link no.ntnu.tdt4250.oving1.studies.Course <em>Course</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Course</em>'.
	 * @see no.ntnu.tdt4250.oving1.studies.Course
	 * @generated
	 */
	EClass getCourse();

	/**
	 * Returns the meta object for the attribute
	 * '{@link no.ntnu.tdt4250.oving1.studies.Course#getName <em>Name</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.ntnu.tdt4250.oving1.studies.Course#getName()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Name();

	/**
	 * Returns the meta object for the attribute
	 * '{@link no.ntnu.tdt4250.oving1.studies.Course#getCode <em>Code</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see no.ntnu.tdt4250.oving1.studies.Course#getCode()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Code();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.oving1.studies.Course#getStudyPoints <em>Study Points</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Study Points</em>'.
	 * @see no.ntnu.tdt4250.oving1.studies.Course#getStudyPoints()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_StudyPoints();

	/**
	 * Returns the meta object for the containment reference list '{@link no.ntnu.tdt4250.oving1.studies.Course#getCourseInstances <em>Course Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Course Instances</em>'.
	 * @see no.ntnu.tdt4250.oving1.studies.Course#getCourseInstances()
	 * @see #getCourse()
	 * @generated
	 */
	EReference getCourse_CourseInstances();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.oving1.studies.CourseInstance <em>Course Instance</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course Instance</em>'.
	 * @see no.ntnu.tdt4250.oving1.studies.CourseInstance
	 * @generated
	 */
	EClass getCourseInstance();

	/**
	 * Returns the meta object for the container reference '{@link no.ntnu.tdt4250.oving1.studies.CourseInstance#getCourse <em>Course</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Course</em>'.
	 * @see no.ntnu.tdt4250.oving1.studies.CourseInstance#getCourse()
	 * @see #getCourseInstance()
	 * @generated
	 */
	EReference getCourseInstance_Course();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.oving1.studies.CourseInstance#getYear <em>Year</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Year</em>'.
	 * @see no.ntnu.tdt4250.oving1.studies.CourseInstance#getYear()
	 * @see #getCourseInstance()
	 * @generated
	 */
	EAttribute getCourseInstance_Year();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.oving1.studies.CourseInstance#getSemester <em>Semester</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Semester</em>'.
	 * @see no.ntnu.tdt4250.oving1.studies.CourseInstance#getSemester()
	 * @see #getCourseInstance()
	 * @generated
	 */
	EAttribute getCourseInstance_Semester();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.oving1.studies.CourseInstance#getInstanceName <em>Instance Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Name</em>'.
	 * @see no.ntnu.tdt4250.oving1.studies.CourseInstance#getInstanceName()
	 * @see #getCourseInstance()
	 * @generated
	 */
	EAttribute getCourseInstance_InstanceName();

	/**
	 * Returns the meta object for class
	 * '{@link no.ntnu.tdt4250.oving1.studies.Study <em>Study</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Study</em>'.
	 * @see no.ntnu.tdt4250.oving1.studies.Study
	 * @generated
	 */
	EClass getStudy();

	/**
	 * Returns the meta object for the containment reference list '{@link no.ntnu.tdt4250.oving1.studies.Study#getStudyInstances <em>Study Instances</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Study Instances</em>'.
	 * @see no.ntnu.tdt4250.oving1.studies.Study#getStudyInstances()
	 * @see #getStudy()
	 * @generated
	 */
	EReference getStudy_StudyInstances();

	/**
	 * Returns the meta object for the attribute
	 * '{@link no.ntnu.tdt4250.oving1.studies.Study#getName <em>Name</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.ntnu.tdt4250.oving1.studies.Study#getName()
	 * @see #getStudy()
	 * @generated
	 */
	EAttribute getStudy_Name();

	/**
	 * Returns the meta object for the attribute
	 * '{@link no.ntnu.tdt4250.oving1.studies.Study#getCode <em>Code</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see no.ntnu.tdt4250.oving1.studies.Study#getCode()
	 * @see #getStudy()
	 * @generated
	 */
	EAttribute getStudy_Code();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.oving1.studies.StudyInstance <em>Study Instance</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Study Instance</em>'.
	 * @see no.ntnu.tdt4250.oving1.studies.StudyInstance
	 * @generated
	 */
	EClass getStudyInstance();

	/**
	 * Returns the meta object for the container reference '{@link no.ntnu.tdt4250.oving1.studies.StudyInstance#getStudy <em>Study</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Study</em>'.
	 * @see no.ntnu.tdt4250.oving1.studies.StudyInstance#getStudy()
	 * @see #getStudyInstance()
	 * @generated
	 */
	EReference getStudyInstance_Study();

	/**
	 * Returns the meta object for the containment reference '{@link no.ntnu.tdt4250.oving1.studies.StudyInstance#getStartYear <em>Start Year</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Start Year</em>'.
	 * @see no.ntnu.tdt4250.oving1.studies.StudyInstance#getStartYear()
	 * @see #getStudyInstance()
	 * @generated
	 */
	EReference getStudyInstance_StartYear();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.oving1.studies.StudyInstance#getYear <em>Year</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Year</em>'.
	 * @see no.ntnu.tdt4250.oving1.studies.StudyInstance#getYear()
	 * @see #getStudyInstance()
	 * @generated
	 */
	EAttribute getStudyInstance_Year();

	/**
	 * Returns the meta object for class
	 * '{@link no.ntnu.tdt4250.oving1.studies.StudyYear <em>Study Year</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Study Year</em>'.
	 * @see no.ntnu.tdt4250.oving1.studies.StudyYear
	 * @generated
	 */
	EClass getStudyYear();

	/**
	 * Returns the meta object for the containment reference list '{@link no.ntnu.tdt4250.oving1.studies.StudyYear#getNextYear <em>Next Year</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Next Year</em>'.
	 * @see no.ntnu.tdt4250.oving1.studies.StudyYear#getNextYear()
	 * @see #getStudyYear()
	 * @generated
	 */
	EReference getStudyYear_NextYear();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.oving1.studies.StudyYear#getProgramName <em>Program Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Program Name</em>'.
	 * @see no.ntnu.tdt4250.oving1.studies.StudyYear#getProgramName()
	 * @see #getStudyYear()
	 * @generated
	 */
	EAttribute getStudyYear_ProgramName();

	/**
	 * Returns the meta object for the containment reference '{@link no.ntnu.tdt4250.oving1.studies.StudyYear#getSpringSemester <em>Spring Semester</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Spring Semester</em>'.
	 * @see no.ntnu.tdt4250.oving1.studies.StudyYear#getSpringSemester()
	 * @see #getStudyYear()
	 * @generated
	 */
	EReference getStudyYear_SpringSemester();

	/**
	 * Returns the meta object for the containment reference '{@link no.ntnu.tdt4250.oving1.studies.StudyYear#getAutumnSemester <em>Autumn Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Autumn Semester</em>'.
	 * @see no.ntnu.tdt4250.oving1.studies.StudyYear#getAutumnSemester()
	 * @see #getStudyYear()
	 * @generated
	 */
	EReference getStudyYear_AutumnSemester();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.oving1.studies.StudyCourse <em>Study Course</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Study Course</em>'.
	 * @see no.ntnu.tdt4250.oving1.studies.StudyCourse
	 * @generated
	 */
	EClass getStudyCourse();

	/**
	 * Returns the meta object for the reference '{@link no.ntnu.tdt4250.oving1.studies.StudyCourse#getCourseInstance <em>Course Instance</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Course Instance</em>'.
	 * @see no.ntnu.tdt4250.oving1.studies.StudyCourse#getCourseInstance()
	 * @see #getStudyCourse()
	 * @generated
	 */
	EReference getStudyCourse_CourseInstance();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.oving1.studies.StudyCourse#isMandatory <em>Mandatory</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mandatory</em>'.
	 * @see no.ntnu.tdt4250.oving1.studies.StudyCourse#isMandatory()
	 * @see #getStudyCourse()
	 * @generated
	 */
	EAttribute getStudyCourse_Mandatory();

	/**
	 * Returns the meta object for class
	 * '{@link no.ntnu.tdt4250.oving1.studies.Semester <em>Semester</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Semester</em>'.
	 * @see no.ntnu.tdt4250.oving1.studies.Semester
	 * @generated
	 */
	EClass getSemester();

	/**
	 * Returns the meta object for the reference list '{@link no.ntnu.tdt4250.oving1.studies.Semester#getCourses <em>Courses</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Courses</em>'.
	 * @see no.ntnu.tdt4250.oving1.studies.Semester#getCourses()
	 * @see #getSemester()
	 * @generated
	 */
	EReference getSemester_Courses();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.oving1.studies.Semester#getStudyYearSemester <em>Study Year Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Study Year Semester</em>'.
	 * @see no.ntnu.tdt4250.oving1.studies.Semester#getStudyYearSemester()
	 * @see #getSemester()
	 * @generated
	 */
	EAttribute getSemester_StudyYearSemester();

	/**
	 * Returns the meta object for enum '{@link no.ntnu.tdt4250.oving1.studies.SemesterCode <em>Semester Code</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Semester Code</em>'.
	 * @see no.ntnu.tdt4250.oving1.studies.SemesterCode
	 * @generated
	 */
	EEnum getSemesterCode();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Course Code</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Course Code</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getCourseCode();

	/**
	 * Returns the factory that creates the instances of the model. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StudiesFactory getStudiesFactory();

	/**
	 * <!-- begin-user-doc --> Defines literals for the meta objects that represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each operation of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.oving1.studies.impl.UniversityImpl <em>University</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.oving1.studies.impl.UniversityImpl
		 * @see no.ntnu.tdt4250.oving1.studies.impl.StudiesPackageImpl#getUniversity()
		 * @generated
		 */
		EClass UNIVERSITY = eINSTANCE.getUniversity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIVERSITY__NAME = eINSTANCE.getUniversity_Name();

		/**
		 * The meta object literal for the '<em><b>Courses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIVERSITY__COURSES = eINSTANCE.getUniversity_Courses();

		/**
		 * The meta object literal for the '<em><b>Studies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIVERSITY__STUDIES = eINSTANCE.getUniversity_Studies();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.oving1.studies.impl.CourseImpl <em>Course</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.oving1.studies.impl.CourseImpl
		 * @see no.ntnu.tdt4250.oving1.studies.impl.StudiesPackageImpl#getCourse()
		 * @generated
		 */
		EClass COURSE = eINSTANCE.getCourse();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__NAME = eINSTANCE.getCourse_Name();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__CODE = eINSTANCE.getCourse_Code();

		/**
		 * The meta object literal for the '<em><b>Study Points</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__STUDY_POINTS = eINSTANCE.getCourse_StudyPoints();

		/**
		 * The meta object literal for the '<em><b>Course Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE__COURSE_INSTANCES = eINSTANCE.getCourse_CourseInstances();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.oving1.studies.impl.CourseInstanceImpl <em>Course Instance</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.oving1.studies.impl.CourseInstanceImpl
		 * @see no.ntnu.tdt4250.oving1.studies.impl.StudiesPackageImpl#getCourseInstance()
		 * @generated
		 */
		EClass COURSE_INSTANCE = eINSTANCE.getCourseInstance();

		/**
		 * The meta object literal for the '<em><b>Course</b></em>' container reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE_INSTANCE__COURSE = eINSTANCE.getCourseInstance_Course();

		/**
		 * The meta object literal for the '<em><b>Year</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE_INSTANCE__YEAR = eINSTANCE.getCourseInstance_Year();

		/**
		 * The meta object literal for the '<em><b>Semester</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE_INSTANCE__SEMESTER = eINSTANCE.getCourseInstance_Semester();

		/**
		 * The meta object literal for the '<em><b>Instance Name</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE_INSTANCE__INSTANCE_NAME = eINSTANCE.getCourseInstance_InstanceName();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.oving1.studies.impl.StudyImpl <em>Study</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.oving1.studies.impl.StudyImpl
		 * @see no.ntnu.tdt4250.oving1.studies.impl.StudiesPackageImpl#getStudy()
		 * @generated
		 */
		EClass STUDY = eINSTANCE.getStudy();

		/**
		 * The meta object literal for the '<em><b>Study Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDY__STUDY_INSTANCES = eINSTANCE.getStudy_StudyInstances();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDY__NAME = eINSTANCE.getStudy_Name();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDY__CODE = eINSTANCE.getStudy_Code();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.oving1.studies.impl.StudyInstanceImpl <em>Study Instance</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.oving1.studies.impl.StudyInstanceImpl
		 * @see no.ntnu.tdt4250.oving1.studies.impl.StudiesPackageImpl#getStudyInstance()
		 * @generated
		 */
		EClass STUDY_INSTANCE = eINSTANCE.getStudyInstance();

		/**
		 * The meta object literal for the '<em><b>Study</b></em>' container reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDY_INSTANCE__STUDY = eINSTANCE.getStudyInstance_Study();

		/**
		 * The meta object literal for the '<em><b>Start Year</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDY_INSTANCE__START_YEAR = eINSTANCE.getStudyInstance_StartYear();

		/**
		 * The meta object literal for the '<em><b>Year</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDY_INSTANCE__YEAR = eINSTANCE.getStudyInstance_Year();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.oving1.studies.impl.StudyYearImpl <em>Study Year</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.oving1.studies.impl.StudyYearImpl
		 * @see no.ntnu.tdt4250.oving1.studies.impl.StudiesPackageImpl#getStudyYear()
		 * @generated
		 */
		EClass STUDY_YEAR = eINSTANCE.getStudyYear();

		/**
		 * The meta object literal for the '<em><b>Next Year</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDY_YEAR__NEXT_YEAR = eINSTANCE.getStudyYear_NextYear();

		/**
		 * The meta object literal for the '<em><b>Program Name</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDY_YEAR__PROGRAM_NAME = eINSTANCE.getStudyYear_ProgramName();

		/**
		 * The meta object literal for the '<em><b>Spring Semester</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDY_YEAR__SPRING_SEMESTER = eINSTANCE.getStudyYear_SpringSemester();

		/**
		 * The meta object literal for the '<em><b>Autumn Semester</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDY_YEAR__AUTUMN_SEMESTER = eINSTANCE.getStudyYear_AutumnSemester();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.oving1.studies.impl.StudyCourseImpl <em>Study Course</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.oving1.studies.impl.StudyCourseImpl
		 * @see no.ntnu.tdt4250.oving1.studies.impl.StudiesPackageImpl#getStudyCourse()
		 * @generated
		 */
		EClass STUDY_COURSE = eINSTANCE.getStudyCourse();

		/**
		 * The meta object literal for the '<em><b>Course Instance</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDY_COURSE__COURSE_INSTANCE = eINSTANCE.getStudyCourse_CourseInstance();

		/**
		 * The meta object literal for the '<em><b>Mandatory</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDY_COURSE__MANDATORY = eINSTANCE.getStudyCourse_Mandatory();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.oving1.studies.impl.SemesterImpl <em>Semester</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.oving1.studies.impl.SemesterImpl
		 * @see no.ntnu.tdt4250.oving1.studies.impl.StudiesPackageImpl#getSemester()
		 * @generated
		 */
		EClass SEMESTER = eINSTANCE.getSemester();

		/**
		 * The meta object literal for the '<em><b>Courses</b></em>' reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMESTER__COURSES = eINSTANCE.getSemester_Courses();

		/**
		 * The meta object literal for the '<em><b>Study Year Semester</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMESTER__STUDY_YEAR_SEMESTER = eINSTANCE.getSemester_StudyYearSemester();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.oving1.studies.SemesterCode <em>Semester Code</em>}' enum.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.oving1.studies.SemesterCode
		 * @see no.ntnu.tdt4250.oving1.studies.impl.StudiesPackageImpl#getSemesterCode()
		 * @generated
		 */
		EEnum SEMESTER_CODE = eINSTANCE.getSemesterCode();

		/**
		 * The meta object literal for the '<em>Course Code</em>' data type. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see java.lang.String
		 * @see no.ntnu.tdt4250.oving1.studies.impl.StudiesPackageImpl#getCourseCode()
		 * @generated
		 */
		EDataType COURSE_CODE = eINSTANCE.getCourseCode();

	}

} // StudiesPackage

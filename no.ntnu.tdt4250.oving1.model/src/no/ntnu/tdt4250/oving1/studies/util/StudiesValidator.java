/**
 */
package no.ntnu.tdt4250.oving1.studies.util;

import java.util.Map;

import no.ntnu.tdt4250.oving1.studies.*;

import org.eclipse.acceleo.query.delegates.AQLValidationDelegate;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator.ValidationDelegate;
import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see no.ntnu.tdt4250.oving1.studies.StudiesPackage
 * @generated
 */
public class StudiesValidator extends EObjectValidator {
	static {
		ValidationDelegate.Registry.INSTANCE.put("http://www.eclipse.org/acceleo/query/1.0", new AQLValidationDelegate());
	}
	
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final StudiesValidator INSTANCE = new StudiesValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "no.ntnu.tdt4250.oving1.studies";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StudiesValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return StudiesPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case StudiesPackage.UNIVERSITY:
				return validateUniversity((University)value, diagnostics, context);
			case StudiesPackage.COURSE:
				return validateCourse((Course)value, diagnostics, context);
			case StudiesPackage.COURSE_INSTANCE:
				return validateCourseInstance((CourseInstance)value, diagnostics, context);
			case StudiesPackage.STUDY:
				return validateStudy((Study)value, diagnostics, context);
			case StudiesPackage.STUDY_INSTANCE:
				return validateStudyInstance((StudyInstance)value, diagnostics, context);
			case StudiesPackage.STUDY_YEAR:
				return validateStudyYear((StudyYear)value, diagnostics, context);
			case StudiesPackage.STUDY_COURSE:
				return validateStudyCourse((StudyCourse)value, diagnostics, context);
			case StudiesPackage.SEMESTER:
				return validateSemester((Semester)value, diagnostics, context);
			case StudiesPackage.SEMESTER_CODE:
				return validateSemesterCode((SemesterCode)value, diagnostics, context);
			case StudiesPackage.COURSE_CODE:
				return validateCourseCode((String)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUniversity(University university, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(university, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourse(Course course, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(course, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(course, diagnostics, context);
		if (result || diagnostics != null) result &= validateCourse_shouldStartWith2Or3Letters(course, diagnostics, context);
		if (result || diagnostics != null) result &= validateCourse_shouldEndWithNumbers(course, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the shouldStartWith2Or3Letters constraint of '<em>Course</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COURSE__SHOULD_START_WITH2_OR3_LETTERS__EEXPRESSION = "self.code.matches('^[A-Z]{2,3}.*')";

	/**
	 * Validates the shouldStartWith2Or3Letters constraint of '<em>Course</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourse_shouldStartWith2Or3Letters(Course course, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StudiesPackage.Literals.COURSE,
				 course,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/acceleo/query/1.0",
				 "shouldStartWith2Or3Letters",
				 COURSE__SHOULD_START_WITH2_OR3_LETTERS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the shouldEndWithNumbers constraint of '<em>Course</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COURSE__SHOULD_END_WITH_NUMBERS__EEXPRESSION = "self.code.matches('.*[0-9]{4}$')";

	/**
	 * Validates the shouldEndWithNumbers constraint of '<em>Course</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourse_shouldEndWithNumbers(Course course, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StudiesPackage.Literals.COURSE,
				 course,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/acceleo/query/1.0",
				 "shouldEndWithNumbers",
				 COURSE__SHOULD_END_WITH_NUMBERS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourseInstance(CourseInstance courseInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(courseInstance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStudy(Study study, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(study, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStudyInstance(StudyInstance studyInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(studyInstance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStudyYear(StudyYear studyYear, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(studyYear, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(studyYear, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(studyYear, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(studyYear, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(studyYear, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(studyYear, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(studyYear, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(studyYear, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(studyYear, diagnostics, context);
		if (result || diagnostics != null) result &= validateStudyYear_springContainsOnlySpringClasses(studyYear, diagnostics, context);
		if (result || diagnostics != null) result &= validateStudyYear_fallContainsOnlyFallClasses(studyYear, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the springContainsOnlySpringClasses constraint of '<em>Study Year</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STUDY_YEAR__SPRING_CONTAINS_ONLY_SPRING_CLASSES__EEXPRESSION = "if self.springSemester <> null then self.springSemester.courses.semester.name->exists(name | name <> 'Spring') else true endif";

	/**
	 * Validates the springContainsOnlySpringClasses constraint of '<em>Study Year</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStudyYear_springContainsOnlySpringClasses(StudyYear studyYear, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StudiesPackage.Literals.STUDY_YEAR,
				 studyYear,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/acceleo/query/1.0",
				 "springContainsOnlySpringClasses",
				 STUDY_YEAR__SPRING_CONTAINS_ONLY_SPRING_CLASSES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * Validates the fallContainsOnlyFallClasses constraint of '<em>Study Year</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStudyYear_fallContainsOnlyFallClasses(StudyYear studyYear, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "fallContainsOnlyFallClasses", getObjectLabel(studyYear, context) },
						 new Object[] { studyYear },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStudyCourse(StudyCourse studyCourse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(studyCourse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemester(Semester semester, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(semester, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validateSemester_shouldHave30StudyPoints(semester, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the shouldHave30StudyPoints constraint of '<em>Semester</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SEMESTER__SHOULD_HAVE30_STUDY_POINTS__EEXPRESSION = "self.courses.course.studyPoints->sum() = 30.0";

	/**
	 * Validates the shouldHave30StudyPoints constraint of '<em>Semester</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemester_shouldHave30StudyPoints(Semester semester, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StudiesPackage.Literals.SEMESTER,
				 semester,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/acceleo/query/1.0",
				 "shouldHave30StudyPoints",
				 SEMESTER__SHOULD_HAVE30_STUDY_POINTS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemesterCode(SemesterCode semesterCode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourseCode(String courseCode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //StudiesValidator

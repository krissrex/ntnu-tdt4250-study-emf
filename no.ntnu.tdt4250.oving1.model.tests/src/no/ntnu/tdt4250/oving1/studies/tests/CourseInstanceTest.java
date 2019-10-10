/**
 */
package no.ntnu.tdt4250.oving1.studies.tests;

import static org.junit.Assert.assertThat;

import org.hamcrest.core.Is;

import junit.framework.TestCase;

import junit.textui.TestRunner;
import no.ntnu.tdt4250.oving1.studies.Course;
import no.ntnu.tdt4250.oving1.studies.CourseInstance;
import no.ntnu.tdt4250.oving1.studies.SemesterCode;
import no.ntnu.tdt4250.oving1.studies.StudiesFactory;

/**
 * <!-- begin-user-doc --> A test case for the model object '<em><b>Course
 * Instance</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.oving1.studies.CourseInstance#getInstanceName() <em>Instance Name</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class CourseInstanceTest extends TestCase {

    /**
	 * The fixture for this Course Instance test case.
	 * <!-- begin-user-doc --> <!--
     * end-user-doc -->
	 * @generated
	 */
    protected CourseInstance fixture = null;

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    public static void main(String[] args) {
		TestRunner.run(CourseInstanceTest.class);
	}

    /**
     * Constructs a new Course Instance test case with the given name. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public CourseInstanceTest(String name) {
		super(name);
	}

    /**
	 * Sets the fixture for this Course Instance test case.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected void setFixture(CourseInstance fixture) {
		this.fixture = fixture;
	}

    /**
	 * Returns the fixture for this Course Instance test case.
	 * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
	 * @generated
	 */
    protected CourseInstance getFixture() {
		return fixture;
	}

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see junit.framework.TestCase#setUp()
     * @generated NOT
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(StudiesFactory.eINSTANCE.createCourseInstance());
    }

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
    @Override
    protected void tearDown() throws Exception {
		setFixture(null);
	}

//	public void testAqlWorks() {
//		QueryEvaluationEngine engine = new QueryEvaluationEngine(queryEnvironment);
//		Map<String, Object> variables = Maps.newHashMap();
//		variables.put("self", EcorePackage.eINSTANCE);
//		EvaluationResult evaluationResult = engine.eval(astResult, variables);
//	}

    /**
     * Tests the
     * '{@link no.ntnu.tdt4250.oving1.studies.CourseInstance#getInstanceName()
     * <em>Instance Name</em>}' feature getter. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see no.ntnu.tdt4250.oving1.studies.CourseInstance#getInstanceName()
     * @generated NOT
     */
    public void testGetInstanceName() {
        Course course = StudiesFactory.eINSTANCE.createCourse();
        course.setName("Avansert programvaredesign");
        course.setCode("TDT4290");
        course.setStudyPoints(7.5f);
        fixture.setCourse(course);
        fixture.setSemester(SemesterCode.AUTUMN);
        fixture.setYear(2019);

        // When
        String instanceName = null;

        instanceName = fixture.getInstanceName();

        // Then
        assertThat(instanceName, Is.is("Avansert programvaredesign - Autumn 2019"));
    }

} // CourseInstanceTest

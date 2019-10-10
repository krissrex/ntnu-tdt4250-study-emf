/**
 */
package no.ntnu.tdt4250.oving1.studies.tests;

import static org.junit.Assert.assertThat;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.hamcrest.core.Is;
import junit.framework.TestCase;
import junit.textui.TestRunner;
import no.ntnu.tdt4250.oving1.studies.Course;
import no.ntnu.tdt4250.oving1.studies.StudiesFactory;
import no.ntnu.tdt4250.oving1.studies.impl.StudiesPackageImpl;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CourseTest extends TestCase {

	/**
	 * The fixture for this Course test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Course fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CourseTest.class);
	}

	/**
	 * Constructs a new Course test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CourseTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Course test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Course fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Course test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Course getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(StudiesFactory.eINSTANCE.createCourse());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}
	
	public void testValidName() throws Exception {
		fixture.setCode("TDT4290");
		
		Diagnostic isValid = Diagnostician.INSTANCE.validate(fixture);
		
		assertThat(isValid.toString(), isValid.getSeverity(), Is.is(Diagnostic.OK));
	}
	
	public void testInvalidName_tooFewDigits() throws Exception {
		fixture.setCode("TDT429");
		
		Diagnostic isValid = Diagnostician.INSTANCE.validate(fixture);
		
		assertThat(isValid.getSeverity(), Is.is(Diagnostic.ERROR));
	}
	
	public void testInvalidName_tooFewLetters() throws Exception {
		fixture.setCode("T4290");
		
		Diagnostic isValid = Diagnostician.INSTANCE.validate(fixture);
		
		assertThat(isValid.getSeverity(), Is.is(Diagnostic.ERROR));
	}

} //CourseTest

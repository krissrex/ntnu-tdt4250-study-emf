/**
 */
package no.ntnu.tdt4250.oving1.studies.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import no.ntnu.tdt4250.oving1.studies.StudiesFactory;
import no.ntnu.tdt4250.oving1.studies.StudyCourse;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Study Course</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StudyCourseTest extends TestCase {

	/**
	 * The fixture for this Study Course test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StudyCourse fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StudyCourseTest.class);
	}

	/**
	 * Constructs a new Study Course test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StudyCourseTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Study Course test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(StudyCourse fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Study Course test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StudyCourse getFixture() {
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
		setFixture(StudiesFactory.eINSTANCE.createStudyCourse());
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

} //StudyCourseTest

/**
 */
package no.ntnu.tdt4250.oving1.studies.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import no.ntnu.tdt4250.oving1.studies.StudiesFactory;
import no.ntnu.tdt4250.oving1.studies.StudyYear;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Study Year</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StudyYearTest extends TestCase {

	/**
	 * The fixture for this Study Year test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StudyYear fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StudyYearTest.class);
	}

	/**
	 * Constructs a new Study Year test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StudyYearTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Study Year test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(StudyYear fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Study Year test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StudyYear getFixture() {
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
		setFixture(StudiesFactory.eINSTANCE.createStudyYear());
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

} //StudyYearTest

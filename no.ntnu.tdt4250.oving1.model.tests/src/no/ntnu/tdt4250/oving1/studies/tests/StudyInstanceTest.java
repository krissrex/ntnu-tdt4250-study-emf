/**
 */
package no.ntnu.tdt4250.oving1.studies.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import no.ntnu.tdt4250.oving1.studies.StudiesFactory;
import no.ntnu.tdt4250.oving1.studies.StudyInstance;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Study Instance</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StudyInstanceTest extends TestCase {

	/**
	 * The fixture for this Study Instance test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StudyInstance fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StudyInstanceTest.class);
	}

	/**
	 * Constructs a new Study Instance test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StudyInstanceTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Study Instance test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(StudyInstance fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Study Instance test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StudyInstance getFixture() {
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
		setFixture(StudiesFactory.eINSTANCE.createStudyInstance());
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

} //StudyInstanceTest

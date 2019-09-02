/**
 */
package no.ntnu.tdt4250.oving1.studies.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import no.ntnu.tdt4250.oving1.studies.StudiesFactory;
import no.ntnu.tdt4250.oving1.studies.Study;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Study</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StudyTest extends TestCase {

	/**
	 * The fixture for this Study test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Study fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StudyTest.class);
	}

	/**
	 * Constructs a new Study test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StudyTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Study test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Study fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Study test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Study getFixture() {
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
		setFixture(StudiesFactory.eINSTANCE.createStudy());
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

} //StudyTest

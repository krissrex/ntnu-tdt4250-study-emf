/**
 */
package no.ntnu.tdt4250.oving1.studies.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>studies</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class StudiesTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new StudiesTests("studies Tests");
		suite.addTestSuite(CourseInstanceTest.class);
		suite.addTestSuite(SemesterTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StudiesTests(String name) {
		super(name);
	}

} //StudiesTests

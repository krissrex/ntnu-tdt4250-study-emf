/**
 */
package no.ntnu.tdt4250.oving1.studies.impl;

import java.util.Collection;

import no.ntnu.tdt4250.oving1.studies.CourseInstance;
import no.ntnu.tdt4250.oving1.studies.Semester;
import no.ntnu.tdt4250.oving1.studies.StudiesPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Semester</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.oving1.studies.impl.SemesterImpl#getCourses <em>Courses</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.oving1.studies.impl.SemesterImpl#getStudyYearSemester <em>Study Year Semester</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SemesterImpl extends MinimalEObjectImpl.Container implements Semester {
	/**
	 * The cached value of the '{@link #getCourses() <em>Courses</em>}' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getCourses()
	 * @generated
	 * @ordered
	 */
	protected EList<CourseInstance> courses;

	/**
	 * The cached setting delegate for the '{@link #getStudyYearSemester() <em>Study Year Semester</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudyYearSemester()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate STUDY_YEAR_SEMESTER__ESETTING_DELEGATE = ((EStructuralFeature.Internal)StudiesPackage.Literals.SEMESTER__STUDY_YEAR_SEMESTER).getSettingDelegate();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected SemesterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StudiesPackage.Literals.SEMESTER;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<CourseInstance> getCourses() {
		if (courses == null) {
			courses = new EObjectResolvingEList<CourseInstance>(CourseInstance.class, this, StudiesPackage.SEMESTER__COURSES);
		}
		return courses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStudyYearSemester() {
		return (String)STUDY_YEAR_SEMESTER__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StudiesPackage.SEMESTER__COURSES:
				return getCourses();
			case StudiesPackage.SEMESTER__STUDY_YEAR_SEMESTER:
				return getStudyYearSemester();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StudiesPackage.SEMESTER__COURSES:
				getCourses().clear();
				getCourses().addAll((Collection<? extends CourseInstance>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case StudiesPackage.SEMESTER__COURSES:
				getCourses().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case StudiesPackage.SEMESTER__COURSES:
				return courses != null && !courses.isEmpty();
			case StudiesPackage.SEMESTER__STUDY_YEAR_SEMESTER:
				return STUDY_YEAR_SEMESTER__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

} // SemesterImpl

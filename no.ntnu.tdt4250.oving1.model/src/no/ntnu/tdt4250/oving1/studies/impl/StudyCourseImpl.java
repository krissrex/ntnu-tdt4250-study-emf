/**
 */
package no.ntnu.tdt4250.oving1.studies.impl;

import no.ntnu.tdt4250.oving1.studies.CourseInstance;
import no.ntnu.tdt4250.oving1.studies.StudiesPackage;
import no.ntnu.tdt4250.oving1.studies.StudyCourse;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Study
 * Course</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.oving1.studies.impl.StudyCourseImpl#getCourseInstance <em>Course Instance</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.oving1.studies.impl.StudyCourseImpl#isMandatory <em>Mandatory</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StudyCourseImpl extends MinimalEObjectImpl.Container implements StudyCourse {
	/**
	 * The cached value of the '{@link #getCourseInstance() <em>Course Instance</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getCourseInstance()
	 * @generated
	 * @ordered
	 */
	protected CourseInstance courseInstance;
	/**
	 * The default value of the '{@link #isMandatory() <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isMandatory()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MANDATORY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMandatory() <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isMandatory()
	 * @generated
	 * @ordered
	 */
	protected boolean mandatory = MANDATORY_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected StudyCourseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StudiesPackage.Literals.STUDY_COURSE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public CourseInstance getCourseInstance() {
		if (courseInstance != null && courseInstance.eIsProxy()) {
			InternalEObject oldCourseInstance = (InternalEObject)courseInstance;
			courseInstance = (CourseInstance)eResolveProxy(oldCourseInstance);
			if (courseInstance != oldCourseInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StudiesPackage.STUDY_COURSE__COURSE_INSTANCE, oldCourseInstance, courseInstance));
			}
		}
		return courseInstance;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public CourseInstance basicGetCourseInstance() {
		return courseInstance;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setCourseInstance(CourseInstance newCourseInstance) {
		CourseInstance oldCourseInstance = courseInstance;
		courseInstance = newCourseInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudiesPackage.STUDY_COURSE__COURSE_INSTANCE, oldCourseInstance, courseInstance));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMandatory() {
		return mandatory;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setMandatory(boolean newMandatory) {
		boolean oldMandatory = mandatory;
		mandatory = newMandatory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudiesPackage.STUDY_COURSE__MANDATORY, oldMandatory, mandatory));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StudiesPackage.STUDY_COURSE__COURSE_INSTANCE:
				if (resolve) return getCourseInstance();
				return basicGetCourseInstance();
			case StudiesPackage.STUDY_COURSE__MANDATORY:
				return isMandatory();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StudiesPackage.STUDY_COURSE__COURSE_INSTANCE:
				setCourseInstance((CourseInstance)newValue);
				return;
			case StudiesPackage.STUDY_COURSE__MANDATORY:
				setMandatory((Boolean)newValue);
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
			case StudiesPackage.STUDY_COURSE__COURSE_INSTANCE:
				setCourseInstance((CourseInstance)null);
				return;
			case StudiesPackage.STUDY_COURSE__MANDATORY:
				setMandatory(MANDATORY_EDEFAULT);
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
			case StudiesPackage.STUDY_COURSE__COURSE_INSTANCE:
				return courseInstance != null;
			case StudiesPackage.STUDY_COURSE__MANDATORY:
				return mandatory != MANDATORY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (mandatory: ");
		result.append(mandatory);
		result.append(')');
		return result.toString();
	}

} // StudyCourseImpl

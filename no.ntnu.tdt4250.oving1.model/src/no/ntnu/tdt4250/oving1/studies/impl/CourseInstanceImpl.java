/**
 */
package no.ntnu.tdt4250.oving1.studies.impl;

import no.ntnu.tdt4250.oving1.studies.Course;
import no.ntnu.tdt4250.oving1.studies.CourseInstance;
import no.ntnu.tdt4250.oving1.studies.SemesterCode;
import no.ntnu.tdt4250.oving1.studies.StudiesPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Course
 * Instance</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.oving1.studies.impl.CourseInstanceImpl#getCourse <em>Course</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.oving1.studies.impl.CourseInstanceImpl#getYear <em>Year</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.oving1.studies.impl.CourseInstanceImpl#getSemester <em>Semester</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.oving1.studies.impl.CourseInstanceImpl#getInstanceName <em>Instance Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CourseInstanceImpl extends MinimalEObjectImpl.Container implements CourseInstance {
	/**
	 * The default value of the '{@link #getYear() <em>Year</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected static final int YEAR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getYear() <em>Year</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected int year = YEAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getSemester() <em>Semester</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemester()
	 * @generated
	 * @ordered
	 */
	protected static final SemesterCode SEMESTER_EDEFAULT = SemesterCode.SPRING;

	/**
	 * The cached value of the '{@link #getSemester() <em>Semester</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSemester()
	 * @generated
	 * @ordered
	 */
	protected SemesterCode semester = SEMESTER_EDEFAULT;

	/**
	 * The cached setting delegate for the '{@link #getInstanceName() <em>Instance Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getInstanceName()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate INSTANCE_NAME__ESETTING_DELEGATE = ((EStructuralFeature.Internal)StudiesPackage.Literals.COURSE_INSTANCE__INSTANCE_NAME).getSettingDelegate();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected CourseInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StudiesPackage.Literals.COURSE_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Course getCourse() {
		if (eContainerFeatureID() != StudiesPackage.COURSE_INSTANCE__COURSE) return null;
		return (Course)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCourse(Course newCourse, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCourse, StudiesPackage.COURSE_INSTANCE__COURSE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setCourse(Course newCourse) {
		if (newCourse != eInternalContainer() || (eContainerFeatureID() != StudiesPackage.COURSE_INSTANCE__COURSE && newCourse != null)) {
			if (EcoreUtil.isAncestor(this, newCourse))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCourse != null)
				msgs = ((InternalEObject)newCourse).eInverseAdd(this, StudiesPackage.COURSE__COURSE_INSTANCES, Course.class, msgs);
			msgs = basicSetCourse(newCourse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudiesPackage.COURSE_INSTANCE__COURSE, newCourse, newCourse));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getYear() {
		return year;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setYear(int newYear) {
		int oldYear = year;
		year = newYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudiesPackage.COURSE_INSTANCE__YEAR, oldYear, year));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SemesterCode getSemester() {
		return semester;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setSemester(SemesterCode newSemester) {
		SemesterCode oldSemester = semester;
		semester = newSemester == null ? SEMESTER_EDEFAULT : newSemester;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudiesPackage.COURSE_INSTANCE__SEMESTER, oldSemester, semester));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getInstanceName() {
		return (String)INSTANCE_NAME__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StudiesPackage.COURSE_INSTANCE__COURSE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCourse((Course)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StudiesPackage.COURSE_INSTANCE__COURSE:
				return basicSetCourse(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case StudiesPackage.COURSE_INSTANCE__COURSE:
				return eInternalContainer().eInverseRemove(this, StudiesPackage.COURSE__COURSE_INSTANCES, Course.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	// return String.format("%s - %s %s", this.getCourse().getName(),
	// this.getSemester(), this.getYear());

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StudiesPackage.COURSE_INSTANCE__COURSE:
				return getCourse();
			case StudiesPackage.COURSE_INSTANCE__YEAR:
				return getYear();
			case StudiesPackage.COURSE_INSTANCE__SEMESTER:
				return getSemester();
			case StudiesPackage.COURSE_INSTANCE__INSTANCE_NAME:
				return getInstanceName();
		}
		return super.eGet(featureID, resolve, coreType);
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StudiesPackage.COURSE_INSTANCE__COURSE:
				setCourse((Course)newValue);
				return;
			case StudiesPackage.COURSE_INSTANCE__YEAR:
				setYear((Integer)newValue);
				return;
			case StudiesPackage.COURSE_INSTANCE__SEMESTER:
				setSemester((SemesterCode)newValue);
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
			case StudiesPackage.COURSE_INSTANCE__COURSE:
				setCourse((Course)null);
				return;
			case StudiesPackage.COURSE_INSTANCE__YEAR:
				setYear(YEAR_EDEFAULT);
				return;
			case StudiesPackage.COURSE_INSTANCE__SEMESTER:
				setSemester(SEMESTER_EDEFAULT);
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
			case StudiesPackage.COURSE_INSTANCE__COURSE:
				return getCourse() != null;
			case StudiesPackage.COURSE_INSTANCE__YEAR:
				return year != YEAR_EDEFAULT;
			case StudiesPackage.COURSE_INSTANCE__SEMESTER:
				return semester != SEMESTER_EDEFAULT;
			case StudiesPackage.COURSE_INSTANCE__INSTANCE_NAME:
				return INSTANCE_NAME__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
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
		result.append(" (year: ");
		result.append(year);
		result.append(", semester: ");
		result.append(semester);
		result.append(')');
		return result.toString();
	}

} // CourseInstanceImpl

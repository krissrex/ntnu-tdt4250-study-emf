/**
 */
package no.ntnu.tdt4250.oving1.studies.impl;

import java.util.Collection;
import no.ntnu.tdt4250.oving1.studies.Course;
import no.ntnu.tdt4250.oving1.studies.CourseInstance;
import no.ntnu.tdt4250.oving1.studies.StudiesPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Course</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.oving1.studies.impl.CourseImpl#getName <em>Name</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.oving1.studies.impl.CourseImpl#getCode <em>Code</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.oving1.studies.impl.CourseImpl#getStudyPoints <em>Study Points</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.oving1.studies.impl.CourseImpl#getCourseInstances <em>Course Instances</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CourseImpl extends MinimalEObjectImpl.Container implements Course {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected String code = CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStudyPoints() <em>Study Points</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getStudyPoints()
	 * @generated
	 * @ordered
	 */
	protected static final float STUDY_POINTS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getStudyPoints() <em>Study Points</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getStudyPoints()
	 * @generated
	 * @ordered
	 */
	protected float studyPoints = STUDY_POINTS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCourseInstances() <em>Course Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<CourseInstance> courseInstances;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected CourseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StudiesPackage.Literals.COURSE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudiesPackage.COURSE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(String newCode) {
		String oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudiesPackage.COURSE__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public float getStudyPoints() {
		return studyPoints;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setStudyPoints(float newStudyPoints) {
		float oldStudyPoints = studyPoints;
		studyPoints = newStudyPoints;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudiesPackage.COURSE__STUDY_POINTS, oldStudyPoints, studyPoints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CourseInstance> getCourseInstances() {
		if (courseInstances == null) {
			courseInstances = new EObjectContainmentWithInverseEList<CourseInstance>(CourseInstance.class, this, StudiesPackage.COURSE__COURSE_INSTANCES, StudiesPackage.COURSE_INSTANCE__COURSE);
		}
		return courseInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StudiesPackage.COURSE__COURSE_INSTANCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCourseInstances()).basicAdd(otherEnd, msgs);
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
			case StudiesPackage.COURSE__COURSE_INSTANCES:
				return ((InternalEList<?>)getCourseInstances()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StudiesPackage.COURSE__NAME:
				return getName();
			case StudiesPackage.COURSE__CODE:
				return getCode();
			case StudiesPackage.COURSE__STUDY_POINTS:
				return getStudyPoints();
			case StudiesPackage.COURSE__COURSE_INSTANCES:
				return getCourseInstances();
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
			case StudiesPackage.COURSE__NAME:
				setName((String)newValue);
				return;
			case StudiesPackage.COURSE__CODE:
				setCode((String)newValue);
				return;
			case StudiesPackage.COURSE__STUDY_POINTS:
				setStudyPoints((Float)newValue);
				return;
			case StudiesPackage.COURSE__COURSE_INSTANCES:
				getCourseInstances().clear();
				getCourseInstances().addAll((Collection<? extends CourseInstance>)newValue);
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
			case StudiesPackage.COURSE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case StudiesPackage.COURSE__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case StudiesPackage.COURSE__STUDY_POINTS:
				setStudyPoints(STUDY_POINTS_EDEFAULT);
				return;
			case StudiesPackage.COURSE__COURSE_INSTANCES:
				getCourseInstances().clear();
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
			case StudiesPackage.COURSE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case StudiesPackage.COURSE__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case StudiesPackage.COURSE__STUDY_POINTS:
				return studyPoints != STUDY_POINTS_EDEFAULT;
			case StudiesPackage.COURSE__COURSE_INSTANCES:
				return courseInstances != null && !courseInstances.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", code: ");
		result.append(code);
		result.append(", studyPoints: ");
		result.append(studyPoints);
		result.append(')');
		return result.toString();
	}

} // CourseImpl

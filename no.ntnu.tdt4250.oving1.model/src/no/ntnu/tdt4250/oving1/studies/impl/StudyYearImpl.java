/**
 */
package no.ntnu.tdt4250.oving1.studies.impl;

import java.util.Collection;

import no.ntnu.tdt4250.oving1.studies.Semester;
import no.ntnu.tdt4250.oving1.studies.StudiesPackage;
import no.ntnu.tdt4250.oving1.studies.StudyYear;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Study Year</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.oving1.studies.impl.StudyYearImpl#getNextYear <em>Next Year</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.oving1.studies.impl.StudyYearImpl#getProgramName <em>Program Name</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.oving1.studies.impl.StudyYearImpl#getSpringSemester <em>Spring Semester</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.oving1.studies.impl.StudyYearImpl#getFallSemester <em>Fall Semester</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StudyYearImpl extends MinimalEObjectImpl.Container implements StudyYear {
	/**
	 * The cached value of the '{@link #getNextYear() <em>Next Year</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextYear()
	 * @generated
	 * @ordered
	 */
	protected EList<StudyYear> nextYear;

	/**
	 * The default value of the '{@link #getProgramName() <em>Program Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramName()
	 * @generated
	 * @ordered
	 */
	protected static final String PROGRAM_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProgramName() <em>Program Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramName()
	 * @generated
	 * @ordered
	 */
	protected String programName = PROGRAM_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSpringSemester() <em>Spring Semester</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpringSemester()
	 * @generated
	 * @ordered
	 */
	protected Semester springSemester;

	/**
	 * The cached value of the '{@link #getFallSemester() <em>Fall Semester</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFallSemester()
	 * @generated
	 * @ordered
	 */
	protected Semester fallSemester;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StudyYearImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StudiesPackage.Literals.STUDY_YEAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StudyYear> getNextYear() {
		if (nextYear == null) {
			nextYear = new EObjectContainmentEList<StudyYear>(StudyYear.class, this, StudiesPackage.STUDY_YEAR__NEXT_YEAR);
		}
		return nextYear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProgramName() {
		return programName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProgramName(String newProgramName) {
		String oldProgramName = programName;
		programName = newProgramName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudiesPackage.STUDY_YEAR__PROGRAM_NAME, oldProgramName, programName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Semester getSpringSemester() {
		return springSemester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpringSemester(Semester newSpringSemester, NotificationChain msgs) {
		Semester oldSpringSemester = springSemester;
		springSemester = newSpringSemester;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StudiesPackage.STUDY_YEAR__SPRING_SEMESTER, oldSpringSemester, newSpringSemester);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpringSemester(Semester newSpringSemester) {
		if (newSpringSemester != springSemester) {
			NotificationChain msgs = null;
			if (springSemester != null)
				msgs = ((InternalEObject)springSemester).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StudiesPackage.STUDY_YEAR__SPRING_SEMESTER, null, msgs);
			if (newSpringSemester != null)
				msgs = ((InternalEObject)newSpringSemester).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StudiesPackage.STUDY_YEAR__SPRING_SEMESTER, null, msgs);
			msgs = basicSetSpringSemester(newSpringSemester, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudiesPackage.STUDY_YEAR__SPRING_SEMESTER, newSpringSemester, newSpringSemester));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Semester getFallSemester() {
		return fallSemester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFallSemester(Semester newFallSemester, NotificationChain msgs) {
		Semester oldFallSemester = fallSemester;
		fallSemester = newFallSemester;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StudiesPackage.STUDY_YEAR__FALL_SEMESTER, oldFallSemester, newFallSemester);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFallSemester(Semester newFallSemester) {
		if (newFallSemester != fallSemester) {
			NotificationChain msgs = null;
			if (fallSemester != null)
				msgs = ((InternalEObject)fallSemester).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StudiesPackage.STUDY_YEAR__FALL_SEMESTER, null, msgs);
			if (newFallSemester != null)
				msgs = ((InternalEObject)newFallSemester).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StudiesPackage.STUDY_YEAR__FALL_SEMESTER, null, msgs);
			msgs = basicSetFallSemester(newFallSemester, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudiesPackage.STUDY_YEAR__FALL_SEMESTER, newFallSemester, newFallSemester));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StudiesPackage.STUDY_YEAR__NEXT_YEAR:
				return ((InternalEList<?>)getNextYear()).basicRemove(otherEnd, msgs);
			case StudiesPackage.STUDY_YEAR__SPRING_SEMESTER:
				return basicSetSpringSemester(null, msgs);
			case StudiesPackage.STUDY_YEAR__FALL_SEMESTER:
				return basicSetFallSemester(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StudiesPackage.STUDY_YEAR__NEXT_YEAR:
				return getNextYear();
			case StudiesPackage.STUDY_YEAR__PROGRAM_NAME:
				return getProgramName();
			case StudiesPackage.STUDY_YEAR__SPRING_SEMESTER:
				return getSpringSemester();
			case StudiesPackage.STUDY_YEAR__FALL_SEMESTER:
				return getFallSemester();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StudiesPackage.STUDY_YEAR__NEXT_YEAR:
				getNextYear().clear();
				getNextYear().addAll((Collection<? extends StudyYear>)newValue);
				return;
			case StudiesPackage.STUDY_YEAR__PROGRAM_NAME:
				setProgramName((String)newValue);
				return;
			case StudiesPackage.STUDY_YEAR__SPRING_SEMESTER:
				setSpringSemester((Semester)newValue);
				return;
			case StudiesPackage.STUDY_YEAR__FALL_SEMESTER:
				setFallSemester((Semester)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case StudiesPackage.STUDY_YEAR__NEXT_YEAR:
				getNextYear().clear();
				return;
			case StudiesPackage.STUDY_YEAR__PROGRAM_NAME:
				setProgramName(PROGRAM_NAME_EDEFAULT);
				return;
			case StudiesPackage.STUDY_YEAR__SPRING_SEMESTER:
				setSpringSemester((Semester)null);
				return;
			case StudiesPackage.STUDY_YEAR__FALL_SEMESTER:
				setFallSemester((Semester)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case StudiesPackage.STUDY_YEAR__NEXT_YEAR:
				return nextYear != null && !nextYear.isEmpty();
			case StudiesPackage.STUDY_YEAR__PROGRAM_NAME:
				return PROGRAM_NAME_EDEFAULT == null ? programName != null : !PROGRAM_NAME_EDEFAULT.equals(programName);
			case StudiesPackage.STUDY_YEAR__SPRING_SEMESTER:
				return springSemester != null;
			case StudiesPackage.STUDY_YEAR__FALL_SEMESTER:
				return fallSemester != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (programName: ");
		result.append(programName);
		result.append(')');
		return result.toString();
	}

} //StudyYearImpl

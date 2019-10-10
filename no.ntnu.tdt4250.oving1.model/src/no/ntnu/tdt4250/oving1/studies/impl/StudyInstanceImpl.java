/**
 */
package no.ntnu.tdt4250.oving1.studies.impl;

import no.ntnu.tdt4250.oving1.studies.StudiesPackage;
import no.ntnu.tdt4250.oving1.studies.Study;
import no.ntnu.tdt4250.oving1.studies.StudyInstance;
import no.ntnu.tdt4250.oving1.studies.StudyYear;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Study
 * Instance</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link no.ntnu.tdt4250.oving1.studies.impl.StudyInstanceImpl#getStudy
 * <em>Study</em>}</li>
 * <li>{@link no.ntnu.tdt4250.oving1.studies.impl.StudyInstanceImpl#getStartYear
 * <em>Start Year</em>}</li>
 * <li>{@link no.ntnu.tdt4250.oving1.studies.impl.StudyInstanceImpl#getYear
 * <em>Year</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StudyInstanceImpl extends MinimalEObjectImpl.Container implements StudyInstance {
	/**
	 * The cached value of the '{@link #getStartYear() <em>Start Year</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getStartYear()
	 * @generated
	 * @ordered
	 */
	protected StudyYear startYear;
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected StudyInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StudiesPackage.Literals.STUDY_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Study getStudy() {
		if (eContainerFeatureID() != StudiesPackage.STUDY_INSTANCE__STUDY)
			return null;
		return (Study) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetStudy(Study newStudy, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newStudy, StudiesPackage.STUDY_INSTANCE__STUDY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setStudy(Study newStudy) {
		if (newStudy != eInternalContainer()
				|| (eContainerFeatureID() != StudiesPackage.STUDY_INSTANCE__STUDY && newStudy != null)) {
			if (EcoreUtil.isAncestor(this, newStudy))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newStudy != null)
				msgs = ((InternalEObject) newStudy).eInverseAdd(this, StudiesPackage.STUDY__STUDY_INSTANCES,
						Study.class, msgs);
			msgs = basicSetStudy(newStudy, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudiesPackage.STUDY_INSTANCE__STUDY, newStudy,
					newStudy));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public StudyYear getStartYear() {
		return startYear;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetStartYear(StudyYear newStartYear, NotificationChain msgs) {
		StudyYear oldStartYear = startYear;
		startYear = newStartYear;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					StudiesPackage.STUDY_INSTANCE__START_YEAR, oldStartYear, newStartYear);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setStartYear(StudyYear newStartYear) {
		if (newStartYear != startYear) {
			NotificationChain msgs = null;
			if (startYear != null)
				msgs = ((InternalEObject) startYear).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - StudiesPackage.STUDY_INSTANCE__START_YEAR, null, msgs);
			if (newStartYear != null)
				msgs = ((InternalEObject) newStartYear).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - StudiesPackage.STUDY_INSTANCE__START_YEAR, null, msgs);
			msgs = basicSetStartYear(newStartYear, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudiesPackage.STUDY_INSTANCE__START_YEAR,
					newStartYear, newStartYear));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public int getYear() {
		return year;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setYear(int newYear) {
		int oldYear = year;
		year = newYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudiesPackage.STUDY_INSTANCE__YEAR, oldYear, year));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case StudiesPackage.STUDY_INSTANCE__STUDY:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetStudy((Study) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case StudiesPackage.STUDY_INSTANCE__STUDY:
			return basicSetStudy(null, msgs);
		case StudiesPackage.STUDY_INSTANCE__START_YEAR:
			return basicSetStartYear(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case StudiesPackage.STUDY_INSTANCE__STUDY:
			return eInternalContainer().eInverseRemove(this, StudiesPackage.STUDY__STUDY_INSTANCES, Study.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case StudiesPackage.STUDY_INSTANCE__STUDY:
			return getStudy();
		case StudiesPackage.STUDY_INSTANCE__START_YEAR:
			return getStartYear();
		case StudiesPackage.STUDY_INSTANCE__YEAR:
			return getYear();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case StudiesPackage.STUDY_INSTANCE__STUDY:
			setStudy((Study) newValue);
			return;
		case StudiesPackage.STUDY_INSTANCE__START_YEAR:
			setStartYear((StudyYear) newValue);
			return;
		case StudiesPackage.STUDY_INSTANCE__YEAR:
			setYear((Integer) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case StudiesPackage.STUDY_INSTANCE__STUDY:
			setStudy((Study) null);
			return;
		case StudiesPackage.STUDY_INSTANCE__START_YEAR:
			setStartYear((StudyYear) null);
			return;
		case StudiesPackage.STUDY_INSTANCE__YEAR:
			setYear(YEAR_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case StudiesPackage.STUDY_INSTANCE__STUDY:
			return getStudy() != null;
		case StudiesPackage.STUDY_INSTANCE__START_YEAR:
			return startYear != null;
		case StudiesPackage.STUDY_INSTANCE__YEAR:
			return year != YEAR_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (year: ");
		result.append(year);
		result.append(')');
		return result.toString();
	}

} // StudyInstanceImpl

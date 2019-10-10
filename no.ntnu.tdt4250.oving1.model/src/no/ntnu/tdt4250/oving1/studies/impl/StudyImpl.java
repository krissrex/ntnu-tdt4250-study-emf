/**
 */
package no.ntnu.tdt4250.oving1.studies.impl;

import java.util.Collection;

import no.ntnu.tdt4250.oving1.studies.StudiesPackage;
import no.ntnu.tdt4250.oving1.studies.Study;
import no.ntnu.tdt4250.oving1.studies.StudyInstance;
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
 * '<em><b>Study</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link no.ntnu.tdt4250.oving1.studies.impl.StudyImpl#getStudyInstances
 * <em>Study Instances</em>}</li>
 * <li>{@link no.ntnu.tdt4250.oving1.studies.impl.StudyImpl#getName
 * <em>Name</em>}</li>
 * <li>{@link no.ntnu.tdt4250.oving1.studies.impl.StudyImpl#getCode
 * <em>Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StudyImpl extends MinimalEObjectImpl.Container implements Study {
    /**
     * The cached value of the '{@link #getStudyInstances() <em>Study
     * Instances</em>}' containment reference list. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getStudyInstances()
     * @generated
     * @ordered
     */
    protected EList<StudyInstance> studyInstances;

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
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected StudyImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return StudiesPackage.Literals.STUDY;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @SuppressWarnings("unchecked")
    public EList<StudyInstance> getStudyInstances() {
        if (studyInstances == null) {
            studyInstances = new EObjectContainmentWithInverseEList<StudyInstance>(StudyInstance.class, this,
                    StudiesPackage.STUDY__STUDY_INSTANCES, StudiesPackage.STUDY_INSTANCE__STUDY);
        }
        return studyInstances;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setName(String newName) {
        String oldName = name;
        name = newName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, StudiesPackage.STUDY__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public String getCode() {
        return code;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setCode(String newCode) {
        String oldCode = code;
        code = newCode;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, StudiesPackage.STUDY__CODE, oldCode, code));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case StudiesPackage.STUDY__STUDY_INSTANCES:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getStudyInstances()).basicAdd(otherEnd, msgs);
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
        case StudiesPackage.STUDY__STUDY_INSTANCES:
            return ((InternalEList<?>) getStudyInstances()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case StudiesPackage.STUDY__STUDY_INSTANCES:
            return getStudyInstances();
        case StudiesPackage.STUDY__NAME:
            return getName();
        case StudiesPackage.STUDY__CODE:
            return getCode();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
        case StudiesPackage.STUDY__STUDY_INSTANCES:
            getStudyInstances().clear();
            getStudyInstances().addAll((Collection<? extends StudyInstance>) newValue);
            return;
        case StudiesPackage.STUDY__NAME:
            setName((String) newValue);
            return;
        case StudiesPackage.STUDY__CODE:
            setCode((String) newValue);
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
        case StudiesPackage.STUDY__STUDY_INSTANCES:
            getStudyInstances().clear();
            return;
        case StudiesPackage.STUDY__NAME:
            setName(NAME_EDEFAULT);
            return;
        case StudiesPackage.STUDY__CODE:
            setCode(CODE_EDEFAULT);
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
        case StudiesPackage.STUDY__STUDY_INSTANCES:
            return studyInstances != null && !studyInstances.isEmpty();
        case StudiesPackage.STUDY__NAME:
            return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
        case StudiesPackage.STUDY__CODE:
            return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
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
        result.append(" (name: ");
        result.append(name);
        result.append(", code: ");
        result.append(code);
        result.append(')');
        return result.toString();
    }

} // StudyImpl

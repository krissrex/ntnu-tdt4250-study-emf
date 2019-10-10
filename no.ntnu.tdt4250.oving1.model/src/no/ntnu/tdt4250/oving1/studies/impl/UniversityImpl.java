/**
 */
package no.ntnu.tdt4250.oving1.studies.impl;

import java.util.Collection;

import no.ntnu.tdt4250.oving1.studies.Course;
import no.ntnu.tdt4250.oving1.studies.CourseInstance;
import no.ntnu.tdt4250.oving1.studies.StudiesPackage;
import no.ntnu.tdt4250.oving1.studies.Study;
import no.ntnu.tdt4250.oving1.studies.University;
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
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>University</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link no.ntnu.tdt4250.oving1.studies.impl.UniversityImpl#getName
 * <em>Name</em>}</li>
 * <li>{@link no.ntnu.tdt4250.oving1.studies.impl.UniversityImpl#getCourseInstances
 * <em>Course Instances</em>}</li>
 * <li>{@link no.ntnu.tdt4250.oving1.studies.impl.UniversityImpl#getCourses
 * <em>Courses</em>}</li>
 * <li>{@link no.ntnu.tdt4250.oving1.studies.impl.UniversityImpl#getStudies
 * <em>Studies</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UniversityImpl extends MinimalEObjectImpl.Container implements University {
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
     * The cached value of the '{@link #getCourseInstances() <em>Course
     * Instances</em>}' containment reference list. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getCourseInstances()
     * @generated
     * @ordered
     */
    protected EList<CourseInstance> courseInstances;
    /**
     * The cached value of the '{@link #getCourses() <em>Courses</em>}' containment
     * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getCourses()
     * @generated
     * @ordered
     */
    protected EList<Course> courses;
    /**
     * The cached value of the '{@link #getStudies() <em>Studies</em>}' containment
     * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getStudies()
     * @generated
     * @ordered
     */
    protected EList<Study> studies;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected UniversityImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return StudiesPackage.Literals.UNIVERSITY;
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
            eNotify(new ENotificationImpl(this, Notification.SET, StudiesPackage.UNIVERSITY__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @SuppressWarnings("unchecked")
    public EList<CourseInstance> getCourseInstances() {
        if (courseInstances == null) {
            courseInstances = new EObjectContainmentEList<CourseInstance>(CourseInstance.class, this,
                    StudiesPackage.UNIVERSITY__COURSE_INSTANCES);
        }
        return courseInstances;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @SuppressWarnings("unchecked")
    public EList<Course> getCourses() {
        if (courses == null) {
            courses = new EObjectContainmentEList<Course>(Course.class, this, StudiesPackage.UNIVERSITY__COURSES);
        }
        return courses;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @SuppressWarnings("unchecked")
    public EList<Study> getStudies() {
        if (studies == null) {
            studies = new EObjectContainmentEList<Study>(Study.class, this, StudiesPackage.UNIVERSITY__STUDIES);
        }
        return studies;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case StudiesPackage.UNIVERSITY__COURSE_INSTANCES:
            return ((InternalEList<?>) getCourseInstances()).basicRemove(otherEnd, msgs);
        case StudiesPackage.UNIVERSITY__COURSES:
            return ((InternalEList<?>) getCourses()).basicRemove(otherEnd, msgs);
        case StudiesPackage.UNIVERSITY__STUDIES:
            return ((InternalEList<?>) getStudies()).basicRemove(otherEnd, msgs);
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
        case StudiesPackage.UNIVERSITY__NAME:
            return getName();
        case StudiesPackage.UNIVERSITY__COURSE_INSTANCES:
            return getCourseInstances();
        case StudiesPackage.UNIVERSITY__COURSES:
            return getCourses();
        case StudiesPackage.UNIVERSITY__STUDIES:
            return getStudies();
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
        case StudiesPackage.UNIVERSITY__NAME:
            setName((String) newValue);
            return;
        case StudiesPackage.UNIVERSITY__COURSE_INSTANCES:
            getCourseInstances().clear();
            getCourseInstances().addAll((Collection<? extends CourseInstance>) newValue);
            return;
        case StudiesPackage.UNIVERSITY__COURSES:
            getCourses().clear();
            getCourses().addAll((Collection<? extends Course>) newValue);
            return;
        case StudiesPackage.UNIVERSITY__STUDIES:
            getStudies().clear();
            getStudies().addAll((Collection<? extends Study>) newValue);
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
        case StudiesPackage.UNIVERSITY__NAME:
            setName(NAME_EDEFAULT);
            return;
        case StudiesPackage.UNIVERSITY__COURSE_INSTANCES:
            getCourseInstances().clear();
            return;
        case StudiesPackage.UNIVERSITY__COURSES:
            getCourses().clear();
            return;
        case StudiesPackage.UNIVERSITY__STUDIES:
            getStudies().clear();
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
        case StudiesPackage.UNIVERSITY__NAME:
            return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
        case StudiesPackage.UNIVERSITY__COURSE_INSTANCES:
            return courseInstances != null && !courseInstances.isEmpty();
        case StudiesPackage.UNIVERSITY__COURSES:
            return courses != null && !courses.isEmpty();
        case StudiesPackage.UNIVERSITY__STUDIES:
            return studies != null && !studies.isEmpty();
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
        result.append(')');
        return result.toString();
    }

} // UniversityImpl

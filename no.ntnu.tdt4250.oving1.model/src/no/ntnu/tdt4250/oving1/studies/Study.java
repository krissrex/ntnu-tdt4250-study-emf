/**
 */
package no.ntnu.tdt4250.oving1.studies;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Study</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link no.ntnu.tdt4250.oving1.studies.Study#getStudyInstances <em>Study
 * Instances</em>}</li>
 * <li>{@link no.ntnu.tdt4250.oving1.studies.Study#getName <em>Name</em>}</li>
 * <li>{@link no.ntnu.tdt4250.oving1.studies.Study#getCode <em>Code</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.oving1.studies.StudiesPackage#getStudy()
 * @model
 * @generated
 */
public interface Study extends EObject {
    /**
     * Returns the value of the '<em><b>Study Instances</b></em>' containment
     * reference list. The list contents are of type
     * {@link no.ntnu.tdt4250.oving1.studies.StudyInstance}. It is bidirectional and
     * its opposite is '{@link no.ntnu.tdt4250.oving1.studies.StudyInstance#getStudy
     * <em>Study</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Study Instances</em>' containment reference
     *         list.
     * @see no.ntnu.tdt4250.oving1.studies.StudiesPackage#getStudy_StudyInstances()
     * @see no.ntnu.tdt4250.oving1.studies.StudyInstance#getStudy
     * @model opposite="study" containment="true"
     * @generated
     */
    EList<StudyInstance> getStudyInstances();

    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see no.ntnu.tdt4250.oving1.studies.StudiesPackage#getStudy_Name()
     * @model
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link no.ntnu.tdt4250.oving1.studies.Study#getName
     * <em>Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Code</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Code</em>' attribute.
     * @see #setCode(String)
     * @see no.ntnu.tdt4250.oving1.studies.StudiesPackage#getStudy_Code()
     * @model
     * @generated
     */
    String getCode();

    /**
     * Sets the value of the '{@link no.ntnu.tdt4250.oving1.studies.Study#getCode
     * <em>Code</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value the new value of the '<em>Code</em>' attribute.
     * @see #getCode()
     * @generated
     */
    void setCode(String value);

} // Study

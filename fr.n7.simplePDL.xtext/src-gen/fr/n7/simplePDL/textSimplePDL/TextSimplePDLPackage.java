/**
 * generated by Xtext 2.29.0
 */
package fr.n7.simplePDL.textSimplePDL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.n7.simplePDL.textSimplePDL.TextSimplePDLFactory
 * @model kind="package"
 * @generated
 */
public interface TextSimplePDLPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "textSimplePDL";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.n7.fr/simplePDL/TextSimplePDL";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "textSimplePDL";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  TextSimplePDLPackage eINSTANCE = fr.n7.simplePDL.textSimplePDL.impl.TextSimplePDLPackageImpl.init();

  /**
   * The meta object id for the '{@link fr.n7.simplePDL.textSimplePDL.impl.ProcessImpl <em>Process</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.n7.simplePDL.textSimplePDL.impl.ProcessImpl
   * @see fr.n7.simplePDL.textSimplePDL.impl.TextSimplePDLPackageImpl#getProcess()
   * @generated
   */
  int PROCESS = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS__NAME = 0;

  /**
   * The feature id for the '<em><b>Process Element</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS__PROCESS_ELEMENT = 1;

  /**
   * The number of structural features of the '<em>Process</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fr.n7.simplePDL.textSimplePDL.impl.ProcessElementImpl <em>Process Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.n7.simplePDL.textSimplePDL.impl.ProcessElementImpl
   * @see fr.n7.simplePDL.textSimplePDL.impl.TextSimplePDLPackageImpl#getProcessElement()
   * @generated
   */
  int PROCESS_ELEMENT = 3;

  /**
   * The number of structural features of the '<em>Process Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_ELEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link fr.n7.simplePDL.textSimplePDL.impl.WorkDefinitionImpl <em>Work Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.n7.simplePDL.textSimplePDL.impl.WorkDefinitionImpl
   * @see fr.n7.simplePDL.textSimplePDL.impl.TextSimplePDLPackageImpl#getWorkDefinition()
   * @generated
   */
  int WORK_DEFINITION = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_DEFINITION__NAME = PROCESS_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Needs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_DEFINITION__NEEDS = PROCESS_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Work Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_DEFINITION_FEATURE_COUNT = PROCESS_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link fr.n7.simplePDL.textSimplePDL.impl.WorkSequenceImpl <em>Work Sequence</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.n7.simplePDL.textSimplePDL.impl.WorkSequenceImpl
   * @see fr.n7.simplePDL.textSimplePDL.impl.TextSimplePDLPackageImpl#getWorkSequence()
   * @generated
   */
  int WORK_SEQUENCE = 2;

  /**
   * The feature id for the '<em><b>Predecessor</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_SEQUENCE__PREDECESSOR = PROCESS_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Successor</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_SEQUENCE__SUCCESSOR = PROCESS_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Work Sequence</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_SEQUENCE_FEATURE_COUNT = PROCESS_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link fr.n7.simplePDL.textSimplePDL.impl.GuidanceImpl <em>Guidance</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.n7.simplePDL.textSimplePDL.impl.GuidanceImpl
   * @see fr.n7.simplePDL.textSimplePDL.impl.TextSimplePDLPackageImpl#getGuidance()
   * @generated
   */
  int GUIDANCE = 4;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUIDANCE__TEXT = PROCESS_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUIDANCE__ELEMENTS = PROCESS_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Guidance</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUIDANCE_FEATURE_COUNT = PROCESS_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link fr.n7.simplePDL.textSimplePDL.impl.NeedImpl <em>Need</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.n7.simplePDL.textSimplePDL.impl.NeedImpl
   * @see fr.n7.simplePDL.textSimplePDL.impl.TextSimplePDLPackageImpl#getNeed()
   * @generated
   */
  int NEED = 5;

  /**
   * The feature id for the '<em><b>Nb Resources</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEED__NB_RESOURCES = 0;

  /**
   * The feature id for the '<em><b>Resource</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEED__RESOURCE = 1;

  /**
   * The number of structural features of the '<em>Need</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEED_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fr.n7.simplePDL.textSimplePDL.impl.ResourceImpl <em>Resource</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.n7.simplePDL.textSimplePDL.impl.ResourceImpl
   * @see fr.n7.simplePDL.textSimplePDL.impl.TextSimplePDLPackageImpl#getResource()
   * @generated
   */
  int RESOURCE = 6;

  /**
   * The feature id for the '<em><b>Nb Available Resources</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE__NB_AVAILABLE_RESOURCES = PROCESS_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE__NAME = PROCESS_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Resource</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_FEATURE_COUNT = PROCESS_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link fr.n7.simplePDL.textSimplePDL.WorkSequenceType <em>Work Sequence Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.n7.simplePDL.textSimplePDL.WorkSequenceType
   * @see fr.n7.simplePDL.textSimplePDL.impl.TextSimplePDLPackageImpl#getWorkSequenceType()
   * @generated
   */
  int WORK_SEQUENCE_TYPE = 7;


  /**
   * Returns the meta object for class '{@link fr.n7.simplePDL.textSimplePDL.Process <em>Process</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Process</em>'.
   * @see fr.n7.simplePDL.textSimplePDL.Process
   * @generated
   */
  EClass getProcess();

  /**
   * Returns the meta object for the attribute '{@link fr.n7.simplePDL.textSimplePDL.Process#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.n7.simplePDL.textSimplePDL.Process#getName()
   * @see #getProcess()
   * @generated
   */
  EAttribute getProcess_Name();

  /**
   * Returns the meta object for the containment reference list '{@link fr.n7.simplePDL.textSimplePDL.Process#getProcessElement <em>Process Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Process Element</em>'.
   * @see fr.n7.simplePDL.textSimplePDL.Process#getProcessElement()
   * @see #getProcess()
   * @generated
   */
  EReference getProcess_ProcessElement();

  /**
   * Returns the meta object for class '{@link fr.n7.simplePDL.textSimplePDL.WorkDefinition <em>Work Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Work Definition</em>'.
   * @see fr.n7.simplePDL.textSimplePDL.WorkDefinition
   * @generated
   */
  EClass getWorkDefinition();

  /**
   * Returns the meta object for the attribute '{@link fr.n7.simplePDL.textSimplePDL.WorkDefinition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.n7.simplePDL.textSimplePDL.WorkDefinition#getName()
   * @see #getWorkDefinition()
   * @generated
   */
  EAttribute getWorkDefinition_Name();

  /**
   * Returns the meta object for the containment reference list '{@link fr.n7.simplePDL.textSimplePDL.WorkDefinition#getNeeds <em>Needs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Needs</em>'.
   * @see fr.n7.simplePDL.textSimplePDL.WorkDefinition#getNeeds()
   * @see #getWorkDefinition()
   * @generated
   */
  EReference getWorkDefinition_Needs();

  /**
   * Returns the meta object for class '{@link fr.n7.simplePDL.textSimplePDL.WorkSequence <em>Work Sequence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Work Sequence</em>'.
   * @see fr.n7.simplePDL.textSimplePDL.WorkSequence
   * @generated
   */
  EClass getWorkSequence();

  /**
   * Returns the meta object for the reference '{@link fr.n7.simplePDL.textSimplePDL.WorkSequence#getPredecessor <em>Predecessor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Predecessor</em>'.
   * @see fr.n7.simplePDL.textSimplePDL.WorkSequence#getPredecessor()
   * @see #getWorkSequence()
   * @generated
   */
  EReference getWorkSequence_Predecessor();

  /**
   * Returns the meta object for the reference '{@link fr.n7.simplePDL.textSimplePDL.WorkSequence#getSuccessor <em>Successor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Successor</em>'.
   * @see fr.n7.simplePDL.textSimplePDL.WorkSequence#getSuccessor()
   * @see #getWorkSequence()
   * @generated
   */
  EReference getWorkSequence_Successor();

  /**
   * Returns the meta object for class '{@link fr.n7.simplePDL.textSimplePDL.ProcessElement <em>Process Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Process Element</em>'.
   * @see fr.n7.simplePDL.textSimplePDL.ProcessElement
   * @generated
   */
  EClass getProcessElement();

  /**
   * Returns the meta object for class '{@link fr.n7.simplePDL.textSimplePDL.Guidance <em>Guidance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Guidance</em>'.
   * @see fr.n7.simplePDL.textSimplePDL.Guidance
   * @generated
   */
  EClass getGuidance();

  /**
   * Returns the meta object for the attribute '{@link fr.n7.simplePDL.textSimplePDL.Guidance#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see fr.n7.simplePDL.textSimplePDL.Guidance#getText()
   * @see #getGuidance()
   * @generated
   */
  EAttribute getGuidance_Text();

  /**
   * Returns the meta object for the reference list '{@link fr.n7.simplePDL.textSimplePDL.Guidance#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Elements</em>'.
   * @see fr.n7.simplePDL.textSimplePDL.Guidance#getElements()
   * @see #getGuidance()
   * @generated
   */
  EReference getGuidance_Elements();

  /**
   * Returns the meta object for class '{@link fr.n7.simplePDL.textSimplePDL.Need <em>Need</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Need</em>'.
   * @see fr.n7.simplePDL.textSimplePDL.Need
   * @generated
   */
  EClass getNeed();

  /**
   * Returns the meta object for the attribute '{@link fr.n7.simplePDL.textSimplePDL.Need#getNbResources <em>Nb Resources</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nb Resources</em>'.
   * @see fr.n7.simplePDL.textSimplePDL.Need#getNbResources()
   * @see #getNeed()
   * @generated
   */
  EAttribute getNeed_NbResources();

  /**
   * Returns the meta object for the reference '{@link fr.n7.simplePDL.textSimplePDL.Need#getResource <em>Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Resource</em>'.
   * @see fr.n7.simplePDL.textSimplePDL.Need#getResource()
   * @see #getNeed()
   * @generated
   */
  EReference getNeed_Resource();

  /**
   * Returns the meta object for class '{@link fr.n7.simplePDL.textSimplePDL.Resource <em>Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Resource</em>'.
   * @see fr.n7.simplePDL.textSimplePDL.Resource
   * @generated
   */
  EClass getResource();

  /**
   * Returns the meta object for the attribute '{@link fr.n7.simplePDL.textSimplePDL.Resource#getNbAvailableResources <em>Nb Available Resources</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nb Available Resources</em>'.
   * @see fr.n7.simplePDL.textSimplePDL.Resource#getNbAvailableResources()
   * @see #getResource()
   * @generated
   */
  EAttribute getResource_NbAvailableResources();

  /**
   * Returns the meta object for the attribute '{@link fr.n7.simplePDL.textSimplePDL.Resource#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.n7.simplePDL.textSimplePDL.Resource#getName()
   * @see #getResource()
   * @generated
   */
  EAttribute getResource_Name();

  /**
   * Returns the meta object for enum '{@link fr.n7.simplePDL.textSimplePDL.WorkSequenceType <em>Work Sequence Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Work Sequence Type</em>'.
   * @see fr.n7.simplePDL.textSimplePDL.WorkSequenceType
   * @generated
   */
  EEnum getWorkSequenceType();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  TextSimplePDLFactory getTextSimplePDLFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link fr.n7.simplePDL.textSimplePDL.impl.ProcessImpl <em>Process</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.n7.simplePDL.textSimplePDL.impl.ProcessImpl
     * @see fr.n7.simplePDL.textSimplePDL.impl.TextSimplePDLPackageImpl#getProcess()
     * @generated
     */
    EClass PROCESS = eINSTANCE.getProcess();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROCESS__NAME = eINSTANCE.getProcess_Name();

    /**
     * The meta object literal for the '<em><b>Process Element</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCESS__PROCESS_ELEMENT = eINSTANCE.getProcess_ProcessElement();

    /**
     * The meta object literal for the '{@link fr.n7.simplePDL.textSimplePDL.impl.WorkDefinitionImpl <em>Work Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.n7.simplePDL.textSimplePDL.impl.WorkDefinitionImpl
     * @see fr.n7.simplePDL.textSimplePDL.impl.TextSimplePDLPackageImpl#getWorkDefinition()
     * @generated
     */
    EClass WORK_DEFINITION = eINSTANCE.getWorkDefinition();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WORK_DEFINITION__NAME = eINSTANCE.getWorkDefinition_Name();

    /**
     * The meta object literal for the '<em><b>Needs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORK_DEFINITION__NEEDS = eINSTANCE.getWorkDefinition_Needs();

    /**
     * The meta object literal for the '{@link fr.n7.simplePDL.textSimplePDL.impl.WorkSequenceImpl <em>Work Sequence</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.n7.simplePDL.textSimplePDL.impl.WorkSequenceImpl
     * @see fr.n7.simplePDL.textSimplePDL.impl.TextSimplePDLPackageImpl#getWorkSequence()
     * @generated
     */
    EClass WORK_SEQUENCE = eINSTANCE.getWorkSequence();

    /**
     * The meta object literal for the '<em><b>Predecessor</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORK_SEQUENCE__PREDECESSOR = eINSTANCE.getWorkSequence_Predecessor();

    /**
     * The meta object literal for the '<em><b>Successor</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORK_SEQUENCE__SUCCESSOR = eINSTANCE.getWorkSequence_Successor();

    /**
     * The meta object literal for the '{@link fr.n7.simplePDL.textSimplePDL.impl.ProcessElementImpl <em>Process Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.n7.simplePDL.textSimplePDL.impl.ProcessElementImpl
     * @see fr.n7.simplePDL.textSimplePDL.impl.TextSimplePDLPackageImpl#getProcessElement()
     * @generated
     */
    EClass PROCESS_ELEMENT = eINSTANCE.getProcessElement();

    /**
     * The meta object literal for the '{@link fr.n7.simplePDL.textSimplePDL.impl.GuidanceImpl <em>Guidance</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.n7.simplePDL.textSimplePDL.impl.GuidanceImpl
     * @see fr.n7.simplePDL.textSimplePDL.impl.TextSimplePDLPackageImpl#getGuidance()
     * @generated
     */
    EClass GUIDANCE = eINSTANCE.getGuidance();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GUIDANCE__TEXT = eINSTANCE.getGuidance_Text();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GUIDANCE__ELEMENTS = eINSTANCE.getGuidance_Elements();

    /**
     * The meta object literal for the '{@link fr.n7.simplePDL.textSimplePDL.impl.NeedImpl <em>Need</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.n7.simplePDL.textSimplePDL.impl.NeedImpl
     * @see fr.n7.simplePDL.textSimplePDL.impl.TextSimplePDLPackageImpl#getNeed()
     * @generated
     */
    EClass NEED = eINSTANCE.getNeed();

    /**
     * The meta object literal for the '<em><b>Nb Resources</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NEED__NB_RESOURCES = eINSTANCE.getNeed_NbResources();

    /**
     * The meta object literal for the '<em><b>Resource</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NEED__RESOURCE = eINSTANCE.getNeed_Resource();

    /**
     * The meta object literal for the '{@link fr.n7.simplePDL.textSimplePDL.impl.ResourceImpl <em>Resource</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.n7.simplePDL.textSimplePDL.impl.ResourceImpl
     * @see fr.n7.simplePDL.textSimplePDL.impl.TextSimplePDLPackageImpl#getResource()
     * @generated
     */
    EClass RESOURCE = eINSTANCE.getResource();

    /**
     * The meta object literal for the '<em><b>Nb Available Resources</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RESOURCE__NB_AVAILABLE_RESOURCES = eINSTANCE.getResource_NbAvailableResources();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RESOURCE__NAME = eINSTANCE.getResource_Name();

    /**
     * The meta object literal for the '{@link fr.n7.simplePDL.textSimplePDL.WorkSequenceType <em>Work Sequence Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.n7.simplePDL.textSimplePDL.WorkSequenceType
     * @see fr.n7.simplePDL.textSimplePDL.impl.TextSimplePDLPackageImpl#getWorkSequenceType()
     * @generated
     */
    EEnum WORK_SEQUENCE_TYPE = eINSTANCE.getWorkSequenceType();

  }

} //TextSimplePDLPackage
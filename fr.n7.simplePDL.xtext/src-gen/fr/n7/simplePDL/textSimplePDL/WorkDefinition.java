/**
 * generated by Xtext 2.29.0
 */
package fr.n7.simplePDL.textSimplePDL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.simplePDL.textSimplePDL.WorkDefinition#getName <em>Name</em>}</li>
 *   <li>{@link fr.n7.simplePDL.textSimplePDL.WorkDefinition#getNeeds <em>Needs</em>}</li>
 * </ul>
 *
 * @see fr.n7.simplePDL.textSimplePDL.TextSimplePDLPackage#getWorkDefinition()
 * @model
 * @generated
 */
public interface WorkDefinition extends ProcessElement
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see fr.n7.simplePDL.textSimplePDL.TextSimplePDLPackage#getWorkDefinition_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.n7.simplePDL.textSimplePDL.WorkDefinition#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Needs</b></em>' containment reference list.
   * The list contents are of type {@link fr.n7.simplePDL.textSimplePDL.Need}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Needs</em>' containment reference list.
   * @see fr.n7.simplePDL.textSimplePDL.TextSimplePDLPackage#getWorkDefinition_Needs()
   * @model containment="true"
   * @generated
   */
  EList<Need> getNeeds();

} // WorkDefinition

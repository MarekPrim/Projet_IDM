/**
 * generated by Xtext 2.29.0
 */
package fr.n7.simplePDL.textSimplePDL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Guidance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.simplePDL.textSimplePDL.Guidance#getText <em>Text</em>}</li>
 *   <li>{@link fr.n7.simplePDL.textSimplePDL.Guidance#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see fr.n7.simplePDL.textSimplePDL.TextSimplePDLPackage#getGuidance()
 * @model
 * @generated
 */
public interface Guidance extends ProcessElement
{
  /**
   * Returns the value of the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Text</em>' attribute.
   * @see #setText(String)
   * @see fr.n7.simplePDL.textSimplePDL.TextSimplePDLPackage#getGuidance_Text()
   * @model
   * @generated
   */
  String getText();

  /**
   * Sets the value of the '{@link fr.n7.simplePDL.textSimplePDL.Guidance#getText <em>Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Text</em>' attribute.
   * @see #getText()
   * @generated
   */
  void setText(String value);

  /**
   * Returns the value of the '<em><b>Elements</b></em>' reference list.
   * The list contents are of type {@link fr.n7.simplePDL.textSimplePDL.ProcessElement}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' reference list.
   * @see fr.n7.simplePDL.textSimplePDL.TextSimplePDLPackage#getGuidance_Elements()
   * @model
   * @generated
   */
  EList<ProcessElement> getElements();

} // Guidance

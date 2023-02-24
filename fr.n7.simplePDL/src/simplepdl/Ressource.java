/**
 */
package simplepdl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ressource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplepdl.Ressource#getNeeds <em>Needs</em>}</li>
 *   <li>{@link simplepdl.Ressource#getName <em>Name</em>}</li>
 *   <li>{@link simplepdl.Ressource#getNbRessourceDisponible <em>Nb Ressource Disponible</em>}</li>
 * </ul>
 *
 * @see simplepdl.SimplepdlPackage#getRessource()
 * @model
 * @generated
 */
public interface Ressource extends ProcessElement {
	/**
	 * Returns the value of the '<em><b>Needs</b></em>' reference list.
	 * The list contents are of type {@link simplepdl.Need}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Needs</em>' reference list.
	 * @see simplepdl.SimplepdlPackage#getRessource_Needs()
	 * @model
	 * @generated
	 */
	EList<Need> getNeeds();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see simplepdl.SimplepdlPackage#getRessource_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link simplepdl.Ressource#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Nb Ressource Disponible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Ressource Disponible</em>' attribute.
	 * @see #setNbRessourceDisponible(int)
	 * @see simplepdl.SimplepdlPackage#getRessource_NbRessourceDisponible()
	 * @model
	 * @generated
	 */
	int getNbRessourceDisponible();

	/**
	 * Sets the value of the '{@link simplepdl.Ressource#getNbRessourceDisponible <em>Nb Ressource Disponible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Ressource Disponible</em>' attribute.
	 * @see #getNbRessourceDisponible()
	 * @generated
	 */
	void setNbRessourceDisponible(int value);

} // Ressource

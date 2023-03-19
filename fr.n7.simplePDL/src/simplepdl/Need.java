/**
 */
package simplepdl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Need</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplepdl.Need#getNbRessources <em>Nb Ressources</em>}</li>
 *   <li>{@link simplepdl.Need#getRessource <em>Ressource</em>}</li>
 *   <li>{@link simplepdl.Need#getWorkDefinition <em>Work Definition</em>}</li>
 * </ul>
 *
 * @see simplepdl.SimplepdlPackage#getNeed()
 * @model
 * @generated
 */
public interface Need extends ProcessElement {
	/**
	 * Returns the value of the '<em><b>Nb Ressources</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Ressources</em>' attribute.
	 * @see #setNbRessources(int)
	 * @see simplepdl.SimplepdlPackage#getNeed_NbRessources()
	 * @model
	 * @generated
	 */
	int getNbRessources();

	/**
	 * Sets the value of the '{@link simplepdl.Need#getNbRessources <em>Nb Ressources</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Ressources</em>' attribute.
	 * @see #getNbRessources()
	 * @generated
	 */
	void setNbRessources(int value);

	/**
	 * Returns the value of the '<em><b>Ressource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ressource</em>' reference.
	 * @see #setRessource(Ressource)
	 * @see simplepdl.SimplepdlPackage#getNeed_Ressource()
	 * @model
	 * @generated
	 */
	Ressource getRessource();

	/**
	 * Sets the value of the '{@link simplepdl.Need#getRessource <em>Ressource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ressource</em>' reference.
	 * @see #getRessource()
	 * @generated
	 */
	void setRessource(Ressource value);

	/**
	 * Returns the value of the '<em><b>Work Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Definition</em>' reference.
	 * @see #setWorkDefinition(WorkDefinition)
	 * @see simplepdl.SimplepdlPackage#getNeed_WorkDefinition()
	 * @model
	 * @generated
	 */
	WorkDefinition getWorkDefinition();

	/**
	 * Sets the value of the '{@link simplepdl.Need#getWorkDefinition <em>Work Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Definition</em>' reference.
	 * @see #getWorkDefinition()
	 * @generated
	 */
	void setWorkDefinition(WorkDefinition value);

} // Need

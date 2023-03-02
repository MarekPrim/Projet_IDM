/**
 */
package petrie;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Petri Net</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petrie.PetriNet#getName <em>Name</em>}</li>
 *   <li>{@link petrie.PetriNet#getPetriElements <em>Petri Elements</em>}</li>
 * </ul>
 *
 * @see petrie.PetriePackage#getPetriNet()
 * @model
 * @generated
 */
public interface PetriNet extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see petrie.PetriePackage#getPetriNet_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link petrie.PetriNet#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Petri Elements</b></em>' containment reference list.
	 * The list contents are of type {@link petrie.PetriElement}.
	 * It is bidirectional and its opposite is '{@link petrie.PetriElement#getPetrinet <em>Petrinet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Petri Elements</em>' containment reference list.
	 * @see petrie.PetriePackage#getPetriNet_PetriElements()
	 * @see petrie.PetriElement#getPetrinet
	 * @model opposite="petrinet" containment="true"
	 * @generated
	 */
	EList<PetriElement> getPetriElements();

} // PetriNet

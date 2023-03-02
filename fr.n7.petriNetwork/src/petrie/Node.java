/**
 */
package petrie;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petrie.Node#getName <em>Name</em>}</li>
 *   <li>{@link petrie.Node#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link petrie.Node#getOutgoing <em>Outgoing</em>}</li>
 * </ul>
 *
 * @see petrie.PetriePackage#getNode()
 * @model abstract="true"
 * @generated
 */
public interface Node extends PetriElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see petrie.PetriePackage#getNode_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link petrie.Node#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link petrie.Arc}.
	 * It is bidirectional and its opposite is '{@link petrie.Arc#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see petrie.PetriePackage#getNode_Incoming()
	 * @see petrie.Arc#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<Arc> getIncoming();

	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link petrie.Arc}.
	 * It is bidirectional and its opposite is '{@link petrie.Arc#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see petrie.PetriePackage#getNode_Outgoing()
	 * @see petrie.Arc#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<Arc> getOutgoing();

} // Node

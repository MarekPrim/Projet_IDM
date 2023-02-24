/**
 */
package simplepdl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import simplepdl.Need;
import simplepdl.Ressource;
import simplepdl.SimplepdlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ressource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link simplepdl.impl.RessourceImpl#getNeeds <em>Needs</em>}</li>
 *   <li>{@link simplepdl.impl.RessourceImpl#getName <em>Name</em>}</li>
 *   <li>{@link simplepdl.impl.RessourceImpl#getNbRessourceDisponible <em>Nb Ressource Disponible</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RessourceImpl extends ProcessElementImpl implements Ressource {
	/**
	 * The cached value of the '{@link #getNeeds() <em>Needs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeeds()
	 * @generated
	 * @ordered
	 */
	protected EList<Need> needs;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNbRessourceDisponible() <em>Nb Ressource Disponible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbRessourceDisponible()
	 * @generated
	 * @ordered
	 */
	protected static final int NB_RESSOURCE_DISPONIBLE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNbRessourceDisponible() <em>Nb Ressource Disponible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbRessourceDisponible()
	 * @generated
	 * @ordered
	 */
	protected int nbRessourceDisponible = NB_RESSOURCE_DISPONIBLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RessourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimplepdlPackage.Literals.RESSOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Need> getNeeds() {
		if (needs == null) {
			needs = new EObjectResolvingEList<Need>(Need.class, this, SimplepdlPackage.RESSOURCE__NEEDS);
		}
		return needs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplepdlPackage.RESSOURCE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNbRessourceDisponible() {
		return nbRessourceDisponible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbRessourceDisponible(int newNbRessourceDisponible) {
		int oldNbRessourceDisponible = nbRessourceDisponible;
		nbRessourceDisponible = newNbRessourceDisponible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplepdlPackage.RESSOURCE__NB_RESSOURCE_DISPONIBLE, oldNbRessourceDisponible, nbRessourceDisponible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimplepdlPackage.RESSOURCE__NEEDS:
				return getNeeds();
			case SimplepdlPackage.RESSOURCE__NAME:
				return getName();
			case SimplepdlPackage.RESSOURCE__NB_RESSOURCE_DISPONIBLE:
				return getNbRessourceDisponible();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SimplepdlPackage.RESSOURCE__NEEDS:
				getNeeds().clear();
				getNeeds().addAll((Collection<? extends Need>)newValue);
				return;
			case SimplepdlPackage.RESSOURCE__NAME:
				setName((String)newValue);
				return;
			case SimplepdlPackage.RESSOURCE__NB_RESSOURCE_DISPONIBLE:
				setNbRessourceDisponible((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SimplepdlPackage.RESSOURCE__NEEDS:
				getNeeds().clear();
				return;
			case SimplepdlPackage.RESSOURCE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SimplepdlPackage.RESSOURCE__NB_RESSOURCE_DISPONIBLE:
				setNbRessourceDisponible(NB_RESSOURCE_DISPONIBLE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SimplepdlPackage.RESSOURCE__NEEDS:
				return needs != null && !needs.isEmpty();
			case SimplepdlPackage.RESSOURCE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SimplepdlPackage.RESSOURCE__NB_RESSOURCE_DISPONIBLE:
				return nbRessourceDisponible != NB_RESSOURCE_DISPONIBLE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", nbRessourceDisponible: ");
		result.append(nbRessourceDisponible);
		result.append(')');
		return result.toString();
	}

} //RessourceImpl

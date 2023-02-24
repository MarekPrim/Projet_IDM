/**
 */
package simplepdl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import simplepdl.Need;
import simplepdl.Ressource;
import simplepdl.SimplepdlPackage;
import simplepdl.WorkDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Need</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link simplepdl.impl.NeedImpl#getNbRessources <em>Nb Ressources</em>}</li>
 *   <li>{@link simplepdl.impl.NeedImpl#getRessource <em>Ressource</em>}</li>
 *   <li>{@link simplepdl.impl.NeedImpl#getWorkDefinition <em>Work Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NeedImpl extends MinimalEObjectImpl.Container implements Need {
	/**
	 * The default value of the '{@link #getNbRessources() <em>Nb Ressources</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbRessources()
	 * @generated
	 * @ordered
	 */
	protected static final int NB_RESSOURCES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNbRessources() <em>Nb Ressources</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbRessources()
	 * @generated
	 * @ordered
	 */
	protected int nbRessources = NB_RESSOURCES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRessource() <em>Ressource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRessource()
	 * @generated
	 * @ordered
	 */
	protected Ressource ressource;

	/**
	 * The cached value of the '{@link #getWorkDefinition() <em>Work Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkDefinition()
	 * @generated
	 * @ordered
	 */
	protected WorkDefinition workDefinition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NeedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimplepdlPackage.Literals.NEED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNbRessources() {
		return nbRessources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbRessources(int newNbRessources) {
		int oldNbRessources = nbRessources;
		nbRessources = newNbRessources;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplepdlPackage.NEED__NB_RESSOURCES, oldNbRessources, nbRessources));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ressource getRessource() {
		if (ressource != null && ressource.eIsProxy()) {
			InternalEObject oldRessource = (InternalEObject)ressource;
			ressource = (Ressource)eResolveProxy(oldRessource);
			if (ressource != oldRessource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimplepdlPackage.NEED__RESSOURCE, oldRessource, ressource));
			}
		}
		return ressource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ressource basicGetRessource() {
		return ressource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRessource(Ressource newRessource) {
		Ressource oldRessource = ressource;
		ressource = newRessource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplepdlPackage.NEED__RESSOURCE, oldRessource, ressource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkDefinition getWorkDefinition() {
		if (workDefinition != null && workDefinition.eIsProxy()) {
			InternalEObject oldWorkDefinition = (InternalEObject)workDefinition;
			workDefinition = (WorkDefinition)eResolveProxy(oldWorkDefinition);
			if (workDefinition != oldWorkDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimplepdlPackage.NEED__WORK_DEFINITION, oldWorkDefinition, workDefinition));
			}
		}
		return workDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkDefinition basicGetWorkDefinition() {
		return workDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkDefinition(WorkDefinition newWorkDefinition) {
		WorkDefinition oldWorkDefinition = workDefinition;
		workDefinition = newWorkDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplepdlPackage.NEED__WORK_DEFINITION, oldWorkDefinition, workDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimplepdlPackage.NEED__NB_RESSOURCES:
				return getNbRessources();
			case SimplepdlPackage.NEED__RESSOURCE:
				if (resolve) return getRessource();
				return basicGetRessource();
			case SimplepdlPackage.NEED__WORK_DEFINITION:
				if (resolve) return getWorkDefinition();
				return basicGetWorkDefinition();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SimplepdlPackage.NEED__NB_RESSOURCES:
				setNbRessources((Integer)newValue);
				return;
			case SimplepdlPackage.NEED__RESSOURCE:
				setRessource((Ressource)newValue);
				return;
			case SimplepdlPackage.NEED__WORK_DEFINITION:
				setWorkDefinition((WorkDefinition)newValue);
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
			case SimplepdlPackage.NEED__NB_RESSOURCES:
				setNbRessources(NB_RESSOURCES_EDEFAULT);
				return;
			case SimplepdlPackage.NEED__RESSOURCE:
				setRessource((Ressource)null);
				return;
			case SimplepdlPackage.NEED__WORK_DEFINITION:
				setWorkDefinition((WorkDefinition)null);
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
			case SimplepdlPackage.NEED__NB_RESSOURCES:
				return nbRessources != NB_RESSOURCES_EDEFAULT;
			case SimplepdlPackage.NEED__RESSOURCE:
				return ressource != null;
			case SimplepdlPackage.NEED__WORK_DEFINITION:
				return workDefinition != null;
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
		result.append(" (nbRessources: ");
		result.append(nbRessources);
		result.append(')');
		return result.toString();
	}

} //NeedImpl

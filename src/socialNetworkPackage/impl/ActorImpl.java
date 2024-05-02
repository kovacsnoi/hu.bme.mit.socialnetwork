/**
 */
package socialNetworkPackage.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import socialNetworkPackage.Actor;
import socialNetworkPackage.Award;
import socialNetworkPackage.SocialNetworkPackagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link socialNetworkPackage.impl.ActorImpl#getAwards <em>Awards</em>}</li>
 *   <li>{@link socialNetworkPackage.impl.ActorImpl#getArtistName <em>Artist Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActorImpl extends PersonImpl implements Actor {
	/**
	 * The cached value of the '{@link #getAwards() <em>Awards</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAwards()
	 * @generated
	 * @ordered
	 */
	protected EList<Award> awards;

	/**
	 * The default value of the '{@link #getArtistName() <em>Artist Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtistName()
	 * @generated
	 * @ordered
	 */
	protected static final String ARTIST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArtistName() <em>Artist Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtistName()
	 * @generated
	 * @ordered
	 */
	protected String artistName = ARTIST_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SocialNetworkPackagePackage.Literals.ACTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Award> getAwards() {
		if (awards == null) {
			awards = new EObjectResolvingEList<Award>(Award.class, this, SocialNetworkPackagePackage.ACTOR__AWARDS);
		}
		return awards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getArtistName() {
		return artistName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArtistName(String newArtistName) {
		String oldArtistName = artistName;
		artistName = newArtistName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SocialNetworkPackagePackage.ACTOR__ARTIST_NAME, oldArtistName, artistName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SocialNetworkPackagePackage.ACTOR__AWARDS:
				return getAwards();
			case SocialNetworkPackagePackage.ACTOR__ARTIST_NAME:
				return getArtistName();
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
			case SocialNetworkPackagePackage.ACTOR__AWARDS:
				getAwards().clear();
				getAwards().addAll((Collection<? extends Award>)newValue);
				return;
			case SocialNetworkPackagePackage.ACTOR__ARTIST_NAME:
				setArtistName((String)newValue);
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
			case SocialNetworkPackagePackage.ACTOR__AWARDS:
				getAwards().clear();
				return;
			case SocialNetworkPackagePackage.ACTOR__ARTIST_NAME:
				setArtistName(ARTIST_NAME_EDEFAULT);
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
			case SocialNetworkPackagePackage.ACTOR__AWARDS:
				return awards != null && !awards.isEmpty();
			case SocialNetworkPackagePackage.ACTOR__ARTIST_NAME:
				return ARTIST_NAME_EDEFAULT == null ? artistName != null : !ARTIST_NAME_EDEFAULT.equals(artistName);
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
		result.append(" (artistName: ");
		result.append(artistName);
		result.append(')');
		return result.toString();
	}

} //ActorImpl

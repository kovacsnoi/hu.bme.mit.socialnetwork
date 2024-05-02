/**
 */
package socialNetworkPackage.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import socialNetworkPackage.Like;
import socialNetworkPackage.Movie;
import socialNetworkPackage.SocialNetworkPackagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Like</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link socialNetworkPackage.impl.LikeImpl#getDate <em>Date</em>}</li>
 *   <li>{@link socialNetworkPackage.impl.LikeImpl#getMovie <em>Movie</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LikeImpl extends MinimalEObjectImpl.Container implements Like {
	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final int DATE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected int date = DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMovie() <em>Movie</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMovie()
	 * @generated
	 * @ordered
	 */
	protected Movie movie;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LikeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SocialNetworkPackagePackage.Literals.LIKE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(int newDate) {
		int oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SocialNetworkPackagePackage.LIKE__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Movie getMovie() {
		if (movie != null && movie.eIsProxy()) {
			InternalEObject oldMovie = (InternalEObject)movie;
			movie = (Movie)eResolveProxy(oldMovie);
			if (movie != oldMovie) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SocialNetworkPackagePackage.LIKE__MOVIE, oldMovie, movie));
			}
		}
		return movie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Movie basicGetMovie() {
		return movie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMovie(Movie newMovie) {
		Movie oldMovie = movie;
		movie = newMovie;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SocialNetworkPackagePackage.LIKE__MOVIE, oldMovie, movie));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SocialNetworkPackagePackage.LIKE__DATE:
				return getDate();
			case SocialNetworkPackagePackage.LIKE__MOVIE:
				if (resolve) return getMovie();
				return basicGetMovie();
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
			case SocialNetworkPackagePackage.LIKE__DATE:
				setDate((Integer)newValue);
				return;
			case SocialNetworkPackagePackage.LIKE__MOVIE:
				setMovie((Movie)newValue);
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
			case SocialNetworkPackagePackage.LIKE__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case SocialNetworkPackagePackage.LIKE__MOVIE:
				setMovie((Movie)null);
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
			case SocialNetworkPackagePackage.LIKE__DATE:
				return date != DATE_EDEFAULT;
			case SocialNetworkPackagePackage.LIKE__MOVIE:
				return movie != null;
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
		result.append(" (date: ");
		result.append(date);
		result.append(')');
		return result.toString();
	}

} //LikeImpl

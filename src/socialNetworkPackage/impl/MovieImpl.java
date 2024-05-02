/**
 */
package socialNetworkPackage.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import socialNetworkPackage.Award;
import socialNetworkPackage.Movie;
import socialNetworkPackage.SocialNetworkPackagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Movie</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link socialNetworkPackage.impl.MovieImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link socialNetworkPackage.impl.MovieImpl#getGenre <em>Genre</em>}</li>
 *   <li>{@link socialNetworkPackage.impl.MovieImpl#getDate <em>Date</em>}</li>
 *   <li>{@link socialNetworkPackage.impl.MovieImpl#getAwards <em>Awards</em>}</li>
 *   <li>{@link socialNetworkPackage.impl.MovieImpl#getCharacters <em>Characters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MovieImpl extends MinimalEObjectImpl.Container implements Movie {
	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGenre() <em>Genre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenre()
	 * @generated
	 * @ordered
	 */
	protected static final String GENRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGenre() <em>Genre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenre()
	 * @generated
	 * @ordered
	 */
	protected String genre = GENRE_EDEFAULT;

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
	 * The cached value of the '{@link #getAwards() <em>Awards</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAwards()
	 * @generated
	 * @ordered
	 */
	protected EList<Award> awards;

	/**
	 * The cached value of the '{@link #getCharacters() <em>Characters</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacters()
	 * @generated
	 * @ordered
	 */
	protected EList<socialNetworkPackage.Character> characters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MovieImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SocialNetworkPackagePackage.Literals.MOVIE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SocialNetworkPackagePackage.MOVIE__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGenre() {
		return genre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenre(String newGenre) {
		String oldGenre = genre;
		genre = newGenre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SocialNetworkPackagePackage.MOVIE__GENRE, oldGenre, genre));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SocialNetworkPackagePackage.MOVIE__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<socialNetworkPackage.Character> getCharacters() {
		if (characters == null) {
			characters = new EObjectResolvingEList<socialNetworkPackage.Character>(socialNetworkPackage.Character.class, this, SocialNetworkPackagePackage.MOVIE__CHARACTERS);
		}
		return characters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Award> getAwards() {
		if (awards == null) {
			awards = new EObjectResolvingEList<Award>(Award.class, this, SocialNetworkPackagePackage.MOVIE__AWARDS);
		}
		return awards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SocialNetworkPackagePackage.MOVIE__TITLE:
				return getTitle();
			case SocialNetworkPackagePackage.MOVIE__GENRE:
				return getGenre();
			case SocialNetworkPackagePackage.MOVIE__DATE:
				return getDate();
			case SocialNetworkPackagePackage.MOVIE__AWARDS:
				return getAwards();
			case SocialNetworkPackagePackage.MOVIE__CHARACTERS:
				return getCharacters();
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
			case SocialNetworkPackagePackage.MOVIE__TITLE:
				setTitle((String)newValue);
				return;
			case SocialNetworkPackagePackage.MOVIE__GENRE:
				setGenre((String)newValue);
				return;
			case SocialNetworkPackagePackage.MOVIE__DATE:
				setDate((Integer)newValue);
				return;
			case SocialNetworkPackagePackage.MOVIE__AWARDS:
				getAwards().clear();
				getAwards().addAll((Collection<? extends Award>)newValue);
				return;
			case SocialNetworkPackagePackage.MOVIE__CHARACTERS:
				getCharacters().clear();
				getCharacters().addAll((Collection<? extends socialNetworkPackage.Character>)newValue);
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
			case SocialNetworkPackagePackage.MOVIE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case SocialNetworkPackagePackage.MOVIE__GENRE:
				setGenre(GENRE_EDEFAULT);
				return;
			case SocialNetworkPackagePackage.MOVIE__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case SocialNetworkPackagePackage.MOVIE__AWARDS:
				getAwards().clear();
				return;
			case SocialNetworkPackagePackage.MOVIE__CHARACTERS:
				getCharacters().clear();
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
			case SocialNetworkPackagePackage.MOVIE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case SocialNetworkPackagePackage.MOVIE__GENRE:
				return GENRE_EDEFAULT == null ? genre != null : !GENRE_EDEFAULT.equals(genre);
			case SocialNetworkPackagePackage.MOVIE__DATE:
				return date != DATE_EDEFAULT;
			case SocialNetworkPackagePackage.MOVIE__AWARDS:
				return awards != null && !awards.isEmpty();
			case SocialNetworkPackagePackage.MOVIE__CHARACTERS:
				return characters != null && !characters.isEmpty();
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
		result.append(" (title: ");
		result.append(title);
		result.append(", genre: ");
		result.append(genre);
		result.append(", date: ");
		result.append(date);
		result.append(')');
		return result.toString();
	}

} //MovieImpl

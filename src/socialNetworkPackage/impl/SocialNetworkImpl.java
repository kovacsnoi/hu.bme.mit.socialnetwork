/**
 */
package socialNetworkPackage.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import socialNetworkPackage.Award;
import socialNetworkPackage.Like;
import socialNetworkPackage.Movie;
import socialNetworkPackage.Person;
import socialNetworkPackage.SocialNetwork;
import socialNetworkPackage.SocialNetworkPackagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Social Network</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link socialNetworkPackage.impl.SocialNetworkImpl#getPeople <em>People</em>}</li>
 *   <li>{@link socialNetworkPackage.impl.SocialNetworkImpl#getMovies <em>Movies</em>}</li>
 *   <li>{@link socialNetworkPackage.impl.SocialNetworkImpl#getLikes <em>Likes</em>}</li>
 *   <li>{@link socialNetworkPackage.impl.SocialNetworkImpl#getAwards <em>Awards</em>}</li>
 *   <li>{@link socialNetworkPackage.impl.SocialNetworkImpl#getCharacters <em>Characters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SocialNetworkImpl extends MinimalEObjectImpl.Container implements SocialNetwork {
	/**
	 * The cached value of the '{@link #getPeople() <em>People</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeople()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> people;

	/**
	 * The cached value of the '{@link #getMovies() <em>Movies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMovies()
	 * @generated
	 * @ordered
	 */
	protected EList<Movie> movies;

	/**
	 * The cached value of the '{@link #getLikes() <em>Likes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLikes()
	 * @generated
	 * @ordered
	 */
	protected EList<Like> likes;

	/**
	 * The cached value of the '{@link #getAwards() <em>Awards</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAwards()
	 * @generated
	 * @ordered
	 */
	protected EList<Award> awards;

	/**
	 * The cached value of the '{@link #getCharacters() <em>Characters</em>}' containment reference list.
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
	protected SocialNetworkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SocialNetworkPackagePackage.Literals.SOCIAL_NETWORK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Person> getPeople() {
		if (people == null) {
			people = new EObjectContainmentEList<Person>(Person.class, this, SocialNetworkPackagePackage.SOCIAL_NETWORK__PEOPLE);
		}
		return people;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Movie> getMovies() {
		if (movies == null) {
			movies = new EObjectContainmentEList<Movie>(Movie.class, this, SocialNetworkPackagePackage.SOCIAL_NETWORK__MOVIES);
		}
		return movies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Like> getLikes() {
		if (likes == null) {
			likes = new EObjectContainmentEList<Like>(Like.class, this, SocialNetworkPackagePackage.SOCIAL_NETWORK__LIKES);
		}
		return likes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Award> getAwards() {
		if (awards == null) {
			awards = new EObjectContainmentEList<Award>(Award.class, this, SocialNetworkPackagePackage.SOCIAL_NETWORK__AWARDS);
		}
		return awards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<socialNetworkPackage.Character> getCharacters() {
		if (characters == null) {
			characters = new EObjectContainmentEList<socialNetworkPackage.Character>(socialNetworkPackage.Character.class, this, SocialNetworkPackagePackage.SOCIAL_NETWORK__CHARACTERS);
		}
		return characters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SocialNetworkPackagePackage.SOCIAL_NETWORK__PEOPLE:
				return ((InternalEList<?>)getPeople()).basicRemove(otherEnd, msgs);
			case SocialNetworkPackagePackage.SOCIAL_NETWORK__MOVIES:
				return ((InternalEList<?>)getMovies()).basicRemove(otherEnd, msgs);
			case SocialNetworkPackagePackage.SOCIAL_NETWORK__LIKES:
				return ((InternalEList<?>)getLikes()).basicRemove(otherEnd, msgs);
			case SocialNetworkPackagePackage.SOCIAL_NETWORK__AWARDS:
				return ((InternalEList<?>)getAwards()).basicRemove(otherEnd, msgs);
			case SocialNetworkPackagePackage.SOCIAL_NETWORK__CHARACTERS:
				return ((InternalEList<?>)getCharacters()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SocialNetworkPackagePackage.SOCIAL_NETWORK__PEOPLE:
				return getPeople();
			case SocialNetworkPackagePackage.SOCIAL_NETWORK__MOVIES:
				return getMovies();
			case SocialNetworkPackagePackage.SOCIAL_NETWORK__LIKES:
				return getLikes();
			case SocialNetworkPackagePackage.SOCIAL_NETWORK__AWARDS:
				return getAwards();
			case SocialNetworkPackagePackage.SOCIAL_NETWORK__CHARACTERS:
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
			case SocialNetworkPackagePackage.SOCIAL_NETWORK__PEOPLE:
				getPeople().clear();
				getPeople().addAll((Collection<? extends Person>)newValue);
				return;
			case SocialNetworkPackagePackage.SOCIAL_NETWORK__MOVIES:
				getMovies().clear();
				getMovies().addAll((Collection<? extends Movie>)newValue);
				return;
			case SocialNetworkPackagePackage.SOCIAL_NETWORK__LIKES:
				getLikes().clear();
				getLikes().addAll((Collection<? extends Like>)newValue);
				return;
			case SocialNetworkPackagePackage.SOCIAL_NETWORK__AWARDS:
				getAwards().clear();
				getAwards().addAll((Collection<? extends Award>)newValue);
				return;
			case SocialNetworkPackagePackage.SOCIAL_NETWORK__CHARACTERS:
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
			case SocialNetworkPackagePackage.SOCIAL_NETWORK__PEOPLE:
				getPeople().clear();
				return;
			case SocialNetworkPackagePackage.SOCIAL_NETWORK__MOVIES:
				getMovies().clear();
				return;
			case SocialNetworkPackagePackage.SOCIAL_NETWORK__LIKES:
				getLikes().clear();
				return;
			case SocialNetworkPackagePackage.SOCIAL_NETWORK__AWARDS:
				getAwards().clear();
				return;
			case SocialNetworkPackagePackage.SOCIAL_NETWORK__CHARACTERS:
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
			case SocialNetworkPackagePackage.SOCIAL_NETWORK__PEOPLE:
				return people != null && !people.isEmpty();
			case SocialNetworkPackagePackage.SOCIAL_NETWORK__MOVIES:
				return movies != null && !movies.isEmpty();
			case SocialNetworkPackagePackage.SOCIAL_NETWORK__LIKES:
				return likes != null && !likes.isEmpty();
			case SocialNetworkPackagePackage.SOCIAL_NETWORK__AWARDS:
				return awards != null && !awards.isEmpty();
			case SocialNetworkPackagePackage.SOCIAL_NETWORK__CHARACTERS:
				return characters != null && !characters.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SocialNetworkImpl

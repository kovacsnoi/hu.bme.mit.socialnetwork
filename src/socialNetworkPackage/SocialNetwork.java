/**
 */
package socialNetworkPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Social Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link socialNetworkPackage.SocialNetwork#getPeople <em>People</em>}</li>
 *   <li>{@link socialNetworkPackage.SocialNetwork#getMovies <em>Movies</em>}</li>
 *   <li>{@link socialNetworkPackage.SocialNetwork#getLikes <em>Likes</em>}</li>
 *   <li>{@link socialNetworkPackage.SocialNetwork#getAwards <em>Awards</em>}</li>
 *   <li>{@link socialNetworkPackage.SocialNetwork#getCharacters <em>Characters</em>}</li>
 * </ul>
 *
 * @see socialNetworkPackage.SocialNetworkPackagePackage#getSocialNetwork()
 * @model
 * @generated
 */
public interface SocialNetwork extends EObject {
	/**
	 * Returns the value of the '<em><b>People</b></em>' containment reference list.
	 * The list contents are of type {@link socialNetworkPackage.Person}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>People</em>' containment reference list.
	 * @see socialNetworkPackage.SocialNetworkPackagePackage#getSocialNetwork_People()
	 * @model containment="true"
	 * @generated
	 */
	EList<Person> getPeople();

	/**
	 * Returns the value of the '<em><b>Movies</b></em>' containment reference list.
	 * The list contents are of type {@link socialNetworkPackage.Movie}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Movies</em>' containment reference list.
	 * @see socialNetworkPackage.SocialNetworkPackagePackage#getSocialNetwork_Movies()
	 * @model containment="true"
	 * @generated
	 */
	EList<Movie> getMovies();

	/**
	 * Returns the value of the '<em><b>Likes</b></em>' containment reference list.
	 * The list contents are of type {@link socialNetworkPackage.Like}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Likes</em>' containment reference list.
	 * @see socialNetworkPackage.SocialNetworkPackagePackage#getSocialNetwork_Likes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Like> getLikes();

	/**
	 * Returns the value of the '<em><b>Awards</b></em>' containment reference list.
	 * The list contents are of type {@link socialNetworkPackage.Award}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Awards</em>' containment reference list.
	 * @see socialNetworkPackage.SocialNetworkPackagePackage#getSocialNetwork_Awards()
	 * @model containment="true"
	 * @generated
	 */
	EList<Award> getAwards();

	/**
	 * Returns the value of the '<em><b>Characters</b></em>' containment reference list.
	 * The list contents are of type {@link socialNetworkPackage.Character}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Characters</em>' containment reference list.
	 * @see socialNetworkPackage.SocialNetworkPackagePackage#getSocialNetwork_Characters()
	 * @model containment="true"
	 * @generated
	 */
	EList<socialNetworkPackage.Character> getCharacters();

} // SocialNetwork

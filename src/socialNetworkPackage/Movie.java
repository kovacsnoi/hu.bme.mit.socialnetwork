/**
 */
package socialNetworkPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Movie</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link socialNetworkPackage.Movie#getTitle <em>Title</em>}</li>
 *   <li>{@link socialNetworkPackage.Movie#getGenre <em>Genre</em>}</li>
 *   <li>{@link socialNetworkPackage.Movie#getDate <em>Date</em>}</li>
 *   <li>{@link socialNetworkPackage.Movie#getAwards <em>Awards</em>}</li>
 *   <li>{@link socialNetworkPackage.Movie#getCharacters <em>Characters</em>}</li>
 * </ul>
 *
 * @see socialNetworkPackage.SocialNetworkPackagePackage#getMovie()
 * @model
 * @generated
 */
public interface Movie extends EObject {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see socialNetworkPackage.SocialNetworkPackagePackage#getMovie_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link socialNetworkPackage.Movie#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Genre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Genre</em>' attribute.
	 * @see #setGenre(String)
	 * @see socialNetworkPackage.SocialNetworkPackagePackage#getMovie_Genre()
	 * @model
	 * @generated
	 */
	String getGenre();

	/**
	 * Sets the value of the '{@link socialNetworkPackage.Movie#getGenre <em>Genre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Genre</em>' attribute.
	 * @see #getGenre()
	 * @generated
	 */
	void setGenre(String value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(int)
	 * @see socialNetworkPackage.SocialNetworkPackagePackage#getMovie_Date()
	 * @model
	 * @generated
	 */
	int getDate();

	/**
	 * Sets the value of the '{@link socialNetworkPackage.Movie#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(int value);

	/**
	 * Returns the value of the '<em><b>Characters</b></em>' reference list.
	 * The list contents are of type {@link socialNetworkPackage.Character}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Characters</em>' reference list.
	 * @see socialNetworkPackage.SocialNetworkPackagePackage#getMovie_Characters()
	 * @model
	 * @generated
	 */
	EList<socialNetworkPackage.Character> getCharacters();

	/**
	 * Returns the value of the '<em><b>Awards</b></em>' reference list.
	 * The list contents are of type {@link socialNetworkPackage.Award}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Awards</em>' reference list.
	 * @see socialNetworkPackage.SocialNetworkPackagePackage#getMovie_Awards()
	 * @model
	 * @generated
	 */
	EList<Award> getAwards();

} // Movie

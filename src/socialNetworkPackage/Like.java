/**
 */
package socialNetworkPackage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Like</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link socialNetworkPackage.Like#getDate <em>Date</em>}</li>
 *   <li>{@link socialNetworkPackage.Like#getMovie <em>Movie</em>}</li>
 * </ul>
 *
 * @see socialNetworkPackage.SocialNetworkPackagePackage#getLike()
 * @model
 * @generated
 */
public interface Like extends EObject {
	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(int)
	 * @see socialNetworkPackage.SocialNetworkPackagePackage#getLike_Date()
	 * @model
	 * @generated
	 */
	int getDate();

	/**
	 * Sets the value of the '{@link socialNetworkPackage.Like#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(int value);

	/**
	 * Returns the value of the '<em><b>Movie</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Movie</em>' reference.
	 * @see #setMovie(Movie)
	 * @see socialNetworkPackage.SocialNetworkPackagePackage#getLike_Movie()
	 * @model
	 * @generated
	 */
	Movie getMovie();

	/**
	 * Sets the value of the '{@link socialNetworkPackage.Like#getMovie <em>Movie</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Movie</em>' reference.
	 * @see #getMovie()
	 * @generated
	 */
	void setMovie(Movie value);

} // Like

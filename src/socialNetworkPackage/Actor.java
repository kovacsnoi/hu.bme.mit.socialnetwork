/**
 */
package socialNetworkPackage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link socialNetworkPackage.Actor#getAwards <em>Awards</em>}</li>
 *   <li>{@link socialNetworkPackage.Actor#getArtistName <em>Artist Name</em>}</li>
 * </ul>
 *
 * @see socialNetworkPackage.SocialNetworkPackagePackage#getActor()
 * @model
 * @generated
 */
public interface Actor extends Person {
	/**
	 * Returns the value of the '<em><b>Awards</b></em>' reference list.
	 * The list contents are of type {@link socialNetworkPackage.Award}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Awards</em>' reference list.
	 * @see socialNetworkPackage.SocialNetworkPackagePackage#getActor_Awards()
	 * @model
	 * @generated
	 */
	EList<Award> getAwards();

	/**
	 * Returns the value of the '<em><b>Artist Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artist Name</em>' attribute.
	 * @see #setArtistName(String)
	 * @see socialNetworkPackage.SocialNetworkPackagePackage#getActor_ArtistName()
	 * @model
	 * @generated
	 */
	String getArtistName();

	/**
	 * Sets the value of the '{@link socialNetworkPackage.Actor#getArtistName <em>Artist Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Artist Name</em>' attribute.
	 * @see #getArtistName()
	 * @generated
	 */
	void setArtistName(String value);

} // Actor

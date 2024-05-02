/**
 */
package socialNetworkPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link socialNetworkPackage.Person#getParent <em>Parent</em>}</li>
 *   <li>{@link socialNetworkPackage.Person#getPosts <em>Posts</em>}</li>
 *   <li>{@link socialNetworkPackage.Person#getName <em>Name</em>}</li>
 *   <li>{@link socialNetworkPackage.Person#getLikes <em>Likes</em>}</li>
 *   <li>{@link socialNetworkPackage.Person#getAge <em>Age</em>}</li>
 *   <li>{@link socialNetworkPackage.Person#getGender <em>Gender</em>}</li>
 * </ul>
 *
 * @see socialNetworkPackage.SocialNetworkPackagePackage#getPerson()
 * @model
 * @generated
 */
public interface Person extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference list.
	 * The list contents are of type {@link socialNetworkPackage.Person}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference list.
	 * @see socialNetworkPackage.SocialNetworkPackagePackage#getPerson_Parent()
	 * @model upper="2"
	 * @generated
	 */
	EList<Person> getParent();

	/**
	 * Returns the value of the '<em><b>Posts</b></em>' containment reference list.
	 * The list contents are of type {@link socialNetworkPackage.Post}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Posts</em>' containment reference list.
	 * @see socialNetworkPackage.SocialNetworkPackagePackage#getPerson_Posts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Post> getPosts();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see socialNetworkPackage.SocialNetworkPackagePackage#getPerson_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link socialNetworkPackage.Person#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Likes</b></em>' reference list.
	 * The list contents are of type {@link socialNetworkPackage.Like}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Likes</em>' reference list.
	 * @see socialNetworkPackage.SocialNetworkPackagePackage#getPerson_Likes()
	 * @model
	 * @generated
	 */
	EList<Like> getLikes();

	/**
	 * Returns the value of the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Age</em>' attribute.
	 * @see #setAge(int)
	 * @see socialNetworkPackage.SocialNetworkPackagePackage#getPerson_Age()
	 * @model
	 * @generated
	 */
	int getAge();

	/**
	 * Sets the value of the '{@link socialNetworkPackage.Person#getAge <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Age</em>' attribute.
	 * @see #getAge()
	 * @generated
	 */
	void setAge(int value);

	/**
	 * Returns the value of the '<em><b>Gender</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gender</em>' attribute.
	 * @see #setGender(String)
	 * @see socialNetworkPackage.SocialNetworkPackagePackage#getPerson_Gender()
	 * @model
	 * @generated
	 */
	String getGender();

	/**
	 * Sets the value of the '{@link socialNetworkPackage.Person#getGender <em>Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gender</em>' attribute.
	 * @see #getGender()
	 * @generated
	 */
	void setGender(String value);

} // Person

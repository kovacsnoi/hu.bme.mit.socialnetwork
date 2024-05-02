/**
 */
package socialNetworkPackage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Award</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link socialNetworkPackage.Award#getName <em>Name</em>}</li>
 *   <li>{@link socialNetworkPackage.Award#getChategory <em>Chategory</em>}</li>
 * </ul>
 *
 * @see socialNetworkPackage.SocialNetworkPackagePackage#getAward()
 * @model
 * @generated
 */
public interface Award extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see socialNetworkPackage.SocialNetworkPackagePackage#getAward_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link socialNetworkPackage.Award#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Chategory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chategory</em>' attribute.
	 * @see #setChategory(String)
	 * @see socialNetworkPackage.SocialNetworkPackagePackage#getAward_Chategory()
	 * @model
	 * @generated
	 */
	String getChategory();

	/**
	 * Sets the value of the '{@link socialNetworkPackage.Award#getChategory <em>Chategory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chategory</em>' attribute.
	 * @see #getChategory()
	 * @generated
	 */
	void setChategory(String value);

} // Award

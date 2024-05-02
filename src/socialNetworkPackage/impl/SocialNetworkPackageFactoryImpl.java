/**
 */
package socialNetworkPackage.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import socialNetworkPackage.Actor;
import socialNetworkPackage.Award;
import socialNetworkPackage.Like;
import socialNetworkPackage.Movie;
import socialNetworkPackage.Person;
import socialNetworkPackage.Post;
import socialNetworkPackage.SocialNetwork;
import socialNetworkPackage.SocialNetworkPackageFactory;
import socialNetworkPackage.SocialNetworkPackagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SocialNetworkPackageFactoryImpl extends EFactoryImpl implements SocialNetworkPackageFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SocialNetworkPackageFactory init() {
		try {
			SocialNetworkPackageFactory theSocialNetworkPackageFactory = (SocialNetworkPackageFactory)EPackage.Registry.INSTANCE.getEFactory(SocialNetworkPackagePackage.eNS_URI);
			if (theSocialNetworkPackageFactory != null) {
				return theSocialNetworkPackageFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SocialNetworkPackageFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SocialNetworkPackageFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SocialNetworkPackagePackage.SOCIAL_NETWORK: return createSocialNetwork();
			case SocialNetworkPackagePackage.PERSON: return createPerson();
			case SocialNetworkPackagePackage.POST: return createPost();
			case SocialNetworkPackagePackage.ACTOR: return createActor();
			case SocialNetworkPackagePackage.MOVIE: return createMovie();
			case SocialNetworkPackagePackage.CHARACTER: return createCharacter();
			case SocialNetworkPackagePackage.AWARD: return createAward();
			case SocialNetworkPackagePackage.LIKE: return createLike();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SocialNetwork createSocialNetwork() {
		SocialNetworkImpl socialNetwork = new SocialNetworkImpl();
		return socialNetwork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person createPerson() {
		PersonImpl person = new PersonImpl();
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Post createPost() {
		PostImpl post = new PostImpl();
		return post;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor createActor() {
		ActorImpl actor = new ActorImpl();
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Movie createMovie() {
		MovieImpl movie = new MovieImpl();
		return movie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public socialNetworkPackage.Character createCharacter() {
		CharacterImpl character = new CharacterImpl();
		return character;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Award createAward() {
		AwardImpl award = new AwardImpl();
		return award;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Like createLike() {
		LikeImpl like = new LikeImpl();
		return like;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SocialNetworkPackagePackage getSocialNetworkPackagePackage() {
		return (SocialNetworkPackagePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SocialNetworkPackagePackage getPackage() {
		return SocialNetworkPackagePackage.eINSTANCE;
	}

} //SocialNetworkPackageFactoryImpl

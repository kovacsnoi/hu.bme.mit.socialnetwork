/**
 */
package socialNetworkPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see socialNetworkPackage.SocialNetworkPackageFactory
 * @model kind="package"
 * @generated
 */
public interface SocialNetworkPackagePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "socialNetworkPackage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "hu.bme.mit.socialnetwork";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "hu.bme.mit.socialnetwork";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SocialNetworkPackagePackage eINSTANCE = socialNetworkPackage.impl.SocialNetworkPackagePackageImpl.init();

	/**
	 * The meta object id for the '{@link socialNetworkPackage.impl.SocialNetworkImpl <em>Social Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see socialNetworkPackage.impl.SocialNetworkImpl
	 * @see socialNetworkPackage.impl.SocialNetworkPackagePackageImpl#getSocialNetwork()
	 * @generated
	 */
	int SOCIAL_NETWORK = 0;

	/**
	 * The feature id for the '<em><b>People</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_NETWORK__PEOPLE = 0;

	/**
	 * The feature id for the '<em><b>Movies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_NETWORK__MOVIES = 1;

	/**
	 * The feature id for the '<em><b>Likes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_NETWORK__LIKES = 2;

	/**
	 * The feature id for the '<em><b>Awards</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_NETWORK__AWARDS = 3;

	/**
	 * The feature id for the '<em><b>Characters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_NETWORK__CHARACTERS = 4;

	/**
	 * The number of structural features of the '<em>Social Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_NETWORK_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Social Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_NETWORK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link socialNetworkPackage.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see socialNetworkPackage.impl.PersonImpl
	 * @see socialNetworkPackage.impl.SocialNetworkPackagePackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Posts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__POSTS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NAME = 2;

	/**
	 * The feature id for the '<em><b>Likes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__LIKES = 3;

	/**
	 * The feature id for the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__AGE = 4;

	/**
	 * The feature id for the '<em><b>Gender</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__GENDER = 5;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link socialNetworkPackage.impl.PostImpl <em>Post</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see socialNetworkPackage.impl.PostImpl
	 * @see socialNetworkPackage.impl.SocialNetworkPackagePackageImpl#getPost()
	 * @generated
	 */
	int POST = 2;

	/**
	 * The number of structural features of the '<em>Post</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Post</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link socialNetworkPackage.impl.ActorImpl <em>Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see socialNetworkPackage.impl.ActorImpl
	 * @see socialNetworkPackage.impl.SocialNetworkPackagePackageImpl#getActor()
	 * @generated
	 */
	int ACTOR = 3;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__PARENT = PERSON__PARENT;

	/**
	 * The feature id for the '<em><b>Posts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__POSTS = PERSON__POSTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__NAME = PERSON__NAME;

	/**
	 * The feature id for the '<em><b>Likes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__LIKES = PERSON__LIKES;

	/**
	 * The feature id for the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__AGE = PERSON__AGE;

	/**
	 * The feature id for the '<em><b>Gender</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__GENDER = PERSON__GENDER;

	/**
	 * The feature id for the '<em><b>Awards</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__AWARDS = PERSON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Artist Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__ARTIST_NAME = PERSON_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_FEATURE_COUNT = PERSON_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_OPERATION_COUNT = PERSON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link socialNetworkPackage.impl.MovieImpl <em>Movie</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see socialNetworkPackage.impl.MovieImpl
	 * @see socialNetworkPackage.impl.SocialNetworkPackagePackageImpl#getMovie()
	 * @generated
	 */
	int MOVIE = 4;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVIE__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Genre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVIE__GENRE = 1;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVIE__DATE = 2;

	/**
	 * The feature id for the '<em><b>Awards</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVIE__AWARDS = 3;

	/**
	 * The feature id for the '<em><b>Characters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVIE__CHARACTERS = 4;

	/**
	 * The number of structural features of the '<em>Movie</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVIE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Movie</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVIE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link socialNetworkPackage.impl.CharacterImpl <em>Character</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see socialNetworkPackage.impl.CharacterImpl
	 * @see socialNetworkPackage.impl.SocialNetworkPackagePackageImpl#getCharacter()
	 * @generated
	 */
	int CHARACTER = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER__ACTOR = 1;

	/**
	 * The number of structural features of the '<em>Character</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Character</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link socialNetworkPackage.impl.AwardImpl <em>Award</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see socialNetworkPackage.impl.AwardImpl
	 * @see socialNetworkPackage.impl.SocialNetworkPackagePackageImpl#getAward()
	 * @generated
	 */
	int AWARD = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWARD__NAME = 0;

	/**
	 * The feature id for the '<em><b>Chategory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWARD__CHATEGORY = 1;

	/**
	 * The number of structural features of the '<em>Award</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWARD_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Award</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWARD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link socialNetworkPackage.impl.LikeImpl <em>Like</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see socialNetworkPackage.impl.LikeImpl
	 * @see socialNetworkPackage.impl.SocialNetworkPackagePackageImpl#getLike()
	 * @generated
	 */
	int LIKE = 7;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIKE__DATE = 0;

	/**
	 * The feature id for the '<em><b>Movie</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIKE__MOVIE = 1;

	/**
	 * The number of structural features of the '<em>Like</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIKE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Like</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIKE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link socialNetworkPackage.SocialNetwork <em>Social Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Social Network</em>'.
	 * @see socialNetworkPackage.SocialNetwork
	 * @generated
	 */
	EClass getSocialNetwork();

	/**
	 * Returns the meta object for the containment reference list '{@link socialNetworkPackage.SocialNetwork#getPeople <em>People</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>People</em>'.
	 * @see socialNetworkPackage.SocialNetwork#getPeople()
	 * @see #getSocialNetwork()
	 * @generated
	 */
	EReference getSocialNetwork_People();

	/**
	 * Returns the meta object for the containment reference list '{@link socialNetworkPackage.SocialNetwork#getMovies <em>Movies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Movies</em>'.
	 * @see socialNetworkPackage.SocialNetwork#getMovies()
	 * @see #getSocialNetwork()
	 * @generated
	 */
	EReference getSocialNetwork_Movies();

	/**
	 * Returns the meta object for the containment reference list '{@link socialNetworkPackage.SocialNetwork#getLikes <em>Likes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Likes</em>'.
	 * @see socialNetworkPackage.SocialNetwork#getLikes()
	 * @see #getSocialNetwork()
	 * @generated
	 */
	EReference getSocialNetwork_Likes();

	/**
	 * Returns the meta object for the containment reference list '{@link socialNetworkPackage.SocialNetwork#getAwards <em>Awards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Awards</em>'.
	 * @see socialNetworkPackage.SocialNetwork#getAwards()
	 * @see #getSocialNetwork()
	 * @generated
	 */
	EReference getSocialNetwork_Awards();

	/**
	 * Returns the meta object for the containment reference list '{@link socialNetworkPackage.SocialNetwork#getCharacters <em>Characters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Characters</em>'.
	 * @see socialNetworkPackage.SocialNetwork#getCharacters()
	 * @see #getSocialNetwork()
	 * @generated
	 */
	EReference getSocialNetwork_Characters();

	/**
	 * Returns the meta object for class '{@link socialNetworkPackage.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see socialNetworkPackage.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the reference list '{@link socialNetworkPackage.Person#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parent</em>'.
	 * @see socialNetworkPackage.Person#getParent()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Parent();

	/**
	 * Returns the meta object for the containment reference list '{@link socialNetworkPackage.Person#getPosts <em>Posts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Posts</em>'.
	 * @see socialNetworkPackage.Person#getPosts()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Posts();

	/**
	 * Returns the meta object for the attribute '{@link socialNetworkPackage.Person#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see socialNetworkPackage.Person#getName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Name();

	/**
	 * Returns the meta object for the reference list '{@link socialNetworkPackage.Person#getLikes <em>Likes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Likes</em>'.
	 * @see socialNetworkPackage.Person#getLikes()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Likes();

	/**
	 * Returns the meta object for the attribute '{@link socialNetworkPackage.Person#getAge <em>Age</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Age</em>'.
	 * @see socialNetworkPackage.Person#getAge()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Age();

	/**
	 * Returns the meta object for the attribute '{@link socialNetworkPackage.Person#getGender <em>Gender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gender</em>'.
	 * @see socialNetworkPackage.Person#getGender()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Gender();

	/**
	 * Returns the meta object for class '{@link socialNetworkPackage.Post <em>Post</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Post</em>'.
	 * @see socialNetworkPackage.Post
	 * @generated
	 */
	EClass getPost();

	/**
	 * Returns the meta object for class '{@link socialNetworkPackage.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor</em>'.
	 * @see socialNetworkPackage.Actor
	 * @generated
	 */
	EClass getActor();

	/**
	 * Returns the meta object for the reference list '{@link socialNetworkPackage.Actor#getAwards <em>Awards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Awards</em>'.
	 * @see socialNetworkPackage.Actor#getAwards()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_Awards();

	/**
	 * Returns the meta object for the attribute '{@link socialNetworkPackage.Actor#getArtistName <em>Artist Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Artist Name</em>'.
	 * @see socialNetworkPackage.Actor#getArtistName()
	 * @see #getActor()
	 * @generated
	 */
	EAttribute getActor_ArtistName();

	/**
	 * Returns the meta object for class '{@link socialNetworkPackage.Movie <em>Movie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Movie</em>'.
	 * @see socialNetworkPackage.Movie
	 * @generated
	 */
	EClass getMovie();

	/**
	 * Returns the meta object for the attribute '{@link socialNetworkPackage.Movie#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see socialNetworkPackage.Movie#getTitle()
	 * @see #getMovie()
	 * @generated
	 */
	EAttribute getMovie_Title();

	/**
	 * Returns the meta object for the attribute '{@link socialNetworkPackage.Movie#getGenre <em>Genre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Genre</em>'.
	 * @see socialNetworkPackage.Movie#getGenre()
	 * @see #getMovie()
	 * @generated
	 */
	EAttribute getMovie_Genre();

	/**
	 * Returns the meta object for the attribute '{@link socialNetworkPackage.Movie#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see socialNetworkPackage.Movie#getDate()
	 * @see #getMovie()
	 * @generated
	 */
	EAttribute getMovie_Date();

	/**
	 * Returns the meta object for the reference list '{@link socialNetworkPackage.Movie#getCharacters <em>Characters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Characters</em>'.
	 * @see socialNetworkPackage.Movie#getCharacters()
	 * @see #getMovie()
	 * @generated
	 */
	EReference getMovie_Characters();

	/**
	 * Returns the meta object for the reference list '{@link socialNetworkPackage.Movie#getAwards <em>Awards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Awards</em>'.
	 * @see socialNetworkPackage.Movie#getAwards()
	 * @see #getMovie()
	 * @generated
	 */
	EReference getMovie_Awards();

	/**
	 * Returns the meta object for class '{@link socialNetworkPackage.Character <em>Character</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Character</em>'.
	 * @see socialNetworkPackage.Character
	 * @generated
	 */
	EClass getCharacter();

	/**
	 * Returns the meta object for the attribute '{@link socialNetworkPackage.Character#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see socialNetworkPackage.Character#getName()
	 * @see #getCharacter()
	 * @generated
	 */
	EAttribute getCharacter_Name();

	/**
	 * Returns the meta object for the reference '{@link socialNetworkPackage.Character#getActor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Actor</em>'.
	 * @see socialNetworkPackage.Character#getActor()
	 * @see #getCharacter()
	 * @generated
	 */
	EReference getCharacter_Actor();

	/**
	 * Returns the meta object for class '{@link socialNetworkPackage.Award <em>Award</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Award</em>'.
	 * @see socialNetworkPackage.Award
	 * @generated
	 */
	EClass getAward();

	/**
	 * Returns the meta object for the attribute '{@link socialNetworkPackage.Award#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see socialNetworkPackage.Award#getName()
	 * @see #getAward()
	 * @generated
	 */
	EAttribute getAward_Name();

	/**
	 * Returns the meta object for the attribute '{@link socialNetworkPackage.Award#getChategory <em>Chategory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Chategory</em>'.
	 * @see socialNetworkPackage.Award#getChategory()
	 * @see #getAward()
	 * @generated
	 */
	EAttribute getAward_Chategory();

	/**
	 * Returns the meta object for class '{@link socialNetworkPackage.Like <em>Like</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Like</em>'.
	 * @see socialNetworkPackage.Like
	 * @generated
	 */
	EClass getLike();

	/**
	 * Returns the meta object for the attribute '{@link socialNetworkPackage.Like#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see socialNetworkPackage.Like#getDate()
	 * @see #getLike()
	 * @generated
	 */
	EAttribute getLike_Date();

	/**
	 * Returns the meta object for the reference '{@link socialNetworkPackage.Like#getMovie <em>Movie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Movie</em>'.
	 * @see socialNetworkPackage.Like#getMovie()
	 * @see #getLike()
	 * @generated
	 */
	EReference getLike_Movie();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SocialNetworkPackageFactory getSocialNetworkPackageFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link socialNetworkPackage.impl.SocialNetworkImpl <em>Social Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see socialNetworkPackage.impl.SocialNetworkImpl
		 * @see socialNetworkPackage.impl.SocialNetworkPackagePackageImpl#getSocialNetwork()
		 * @generated
		 */
		EClass SOCIAL_NETWORK = eINSTANCE.getSocialNetwork();

		/**
		 * The meta object literal for the '<em><b>People</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOCIAL_NETWORK__PEOPLE = eINSTANCE.getSocialNetwork_People();

		/**
		 * The meta object literal for the '<em><b>Movies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOCIAL_NETWORK__MOVIES = eINSTANCE.getSocialNetwork_Movies();

		/**
		 * The meta object literal for the '<em><b>Likes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOCIAL_NETWORK__LIKES = eINSTANCE.getSocialNetwork_Likes();

		/**
		 * The meta object literal for the '<em><b>Awards</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOCIAL_NETWORK__AWARDS = eINSTANCE.getSocialNetwork_Awards();

		/**
		 * The meta object literal for the '<em><b>Characters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOCIAL_NETWORK__CHARACTERS = eINSTANCE.getSocialNetwork_Characters();

		/**
		 * The meta object literal for the '{@link socialNetworkPackage.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see socialNetworkPackage.impl.PersonImpl
		 * @see socialNetworkPackage.impl.SocialNetworkPackagePackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__PARENT = eINSTANCE.getPerson_Parent();

		/**
		 * The meta object literal for the '<em><b>Posts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__POSTS = eINSTANCE.getPerson_Posts();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__NAME = eINSTANCE.getPerson_Name();

		/**
		 * The meta object literal for the '<em><b>Likes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__LIKES = eINSTANCE.getPerson_Likes();

		/**
		 * The meta object literal for the '<em><b>Age</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__AGE = eINSTANCE.getPerson_Age();

		/**
		 * The meta object literal for the '<em><b>Gender</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__GENDER = eINSTANCE.getPerson_Gender();

		/**
		 * The meta object literal for the '{@link socialNetworkPackage.impl.PostImpl <em>Post</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see socialNetworkPackage.impl.PostImpl
		 * @see socialNetworkPackage.impl.SocialNetworkPackagePackageImpl#getPost()
		 * @generated
		 */
		EClass POST = eINSTANCE.getPost();

		/**
		 * The meta object literal for the '{@link socialNetworkPackage.impl.ActorImpl <em>Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see socialNetworkPackage.impl.ActorImpl
		 * @see socialNetworkPackage.impl.SocialNetworkPackagePackageImpl#getActor()
		 * @generated
		 */
		EClass ACTOR = eINSTANCE.getActor();

		/**
		 * The meta object literal for the '<em><b>Awards</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR__AWARDS = eINSTANCE.getActor_Awards();

		/**
		 * The meta object literal for the '<em><b>Artist Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR__ARTIST_NAME = eINSTANCE.getActor_ArtistName();

		/**
		 * The meta object literal for the '{@link socialNetworkPackage.impl.MovieImpl <em>Movie</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see socialNetworkPackage.impl.MovieImpl
		 * @see socialNetworkPackage.impl.SocialNetworkPackagePackageImpl#getMovie()
		 * @generated
		 */
		EClass MOVIE = eINSTANCE.getMovie();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVIE__TITLE = eINSTANCE.getMovie_Title();

		/**
		 * The meta object literal for the '<em><b>Genre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVIE__GENRE = eINSTANCE.getMovie_Genre();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVIE__DATE = eINSTANCE.getMovie_Date();

		/**
		 * The meta object literal for the '<em><b>Characters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOVIE__CHARACTERS = eINSTANCE.getMovie_Characters();

		/**
		 * The meta object literal for the '<em><b>Awards</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOVIE__AWARDS = eINSTANCE.getMovie_Awards();

		/**
		 * The meta object literal for the '{@link socialNetworkPackage.impl.CharacterImpl <em>Character</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see socialNetworkPackage.impl.CharacterImpl
		 * @see socialNetworkPackage.impl.SocialNetworkPackagePackageImpl#getCharacter()
		 * @generated
		 */
		EClass CHARACTER = eINSTANCE.getCharacter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTER__NAME = eINSTANCE.getCharacter_Name();

		/**
		 * The meta object literal for the '<em><b>Actor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHARACTER__ACTOR = eINSTANCE.getCharacter_Actor();

		/**
		 * The meta object literal for the '{@link socialNetworkPackage.impl.AwardImpl <em>Award</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see socialNetworkPackage.impl.AwardImpl
		 * @see socialNetworkPackage.impl.SocialNetworkPackagePackageImpl#getAward()
		 * @generated
		 */
		EClass AWARD = eINSTANCE.getAward();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AWARD__NAME = eINSTANCE.getAward_Name();

		/**
		 * The meta object literal for the '<em><b>Chategory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AWARD__CHATEGORY = eINSTANCE.getAward_Chategory();

		/**
		 * The meta object literal for the '{@link socialNetworkPackage.impl.LikeImpl <em>Like</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see socialNetworkPackage.impl.LikeImpl
		 * @see socialNetworkPackage.impl.SocialNetworkPackagePackageImpl#getLike()
		 * @generated
		 */
		EClass LIKE = eINSTANCE.getLike();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIKE__DATE = eINSTANCE.getLike_Date();

		/**
		 * The meta object literal for the '<em><b>Movie</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIKE__MOVIE = eINSTANCE.getLike_Movie();

	}

} //SocialNetworkPackagePackage

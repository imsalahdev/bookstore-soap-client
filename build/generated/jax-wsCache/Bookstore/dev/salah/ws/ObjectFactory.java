
package dev.salah.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the dev.salah.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CreateBook_QNAME = new QName("http://services.salah.dev/", "createBook");
    private final static QName _CreateBookResponse_QNAME = new QName("http://services.salah.dev/", "createBookResponse");
    private final static QName _CreateCart_QNAME = new QName("http://services.salah.dev/", "createCart");
    private final static QName _CreateCartResponse_QNAME = new QName("http://services.salah.dev/", "createCartResponse");
    private final static QName _CreateCategory_QNAME = new QName("http://services.salah.dev/", "createCategory");
    private final static QName _CreateCategoryResponse_QNAME = new QName("http://services.salah.dev/", "createCategoryResponse");
    private final static QName _CreateUser_QNAME = new QName("http://services.salah.dev/", "createUser");
    private final static QName _CreateUserResponse_QNAME = new QName("http://services.salah.dev/", "createUserResponse");
    private final static QName _EditBook_QNAME = new QName("http://services.salah.dev/", "editBook");
    private final static QName _EditBookResponse_QNAME = new QName("http://services.salah.dev/", "editBookResponse");
    private final static QName _EditCart_QNAME = new QName("http://services.salah.dev/", "editCart");
    private final static QName _EditCartResponse_QNAME = new QName("http://services.salah.dev/", "editCartResponse");
    private final static QName _EditCategory_QNAME = new QName("http://services.salah.dev/", "editCategory");
    private final static QName _EditCategoryResponse_QNAME = new QName("http://services.salah.dev/", "editCategoryResponse");
    private final static QName _EditUser_QNAME = new QName("http://services.salah.dev/", "editUser");
    private final static QName _EditUserResponse_QNAME = new QName("http://services.salah.dev/", "editUserResponse");
    private final static QName _FindAllBooks_QNAME = new QName("http://services.salah.dev/", "findAllBooks");
    private final static QName _FindAllBooksResponse_QNAME = new QName("http://services.salah.dev/", "findAllBooksResponse");
    private final static QName _FindAllCarts_QNAME = new QName("http://services.salah.dev/", "findAllCarts");
    private final static QName _FindAllCartsResponse_QNAME = new QName("http://services.salah.dev/", "findAllCartsResponse");
    private final static QName _FindAllCategories_QNAME = new QName("http://services.salah.dev/", "findAllCategories");
    private final static QName _FindAllCategoriesResponse_QNAME = new QName("http://services.salah.dev/", "findAllCategoriesResponse");
    private final static QName _FindAllUsers_QNAME = new QName("http://services.salah.dev/", "findAllUsers");
    private final static QName _FindAllUsersResponse_QNAME = new QName("http://services.salah.dev/", "findAllUsersResponse");
    private final static QName _FindBook_QNAME = new QName("http://services.salah.dev/", "findBook");
    private final static QName _FindBookResponse_QNAME = new QName("http://services.salah.dev/", "findBookResponse");
    private final static QName _FindByCart_QNAME = new QName("http://services.salah.dev/", "findByCart");
    private final static QName _FindByCartResponse_QNAME = new QName("http://services.salah.dev/", "findByCartResponse");
    private final static QName _FindByCategoryID_QNAME = new QName("http://services.salah.dev/", "findByCategoryID");
    private final static QName _FindByCategoryIDResponse_QNAME = new QName("http://services.salah.dev/", "findByCategoryIDResponse");
    private final static QName _FindByEmail_QNAME = new QName("http://services.salah.dev/", "findByEmail");
    private final static QName _FindByEmailResponse_QNAME = new QName("http://services.salah.dev/", "findByEmailResponse");
    private final static QName _FindByUserId_QNAME = new QName("http://services.salah.dev/", "findByUserId");
    private final static QName _FindByUserIdResponse_QNAME = new QName("http://services.salah.dev/", "findByUserIdResponse");
    private final static QName _FindCart_QNAME = new QName("http://services.salah.dev/", "findCart");
    private final static QName _FindCartResponse_QNAME = new QName("http://services.salah.dev/", "findCartResponse");
    private final static QName _FindCategory_QNAME = new QName("http://services.salah.dev/", "findCategory");
    private final static QName _FindCategoryResponse_QNAME = new QName("http://services.salah.dev/", "findCategoryResponse");
    private final static QName _FindUser_QNAME = new QName("http://services.salah.dev/", "findUser");
    private final static QName _FindUserResponse_QNAME = new QName("http://services.salah.dev/", "findUserResponse");
    private final static QName _RemoveBook_QNAME = new QName("http://services.salah.dev/", "removeBook");
    private final static QName _RemoveBookResponse_QNAME = new QName("http://services.salah.dev/", "removeBookResponse");
    private final static QName _RemoveByCart_QNAME = new QName("http://services.salah.dev/", "removeByCart");
    private final static QName _RemoveByCartResponse_QNAME = new QName("http://services.salah.dev/", "removeByCartResponse");
    private final static QName _RemoveByUserID_QNAME = new QName("http://services.salah.dev/", "removeByUserID");
    private final static QName _RemoveByUserIDResponse_QNAME = new QName("http://services.salah.dev/", "removeByUserIDResponse");
    private final static QName _RemoveCart_QNAME = new QName("http://services.salah.dev/", "removeCart");
    private final static QName _RemoveCartResponse_QNAME = new QName("http://services.salah.dev/", "removeCartResponse");
    private final static QName _RemoveCategory_QNAME = new QName("http://services.salah.dev/", "removeCategory");
    private final static QName _RemoveCategoryResponse_QNAME = new QName("http://services.salah.dev/", "removeCategoryResponse");
    private final static QName _RemoveUser_QNAME = new QName("http://services.salah.dev/", "removeUser");
    private final static QName _RemoveUserResponse_QNAME = new QName("http://services.salah.dev/", "removeUserResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: dev.salah.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreateBook }
     * 
     */
    public CreateBook createCreateBook() {
        return new CreateBook();
    }

    /**
     * Create an instance of {@link CreateBookResponse }
     * 
     */
    public CreateBookResponse createCreateBookResponse() {
        return new CreateBookResponse();
    }

    /**
     * Create an instance of {@link CreateCart }
     * 
     */
    public CreateCart createCreateCart() {
        return new CreateCart();
    }

    /**
     * Create an instance of {@link CreateCartResponse }
     * 
     */
    public CreateCartResponse createCreateCartResponse() {
        return new CreateCartResponse();
    }

    /**
     * Create an instance of {@link CreateCategory }
     * 
     */
    public CreateCategory createCreateCategory() {
        return new CreateCategory();
    }

    /**
     * Create an instance of {@link CreateCategoryResponse }
     * 
     */
    public CreateCategoryResponse createCreateCategoryResponse() {
        return new CreateCategoryResponse();
    }

    /**
     * Create an instance of {@link CreateUser }
     * 
     */
    public CreateUser createCreateUser() {
        return new CreateUser();
    }

    /**
     * Create an instance of {@link CreateUserResponse }
     * 
     */
    public CreateUserResponse createCreateUserResponse() {
        return new CreateUserResponse();
    }

    /**
     * Create an instance of {@link EditBook }
     * 
     */
    public EditBook createEditBook() {
        return new EditBook();
    }

    /**
     * Create an instance of {@link EditBookResponse }
     * 
     */
    public EditBookResponse createEditBookResponse() {
        return new EditBookResponse();
    }

    /**
     * Create an instance of {@link EditCart }
     * 
     */
    public EditCart createEditCart() {
        return new EditCart();
    }

    /**
     * Create an instance of {@link EditCartResponse }
     * 
     */
    public EditCartResponse createEditCartResponse() {
        return new EditCartResponse();
    }

    /**
     * Create an instance of {@link EditCategory }
     * 
     */
    public EditCategory createEditCategory() {
        return new EditCategory();
    }

    /**
     * Create an instance of {@link EditCategoryResponse }
     * 
     */
    public EditCategoryResponse createEditCategoryResponse() {
        return new EditCategoryResponse();
    }

    /**
     * Create an instance of {@link EditUser }
     * 
     */
    public EditUser createEditUser() {
        return new EditUser();
    }

    /**
     * Create an instance of {@link EditUserResponse }
     * 
     */
    public EditUserResponse createEditUserResponse() {
        return new EditUserResponse();
    }

    /**
     * Create an instance of {@link FindAllBooks }
     * 
     */
    public FindAllBooks createFindAllBooks() {
        return new FindAllBooks();
    }

    /**
     * Create an instance of {@link FindAllBooksResponse }
     * 
     */
    public FindAllBooksResponse createFindAllBooksResponse() {
        return new FindAllBooksResponse();
    }

    /**
     * Create an instance of {@link FindAllCarts }
     * 
     */
    public FindAllCarts createFindAllCarts() {
        return new FindAllCarts();
    }

    /**
     * Create an instance of {@link FindAllCartsResponse }
     * 
     */
    public FindAllCartsResponse createFindAllCartsResponse() {
        return new FindAllCartsResponse();
    }

    /**
     * Create an instance of {@link FindAllCategories }
     * 
     */
    public FindAllCategories createFindAllCategories() {
        return new FindAllCategories();
    }

    /**
     * Create an instance of {@link FindAllCategoriesResponse }
     * 
     */
    public FindAllCategoriesResponse createFindAllCategoriesResponse() {
        return new FindAllCategoriesResponse();
    }

    /**
     * Create an instance of {@link FindAllUsers }
     * 
     */
    public FindAllUsers createFindAllUsers() {
        return new FindAllUsers();
    }

    /**
     * Create an instance of {@link FindAllUsersResponse }
     * 
     */
    public FindAllUsersResponse createFindAllUsersResponse() {
        return new FindAllUsersResponse();
    }

    /**
     * Create an instance of {@link FindBook }
     * 
     */
    public FindBook createFindBook() {
        return new FindBook();
    }

    /**
     * Create an instance of {@link FindBookResponse }
     * 
     */
    public FindBookResponse createFindBookResponse() {
        return new FindBookResponse();
    }

    /**
     * Create an instance of {@link FindByCart }
     * 
     */
    public FindByCart createFindByCart() {
        return new FindByCart();
    }

    /**
     * Create an instance of {@link FindByCartResponse }
     * 
     */
    public FindByCartResponse createFindByCartResponse() {
        return new FindByCartResponse();
    }

    /**
     * Create an instance of {@link FindByCategoryID }
     * 
     */
    public FindByCategoryID createFindByCategoryID() {
        return new FindByCategoryID();
    }

    /**
     * Create an instance of {@link FindByCategoryIDResponse }
     * 
     */
    public FindByCategoryIDResponse createFindByCategoryIDResponse() {
        return new FindByCategoryIDResponse();
    }

    /**
     * Create an instance of {@link FindByEmail }
     * 
     */
    public FindByEmail createFindByEmail() {
        return new FindByEmail();
    }

    /**
     * Create an instance of {@link FindByEmailResponse }
     * 
     */
    public FindByEmailResponse createFindByEmailResponse() {
        return new FindByEmailResponse();
    }

    /**
     * Create an instance of {@link FindByUserId }
     * 
     */
    public FindByUserId createFindByUserId() {
        return new FindByUserId();
    }

    /**
     * Create an instance of {@link FindByUserIdResponse }
     * 
     */
    public FindByUserIdResponse createFindByUserIdResponse() {
        return new FindByUserIdResponse();
    }

    /**
     * Create an instance of {@link FindCart }
     * 
     */
    public FindCart createFindCart() {
        return new FindCart();
    }

    /**
     * Create an instance of {@link FindCartResponse }
     * 
     */
    public FindCartResponse createFindCartResponse() {
        return new FindCartResponse();
    }

    /**
     * Create an instance of {@link FindCategory }
     * 
     */
    public FindCategory createFindCategory() {
        return new FindCategory();
    }

    /**
     * Create an instance of {@link FindCategoryResponse }
     * 
     */
    public FindCategoryResponse createFindCategoryResponse() {
        return new FindCategoryResponse();
    }

    /**
     * Create an instance of {@link FindUser }
     * 
     */
    public FindUser createFindUser() {
        return new FindUser();
    }

    /**
     * Create an instance of {@link FindUserResponse }
     * 
     */
    public FindUserResponse createFindUserResponse() {
        return new FindUserResponse();
    }

    /**
     * Create an instance of {@link RemoveBook }
     * 
     */
    public RemoveBook createRemoveBook() {
        return new RemoveBook();
    }

    /**
     * Create an instance of {@link RemoveBookResponse }
     * 
     */
    public RemoveBookResponse createRemoveBookResponse() {
        return new RemoveBookResponse();
    }

    /**
     * Create an instance of {@link RemoveByCart }
     * 
     */
    public RemoveByCart createRemoveByCart() {
        return new RemoveByCart();
    }

    /**
     * Create an instance of {@link RemoveByCartResponse }
     * 
     */
    public RemoveByCartResponse createRemoveByCartResponse() {
        return new RemoveByCartResponse();
    }

    /**
     * Create an instance of {@link RemoveByUserID }
     * 
     */
    public RemoveByUserID createRemoveByUserID() {
        return new RemoveByUserID();
    }

    /**
     * Create an instance of {@link RemoveByUserIDResponse }
     * 
     */
    public RemoveByUserIDResponse createRemoveByUserIDResponse() {
        return new RemoveByUserIDResponse();
    }

    /**
     * Create an instance of {@link RemoveCart }
     * 
     */
    public RemoveCart createRemoveCart() {
        return new RemoveCart();
    }

    /**
     * Create an instance of {@link RemoveCartResponse }
     * 
     */
    public RemoveCartResponse createRemoveCartResponse() {
        return new RemoveCartResponse();
    }

    /**
     * Create an instance of {@link RemoveCategory }
     * 
     */
    public RemoveCategory createRemoveCategory() {
        return new RemoveCategory();
    }

    /**
     * Create an instance of {@link RemoveCategoryResponse }
     * 
     */
    public RemoveCategoryResponse createRemoveCategoryResponse() {
        return new RemoveCategoryResponse();
    }

    /**
     * Create an instance of {@link RemoveUser }
     * 
     */
    public RemoveUser createRemoveUser() {
        return new RemoveUser();
    }

    /**
     * Create an instance of {@link RemoveUserResponse }
     * 
     */
    public RemoveUserResponse createRemoveUserResponse() {
        return new RemoveUserResponse();
    }

    /**
     * Create an instance of {@link Category }
     * 
     */
    public Category createCategory() {
        return new Category();
    }

    /**
     * Create an instance of {@link Cart }
     * 
     */
    public Cart createCart() {
        return new Cart();
    }

    /**
     * Create an instance of {@link Book }
     * 
     */
    public Book createBook() {
        return new Book();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateBook }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateBook }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.salah.dev/", name = "createBook")
    public JAXBElement<CreateBook> createCreateBook(CreateBook value) {
        return new JAXBElement<CreateBook>(_CreateBook_QNAME, CreateBook.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateBookResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateBookResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.salah.dev/", name = "createBookResponse")
    public JAXBElement<CreateBookResponse> createCreateBookResponse(CreateBookResponse value) {
        return new JAXBElement<CreateBookResponse>(_CreateBookResponse_QNAME, CreateBookResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCart }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateCart }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.salah.dev/", name = "createCart")
    public JAXBElement<CreateCart> createCreateCart(CreateCart value) {
        return new JAXBElement<CreateCart>(_CreateCart_QNAME, CreateCart.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCartResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateCartResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.salah.dev/", name = "createCartResponse")
    public JAXBElement<CreateCartResponse> createCreateCartResponse(CreateCartResponse value) {
        return new JAXBElement<CreateCartResponse>(_CreateCartResponse_QNAME, CreateCartResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCategory }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateCategory }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.salah.dev/", name = "createCategory")
    public JAXBElement<CreateCategory> createCreateCategory(CreateCategory value) {
        return new JAXBElement<CreateCategory>(_CreateCategory_QNAME, CreateCategory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCategoryResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateCategoryResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.salah.dev/", name = "createCategoryResponse")
    public JAXBElement<CreateCategoryResponse> createCreateCategoryResponse(CreateCategoryResponse value) {
        return new JAXBElement<CreateCategoryResponse>(_CreateCategoryResponse_QNAME, CreateCategoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateUser }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateUser }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.salah.dev/", name = "createUser")
    public JAXBElement<CreateUser> createCreateUser(CreateUser value) {
        return new JAXBElement<CreateUser>(_CreateUser_QNAME, CreateUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateUserResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateUserResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.salah.dev/", name = "createUserResponse")
    public JAXBElement<CreateUserResponse> createCreateUserResponse(CreateUserResponse value) {
        return new JAXBElement<CreateUserResponse>(_CreateUserResponse_QNAME, CreateUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditBook }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EditBook }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.salah.dev/", name = "editBook")
    public JAXBElement<EditBook> createEditBook(EditBook value) {
        return new JAXBElement<EditBook>(_EditBook_QNAME, EditBook.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditBookResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EditBookResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.salah.dev/", name = "editBookResponse")
    public JAXBElement<EditBookResponse> createEditBookResponse(EditBookResponse value) {
        return new JAXBElement<EditBookResponse>(_EditBookResponse_QNAME, EditBookResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditCart }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EditCart }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.salah.dev/", name = "editCart")
    public JAXBElement<EditCart> createEditCart(EditCart value) {
        return new JAXBElement<EditCart>(_EditCart_QNAME, EditCart.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditCartResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EditCartResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.salah.dev/", name = "editCartResponse")
    public JAXBElement<EditCartResponse> createEditCartResponse(EditCartResponse value) {
        return new JAXBElement<EditCartResponse>(_EditCartResponse_QNAME, EditCartResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditCategory }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EditCategory }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.salah.dev/", name = "editCategory")
    public JAXBElement<EditCategory> createEditCategory(EditCategory value) {
        return new JAXBElement<EditCategory>(_EditCategory_QNAME, EditCategory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditCategoryResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EditCategoryResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.salah.dev/", name = "editCategoryResponse")
    public JAXBElement<EditCategoryResponse> createEditCategoryResponse(EditCategoryResponse value) {
        return new JAXBElement<EditCategoryResponse>(_EditCategoryResponse_QNAME, EditCategoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditUser }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EditUser }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.salah.dev/", name = "editUser")
    public JAXBElement<EditUser> createEditUser(EditUser value) {
        return new JAXBElement<EditUser>(_EditUser_QNAME, EditUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditUserResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EditUserResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.salah.dev/", name = "editUserResponse")
    public JAXBElement<EditUserResponse> createEditUserResponse(EditUserResponse value) {
        return new JAXBElement<EditUserResponse>(_EditUserResponse_QNAME, EditUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllBooks }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindAllBooks }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.salah.dev/", name = "findAllBooks")
    public JAXBElement<FindAllBooks> createFindAllBooks(FindAllBooks value) {
        return new JAXBElement<FindAllBooks>(_FindAllBooks_QNAME, FindAllBooks.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllBooksResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindAllBooksResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.salah.dev/", name = "findAllBooksResponse")
    public JAXBElement<FindAllBooksResponse> createFindAllBooksResponse(FindAllBooksResponse value) {
        return new JAXBElement<FindAllBooksResponse>(_FindAllBooksResponse_QNAME, FindAllBooksResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllCarts }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindAllCarts }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.salah.dev/", name = "findAllCarts")
    public JAXBElement<FindAllCarts> createFindAllCarts(FindAllCarts value) {
        return new JAXBElement<FindAllCarts>(_FindAllCarts_QNAME, FindAllCarts.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllCartsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindAllCartsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.salah.dev/", name = "findAllCartsResponse")
    public JAXBElement<FindAllCartsResponse> createFindAllCartsResponse(FindAllCartsResponse value) {
        return new JAXBElement<FindAllCartsResponse>(_FindAllCartsResponse_QNAME, FindAllCartsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllCategories }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindAllCategories }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.salah.dev/", name = "findAllCategories")
    public JAXBElement<FindAllCategories> createFindAllCategories(FindAllCategories value) {
        return new JAXBElement<FindAllCategories>(_FindAllCategories_QNAME, FindAllCategories.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllCategoriesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindAllCategoriesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.salah.dev/", name = "findAllCategoriesResponse")
    public JAXBElement<FindAllCategoriesResponse> createFindAllCategoriesResponse(FindAllCategoriesResponse value) {
        return new JAXBElement<FindAllCategoriesResponse>(_FindAllCategoriesResponse_QNAME, FindAllCategoriesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllUsers }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindAllUsers }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.salah.dev/", name = "findAllUsers")
    public JAXBElement<FindAllUsers> createFindAllUsers(FindAllUsers value) {
        return new JAXBElement<FindAllUsers>(_FindAllUsers_QNAME, FindAllUsers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllUsersResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindAllUsersResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.salah.dev/", name = "findAllUsersResponse")
    public JAXBElement<FindAllUsersResponse> createFindAllUsersResponse(FindAllUsersResponse value) {
        return new JAXBElement<FindAllUsersResponse>(_FindAllUsersResponse_QNAME, FindAllUsersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindBook }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindBook }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.salah.dev/", name = "findBook")
    public JAXBElement<FindBook> createFindBook(FindBook value) {
        return new JAXBElement<FindBook>(_FindBook_QNAME, FindBook.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindBookResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindBookResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.salah.dev/", name = "findBookResponse")
    public JAXBElement<FindBookResponse> createFindBookResponse(FindBookResponse value) {
        return new JAXBElement<FindBookResponse>(_FindBookResponse_QNAME, FindBookResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByCart }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindByCart }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.salah.dev/", name = "findByCart")
    public JAXBElement<FindByCart> createFindByCart(FindByCart value) {
        return new JAXBElement<FindByCart>(_FindByCart_QNAME, FindByCart.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByCartResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindByCartResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.salah.dev/", name = "findByCartResponse")
    public JAXBElement<FindByCartResponse> createFindByCartResponse(FindByCartResponse value) {
        return new JAXBElement<FindByCartResponse>(_FindByCartResponse_QNAME, FindByCartResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByCategoryID }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindByCategoryID }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.salah.dev/", name = "findByCategoryID")
    public JAXBElement<FindByCategoryID> createFindByCategoryID(FindByCategoryID value) {
        return new JAXBElement<FindByCategoryID>(_FindByCategoryID_QNAME, FindByCategoryID.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByCategoryIDResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindByCategoryIDResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.salah.dev/", name = "findByCategoryIDResponse")
    public JAXBElement<FindByCategoryIDResponse> createFindByCategoryIDResponse(FindByCategoryIDResponse value) {
        return new JAXBElement<FindByCategoryIDResponse>(_FindByCategoryIDResponse_QNAME, FindByCategoryIDResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByEmail }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindByEmail }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.salah.dev/", name = "findByEmail")
    public JAXBElement<FindByEmail> createFindByEmail(FindByEmail value) {
        return new JAXBElement<FindByEmail>(_FindByEmail_QNAME, FindByEmail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByEmailResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindByEmailResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.salah.dev/", name = "findByEmailResponse")
    public JAXBElement<FindByEmailResponse> createFindByEmailResponse(FindByEmailResponse value) {
        return new JAXBElement<FindByEmailResponse>(_FindByEmailResponse_QNAME, FindByEmailResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByUserId }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindByUserId }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.salah.dev/", name = "findByUserId")
    public JAXBElement<FindByUserId> createFindByUserId(FindByUserId value) {
        return new JAXBElement<FindByUserId>(_FindByUserId_QNAME, FindByUserId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByUserIdResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindByUserIdResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.salah.dev/", name = "findByUserIdResponse")
    public JAXBElement<FindByUserIdResponse> createFindByUserIdResponse(FindByUserIdResponse value) {
        return new JAXBElement<FindByUserIdResponse>(_FindByUserIdResponse_QNAME, FindByUserIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCart }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindCart }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.salah.dev/", name = "findCart")
    public JAXBElement<FindCart> createFindCart(FindCart value) {
        return new JAXBElement<FindCart>(_FindCart_QNAME, FindCart.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCartResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindCartResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.salah.dev/", name = "findCartResponse")
    public JAXBElement<FindCartResponse> createFindCartResponse(FindCartResponse value) {
        return new JAXBElement<FindCartResponse>(_FindCartResponse_QNAME, FindCartResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCategory }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindCategory }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.salah.dev/", name = "findCategory")
    public JAXBElement<FindCategory> createFindCategory(FindCategory value) {
        return new JAXBElement<FindCategory>(_FindCategory_QNAME, FindCategory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCategoryResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindCategoryResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.salah.dev/", name = "findCategoryResponse")
    public JAXBElement<FindCategoryResponse> createFindCategoryResponse(FindCategoryResponse value) {
        return new JAXBElement<FindCategoryResponse>(_FindCategoryResponse_QNAME, FindCategoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindUser }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindUser }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.salah.dev/", name = "findUser")
    public JAXBElement<FindUser> createFindUser(FindUser value) {
        return new JAXBElement<FindUser>(_FindUser_QNAME, FindUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindUserResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindUserResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.salah.dev/", name = "findUserResponse")
    public JAXBElement<FindUserResponse> createFindUserResponse(FindUserResponse value) {
        return new JAXBElement<FindUserResponse>(_FindUserResponse_QNAME, FindUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveBook }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemoveBook }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.salah.dev/", name = "removeBook")
    public JAXBElement<RemoveBook> createRemoveBook(RemoveBook value) {
        return new JAXBElement<RemoveBook>(_RemoveBook_QNAME, RemoveBook.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveBookResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemoveBookResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.salah.dev/", name = "removeBookResponse")
    public JAXBElement<RemoveBookResponse> createRemoveBookResponse(RemoveBookResponse value) {
        return new JAXBElement<RemoveBookResponse>(_RemoveBookResponse_QNAME, RemoveBookResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveByCart }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemoveByCart }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.salah.dev/", name = "removeByCart")
    public JAXBElement<RemoveByCart> createRemoveByCart(RemoveByCart value) {
        return new JAXBElement<RemoveByCart>(_RemoveByCart_QNAME, RemoveByCart.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveByCartResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemoveByCartResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.salah.dev/", name = "removeByCartResponse")
    public JAXBElement<RemoveByCartResponse> createRemoveByCartResponse(RemoveByCartResponse value) {
        return new JAXBElement<RemoveByCartResponse>(_RemoveByCartResponse_QNAME, RemoveByCartResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveByUserID }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemoveByUserID }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.salah.dev/", name = "removeByUserID")
    public JAXBElement<RemoveByUserID> createRemoveByUserID(RemoveByUserID value) {
        return new JAXBElement<RemoveByUserID>(_RemoveByUserID_QNAME, RemoveByUserID.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveByUserIDResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemoveByUserIDResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.salah.dev/", name = "removeByUserIDResponse")
    public JAXBElement<RemoveByUserIDResponse> createRemoveByUserIDResponse(RemoveByUserIDResponse value) {
        return new JAXBElement<RemoveByUserIDResponse>(_RemoveByUserIDResponse_QNAME, RemoveByUserIDResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveCart }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemoveCart }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.salah.dev/", name = "removeCart")
    public JAXBElement<RemoveCart> createRemoveCart(RemoveCart value) {
        return new JAXBElement<RemoveCart>(_RemoveCart_QNAME, RemoveCart.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveCartResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemoveCartResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.salah.dev/", name = "removeCartResponse")
    public JAXBElement<RemoveCartResponse> createRemoveCartResponse(RemoveCartResponse value) {
        return new JAXBElement<RemoveCartResponse>(_RemoveCartResponse_QNAME, RemoveCartResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveCategory }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemoveCategory }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.salah.dev/", name = "removeCategory")
    public JAXBElement<RemoveCategory> createRemoveCategory(RemoveCategory value) {
        return new JAXBElement<RemoveCategory>(_RemoveCategory_QNAME, RemoveCategory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveCategoryResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemoveCategoryResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.salah.dev/", name = "removeCategoryResponse")
    public JAXBElement<RemoveCategoryResponse> createRemoveCategoryResponse(RemoveCategoryResponse value) {
        return new JAXBElement<RemoveCategoryResponse>(_RemoveCategoryResponse_QNAME, RemoveCategoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveUser }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemoveUser }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.salah.dev/", name = "removeUser")
    public JAXBElement<RemoveUser> createRemoveUser(RemoveUser value) {
        return new JAXBElement<RemoveUser>(_RemoveUser_QNAME, RemoveUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveUserResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemoveUserResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.salah.dev/", name = "removeUserResponse")
    public JAXBElement<RemoveUserResponse> createRemoveUserResponse(RemoveUserResponse value) {
        return new JAXBElement<RemoveUserResponse>(_RemoveUserResponse_QNAME, RemoveUserResponse.class, null, value);
    }

}

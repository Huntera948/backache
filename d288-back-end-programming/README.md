## D288 Back End Programming

Students run the CI Pipeline to create your D288 Back End Programming project for completing the PA

A.   Create a new Java project using Spring Initializr, with each of the following dependencies:

•    Spring Data JPA (spring-boot starter-data-jpa)
•    Rest Repositories (spring-boot-starter-data-rest)
•    MySQL Driver (mysql-connector-java)
•    Lombok

Note: Since the application properties will be empty, you will need to copy over the supplied application properties.

B.   Create your subgroup and project by logging into GitLab using the web link provided and do the following:
•    connect your new Java project
•    commit with a message and push when you complete each of the tasks listed below (parts B to F, etc.)

Note: Any submissions that do not have a commit after each task will not be evaluated.
Note: You may commit and push whenever you want to back up your changes, even if a task is not complete.

•    Submit a copy of the git repository URL and a copy of the repository branch history retrieved from your repository, which must include the commit messages and dates.

Note: Wait until you have completed all the following prompts before you create your copy of the repository branch history.

C.   Construct four new packages, one for each of the following: controllers, entities, dao, and services. The packages will need to be used for a checkout form and vacations packages list.

    1. Added RestDataConfig file within config directory.
    2. Updated application.properties file.
    3. Added controller, dao, entities and services packages.
    4. Added config package with RestDataConfig file. Corrected entity import.

Note: The packages should be on the same level of the hierarchy.
Note: Construct a package named config and copy the RestDataConfig.java provided in the laboratory environment to the package. Modify it so that the package and imports have the correct package and import addresses. Copy the application.properties file that is provided in the laboratory environment into your application properties resource file.

D.   Write code for the entities package that includes entity classes and the enum designed to match the UML diagram.

    1. Added Cart Class: Included a class named Cart with @Getter and @Setter annotations. Added fields: ID, order tracking number, package price, party size, status, creation and update timestamps & CartItems.
    2. Added CartItem Class: Included a class named CartItem with @Getter and @Setter annotations. Added fields: ID, references to Vacation and Cart, Excursions, & creation and update timestamps.
    3. Added Country Class: Included a class named Country with @Getter and @Setter annotations. Added fields: ID, country name & creation and update timestamps.
    4. Added Customer Class: Included a class named Customer with @Getter and @Setter annotations. Added fields: ID, first and last name, address, postal code, phone number, creation and update timestamps, reference to Division & Carts.
    5. Added Division Class: Included a class named Division with @Getter and @Setter annotations. Added fields:  ID, division name, creation and update timestamps, reference to Country & Customers.
    6. Added Excursion Class: Included a class named Excursion with @Getter and @Setter annotations. Added fields: ID, excursion title, price, image URL, creation and update timestamps, reference to Vacation & CartItems.
    7. Added Vacation Class: Included a class named Vacation with @Getter and @Setter annotations. Added fields: ID, vacation title, description, travel fare price, image URL, creation and update timestamps & Excursions.

E.   Write code for the dao package that includes repository interfaces for the entities that extend JpaRepository, and add cross-origin support.

    1. Added CartItemRepository.java interface to dao package with @CrossOrigin annotation.
    2. CartRepository.java interface to dao package with @CrossOrigin annotation.
    3. CountryRepository.java interface to dao package with @CrossOrigin annotation.
    4. CustomerRepository.java interface to dao package with @CrossOrigin annotation.
    5. DivisionRepository.java interface to dao package with @CrossOrigin annotation.
    6. ExcursionRepository.java interface to dao package with @CrossOrigin annotation.
    7. VacationRepository.java interface to dao package with @CrossOrigin annotation.

F.   Write code for the services package that includes each of the following:

•    a purchase data class with a customer cart and a set of cart items
•    a purchase response data class that contains an order tracking number
•    a checkout service interface
•    a checkout service implementation class

    1. Purchase.java: Added Purchase class in newly created dto package. It has Customer, Cart and CartItem fields.
    2. PurchaseResponse.java: Added PurchaseResponse class to store order tracking number.
    3. CheckoutService.java: Added CheckoutService interface with CrossOrigin annotation. 
    4. CheckoutServiceImpl.java: Added CheckoutService implementation. It generates a tracking numbers, populates the cart with items, sets the customer and cart status, and saves the information to the database.
    5. Cart.java, lines 11, 59-67: Added addCartItem method to Cart entity.
    6. Customer.java, lines 9, 55-63: Added addCart method to Customer entity.

G.   Write code to include validation to enforce the inputs needed by the Angular front-end.

    1. Moved items from dto package into service package. deleted dto package. got confused while watching Udemy video.
    2. Customer.java, lines : Added nullable = false to fields firstName, lastName, address, postal_code, phone, and division_id.

H.   Write code for the controllers package that includes a REST controller checkout controller class with a post mapping to place orders.

Note: You do not need to duplicate REST functionality for each repository by creating methods in Java.

    1. CheckoutController.java: Added rest controller with post mapping to place orders.

I.   Add five sample customers to the application programmatically.

    1. BootStrapData.java: Added BootStrap file to populate database. Injects CustomerRepository, DivisionRepository & CountryRepository. Creates Country and division entities, then 5 customer entities. Added logic to check if customer data already exists.
    2. Division.java: Added AddCustomer method.
    3. Customer.java: Added Customer constructor.
    4. CheckoutController.java: Updated endpoint URL to get orderTrackingNumber to show.

Note: Make sure the customer information is not overwritten each time you run the application.

J.   Run your integrated application by adding a customer order for a vacation with two excursions using the unmodified Angular front-end. Provide screenshots for the following:

•    that your application does not generate a network error when adding the data
•    your database tables using MySQL Workbench to show the data was successfully added

Note: The screenshot should include the front-end view and the inspection console in the browser.
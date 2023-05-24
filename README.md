# Spring Exercise: Guestbook 📕

## Spring & Thymeleaf basics
1. Create a new Spring Application by using the [Spring Initializer](https://start.spring.io/) within IntelliJ. Select 
   the following dependencies:
   * Web
   * Thymeleaf
   * Lombok
   * Devtools
   * H2Database
   * PostgreSQL
   * JPA
   * Validation

2. Create three packages within your source folder to sort the upcoming files into them:
   * `controllers`
   * `model`
   * `services`

3. Create a `GuestbookEntry` class with the following attributes:
    * name
    * message
    * id
   Provide getters / setters / constructors when necessary.
   💡 Have you ever thought about all this boilerplate code for getters & setter? Have a look at [Lombok](https://projectlombok.org/features/) now! 💃 

4. Create a `GuestbookService` which contains an ArrayList of `GuestbookEntry` objects. Provide convenience methods to:
   * create an entry (and save it to the ArrayList)
   * get the whole list of entries (= the guestbook) from the service
   Write at least one basic JUnit test to check the function of those two methods!
   
5. Create a `GuestbookController` class with the following mappings:
   * **GetMapping "/":** This is the root URI of your application which shall display a complete list of (existing) guestbook
     entries
   * **PostMapping "/createentry":** This URI shall be used to receive two params (name, message) which can be written to the guestbook. Don't forget to redirect to "/"! 
   ⏲ Take some time to create some dumb (= as basic as possible) thymeleaf-template to test your mappings - you'll need a form for the POST mapping. Make sure everything is working before heading on... 🏃‍♀️

6. Take a break and enjoy the working result! 🏝
---
## Spring Data
Okay... now let's do something with databases 📯

7. Create a database called "guestbook" within your SQL-Admin console. Make sure there is a user with the appropriate privileges to access the database.
8. Connect the database to the internal widget of IntelliJ (=> you won't need the admin software again)
9. Wire the db-connection into your Spring application by editing the `application.properties` file:

    ````properties
    spring.datasource.url=jdbc:postgresql://localhost:5432/guestbook?createDatabaseIfNotExist=true
    spring.datasource.username=guestbook_user
    spring.datasource.password=password
    spring.datasource.driver-class-name=org.postgresql.Driver
    spring.jpa.hibernate.ddl-auto=update    
    ````
   **❗ Make sure to understand the meaning of each of these lines ❗**

10. Create a `GuestbookEntryRepository` with at least one `findAll()` method. Add all annotations and generic type parameters which are needed to get your `GuestbookEntry` objects into the databas 
11. Replace the `ArrayList` in your `GuestbookService` with an instance of the GuestbookEntryRepository from above (**Hint**: Don't forget about Dependency Injection)
12. Run the JUnit tests again! ✅ Check the results in your frontend afterwards ✅
13. Heads up & Trainer time: Let's switch the PostgreSQL database to a H2 database! 

---
## Spring Data - Relations 💍
14. Add a `Comment` class to your application. For each single `GuestbookEntry` there can be multiple comments.
15. Create some comments manually within your database by using SQL (either within IntelliJ or in the admin console of the database).
16. Adjust your Thymeleaf template to show the comments for each entry in a basic way. 
17. Run the JUnit tests again! ✅


---
## Optional tasks
1. Find a way to enter comments for individual entries via Thymeleaf.
2. Beautify you Thymeleaf-template by using Bulma / Bootstrap.

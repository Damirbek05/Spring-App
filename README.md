# Spring CRUD RestAPI project
Description:
This project is a Spring application that allows users to register, authenticate, and manage news articles. It provides functionalities such as user registration, authentication, news creation, and fetching all news articles. The data is persisted in a PostgreSQL database, and the application exposes REST APIs for interaction.

# Demo: https://test-task-esgq.onrender.com/ 

## Features:
* User registration and authentication.
* Creation of news articles with titles and content.
* Retrieval of all news articles.
* Exception handling for scenarios like UsernameNotFoundException, IncorrectPasswordException, and UsernameAlreadyExistExceptions.

## Usage:
Register a new user using the provided REST API endpoint.
Authenticate the user to obtain access to news creation and retrieval functionalities.
Create news articles using the appropriate endpoint.
Fetch all news articles using the provided endpoint.

## Dependencies:
* Spring Boot Starter Data JPA: For data access and persistence.
* Spring Boot Starter Web: For building web applications.
* Spring Security Crypto: For cryptographic functionalities.
* PostgreSQL: Database driver for PostgreSQL.
* Lombok: For reducing boilerplate code.
* Spring Boot Starter Test: For testing the application.
### Contributing:
Contributions are welcome! Please fork the repository, make your changes, and submit a pull request.

## How it works:
### Use /swagger/ to open swagger-ui.html
![Uploading image.png…]()







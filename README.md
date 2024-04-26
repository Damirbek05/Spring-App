# Test Task
Description:
This project is a Spring application that allows users to register, authenticate, and manage news articles. It provides functionalities such as user registration, authentication, news creation, and fetching all news articles. The data is persisted in a PostgreSQL database, and the application exposes REST APIs for interaction.

## Features:
* User registration and authentication.
* Creation of news articles with titles and content.
* Retrieval of all news articles.
* Exception handling for scenarios like UsernameNotFoundException, IncorrectPasswordException, and UsernameAlreadyExistExceptions.

## Installation:
Clone the repository.
Ensure you have Java 17 installed.
Set up a PostgreSQL database and update the application properties accordingly.
Build the project using Maven: mvn clean install.
Run the application: java -jar target/test-task-0.0.1-SNAPSHOT.jar.

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
### Register
![image](https://github.com/Damirbek05/test-task/assets/124022133/cbea6ab8-904e-4731-a56d-485cad5b1d55)
![image](https://github.com/Damirbek05/test-task/assets/124022133/96bc020f-ba34-45c8-8ab0-0a168a1818eb)
### Login
![image](https://github.com/Damirbek05/test-task/assets/124022133/3c0f1d10-3bc4-4bee-8009-074eb62ce6f2)
### Request
![image](https://github.com/Damirbek05/test-task/assets/124022133/dd1291a5-4df4-4295-86d1-137c08279a6f)
![image](https://github.com/Damirbek05/test-task/assets/124022133/b701d5b5-b917-4195-ba1e-ff1bcba69aeb)
### Delete request
![image](https://github.com/Damirbek05/test-task/assets/124022133/1d519f82-6f21-49bb-bb9b-6196d7f2c866)
![image](https://github.com/Damirbek05/test-task/assets/124022133/5a309861-8125-4d72-b4b5-f4d66a7a8788)
### News
![image](https://github.com/Damirbek05/test-task/assets/124022133/2ef67a3a-0bd4-4c03-b941-ad3f9cfd89da)
![image](https://github.com/Damirbek05/test-task/assets/124022133/bcac27af-9c85-4abb-be95-4b84df46b47e)
### Get news
![image](https://github.com/Damirbek05/test-task/assets/124022133/657b18c3-ec84-4932-a5cf-cbd18b974e99)







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
## You can use Insomnia or Postman etc. for testing HTTP requests and API management
### Register
Endpoints:
https://test-task-esgq.onrender.com/api/users/register
![image](https://github.com/Damirbek05/test-task/assets/124022133/6b91519b-afb5-48e2-b260-48893bae0728)
![image](https://github.com/Damirbek05/test-task/assets/124022133/b0e619aa-e229-41b6-87c3-44dec27722ec)
### Login
Endpoint:
https://test-task-esgq.onrender.com/api/users/login
![image](https://github.com/Damirbek05/test-task/assets/124022133/33433b93-35fe-49fa-8155-ce367ba50f9e)
### Request
Endpoint:
https://test-task-esgq.onrender.com/api/requests
![image](https://github.com/Damirbek05/test-task/assets/124022133/a1e5454d-2c47-4dff-80c6-c01bbc58b364)
![image](https://github.com/Damirbek05/test-task/assets/124022133/a30023f7-6d1e-4c89-bf55-e62c2ef7eb91)
### Delete request
Endpoint:
https://test-task-esgq.onrender.com/api/requests/{id}
![image](https://github.com/Damirbek05/test-task/assets/124022133/53ade4ec-3601-4861-b75b-4d3e5ff01502)
![image](https://github.com/Damirbek05/test-task/assets/124022133/f7e49aa7-9b80-445b-9cc7-ef9d6fb9eccd)
### News
Endpoints:
https://test-task-esgq.onrender.com/api/news
![image](https://github.com/Damirbek05/test-task/assets/124022133/68b145c2-a37d-4516-b6cd-4a69a4d61660)
![image](https://github.com/Damirbek05/test-task/assets/124022133/d6f06bec-8e64-4d8f-96b1-59fd427a5db1)
### Get news
Endpoint:
https://test-task-esgq.onrender.com/api/news
![image](https://github.com/Damirbek05/test-task/assets/124022133/ee72c97c-9026-4549-8cf5-00f9de1a7a67)








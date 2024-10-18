# Responsive User Registration
This is a simple Spring Boot application that allows user registration, login, logout and a welcome page. This application uses Thymeleaf, Spring web, Spring JPA, Spring security, Spring validation and a Spring H2 in-memory database. This application runs on http://localhost:8080

## Login
http://localhost:8080/login The default page that will be displayed. Allows the user to login or click "Register here" to create an account.

## Register
http://localhost:8080/register Simple registration page, takes input for username, email and password. There is only a length requirement for both username and password (min 4 characters). Email must be valid (x@x.com). Both username and email must be unique.

## Welcome
http://localhost:8080/welcome Simply displays "You have successfully logged in", allows user to logout.

## H2 Database
http://localhost:8080/h2-console Once a sample account is registered, the database can be accesssed through this link. The default values should allow a connection to the dashboard.

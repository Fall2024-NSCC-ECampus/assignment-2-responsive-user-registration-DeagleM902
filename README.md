# Responsive User Registration
This is a simple Spring Boot application that allows user registration, login, logout and a welcome page. This application uses Thymeleaf, Spring web, Spring JPA, Spring security, Spring validation and a MySQL database. Bootstrap is used for basic styling and navigation bar. This application runs on http://localhost:8080

## Login
http://localhost:8080/login The default page that will be displayed. Allows the user to login or click "Register here" to create an account.

## Register
http://localhost:8080/register Simple registration page, takes input for username, email and password. There is a simple regex allowing typical alpha-numerical input for username and password. Email must be valid (x@x.com). Both username and email must be unique.

## Welcome
http://localhost:8080/welcome Placeholder page shown only to users who have successfully logged in. Allows user to logout.

## MySQL Database
This project was made with XAMPP control panel in mind, the database must be online for the web app / page to run.
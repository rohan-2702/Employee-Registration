# Employee Registration and Authentication System

A web application for managing employee registration and authentication, with features including registration, login, and a welcome page for successful login attempts. This project is developed using Java, Spring Boot, JSP, Hibernate, and MySQL.

## Project Overview

The Employee Registration and Authentication System allows employees to:
- Register with their details
- Log in using their credentials
- View a personalized welcome page after successful login
- See a list of all registered users (Database Page for admins)

## Features

- **Employee Registration:** A registration page where users can enter personal details, including Name, Date of Birth, Gender, Address, City, State, Login ID, and Password.
- **Login Page:** Users can log in using their registered credentials.
- **Welcome Page:** Displays a greeting message along with the employee's name and ID upon successful login.
- **Database Page:** Lists all registered users; accessible to admins.

## Technologies Used

- **Frontend:** JSP, HTML, CSS
- **Backend:** Java, Spring Boot, Hibernate
- **Database:** MySQL
- **Development Environment:** IntelliJ IDEA

## Installation and Setup

1. **Clone the Repository:**
   ```bash
   git clone https://github.com/rohan-2702/Employee-Registration.git
   ```
2. **Database Setup:**
   
- Create a MySQL database named employee_registration.
- Update the src/main/resources/application.properties file with your MySQL username and password.

3. **Run the Application:**

- Open the project in IntelliJ IDEA.
- Run the application using the command:
  ```bash
  ./mvnw spring-boot:run
  ```
- The application will be accessible at http://localhost:8080/loginForm.

4. **Accessing the Application Pages:**

- **Login Page:** http://localhost:8080/loginForm
- **Registration Page:** http://localhost:8080/registerForm
- **Welcome Page:** Automatically redirects upon successful login.
- **Database Page:** http://localhost:8080/database-page

5. **API Endpoints:**

- **GET /registerForm -** Displays the registration form.
- **POST /register -** Registers a new employee
- **GET /loginForm -** Displays the login form
- **POST /login -** Authenticates an employee
- **GET /welcome -** Displays the welcome page upon successful login
- **GET /database-page -** Lists all registered users
   





   

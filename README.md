**Library Management System** - User Registration and Book Lookup Application
**Overview**
This project implements a Library Management System with features for user registration, sign-in, and book details retrieval based on the selected book type.

**Setup Instructions**
**Step 1: Clone the Repository**
To begin, clone the repository and navigate to the project directory:
git clone <repository_url>
cd <project_directory>

**Step 2: Prerequisites**
Ensure the following prerequisites are installed:

Java Development Kit (JDK) 11 or higher
Integrated Development Environment (IDE) such as Eclipse or IntelliJ IDEA
MySQL Server 9.0
MySQL Workbench (optional, for database management)
Maven (for dependency management)
Tomcat (8/9)

**Step 3: Database Setup**
Create the schema and necessary tables in your MySQL database:

CREATE SCHEMA Library;

CREATE TABLE User (
    id INT PRIMARY KEY,
    name VARCHAR(40),
    emailId VARCHAR(40),
    address VARCHAR(100),
    password VARCHAR(25),
    phoneNumber DOUBLE,
    country VARCHAR(20)
);

CREATE TABLE Book (
    id INT PRIMARY KEY,
    name VARCHAR(40),
    type VARCHAR(30)
);

INSERT INTO Library.Book (id, name, type) VALUES (1, 'Homesick', 'Sisterhood');
INSERT INTO Library.Book (id, name, type) VALUES (2, 'Friends', 'Friends');
INSERT INTO Library.Book (id, name, type) VALUES (3, 'Never Enough', 'Love');
INSERT INTO Library.Book (id, name, type) VALUES (4, 'Donuts', 'Food');
INSERT INTO Library.Book (id, name, type) VALUES (5, '100 Recipe', 'Food');

**Step 4: Update Configuration**
Configure the application.properties file with your database credentials:

spring.datasource.url=jdbc:mysql://localhost:3306/Library
spring.datasource.username=<your_database_username>
spring.datasource.password=<your_database_password>
Step 5: Running the Application
Build and run the application using your preferred IDE. Choose the option to Run as on Server

**Step 6: Usage**
Once the application is running, open your browser and navigate to the following URL to access the application:

http://localhost:8080
http://localhost:8080/Library_SpringMVC/

**Author**
Shravani Mahendrakar
GitHub: [@shravanimahendrakar]

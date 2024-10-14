# Library Management System
 User Registration and Book Lookup Application

## Setup Instructions
 To get started with this project, follow these steps:

1. **Clone the repository**:
 - git clone <repository_url>
 - cd <project_directory>

2. **Prerequisites**:

 - Java Development Kit (JDK) 11 or higher
 - Integrated Development Environment (IDE) such as Eclipse or IntelliJ IDEA
 - MySQL Server 9.0
 - MySQL Workbench (optional, for database management)
 - Maven (for dependency management)
 - Tomcat (8/9)

3. **Database Setup**:

 Create a database schema named Library.
 
 Create the following tables:

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

INSERT INTO `library`.`user` (`id`, `name`, `emailId`, `address`, `password`, `phoneNumber`, `country`) VALUES 
('0', 'admin', 'admin@gmail.com', '123, St E', 'admin', '3837363536', 'Canada');


 INSERT INTO Library.Book (id, name, type) VALUES (1, 'Homesick', 'Sisterhood');
 INSERT INTO Library.Book (id, name, type) VALUES (2, 'Friends', 'Friends');
 INSERT INTO Library.Book (id, name, type) VALUES (3, 'Never Enough', 'Love');
 INSERT INTO Library.Book (id, name, type) VALUES (4, 'Donuts', 'Food');
 INSERT INTO Library.Book (id, name, type) VALUES (5, '100 Recipe', 'Food');

4. **Update Configuration**:
 
 - spring.datasource.url=jdbc:mysql://localhost:3306/Library
 - spring.datasource.username=<your_database_username>
 - spring.datasource.password=<your_database_password>

5. **Running the Application**:

 Build and run the application using your preferred IDE. Choose the option to "Run as Server".
 Once the application is running, open your browser and navigate to the following URLs to access the application:
 - http://localhost:8080
 - http://localhost:8080/Library_SpringMVC/

## Author
 Shravani Mahendrakar
 GitHub: @shravanimahendrakar

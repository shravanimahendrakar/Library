Library
Library Mangement, register and Sign-In Application to get book details based on book type choosen.

Setup Instructions
To get started with this project, follow these steps:

Clone the repository:
git clone <repository_url>
cd <project_directory>

Prerequisites:
Java Development Kit (JDK) 11 or higher
Integrated Development Environment (IDE) such as Eclipse or IntelliJ IDEA
MySQL Server 9.0
MySQL Workbench (optional, for database management)
Maven

Database Setup:
Create schema Library;

create table User(
id INT primary key,
name varchar(40),
emailId varchar(40),
address varchar(100),
password varchar(25),
phoneNumber double,
country varchar(20)
);


create table book(
id INT primary key,
name varchar(40),
type varchar(30)
);

INSERT INTO `library`.`book` (`id`, `name`, `type`) VALUES ('1', 'Homesick', 'Sisterhood');
INSERT INTO `library`.`book` (`id`, `name`, `type`) VALUES ('2', 'Friends', 'Friends');
INSERT INTO `library`.`book` (`id`, `name`, `type`) VALUES ('3', 'Never Enough', 'Love');
INSERT INTO `library`.`book` (`id`, `name`, `type`) VALUES ('4', 'Donuts', 'Food');
INSERT INTO `library`.`book` (`id`, `name`, `type`) VALUES ('5', '100 Recipe', 'Food');
Update application.properties with your database configuration:

spring.datasource.url=jdbc:mysql://localhost:3306/registration spring.datasource.username=<your_database_username> spring.datasource.password=<your_database_password>

Running the Application:
Build and run the application using your IDE. (Run As Spring boot application)
Usage:
Open your browser and http://localhost:8080 to access the application.

Follow the UI to register users and sign in
http://localhost:8080/Library_SpringMVC/

Author
Shravani Mahendrakar (@shravanimahendrakar)



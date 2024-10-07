Library Management System - User Registration and Book Lookup Application
Overview
This project implements a Library Management System with features for user registration, sign-in, and book details retrieval based on the selected book type.

Setup Instructions
Step 1: Clone the Repository
To begin, clone the repository and navigate to the project directory:
git clone <repository_url>
cd <project_directory>

Step 2: Prerequisites
Ensure the following prerequisites are installed:

Java Development Kit (JDK) 11 or higher
Integrated Development Environment (IDE) such as Eclipse or IntelliJ IDEA
MySQL Server 9.0
MySQL Workbench (optional, for database management)
Maven (for dependency management)

Step 3: Database Setup
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



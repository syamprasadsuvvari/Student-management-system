# Student Management System

A backend application built using Java, Spring Boot, Spring Data JPA, and MySQL for managing students, departments, courses, faculty, and enrollments.

## Overview

The Student Management System is designed to streamline academic record management by providing REST APIs for handling students, departments, courses, faculty members, and course enrollments.

The project follows a layered architecture using Controller, Service, and Repository layers, with MySQL as the database and JPA/Hibernate for data persistence.

## Features

### Student Management

* Create Student
* Retrieve Student Details
* Update Student Information
* Delete Student Records

### Department Management

* Create Departments
* View Department Details

### Course Management

* Create Courses
* Assign Courses to Departments
* Assign Faculty to Courses

### Enrollment Management

* Enroll Students in Courses
* Track Enrollment Records

### Faculty Management

* Manage Faculty Information
* Associate Faculty with Departments

## Tech Stack

### Backend

* Java
* Spring Boot
* Spring Data JPA
* Hibernate

### Database

* MySQL

### Tools

* Maven
* Lombok
* Git
* GitHub

## Architecture

The project follows a layered architecture:

```text
Controller Layer
       ↓
Service Layer
       ↓
Repository Layer
       ↓
MySQL Database
```

## Entity Relationships

```text
Department
 ├── Students
 ├── Faculty
 └── Courses

Student
 └── Enrollments

Course
 ├── Faculty
 └── Enrollments
```

## API Modules

### Students

* GET /students
* GET /students/{id}
* POST /students
* PUT /students/{id}
* DELETE /students/{id}

### Departments

* GET /departments
* POST /departments

### Courses

* GET /courses
* POST /courses

### Enrollments

* GET /enrollments
* POST /enrollments

## Learning Outcomes

Through this project, I gained hands-on experience with:

* REST API Development
* Spring Boot Application Development
* Spring Data JPA
* Hibernate Entity Relationships
* MySQL Database Integration
* Layered Architecture Design
* Backend Software Development

## Future Improvements

* Spring Security Integration
* JWT Authentication
* DTO Layer
* Validation and Exception Handling
* Swagger/OpenAPI Documentation
* Unit and Integration Testing

## Author

**Syam Prasad Suvvari**

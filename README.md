
---

# 🎓 Spring Boot Student Sorting REST API

## 📌 Project Overview

This project is a RESTful web application developed using **Spring Boot** and **MySQL** to manage student information.
The main objective of the application is to retrieve and display student details sorted based on **marks** or **CGPA** in **ascending or descending order** through REST APIs.

The application follows standard backend development practices and demonstrates how Spring Boot can be used to build scalable and maintainable REST services.

---

## 🛠️ Technologies Used

* Java
* Spring Boot
* Spring Data JPA
* MySQL
* Maven
* REST API

---

## 🎯 Objectives

* To develop a REST API using Spring Boot
* To integrate MySQL database with the application
* To retrieve student details from the database
* To sort student data based on marks or CGPA
* To support both ascending and descending sorting orders

---

## 📂 Project Architecture

The project follows a **layered architecture**:

* **Controller Layer** – Handles incoming HTTP requests
* **Service Layer** – Contains business logic
* **Repository Layer** – Interacts with the database
* **Model Layer** – Represents student data

This structure improves readability, maintainability, and scalability.

---

## 🗄️ Database Description

The application uses **MySQL** as the backend database to store student details such as:

* Student ID
* Student Name
* Marks
* CGPA

The database is connected using Spring Data JPA, which simplifies database operations and reduces boilerplate code.

---

## 🔗 API Functionality

The REST API provides endpoints to:

* Fetch all student details
* Sort student records by marks
* Sort student records by CGPA
* Choose sorting order (ascending or descending)

The API returns data in **JSON format**, making it easy to integrate with frontend applications or test using tools like Postman.

---

## ▶️ Application Workflow

1. Client sends a request to the REST API
2. The controller receives the request
3. The service layer processes sorting logic
4. The repository fetches sorted data from MySQL
5. The API returns sorted student details in JSON format

---

## ✅ Features

* RESTful API implementation
* MySQL database integration
* Sorting based on marks and CGPA
* Ascending and descending order support
* Clean and modular architecture
* Easy to extend and maintain

---

## 🚀 Future Enhancements

* Add student registration and update functionality
* Implement pagination for large datasets
* Add validation for input data
* Integrate Swagger for API documentation
* Secure APIs using Spring Security

---

## 🧾 Conclusion

This project successfully demonstrates the development of a **Spring Boot REST API integrated with MySQL** to manage and retrieve student information in a sorted manner. By implementing sorting based on marks and CGPA, the application showcases effective use of Spring Data JPA and REST principles. The modular architecture ensures scalability and makes the project easy to enhance with additional features such as CRUD operations, security, and documentation in the future.

---

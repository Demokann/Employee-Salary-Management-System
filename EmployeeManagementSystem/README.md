"# Employee-Salary-Management-System" 

Employee Salary Management System

This is a simple Employee Salary Management System built in Java using JDBC to interact with a MySQL database. The system allows you to manage employee details, including calculating and updating salaries for employees based on their role (Engineer, Finance, etc.) and commission rates. The project demonstrates object-oriented programming (OOP) concepts such as inheritance and polymorphism, with separate classes for different employee types.

Features:

CRUD operations (Create, Read, Update, Delete) for employee records.
Salary calculation based on employee type (Engineer, Finance).
Integration with MySQL to fetch and update employee data.
Object-Oriented principles: Inheritance, Polymorphism, and Encapsulation.
Technologies Used:

Java (JDK 11+)
MySQL (Database for storing employee records)
JDBC (Java Database Connectivity to interact with MySQL)


How to Run:

1. Clone the repository

git clone https://github.com/yourusername/employee-salary-management-system.git

2. Set up a MySQL database and import the employee.sql file to create the required tables.
3. Update the connection details in DatabaseConnection.java (username, password, database name).
4. Run the Main.java class to execute the application.

Project Structure:

/src
    /Employee.java
    /Engineer.java
    /Finance.java
    /Main.java
    /DatabaseConnection.java
    /EmployeeDB.sql


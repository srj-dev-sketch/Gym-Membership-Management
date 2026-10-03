# Gym Membership Management System

A simple Java-based Gym Membership Management System using JDBC and MySQL.

## Features

- Add new gym member
- View all gym members
- Update member details
- Delete gym member
- MySQL database connectivity
- Console-based menu

## Technologies Used

- Java
- MySQL
- JDBC
- VS Code

## CRUD Operations

- Create - Add Member
- Read - View Members
- Update - Update Member
- Delete - Delete Member

## Project Structure

```text
Gym-Membership-Management/
│
├── .vscode/
│   └── settings.json
│
├── lib/
│   └── mysql-connector-j-26.7.0.jar
│
├── src/
│   ├── Main.java
│   ├── DBConnection.java
│   ├── GymMember.java
│   └── GymMemberDAO.java
│
└── README.md

Database

Database name:
gym_management

Table name:
gym_members

How to Run

Install Java and MySQL.
Create the gym_management database.
Create the gym_members table.
Add MySQL Connector/J to the lib folder.
Update the MySQL username and password in DBConnection.java.
Run Main.java.
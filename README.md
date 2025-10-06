
# 🧩 Hibernate Practice Workspace

### 📖 Project Overview

This repository contains multiple practice projects developed using **Hibernate ORM** as part of **Advanced Java** learning.
Each folder demonstrates a specific Hibernate concept such as entity mapping, relationships, and database operations using annotations.

The purpose of this workspace is to **understand Hibernate fundamentals** through small, well-structured examples.

---

### 🗂️ Project Modules

| Folder Name                           | Description                                                                 |
| ------------------------------------- | --------------------------------------------------------------------------- |
| **Day1Hibernate**                     | Basic Hibernate configuration and CRUD operation example.                   |
| **EmployeeManagement**                | Demonstrates employee data management using Hibernate.                      |
| **Hibernate_ManyToMany**              | Implementation of `@ManyToMany` relationship (Employee–Department mapping). |
| **Hibernate_OneToMany_AND_ManyToOne** | Demonstrates `@OneToMany` and `@ManyToOne` relationship mappings.           |
| **Hibernate_onetoone**                | Example of `@OneToOne` mapping (e.g., Student–Address).                     |
| **HotelManagement**                   | Practice project for managing hotel data using Hibernate.                   |
| **LibraryManagement**                 | Demonstrates Hibernate integration in a Library Management System.          |
| **StudentManagement**                 | CRUD-based student management system using Hibernate ORM.                   |

---

### ⚙️ Technologies Used

| Component            | Technology                                      |
| -------------------- | ----------------------------------------------- |
| Programming Language | Java (JDK 17 or above)                          |
| ORM Framework        | Hibernate 6.x                                   |
| Database             | MySQL                                           |
| Configuration        | `hibernate.cfg.xml` (XML-based) and Annotations |
| IDE Used             | Eclipse IDE / IntelliJ IDEA                     |
| Dependencies         | Hibernate Core, MySQL Connector/J               |

---

### 🧠 Concepts Implemented

* Hibernate Configuration Setup
* Session and Transaction Management
* CRUD Operations (Insert, Update, Delete, Retrieve)
* Entity Mappings:

  * `@OneToOne`
  * `@OneToMany`
  * `@ManyToOne`
  * `@ManyToMany`
* Use of Join Tables and Cascading
* HQL (Hibernate Query Language)
* Annotation-based Mapping
* XML and Annotation Comparison

---

### 🧾 Steps to Run the Project

1. **Clone the Repository**

   ```bash
   git clone https://github.com/Shwetannarkhede/Hibernate-Practice-Workspace.git
   ```

2. **Open in IDE**

   * Import the project in **Eclipse** or **IntelliJ IDEA**.
   * Add the required Hibernate and MySQL connector JARs to the classpath.

3. **Database Configuration**

   * Update your `hibernate.cfg.xml` file with correct database credentials:

     ```xml
     <property name="hibernate.connection.url">jdbc:mysql://localhost:3306/your_db</property>
     <property name="hibernate.connection.username">root</property>
     <property name="hibernate.connection.password">your_password</property>
     ```

4. **Run**

   * Run the main file (`Main.java`, `App.java`, or DAO class) of any module.
   * Observe Hibernate logs and check database tables created automatically.

---

### 📊 Sample Output

```
Hibernate: insert into employees ...
Hibernate: insert into departments ...
✅ Data inserted successfully!
```

---

### 📸 Repository Structure

```
Hibernate-Practice-Workspace/
│
├── Day1Hibernate/
├── EmployeeManagement/
├── Hibernate_ManyToMany/
├── Hibernate_OneToMany_AND_ManyToOne/
├── Hibernate_onetoone/
├── HotelManagement/
├── LibraryManagement/
├── StudentManagement/
│
├── .gitignore
└── README.md
```

---

### 👩‍💻 Developed By

**Name:** Shweta Narkhede
**Topic:** Hibernate Practice Workspace
**Technology:** Advance Java – Hibernate ORM
**GitHub Repository:** [https://github.com/Shwetannarkhede/Hibernate-Practice-Workspace](https://github.com/Shwetannarkhede/Hibernate-Practice-Workspace)

---

### 🏁 Output Summary

✔ Hibernate setup and configuration completed
✔ Relationship mappings implemented successfully
✔ Data persisted and retrieved from MySQL database
✔ Demonstrated use of ORM and annotations effectively

---

### 📚 Conclusion

This workspace provides a clear understanding of how **Hibernate ORM** simplifies database handling in Java applications.
Each module is designed to help learners practice and master one concept at a time — from simple CRUD operations to complex entity relationships.


# 📘 Spring Data JPA – Reference Project (PostgreSQL)

This repository serves as a **reference guide** for understanding and using **Spring Data JPA** for:

- Automatic **table creation** using Spring Boot + Hibernate
- Writing and executing **test cases** for inserting and selecting data
- Working with **PostgreSQL** as the database
- Demonstrating entity relationships, mappings, and SQL initialization

It is meant for developers who want a clean, practical example of using Spring Data JPA with a real relational database.

---

## 🚀 Features Covered

### ✔ **1. Table Creation With Spring Data JPA**
- Demonstrates how Hibernate automatically generates database tables from entity classes.
- Uses typical JPA annotations including:
    - `@Entity`
    - `@Id`, `@GeneratedValue`
    - `@OneToOne`, `@OneToMany`, `@ManyToMany`
    - `@CreationTimestamp`

### ✔ **2. SQL Initialization**
- Uses `data.sql` for inserting sample data.
- Tables created automatically via:

```properties
`spring.jpa.hibernate.ddl-auto=update`
`spring.jpa.defer-datasource-initialization=true`
`spring.sql.init.mode=always`
```

### ✔ 3. CRUD Operations

Written and executed test cases for:

- Inserting data
- Selecting data
- Testing entity relationships
- Verifying cascade operations
- Lazy vs Eager loading

---

### ✔ 4. Database

- Backend DB: **PostgreSQL**
- Showcases SQL scripts + JPA mappings that work seamlessly with PostgreSQL types

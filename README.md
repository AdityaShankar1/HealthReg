# 🏥 Healthcare Registry System

A high-performance patient management backend built with **Java 25** and **Spring Boot**, utilizing the latest **Oracle 23ai** database features.

## 🚀 Features
* **Full-Stack Integration**: Vanilla JS frontend talking to a RESTful Spring Boot API.
* **Modern Persistence**: Leverages Hibernate/JPA for automated schema management in Oracle.
* **Database Power**: Hosted on Oracle 23ai via Docker, supporting advanced SQL and AI-ready features.
* **High Performance**: Optimized with HikariCP connection pooling.

## 🛠 Tech Stack
* **Backend**: Java 25, Spring Boot 3.4
* **Database**: Oracle 23ai (Docker)
* **Build Tool**: Gradle 9.2
* **Frontend**: HTML5, CSS3, Vanilla JavaScript (Fetch API)

## 📦 How to Run
1. **Database**: Ensure Oracle 23ai is running on port `1522`.
2. **Backend**: 
   ```bash
   ./gradlew bootRun
   ```
3. **Frontend**: Open `index.html` in any modern browser.

## 📋 API Endpoints
* `GET /api/patients` - Retrieve all records.
* `POST /api/patients/register` - Add a new patient.

---
Created by Aditya Shankar - 2026

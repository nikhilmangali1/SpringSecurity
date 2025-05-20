# JWT-Based Authentication System with Spring Boot

This project demonstrates a secure backend authentication system using Spring Boot and JSON Web Tokens (JWT). It includes user login, role-based access control, and stateless session management.

## 🔧 Tech Stack

- Java
- Spring Boot
- Spring Security
- JWT (jjwt)
- Maven

## ✅ Features

- User registration and login
- JWT token generation & validation
- Role-based API authorization
- Stateless session handling
- Secure REST API endpoints

## 📁 Project Structure

- `config/` – Security configuration
- `controller/` – API endpoints
- `model/` – User & auth models
- `service/` – Business logic
- `repository/` – Spring Data JPA

## 🚀 Getting Started

### Prerequisites
- Java 17+
- Maven
- MySQL (or H2 for demo)

### Run Locally

```bash
git clone https://github.com/nikhilmangali1/SpringSecurity.git
cd SpringSecurity
./mvnw spring-boot:run

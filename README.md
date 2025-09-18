# Online Food Delivery Backend
- A scalable and secure backend system for an Online Food Delivery application, built with Spring Boot, Java, MySQL, JPA, JWT Authentication.
- It handles user authentication, restaurant & menu management, orders, payments, and delivery tracking.

## 📑 Table of Contents

- Overview
- Features
- Tech Stack
- Project Structure
- Setup & Installation
- Configuration
- API Documentation
- Database Schema
- Authentication & Security
- Testing
- Contribution Guidelines
- License

## 📖 Overview

- This project provides a backend system for an online food ordering and delivery platform.
- It supports secure login with JWT, restaurant & menu management, cart functionality, order placement, real-time delivery updates, and payment integration.

## 🚀 Features
- User Authentication & Authorization (JWT-based login & role-based access control)
- Restaurant Management (add, update, delete, and list restaurants)
- Menu Management (CRUD for menu items, categories, availability)
- Cart Operations (add/remove items, update quantity, calculate total)
- Order Management (place orders, track status, cancel)
- Delivery Tracking (assign delivery partner, update status in real-time)
- Payment Integration Ready (e.g., Razorpay/Stripe)
- Admin Dashboard APIs (manage users, restaurants, orders)
- Email Notifications (order confirmation, delivery updates)
- Scheduler Jobs (auto-cancel unpaid orders, cleanup old sessions)

## 🛠 Tech Stack
- Backend Framework: Spring Boot (Java 17+)
- Database: MySQL (JPA/Hibernate for ORM)
- Security: Spring Security, JWT Authentication
- Build Tool: Maven
- Testing: JUnit, Mockito, Spring Boot Test
- Version Control: Git & GitHub
- Other: Scheduler, Lombok, Validation

## 📂 Project Structure
``` src/main/java/com/fooddelivery
│── config/        # Security, JWT, DB configs
│── controller/    # REST Controllers
│── dto/           # Request/Response DTOs
│── entity/        # JPA Entities (User, Order, Restaurant, etc.)
│── exception/     # Custom exceptions & handlers
│── repository/    # JPA Repositories
│── scheduler/     # Background jobs
│── service/       # Business logic
│── util/          # Utility classes (helpers, constants)
```

## ⚙️ Setup & Installation
## 1️⃣ Clone the repository
```
git clone https://github.com/your-username/online-food-delivery-backend.git
cd online-food-delivery-backend
```
## 2️⃣ Configure Database
```
CREATE DATABASE food_delivery;
```
## Update src/main/resources/application.properties:
```
spring.datasource.url=jdbc:mysql://localhost:3306/food_delivery
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
jwt.secret=your_jwt_secret_here
```
## 3️⃣ Build & Run
```
mvn clean install
mvn spring-boot:run
```
## 🔑 Configuration
- Database: MySQL credentials in application.properties
- JWT Secret: Replace jwt.secret with a strong random string
- Scheduler: Runs background cleanup jobs (configurable in scheduler/)

## 📡 API Documentation
## Auth
- POST /api/auth/register → Register a new user
- POST /api/auth/login → Login & get JWT

## Restaurants
- GET /api/restaurants → List all restaurants
- POST /api/restaurants → Add restaurant (Admin only)

## Menu
- GET /api/restaurants/{id}/menu → Get menu items
- POST /api/menu → Add menu item (Admin/Restaurant owner)

## Orders
- POST /api/orders → Place an order
- GET /api/orders/{id} → Get order status
- PUT /api/orders/{id}/cancel → Cancel an order

## 🗄 Database Schema
```
Entities:
User (id, name, email, password, role)
Restaurant (id, name, location, rating)
MenuItem (id, restaurantId, name, price, category)
Cart (id, userId, items, totalPrice)
Order (id, userId, restaurantId, totalAmount, status)
Delivery (id, orderId, deliveryPartner, status)
```
## 🔐 Authentication & Security
- JWT-based login (token in Authorization: Bearer <token> header)
- Role-based access (User, Admin, Delivery)
- Password encryption with BCrypt

## 🤝 Contribution Guidelines
## Fork the repo
- Create a feature branch (feature/new-module)
- Commit changes (git commit -m "Added feature X")
- Push to branch (git push origin feature/new-module)
- Create a Pull Request

## 📜 License
- This project is licensed under the MIT License.

## COPYRIGHT (C) 2025 Gowtham Chiriki




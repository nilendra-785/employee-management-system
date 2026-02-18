# employee-management-system
A Full Stack Employee Management System using React, Spring Boot and MySQL

# Employee Management System (EMS)

A full-stack Employee Management System built using **Spring Boot** for backend REST APIs and **React (Vite)** for frontend UI.  
This application allows users to manage employees with CRUD operations and department selection.

---

## 🚀 Features

- Add new employee
- View all employees
- Update employee details
- Delete employee
- Department selection
- RESTful API integration
- Responsive frontend UI

---

## 🛠 Tech Stack

### Backend
- Java
- Spring Boot
- Spring Web (REST)
- MySQL
- Maven

### Frontend
- React (Vite)
- Axios
- Bootstrap / CSS

---

## 📂 Project Structure

full-stack/
│
├── ems-backend/ # Spring Boot backend
└── ems-frontend/ # React frontend



---

## ⚙ How to Run the Project Locally

### 1️⃣ Backend (Spring Boot)

```markdown
```bash
cd ems-backend
mvn spring-boot:run

Backend will start on:
http://localhost:8080


2️⃣ Frontend (React)

```markdown
```bash
cd ems-frontend
npm install
npm run dev

Frontend will start on:
➜  Local:   http://localhost:3000/

🔗 API Sample:

| Method | Endpoint            | Description       |
| ------ | ------------------- | ----------------- |
| GET    | /api/employees      | Get all employees |
| POST   | /api/employees      | Add employee      |
| PUT    | /api/employees/{id} | Update employee   |
| DELETE | /api/employees/{id} | Delete employee   |




# Spring Data JPA Demo

This project demonstrates the implementation of **Spring Boot + Spring Data JPA** with a simple REST API.
It covers CRUD operations, entity relationships, and database interaction using JPA repositories.

---

## 🚀 Tech Stack

* Java 17
* Spring Boot
* Spring Data JPA
* H2 Database (In-Memory)
* Maven
* REST APIs
* IntelliJ IDEA

---

## 📂 Project Structure

```
com.springdatabase.demo
│
├── controller
│   ├── TopicsController.java
│   └── CourseController.java
│
├── model
│   ├── Topics.java
│   └── Course.java
│
├── repository
│   ├── TopicsRepository.java
│   └── CourseRepository.java
│
├── services
│   ├── TopicServices.java
│   └── CourseServices.java
│
└── DemoApplication.java
```

---

## 🔗 Entity Relationship

* **One Topic → Many Courses**
* Implemented using `@ManyToOne` mapping

```java
@ManyToOne
@JoinColumn(name = "topics_id")
private Topics topics;
```

---

## 🛠 REST API Endpoints

### Topics

| Method | Endpoint       | Description     |
| ------ | -------------- | --------------- |
| GET    | `/topics`      | Get all topics  |
| GET    | `/topics/{id}` | Get topic by ID |
| POST   | `/topics`      | Add new topic   |
| PUT    | `/topics/{id}` | Update topic    |
| DELETE | `/topics/{id}` | Delete topic    |

### Courses

| Method | Endpoint                               | Description                 |
| ------ | -------------------------------------- | --------------------------- |
| GET    | `/topics/{id}/courses`                 | Get all courses for a topic |
| GET    | `/topics/{topicId}/courses/{courseId}` | Get course                  |
| POST   | `/topics/{id}/courses`                 | Add course                  |
| PUT    | `/topics/{id}/courses/{courseId}`      | Update course               |
| DELETE | `/topics/{id}/courses/{courseId}`      | Delete course               |

---

## 🗄 Database Configuration

* Uses **H2 in-memory database**
* Auto-created tables using Hibernate
* Console available at:

```
http://localhost:8080/h2-console
```

---

## ▶️ How to Run

```bash
mvn spring-boot:run
```

Or run `DemoApplication.java` directly from IntelliJ.

---

## 📌 Key Learning Outcomes

* Spring Boot REST APIs
* Spring Data JPA repositories
* Derived query methods
* Entity relationships
* Clean layered architecture

---

## 👨‍💻 Author

**Sandeep Hegde**
GitHub: [https://github.com/sandeep08hegde](https://github.com/sandeep08hegde)

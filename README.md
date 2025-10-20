# 📝 TodoListApplication_SpringDataSpa

[![Java](https://img.shields.io/badge/Java-17+-blue.svg)](https://www.oracle.com/java/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen.svg)](https://spring.io/projects/spring-boot)
[![MySQL](https://img.shields.io/badge/Database-MySQL%208-orange.svg)](https://www.mysql.com/)
[![License](https://img.shields.io/badge/License-MIT-lightgrey.svg)](LICENSE)

A classic **Spring Boot MVC Todo List** application built with **Spring Data JPA**, **JSP**, and **MySQL**.  
It demonstrates end-to-end CRUD functionality, form handling, and MVC architecture — perfect for learning Spring or showcasing full-stack Java development skills.

---

## 🌟 Features

- ✅ Add, view, update, and delete todos  
- ✅ Mark todos as completed / pending  
- ✅ Store data in MySQL (with Docker setup provided)  
- ✅ Simple, responsive UI using **Bootstrap 5 (WebJars)**  
- ✅ Clean MVC architecture: Controller → Service → Repository → Entity  

---

## 🏗️ Tech Stack

| Layer | Technology |
|--------|-------------|
| **Backend** | Spring Boot 3.x (MVC) |
| **Database** | MySQL 8 (JPA + Hibernate) |
| **Frontend** | JSP + JSTL + Bootstrap 5 |
| **Build Tool** | Maven Wrapper |
| **Language** | Java 17+ |

---

## 🖼️ UI Preview

> *(Optional: Replace these placeholders with your own screenshots)*

| Todo List Page | Add Todo Page |
|----------------|----------------|
| ![List Todos](docs/screenshot-list.png) | ![Add Todo](docs/screenshot-add.png) |

---

## ⚙️ Configuration

**`src/main/resources/application.properties`**

```properties
server.port=8081
spring.mvc.view.prefix=/WEB-INF/jsp/
spring.mvc.view.suffix=.jsp

spring.datasource.url=jdbc:mysql://localhost:3306/todos
spring.datasource.username=todos-user
spring.datasource.password=dummytodos
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
spring.jpa.hibernate.ddl-auto=update
spring.jpa.defer-datasource-initialization=true

logging.level.org.springframework=info
spring.mvc.format.date=yyyy-MM-dd


🐳 Start MySQL in Docker
docker run --detach \
  --env MYSQL_ROOT_PASSWORD=dummypassword \
  --env MYSQL_USER=todos-user \
  --env MYSQL_PASSWORD=dummytodos \
  --env MYSQL_DATABASE=todos \
  --name mysql \
  --publish 3306:3306 mysql:8-oracle


🚀 Run the Application
1️⃣ Clone and enter the project
git clone https://github.com/WanpinCai/TodoListApplication_SpringDataSpa.git
cd TodoListApplication_SpringDataSpa
2️⃣ Build & run
./mvnw spring-boot:run
Then open your browser and go to 👉 http://localhost:8081

🧩 Example JSP Snippet
<c:forEach items="${todos}" var="todo">
    <tr>
        <td>${todo.id}</td>
        <td>${todo.description}</td>
        <td>${todo.targetDate}</td>
        <td>${todo.done}</td>
        <td><a href="delete-todo?id=${todo.id}" class="btn btn-warning">Delete</a></td>
        <td><a href="update-todo?id=${todo.id}" class="btn btn-success">Update</a></td>
    </tr>
</c:forEach>


🧱 Entity Example
@Entity
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;
    private LocalDate targetDate;
    private boolean done;
}


🧰 Project Structure
src/
 └─ main/
     ├─ java/com/example/todo/
     │   ├─ TodoListApplication.java
     │   ├─ controller/
     │   ├─ model/
     │   ├─ repository/
     │   └─ service/
     ├─ resources/
     │   ├─ application.properties
     │   └─ static/
     └─ webapp/WEB-INF/jsp/
         ├─ list-todos.jsp
         ├─ add-todo.jsp
         └─ common/
             ├─ header.jspf
             ├─ navigation.jspf
             └─ footer.jspf

🧪 Testing
./mvnw test

Add tests in src/test/java/ to validate CRUD logic and controller endpoints.
Integration testing can be implemented with @SpringBootTest + MockMvc.

🛠️ Troubleshooting


🧭 Future Improvements

✅ Add user authentication (Spring Security)

✅ REST API endpoints for external access

✅ Docker Compose setup for app + database

✅ Unit and integration tests coverage

✅ CI/CD workflow (GitHub Actions)

📄 License

This project is licensed under the MIT License — see LICENSE
 for details.

🙌 Acknowledgments

Developed as a practice project inspired by in28minutes Spring Boot tutorials.
Special thanks to the Spring community for providing excellent documentation and learning resources.

💡 Created by Wanpin Cai
 — MSc in AI, National College of Ireland.


---

✅ **Tips for polishing your GitHub page:**
1. Add `/docs/screenshot-list.png` and `/docs/screenshot-add.png` to make the README visual.  
2. Add a simple `LICENSE` file (MIT recommended).  
3. Add `topics` to the repo: `spring-boot`, `java`, `jsp`, `mysql`, `todo-app`, `webapp`.  
4. (Optional) Create a `Dockerfile` or `docker-compose.yml` to make it deployable instantly.

Would you like me to generate a **Docker Compose** setup (`docker-compose.yml`) that runs both MySQL + your Spring app together for easy one-command startup?



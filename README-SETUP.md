# MovieLeague — Setup & Run

Minimal Spring Boot backend scaffold for the Movie League application.

Prerequisites
- Java 17
- Maven (or use your system package manager to install)
- PostgreSQL running locally (or a remote instance)

Default configuration (see `src/main/resources/application.yml`):
- JDBC URL: `jdbc:postgresql://localhost:5432/movieleague`
- Username: `postgres`
- Password: `postgres`

Build
```bash
# from project root
mvn -DskipTests package
```

Run
```bash
# run with maven
mvn -DskipTests spring-boot:run

# or run the packaged jar
java -jar target/movieleague-0.1.0.jar
```

OpenAPI / Swagger UI
- API docs: `http://localhost:8080/api-docs`
- Swagger UI: `http://localhost:8080/swagger-ui.html` or `http://localhost:8080/swagger-ui/index.html`

Quick Docker Postgres (optional)
```bash
docker run --name ml-postgres -e POSTGRES_PASSWORD=secretpassword -e POSTGRES_USER=postgres -e POSTGRES_DB=movieleague -p 5432:5432 -d postgres:15
```

Next steps
- Expand controllers and DTOs
- Add integration tests
- Add admin/member management UI or API clients
MovieLeague - Setup

Run locally with PostgreSQL available at `jdbc:postgresql://localhost:5432/movieleague`.

Commands:

```bash
mvn -v
mvn spring-boot:run
```

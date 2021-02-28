# studentDB_springREST_template
Simple student database using RESTful web service with Spring Boot in Java and PostgreSQL

PostgreSQL Database Setup Commands:
psql
CREATE USER general WITH PASSWORD 'password' SUPERUSER CREATEDB CREATEROLE;
CREATE DATABASE student;
GRANT ALL PRIVILEGES ON DATABASE "student" TO general;
GRANT ALL PRIVILEGES ON DATABASE "student" TO postgres;

CURL POST, PUT & Delete Command Examples:
curl -X POST -H "Content-Type: application/json" --data '{"name": "David Doe", "email": "david.doe@gmail.com", "dob": "1995-12-10"}' http://localhost:8080/api/student
curl -X DELETE http://localhost:8080/api/student/2
curl -X PUT -H "Content-Type: application/json" "http://localhost:8080/api/student/1?name=Fred%20Doe&email=fred.doe@gmail.com"

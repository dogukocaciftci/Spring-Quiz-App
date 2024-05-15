# Quiz App

The Quiz App is a web application that allows users to create quizzes, take quizzes, and view their results. It is built with Java, Spring Boot, and PostgreSQL.

## Technologies Used

- Java
- Spring Boot
- PostgreSQL
- Maven

## Getting Started

To get started with the Quiz App, follow these steps:

1. **Clone the repository:**
   ```
   git clone https://github.com/your-username/quiz-app.git
   ```
   
2. **Set up the database:**
   - Install PostgreSQL and create a database.
   - Update the `application.properties` file with your database details.

3. **Run the application:**
   ```
   mvn spring-boot:run
   ```
   
4. **Access the application:**
   Open a web browser and go to `http://localhost:8080`.

## Features

- **Create a Quiz:**
  - Endpoint: `POST /quiz/create`
  - Request Body: `{ "category": "Category Name", "numQ": 5, "title": "Quiz Title" }`

- **Get Quiz Questions:**
  - Endpoint: `GET /quiz/{quizId}/questions`

- **Submit Quiz Answers:**
  - Endpoint: `POST /quiz/{quizId}/submit`
  - Request Body: `{ "answers": [ { "questionId": 1, "answer": "User's answer" }, ... ] }`

- **Get Quiz Result:**
  - Endpoint: `GET /quiz/{quizId}/result`

## Development

To contribute to the Quiz App, follow these steps:

1. **Fork the repository.**
2. **Create a new branch:**
   ```
   git checkout -b feature/new-feature
   ```
3. **Make your changes and commit them:**
   ```
   git commit -am 'Add new feature'
   ```
4. **Push to the branch:**
   ```
   git push origin feature/new-feature
   ```
5. **Submit a pull request.**


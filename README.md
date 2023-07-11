# Proj_SwD

## Description
The project aims to apply software dependability paradigms to enhance the reliability of the compiler code. It involves the implementation and study of various phases of a compiler. The project utilizes the NewLang language, which encompasses key structures found in procedural programming languages (such as functions, if statements, while loops, for loops, etc.) along with additional slightly more complex structures that aid in writing specific programs.

## Tools Used
The project uses several tools to ensure code quality, test coverage, and reliability. These tools are already included in the repository, so there is no need for additional configuration. Simply download the dependencies through the provided package manager.

The tools used in the project include:

- SonarCloud: Used to conduct a code quality analysis and ensure adherence to best practices.
- Docker Container: Provides a containerized environment for consistent development and deployment.
- Jacoco, Codecov, and Pitest: Utilized for evaluating the test suite with JUnit and evaluate code coverage and mutation testing.
- Ecocode: Assists in identifying and resolving potential code issues and bugs.
- Java Microbenchmark Harness: Allows for the benchmarking and performance analysis of the code.
- Evosuite and Randoop: Employed for the automatic generation of tests to enhance test coverage.
- FindSecBugs and OWASP DC: Utilized for security analysis, vulnerability detection, and ensuring compliance with OWASP security standards.

## GitHub Actions
The project incorporates the following GitHub Actions for automation:

- Codecov: Performs automatic execution and analysis of test coverage, providing insights into the effectiveness of the test suite.
- SonarCloud: Automatically analyzes the code for quality issues, identifying potential bugs, vulnerabilities, and maintaining code standards.
- Docker Container: Facilitates the automatic building of the container, ensuring a consistent and reproducible development environment.
- Run_tests: It executes the run_tests.bat script, useful for the final phase of system testing, as it runs the compiled programs with specific inputs and checks their correct execution by comparing the actual program output with the expected one.

## Installation
To set up the project, follow these steps:

- Clone the repository.
- Download the project dependencies using the package manager (Maven, Gradle, etc.).
- Ensure you have the required tools installed on your system (Java, Docker, etc.).

## Usage
Once the project is set up and the dependencies are downloaded, you can use it in the following ways:

- Compile the NewLang code using the provided compiler.
- Execute the generated executable to run NewLang programs.
- Run the test suite with JUnit to evaluate the functionality and reliability of the code.
- Analyze code quality using SonarCloud to identify potential issues and maintain code standards.
- Utilize the Docker container for a consistent and reproducible development environment.
- Evaluate code coverage and perform mutation testing using Jacoco, Codecov, and Pitest.
- Identify and resolve potential code issues and bugs using Ecocode.
- Benchmark the code performance using the Java Microbenchmark Harness.
- Generate additional tests automatically using Evosuite and Randoop to enhance test coverage.
- Conduct security analysis and ensure compliance with OWASP standards using FindSecBugs and OWASP DC.

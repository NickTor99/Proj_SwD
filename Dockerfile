FROM maven:3.8.3-openjdk-17
WORKDIR /app
COPY pom.xml ./
COPY src ./src
COPY test_files ./test_files
RUN mvn clean compile assembly:single
ENTRYPOINT ["java", "-cp","target/maven-docker-jar-with-dependencies.jar", "launcher.Main"]
EXPOSE 8080
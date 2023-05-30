FROM ubuntu:latest
WORKDIR /app
RUN apt-get update && apt-get install -y gcc && apt-get install -y maven && apt-get install -y openjdk-17-jdk
COPY pom.xml ./
COPY src ./src
COPY NewLang_example.txt ./
RUN mvn clean compile assembly:single
ENTRYPOINT ["java", "-cp","target/maven-docker-jar-with-dependencies.jar", "launcher.Main"]
EXPOSE 8080
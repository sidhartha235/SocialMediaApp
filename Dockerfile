FROM openjdk:21
WORKDIR /app
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} /app/app.jar
COPY src/main/resources/application.properties /app/application.properties
COPY src/main/resources/db.properties /app/db.properties
EXPOSE 8080
CMD ["java", "-jar", "/app/app.jar"]
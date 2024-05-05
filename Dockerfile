#FROM openjdk:21
#FROM mysql:5
#WORKDIR /app
#ARG JAR_FILE=target/*.jar
#COPY ${JAR_FILE} /app/app.jar
#COPY src/main/resources/application.properties /app/application.properties
#COPY src/main/resources/db.properties /app/db.properties
#EXPOSE 8080
#CMD ["java", "-jar", "/app/app.jar"]


# Stage 1: Build Java application
FROM openjdk:21 AS build
WORKDIR /app
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} /app/app.jar
COPY src/main/resources/application.properties /app/application.properties
COPY src/main/resources/db.properties /app/db.properties

# Stage 2: Run the application using Java and MySQL
FROM mysql:5 AS mysql
# Configure MySQL settings if needed

# Final stage: Use OpenJDK image and MySQL image
FROM openjdk:21
WORKDIR /app

# Copy the built JAR file and resources from the build stage
COPY --from=build /app/app.jar /app/app.jar
COPY --from=build /app/application.properties /app/application.properties
COPY --from=build /app/db.properties /app/db.properties

# Expose port 8080 for the Spring Boot application
EXPOSE 8080

# Set the command to run the Spring Boot application using the JAR file
CMD ["java", "-jar", "/app/app.jar"]

# --- Stage 1: Build the application ---
FROM maven:4.0.0-rc-7-eclipse-temurin-25 AS build
WORKDIR /app

# Copy the pom.xml first to cache dependencies
COPY pom.xml .

# Download dependencies (this layer is cached unless pom.xml changes)
RUN mvn dependency:go-offline -B

# Copy the source code
COPY src ./src

# Package the application (skipping tests for speed, remove -DskipTests if preferred)
RUN mvn clean package -DskipTests

# --- Stage 2: Run the application ---
FROM  eclipse-temurin:25-jre
WORKDIR /app

# Copy the built JAR file from the build stage
# Note: Check your pom.xml for the exact final Name, or use a wildcard like *.jar
COPY --from=build /app/target/*.jar app.jar

# Expose the application port (change 8080 to your app's port)
EXPOSE 8080

# Run the jar file
ENTRYPOINT ["java", "-jar", "app.jar"]

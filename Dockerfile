# Use the official OpenJDK image from Docker Hub
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the .jar file from the host machine to the container
COPY target/demo-0.0.1-SNAPSHOT.jar /app/

# Set the entrypoint to run the .jar file
ENTRYPOINT ["java", "-jar", "demo-0.0.1-SNAPSHOT.jar"]

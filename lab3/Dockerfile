# Use an official Java runtime as a parent image
FROM registry.access.redhat.com/ubi9/openjdk-21:1.20

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file into the container
COPY target/lab3-0.0.1-SNAPSHOT.jar app.jar

# Expose the port that the application will run on
EXPOSE 8080

# Run the JAR file
ENTRYPOINT ["java", "-jar", "app.jar"]
# ---- Build Stage ----
FROM docker.io/library/maven:3.9.6-eclipse-temurin-21  AS builder

# Set the working directory in the container
WORKDIR /app

# Copy pom.xml and download dependencies first (better caching) (two lines missing)

# Copy the source code

# Package the application (skip tests for faster build, optional)

# Use an official Java runtime as a parent image
FROM registry.access.redhat.com/ubi9/openjdk-21:1.20

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file into the container

# Expose the port that the application will run on (8080)

# Run the JAR file
ENTRYPOINT ["java", "-jar", "app.jar"]

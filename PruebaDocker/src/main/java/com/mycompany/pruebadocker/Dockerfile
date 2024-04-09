# Use the official Maven image as a base image
FROM maven:3.6.3-jdk-11 AS build

# Set the working directory in the container
WORKDIR /app

# Copy the project files into the container
COPY . .

# Build the application
RUN mvn clean install

# Set the base image to adoptopenjdk image
FROM adoptopenjdk/openjdk11:alpine-jre

# Set the working directory in the container
WORKDIR /app

# Copy the built artifact from the Maven image
COPY --from=build /app/target/PruebaDocker-1.0-SNAPSHOT.jar .

# Command to run the application
CMD ["java", "-jar", "PruebaDocker-1.0-SNAPSHOT.jar"]
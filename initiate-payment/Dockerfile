# Use an official Maven image as a parent image
FROM openjdk:23-jdk-slim

WORKDIR /app

COPY target/initiate-payment-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

CMD ["java", "-jar", "app.jar"]
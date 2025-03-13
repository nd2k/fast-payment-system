# Use an official Maven image as a parent image
FROM openjdk:23-jdk-slim

# Copy everything...
COPY . ./

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/initiate-payment/target/initiate-payment-0.0.1-SNAPSHOT.jar"]
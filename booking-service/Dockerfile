FROM openjdk:17-jdk-alpine
ARG JAR_FILE=target/booking-service-1.0-SNAPSHOT.jar
COPY ${JAR_FILE} bookingservice.jar
ENTRYPOINT ["java","-jar","/bookingservice.jar"]
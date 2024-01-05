FROM openjdk:17-jdk-alpine
ARG JAR_FILE=target/notification-service-1.0-SNAPSHOT.jar
COPY ${JAR_FILE} notificationservice.jar
ENTRYPOINT ["java","-jar","/notificationservice.jar"]
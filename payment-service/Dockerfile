FROM openjdk:17-jdk-alpine
ARG JAR_FILE=target/payment-service-1.0-SNAPSHOT.jar
COPY ${JAR_FILE} paymentservice.jar
ENTRYPOINT ["java","-jar","/paymentservice.jar"]
FROM openjdk:17-jdk-alpine
ARG JAR_FILE=target/api-gateway-1.0-SNAPSHOT.jar
COPY ${JAR_FILE} apigateway.jar
ENTRYPOINT ["java","-jar","/apigateway.jar"]
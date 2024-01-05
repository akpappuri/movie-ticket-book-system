FROM openjdk:17-jdk-alpine
ARG JAR_FILE=target/movie-services-registry-1.0-SNAPSHOT.jar
COPY ${JAR_FILE} movieregistry.jar
ENTRYPOINT ["java","-jar","/movieregistry.jar"]
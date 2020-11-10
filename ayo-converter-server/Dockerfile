FROM openjdk:8-jdk-alpine
MAINTAINER Kyle Smit
ARG JAR_FILE=target/*.jar
ADD ${JAR_FILE} /usr/local/src/ayoconverter.jar
WORKDIR /usr/local/src
EXPOSE 8080
ENTRYPOINT ["java","-jar","ayoconverter.jar"]

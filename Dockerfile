#FROM openjdk:11
FROM --platform=linux/x86-64 amazoncorretto:11-al2-jdk
VOLUME /tmp
EXPOSE 8088
ARG JAR_FILE=target/*.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-Dspring.profiles.active=local","-jar","/app.jar"]
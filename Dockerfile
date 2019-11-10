FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY target/SpringBootWebAppExample*.jar App.jar
EXPOSE 8081
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/SpringBootWebAppExample.jar"]
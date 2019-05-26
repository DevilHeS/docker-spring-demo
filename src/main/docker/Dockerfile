FROM openjdk:11.0.3-jdk-slim
COPY target/demo-1.0.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
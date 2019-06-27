FROM openjdk:11.0.3-jdk-slim
COPY target/demo-1.0.jar app.jar
ENV PARAMS=""
ENV PROFILES="dev"
ENTRYPOINT ["sh","-c","java $PARAMS -jar app.jar --spring.profiles.active=$PROFILES "]
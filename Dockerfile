FROM openjdk:19
VOLUME /tmp
EXPOSE 8080
ADD ${JAR_FILE} nunathani.jar
ARG JAR_FILE=target/disponibilidad-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/nunathani.jar"]
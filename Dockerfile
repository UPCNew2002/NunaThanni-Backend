FROM openjdk:19
VOLUME /tmp
EXPOSE 8080
ARG JAR_FILE=target/disponibilidad-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} nunathani.jar
ENTRYPOINT ["java", "-jar", "/nunathani.jar"]
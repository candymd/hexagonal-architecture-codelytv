FROM adoptopenjdk:11-jre-hotspot
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} hexagonal-architecture-codelytv-1.0.jar
ENTRYPOINT ["java","-jar","/hexagonal-architecture-codelytv-1.0.jar"]
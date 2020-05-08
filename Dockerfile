FROM openjdk:8
COPY ./target/config-server-0.0.1-SNAPSHOT.jar config-server-0.0.1-SNAPSHOT.jar
CMD ["java","-jar","config-server-0.0.1-SNAPSHOT.jar"]
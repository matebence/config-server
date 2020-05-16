FROM openjdk:8
COPY ./target/config-server-0.0.1-SNAPSHOT.jar config-server-0.0.1-SNAPSHOT.jar
COPY ./wait-for-it.sh wait-for-it.sh
RUN chmod +x wait-for-it.sh
CMD ["./wait-for-it.sh" , "naming-server:8761" , "--strict" , "--timeout=35" , "--" , "java", "-jar", "config-server-0.0.1-SNAPSHOT.jar"]
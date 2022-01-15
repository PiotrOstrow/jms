FROM openjdk:11
COPY ./target/receiver-0.0.1-SNAPSHOT.jar /usr/src/receiver/
WORKDIR /usr/src/receiver
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "receiver-0.0.1-SNAPSHOT.jar"]
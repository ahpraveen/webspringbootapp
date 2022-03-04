FROM openjdk:11
COPY ./target/webspringbootapp-0.0.1-SNAPSHOT.jar /usr/app/
WORKDIR /usr/app
ENTRYPOINT ["java", "-jar", "webspringbootapp-0.0.1-SNAPSHOT.jar"]

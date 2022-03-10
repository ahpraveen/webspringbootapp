FROM openjdk:11
COPY ./target/webspringbootapp-0.0.1-SNAPSHOT.jar /usr/app/
WORKDIR /usr/app
EXPOSE 9000
ENTRYPOINT ["java", "-jar", "webspringbootapp-0.0.1-SNAPSHOT.jar"]

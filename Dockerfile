FROM openjdk:17

EXPOSE 8080

ADD target/deploy_project-0.0.1-SNAPSHOT.jar first_springboot

ENTRYPOINT ["java", "-jar", "first_springboot"]
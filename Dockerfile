FROM openjdk:17 AS midterm
MAINTAINER banurr
COPY midterm-0.0.1-SNAPSHOT.jar midterm.jar
ENTRYPOINT ["java","-jar","midterm.jar"]

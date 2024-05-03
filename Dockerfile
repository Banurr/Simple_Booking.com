FROM openjdk:17
MAINTAINER banurr
COPY midterm.jar m.jar
ENTRYPOINT ["java","-jar","m.jar"]



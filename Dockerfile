FROM openjdk:17 AS midterm
MAINTAINER banurr
COPY midterm.jar m.jar
ENTRYPOINT ["java","-jar","midterm.jar"]

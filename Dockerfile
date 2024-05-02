FROM openjdk:17 AS midterm
MAINTAINER banurr
COPY /build/libs/midterm.jar m.jar
ENTRYPOINT ["java","-jar","m.jar"]

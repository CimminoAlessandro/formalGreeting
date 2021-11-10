FROM maven:3.6.0-jdk-11-slim AS build
COPY . /app
WORKDIR /app

RUN mvn -f pom.xml package
RUN mv target/*.jar fatjar.jar

FROM openjdk:11-jre-slim
COPY --from=build /app/fatjar.jar .
EXPOSE 5050
ENTRYPOINT ["java","-jar","fatjar.jar"]
FROM maven:3.8.1-openjdk-17 as build
WORKDIR /app
COPY . .
RUN mvn clean package

FROM openjdk:17-alpine
WORKDIR /app
COPY --from=build /app/target/backend-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]

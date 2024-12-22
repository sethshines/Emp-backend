FROM maven:3.8.1-openjdk-17 as build
WORKDIR /app
COPY . .
RUN mvn clean package

FROM openjdk:17-alpine
WORKDIR /app
COPY --from=build /app/target/your-app-name.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]

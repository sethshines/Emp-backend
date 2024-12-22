FROM maven:3.8.1-openjdk-11 as build
WORKDIR /app
COPY . .
RUN mvn clean package

FROM openjdk:11-jre-slim
WORKDIR /app
COPY --from=build app/target/your-app-name.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]

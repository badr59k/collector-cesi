# Etape 1 : compiler notre application Java
FROM eclipse-temurin:21-jdk AS build

WORKDIR /app

COPY . .

RUN chmod +x mvnw && ./mvnw package -DskipTests

# Etape 2 : executer uniquement l'application
FROM eclipse-temurin:21-jre-alpine-3.24

WORKDIR /app

COPY --from=build /app/target/annonces-service-0.0.1-SNAPSHOT.jar app.jar

# Executer l'application sans les droits root
USER 10001

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
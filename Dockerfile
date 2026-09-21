# Этап 1: Сборка приложения
FROM eclipse-temurin:21-jdk-jammy AS build
WORKDIR /app

# Копируем обертку Maven и pom.xml
COPY .mvn/ .mvn
COPY mvnw pom.xml ./
RUN ./mvnw dependency:go-offline

# Копируем исходный код и собираем .jar файл
COPY src ./src
RUN ./mvnw clean package -DskipTests

# Этап 2: Запуск
FROM eclipse-temurin:21-jre-jammy
WORKDIR /app

# Копируем артефакт из этапа сборки
COPY --from=build /app/target/FootballBase-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]


# Stage 1 - Build Application

FROM gradle:8.14.3-jdk21 AS builder

WORKDIR /workspace

COPY . .

RUN chmod +x gradlew

RUN ./gradlew clean build --no-daemon


# Stage 2 - Runtime

FROM eclipse-temurin:21-jre

WORKDIR /app

COPY --from=builder /workspace/build/libs/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","app.jar"]

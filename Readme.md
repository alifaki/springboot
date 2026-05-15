Create app.jar by 

./gradlew bootJar

cp build/libs/*.jar app.jar

docker compose up -d --build

docker compose up -d
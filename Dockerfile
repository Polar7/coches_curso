# Utiliza una imagen base de OpenJDK 17
FROM eclipse-temurin:17-jdk-alpine

# Directorio de trabajo en el contenedor
WORKDIR /app

# Copia el archivo JAR de la aplicación al contenedor
COPY build/libs/my-application.jar /app/my-application.jar

# Expone el puerto en el que la aplicación está escuchando
EXPOSE 8080

# Comando para ejecutar la aplicación
CMD ["java", "-jar", "/app/my-application.jar", "--spring.profiles.active=prod"]


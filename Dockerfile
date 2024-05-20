# Usar una imagen base de OpenJDK 17
FROM openjdk:17-jdk-slim

# Copiar el archivo JAR generado al directorio /app dentro del contenedor
COPY target/planviajes-0.0.1-SNAPSHOT.jar /app/planviajes.jar

# Establecer el directorio de trabajo dentro del contenedor
WORKDIR /app

# Exponer el puerto en el que la aplicación Spring Boot estará escuchando (ajustar según sea necesario)
EXPOSE 8080

# Comando para ejecutar la aplicación Spring Boot cuando se inicie el contenedor
CMD ["java", "-jar", "planviajes.jar"]

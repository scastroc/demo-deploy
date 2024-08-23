# Usa una imagen base de JDK
FROM openjdk:19-jdk-alpine

# Directorio de trabajo dentro del contenedor
WORKDIR /app

# Crea el directorio para la base de datos H2
RUN mkdir -p /app/db

# Copia el archivo JAR generado por Spring Boot al contenedor
COPY target/demoDeploy-0.0.1-SNAPSHOT.jar /app/demoDeploy.jar

# Establece una variable de entorno para la persistencia de H2
ENV SPRING_DATASOURCE_URL=jdbc:h2:file:/app/db/productos

# Exponer el puerto donde correrá la aplicación
EXPOSE 8080

# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "/app/demoDeploy.jar"]

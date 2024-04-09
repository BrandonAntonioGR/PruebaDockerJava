FROM openjdk:8-jdk

# Actualizar los repositorios de apt-get
RUN apt-get update

# Copiar la aplicaciÃ³n Java Swing al contenedor
COPY /target/PruebaDocker-1.0-SNAPSHOT.jar  /app/PruebaDocker-1.0-SNAPSHOT.jar

# Comando para ejecutar la aplicaciÃ³n Java Swing
CMD ["java", "-jar", "/app/PruebaDocker-1.0-SNAPSHOT.jar"]
# ----------------------------
# ETAPA 1: Construcción (Build)
# ----------------------------
FROM maven:3.8.7-eclipse-temurin-17 as builder
# Se define el directorio de trabajo dentro del contenedor
WORKDIR /app

# Copiar el archivo pom.xml y descargar dependencias
COPY pom.xml .
# Descarga de dependencias sin compilar todavía:
RUN mvn dependency:go-offline

# Copiar el resto del código fuente
COPY src ./src

# Compilar y empaquetar el proyecto
RUN mvn clean package -DskipTests

# ----------------------------
# ETAPA 2: Imagen Final
# ----------------------------
FROM eclipse-temurin:17-jdk-alpine

# Crear un directorio de trabajo
WORKDIR /app

# Copiar el JAR desde la etapa anterior
# Nota: Ajustar el nombre del JAR si el proyecto lo genera con otro nombre
COPY --from=builder /app/target/*.jar app.jar

# Exponer el puerto (opcional, pero recomendado para documentación)
EXPOSE 8080

# Establecer el comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "app.jar"]
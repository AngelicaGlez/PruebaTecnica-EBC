# EBC

Prueba Tecnica para la EBC.

## Requisitos

Requisitos necesarios para ejecutar el proyecto:

- Java 17.0.2
- Maven 3.9.6
- Spring Boot 3.3.1

## Instalación

Pasos para instalar y ejecutar el proyecto a traves de consola:

1. Clona el repositorio:
    git clone https://github.com/AngelicaGlez/PruebaTecnica-EBC

2. Navega al directorio del proyecto:
    cd EBC
    
3. Construye el proyecto con Maven:
    mvn clean install

4. Compila y empaqueta el proyecto con Maven:
    mvn clean compile package
 
5. Ejecuta la aplicación:
    mvn spring-boot:run
    
## Informacion adicional
El puerto en el que esta expuesta la api es el 8080

## Uso
Consume los endpoint desde el navegador o Postman sustituyendo {number} por el valor de un numero entero

Endpoint:
http://localhost:8080/api/sequence/collatz/{number}

Ejemplo de como se consume:
http://localhost:8080/api/sequence/collatz/8



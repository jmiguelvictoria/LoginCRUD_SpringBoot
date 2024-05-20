# LoginCRUD_SpringBoot

Proyecto demo desarrollado con Spring Boot que permite la autenticación de usuarios, así como la creación, eliminación y listado de usuarios. El proyecto utiliza una base de datos MySQL para almacenar la información de los usuarios.

## Características

- **Autenticación de usuarios**: Utiliza Spring Security para gestionar la autenticación.
- **Operaciones CRUD de usuarios**: Permite crear, eliminar y listar usuarios.
- **Base de datos MySQL**: Configurado para conectarse a una base de datos MySQL.

## Requisitos previos
Antes de comenzar, asegúrate de tener instalado lo siguiente:

- [Java 17](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html)
- [Maven 3.6+](https://maven.apache.org/install.html)
- [MySQL 8+](https://dev.mysql.com/downloads/mysql/)

## Configuración del proyecto

### Clonar el repositorio

```bash
git clone https://github.com/tu-usuario/LoginCRUD_springboot.git
cd LoginCRUD_springboot
```

## Configuración de la base de datos
Asegúrate de tener una base de datos MySQL en funcionamiento y crea una base de datos llamada BDENCUESTA. Puedes hacerlo utilizando el siguiente comando SQL:

```sql
CREATE DATABASE BDENCUESTA;
```
Configura las credenciales de acceso a la base de datos en el archivo application.properties:
```bash
spring.datasource.url=jdbc:mysql://localhost:3306/BDENCUESTA
spring.datasource.username=tu-usuario
spring.datasource.password=tu-contraseña
spring.jpa.hibernate.ddl-auto=update
```

##Compilar y ejecutar el proyecto
Utiliza Maven para compilar y ejecutar el proyecto:
```bash
mvn clean install
mvn spring-boot:run
```

## Uso de la API
##### Endpoints disponibles
- POST /login: Autentica un usuario.
- POST /users: Crea un nuevo usuario.
- DELETE /users/{id}: Elimina un usuario por su ID.
- GET /users: Lista todos los usuarios.


## Licencia
Este proyecto está licenciado bajo la Licencia [MIT](https://opensource.org/licenses/MIT.)

## Contacto
Si tienes alguna pregunta o sugerencia, no dudes en ponerte en contacto con nosotros a través de jmiguelvictoria@gmail.com.

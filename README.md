# apirest
Api Rest para clase Kodigo

## Descripción
Este proyecto es una API REST desarrollada con Spring Boot que gestiona una tabla de **Usuarios**. Permite realizar operaciones CRUD (Crear, Leer, Actualizar y Eliminar) sobre los usuarios.

## Requisitos previos
Antes de ejecutar la aplicación, hay que asegurarse de tener los siguientes requisitos instalados:

- **Java JDK 17** u otra version.
- **Maven** (según el proyecto).
- **MySQL** (con un usuario y contraseña configurados correctamente).
- **Postman** (opcional, para probar la API).

## Pasos para la configuración y ejecución

1. **Crear la base de datos en MySQL**:
   - Abre tu cliente de MySQL y ejecuta el siguiente comando para crear la base de datos:
     ```sql
     CREATE DATABASE userdb;
     ```

2. **Clonar el repositorio**:
   Clona este proyecto desde el repositorio en tu máquina local:
   ```bash
   git clone <URL_DEL_REPOSITORIO>
   cd <NOMBRE_DEL_PROYECTO>
    ```

3. **Configurar el archivo application.properties o application.yml**:
   Si es necesario, verifica que los datos de conexión a MySQL en el archivo de configuración sean correctos. Por ejemplo:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/userdb
spring.datasource.username=tu_usuario_mysql
spring.datasource.password=tu_contraseña_mysql
```

4. **Compilar y ejecutar la aplicación**:

```bash
mvn spring-boot:run
```

5. **Probar la API**:
   Una vez que la aplicación esté en ejecución, puedes probar los endpoints utilizando Postman o cualquier cliente REST. La API estará disponible en http://localhost:8085.

## Endpoints principales
- GET /api/users - Obtener todos los usuarios.
- GET /api/users/{id} - Obtener un usuario por ID.
- POST /api/users - Crear un nuevo usuario.
- PUT /api/users/{id} - Actualizar un usuario existente.
- DELETE /api/users/{id} - Eliminar un usuario por ID.
  
## Notas
No se requiere ninguna configuración adicional. Al ejecutar la aplicación por primera vez, las tablas necesarias se crearán automáticamente en la base de datos userdb.
Autor
Nombre del autor - sehulloa@gmail.com








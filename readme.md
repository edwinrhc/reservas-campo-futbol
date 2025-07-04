# Reserva de campo de futbol - Backend API

Este es un sistema backend para la gestión de reservas  desarrollado con **Spring Boot 3**, **JWT**, y **MySQL**. El sistema permite registrar usuarios, autenticarse y proteger recursos mediante autenticación basada en tokens JWT.

## 🚀 Características principales

- Registro de usuarios (`/user/signup`)
- Login con generación de token JWT (`/user/login`)
- Validación de roles (`admin`, `user`)
- Seguridad con Spring Security + JWT
- Endpoints protegidos por token
- Documentación Swagger UI
- Arquitectura limpia (controller, service, repository, utils)
- Base de datos MySQL
- Spring Boot 3.x y Java 17
- Docker

---

## 🧱 Tecnologías utilizadas

- Java 17
- Spring Boot 3.3.10
- Spring Security
- JWT (`jjwt 0.11.5`)
- Spring Data JPA
- MySQL
- Swagger OpenAPI 3 (`springdoc-openapi`)
- Lombok

---

## 📦 Estructura del proyecto
```
src/main/java/com/edwin/clinic/
├── entity/         # Entidades JPA (User, etc.)
├── repository/     # Interfaces JPA Repository
├── service/        # Interfaces de servicios
├── serviceImpl/    # Implementaciones de los servicios
├── rest/           # Interfaces REST (controladores)
├── restImpl/       # Implementaciones REST
├── jwt/            # Clases de JWT (JwtFilter, JwtUtil)
├── utils/          # Clases utilitarias (validaciones, respuestas)
└── security/       # Configuración de Spring Security
```
---

## 🔐 Seguridad con JWT

El sistema utiliza JWT para autenticar y autorizar usuarios. Los tokens incluyen:

- `sub`: email del usuario
- `role`: rol del usuario (`admin` o `user`)
- `exp`: tiempo de expiración

---

## 📄 Endpoints principales

| Método | Ruta             | Descripción                     |
|--------|------------------|---------------------------------|
| POST   | `/user/signup`   | Registro de nuevos usuarios     |
| POST   | `/user/login`    | Autenticación y token JWT       |
| GET    | `/user/info`     | (Pendiente) Datos del usuario actual (protegido) |

---

## 🔧 Configuración

### `application.properties`

```properties
server.port=8091
spring.datasource.url=jdbc:mysql://localhost:3306/clinicadb
spring.datasource.username=root
spring.datasource.password=123456
spring.jpa.hibernate.ddl-auto=update
jwt.secret=UEZyZk1XM2dBTDFuU2t5djE4eUZnZkNMaGtsZGx4Nmk= # mínimo 32 caracteres


```
## 🐳 Despliegue con Docker y Docker Compose

### ⚙️ Requisitos

- Docker Desktop
- Maven instalado (o usar `./mvnw` si está en el proyecto)
- Puerto `3307` disponible en tu máquina

---

### 📦 Empaquetar el proyecto

```bash
./mvnw clean package -DskipTests
```
```bash
docker-compose up --build
```
---

### 📝 Plantilla de commits

Este proyecto utiliza el estándar [Conventional Commits](https://www.conventionalcommits.org/es/v1.0.0/) para mantener un historial limpio y comprensible.

Puedes usar la plantilla `.gitmessage.txt` incluida en este repositorio:

```bash

git config --global commit.template ".gitmessage.txt"
git config --global core.editor "code --wait"
git commit 
````
``git commit - Por defecto se abre el Vscode``

| Tipo               | Cuándo usar                                                                 |
|--------------------|------------------------------------------------------------------------------|
| `feat(...)`        | ✅ Nueva funcionalidad                                                        |
| `fix(...)`         | ✅ Corrección de errores (bugs)                                               |
| `docs(...)`        | 📝 Cambios en documentación (`README`, comentarios, etc.)                    |
| `style(...)`       | 🎨 Cambios de formato (espacios, punto y coma, indentación, etc.), sin afectar lógica |
| `refactor(...)`    | 🔄 Refactorización de código sin cambiar funcionalidad                       |
| `test(...)`        | 🧪 Agregado o modificación de pruebas                                         |
| `chore(...)`       | 🔧 Tareas auxiliares como configuración, scripts, dependencias, etc.         |
| `perf(...)`        | 🚀 Mejoras de rendimiento                                                     |
| `ci(...)`          | 🤖 Cambios en configuración de CI/CD (Jenkins, GitHub Actions, etc.)         |
| `build(...)`       | 🏗️ Cambios que afectan el proceso de compilación o dependencias              |

---

### 🛠️ Ejemplo de uso

```bash
git commit -m "feat(reserva): se agregó validación de disponibilidad por zona y horario"
git commit -m "fix(user): se corrigió error al autenticar con JWT inválido"
git commit -m "docs(readme): se agregó tabla de tipos de commit"
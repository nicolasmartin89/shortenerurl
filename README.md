# 🌐 ShortenerURL Backend

ShortenerURL es una aplicación moderna y eficiente que te permite **acortar URLs largas** para que sean más fáciles de usar, compartir y administrar. 🚀 Ideal para cualquier persona que necesite simplificar enlaces extensos. ¡Rápido, seguro y práctico!

## 🗂️ Tabla de Contenidos

- [✨ Funcionalidades](#-funcionalidades)
- [⚙️ Instalación](#-instalación)
- [🛠️ Uso](#-uso)
- [🚀 Deploy](#-deploy)
- [🧰 Tecnologías Utilizadas](#-tecnologías-utilizadas)

## ✨ Funcionalidades

✅ Acorta URLs largas de forma sencilla.  
✅ Administra enlaces de forma eficiente.  
✅ Accede a estadísticas sobre los enlaces acortados.  
✅ Seguridad integrada con JWT para proteger tus datos.

## ⚙️ Instalación

¡Ponte en marcha en pocos pasos! 🛠️

1. **Clona el repositorio:**

git clone https://github.com/nicolasmartin89/shortenerurl.git  
cd shortenerurl

2. **Compila el proyecto utilizando Maven Wrapper:**

./mvnw clean install

3. **Configura las variables de entorno:**

Crea un archivo `.env` en la raíz del proyecto con el siguiente contenido:

DATABASE_URL=postgres://usuario:password@host:puerto/dbname  
JWT_SECRET=clave-secreta

Asegúrate de reemplazar los valores con los correspondientes a tu entorno.

4. **Ejecuta la aplicación:**

./mvnw spring-boot:run

La aplicación estará disponible en:

http://localhost:8080

Puedes hacer tus pruebas en Postman o un ambiente similar.

## 🛠️ Uso

Una vez en funcionamiento, podrás:

- Enviar una URL larga para obtener una versión acortada.
- Consultar estadísticas de los enlaces generados.
- Administrar tus enlaces con autenticación JWT.

Para una experiencia completa, asegúrate de que el frontend de ShortenerURL esté configurado y ejecutándose correctamente.  
Puedes encontrar más información sobre el frontend en su [repositorio](https://github.com/nicolasmartin89/shortenerurl-front).

## 🚀 Deploy

El backend está deployado en **Render** y utiliza **Neon** como base de datos.

🔗 [https://render.com/docs](https://render.com/docs) (Documentación de Render)  
🔗 [https://neon.tech/docs/introduction](https://neon.tech/docs/introduction) (Documentación de Neon)

**Nota:** Como el backend utiliza el plan gratuito de Render, es posible que la primera vez que accedas a la aplicación debas esperar unos segundos a que el servicio se reactive antes de poder utilizarlo completamente.

## 🧰 Tecnologías Utilizadas

Este proyecto fue construido con las siguientes herramientas:

- **Java 17** ☕
- **Spring Boot 3.4.1** 🌱
- **JWT** 🔐 (Seguridad)
- **Neon** 🐘 (Base de datos PostgreSQL en la nube)
- **Maven** ⚙️ (Gestión de dependencias y construcción)

Estas tecnologías se combinaron para ofrecer un backend robusto, escalable y fácil de mantener.

---

¡Gracias por utilizar ShortenerURL! Si tienes alguna pregunta o sugerencia, no dudes en abrir un issue en el repositorio. 😊
# Sistema de Cobranzas
<img width="700" height="500" src="https://github.com/user-attachments/assets/68e8805d-ae02-4c00-bf63-68fddcf1acf5"/>
<img width="700" height="500" src="https://github.com/user-attachments/assets/16cf0b42-0f73-45a2-97f8-621e7e8d7fc4"/>
<img width="700" height="500" src="https://github.com/user-attachments/assets/ec6bba97-fd91-4432-8d59-3174ebe28569"/>

## 1. Estrategia de Desarrollo
La solución se implementa como una *aplicación web basada en Spring Boot* que expone una *API REST protegida con Spring Security*.  

- Se sigue una *arquitectura en capas*:  
  - *Model*: entidades (Usuario, Comision).  
  - *Repository*: interacción con la base de datos (JPA/Hibernate).  
  - *Service*: lógica de negocio (validación de usuario y consulta de comisiones).  
  - *Controller*: exposición de endpoints REST.  
- La *autenticación* se gestiona mediante Spring Security con credenciales definidas localmente.  
- Los *datos de usuario y comisiones* se obtienen a través de endpoints (mockeados/simulados en esta versión).  
- La documentación y pruebas se realizan con *Swagger* y *Postman*.  

---

## 2. Tareas de Backend

| Tarea | Descripción | Estimación | Alcance / Supuestos |
|-------|-------------|------------|----------------------|
| *1. Análisis y diseño* | Revisión de requerimientos, definición de entidades (Usuario, Comision). | 3 hs | Solo se modelan las entidades necesarias para la prueba. |
| *2. Configuración inicial* | Creación del proyecto con Spring Initializr, configuración de dependencias (Web, Security, JPA, H2, Swagger). | 2 hs | Se trabaja con Maven. |
| *3. Modelo de datos* | Implementación de Usuario y Comision como entidades JPA. | 3 hs | Sin relaciones complejas. |
| *4. Seguridad (Spring Security)* | Configuración de login con credenciales definidas en memoria/BD local. | 2hs | Seguridad básica, sin JWT ni OAuth. |
| *5. Integración con servicios externos* | Simulación de consulta de usuarios y comisiones. | 1h | Los endpoints externos se mockean hasta disponer de los reales. |
| *6. API REST* | Exposición de endpoints: login y comisiones del cobrador. | 2 hs | Foco en perfil Cobrador. |
| *7. Documentación (Swagger)* | Configuración de OpenAPI/Swagger para testear endpoints. | 2 hs | Disponible en /swagger-ui.html. |
| *8. Pruebas básicas* | Creación de pruebas unitarias con JUnit y Mockito. | 2 hs | Cobertura mínima en servicios y controladores. |
| *9. Deploy en Testing* | Generación de artefacto .jar y validación en ambiente local. | 2 hs | Usando Tomcat embebido de Spring Boot. |

---

## 3. Librerías, Frameworks y Herramientas

### Backend
- *Java 21*  
- *Spring Boot* (Web, Security, Data JPA)  
- *Hibernate* como ORM  
- *H2 Database* (Testing)  
- *Swagger (springdoc-openapi)* para documentación  

### Desarrollo y Build
- *Maven*  
- *Lombok* (reducción de boilerplate)  
- *JUnit 5 / Mockito* para pruebas  

### Herramientas de apoyo
- *Git/GitHub* para control de versiones  
- *Postman* para pruebas manuales  
- *IDE (IntelliJ/Eclipse)*

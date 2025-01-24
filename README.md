Se realiza la creación de un back de acuerdo a la siguientes condiciones:

La problemática planteada para la prueba es la siguiente: Necesitamos desarrollar una aplicación web para gestionar la información de los cursos ofrecidos por Cesde. La aplicación debe permitir a los administradores agregar, editar y eliminar cursos, así como también mostrar una lista de todos los cursos disponibles. Igualmente, la aplicación debe permitir administrar los docentes que dictarán cada curso.

Cada curso debe tener la siguiente información asociada: 
•	Nombre del curso (texto) 
•	Descripción del curso (texto) 
•	Duración del curso en semanas (entero) 
•	Precio del curso (decimal) 
•	Fecha de inicio del curso (fecha y hora) 
•	Docente que dicta el curso 

Cada docente debe tener la siguiente información:
•	Nombre 
•	Documento 	
•	Correo 

Requisitos técnicos: 
1.	Desarrollar un servicio web haciendo uso de Java (SpringBoot)
a.	Se debe aplicar un buen diseño de modelo entidad relación y aplicar una base de datos como servidor, ejemplo MySQL. Representar un objeto de trasporte de datos (DTO)
2.	Se debe implementar mínimo 3 filtros de búsqueda (los que usted desee) de la información
3.	Se debe entregar el proyecto en un repositorio de github el cual debe contener el back y el script de la base de datos
4.	Se debe documentar en un README el funcionamiento de la aplicación y el paso a paso para la instalación y/o ejecución


De acuerdo a lo cual se realiza la ejecución con las siguientes tecnologias:

workbench 8.0 
Java 17
maven
spring boot 3.4.2

Y los siguientes end point
Para listar todos los cursos:
["api/cursos](http://localhost:8080/api/cursos)

Para listas los cursos por id
http://localhost:8080/api/docentes

En la ruta 
src/main/resources
Se encuentra el script para creación de la base de datos.





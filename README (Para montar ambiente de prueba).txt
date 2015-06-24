Pasos para montar ambiente de prueba:

1. Abra su gestor de base de datos favorito (phpmyadmin,heidiSQL,etc), o ejecute mysql en la consola y cree la base de datos: "jbici_db".
Con usuario root y sin clave.
(En caso de poseer clave, modificar persistence.xml).

$ mysql -u root -p (No tiene password).

CREATE DATABASE jbici_db;

2. Ejecutar Test.java, en consola saldrán los resultados deseados.



 
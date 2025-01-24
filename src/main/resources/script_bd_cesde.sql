CREATE DATABASE CESDE;
USE CESDE;

CREATE TABLE cursos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL,
    descripcion TEXT NOT NULL,
    duracion INT NOT NULL,  -- Duración en semanas
    precio DECIMAL(10,2) NOT NULL,
    fecha_inicio DATETIME NOT NULL,
    docente_id INT,
    FOREIGN KEY (docente_id) REFERENCES docentes(id)
);

CREATE TABLE docentes (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL,
    documento VARCHAR(20) NOT NULL UNIQUE,
    correo VARCHAR(255) NOT NULL UNIQUE
);

CREATE TABLE usuarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre_usuario VARCHAR(255) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    rol VARCHAR(50) NOT NULL -- Ejemplo: 'ADMIN', 'USER', etc.
);

INSERT INTO usuarios (nombre_usuario, password, rol) VALUES
('admin1', 'admin123', 'ADMIN'),
('admin2', 'admin456', 'ADMIN');

INSERT INTO docentes (nombre, documento, correo) VALUES
('Juan Pérez', '1234567890', 'juan.perez@cesde.edu.co'),
('María López', '9876543210', 'maria.lopez@cesde.edu.co');


INSERT INTO cursos (nombre, descripcion, duracion, precio, fecha_inicio, docente_id) VALUES
('Java Básico', 'Curso introductorio a la programación en Java', 8, 300.00, '2025-03-01 08:00:00', 1),
('Spring Boot Avanzado', 'Curso avanzado de desarrollo de aplicaciones con Spring Boot', 10, 450.00, '2025-04-01 09:00:00', 2);


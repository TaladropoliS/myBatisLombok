CREATE DATABASE escuela_myb_lbk;
USE escuela_myb_lbk;

CREATE TABLE alumnos
(
    id       BIGINT PRIMARY KEY AUTO_INCREMENT,
    nombre   VARCHAR(50)  NOT NULL,
    apellido VARCHAR(50)  NOT NULL,
    email    VARCHAR(100) NOT NULL,
    edad     INT          NOT NULL,
    carrera  VARCHAR(100) NOT NULL
);

INSERT INTO alumnos (nombre, apellido, email, edad, carrera)
VALUES ('Juan', 'Perez', 'juan.perez@example.com', 20, 'Ingeniería'),
       ('Ana', 'Gomez', 'ana.gomez@example.com', 22, 'Medicina'),
       ('Luis', 'Martinez', 'luis.martinez@example.com', 21, 'Derecho'),
       ('Maria', 'Lopez', 'maria.lopez@example.com', 23, 'Arquitectura'),
       ('Carlos', 'Garcia', 'carlos.garcia@example.com', 24, 'Economía'),
       ('Laura', 'Hernandez', 'laura.hernandez@example.com', 25, 'Psicología'),
       ('Jose', 'Rodriguez', 'jose.rodriguez@example.com', 26, 'Filosofía'),
       ('Marta', 'Sanchez', 'marta.sanchez@example.com', 27, 'Biología'),
       ('Pedro', 'Ramirez', 'pedro.ramirez@example.com', 28, 'Química'),
       ('Sofia', 'Fernandez', 'sofia.fernandez@example.com', 29, 'Matemáticas');
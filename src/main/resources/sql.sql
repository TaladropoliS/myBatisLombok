CREATE DATABASE escuela_myb_lbk;
USE escuela_myb_lbk;

CREATE TABLE alumnos (
                         id BIGINT PRIMARY KEY AUTO_INCREMENT,
                         nombre VARCHAR(50) NOT NULL,
                         apellido VARCHAR(50) NOT NULL,
                         email VARCHAR(100) NOT NULL,
                         edad INT NOT NULL,
                         carrera VARCHAR(100) NOT NULL
);
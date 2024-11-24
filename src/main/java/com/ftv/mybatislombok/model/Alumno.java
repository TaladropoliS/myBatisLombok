package com.ftv.mybatislombok.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Alumno {
    private Long id;
    private String nombre;
    private String apellido;
    private String email;
    private int edad;
    private String carrera;
}

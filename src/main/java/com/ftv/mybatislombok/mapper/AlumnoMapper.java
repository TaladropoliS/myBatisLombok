package com.ftv.mybatislombok.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import com.ftv.mybatislombok.model.Alumno;

@Mapper
public interface AlumnoMapper {
    List<Alumno> getAll();

    void insert(Alumno alumno);

    void update(Alumno alumno);

    void delete(Long id);

    Alumno findById(Long id);
}
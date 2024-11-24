package com.ftv.mybatislombok.mapper;

import com.ftv.mybatislombok.model.Alumno;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AlumnoMapper {
    List<Alumno> findAll();

    Alumno findById(Long id);

    void insert(Alumno alumno);

    void update(Alumno alumno);

    void delete(Long id);
}

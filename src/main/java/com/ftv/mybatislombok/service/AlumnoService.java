package com.ftv.mybatislombok.service;

import com.ftv.mybatislombok.mapper.AlumnoMapper;
import com.ftv.mybatislombok.model.Alumno;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AlumnoService {
    private final AlumnoMapper alumnoMapper;

    public List<Alumno> listarTodos() {
        return alumnoMapper.findAll();
    }

    public Alumno obtenerPorId(Long id) {
        return alumnoMapper.findById(id);
    }

    public void guardar(Alumno alumno) {
        if (alumno.getId() == null) {
            alumnoMapper.insert(alumno);
        } else {
            alumnoMapper.update(alumno);
        }
    }

    public void eliminar(Long id) {
        alumnoMapper.delete(id);
    }
}

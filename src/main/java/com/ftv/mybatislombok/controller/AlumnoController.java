package com.ftv.mybatislombok.controller;

import com.ftv.mybatislombok.model.Alumno;
import com.ftv.mybatislombok.service.AlumnoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class AlumnoController {
    private final AlumnoService alumnoService;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("alumnos", alumnoService.listarTodos());
        return "index";
    }

    @GetMapping("/nuevo")
    public String mostrarFormularioNuevo(Model model) {
        model.addAttribute("alumno", new Alumno());
        return "formulario";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Alumno alumno) {
        alumnoService.guardar(alumno);
        return "redirect:/";
    }

    @GetMapping("/editar/{id}")
    public String mostrarFormularioEditar(@PathVariable Long id, Model model) {
        model.addAttribute("alumno", alumnoService.obtenerPorId(id));
        return "formulario";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id) {
        alumnoService.eliminar(id);
        return "redirect:/";
    }
}

package com.Proyectos.innovatechProject.model.controller;


import com.Proyectos.innovatechProject.model.Proyecto;
import com.Proyectos.innovatechProject.model.service.ProyectoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/projects")
@CrossOrigin(origins = "*")
public class ProyectoController {

    @Autowired
    private ProyectoService service;

    @GetMapping("/listar")
    public List<Proyecto> listar() {
        return service.obtenerTodos();
    }

    @PostMapping("/guardar")
    public Proyecto guardar(@RequestBody Proyecto proyecto) {
        return service.guardar(proyecto);
    }
}
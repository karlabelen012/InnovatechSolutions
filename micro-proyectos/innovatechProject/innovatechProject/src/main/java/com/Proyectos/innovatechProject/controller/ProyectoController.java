package com.Proyectos.innovatechProject.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Proyectos.innovatechProject.model.Proyecto;
import com.Proyectos.innovatechProject.service.ProyectoService;

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

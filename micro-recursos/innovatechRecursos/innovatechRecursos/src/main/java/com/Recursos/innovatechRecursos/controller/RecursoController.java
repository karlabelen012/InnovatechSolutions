package com.Recursos.innovatechRecursos.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Recursos.innovatechRecursos.model.Recurso;
import com.Recursos.innovatechRecursos.service.RecursoService;

@RestController
@RequestMapping("/api/resources")
@CrossOrigin(origins = "*")
public class RecursoController {
    @Autowired
    private RecursoService service;
/*LISTAR */
    @GetMapping("/listar")
    public List<Recurso> listarTodo() { return service.listarTodo(); }
/*GUARDAR */
    @PostMapping("/guardar")
    public Recurso guardar(@RequestBody Recurso r) { return service.guardar(r); }
}
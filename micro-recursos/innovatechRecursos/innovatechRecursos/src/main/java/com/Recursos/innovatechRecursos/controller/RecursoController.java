package com.Recursos.innovatechRecursos.controller;


import com.Recursos.innovatechRecursos.model.Recurso;
import com.Recursos.innovatechRecursos.service.RecursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/resources")
@CrossOrigin(origins = "*")
public class RecursoController {
    @Autowired
    private RecursoService service;

    @GetMapping("/listar")
    public List<Recurso> listarTodo() { return service.listarTodo(); }

    @PostMapping("/guardar")
    public Recurso guardar(@RequestBody Recurso r) { return service.guardar(r); }
}
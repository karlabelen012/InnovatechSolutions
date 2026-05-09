package com.Proyectos.innovatechProject.model.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Proyectos.innovatechProject.model.Proyecto;
import com.Proyectos.innovatechProject.model.repository.IProyectoRepository;

@Service
public class ProyectoService {

    @Autowired
    private IProyectoRepository repository;

    public List<Proyecto> obtenerTodos() {
        return repository.findAll();
    }

    public Proyecto guardar(Proyecto proyecto) {
        return repository.save(proyecto);
    }
}
package com.Recursos.innovatechRecursos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Recursos.innovatechRecursos.model.Recurso;
import com.Recursos.innovatechRecursos.repository.IRecursoRepository;


/* Servicio para manejar la lógica de negocio relacionada con los recursos */
@Service
public class RecursoService {
    @Autowired
    private IRecursoRepository repository;

    public List<Recurso> listarTodo() { return repository.findAll(); }
    public Recurso guardar(Recurso r)  { return repository.save(r); }
}
package com.Recursos.innovatechRecursos.service;

import com.Recursos.innovatechRecursos.model.Recurso;
import com.Recursos.innovatechRecursos.repository.IRecursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RecursoService {
    @Autowired
    private IRecursoRepository repository;

    public List<Recurso> listarTodo() { return repository.findAll(); }
    public Recurso guardar(Recurso r)  { return repository.save(r); }
}
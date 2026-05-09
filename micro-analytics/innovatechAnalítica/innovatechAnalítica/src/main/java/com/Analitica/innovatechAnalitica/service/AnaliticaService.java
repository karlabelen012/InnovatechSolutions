package com.Analitica.innovatechAnalitica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Analitica.innovatechAnalitica.model.Analitica;
import com.Analitica.innovatechAnalitica.repository.IAnaliticaRepository;

@Service
public class AnaliticaService {

    @Autowired
    private IAnaliticaRepository repository;

    public List<Analitica> obtenerTodosLosKpis() {
        return repository.findAll();
    }

    public Analitica guardarKpi(Analitica kpi) {
        return repository.save(kpi);
    }
}
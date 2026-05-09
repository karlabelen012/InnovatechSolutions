package com.Analitica.innovatechAnalitica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Analitica.innovatechAnalitica.model.Analitica;
import com.Analitica.innovatechAnalitica.service.AnaliticaService;

@RestController
@RequestMapping("/api/analytics")
@CrossOrigin(origins = "*") 
public class AnaliticaController {

    @Autowired
    private AnaliticaService service;

    @GetMapping("/listar")
    public List<Analitica> listar() {
        return service.obtenerKpis();
    }

    @PostMapping("/guardar")
    public Analitica guardar(@RequestBody Analitica kpi) {
        // Opcional: Aquí podrías usar la Factory si quieres procesar algo antes
        return service.guardarKpi(kpi);
    }
}
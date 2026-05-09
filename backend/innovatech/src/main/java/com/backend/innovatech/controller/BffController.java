package com.backend.innovatech.controller;


import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/bff")
@CrossOrigin(origins = "*")
public class BffController {

    @Autowired
    private RestTemplate restTemplate;

    // Traemos las URLs desde el properties
    private final String URL_PROYECTOS = "http://localhost:8081/api/projects/listar";
    private final String URL_RECURSOS = "http://localhost:8082/api/resources/listar";
    private final String URL_ANALITICA = "http://localhost:8083/api/analytics/listar";

    @GetMapping("/dashboard")
    public Map<String, Object> getFullDashboard() {
        Map<String, Object> response = new HashMap<>();

        try {
            // El BFF llama a los 3 micros en paralelo
            response.put("proyectos", restTemplate.getForObject(URL_PROYECTOS, Object.class));
            response.put("recursos", restTemplate.getForObject(URL_RECURSOS, Object.class));
            response.put("analitica", restTemplate.getForObject(URL_ANALITICA, Object.class));
            response.put("status", "OK - Datos sincronizados");
        } catch (Exception e) {
            response.put("status", "Error - Algunos servicios no responden");
            response.put("error", e.getMessage());
        }

        return response;
    }
}
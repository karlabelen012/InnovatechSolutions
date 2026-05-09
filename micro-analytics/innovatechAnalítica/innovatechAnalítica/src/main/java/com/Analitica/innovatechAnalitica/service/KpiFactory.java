package com.Analitica.innovatechAnalitica.service;

import java.time.LocalDateTime;

import com.Analitica.innovatechAnalitica.model.Analitica;

public class KpiFactory {
    public static Analitica crearKpiEstandar(String nombre, Double valor) {
        Analitica kpi = new Analitica();
        // CORRECCIÓN: Los nombres deben coincidir con el modelo
        kpi.setKpiNombre(nombre); 
        kpi.setKpiValor(valor);
        kpi.setFechaRegistro(LocalDateTime.now());
        return kpi;
    }
}
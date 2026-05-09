package com.Analitica.innovatechAnalitica.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data 
public class Analitica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nombreKpi; // Ej: "Avance Global", "Rendimiento Equipo A"
    private Double valorKpi;
    private LocalDateTime fechaCreacion = LocalDateTime.now();
}
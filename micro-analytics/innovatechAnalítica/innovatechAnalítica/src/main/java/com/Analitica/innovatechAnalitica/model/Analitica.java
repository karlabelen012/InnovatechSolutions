package com.Analitica.innovatechAnalitica.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Table(name = "kpis_proyectos")
@Data // Esto de Lombok te ahorra los Getters y Setters
public class Analitica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nombreProyecto;
    private Double porcentajeAvance;
    private LocalDateTime fechaCalculo;
}
package com.Recursos.innovatechRecursos.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Recurso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nombreRecurso; // Ej: "Servidor AWS", "Licencia Java"
    private String tipo;          // Ej: "Hardware", "Software"
    private Integer cantidad;
}
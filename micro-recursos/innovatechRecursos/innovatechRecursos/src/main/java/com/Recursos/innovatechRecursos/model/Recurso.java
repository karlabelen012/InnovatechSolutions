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
    
    private String nombreRecurso; // Ej: "Servidor AWS", "Licencia Java" Nombre del recurso
    private String tipo;          // Ej: "Hardware", "Software" Categoría del recurso
    private Integer cantidad;
}
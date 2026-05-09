package com.Recursos.innovatechRecursos.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Recursos.innovatechRecursos.model.Recurso;

/* Repositorio para la entidad Recurso, extiende JpaRepository para operaciones CRUD */
@Repository
public interface IRecursoRepository extends JpaRepository<Recurso, Long> {
}
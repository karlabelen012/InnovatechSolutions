package com.Proyectos.innovatechProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Proyectos.innovatechProject.model.Proyecto;

@Repository
public interface IProyectoRepository extends JpaRepository<Proyecto, Long> {
}
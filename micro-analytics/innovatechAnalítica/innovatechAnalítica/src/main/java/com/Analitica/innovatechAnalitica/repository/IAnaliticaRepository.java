package com.Analitica.innovatechAnalitica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Analitica.innovatechAnalitica.model.Analitica;

@Repository
public interface IAnaliticaRepository extends JpaRepository<Analitica, Long> {
    // Aquí implementas el patrón que pide la pauta
}
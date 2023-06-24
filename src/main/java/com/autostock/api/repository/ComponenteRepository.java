package com.autostock.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.autostock.api.model.Componente;

public interface ComponenteRepository extends JpaRepository<Componente,Integer>{
    
}

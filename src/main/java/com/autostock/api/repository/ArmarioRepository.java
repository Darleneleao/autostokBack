package com.autostock.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.autostock.api.model.Armario;

public interface ArmarioRepository extends JpaRepository<Armario,Integer> {
    
}

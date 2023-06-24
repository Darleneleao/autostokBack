package com.autostock.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.autostock.api.model.Box;

public interface BoxRepository extends JpaRepository<Box, Integer>{
    
}

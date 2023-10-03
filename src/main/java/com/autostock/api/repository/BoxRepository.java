package com.autostock.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.autostock.api.model.Box;

public interface BoxRepository extends JpaRepository<Box, Integer>{
    @Query(value = "select * from box where armario_id = ?1",nativeQuery = true)
    List<Box> getBoxsbyArmario(int id);
}

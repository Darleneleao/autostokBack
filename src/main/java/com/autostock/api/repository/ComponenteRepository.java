package com.autostock.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.autostock.api.model.Componente;

public interface ComponenteRepository extends JpaRepository<Componente,Integer>{
    @Query(value = "select * from componente where box_id = ?1", nativeQuery = true)
    List<Componente> getComponentesByBox(int idBox);
}

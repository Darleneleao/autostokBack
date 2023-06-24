package com.autostock.api.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "box", schema = "publico")
public class Box {
    @Id
    private Integer id;
    private String descricao;
    @ManyToOne
    private List<Componente> componentes;
}

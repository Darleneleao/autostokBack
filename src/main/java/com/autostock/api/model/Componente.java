package com.autostock.api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "componente", schema = "publico")
public class Componente {
    @Id
    private Integer id;
    private String nome;
    private String descricao;
    private int quantidade;
}

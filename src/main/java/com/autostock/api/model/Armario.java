package com.autostock.api.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "armario", schema = "publico")
public class Armario {
    @Id
    private Integer id;
    private String descricao;
    @ManyToOne
    private List<Box> boxes;

}

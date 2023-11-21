package com.autostock.api.dtos;


import lombok.Data;

@Data
public class ComponenteDto {
    private String nome;
    private String descricao;
    private int quantidade;
    private String armario;
    private String caixa;

    public ComponenteDto(String nome, String descricao, int quantidade, String armario, String caixa) {
        this.nome = nome;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.armario = armario;
        this.caixa = caixa;
    }

}

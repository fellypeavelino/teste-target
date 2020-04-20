/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.project.Entities;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.project.project.Enums.Tipo;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;

/**
 *
 * @author felly
 */
@Entity
@Data
public class Produto {
    @Id @GeneratedValue
    private Long id; 
    private String nome;
    private String descricao;
    private Double valor;
    private Tipo tipo;
    private Integer quantidade;

    public Produto() {}
    
    @JsonCreator
    public Produto(
            @JsonProperty("id") Long id, @JsonProperty("nome") String nome, 
            @JsonProperty("descricao") String descricao, @JsonProperty("valor") Double valor, 
            @JsonProperty("tipo") String tipo, @JsonProperty("quantidade") Integer quantidade
    ) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.tipo = Tipo.valueOf(tipo.toUpperCase());
        this.quantidade = quantidade;
    }
    
    
}

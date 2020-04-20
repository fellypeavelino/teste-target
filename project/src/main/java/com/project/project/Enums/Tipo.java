/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.project.Enums;

/**
 *
 * @author felly
 */
public enum Tipo {
    
    COZINHA("cozinha"),
    QUARTO("quarto"),
    ELETRONICO("eletronico"),
    SALA("sala");
    
    private String descricao;
    
    Tipo(String descricao){
        this.descricao = descricao;
    }
    
    public String getDescricao(){
        return this.descricao;
    }
}

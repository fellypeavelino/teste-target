/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.project.Entities;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
public class Cupom {
    @Id @GeneratedValue
    private Long id; 
    private String descricao;
    private Date validade;
    
    Cupom(){}
    
    @JsonCreator
    Cupom(
        @JsonProperty("id") Long id,
        @JsonProperty("descricao") String descricao,
        @JsonProperty("validade") String validade

    ) throws ParseException{
        this.id = id;
        this.descricao = descricao;
        this.validade = new SimpleDateFormat("dd-MM-yyyy").parse(validade);
    }
}

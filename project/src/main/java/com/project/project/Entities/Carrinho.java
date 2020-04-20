/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.project.Entities;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import lombok.Data;

/**
 *
 * @author felly
 */
@Entity
@Data
@Table(uniqueConstraints = { @UniqueConstraint(columnNames = { "cupons_id" }) })
public class Carrinho {
    @Id @GeneratedValue
    private Long id; 
    @OneToMany(cascade=CascadeType.ALL) 
    private List<Produto> produtos;
    @ManyToOne(cascade=CascadeType.ALL) 
    private Cupom cupons;
    private Double valorTotal;
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.project.BusinessObject;

import com.project.project.Entities.Carrinho;
import com.project.project.Entities.Produto;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author felly
 */
public class CarrinhoBO {
    
    public static Carrinho realizarDescontoTipo(Carrinho c){
        //sala
        List<Produto> produtosSala = c.getProdutos().stream()
        .filter(p -> p.getTipo().getDescricao().equals("sala"))
        .collect(Collectors.toList());
        if (produtosSala.size() >= 10 ) {
            produtosSala = produtosSala.stream().map(o -> {
                Double desconto = (o.getValor() * 10d)/100;
                o.setValor(o.getValor() - desconto);
                return o;
            }).collect(Collectors.toList());
        }
        //cozinha
        List<Produto> produtosCozinha = c.getProdutos().stream()
        .filter(p -> p.getTipo().getDescricao().equals("cozinha"))
        .collect(Collectors.toList());
        if (produtosCozinha.size() >= 10 ) {
            produtosCozinha = produtosCozinha.stream().map(o -> {
                Double desconto = (o.getValor() * 10d)/100;
                o.setValor(o.getValor() - desconto);
                return o;
            }).collect(Collectors.toList());
        }
        //quarto
        List<Produto> produtosQuarto = c.getProdutos().stream()
        .filter(p -> p.getTipo().getDescricao().equals("quarto"))
        .collect(Collectors.toList());
        if (produtosQuarto.size() >= 10 ) {
            produtosQuarto = produtosQuarto.stream().map(o -> {
                Double desconto = (o.getValor() * 10d)/100;
                o.setValor(o.getValor() - desconto);
                return o;
            }).collect(Collectors.toList());
        }
        //eletronico
        List<Produto> produtosEletronico = c.getProdutos().stream()
        .filter(p -> p.getTipo().getDescricao().equals("eletronico"))
        .collect(Collectors.toList());
        if (produtosEletronico.size() >= 10 ) {
            produtosEletronico = produtosEletronico.stream().map(o -> {
                Double desconto = (o.getValor() * 10d)/100;
                o.setValor(o.getValor() - desconto);
                return o;
            }).collect(Collectors.toList());
        }        
        
        c.setProdutos(new ArrayList<>());
        c.setProdutos(produtosSala);
        c.setProdutos(produtosCozinha);
        c.setProdutos(produtosQuarto);
        c.setProdutos(produtosEletronico);
        
        return c;
    }
    
    public static Carrinho realizarDesconto(Carrinho c){
        Double valorTotal = 0d;
        c.getProdutos().forEach(o -> {
            double qtd = o.getQuantidade().doubleValue();
            double valor = (o.getValor() * qtd); 
            Double.sum(valorTotal, valor);
        });
        c.setValorTotal(valorTotal);
        Double desconto = 0d;
        if(valorTotal >= 1000){
            
            desconto  = (valorTotal * 5);
            BigDecimal BigValorTotal = new BigDecimal(valorTotal);
            BigDecimal BigDesconto = new BigDecimal(desconto);
            BigValorTotal = BigValorTotal.subtract(BigDesconto);
            c.setValorTotal(BigValorTotal.doubleValue());
            
        }else if(valorTotal >= 5000){
            
            desconto  = (valorTotal * 7);
            BigDecimal BigValorTotal = new BigDecimal(valorTotal);
            BigDecimal BigDesconto = new BigDecimal(desconto);
            BigValorTotal = BigValorTotal.subtract(BigDesconto);
            c.setValorTotal(BigValorTotal.doubleValue());
            
        }else if(valorTotal >= 10000){
            
            desconto  = (valorTotal * 10);
            BigDecimal BigValorTotal = new BigDecimal(valorTotal);
            BigDecimal BigDesconto = new BigDecimal(desconto);
            BigValorTotal = BigValorTotal.subtract(BigDesconto);
            c.setValorTotal(BigValorTotal.doubleValue());
            
        }

        return c;
    }
    
}

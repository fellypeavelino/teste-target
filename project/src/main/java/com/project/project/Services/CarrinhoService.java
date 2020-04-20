/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.project.Services;

import com.project.project.Entities.Carrinho;
import com.project.project.Repositories.CarrinhoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author felly
 */
@Service
public class CarrinhoService {
    
    @Autowired
    private CarrinhoRepository carrinhoRepository;
    
    public List insert(List<Carrinho> cs){
        return this.carrinhoRepository.saveAll(cs);
    }

    public Carrinho insert(Carrinho c){
        return this.carrinhoRepository.save(c);
    }    
    
}

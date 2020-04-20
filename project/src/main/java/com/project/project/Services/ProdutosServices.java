/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.project.Services;

import com.project.project.Entities.Produto;
import com.project.project.Repositories.ProdutosRepositories;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author felly
 */
@Service
public class ProdutosServices {
    
    @Autowired
    private ProdutosRepositories produtosRepositories;
    
    
    public List insert(List<Produto> ps){
        return this.produtosRepositories.saveAll(ps);
    }

    public Produto insert(Produto p){
        return this.produtosRepositories.save(p);
    }
    
}

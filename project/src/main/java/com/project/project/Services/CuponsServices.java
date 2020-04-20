/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.project.Services;

import com.project.project.Entities.Cupom;
import com.project.project.Repositories.CuponsRepositories;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author felly
 */
@Service
public class CuponsServices {
    
    @Autowired
    private CuponsRepositories cuponsRepositories;
    
    public List insert(List<Cupom> cs){
        return this.cuponsRepositories.saveAll(cs);
    }

    public Cupom insert(Cupom c){
        return this.cuponsRepositories.save(c);
    }    
    
}

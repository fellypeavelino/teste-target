/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.project.Repositories;

import com.project.project.Entities.Cupom;
import com.project.project.Entities.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author felly
 */
public interface CuponsRepositories extends JpaRepository<Cupom, Long> {
    
}

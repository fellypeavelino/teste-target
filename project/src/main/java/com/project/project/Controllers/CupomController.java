/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.project.Controllers;

import com.project.project.Entities.Cupom;
import com.project.project.Services.CuponsServices;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author felly
 */
@RestController()
public class CupomController {
    
    @Autowired
    private CuponsServices cuponsServices;
 
    @PostMapping("cadastrar-cupons")
    public ResponseEntity<Object> cadastrarCupons(@RequestBody List<Cupom> cs){
        List<Cupom> cupons = (List<Cupom>) cuponsServices.insert(cs);
        return ResponseEntity.ok(cupons);
    }

    @PostMapping("cadastrar-cupom")
    public ResponseEntity<Object> cadastrarCupom(@RequestBody Cupom c){
        Cupom cupom = cuponsServices.insert(c);
        return ResponseEntity.ok(cupom);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.project.Controllers;

import static com.project.project.BusinessObject.CarrinhoBO.realizarDesconto;
import static com.project.project.BusinessObject.CarrinhoBO.realizarDescontoTipo;
import com.project.project.Entities.Carrinho;
import com.project.project.Services.CarrinhoService;
import java.math.BigDecimal;
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
public class CarrinhoController {
    
    @Autowired
    private CarrinhoService carrinhoService;
    
    @PostMapping("cadastrar-carrinho")
    public ResponseEntity<Object> cadastrarCarrinho(@RequestBody Carrinho c){
        c = realizarDesconto(c);
        c = realizarDescontoTipo(c);
        Carrinho carrinho = carrinhoService.insert(c);
        return ResponseEntity.ok(carrinho);
    }    
    
}

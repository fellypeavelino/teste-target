/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.project.Controllers;

import com.project.project.Entities.Produto;
import com.project.project.Services.ProdutosServices;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author felly
 */
@RestController()
public class ProdutosController {
    
    @Autowired
    private ProdutosServices produtosServices;
    
    @PostMapping("/cadastrar-produtos")
    public ResponseEntity<Object> cadastrarLista(@RequestBody List<Produto> ps){
        List<Produto> produtos = (List<Produto>) produtosServices.insert(ps);
        return ResponseEntity.ok(produtos);
    }

    @PostMapping("/cadastrar-produto")
    public ResponseEntity<Object> cadastrar(@RequestBody Produto p){
        Produto produto = produtosServices.insert(p);
        return ResponseEntity.ok(produto);
    }
    
    @GetMapping("/index")
    public String index(){
        return "teste";
    }
    
}

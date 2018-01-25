package com.techAIK.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techAIK.model.Produit;
import com.techAIK.repository.ProduitJpaRespository;

@RestController
public class ProduitController {

    @Autowired
    private ProduitJpaRespository produitJpaRespository;

    @GetMapping(value = "/all")
    public List<Produit> findAll() {
        return produitJpaRespository.findAll();
    }
    
    @GetMapping(value = "/pagination") // This method allows me to show only 5 products by page(Very useful!)
    public Page<Produit> findProduitParPage(int page) {
        return produitJpaRespository.findAll(new PageRequest(page, 5));
    }
    
    @GetMapping(value = "/ProduitParMC") // This method allows to get products by specifying a key word
    public Page<Produit> findProduitParMC(String mc, int page) {
        return produitJpaRespository.produitParMC("%" +mc+"%", new PageRequest(page, 5));
    }

    @GetMapping(value = "/name")
    public List<Produit> findByDesignation(String des){
        return produitJpaRespository.findByDesignation(des);
    }
    
    @GetMapping(value = "/findByRef")
    public List<Produit> findByRef(Long ref){
        return produitJpaRespository.findByReference(ref);
    }

    @GetMapping(value = "/save")
    public Produit save(Produit produit) {
        produitJpaRespository.save(produit);
        return produit;
    }
    
    @GetMapping(value = "/update")
    public Produit update(Produit produit) {
        produitJpaRespository.save(produit);
        return produit;
    }
    
    @GetMapping(value = "/delete")
    public boolean delete(Produit produit) {
        produitJpaRespository.delete(produit);
        return true;
    }
    
    
}

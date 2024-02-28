/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rizki.product.controller;

import com.rizki.product.entity.Produk;
import com.rizki.product.service.ProdukService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ASUS
 */
@RestController
@RequestMapping("api/v1/produk")
public class ProdukController {
    
    @Autowired
    private ProdukService produkService;
    
    @GetMapping
    public List<Produk> getAll(){
        return produkService.getAll();
    }
    
    @PostMapping
    public void insert(@RequestBody Produk produk){
        produkService.insert(produk);
    }
    
    @DeleteMapping(path = "{produkId}")
    public void delete(@PathVariable("produkId") Long produkId){
        produkService.delete(produkId);
    }
    
    @PutMapping(path = "{produkId}")
    public void update (@PathVariable("produkId") Long produkId,
            @RequestParam(required = false) String kode,
            @RequestParam(required = false) String nama,
            @RequestParam(required = false) String satuan,
            @RequestParam(required = false) double harga) {
        produkService.update(produkId, kode, nama, satuan, harga);
    }
    
    @GetMapping(path = "{produkId}")
    public Produk getProdukById(@PathVariable("produkId") Long produkId){
        return produkService.getProdukById(produkId);
    }
}

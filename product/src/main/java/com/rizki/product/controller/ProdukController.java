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
    public void insert (@RequestBody Produk produk){
        produkService.insert(produk);
    }
    
    @DeleteMapping(path = "{id}")
    public void delete(@PathVariable("id") Long Id){
        produkService.delete(Id);
    }
    
    @PutMapping(path = "{id}")
    public void update (@PathVariable("id") Long id,
        @RequestParam(required = false) String kode,
        @RequestParam(required = false) String nama,
        @RequestParam(required = false) String stok,
        @RequestParam(required = false) double harga) {
        produkService.update(id, kode, nama, stok, harga);
    }
    
    @GetMapping(path = "{id}")
    public Produk getProductById(@PathVariable("id") Long id){
        return produkService.getProdukById(id);
    }
}

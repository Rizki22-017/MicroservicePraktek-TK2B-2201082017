/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rizki.product.service;

import com.rizki.product.entity.Produk;
import com.rizki.product.repository.ProdukRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ASUS
 */
@Service
public class ProdukService {
    
    @Autowired
    private ProdukRepository produkRepository;
    
    public List<Produk> getAll(){
        return produkRepository.findAll();
    }
    
    public void insert(Produk produk){
        produkRepository.save(produk);
    }
}

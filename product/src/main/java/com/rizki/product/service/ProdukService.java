/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rizki.product.service;

import com.rizki.product.entity.Produk;
import com.rizki.product.repository.ProdukRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Objects;
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
    
    public Produk getProdukById(Long produkId){
        return produkRepository.findById(produkId).get();
    }
    
    public void insert(Produk produk){
        produkRepository.save(produk);
    }
    @Transactional
    public void update (Long produkId, String kode, String nama, String satuan, Double harga){
        Produk produk = produkRepository.findById(produkId)
                .orElseThrow(
                        ()->new IllegalStateException("Produk Tidak ada")
                );
        if(kode != null && kode.length()>0
                && !Objects.equals(produk.getKode(), kode)){
            produk.setKode(kode);
        }
        if(nama != null && nama.length()>0
                && !Objects.equals(produk.getNama(), nama)){
            produk.setNama(nama);
        }
        if(satuan != null && satuan.length()>0
                && !Objects.equals(produk.getSatuan(), nama)){
            produk.setSatuan(satuan);
        }
        if(harga != null
                && !Objects.equals(produk.getHarga(), harga)){
            produk.setHarga(harga);
        }
    }
    
    public void delete(Long produkId){
        produkRepository.deleteById(produkId);
    }
}

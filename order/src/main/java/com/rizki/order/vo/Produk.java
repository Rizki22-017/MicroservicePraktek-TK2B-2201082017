/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rizki.order.vo;

/**
 *
 * @author ASUS
 */
public class Produk {
    private Long id;
    private String kode;
    private String nama;
    private String satuan;
    private double harga;

    public Produk() {
    }

    public Produk(Long id, String kode, String nama, String satuan, double harga) {
        this.id = id;
        this.kode = kode;
        this.nama = nama;
        this.satuan = satuan;
        this.harga = harga;
    }

    public Long getId() {
        return id;
    }

    public String getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }

    public String getSatuan() {
        return satuan;
    }

    public double getHarga() {
        return harga;
    }
    
    
    public void setId(Long id) {
        this.id = id;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setSatuan(String satuan) {
        this.satuan = satuan;
    }
    
    public void setHarga(double harga) {
        this.harga = harga;
    }

    @Override
    public String toString() {
        return "Produk{" + "id=" + id + ", kode=" + kode + ", nama=" + nama + ", satuan=" + satuan + ", harga=" + harga + '}';
    }
}

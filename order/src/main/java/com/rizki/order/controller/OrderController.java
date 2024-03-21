/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rizki.order.controller;

import com.rizki.order.entity.Order;
import com.rizki.order.service.OrderService;
import com.rizki.order.vo.ResponseTemplate;
import java.util.List;
import static org.aspectj.weaver.tools.cache.SimpleCacheFactory.path;
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
@RequestMapping("api/v1/order")
public class OrderController {
    
    @Autowired
    private OrderService orderService;
    
    @GetMapping
    public List <Order> getAll(){
        return orderService.getAll();
    }
    
    @PostMapping
    public void insert(@RequestBody Order order){
        orderService.insert(order);
    }
    
    @GetMapping(path = "{id}")
    public Order getOrderById(@PathVariable("id")Long id){
        return orderService.getOrderById(id);
    }
    
    @GetMapping(path = "/produk/{id}")
    public List<ResponseTemplate> getOrderWithProdukById(@PathVariable("id") Long id) {
        return orderService.getOrderWithProdukById(id);
    }
    
    @DeleteMapping(path = "{id}")
    public void delete(@PathVariable("id") Long id){
        orderService.delete(id);
    }
    
    @PutMapping(path = "{id}")
    public void update(@PathVariable("id")Long id,
            @RequestParam(required = false) Integer jumlah,
            @RequestParam(required = false) String tanggal,
            @RequestParam(required = false) String status
    ){
        orderService.update(id, jumlah, tanggal, status);
    }
}

package com.javatechie.controller;

import com.javatechie.entity.Product;
import com.javatechie.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService service;


    @PutMapping("/update/{productId}/{quantity}")
    public Product updateInventoryStock(@PathVariable Integer productId,
                                        @PathVariable Integer quantity) {
        return service.updateStockQuantity(productId, quantity);
    }

    @GetMapping("/total-price/{productId}")
    public Double getTotalPrice(@PathVariable Integer productId) {
        return service.calculateProductPrice(productId);
    }
}

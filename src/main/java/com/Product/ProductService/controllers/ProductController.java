package com.Product.ProductService.controllers;


import com.Product.ProductService.models.Product;
import com.Product.ProductService.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable("id") Long id){
        return  productService.getProductById(id);
    }

    @GetMapping
    public List<Product> getAllProducts(){
        return new ArrayList<>();
    }
}
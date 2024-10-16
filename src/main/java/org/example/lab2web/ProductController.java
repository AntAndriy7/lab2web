package org.example.lab2web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @GetMapping("/products/{productId}")
    public Product getProduct(@PathVariable int productId) {
        int a = 5;
        int b = 7;

        return new Product(productId, productId + " name");
    }
}
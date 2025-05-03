package com.example.SpringSecurity1.controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    private record Product(Integer productId, String productName, double productPrice){             // This is compact immutable class named "Product" with three fields, automatically generates getters, a constructor

    }

    List<Product> products = new ArrayList<>(List.of(
            new Product(1,"iPhone",999.9),
            new Product(2,"Mac pro",2929.9)
    ));


    @GetMapping
    public List<Product> getProducts(){
        return products;
    }

    @PostMapping
    public Product saveProduct(@RequestBody Product product){
        products.add(product);
        return product;
    }
}

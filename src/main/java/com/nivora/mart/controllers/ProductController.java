//Get All products Endpoint
//https://fakestoreapi.com/products
package com.nivora.mart.controllers;

import com.nivora.mart.DTOs.ProductDTO;
import com.nivora.mart.services.IProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/v1/products")

public class ProductController {


    private final IProductService productService;

    ProductController(IProductService _productService){
        this.productService = _productService;
    }

    @GetMapping()
    public List<ProductDTO> getAllProducts() throws IOException {

        return this.productService.getAllProducts();

    }

}

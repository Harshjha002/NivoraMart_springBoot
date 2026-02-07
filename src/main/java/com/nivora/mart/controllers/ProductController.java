package com.nivora.mart.controllers;

import com.nivora.mart.DTOs.ProductDTO;
import com.nivora.mart.services.IProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    private final IProductService productService;

    public ProductController(IProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public ResponseEntity<List<ProductDTO>> getAllProducts() throws IOException {
        List<ProductDTO> response = productService.getAllProducts();
        return ResponseEntity.ok(response);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductDTO> getProductByID(@PathVariable long id) throws IOException {
        ProductDTO product = productService.getProductByID(id);
        return ResponseEntity.ok(product);
    }

    @PostMapping("/create-product")
    public ResponseEntity<ProductDTO> createProduct(@RequestBody ProductDTO dto) throws IOException {
        return ResponseEntity.ok(productService.createProduct(dto));
    }
}

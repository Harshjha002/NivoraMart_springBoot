package com.nivora.mart.services;

import com.nivora.mart.DTOs.ProductDTO;
import com.nivora.mart.entity.Product;
import com.nivora.mart.mappers.ProductMapper;
import com.nivora.mart.repository.ProductRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
@Primary
public class ProductService implements IProductService{

    private final ProductRepository repo;

    public ProductService(ProductRepository repo) {
        this.repo = repo;
    }

    @Override
    public List<ProductDTO> getAllProducts() throws IOException {
        return repo.findAll()
                .stream()
                .map(ProductMapper::toDto)
                .toList();
    }


    @Override
    public ProductDTO getProductByID(long id) throws IOException {
        return repo.findById(id)
                .map(ProductMapper::toDto)
                .orElseThrow(() -> new RuntimeException("product not found"));

    }

    @Override
    public ProductDTO createProduct(ProductDTO dto) throws IOException {
       Product saved =  repo.save(ProductMapper.toEntity(dto));
       return ProductMapper.toDto(saved);
    }


}

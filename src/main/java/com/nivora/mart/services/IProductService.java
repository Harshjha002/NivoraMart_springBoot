package com.nivora.mart.services;

import com.nivora.mart.DTOs.ProductDTO;

import java.io.IOException;
import java.util.List;

public interface IProductService {
   List<ProductDTO> getAllProducts() throws IOException;

   ProductDTO getProductByID(long id) throws  IOException;

   ProductDTO createProduct(ProductDTO dto) throws IOException;
}

package com.nivora.mart.gateway;

import com.nivora.mart.DTOs.ProductDTO;

import java.io.IOException;
import java.util.List;

public interface IProductGateway {

    List<ProductDTO> getAllProducts() throws IOException;

    ProductDTO getProductByID(long id) throws  IOException;
}

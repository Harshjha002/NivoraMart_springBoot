package com.nivora.mart.services;

import com.nivora.mart.DTOs.ProductDTO;
import com.nivora.mart.gateway.IProductGateway;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class FakeStoreProductService implements IProductService {

    private final IProductGateway productGateway;

    public FakeStoreProductService(IProductGateway productGateway) {
        this.productGateway = productGateway;
    }

    @Override
    public List<ProductDTO> getAllProducts() throws IOException {
        return productGateway.getAllProducts();
    }

    @Override
    public ProductDTO getProductByID(long id) throws IOException {
        return productGateway.getProductByID(id);
    }

    @Override
    public ProductDTO createProduct(ProductDTO dto) {
        // FakeStore is read-only for us
        throw new UnsupportedOperationException(
                "Create product is not supported for FakeStore"
        );
    }
}

package com.nivora.mart.gateway;

import com.nivora.mart.DTOs.FakeStoreProductResponseDTO;
import com.nivora.mart.DTOs.ProductDTO;
import com.nivora.mart.gateway.api.FakeStoreProductApi;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component
public class FakeStoreProductGateway implements IProductGateway {

    private final FakeStoreProductApi fakeStoreProductApi;

    public FakeStoreProductGateway(FakeStoreProductApi fakeStoreProductApi) {
        this.fakeStoreProductApi = fakeStoreProductApi;
    }

    @Override
    public List<ProductDTO> getAllProducts() throws IOException {

        // Make the HTTP call to the FakeStore API to fetch all products
        List<FakeStoreProductResponseDTO> response =
                fakeStoreProductApi.getAllProducts()
                        .execute()
                        .body();

        // Validate the API response
        if (response == null) {
            throw new IOException("Failed to fetch products from FakeStore API");
        }

        // Map the FakeStore API response to internal ProductDTO objects
        return response.stream()
                .map(p -> ProductDTO.builder()
                        .id(p.getId())
                        .title(p.getTitle())
                        .price(p.getPrice())
                        .description(p.getDescription())
                        .category(p.getCategory())
                        .image(p.getImage())
                        .ratingCount(p.getRating().getCount())
                        .ratingRate(p.getRating().getRate())
                        .build())
                .toList();
    }

    @Override
    public ProductDTO getProductByID(int id) throws IOException {

        FakeStoreProductResponseDTO response =
                fakeStoreProductApi.getProductByID(id)
                        .execute()
                        .body();

        if (response == null) {
            throw new IOException("Failed to fetch product with id: " + id);
        }

        return ProductDTO.builder()
                .id(response.getId())
                .title(response.getTitle())
                .price(response.getPrice())
                .description(response.getDescription())
                .category(response.getCategory())
                .image(response.getImage())
                .ratingCount(response.getRating().getCount())
                .ratingRate(response.getRating().getRate())
                .build();
    }


}

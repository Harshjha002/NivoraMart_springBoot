package com.nivora.mart.mappers;

import com.nivora.mart.DTOs.ProductDTO;
import com.nivora.mart.entity.Product;

public class ProductMapper {
    public static ProductDTO toDto(Product product) {
        return ProductDTO.builder()
                .id(product.getId())
                .image(product.getImage())
                .color(product.getColor())
                .brand(product.getBrand())
                .description(product.getDescription())
                .price(product.getPrice())
                .discount(product.getDiscount())
                .model(product.getModel())
                .title(product.getTitle())
                .category(product.getCategory())
                .popular(product.isPopular())
                .build();
    }

    public static  Product  toEntity(ProductDTO dto){
        return Product.builder()
                .image(dto.getImage())
                .color(dto.getColor())
                .brand(dto.getBrand())
                .description(dto.getDescription())
                .price(dto.getPrice())
                .discount(dto.getDiscount())
                .model(dto.getModel())
                .title(dto.getTitle())
                .category(dto.getCategory())
                .popular(dto.isPopular())
                .build();

    }
}

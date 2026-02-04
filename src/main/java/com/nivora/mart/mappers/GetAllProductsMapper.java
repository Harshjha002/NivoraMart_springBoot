package com.nivora.mart.mappers;

import com.nivora.mart.DTOs.FakeStoreProductResponseDTO;
import com.nivora.mart.DTOs.ProductDTO;

import java.util.List;

public class GetAllProductsMapper {

    public static List<ProductDTO> toProductDTOList(
            List<FakeStoreProductResponseDTO> dtoList
    ) {

        return dtoList.stream()
                .map(GetAllProductsMapper::toProductDTO)
                .toList();
    }


    public static ProductDTO toProductDTO(
            FakeStoreProductResponseDTO dto
    ) {

        return ProductDTO.builder()
                .id(dto.getId())
                .title(dto.getTitle())
                .price(dto.getPrice())
                .description(dto.getDescription())
                .category(dto.getCategory())
                .image(dto.getImage())
                .ratingCount(dto.getRating().getCount())
                .ratingRate(dto.getRating().getRate())
                .build();
    }
}

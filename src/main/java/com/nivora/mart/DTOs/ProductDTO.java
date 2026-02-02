package com.nivora.mart.DTOs;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {

    private int id;
    private String title;
    private Double price;
    private String description;
    private String category;
    private String image;

    // flattened rating
    private Double ratingRate;
    private Integer ratingCount;

}


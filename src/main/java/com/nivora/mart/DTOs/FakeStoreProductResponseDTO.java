package com.nivora.mart.DTOs;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FakeStoreProductResponseDTO {

    private int id;
    private String title;
    private double price;
    private String description;
    private String category;
    private String image;
    private Rating rating;

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Rating {
        private double rate;
        private int count;
    }
}

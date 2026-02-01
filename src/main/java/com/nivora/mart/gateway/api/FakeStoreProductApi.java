package com.nivora.mart.gateway.api;

import com.nivora.mart.DTOs.FakeStoreProductResponseDTO;
import retrofit2.Call;
import retrofit2.http.GET;

import java.io.IOException;
import java.util.List;


public interface FakeStoreProductApi {

    @GET("/products")
    Call<List<FakeStoreProductResponseDTO>> getAllProducts() throws IOException;
}

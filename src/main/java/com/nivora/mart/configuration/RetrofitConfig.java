package com.nivora.mart.configuration;


import com.nivora.mart.gateway.api.FakeStoreProductApi;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Configuration
public class RetrofitConfig {

    @Value("${fakestore.api.base-url}")
    private String baseUrl;


    @Bean
    public Retrofit retrofit(){

        return new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    @Bean
    public FakeStoreProductApi fakeStoreProductApi(Retrofit retrofit){
        return  retrofit.create(FakeStoreProductApi.class);
    }
}

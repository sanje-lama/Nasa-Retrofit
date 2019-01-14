package com.example.stl.nasaretrofit.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitSingleton {

    private static Retrofit ourInstance;


    public static Retrofit getInstance() {
        if (ourInstance != null) {
            return ourInstance;

        }
        ourInstance = new Retrofit.Builder()
                .baseUrl("https://api.nasa.gov/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return ourInstance;
    }

    private RetrofitSingleton() {}

}



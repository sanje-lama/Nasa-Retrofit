package com.example.stl.nasaretrofit.network;


import com.example.stl.nasaretrofit.model.Nasa;
import com.example.stl.nasaretrofit.model.NasaPhoto;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface NasaService {

    @GET("/mars-photos/api/v1/rovers/curiosity/photos?sol=1&api_key=DEMO_KEY")
    Call<Nasa> getNasa();


@GET("api/v1/rovers/{type}/curiosity/photos")

    Call<Nasa> getNasaImage(@Path("type") String photo);


}

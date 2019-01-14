package com.example.stl.nasaretrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.stl.nasaretrofit.controller.NasaAdapter;
import com.example.stl.nasaretrofit.model.Nasa;

import com.example.stl.nasaretrofit.model.NasaPhoto;
import com.example.stl.nasaretrofit.network.NasaService;
import com.example.stl.nasaretrofit.network.RetrofitSingleton;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "nasa";

    RecyclerView recyclerView;
    NasaAdapter nasaAdapter;
    List<NasaPhoto> photos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = findViewById(R.id.nasa_recycler_view);


        Retrofit retrofit = RetrofitSingleton.getInstance();

        NasaService nasaService = retrofit.create(NasaService.class);

        Call<Nasa> nasaPhoto = nasaService.getNasa();
        nasaPhoto.enqueue(new Callback<Nasa>() {
            @Override
            public void onResponse(Call<Nasa> call, Response<Nasa> response) {


            }


            @Override
            public void onFailure(Call<Nasa> call, Throwable t) {
                Log.d(TAG, "onFailure: " + t.toString());
            }



        });

    }
}
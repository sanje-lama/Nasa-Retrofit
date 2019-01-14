package com.example.stl.nasaretrofit.views;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.stl.nasaretrofit.DisplayActivity;
import com.example.stl.nasaretrofit.R;
import com.example.stl.nasaretrofit.model.Nasa;
import com.example.stl.nasaretrofit.network.NasaService;
import com.example.stl.nasaretrofit.network.RetrofitSingleton;
import com.squareup.picasso.Picasso;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class NasaViewHolder extends RecyclerView.ViewHolder {

    private SharedPreferences sharedPreferences;
    private TextView nasaTextView;
    private ImageView imageView;


    public NasaViewHolder(@NonNull View itemView) {
        super(itemView);

        nasaTextView = itemView.findViewById(R.id.nasa_text_view);
        imageView = itemView.findViewById(R.id.nasa_image_view);

    }

    public void onBind(Nasa nasa) {
        nasaTextView.setText(nasa.getEarth_date());
        Picasso.get()
                .load("https" + nasa.getImg_src().substring(4))
                .into(imageView);

    }
}








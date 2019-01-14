package com.example.stl.nasaretrofit.controller;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.stl.nasaretrofit.R;
import com.example.stl.nasaretrofit.model.NasaPhoto;
import com.example.stl.nasaretrofit.views.NasaViewHolder;

import java.util.List;

public class NasaAdapter extends RecyclerView.Adapter<NasaViewHolder> {
    List<NasaPhoto> nasaList;

    public NasaAdapter(List<NasaPhoto> nasaList) {
        this.nasaList = nasaList;
    }



    @NonNull
    @Override
    public NasaViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.nasa_itemview,viewGroup,false);
        return new NasaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NasaViewHolder nasaViewHolder, int i) {
        nasaViewHolder.onBind(nasaList.get(i));
    }

    @Override
    public int getItemCount() {
        return nasaList.size();
    }
}





package com.example.stl.nasaretrofit;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class DisplayActivity extends AppCompatActivity {

    private TextView nasaTextView;
    private ImageView nasaImageView;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        nasaImageView = findViewById(R.id.nasa_image_view);
        nasaTextView = findViewById(R.id.nasa_text_view);

        Intent intent = getIntent();

        nasaTextView.setText(intent.getStringExtra("rovers"));

        Picasso.get()
                .load(intent.getStringExtra("image"))
                .into(nasaImageView);
    }

}

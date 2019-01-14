package com.example.stl.nasaretrofit.model;

import java.util.List;

public class NasaPhoto{

    private String earth_date;
    private String img_src;
    private List<String> photos;


    public String getEarth_date() {
        return earth_date;
    }

    public void setEarth_date(String earth_date) {
        this.earth_date = earth_date;
    }

    public String getImg_src() {
        return img_src;
    }

    public void setImg_src(String img_src) {
        this.img_src = img_src;

    }
}


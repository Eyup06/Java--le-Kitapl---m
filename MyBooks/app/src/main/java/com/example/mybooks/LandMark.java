package com.example.mybooks;

import java.io.Serializable;

public class LandMark implements Serializable {

    String name;
    String explain;
    int image;


    public LandMark(String name, String explain, int image) {
        this.name = name;
        this.explain = explain;
        this.image = image;
    }
}

package com.example.sedkol.tourguide;

/**
 * Created by Ulrich D. on 12.01.17.
 */
public class Infos {

    private int imageResourceId;
    private String name;
    private String informations;

    public Infos(int imageResourceId, String name , String informations) {
        this.imageResourceId = imageResourceId;
        this.informations = informations;
        this.name = name;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public String getInformations() {
        return informations;
    }

    public String getName() {
        return name;
    }
}

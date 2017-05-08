package com.radek.zabytki;

import java.io.Serializable;

/**
 * Created by Radek on 04.05.2017.
 */

public class Monument implements Serializable {
    private int id;
    private String name;
    private String description;
    private double longitude;
    private double latitude;
    private String url;

    public Monument(String string, String cursorString, float aFloat, String s) {
    }


    public Monument(String name, String description, double longitude, double latitude, String url) {
        super();
        this.name = name;
        this.description = description;
        this.longitude = longitude;
        this.latitude = latitude;
        this.url = url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Zabytek: [id=" + id + ", nazwa=" + name + ", opis=" + description + "," +
                " dlugosc_geograficzna=" + longitude + ", szerokosc_geograficzna=" + latitude + ", link_do_zdjecia=" + url + "]";
    }
}

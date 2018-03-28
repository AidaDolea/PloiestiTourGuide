package com.example.android.ploiestitourguide;

/**
 * Created by Dolea on 24.03.2018.
 */

public class Location {

    //Declare the private variables
    private String title;
    private String description;
    private String address;
    private int imageResourceId;

    /**
     * Create the constructor
     *
     * @param title           is the title of the attraction
     * @param description     is the description of the attraction
     * @param address         is the address of the attraction
     * @param imageResourceId is the drawable resource ID for the image associated with the attraction
     */
    public Location(String title, String description, String address, int imageResourceId) {
        this.title = title;
        this.description = description;
        this.address = address;
        this.imageResourceId = imageResourceId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {

        return description;
    }

    public String getAddress() {
        return address;
    }

    public int getImageResourceId() {

        return imageResourceId;
    }

}

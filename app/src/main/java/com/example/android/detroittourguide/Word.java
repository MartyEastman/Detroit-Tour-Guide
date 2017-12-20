package com.example.android.detroittourguide;

/**
 * Created by eastm on 11/10/2017.
 */

public class Word {

    private String mName;
    private String mAddress;
    private String mDescription;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;
    private String mUrl;

    public Word(String item_name, String location_address, String description,
                int imageResourceId, String url) {

        mName = item_name;
        mAddress = location_address;
        mDescription = description;
        mImageResourceId = imageResourceId;
        mUrl = url;
    }

    public String getName() {
        return mName;
    }

    public String getAddress() {
        return mAddress;
    }

    public String getDescription() {
        return mDescription;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public String getUrl() {return mUrl;}
    }



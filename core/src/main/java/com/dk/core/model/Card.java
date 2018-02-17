package com.dk.core.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Card {

    @SerializedName("title")
    @Expose
    private String mTitle;

    @SerializedName("subtitle")
    @Expose
    private String mSubtitle;

    @SerializedName("imageUrl")
    @Expose
    private String mImageUrl;


    public Card() {

    }

    public Card(String mTitle, String mSubtitle, String mImageUrl) {
        this.mTitle = mTitle;
        this.mSubtitle = mSubtitle;
        this.mImageUrl = mImageUrl;
    }


    /**
     * *******************************************************************************
     * GETTERS
     * ********************************************************************************
     */

    public String getTitle() {
        return mTitle;
    }

    public String getSubtitle() {
        return mSubtitle;
    }

    public String getImageUrl() {
        return mImageUrl;
    }
}
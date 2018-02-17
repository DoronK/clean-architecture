package com.dk.core.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by doronk on 29/09/2016.
 */

public class DataSourceA extends DataSource {

    //dataSource A
    @SerializedName("stories")
    @Expose
    public List<Card> mStories = new ArrayList<>();


    /**
     * *******************************************************************************
     * GETTERS SETTERS
     * ********************************************************************************
     */
    public List<Card> getStories() {
        return mStories;
    }

    @Override
    public List<Card> getAllStories() {
        return mStories;
    }
}

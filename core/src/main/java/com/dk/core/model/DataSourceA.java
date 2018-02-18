package com.dk.core.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by doronk on 29/09/2016.
 */

public class DataSourceA extends DataSource implements Parcelable {

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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(this.mStories);
    }

    public DataSourceA() {
    }

    protected DataSourceA(Parcel in) {
        this.mStories = new ArrayList<Card>();
        in.readList(this.mStories, Card.class.getClassLoader());
    }

    public static final Parcelable.Creator<DataSourceA> CREATOR = new Parcelable.Creator<DataSourceA>() {
        @Override
        public DataSourceA createFromParcel(Parcel source) {
            return new DataSourceA(source);
        }

        @Override
        public DataSourceA[] newArray(int size) {
            return new DataSourceA[size];
        }
    };
}

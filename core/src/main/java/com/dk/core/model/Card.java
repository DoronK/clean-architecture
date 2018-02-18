package com.dk.core.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Card implements Parcelable {

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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.mTitle);
        dest.writeString(this.mSubtitle);
        dest.writeString(this.mImageUrl);
    }

    protected Card(Parcel in) {
        this.mTitle = in.readString();
        this.mSubtitle = in.readString();
        this.mImageUrl = in.readString();
    }

    public static final Parcelable.Creator<Card> CREATOR = new Parcelable.Creator<Card>() {
        @Override
        public Card createFromParcel(Parcel source) {
            return new Card(source);
        }

        @Override
        public Card[] newArray(int size) {
            return new Card[size];
        }
    };
}
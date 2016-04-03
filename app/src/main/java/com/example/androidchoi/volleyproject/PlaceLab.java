package com.example.androidchoi.volleyproject;

import com.begentgroup.xmlparser.SerializedName;

/**
 * Created by Choi on 2016-04-04.
 */
public class PlaceLab {
    private String ccbaKdcd;
    private String ccbaAsno;
    private String ccbaCtcd;
    @SerializedName("item")
    private PlaceData mPlaceData;
    public String getCcbaKdcd() {
        return ccbaKdcd;
    }
    public String getCcbaAsno() {
        return ccbaAsno;
    }
    public String getCcbaCtcd() {
        return ccbaCtcd;
    }
    public PlaceData getPlaceData() {
        return mPlaceData;
    }
}

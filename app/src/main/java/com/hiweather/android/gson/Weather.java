package com.hiweather.android.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by hong on 18-3-11.
 */

public class Weather {

    public String status;

    public Basic basic;

    public Aqi aqi;

    public Now now;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;

}

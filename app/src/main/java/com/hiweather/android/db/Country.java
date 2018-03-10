package com.hiweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by hong on 18-3-10.
 */

public class Country extends DataSupport {

    private int id;

    private String countryName;

    private String weatherId;

    private int CityId;

    public void setId(int id) {
        this.id = id;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public void setCityId(int cityId) {
        CityId = cityId;
    }

    public int getId() {

        return id;
    }

    public String getCountryName() {
        return countryName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public int getCityId() {
        return CityId;
    }
}

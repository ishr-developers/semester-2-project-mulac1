package com.example.android.finalproject.DataModel;

//import javax.annotation.Generated;

import com.google.gson.annotations.SerializedName;

//@Generated("com.robohorse.robopojogenerator")
public class Properties {

    @SerializedName("city")
    private String city;

    @SerializedName("countryCode")
    private String countryCode;

    @SerializedName("street")
    private String street;

    @SerializedName("postalCode")
    private String postalCode;

    @SerializedName("stateCode")
    private String stateCode;

    @SerializedName("type")
    private String type;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getStateCode() {
        return stateCode;
    }

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return
                "Properties{" +
                        "city = '" + city + '\'' +
                        ",countryCode = '" + countryCode + '\'' +
                        ",street = '" + street + '\'' +
                        ",postalCode = '" + postalCode + '\'' +
                        ",stateCode = '" + stateCode + '\'' +
                        ",type = '" + type + '\'' +
                        "}";
    }
}
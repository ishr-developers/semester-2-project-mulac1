package com.example.android.finalproject.DataModel;

//import javax.annotation.Generated;

import com.google.gson.annotations.SerializedName;

//@Generated("com.robohorse.robopojogenerator")
public class ResultsItem {

    @SerializedName("displayString")
    private String displayString;

    @SerializedName("name")
    private String name;

    @SerializedName("language")
    private String language;

    @SerializedName("id")
    private String id;

    @SerializedName("place")
    private Place place;

    @SerializedName("slug")
    private String slug;

    public String getDisplayString() {
        return displayString;
    }

    public void setDisplayString(String displayString) {
        this.displayString = displayString;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    @Override
    public String toString() {
        return
                "ResultsItem{" +
                        "displayString = '" + displayString + '\'' +
                        ",name = '" + name + '\'' +
                        ",language = '" + language + '\'' +
                        ",id = '" + id + '\'' +
                        ",place = '" + place + '\'' +
                        ",slug = '" + slug + '\'' +
                        "}";
    }
}
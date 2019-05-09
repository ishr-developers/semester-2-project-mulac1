package com.example.android.finalproject.DataModel;

//import javax.annotation.Generated;

import com.google.gson.annotations.SerializedName;

//@Generated("com.robohorse.robopojogenerator")
public class Place {

    @SerializedName("geometry")
    private Geometry geometry;

    @SerializedName("type")
    private String type;

    @SerializedName("properties")
    private Properties properties;

    public Geometry getGeometry() {
        return geometry;
    }

    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return
                "Place{" +
                        "geometry = '" + geometry + '\'' +
                        ",type = '" + type + '\'' +
                        ",properties = '" + properties + '\'' +
                        "}";
    }
}
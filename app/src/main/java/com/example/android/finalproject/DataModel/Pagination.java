package com.example.android.finalproject.DataModel;

//import javax.annotation.Generated;

import com.google.gson.annotations.SerializedName;

//@Generated("com.robohorse.robopojogenerator")
public class Pagination {

    @SerializedName("nextUrl")
    private String nextUrl;

    @SerializedName("currentPage")
    private int currentPage;

    public String getNextUrl() {
        return nextUrl;
    }

    public void setNextUrl(String nextUrl) {
        this.nextUrl = nextUrl;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    @Override
    public String toString() {
        return
                "Pagination{" +
                        "nextUrl = '" + nextUrl + '\'' +
                        ",currentPage = '" + currentPage + '\'' +
                        "}";
    }
}
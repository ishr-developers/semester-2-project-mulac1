package com.example.android.finalproject.DataModel;

import com.google.gson.annotations.SerializedName;

import java.util.List;

//import javax.annotation.Generated;

//@Generated("com.robohorse.robopojogenerator")
public class Request {

    @SerializedName("feedback")
    private boolean feedback;

    @SerializedName("q")
    private String Q;

    @SerializedName("pageSize")
    private int pageSize;

    @SerializedName("location")
    private List<Double> location;

    @SerializedName("sort")
    private String sort;

    @SerializedName("page")
    private int page;

    @SerializedName("key")
    private String key;

    public boolean isFeedback() {
        return feedback;
    }

    public void setFeedback(boolean feedback) {
        this.feedback = feedback;
    }

    public String getQ() {
        return Q;
    }

    public void setQ(String Q) {
        this.Q = Q;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public List<Double> getLocation() {
        return location;
    }

    public void setLocation(List<Double> location) {
        this.location = location;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return
                "Request{" +
                        "feedback = '" + feedback + '\'' +
                        ",q = '" + Q + '\'' +
                        ",pageSize = '" + pageSize + '\'' +
                        ",location = '" + location + '\'' +
                        ",sort = '" + sort + '\'' +
                        ",page = '" + page + '\'' +
                        ",key = '" + key + '\'' +
                        "}";
    }
}
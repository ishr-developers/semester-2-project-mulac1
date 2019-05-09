package com.example.android.finalproject.DataModel;

import com.google.gson.annotations.SerializedName;

import java.util.List;

//import javax.annotation.Generated;

//@Generated("com.robohorse.robopojogenerator")
public class Response {

    @SerializedName("request")
    private Request request;

    @SerializedName("pagination")
    private Pagination pagination;

    @SerializedName("results")
    private List<ResultsItem> results;

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    public List<ResultsItem> getResults() {
        return results;
    }

    public void setResults(List<ResultsItem> results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return
                "Response{" +
                        "request = '" + request + '\'' +
                        ",pagination = '" + pagination + '\'' +
                        ",results = '" + results + '\'' +
                        "}";
    }
}
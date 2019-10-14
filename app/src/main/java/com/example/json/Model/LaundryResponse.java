package com.example.json.Model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class LaundryResponse {
    @SerializedName("data")
    List<LaundryModel> laundryModelList;

    public List<LaundryModel> getLaundryModelList() {
        return laundryModelList;
    }

    public void setLaundryModelList(List<LaundryModel> laundryModelList) {
        this.laundryModelList = laundryModelList;
    }
}
